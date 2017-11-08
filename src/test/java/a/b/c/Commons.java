package a.b.c;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Commons {
    public WebDriver driver;
      @Before
        public void setup() {
            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        public static ArrayList fileReaderA() {
            ArrayList<String> lst = new ArrayList<String>();
            try {
                BufferedReader br = new BufferedReader(new FileReader("C:\\tracks.txt"));
                String c;
                while ((c = br.readLine()) != null) {
                    lst.add(c);
                }
            }   catch (IOException e) {
                System.out.println(")))");
                }
                finally {
                return lst;
                }

        }

}

