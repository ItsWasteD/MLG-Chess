package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CustomizeController implements Initializable {

    public ImageView imgFigure;

    public void changeMain(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));

        Scene scene = new Scene(root);

        Main.getStage().setScene(scene);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        File f = new File("Projekt\\src\\gui\\tower.png");

        Image image = new Image(f.toURI().toString(),true);
        imgFigure.setImage(image);
    }
}
