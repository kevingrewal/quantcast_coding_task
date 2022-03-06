import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class SecondTest {
    private final LogFileReader logFileReader = new LogFileReader();
    @Test
    public void readFile() {
        logFileReader.readLogAndCreateMap("cookie_log.csv");
        ArrayList<String> cookies = logFileReader.findMostActiveCookie("2018-12-08",logFileReader.getCookieLogs());
        String res = "";
        for(String cookie: cookies){
            res += cookie+"\n";
        }

        Assert.assertEquals("SAZuXPGUrfbcn5UA\n" +
                "4sMM2LxV07bPJzwf\n" +
                "fbcn5UAVanZf6UtG", res.trim());
    }
}
