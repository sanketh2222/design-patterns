package com.scaler.lld.design.creational.parleg;

import lombok.AllArgsConstructor;

// @AllArgsConstructor
public class SquareButton extends Button {

    private Double length;
    private Double border;

        public SquareButton(Double border,Double length) {
        super(border);
        this.length = length;
    }

    public void onClick() {
        System.out.println("Square Btn was clicked!");
    }

    public void render() {
        System.out.println("Rendered!");
    }

}
