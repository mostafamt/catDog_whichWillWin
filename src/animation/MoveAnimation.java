

package animation;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;


public class MoveAnimation extends JPanel implements ActionListener , KeyListener{
    
    Image img1 = Toolkit.getDefaultToolkit().getImage("src//cat sprite//4.png") ;
    Image img2 = Toolkit.getDefaultToolkit().getImage("src//dog sprite//2.png") ;
    Image img3 = Toolkit.getDefaultToolkit().getImage("src//black dog sprite//1.png") ;
    Image img4 = Toolkit.getDefaultToolkit().getImage("src//white cat sprite//2.png") ;
    Timer t = new Timer(500,this);
    
    int x1 = 0 ;
    int y1 = 0 ;
    int velX1 = 0 ;
    int velY1 = 0 ;
    
    int x2 = 0 ;
    int y2 = 400 ;
    int velX2 = 0 ;
    int velY2 = 0 ;
    
    int x3 = 400 ;
    int y3 = 0 ;
    int velX3 = 0 ;
    int velY3 = 0 ;
    
    int x4 = 400 ;
    int y4 = 400 ;
    int velX4 = 0 ;
    int velY4 = 0 ;
    
    public MoveAnimation()
    {
        t.start();
        new Audio().run();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.RED);
        for(int i = 0 ; i < 450 ; i+= 100)
        {
            for(int k = 0 ; k < 450 ; k+= 100)
            {
                g.fillRect(i, k, 50, 50);
            }
            
        }
        for(int i = 50 ; i < 450 ; i+= 100)
        {
            for(int k = 50 ; k < 450 ; k+= 100)
            {
                g.fillRect(i, k, 50, 50);
            }
            
        }
        
        g.setColor(Color.YELLOW);
        for(int i = 50 ; i < 450 ; i+= 100)
        {
            for(int k = 0 ; k < 450 ; k+= 100)
            {
                g.fillRect(i, k, 50, 50);
            }
            
        }        
        for(int i = 0 ; i < 450 ; i+= 100)
        {
            for(int k = 50 ; k < 450 ; k+= 100)
            {
                g.fillRect(i, k, 50, 50);
            }
            
        }
        
