package com.example.krestikinoliki;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    int i = 0;
    int pob=0;


    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Button button6;

    @FXML
    private Button button7;

    @FXML
    private Button button8;

    @FXML
    private Button button9;

    @FXML
    private TextField panel;

    @FXML
    void but1(ActionEvent event) {

if(button1.getText().isEmpty()) {
    if (i % 2 == 0) {
        button1.setText("X");
    } else {
        button1.setText("o");
    }

}
    pob=Pobeda();
        i++;
    if(pob == 1){
    panel.setText("Победил X");
    Win();
    }
    if (pob==2){
        panel.setText("Победил O");
        Win();
    }
    if(!button1.getText().isEmpty()&&!button2.getText().isEmpty()&&!button3.getText().isEmpty()&&!button4.getText().isEmpty()&&!button5.getText().isEmpty()&&!button6.getText().isEmpty()&&!button7.getText().isEmpty()&&!button8.getText().isEmpty()&&!button9.getText().isEmpty()){
        panel.setText("Ничья");
        Win();
    }

    }

    @FXML
    void but2(ActionEvent event) {
        if(button2.getText().isEmpty()) {
            if (i % 2 == 0) {
                button2.setText("X");
            } else {
                button2.setText("o");
            }
        }
        pob=Pobeda();
        i++;
        if(pob == 1){

            panel.setText("Победил X");
            Win();
        }
        if (pob==2){
            panel.setText("Победил O");
            Win();
        }
        if(!button1.getText().isEmpty()&&!button2.getText().isEmpty()&&!button3.getText().isEmpty()&&!button4.getText().isEmpty()&&!button5.getText().isEmpty()&&!button6.getText().isEmpty()&&!button7.getText().isEmpty()&&!button8.getText().isEmpty()&&!button9.getText().isEmpty()){
            panel.setText("Ничья");
            Win();
        }
    }

    @FXML
    void but3(ActionEvent event) {
        if(button3.getText().isEmpty()) {
            if (i % 2 == 0) {
                button3.setText("X");
            } else {
                button3.setText("o");
            }
        }
        pob=Pobeda();
        i++;
        if(pob == 1){
            panel.setText("Победил X");
            Win();
        }
        if (pob==2){
            panel.setText("Победил O");
            Win();
        }
        if(!button1.getText().isEmpty()&&!button2.getText().isEmpty()&&!button3.getText().isEmpty()&&!button4.getText().isEmpty()&&!button5.getText().isEmpty()&&!button6.getText().isEmpty()&&!button7.getText().isEmpty()&&!button8.getText().isEmpty()&&!button9.getText().isEmpty()){
            panel.setText("Ничья");
            Win();
        }
    }

    @FXML
    void but4(ActionEvent event) {
        if(button4.getText().isEmpty()) {
            if (i % 2 == 0) {
                button4.setText("X");
            } else {
                button4.setText("o");
            }
        }
        pob=Pobeda();
        i++;
        if(pob == 1){
            panel.setText("Победил X");
        Win();
        }
        if (pob==2){
            panel.setText("Победил O");
            Win();
        }
        if(!button1.getText().isEmpty()&&!button2.getText().isEmpty()&&!button3.getText().isEmpty()&&!button4.getText().isEmpty()&&!button5.getText().isEmpty()&&!button6.getText().isEmpty()&&!button7.getText().isEmpty()&&!button8.getText().isEmpty()&&!button9.getText().isEmpty()){
            panel.setText("Ничья");
            Win();
        }
    }

    @FXML
    void but5(ActionEvent event) {
        if(button5.getText().isEmpty()) {
            if (i % 2 == 0) {
                button5.setText("X");
            } else {
                button5.setText("o");
            }
        }

        pob=Pobeda();
        i++;
        if(pob == 1){
            panel.setText("Победил X");
            Win();
        }
        if (pob==2){
            panel.setText("Победил O");
            Win();
        }
        if(!button1.getText().isEmpty()&&!button2.getText().isEmpty()&&!button3.getText().isEmpty()&&!button4.getText().isEmpty()&&!button5.getText().isEmpty()&&!button6.getText().isEmpty()&&!button7.getText().isEmpty()&&!button8.getText().isEmpty()&&!button9.getText().isEmpty()){
            panel.setText("Ничья");
            Win();
        }
    }

    @FXML
    void but6(ActionEvent event) {
        if(button6.getText().isEmpty()) {
            if (i % 2 == 0) {
                button6.setText("X");
            } else {
                button6.setText("o");
            }
        }
        pob=Pobeda();
        i++;
        if(pob == 1){
            panel.setText("Победил X");
            Win();
        }
        if (pob==2){
            panel.setText("Победил O");
            Win();
        }
        if(!button1.getText().isEmpty()&&!button2.getText().isEmpty()&&!button3.getText().isEmpty()&&!button4.getText().isEmpty()&&!button5.getText().isEmpty()&&!button6.getText().isEmpty()&&!button7.getText().isEmpty()&&!button8.getText().isEmpty()&&!button9.getText().isEmpty()){
            panel.setText("Ничья");
            Win();
        }
    }

    @FXML
    void but7(ActionEvent event) {
        if(button7.getText().isEmpty()) {
            if (i % 2 == 0) {
                button7.setText("X");
            } else {
                button7.setText("o");
            }
        }

        pob=Pobeda();
        i++;
        if(pob == 1){
            panel.setText("Победил X");
            Win();
        }
        if (pob==2){
            panel.setText("Победил O");
            Win();
        }
        if(!button1.getText().isEmpty()&&!button2.getText().isEmpty()&&!button3.getText().isEmpty()&&!button4.getText().isEmpty()&&!button5.getText().isEmpty()&&!button6.getText().isEmpty()&&!button7.getText().isEmpty()&&!button8.getText().isEmpty()&&!button9.getText().isEmpty()){
            panel.setText("Ничья");
            Win();
        }
    }

    @FXML
    void but8(ActionEvent event) {
        if(button8.getText().isEmpty()) {
            if (i % 2 == 0) {
                button8.setText("X");
            } else {
                button8.setText("o");
            }
        }

        pob=Pobeda();
        i++;
        if(pob == 1){
            panel.setText("Победил X");
            Win();
        }
        if (pob==2){
            panel.setText("Победил O");
            Win();
        }
        if(!button1.getText().isEmpty()&&!button2.getText().isEmpty()&&!button3.getText().isEmpty()&&!button4.getText().isEmpty()&&!button5.getText().isEmpty()&&!button6.getText().isEmpty()&&!button7.getText().isEmpty()&&!button8.getText().isEmpty()&&!button9.getText().isEmpty()) {
            panel.setText("Ничья");
            Win();
        }
    }

    @FXML
    void but9(ActionEvent event) {
        if(button9.getText().isEmpty()) {
            if (i % 2 == 0) {
                button9.setText("X");
            } else {
                button9.setText("o");
            }
        }

        pob=Pobeda();
        i++;
        if(pob == 1){
            panel.setText("Победил X");
            Win();
        }
        if (pob==2){
            panel.setText("Победил O");
        Win();
        }
        if(!button1.getText().isEmpty()&&!button2.getText().isEmpty()&&!button3.getText().isEmpty()&&!button4.getText().isEmpty()&&!button5.getText().isEmpty()&&!button6.getText().isEmpty()&&!button7.getText().isEmpty()&&!button8.getText().isEmpty()&&!button9.getText().isEmpty()){
            panel.setText("Ничья");
            Win();
        }
    }
 public int Pobeda() {
     int a = 0;
     for (int b = 0; b < 8; b++) {
         String line = switch (b) {
             case 0 -> button1.getText() + button2.getText() + button3.getText();
             case 1 -> button4.getText() + button5.getText() + button6.getText();
             case 2 -> button7.getText() + button8.getText() + button9.getText();
             case 3 -> button1.getText() + button5.getText() + button9.getText();
             case 4 -> button3.getText() + button5.getText() + button7.getText();
             case 5 -> button1.getText() + button4.getText() + button7.getText();
             case 6 -> button2.getText() + button5.getText() + button8.getText();
             case 7 -> button3.getText() + button6.getText() + button9.getText();
             default -> null;
         };
         if(line.equals("XXX")){
             a=1;
         }
         if (line.equals("ooo")){
             a=2;
         }

     }

     return a;
 }
 public void Win(){
     button1.setText("");
     button2.setText("");
     button3.setText("");
     button4.setText("");
     button5.setText("");
     button6.setText("");
     button7.setText("");
     button8.setText("");
     button9.setText("");
     i=0;
 }
}
