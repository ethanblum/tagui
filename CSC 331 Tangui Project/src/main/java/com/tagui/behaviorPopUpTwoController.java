package com.tagui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class behaviorPopUpTwoController implements Initializable
{
    @FXML private Label studentName;
    public static Label static_label;

    @Override
    public void initialize(URL location, ResourceBundle arg1)
    {
        static_label = studentName;
    }

    public void backButton(ActionEvent event) throws IOException
    {
        Parent homePageParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("homePage.fxml")));
        Scene homePageScene = new Scene(homePageParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(homePageScene);
        window.show();
    }

}
