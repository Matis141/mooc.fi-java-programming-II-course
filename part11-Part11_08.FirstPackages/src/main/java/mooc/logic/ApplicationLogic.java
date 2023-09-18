/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc.logic;
import mooc.ui.UserInterface;

/**
 *
 * @author augma
 */
public class ApplicationLogic {

    private UserInterface applicationLogic;
    
    public ApplicationLogic(UserInterface ui) {
        this.applicationLogic = ui;
    }
    
    public void execute(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Application logic is working");
            this.applicationLogic.update();
        }
    }
    
}
