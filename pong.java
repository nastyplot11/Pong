import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class pong implements ActionListener, KeyListener, MouseMotionListener{
	//Properties
	JFrame Pong;
	AnimationPanel3 panel;
	Timer timer;
	
	//Methods
	public void actionPerformed(ActionEvent evt){
		if(evt.getSource() == timer){
			panel.repaint();
		}
	}
	public void mouseMoved(MouseEvent evt){
		panel.intBlock2Y = evt.getY();
	}
	public void mouseDragged(MouseEvent evt){
	}
	
	public void keyTyped(KeyEvent evt){
		
	}
	
	public void keyReleased(KeyEvent evt){
		if(evt.getKeyCode()==38){
			panel.blnGoUp = false;
		}else if(evt.getKeyCode()==40){
			panel.blnGoDown = false;
		}
	}
	
	public void keyPressed(KeyEvent evt){
		if(evt.getKeyCode()==38){
			panel.blnGoUp = true;
		}else if(evt.getKeyCode()==40){
			panel.blnGoDown = true;
		}
	}
	
	//Constructor
	public pong(){
		Pong = new JFrame("Pong");
		panel = new AnimationPanel3();
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(1280, 720));
		
		timer = new Timer(1000/60, this);
		timer.start();
		
		Pong.addKeyListener(this);
		Pong.setContentPane(panel);
		Pong.pack();
		Pong.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Pong.setVisible(true);
		
	}
	
	//Main Method
	public static void main(String[]args){
		new pong();
	}
}
