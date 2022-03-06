import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class LogFileReader {
    private ArrayList<CookieLogs> cookieLogsArrayList;

    public LogFileReader(){
        this.cookieLogsArrayList = new ArrayList<>();
    }

    public void readLogAndCreateMap(String filename){
        try {
            // create file and initialize readers.
            File logFile = new File(filename);
            FileReader fr = new FileReader(logFile);
            BufferedReader br = new BufferedReader(fr);

            // read through lines and create cookieLogs
            String currLine = br.readLine();

            while(currLine != null) {
                String[] currLineSplit = currLine.split(",");
                String cookieID = currLineSplit[0];
                String date = extractDate(currLineSplit[1]);
                CookieLogs cookie = new CookieLogs(cookieID, date, 1);

                //If cookie already used today, increment. Else add it to the list.
                boolean found = false;
                for(int i = 0; i < cookieLogsArrayList.size(); i++ ){
                    if(cookie.equals(cookieLogsArrayList.get(i))){
                        cookieLogsArrayList.get(i).incrementFreq();
                        found = true;
                        break;
                    }
                }
                if(!found){
                    cookieLogsArrayList.add(cookie);
                }
                  currLine = br.readLine();
            }
            fr.close();
            br.close();
        } catch(Exception e){
            System.out.println(e.getLocalizedMessage());
        }
    }

    public ArrayList<String> findMostActiveCookie(String date, ArrayList<CookieLogs> cookieLogsTemp){
        int max =0;
        ArrayList<String> res = new ArrayList<>();
        for(CookieLogs cookieLogs: cookieLogsTemp){
            if(cookieLogs.getFrequency()>max && cookieLogs.getDate().equals(date)){
                max = cookieLogs.getFrequency();
            }
        }
        for(CookieLogs cookieLogs: cookieLogsTemp){
            if(cookieLogs.getFrequency() == max && cookieLogs.getDate().equals(date)){
                res.add(cookieLogs.getCookieID());
            }
        }
        return res;
    }

    public ArrayList<CookieLogs> getCookieLogs(){
        return cookieLogsArrayList;
    }

    public String extractDate(String date){
        int endIndex = date.indexOf('T');
        return date.substring(0, endIndex);
    }
}
