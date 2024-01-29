
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;

public class Gameplay extends JPanel implements KeyListener, ActionListener {
private  boolean play = false;
private int score = 0;

private int totalaRutor = 15;

private Timer tid;
private int delay = 8;

private int plankaX = 270;

private int bollposX = 120;
private int bollposY = 350;
private int bollXdir = -1;
private int bollYdir = -2;

public Gameplay(){
    addKeyListener(this);
    setFocusable(true);
    setFocusTraversalKeysEnabled(false);
    //tid =new Timer(delay,this);
    //tid.start();
}

public void paint(Graphics g){
    //Bakgrund
    g.setColor(Color.DARK_GRAY);
    g.fillRect(1,1,442,592);

    //planka
    g.setColor(Color.lightGray);
    g.fillRect(plankaX, 550,100, 8);

    //boll
    g.setColor(Color.gray);
    g.fillRect(bollposX, bollposY,20, 20);
}


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
if(plankaX >= 600){
    plankaX = 600;
}else{
    gåHöger();
}
}
if(e.getKeyCode() == KeyEvent.VK_LEFT) {
    if(plankaX >= 10){
        plankaX = 10;
    }else{
        gåVänster();
    }
}
    }
    public void gåHöger() {
    play = true;
    plankaX+=10;
    }
    public void gåVänster() {
        play = true;
        plankaX+=-10;
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
