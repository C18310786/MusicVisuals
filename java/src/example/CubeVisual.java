package example;

import ie.tudublin.Visual;

public class CubeVisual extends Visual
{
    public void settings()
    {
        size(500, 500, P3D);
    }

    public void setup()
    {
        colorMode(HSB);
        startMinim();
        loadAudio("heroplanet.mp3");
        as.trigger();
        // startListening();
    }

    float angle = 0;

    public void draw()
    {
        calculateAverageAmplitude();
        background(0);
        noFill();
        lights();
        // fill(125);
        stroke(map(lerpedAmplitude, 0 , 1, 0, 255));
        // noStroke();

        // 1st 3 0 = position 2nd 3 0 = where it is facing
        camera(0, 0, 0, 0, 0, -1, 0, 1, 0);
        pushMatrix();
        translate(0, 0, -250);
        // translate(width / 2, height / 2);
        rotateX(angle);
        rotateY(angle);
        strokeWeight(5);
        box(50 + (lerpedAmplitude * 400));
        strokeWeight(1);
        sphere(20 + (lerpedAmplitude * 200));
        angle += 0.01f;
        popMatrix();

        // pushMatrix();
        // translate(100, 0, -250);
        // fill(0, 255, 0);
        // sphere(100);
        // popMatrix();

    }
}