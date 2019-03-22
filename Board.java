/*
*The following programs creates 
*an interactive model of a game of draughts. 
*
**This class will create the board and add the objects(squares)
*to the board
* Class Board creates Graphical User Interfacec (GUI)
*
*/

//importing libraries
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//creating the class and attaching an ActionListener to it
public class Board implements ActionListener
{
    //creating the JFrame and the 2d arrya of objects of type Square
    JFrame f;
    public static Square[][] squares = new Square[8][8];
    //variable needed for moveTo method
    Square[][] selected = new Square[8][8];
}