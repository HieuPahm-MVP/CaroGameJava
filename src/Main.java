import javax.swing.*;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BoardGame board = new BoardGame();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        JFrame Frame = new JFrame("Game Caro");
        Frame.setSize(600,600);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setResizable(false);
        Frame.add(board);
        int x = ((int)dimension.getWidth() / 2 - (Frame.getWidth() / 2));
        int y = ((int)dimension.getHeight() / 2 -(Frame.getHeight() / 2));
        Frame.setLocation(x,y);
        Frame.setVisible(true);
    }
}