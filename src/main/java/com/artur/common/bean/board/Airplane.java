package com.artur.common.bean.board;


import com.artur.common.model.Position;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Airplane extends Board {

    private String name;

    public Airplane(String id, String name, Position position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }
}
