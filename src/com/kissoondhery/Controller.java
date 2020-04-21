package com.kissoondhery;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Controller {
    @FXML
    private TilePane t0;

    @FXML
    private TilePane t2;

    @FXML
    private TilePane t3;

    @FXML
    private TilePane t4;

    @FXML
    private TilePane t5;

    @FXML
    private TilePane t6;

    @FXML
    private TilePane t7;

    @FXML
    private TilePane t8;




    public class Symbol extends StackPane{
        private Text text = new Text();

        public Symbol(){

            setOnMouseClicked(mouseEvent -> {
                if (mouseEvent.getButton() == MouseButton.PRIMARY){
                drawX();
                }
                else if (mouseEvent.getButton() == MouseButton.SECONDARY){
                    drawO();
                }
            });
        }

        private void drawO() {
            text.setText("X");
        }

        private void drawX() {
            text.setText("O");
        }
    }








    }

