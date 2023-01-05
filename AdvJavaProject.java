import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdvJavaProject extends Applet {
    static boolean ex= true;

    private void drawSmile(int a, int b, Graphics g) {
        g.drawOval(a-50, b-50, 100, 100);
        g.fillOval(a-30, b-35, 20, 20);
        g.fillOval(a+10, b-35, 20, 20);
        g.drawArc(a-18, b+10, 36, 30, 180, 180);
    }

    private void drawCry(int a, int b, Graphics g) {
        g.drawOval(a-50, b-50, 100, 100);
        g.drawArc(a-30, b-35, 20, 20, 180, 180);
        g.drawArc(a+10, b-35, 20, 20, 180, 180);
        g.drawArc(a-18, b+10, 36, 30, 0, 180);
    }

    int x=350;
    int y=350;

    @Override
    public void init() {
        

        Button expr = new Button("Smile/Cry");
        expr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                paint(getGraphics());
            }
        });
        
        add(expr);

    }

    @Override
    public void paint(Graphics g) {
        try{
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, 700, 700);
            g.setColor(Color.BLACK);

        } catch (Exception e) {
            e.printStackTrace();
        }

        if(ex){
            drawSmile(x, y, getGraphics());
            ex=false;
        }else{
            drawCry(x, y, getGraphics());
            ex=true;
        }
        
    }
}
