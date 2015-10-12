package com.curupira.logsearch;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LogSearchApplication extends Application {

    public static final String LOG_SEARCH = "Log Search";
    public static final String LOGSEARCH_FXML = "logsearch.fxml";

    public static Scene scene;

    @Override
    public void start(Stage primaryStage) throws Exception{
        try {
            TabPane page = (TabPane) FXMLLoader.load(LogSearchApplication.class.getResource(LOGSEARCH_FXML));
            scene = new Scene(page);
            primaryStage.setScene(scene);
            primaryStage.setTitle(LOG_SEARCH);
            primaryStage.show();
        } catch (Exception ex) {
            Logger.getLogger(LogSearchApplication.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


    public static void main(String[] args) {
        launch(args);
    }
}
