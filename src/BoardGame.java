import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BoardGame extends JPanel {
    private static final int N = 3;
    private static final int M = 3;

    private Image imgX;
    private Image imgO;
    public BoardGame(){
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                int x = e.getX();
                int y = e.getY();
            }
        });
        try{
            imgX = ImageIO.read(getClass().getResource("o.png"));
            imgO = ImageIO.read(getClass().getResource("x.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public void paint(Graphics g) {
        int w = getWidth() / 3;
        int h = getHeight() / 3;
        int k = 0;
        Graphics graph2d = (Graphics) g;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                int x = w * i;
                int y = h * j;
                Color color = k % 2 == 0 ? Color.BLUE : Color.RED;
                graph2d.setColor(color);
                graph2d.fillRect(x,y,w,h);
                Image img = k % 2 == 0 ? imgX : imgO;
                graph2d.drawImage(img,x,y,w,h,this);
                k++;
            }
        }
    }
}
