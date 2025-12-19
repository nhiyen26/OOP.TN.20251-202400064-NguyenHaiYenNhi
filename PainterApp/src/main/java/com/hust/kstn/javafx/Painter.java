package com.hust.kstn.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Painter extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Load file giao diện lên.
        // LƯU Ý: Đường dẫn bên dưới phải khớp với cấu trúc thư mục trong resources của bạn
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/hust/kstn/javafx/Painter.fxml")));

        Scene scene = new Scene(root);
        stage.setTitle("Painter");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
