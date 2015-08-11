package com.curupira.logsearch;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

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
        System.out.println("File Button");
    }

    @FXML
    protected void doIndexFile(){
        System.out.println("Index File");
        System.out.println("to"+indexFileString.getText());
    }
}
