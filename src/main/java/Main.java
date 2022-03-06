
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String filename = args[0];
        String date = args[2];
        LogFileReader lfr = new LogFileReader();
        lfr.readLogAndCreateMap(filename);
        ArrayList<String> res = lfr.findMostActiveCookie(date, lfr.getCookieLogs());
        for(String s: res){
            System.out.println(s);
        }
    }
}
