package test;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class FirstPage extends JFrame implements Runnable, ActionListener
{

	private Image screenImage;
	private Graphics screenGrapics;
	private Image introBackground;
    JScrollPane scrollPane;
    ImageIcon icon;
    
	public FirstPage() {
		

	    
        ImageIcon icon = new ImageIcon("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\images\\back7.jpg");
        
        Music introMusic = new Music("dizzy.mp3",true);
        introMusic.start();
        
    
		
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("6\uC870");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("메이플스토리", Font.BOLD, 95));
		lblNewLabel.setBounds(575, 143, 386, 113);
		getContentPane().add(lblNewLabel);
		
		JButton PlayMode = new JButton("\uC5F0\uC8FC\uBAA8\uB4DC");
		PlayMode.setForeground(Color.BLACK);
		PlayMode.setFont(new Font("메이플스토리", Font.BOLD, 40));
		PlayMode.setBounds(451, 408, 408, 51);
		getContentPane().add(PlayMode);
		PlayMode.setContentAreaFilled(false);
	
		
		JButton GameMode = new JButton("\uAC8C\uC784\uBAA8\uB4DC");
		GameMode.setForeground(Color.BLACK);
		GameMode.setFont(new Font("메이플스토리", Font.BOLD, 40));
		GameMode.setBounds(451, 503, 408, 51);
		getContentPane().add(GameMode);
		GameMode.setContentAreaFilled(false);
		


		PlayMode.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				PianoMode f2= new PianoMode();
				dispose();
				introMusic.stop();
			}
		});
		
		GameMode.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				DynamicBeat f3= new DynamicBeat();
				dispose();
				introMusic.stop();
			}
		});
		Container contentPane = getContentPane(); //컨텐트 팬을 알아낸다.

		contentPane.setBackground(Color.ORANGE); //오렌지색 배경 설정
		
		JPanel panel = new JPanel() {
			 public void paintComponent(Graphics g) {
	                // Apxproach 1: Dispaly image at at full size
	                g.drawImage(icon.getImage(), 0, 0, null);
	                // Approach 2: Scale image to size of component
	                // Dimension d = getSize();
	                // g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
	                // Approach 3: Fix the image position in the scroll pane
	                // Point p = scrollPane.getViewport().getViewPosition();
	                // g.drawImage(icon.getImage(), p.x, p.y, null);
	                setOpaque(false); //그림을 표시하게 설정,투명하게 조절
	                super.paintComponent(g);
	            }
		};
		panel.setBounds(0, 0, 1280, 720);
		getContentPane().add(panel);

	

		setSize(1280, 720);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("6조의 신디사이저");
		setVisible(true);;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
