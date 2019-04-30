package club.avence.spring.boot.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper=true)
public class Span extends SpanKey {
    private String name;

    private String remoteServiceName;

    private Long parentId;

    private Boolean debug;

    private Long startTs;

    private Long duration;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRemoteServiceName() {
        return remoteServiceName;
    }

    public void setRemoteServiceName(String remoteServiceName) {
        this.remoteServiceName = remoteServiceName == null ? null : remoteServiceName.trim();
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Boolean getDebug() {
        return debug;
    }

    public void setDebug(Boolean debug) {
        this.debug = debug;
    }

    public Long getStartTs() {
        return startTs;
    }

    public void setStartTs(Long startTs) {
        this.startTs = startTs;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }
}