package test;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Note extends Thread {

	private Image noteBasicImage = new ImageIcon(Home.class.getResource("../images/noteBasic.png")).getImage();
	private int x, y = 580 - (1000 / Home.SLEEP_TIME * Home.NOTE_SPEED) *Home.REACH_TIME;
	private String noteType;
	private boolean proceeded = true;
	
	public String getNoteType( ) {
		return noteType;
	}
	
	public boolean isProceeded() {
		return proceeded;
	}
	
	public void close() {
		proceeded = false;
	}
	
	public Note(String noteType) {
		if(noteType.equals("S")) {
			x = 270;
		}
		else if(noteType.equals("D")) {
			x = 380; 
		}
		else if(noteType.equals("F")) {
			x = 490; 
		}
		else if(noteType.equals("Space")) {
			x = 600; 
		}
		else if(noteType.equals("J")) {
			x = 710; 
		}
		else if(noteType.equals("K")) {
			x = 820; 
		}
		else if(noteType.equals("L")) {
			x = 930; 
		}
		this.noteType = noteType;
	}
	
	public void screenDraw(Graphics2D g) {
		if(noteType.equals("Space"))
		{
			g.drawImage(noteBasicImage, x, y, null);
		}
		else
		{
			g.drawImage(noteBasicImage, x, y, null);
			g.drawImage(noteBasicImage, x -1, y, null);
		}
	}
	
	public void drop() {
		y += Home.NOTE_SPEED;
		if(y > 620) {
			System.out.println("Miss");
			close();
		}
	}
	
	@Override
	public void run() {
		try {
			while (true) {
				drop();
				if(proceeded) {
					Thread.sleep(Home.SLEEP_TIME);
				}
				else {
					interrupt();
					break;
				}
			}
		} catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
	public String judge() {
		if(y >= 600) {
			System.out.println("Good");
			close();
			return "Good";
		}
		else if(y >= 587) {
			System.out.println("Great");
			close();
			return "Great";
		}
		else if(y >= 573) {
			System.out.println("Perfect");
			close();
			return "Perfect";
		}
		else if(y >= 565) {
			System.out.println("Great");
			close();
			return "Great";
		}
		else if(y >= 550) {
			System.out.println("Good");
			close();
			return "Good";
		}
		return "None";

	}
	
	public int getY( ) {
		return y;
	}
}
