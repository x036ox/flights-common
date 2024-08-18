package com.artur.common.bean.office;


import com.artur.common.bean.board.Board;
import com.artur.common.model.Position;
import com.artur.common.model.Route;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
public abstract class Office {

    protected String id;
    protected Position position;

    private final Set<Route> routes = new HashSet<>();
    private final Set<Board> boardsOnSite = new HashSet<>();

    @Nullable
    private Board onDeparture;
    @Nullable
    private Board onArrival;
}
