package com.example.animacja;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Cylinder cyl = new Cylinder();
        cyl.setHeight(30f);
        cyl.setRadius(80f);
        cyl.setTranslateX(150);
        cyl.setTranslateY(150);
        RotateTransition rotateTransition = new RotateTransition();
        rotateTransition.setDuration(Duration.millis(1000));
        rotateTransition.setNode(cyl);
        rotateTransition.setByAngle(360);
        PhongMaterial material = new PhongMaterial();
        material.setDiffuseColor(Color.BLANCHEDALMOND);
        material.setDiffuseColor(Color.GOLD);
        cyl.setMaterial(material);
        rotateTransition.setCycleCount(50);
        PerspectiveCamera camera = new PerspectiveCamera(false);
        camera.setTranslateX(0);
        camera.setTranslateY(0);
        camera.setTranslateZ(-10);
        rotateTransition.setAutoReverse(false);
        rotateTransition.play();
        Group root = new Group(cyl);
        Scene scene = new Scene(root, 600, 300);
        scene.setCamera(camera);
        stage.setTitle("Jakub Melnik 4tD");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}