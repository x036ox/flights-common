package com.artur.common.bean.office;

import com.artur.common.model.Position;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AirPort extends Office {

    private String name;

    public AirPort(String id, String name, Position position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public AirPort(String name) {
        this.name = name;
    }
}
