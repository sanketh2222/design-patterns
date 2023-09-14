package com.scaler.lld.design.creational.parleg;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Button {
    private Double border;

    public abstract void onClick();

    public abstract void render();

}
