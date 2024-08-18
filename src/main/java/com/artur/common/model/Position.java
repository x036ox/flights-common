package com.artur.common.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Position {
    float x;
    float y;
    float angle;
}
