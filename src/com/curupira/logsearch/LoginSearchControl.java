package com.curupira.logsearch;

import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

public class LoginSearchControl extends VBox{


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
    }
}
