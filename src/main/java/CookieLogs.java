public class CookieLogs {
    private String cookieID;
    private String date;
    private int frequency;

    public CookieLogs(String cookieID, String date, int frequency){
        this.cookieID = cookieID;
        this.date = date;
        this.frequency = frequency;
    }
    public String getCookieID(){
        return cookieID;
    }
    public String getDate(){
        return date;
    }
    public int getFrequency(){
        return frequency;
    }
    public void incrementFreq(){
        frequency = frequency+1;
    }
    @Override
    public boolean equals(Object o){
        CookieLogs c = (CookieLogs) o;
        if(cookieID.equals(c.getCookieID()) && date.equals(c.getDate())){
            return true;
        }
        return false;
    }
}
