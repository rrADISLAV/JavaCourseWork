//importing the libraries
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/*
*
*In this file we will create the objects and specify what will contain
*
*/
public class Square
{
    public final static int EMPTY = 0;
    public final static int WHITE_CHECKER = 1;
    public final static int RED_CHECKER = 2;
    public final static int KING_WHITE = 3;
    public final static int KING_RED = 4;

    //the constructors atributes
    private JButton button;
    private int x, y;
    private int checker;


    //assigning the constructor
    public Square(int x, int y) {

        this.x = x;
        this.y = y;

        button = new JButton();
    }

    //getting the atributes of the objects
    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public JButton getButton() {
        return button;
    }

    public int getChecker()
    {
        return checker;
    }
    public void setChecker(int checker) {
        this.checker = checker;
        switch (checker) {
            case EMPTY:
                if ((x + y) % 2 != 0) {
                    button.setIcon(new ImageIcon("empty.png"));
                } else {
                    button.setIcon(new ImageIcon("empty2.png"));
                }

                break;
            case WHITE_CHECKER:
                button.setIcon(new ImageIcon("white.png"));
                break;
            case RED_CHECKER:
                button.setIcon(new ImageIcon("red.png"));
                break;
            //dobavi drugite
        }

    }
}