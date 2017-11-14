package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CustomizeController implements Initializable {

    public ImageView imgFigure;
    public Label txtFigur;

    String[]figuren = {"pawn","rook","knight","bishop","queen","king"};
    int index = 0;

    public void changeMain(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));

        Scene scene = new Scene(root);

        Main.getStage().setScene(scene);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        File f = new File("Projekt\\src\\gui\\images\\pawn.png");

        Image image = new Image(f.toURI().toString(),true);
        imgFigure.setImage(image);
    }

    public void nextFigur(ActionEvent actionEvent) {
        if (index >= 5){
            index = 0;
        }else{
            index ++;
        }

        txtFigur.setText(figuren[index]);

        File f = new File("Projekt\\src\\gui\\images\\"+figuren[index]+".png");

        Image image = new Image(f.toURI().toString(),true);
        imgFigure.setImage(image);
    }

    public void prevFigur(ActionEvent actionEvent) {
        if (index <= 0){
            index = 5;
        }else{
            index --;
        }

        txtFigur.setText(figuren[index]);

        File f = new File("Projekt\\src\\gui\\images\\"+figuren[index]+".png");

        Image image = new Image(f.toURI().toString(),true);
        imgFigure.setImage(image);
    }
}
