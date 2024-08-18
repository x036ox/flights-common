package com.artur.common.message;

import com.artur.common.bean.board.Board;
import lombok.Getter;

@Getter
public class BoardMessage extends Message{
    private final Board board;

    public BoardMessage(Board board, Type type) {
        this.board = board;
        this.source = Source.BOARD;
        this.type = type;
    }
}
