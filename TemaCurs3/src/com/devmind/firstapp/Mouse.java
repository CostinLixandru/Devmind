package com.devmind.firstapp;

import com.devmind.firstapp.abstractAnimal;

public class Mouse extends abstractAnimal {

    private String mouseColor;

    public Mouse(String mouseColor){
        this.setMouseColor(mouseColor);
    }

    public void setMouseColor(String mouseColor) {
        this.mouseColor = mouseColor;
    }

    public String getMouseColor() {
        return mouseColor;
    }

    @Override
    public String makeSound(){
        return "chitz";
    }
}
