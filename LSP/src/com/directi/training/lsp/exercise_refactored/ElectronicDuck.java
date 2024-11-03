package com.directi.training.lsp.exercise_refactored;

public class ElectronicDuck implements Duck {
    private boolean isOn = false;

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    @Override
    public void quack() {
        if (isOn) {
            System.out.println("Electronic duck quack...");
        } else {
            System.out.println("Cannot quack when off");
        }
    }

    @Override
    public void swim() {
        if (isOn) {
            System.out.println("Electronic duck swim");
        } else {
            System.out.println("Cannot swim when off");
        }
    }
}
    