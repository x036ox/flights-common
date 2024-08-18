package com.artur.common.bean.board;

import com.artur.common.model.Position;
import com.artur.common.model.Route;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import java.util.Objects;

@Getter
@Setter
public abstract class Board {

    protected String id;
    protected Position position;
    private Integer speed;

    @Nullable
    private Route route;

    public boolean isBusy() {
        return route == null;
    }

    public boolean nonBusy() {
        return route != null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Board board = (Board) o;
        return Objects.equals(id, board.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
