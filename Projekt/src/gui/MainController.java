package gui;

import core.figuren.java.*;
import game.java.Chessfield;
import game.java.Field;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class MainController implements Initializable {


    public ImageView imgView;
    private boolean isYellow = false;

    public MainController() {

    }

    public void quit(ActionEvent actionEvent) {
        Main.getStage().close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        File f = new File("Projekt\\src\\gui\\images\\face.jpg");
        new Chessfield();

        Image image = new Image(f.toURI().toString(), true);
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

    public void startGame() throws IOException {

       /*Parent root = FXMLLoader.load(getClass().getResource("Game.fxml"));

        Scene scene = new Scene(root);

        Main.getStage().setScene(scene);*/




        Pane canvas = new Pane();
        canvas.setStyle("-fx-background-color: white;");


        File fileBlack = new File("Projekt\\src\\gui\\images\\black.jpg");
        File fileWhite = new File("Projekt\\src\\gui\\images\\white.jpg");
        File fileYellow = new File("Projekt\\src\\gui\\images\\yellow.jpg");

        Image imageBlack = new Image(fileBlack.toURI().toString(), true);
        Image imageWhite = new Image(fileWhite.toURI().toString(), true);
        Image imageYellow = new Image(fileYellow.toURI().toString(), true);


        ImageView imgView2 = new ImageView();
        imgView2.setImage(imageWhite);

        VBox vBox = new VBox();


        for (Field[] field : Chessfield.getChessfield()) {
            HBox hbox = new HBox();
            for (Field realField : field) {
                ImageView imgView = new ImageView();

                if (realField.getFigur() != null) {
                    imgView.setImage(getImage(realField.getFigur()));
                    imgView.setId(realField.ROW + "_" + realField.COLUMN);
                    imgView.setOnMouseClicked(event -> {
                        if (!isYellow){

                        ArrayList<Field> poissibleMoves = realField.getFigur().getPossibleMoves();

                        for (Field f : poissibleMoves) {
                            for (Node child : vBox.getChildren()) {
                                HBox tempHBox = (HBox) child;
                                for (Node iv : tempHBox.getChildren()) {
                                    if (iv instanceof ImageView) {
                                        ImageView tempIv = (ImageView) iv;
                                        String possibleField = f.ROW + "_" + f.COLUMN;
                                        if (tempIv.getId().equals(possibleField)) {
                                            tempIv.setImage(imageYellow);
                                            isYellow = true;
                                        }
                                    }
                                }
                            }
                            //ImageView img = vBox.getChildren()
                        }

                    }else{
                            try {
                                isYellow = false;
                                startGame();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }});

                    ImageView white = new ImageView();
                    white.setImage(imageWhite);
                    ImageView black = new ImageView();
                    black.setImage(imageBlack);

                    Group g = null;


                    if ((realField.ROW + realField.COLUMN) % 2 == 0) {
                        g = new Group(white, imgView);
                    } else {
                        g = new Group(black, imgView);
                    }


                    hbox.getChildren().add(g);
                }

                //Is white field
                else if ((realField.ROW + realField.COLUMN) % 2 == 0) {
                    imgView.setImage(imageWhite);
                    imgView.setId(realField.ROW + "_" + realField.COLUMN);
                    imgView.setOnMouseClicked(event -> {
                        System.out.println(imgView.getId());

                    });
                    hbox.getChildren().add(imgView);
                } else {
                    imgView.setImage(imageBlack);
                    hbox.getChildren().add(imgView);
                    imgView.setId(realField.ROW + "_" + realField.COLUMN);
                    imgView.setOnMouseClicked(event -> {
                        System.out.println(imgView.getId());
                    });
                }

            }
            vBox.getChildren().add(hbox);
            loadFigures();
        }

        canvas.getChildren().add(vBox);

        Scene scene = new Scene(canvas, 400, 400);


        Main.getStage().setScene(scene);
        Main.getStage().show();
    }

    public void loadFigures() {

    }

    public void doStuff(MouseEvent mouseEvent) {

        JOptionPane.showMessageDialog(null, "Such WOW. You cool", "MLG", JOptionPane.OK_CANCEL_OPTION);
    }

    public Image getImage(Figur figur) {


        File file_bishop_black = new File("Projekt\\src\\gui\\images\\bishop.png");
        File file_knight_black = new File("Projekt\\src\\gui\\images\\knight.png");
        File file_pawn__black = new File("Projekt\\src\\gui\\images\\pawn.png");
        File file_queen_black = new File("Projekt\\src\\gui\\images\\queen.png");
        File file_rook_black = new File("Projekt\\src\\gui\\images\\rook.png");
        File file_king_black = new File("Projekt\\src\\gui\\images\\king.png");

        File file_bishop_white = new File("Projekt\\src\\gui\\images\\w_bishop.png");
        File file_knight_white = new File("Projekt\\src\\gui\\images\\w_knight.png");
        File file_pawn__white = new File("Projekt\\src\\gui\\images\\w_pawn.png");
        File file_queen_white = new File("Projekt\\src\\gui\\images\\w_queen.png");
        File file_rook_white = new File("Projekt\\src\\gui\\images\\w_rook.png");
        File file_king_white = new File("Projekt\\src\\gui\\images\\w_king.png");

        Image image_bishop_black = new Image(file_bishop_black.toURI().toString(), true);
        Image image_knight_black = new Image(file_knight_black.toURI().toString(), true);
        Image image_pawn_black = new Image(file_pawn__black.toURI().toString(), true);
        Image image_queen_black = new Image(file_queen_black.toURI().toString(), true);
        Image image_rook_black = new Image(file_rook_black.toURI().toString(), true);
        Image image_king_black = new Image(file_king_black.toURI().toString(), true);

        Image image_bishop_white = new Image(file_bishop_white.toURI().toString(), true);
        Image image_knight_white = new Image(file_knight_white.toURI().toString(), true);
        Image image_pawn_white = new Image(file_pawn__white.toURI().toString(), true);
        Image image_queen_white = new Image(file_queen_white.toURI().toString(), true);
        Image image_rook_white = new Image(file_rook_white.toURI().toString(), true);
        Image image_king_white = new Image(file_king_white.toURI().toString(), true);

        if (figur.isWhite()) {
            if (figur instanceof Pawn) {
                return image_pawn_white;
            }
            if (figur instanceof Knight) {
                return image_knight_white;
            }
            if (figur instanceof Queen) {
                return image_queen_white;
            }
            if (figur instanceof Rook) {
                return image_rook_white;
            }
            if (figur instanceof King) {
                return image_king_white;
            }
            if (figur instanceof Bishop) {
                return image_bishop_white;
            }
        } else {
            if (figur instanceof Pawn) {
                return image_pawn_black;
            }
            if (figur instanceof Knight) {
                return image_knight_black;
            }
            if (figur instanceof Queen) {
                return image_queen_black;
            }
            if (figur instanceof Rook) {
                return image_rook_black;
            }
            if (figur instanceof King) {
                return image_king_black;
            }
            if (figur instanceof Bishop) {
                return image_bishop_black;
            }
        }

        return image_bishop_white;
    }
}
