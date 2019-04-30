package club.avence.spring.boot.mapper;

import club.avence.spring.boot.model.Span;
import club.avence.spring.boot.model.SpanKey;

public interface SpanMapper {
    int deleteByPrimaryKey(SpanKey key);

    int insert(Span record);

    int insertSelective(Span record);

    Span selectByPrimaryKey(SpanKey key);

    int updateByPrimaryKeySelective(Span record);

    int updateByPrimaryKey(Span record);
}