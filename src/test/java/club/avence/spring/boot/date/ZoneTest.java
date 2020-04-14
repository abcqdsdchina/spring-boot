package club.avence.spring.boot.date;

import org.junit.Test;

import java.time.ZoneId;

public class ZoneTest {

    @Test
    public void test() {
        System.out.println(ZoneId.systemDefault());
    }

}
