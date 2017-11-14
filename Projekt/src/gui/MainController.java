package gui;

import api.game.GameController;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {


    public ImageView imgView;

    public MainController() {

    }

    public void quit(ActionEvent actionEvent) {
       Main.getStage().close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        File f = new File("Projekt\\src\\gui\\images\\face.jpg");

        Image image = new Image(f.toURI().toString(),true);
        imgView.setImage(image);
    }

    public void changeInfo(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Info.fxml"));

        Scene scene = new Scene(root);

        Main.getStage().setScene(scene);
    }

    public void changeCustomize(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Customize.fxml"));

        Scene scene = new Scene(root);

        Main.getStage().setScene(scene);
    }

    public void startGame(ActionEvent actionEvent) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Game.fxml"));

        Scene scene = new Scene(root);

        Main.getStage().setScene(scene);
    }

    public void doStuff(MouseEvent mouseEvent) {

        JOptionPane.showMessageDialog(null, "Such WOW. You cool", "MLG", JOptionPane.OK_CANCEL_OPTION);
    }
}
