package ticTacToe;

import java.util.ArrayList;
import javafx.scene.control.Button;



public class GameLogic {
    
    private String turn;
    
    public GameLogic() {
        this.turn = "X";
    }
    
    public void changeTurn() {
        if (this.turn.equals("X")) {
            this.turn = "O";
        } else {
            this.turn = "X";
        }
    }
    
    public String getTurn() {
        return this.turn;
    }
    
    public boolean checkScore(ArrayList<Button> buttonList) {
        if (buttonList.get(0).getText().equals(buttonList.get(1).getText()) && 
                buttonList.get(0).getText().equals(buttonList.get(2).getText()) && 
                !(buttonList.get(0).getText().equals(" "))){
            return true;
        } else if (buttonList.get(3).getText().equals(buttonList.get(4).getText()) && 
                buttonList.get(3).getText().equals(buttonList.get(5).getText()) &&
                !(buttonList.get(3).getText().equals(" "))){
            return true;
        } else if (buttonList.get(6).getText().equals(buttonList.get(7).getText()) && 
                buttonList.get(6).getText().equals(buttonList.get(8).getText()) && 
                !(buttonList.get(6).getText().equals(" "))){
            return true;
        } else if (buttonList.get(0).getText().equals(buttonList.get(3).getText()) && 
                buttonList.get(0).getText().equals(buttonList.get(6).getText()) && 
                !(buttonList.get(0).getText().equals(" "))){
            return true; 
        } else if (buttonList.get(1).getText().equals(buttonList.get(4).getText()) && 
                buttonList.get(1).getText().equals(buttonList.get(7).getText()) &&
                !(buttonList.get(1).getText().equals(" "))){
            return true;
        } else if (buttonList.get(2).getText().equals(buttonList.get(5).getText()) && 
                buttonList.get(2).getText().equals(buttonList.get(8).getText()) &&
                !(buttonList.get(2).getText().equals(" "))){
            return true;
        } else if (buttonList.get(0).getText().equals(buttonList.get(4).getText()) && 
                buttonList.get(0).getText().equals(buttonList.get(8).getText()) &&
                !(buttonList.get(0).getText().equals(" "))){
            return true;
        } else if (buttonList.get(2).getText().equals(buttonList.get(4).getText()) && 
                buttonList.get(2).getText().equals(buttonList.get(6).getText()) &&
                !(buttonList.get(2).getText().equals(" "))){
            return true;
        }
       return false;
    }
    
}
