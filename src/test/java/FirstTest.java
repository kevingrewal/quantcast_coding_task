import org.junit.Assert;
import org.junit.Test;

public class FirstTest {
    private final LogFileReader logFileReader = new LogFileReader();
    @Test
    public void readFile() {
        logFileReader.readLogAndCreateMap("cookie_log.csv");
        Assert.assertEquals("AtY0laUfhglK3lC7", logFileReader.findMostActiveCookie("2018-12-09",logFileReader.getCookieLogs()).get(0));
    }
}
