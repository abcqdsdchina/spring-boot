package club.avence.spring.boot.date;

import org.junit.Test;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class ZoneRegionTest {

    @Test
    public void test() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime time = LocalDateTime.parse("1900-01-01 00:00:01", formatter);
        ZoneId zoneId = ZoneId.ofOffset("UTC", ZoneOffset.of("+8"));
        System.out.println(zoneId);
        Instant instant = time.atZone(zoneId).toInstant();
        System.out.println(Date.from(instant));
    }

}
