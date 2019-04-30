package club.avence.spring.boot.mapper;

import club.avence.spring.boot.Application;
import club.avence.spring.boot.model.Span;
import club.avence.spring.boot.model.SpanKey;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes=Application.class)
public class SpanMapperTest {

    @Resource
    private SpanMapper spanMapper;

    @Test
    public void testSelectByPrimaryKey() {
        SpanKey spanKey = new SpanKey();
        spanKey.setTraceIdHigh(0L);
        spanKey.setTraceId(2501624500328406299L);
        spanKey.setId(-9202250267822296541L);
        Span span = spanMapper.selectByPrimaryKey(spanKey);
        log.info("读取到Span对象：{}", span);
    }

}