        Graphics2D g2 = (Graphics2D)g ;
        g.drawImage(img1, x1, y1, this);
        g.drawImage(img3, x3, y3, this);
        g.drawImage(img4, x4, y4, this);
        g.drawImage(img2, x2, y2, this);
    }
    
    public void Run()
    {
        MoveAnimation m = new MoveAnimation();
        JFrame f = new JFrame();
        f.setTitle("Animation");
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(m);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        move1();
        x1 = x1 + velX1 ;
        y1 = y1 + velY1 ;
        
        move2();
        x2 = x2 + velX2 ;
        y2 = y2 + velY2 ;
        
        move3();
        x3 = x3 + velX3 ;
        y3 = y3 + velY3 ;
        
        move4();
        x4 = x4 + velX4 ;
        y4 = y4 + velY4 ;
        
        if( x1 == x2 && y1 == y2 )
        {
            new Audio().dogSound();
            new Audio().catSound();
            x1 = 2000 ;
        }
        if( x3 == x4 && y3 == y4 )
        {
            new Audio().dogSound();
            new Audio().catSound();
            x4 = 1000 ;
        }
        
        if( x1 == x4 && y1 == y4 )
        {
            new Audio().catSound();
            new Audio().catSound();
        }
        
        if( x2 == x3 && y3 == y4 )
        {
            new Audio().dogSound();
            new Audio().dogSound();
        }
        
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int c = e.getKeyCode() ;
        
        if(c == KeyEvent.VK_LEFT)
        {
            t.stop();
            img1 = Toolkit.getDefaultToolkit().getImage("src//cat sprite//3.png");
            velX1 = -1 ;
            velY1 = 0 ;
        }
        if(c == KeyEvent.VK_RIGHT)
        {
            img1 = Toolkit.getDefaultToolkit().getImage("src//cat sprite//4.png");            
            velX1 = +1 ;
            velY1 = 0 ;
        }
        if(c == KeyEvent.VK_UP)
        {
            img1 = Toolkit.getDefaultToolkit().getImage("src//cat sprite//6.png");
            velX1 = 0 ;
            velY1 = -1 ;
        }
        if(c == KeyEvent.VK_DOWN)
        {
            img1 = Toolkit.getDefaultToolkit().getImage("src//cat sprite//5.png");
            velX1 = 0 ;
            velY1 = +1 ;
        }
    }
    
    public void KeyTyped(KeyEvent e){}
    

    @Override
    public void keyReleased(KeyEvent e) {
        velX1 = 0 ;
        velY1 = 0 ;
    }
    
    public void move1()
    {
        int rand = (int) (Math.random()*4);
        if(rand == 0)
        {
            img1 = Toolkit.getDefaultToolkit().getImage("src//cat sprite//4.png");
            velX1 = 50 ; velY1 = 0 ;
        }
        else if( rand ==1)
        {
            img1 = Toolkit.getDefaultToolkit().getImage("src//cat sprite//3.png");
            velX1 = -50 ; velY1 = 0 ;
        }
        else if(rand ==2)
        {
            img1 = Toolkit.getDefaultToolkit().getImage("src//cat sprite//5.png");
            velX1 = 0 ; velY1 = 50 ;
        }
        else if( rand ==3)
        {
            img1 = Toolkit.getDefaultToolkit().getImage("src//cat sprite//6.png");
            velX1 = 0 ; velY1 = -50 ;
        }
        
        if( x1 >= 0 && x1 <= 50 && velX1 < 0 || x1 >= 400 && x1 <= 450 && velX1 > 0 )
        {
            velX1 *= -1 ;
        }
        
        if( y1 >= 0 && y1 <= 50 && velY1 < 0)
        {
            velY1 *= -1 ;
        }
        if( y1 >= 400 && y1 <= 450 && velY1 > 0)
        {
            velY1 *= -1 ;
        }
    }
    
    public void move2()
    {
        int rand = (int) (Math.random()*4);
        if(rand == 0)
        {
            img2 = Toolkit.getDefaultToolkit().getImage("src//dog sprite//2.png");
            velX2 = 50 ; velY2 = 0 ;
        }
        else if( rand ==1)
        {
            img2 = Toolkit.getDefaultToolkit().getImage("src//dog sprite//1.png");
            velX2 = -50 ; velY2 = 0 ;
        }
        else if(rand ==2)
        {
            img2 = Toolkit.getDefaultToolkit().getImage("src//dog sprite//4.png");
            velX2 = 0 ; velY2 = 50 ;
        }
        else if( rand ==3)
        {
            img2 = Toolkit.getDefaultToolkit().getImage("src//dog sprite//3.png");
            velX2 = 0 ; velY2 = -50 ;
        }
        
        if( x2 >= 0 && x2 <= 50 && velX2 < 0 || x2 >= 400 && x2 <= 450 && velX2 > 0 )
        {
            velX2 *= -1 ;
        }
        
        if( y2 >= 0 && y2 <= 50 && velY2 < 0)
        {
            velY2 *= -1 ;
        }
        if( y2 >= 400 && y2 <= 450 && velY2 > 0)
        {
            velY2 *= -1 ;
        }
    }
    
    public void move3()
    {
        int rand = (int) (Math.random()*4);
        if(rand == 0)
        {
            img3 = Toolkit.getDefaultToolkit().getImage("src//black dog sprite//2.png");
            velX3 = 50 ; velY3 = 0 ;
        }
        else if( rand ==1)
        {
            img3 = Toolkit.getDefaultToolkit().getImage("src//black dog sprite//1.png");
            velX3 = -50 ; velY3 = 0 ;
        }
        else if(rand ==2)
        {
            img3 = Toolkit.getDefaultToolkit().getImage("src//black dog sprite//3.png");
            velX3 = 0 ; velY3 = 50 ;
        }
        else if( rand ==3)
        {
            img3 = Toolkit.getDefaultToolkit().getImage("src//black dog sprite//4.png");
            velX3 = 0 ; velY3 = -50 ;
        }
        
        if( x3 >= 0 && x3 <= 50 && velX3 < 0 || x3 >= 400 && x3 <= 450 && velX3 > 0 )
        {
            velX3 *= -1 ;
        }
        
        if( y3 >= 0 && y3 <= 50 && velY3 < 0)
        {
            velY3 *= -1 ;
        }
        if( y3 >= 400 && y3 <= 450 && velY3 > 0)
        {
            velY3 *= -1 ;
        }
    }
    
    public void move4()
    {
        int rand = (int) (Math.random()*4);
        if(rand == 0)
        {
            img4 = Toolkit.getDefaultToolkit().getImage("src//white cat sprite//1.png");
            velX4 = 50 ; velY4 = 0 ;
        }
        else if( rand ==1)
        {
            img4 = Toolkit.getDefaultToolkit().getImage("src//white cat sprite//2.png");
            velX4 = -50 ; velY4 = 0 ;
        }
        else if(rand ==2)
        {
            img4 = Toolkit.getDefaultToolkit().getImage("src//white cat sprite//4.png");
            velX4 = 0 ; velY4 = 50 ;
        }
        else if( rand ==3)
        {
            img4 = Toolkit.getDefaultToolkit().getImage("src//white cat sprite//3.png");
            velX4 = 0 ; velY4 = -50 ;
        }
        
        if( x4 >= 0 && x4 <= 50 && velX4 < 0 || x4 >= 400 && x4 <= 450 && velX4 > 0 )
        {
            velX4 *= -1 ;
        }
        
        if( y4 >= 0 && y4 <= 50 && velY4 < 0)
        {
            velY4 *= -1 ;
        }
        if( y4 >= 400 && y4 <= 450 && velY4 > 0)
        {
            velY4 *= -1 ;
        }
        
    }
}
