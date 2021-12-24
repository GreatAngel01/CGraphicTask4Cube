package com.example.cgraphicsmodels;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Задание 1");
        stage.setMinHeight(900);
        stage.setMinWidth(900);
        initUI(stage);
        stage.show();
    }

    private void initUI(Stage stage) {
        Pane pane = new Pane();
        Canvas canvas = new Canvas(738, 612);
        var gc =canvas.getGraphicsContext2D();
        MRect mRect= new MRect(canvas,gc);
        mRect.clicks();
        pane.getChildren().add(canvas);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
    }
}
