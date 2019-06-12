package test;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PianoMode extends JFrame implements KeyListener {

    
	public PianoMode() {
		 
		getContentPane().setLayout(null);
		
		JButton C_s = new JButton("W");
		C_s.setBackground(SystemColor.desktop);
		C_s.setForeground(SystemColor.window);
		C_s.setBounds(257, 262, 75, 119);
		getContentPane().add(C_s);
		
		JButton Dd_s = new JButton("P");
		Dd_s.setForeground(Color.WHITE);
		Dd_s.setBackground(Color.BLACK);
		Dd_s.setBounds(896, 262, 75, 119);
		getContentPane().add(Dd_s);
		
		JButton Cc_s = new JButton("O");
		Cc_s.setForeground(Color.WHITE);
		Cc_s.setBackground(Color.BLACK);
		Cc_s.setBounds(820, 262, 75, 119);
		getContentPane().add(Cc_s);

		JButton G_s = new JButton("Y");
		G_s.setForeground(Color.WHITE);
		G_s.setBackground(Color.BLACK);
		G_s.setBounds(575, 262, 75, 119);
		getContentPane().add(G_s);
		
		JButton btnI_1 = new JButton("U");
		btnI_1.setForeground(Color.WHITE);
		btnI_1.setBackground(Color.BLACK);
		btnI_1.setBounds(651, 262, 75, 119);
		getContentPane().add(btnI_1);
		
		JButton D_s = new JButton("E");
		D_s.setForeground(SystemColor.window);
		D_s.setBackground(Color.BLACK);
		D_s.setBounds(336, 262, 75, 119);
		getContentPane().add(D_s);
		
		JButton F_s = new JButton("T");
		F_s.setForeground(Color.WHITE);
		F_s.setBackground(Color.BLACK);
		F_s.setBounds(498, 262, 75, 119);
		getContentPane().add(F_s);
		
	
		JButton C = new JButton("A");
		C.setBackground(SystemColor.window);
		C.setBounds(212, 378, 83, 159);
		getContentPane().add(C);
		
		JButton D = new JButton("S");
		D.setBackground(SystemColor.window);
		D.setBounds(292, 378, 83, 159);
		getContentPane().add(D);

		JButton E = new JButton("D");
		E.setBackground(SystemColor.window);
		E.setBounds(372, 378, 83, 159);
		getContentPane().add(E);
		
		JButton F = new JButton("F");	
		F.setBackground(SystemColor.window);
		F.setBounds(452, 378, 83, 159);
		getContentPane().add(F);
		
		JButton G = new JButton("G");	
		G.setBackground(SystemColor.window);
		G.setBounds(532, 378, 83, 159);
		getContentPane().add(G);
	
		
		JButton A = new JButton("H");
		A.setBackground(SystemColor.window);
		A.setBounds(612, 378, 83, 159);
		getContentPane().add(A);
		
		
		JButton B = new JButton("J");
		B.setBackground(SystemColor.window);
		B.setBounds(692, 378, 83, 159);
		getContentPane().add(B);
		
		JButton Cc = new JButton("K");
		Cc.setBackground(Color.WHITE);
		Cc.setBounds(772, 378, 83, 159);
		getContentPane().add(Cc);
		
		JButton Dd = new JButton("L");
		Dd.setBackground(Color.WHITE);
		Dd.setBounds(852, 378, 83, 159);
		getContentPane().add(Dd);
		
		JButton Ee = new JButton(";");
		Ee.setBackground(Color.WHITE);
		Ee.setBounds(932, 378, 83, 159);
		getContentPane().add(Ee);
		
		JButton MusicBook = new JButton("악보");
		MusicBook.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {//회원가입창으로 이동
				// TODO Auto-generated method stub
				MusicBook f5= new MusicBook();
			
			}
		});
		MusicBook.setBounds(57, 629, 137, 89);
		getContentPane().add(MusicBook);
		
		JButton piano = new JButton("피아노");
		piano.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == 'a') {
					C.setBackground(Color.red);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\C.wav"));
						Clip clip = AudioSystem.getClip();
	
						clip.open(audioInputStream);
						
						clip.start();
						
						
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 's') {
					C.setBackground(Color.white);
					D.setBackground(Color.red);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\D.wav"));
						Clip clip = AudioSystem.getClip();
					
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'd') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.red);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\E.wav"));
						Clip clip = AudioSystem.getClip();
						
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'f') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.red);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\F.wav"));
						Clip clip = AudioSystem.getClip();
				
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'g') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.red);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\G.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'h') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.red);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\A.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'j') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.red);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\B.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
			
				else if(e.getKeyChar() == 'k') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.red);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\C1.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'l') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.red);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\D1.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == ';') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.red);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\E1.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == '"') {
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\F1.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				
				else if(e.getKeyChar() == 'w') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.green);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\C_s.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				
				else if(e.getKeyChar() == 'e') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.green);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\D_s.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				
				else if(e.getKeyChar() == 't') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.green);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\F_s.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'y') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.green);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\G_s.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				
				else if(e.getKeyChar() == 'o') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.green);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\C_s1.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				
				else if(e.getKeyChar() == 'p') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.green);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\D_s1.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
			}
		});
		piano.setBounds(745, 34, 97, 70);
		getContentPane().add(piano);
		
		JButton guitar = new JButton("기타");
		guitar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == 'a') {
					C.setBackground(Color.red);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\chord-C.wav"));
						Clip clip = AudioSystem.getClip();
	
						clip.open(audioInputStream);
						
						clip.start();
						
						
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 's') {
					C.setBackground(Color.white);
					D.setBackground(Color.red);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\chord-D.wav"));
						Clip clip = AudioSystem.getClip();
					
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'd') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.red);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\chord-E.wav"));
						Clip clip = AudioSystem.getClip();
						
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'f') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.red);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\chord-F.wav"));
						Clip clip = AudioSystem.getClip();
				
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'g') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.red);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\chord-G.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				
				else if(e.getKeyChar() == 'h') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.red);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\chord-A.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
					
				}
			}
		});
		guitar.setBounds(869, 34, 97, 70);
		getContentPane().add(guitar);
		
		JButton drum = new JButton("드럼");
		drum.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == 'a') {
					C.setBackground(Color.red);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\C_Drum.wav"));
						Clip clip = AudioSystem.getClip();
	
						clip.open(audioInputStream);
						
						clip.start();
						
						
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 's') {
					C.setBackground(Color.white);
					D.setBackground(Color.red);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\D_Drum.wav"));
						Clip clip = AudioSystem.getClip();
					
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'd') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.red);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\E_Drum.wav"));
						Clip clip = AudioSystem.getClip();
						
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'f') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.red);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\F_Drum.wav"));
						Clip clip = AudioSystem.getClip();
				
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'g') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.red);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\G_Drum.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'h') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.red);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\A_Drum.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'j') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.red);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\B_Drum.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
			
				else if(e.getKeyChar() == 'k') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.red);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\C1_Drum.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'l') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.red);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\D1_Drum.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == ';') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.red);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\E1_Drum.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
			}
		});
		drum.setBounds(990, 34, 97, 70);
		getContentPane().add(drum);
		
		JLabel lblNewLabel = new JLabel("그림");
		lblNewLabel.setBounds(20, 25, 429, 89);
		getContentPane().add(lblNewLabel);
		
		
		
		JButton btnDispose = new JButton("닫기");
		btnDispose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 	{
				dispose();
				FirstPage f3= new FirstPage();
				}
			});
		btnDispose.setBounds(958, 629, 129, 89);
		getContentPane().add(btnDispose);
		

		
		JButton octave3 = new JButton("3\uC625\uD0C0\uBE0C");
		octave3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == 'a') {
					C.setBackground(Color.red);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\C-1v.wav"));
						Clip clip = AudioSystem.getClip();
	
						clip.open(audioInputStream);
						
						clip.start();
						
						
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 's') {
					C.setBackground(Color.white);
					D.setBackground(Color.red);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\D-1v.wav"));
						Clip clip = AudioSystem.getClip();
					
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'd') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.red);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\E-1v.wav"));
						Clip clip = AudioSystem.getClip();
						
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'f') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.red);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\F-1v.wav"));
						Clip clip = AudioSystem.getClip();
				
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'g') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.red);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\G-1v.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'h') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.red);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\A-1v.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'j') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.red);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\B-1v.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
			
				else if(e.getKeyChar() == 'k') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.red);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\Cc-1v.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'l') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.red);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\Dd-1v.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == ';') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.red);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\Ee-1v.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
			}
		});
		
		octave3.setBounds(212, 662, 116, 23);
		getContentPane().add(octave3);
		
		
		JButton octave4 = new JButton("4\uC625\uD0C0\uBE0C(\uAE30\uBCF8)");
		octave4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == 'a') {
					C.setBackground(Color.red);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\C.wav"));
						Clip clip = AudioSystem.getClip();
	
						clip.open(audioInputStream);
						
						clip.start();
						
						
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 's') {
					C.setBackground(Color.white);
					D.setBackground(Color.red);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\D.wav"));
						Clip clip = AudioSystem.getClip();
					
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'd') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.red);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\E.wav"));
						Clip clip = AudioSystem.getClip();
						
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'f') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.red);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\F.wav"));
						Clip clip = AudioSystem.getClip();
				
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'g') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.red);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\G.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'h') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.red);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\A.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'j') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.red);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\B.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
			
				else if(e.getKeyChar() == 'k') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.red);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\C1.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'l') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.red);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\D1.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == ';') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.red);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\E1.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
			}
		});
		octave4.setBounds(277, 629, 116, 23);
		getContentPane().add(octave4);
		
		JButton octave2 = new JButton("2\uC625\uD0C0\uBE0C");
		octave2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == 'a') {
					C.setBackground(Color.red);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\C-2v.wav"));
						Clip clip = AudioSystem.getClip();
	
						clip.open(audioInputStream);
						
						clip.start();
						
						
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 's') {
					C.setBackground(Color.white);
					D.setBackground(Color.red);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\D-2v.wav"));
						Clip clip = AudioSystem.getClip();
					
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'd') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.red);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\E-2v.wav"));
						Clip clip = AudioSystem.getClip();
						
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'f') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.red);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\F-2v.wav"));
						Clip clip = AudioSystem.getClip();
				
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'g') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.red);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\G-2v.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'h') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.red);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\A-2v.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'j') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.red);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\B-2v.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
			
				else if(e.getKeyChar() == 'k') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.red);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\Cc-2v.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'l') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.red);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\Dd-2v.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == ';') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.red);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\Ee-2v.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
			}
		});
		octave2.setBounds(212, 695, 116, 23);
		getContentPane().add(octave2);
		
		JButton octave6 = new JButton("6\uC625\uD0C0\uBE0C");
		octave6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == 'a') {
					C.setBackground(Color.red);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\C2v.wav"));
						Clip clip = AudioSystem.getClip();
	
						clip.open(audioInputStream);
						
						clip.start();
						
						
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 's') {
					C.setBackground(Color.white);
					D.setBackground(Color.red);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\D2v.wav"));
						Clip clip = AudioSystem.getClip();
					
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'd') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.red);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\E2v.wav"));
						Clip clip = AudioSystem.getClip();
						
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'f') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.red);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\F2v.wav"));
						Clip clip = AudioSystem.getClip();
				
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'g') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.red);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\G2v.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'h') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.red);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\A2v.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'j') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.red);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\B2v.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
			
				else if(e.getKeyChar() == 'k') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.red);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\Cc2v.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'l') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.red);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\Dd2v.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == ';') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.red);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\Ee2v.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
			}
		});
		octave6.setBounds(336, 695, 116, 23);
		getContentPane().add(octave6);
		
		JButton octave5 = new JButton("5\uC625\uD0C0\uBE0C");
		octave5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == 'a') {
					C.setBackground(Color.red);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\C1v.wav"));
						Clip clip = AudioSystem.getClip();
	
						clip.open(audioInputStream);
						
						clip.start();
						
						
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 's') {
					C.setBackground(Color.white);
					D.setBackground(Color.red);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\D1v.wav"));
						Clip clip = AudioSystem.getClip();
					
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'd') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.red);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\E1v.wav"));
						Clip clip = AudioSystem.getClip();
						
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'f') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.red);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\F1v.wav"));
						Clip clip = AudioSystem.getClip();
				
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'g') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.red);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\G1v.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'h') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.red);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\A1v.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'j') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.red);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\B1v.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
			
				else if(e.getKeyChar() == 'k') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.red);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\Cc1v.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'l') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.red);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\Dd1v.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == ';') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.red);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					Cc_s.setBackground(Color.black);
					Dd_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\Ee1v.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
			}
		});
		octave5.setBounds(336, 662, 116, 23);
		getContentPane().add(octave5);
		
		JButton metronome = new JButton("\uBA54\uD2B8\uB85C\uB188");
		metronome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\sound\\asdf.wav"));
					Clip clip = AudioSystem.getClip();
		
					clip.open(audioInputStream);
					clip.start();
				}
				catch(Exception ex) {
					
				}
			}
		});
		metronome.setBounds(474, 629, 137, 89);
		getContentPane().add(metronome);

		
		
		setSize(1345, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);//프레임 스크린 중앙
		setResizable(false);//프레임 스크린 크기 변경 불가능
		setTitle("민수짱");
		setVisible(true);
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
