/*
*The following programs creates 
*an interactive model of a game of draughts. 
*
*This class creates the objects and gives them specifications
*such as location and button background (empty, white checker, etc..)
*/


//imporing libraries
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//creating the class and attaching an ActionListener to it
public class Square 
{

    public final static int EMPTY = 0;
    public final static int WHITE_CHECKER = 1;
    public final static int RED_CHECKER = 2;
    public final static int KING_WHITE = 3;
    public final static int KING_RED = 4;

    //creating the elements that each object will have
//a button, and cordinats on the 2d arrya
    private JButton button;
    private int x, y;
    private int checker;


private  JButton button;
private  int x, y;
private int checker;
//a variable needed for the moveTo method
public Square[][] selected = new Square[8][8];
//creating the constructor 
 public Square(int x, int y)
{
    //cordinate x;
    this.x = x;
    //cordinate y;
    this.y = y;
    button = new  JButton();
    //attaching an ActionListener to the button of the object
    button.addActionListener(this);
}

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