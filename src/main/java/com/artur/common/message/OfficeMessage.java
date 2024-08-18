package com.artur.common.message;

import com.artur.common.bean.office.Office;
import lombok.Getter;

@Getter
public class OfficeMessage extends Message{

    private final Office office;

    public OfficeMessage(Office office, Type type) {
        this.office = office;
        this.source = Source.OFFICE;
        this.type = type;
    }
}
