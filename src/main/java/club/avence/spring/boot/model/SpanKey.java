package club.avence.spring.boot.model;

import lombok.Data;

@Data
public class SpanKey {
    private Long traceIdHigh;

    private Long traceId;

    private Long id;

    public Long getTraceIdHigh() {
        return traceIdHigh;
    }

    public void setTraceIdHigh(Long traceIdHigh) {
        this.traceIdHigh = traceIdHigh;
    }

    public Long getTraceId() {
        return traceId;
    }

    public void setTraceId(Long traceId) {
        this.traceId = traceId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}