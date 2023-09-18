
import java.util.ArrayList;

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
public class Pipe<T> {
    
    private T element;
    private ArrayList<T> pipeLine;
    
    public Pipe() {
        this.pipeLine = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        this.pipeLine.add(value);
    }
    
    public T takeFromPipe() {
        if (this.pipeLine.isEmpty()) {
            return null;
        } else {
            T temp = this.pipeLine.get(0);
            this.pipeLine.remove(0);
            return temp;
        }
    }
    
    public boolean isInPipe() {
        return (!this.pipeLine.isEmpty());
    }
    
}
