package com.artur.common.message;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public abstract class Message {
    protected Type type;
    protected Source source;

    public String getCode(){
        return source.name() + "_" + type.name();
    }
}
