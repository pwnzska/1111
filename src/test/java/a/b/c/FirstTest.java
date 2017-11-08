package a.b.c;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FirstTest extends Commons {
    ArrayList<String> lst = new ArrayList<String>();
    @Test
    public void fileReader() {
        lst=Commons.fileReaderA();

        for (String line : lst)
             {driver.get("http://zaycev.net/pages/46024/" + line);

        }

    }
}
