import java.util.Timer;
import java.util.concurrent.TimeUnit;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class JLayeredPaneTest extends JFrame {
    private static final long serialVersionUID = 1L;
    public JLayeredPaneTest() {
        super("Example LayeredTest");
        final int[] Speed = {1};
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLayeredPane lp = getLayeredPane();
        Figure figure2 = new Figure(Color.blue, 0, "");
        Figure figure1 = new Figure(Color.red, 1, "");
        figure2.setBounds(60, 120, 100, 100);
        figure1.setBounds(-30, -30, 30, 30);
        setLayout(new FlowLayout());
        lp.add(figure2, JLayeredPane.PALETTE_LAYER);
        lp.add(figure1, JLayeredPane.POPUP_LAYER);
        setSize(800, 900);
        setVisible(true);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                figure1.setLocation(e.getX()-20, e.getY()-40);

                int f2x = figure2.getX();
                int f2y = figure2.getY();
                int f1x = figure1.getX()-20;
                int f1y = figure1.getY()-40;
                if (f1y > f2y) {
                    int rast = 0;
                    while (f1y != f2y) {
                        f2y = figure2.getY();
                        f1y = figure1.getY()-40;
                        rast = f1y - f2y;
                        if (rast!=0) {
                            figure2.setLocation(f2x, f2y + 1);
                        }
                    }
                }
                else if (f1y < f2y) {
                    int rast = 0;
                    while (f1y != f2y) {
                        f2y = figure2.getY();
                        f1y = figure1.getY()-40;
                        rast = f1y - f2y;
                        if (rast!=0) {
                            figure2.setLocation(f2x, f2y - 1);
                        }
                    }
                }
                if (f1x > f2x) {
                    int rast = 0;
                    while (f1x != f2x) {
                        f2x = figure2.getX();
                        f1x = figure1.getX()-40;
                        rast = f1x - f2x;
                        if (rast!=0) {
                            figure2.setLocation(f2x + 1, f2y);
                        }
                    }
                }
                else if (f1x < f2x) {
                    int rast = 0;
                    while (f1x != f2x) {
                        f2x = figure2.getX();
                        f1x = figure1.getX()-40;
                        rast = f1x - f2x;
                        if (rast!=0) {
                            figure2.setLocation(f2x - 1, f2y);
                        }
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(false);
        new JLayeredPaneTest();
    }
}
