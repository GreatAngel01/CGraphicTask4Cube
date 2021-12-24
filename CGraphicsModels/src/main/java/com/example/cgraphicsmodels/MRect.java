package com.example.cgraphicsmodels;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.BitSet;
import java.util.Timer;
import java.util.TimerTask;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

class MRect {
    private BitSet My;//создаём  bitmap и графику
    private GraphicsContext g;
    int angle = 0; //вводим угол на который будем поворачивать
    Canvas canvas;
    Timer timer = new Timer();
    TimerTask timerTask = new TimerTask() {
        @Override
        public void run() {
            angle++;
            if (angle >= 360) angle = 0;
            draw();
        }
    };

    MRect(Canvas canvas, GraphicsContext gc) {
        this.canvas = canvas;
        g = gc;
    }

    public void clicks() {
        timer.schedule(timerTask, 0, 90);
    }


    public void draw() {
        g.beginPath();
        g.setFill(Color.BLACK);
        g.fillRect(0, 0, 800, 800);
        g.fill();
        g.closePath();
        g.beginPath();
        g.translate(400, 400);
        g.rotate(Math.toRadians(angle) / 2);


        for (int i = 0; i < 40; i += 2)
        {
            Color square = Color.rgb(29 + i * 5, 5 + i * 5, 0 + i * 3);
            g.beginPath();
            g.setFill(square);
            g.rotate(1);
            g.fillRect(-110, -110, 220, 220);
            g.fill();
            g.closePath();
        }
        g.beginPath();
        g.setFill(Color.WHITE);
        g.fillRect(-110, -110, 220, 220);
        g.fill();
        g.rotate(-20);
        g.translate(-400, -400);
    }
}

