package com.curupira.logsearch;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;

import java.awt.*;
import java.io.File;

public class LoginSearchControl extends VBox{

    @FXML
    private TextField searchQuery;

    @FXML
    private TextArea logResult;

    @FXML
    private TextField fileInputString;

    @FXML
    private CheckBox isInMemory;

    @FXML
    private TextField indexFileString;

    public TextField getSearchQuery() {
        return searchQuery;
    }

    public void setSearchQuery(TextField searchQuery) {
        this.searchQuery = searchQuery;
    }

    @FXML
    protected void doSearch() {
        System.out.println("Searched");
    }

    @FXML
    protected  void doFileButton(){
        FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showOpenDialog(LogSearchApplication.scene.getWindow());
        if (file != null) {
            fileInputString.setText(file.getAbsolutePath());
        }
    }


    @FXML
    protected void doIndexFile(){
        FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showOpenDialog(LogSearchApplication.scene.getWindow());
        if (file != null) {
            indexFileString.setText(file.getAbsolutePath());
        }
    }
}
