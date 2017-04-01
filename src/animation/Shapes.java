

package animation;


import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class Shapes extends JPanel{
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        g.setColor(Color.red);
        g.fillRect(120, 120, 60, 40);
        
    }
    
    public void Run()
    {
        Shapes s = new Shapes();
        JFrame f = new JFrame();
        f.setTitle("Shapes");
        f.setSize(600, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(s);
    }
    
}
