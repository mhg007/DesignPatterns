package com.codewithmhg.state;

public class Main {
    public static void main(String[] args) {
        var canvas = new Canvas();
        canvas.setCurrentTool(new DrawTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
