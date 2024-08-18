package com.artur.common.model;

import com.artur.common.bean.office.Office;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Route {
    private Office from;
    private Office to;
    private Integer progress;
}
