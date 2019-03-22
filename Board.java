/*
*The following programs creates 
*an interactive model of a game of draughts. 
*
**This class will create the board and add the objects(squares)
*to the board
* Class Board creates Graphical User Interfacec (GUI)
*
*
*/

//importing libraries
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//creating the class
public class Board
{
    //creating the JFrame
    JFrame f;
    //creating the objects in a 2d array with type Square
    public static Square[][] squares = new Square[8][8];
    //create a variable of type Square that will help in the moveTo method
    Square selected;

    
    public Board()
    {
        //creating the frame
        f = new JFrame();

        //initialize objects
        for(int i =0; i < 8; i++)
        {
            for(int j=0; j < 8; j++)
            {
                squares[i][j] = new Square(i,j);
                if(((i+j) %2 != 0))
                {
                    if(i<=2) squares[i][j].setChecker(Square.WHITE_CHECKER);
                    if(i>=5) squares[i][j].setChecker(Square.RED_CHECKER);
                    if(i==3 || i==4) squares[i][j].setChecker(Square.EMPTY);

                }
                else {squares[i][j].setChecker(Square.EMPTY);}

                f.add(squares[i][j].getButton());
                final int x = i;
                final int y = j;

                squares[i][j].getButton().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        moveTo(x,y);

                    }
                });
            }
        }
        //setting the JFrame specifications
        f.setLayout(new GridLayout(8,8));
        f.setSize(700,700);
        f.setVisible(true);
        f.setResizable(false);
        f.setTitle("English checker");
    }


//creating the moveTo method
    public void moveTo(int newX, int newY) 
    {
        //1nd click
        if (selected == null) {
            selected = squares[newX][newY];
        }
        //2nd click
        else {
            if (squares[newX][newY].getChecker() != Square.EMPTY) {
                selected = null;
            } 
            else 
            {
            int checker = selected.getChecker();
            int oldX = selected.getX();
            int oldY = selected.getY();

                if ((checker == Square.WHITE_CHECKER && oldX + 1 == newX && (oldY + 1 == newY || oldY - 1 == newY))
                        || (checker == Square.RED_CHECKER && oldX - 1 == newX && (oldY + 1 == newY || oldY - 1 == newY))) 
                {
                    squares[newX][newY].setChecker(checker);
                    selected.setChecker(Square.EMPTY);
                    selected = null;
                }  
                else 
                {
                    System.out.println(newX + ";" + newY + " ;" + oldX + " " + oldY);
                    selected = null;
                }
            }
         }
    }





    public static void main(String[] args)
    {
        new Board();

    }
}