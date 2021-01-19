package TicTacToe.JuegoConInterfaz;

import javax.swing.JButton;

public class Boton extends JButton{
    private final int i;
    private final int j;

    public Boton(int i,int j){
        this.i = i;
        this.j = j;
    }
    
    public int getI(){
        return i;
    }

    public int getJ(){
        return j;
    }
    
}
