/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author augma
 * @param <T>
 */
public class Hideout<T> {
    
    private T element;
    
    public Hideout() {
    }
    
    public boolean isInHideout() {
        if (this.element != null) {
            return true;
        } else {
            return false;
        }
    }
    
    public void putIntoHideout(T toHide) {
        if (this.element == toHide) {
            this.element = null;
        } else {
            this.element = toHide;
        } 
    }
    
    public T takeFromHideout() {
        if (!this.isInHideout()) {
            return null;
        } else {
            T output = this.element;
            this.element = null;
            return output;
        }
    }
    
}
