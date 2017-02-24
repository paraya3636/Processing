package org.paradrops.processings;

import android.util.Log;

import processing.core.PApplet;
import processing.event.MouseEvent;

public class Sketch2 extends PApplet {
    float radius = 150;
    float bar = 150;

    int barNum;
    float barSpeed;
    int rotNum;
    float rotSpeed;
//    color bg, sr;


    @Override
    public void settings() {
        super.settings();
        size(800, 800);
    }

    @Override
    public void setup() {
        super.setup();

        stroke(20, 100);
        mousePressed();
    }

    @Override
    public void draw() {
        super.draw();

        background(240);
        translate(width / 2, height / 2);
        for(float angle = 0; angle < 360; angle += 0.5){
            float radian = radians(angle);
            pushMatrix();
            translate(radius * cos(radian), radius * sin(radian));
            rotate(radian + radian * rotNum + frameCount * rotSpeed);
            float b = map(sin(radian + radian * barNum + frameCount * barSpeed), -1, 1, 0, bar);
            line(-b / 2, 0, b / 2, 0);
            popMatrix();
        }
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        super.mousePressed(mouseEvent);

        Log.d("", "");
    }

    @Override
    public void mouseClicked() {
        super.mouseClicked();

        Log.d("", "");
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        super.mouseEntered(mouseEvent);

        Log.d("", "");
    }

    @Override
    protected void handleMouseEvent(MouseEvent mouseEvent) {
        super.handleMouseEvent(mouseEvent);

        Log.d("", "");
    }

    @Override
    public void mousePressed() {
        super.mousePressed();

        rotNum = (int) (random(1) * 50) * 2;
        rotSpeed = map(random(1), 0, 1, -0.25f, 0.25f);
        barNum = (int) (random(1) * 50) * 2;
        barSpeed = map(random(1), 0, 1, -0.25f, 0.25f);
//        bg = color(random(255), random(255), random(255));
//        sr = color(random(255), random(255), random(255));
    }
}
