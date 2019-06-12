package test;

import java.awt.Color;

import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.util.ArrayList;

import javax.swing.ImageIcon;


public class Game extends Thread {

	private Image noteRouteLineImage = new ImageIcon(Home.class.getResource("../images/noteRouteLine.png"))
			.getImage();
	private Image judgementLineImage = new ImageIcon(Home.class.getResource("../images/judgementLine.png"))
			.getImage();
	private Image gameInfoImage = new ImageIcon(Home.class.getResource("../images/gameInfo.png"))
			.getImage();
	private Image noteRouteSImage = new ImageIcon(Home.class.getResource("../images/noteRoute.png")).getImage();
	private Image noteRouteDImage = new ImageIcon(Home.class.getResource("../images/noteRoute.png")).getImage();
	private Image noteRouteFImage = new ImageIcon(Home.class.getResource("../images/noteRoute.png")).getImage();
	private Image noteRouteSpace1Image = new ImageIcon(Home.class.getResource("../images/noteRoute.png")).getImage();
	//private Image noteRouteSpace2Image = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	private Image noteRouteJImage = new ImageIcon(Home.class.getResource("../images/noteRoute.png")).getImage();
	private Image noteRouteKImage = new ImageIcon(Home.class.getResource("../images/noteRoute.png")).getImage();
	private Image noteRouteLImage = new ImageIcon(Home.class.getResource("../images/noteRoute.png")).getImage();
	private Image blueFlareImage = new ImageIcon(Home.class.getResource("../images/blueFlare.png")).getImage();
	private Image judgeImage;
	
	private String titleName;
	private String musicTitle;
	private Music gameMusic;
	
	ArrayList<Note> noteList = new ArrayList<Note>();
	
	public Game(String titleName, String difficulty, String musicTitle) {
		this.titleName = titleName;
		this.musicTitle = musicTitle;
		gameMusic = new Music(this.musicTitle, false);
	}
	
	public void screenDraw(Graphics2D g) {
		g.drawImage(noteRouteSImage, 270, 30, null);
		g.drawImage(noteRouteDImage, 380, 30, null);
		g.drawImage(noteRouteFImage, 490, 30, null);
		g.drawImage(noteRouteSpace1Image, 600, 30, null);
		//g.drawImage(noteRouteSpace2Image, 660, 30, null);
		g.drawImage(noteRouteJImage, 710, 30, null);
		g.drawImage(noteRouteKImage, 820, 30, null);
		g.drawImage(noteRouteLImage, 930, 30, null);
		g.drawImage(noteRouteLineImage, 270, 30, null);
		g.drawImage(noteRouteLineImage, 380, 30, null);
		g.drawImage(noteRouteLineImage, 490, 30, null);
		g.drawImage(noteRouteLineImage, 600, 30, null);
		g.drawImage(noteRouteLineImage, 710, 30, null);
		g.drawImage(noteRouteLineImage, 820, 30, null);
		g.drawImage(noteRouteLineImage, 930, 30, null);
		g.drawImage(noteRouteLineImage, 1030, 30, null);	
		g.drawImage(gameInfoImage, 0, 660, null);
		g.drawImage(judgementLineImage, 0, 580, null);
		for(int i = 0; i < noteList.size(); i++)
		{
			Note note = noteList.get(i);
			if(note.getY() > 620) {
				judgeImage = new ImageIcon(Home.class.getResource("../images/judgeMiss.png")).getImage();
			}
			if(!note.isProceeded()) {
				noteList.remove(i);
				i--;
			}
			else {
				note.screenDraw(g);
			}
		}
		g.setColor(Color.white);
		g.setRenderingHint( RenderingHints.KEY_TEXT_ANTIALIASING, 
				RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Arial", Font.BOLD, 30));
		g.drawString(titleName, 20, 702);
		g.setFont(new Font("Arial", Font.PLAIN, 26));
		g.setColor(Color.DARK_GRAY);
		g.drawString("S", 310, 609);
		g.drawString("D", 414, 609);
		g.drawString("F", 518, 609);
		g.drawString("Space Bar", 615, 609);
		g.drawString("J", 750, 609);
		g.drawString("K", 865, 609);
		g.drawString("L", 975, 609);
		g.setColor(Color.LIGHT_GRAY);
		g.setFont(new Font("Elephant", Font.BOLD, 28));
		g.drawString("Sunmoon", 565, 702);
		g.drawImage(blueFlareImage, 300, 430, null);
		g.drawImage(judgeImage, 460, 420, null);
	}
	
	public void pressS() {
		judge("S");
		noteRouteSImage = new ImageIcon(Home.class.getResource("../images/noteRoutePressed.png")).getImage();
		new Music("drumSmall1.mp3", false).start();
	}
	
	public void releaseS() {
		noteRouteSImage = new ImageIcon(Home.class.getResource("../images/noteRoute.png")).getImage();
	}
	
	public void pressD() {
		judge("D");
		noteRouteDImage = new ImageIcon(Home.class.getResource("../images/noteRoutePressed.png")).getImage();
		new Music("drumSmall1.mp3", false).start();
	}
	
	public void releaseD() {
		noteRouteDImage = new ImageIcon(Home.class.getResource("../images/noteRoute.png")).getImage();
	}

	public void pressF() {
		judge("F");
		noteRouteFImage = new ImageIcon(Home.class.getResource("../images/noteRoutePressed.png")).getImage();
		new Music("drumSmall1.mp3", false).start();
	}
	
	public void releaseF() {
		noteRouteFImage = new ImageIcon(Home.class.getResource("../images/noteRoute.png")).getImage();
	}

	public void pressSpace() {
		judge("Space");
		noteRouteSpace1Image = new ImageIcon(Home.class.getResource("../images/noteRoutePressed.png")).getImage();
		//noteRouteSpace2Image = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		new Music("drumBig1.mp3", false).start();
	}
	
	public void releaseSpace() {
		noteRouteSpace1Image = new ImageIcon(Home.class.getResource("../images/noteRoute.png")).getImage();
		//noteRouteSpace2Image = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	}
	
	public void pressJ() {
		judge("J");
		noteRouteJImage = new ImageIcon(Home.class.getResource("../images/noteRoutePressed.png")).getImage();
		new Music("drumSmall1.mp3", false).start();
	}
	
	public void releaseJ() {
		noteRouteJImage = new ImageIcon(Home.class.getResource("../images/noteRoute.png")).getImage();
	}
	
	public void pressK() {
		judge("K");
		noteRouteKImage = new ImageIcon(Home.class.getResource("../images/noteRoutePressed.png")).getImage();
		new Music("drumSmall1.mp3", false).start();
	}
	
	public void releaseK() {
		noteRouteKImage = new ImageIcon(Home.class.getResource("../images/noteRoute.png")).getImage();
	}
	
	public void pressL() {
		judge("L");
		noteRouteLImage = new ImageIcon(Home.class.getResource("../images/noteRoutePressed.png")).getImage();
		new Music("drumSmall1.mp3", false).start();
	}
	
	public void releaseL() {
		noteRouteLImage = new ImageIcon(Home.class.getResource("../images/noteRoute.png")).getImage();
	}
	
	@Override
	public void run() {
		dropNotes();			
	}
	
	public void close() {
		gameMusic.close();
		this.interrupt();
	}
	
	public void dropNotes() {
		Beat[] beats = null;
		if(titleName.contentEquals("Joakim Karud - Mighty Love")) {
			int startTime = 3360 - Home.REACH_TIME * 1000;
			int gap = 125;
			beats = new Beat[] {
					  new Beat(startTime + gap * 1, "S"),
		               new Beat(startTime + gap * 3, "D"),
		               new Beat(startTime + gap * 5, "S"),
		               new Beat(startTime + gap * 7, "D"),
		               new Beat(startTime + gap * 9, "S"),
		               new Beat(startTime + gap * 11, "D"),
		               new Beat(startTime + gap * 13, "S"),
		               new Beat(startTime + gap * 15, "D"),
		               new Beat(startTime + gap * 18, "J"),
		               new Beat(startTime + gap * 20, "K"),
		               new Beat(startTime + gap * 22, "J"),
		               new Beat(startTime + gap * 24, "K"),
		               new Beat(startTime + gap * 26, "J"),
		               new Beat(startTime + gap * 28, "Space"),
		               new Beat(startTime + gap * 30, "J"),
		               new Beat(startTime + gap * 31, "S"),
		               new Beat(startTime + gap * 33, "J"),
		               new Beat(startTime + gap * 35, "S"),
		               new Beat(startTime + gap * 37, "D"),
		               new Beat(startTime + gap * 39, "K"),
		               new Beat(startTime + gap * 41, "S"),
		               new Beat(startTime + gap * 43, "J"),
		               new Beat(startTime + gap * 45, "K"),
		               new Beat(startTime + gap * 47, "J"),
		               new Beat(startTime + gap * 49, "L"),
		               new Beat(startTime + gap * 51, "F"),
		               new Beat(startTime + gap * 53, "Space"),
		               new Beat(startTime + gap * 55, "J"),
		               new Beat(startTime + gap * 57, "Space"),
		               new Beat(startTime + gap * 59, "F"),
		               new Beat(startTime + gap * 61, "K"),
		               new Beat(startTime + gap * 63, "S"),
		               new Beat(startTime + gap * 65, "D"),
		               new Beat(startTime + gap * 67, "K"),
		               new Beat(startTime + gap * 69, "D"),
		               new Beat(startTime + gap * 71, "L"),
		               new Beat(startTime + gap * 73, "J"),
		               new Beat(startTime + gap * 75, "S"),
		               new Beat(startTime + gap * 77, "D"),
		               new Beat(startTime + gap * 79, "K"),
		               new Beat(startTime + gap * 81, "S"),
		               new Beat(startTime + gap * 83, "L"),
		               new Beat(startTime + gap * 85, "K"),
		               new Beat(startTime + gap * 87, "J"),
		               new Beat(startTime + gap * 89, "F"),
		               new Beat(startTime + gap * 91, "F"),
		               new Beat(startTime + gap * 93, "Space"),
		               new Beat(startTime + gap * 95, "J"),
		               new Beat(startTime + gap * 97, "Space"),
		               new Beat(startTime + gap * 99, "F"),
		               new Beat(startTime + gap * 101, "S"),
		               new Beat(startTime + gap * 103, "D"),
		               new Beat(startTime + gap * 105, "S"),
		               new Beat(startTime + gap * 107, "D"),
		               new Beat(startTime + gap * 109, "L"),
		               new Beat(startTime + gap * 111, "D"),
		               new Beat(startTime + gap * 113, "L"),
		               new Beat(startTime + gap * 115, "D"),
		               new Beat(startTime + gap * 118, "J"),
		               new Beat(startTime + gap * 120, "L"),
		               new Beat(startTime + gap * 122, "J"),
		               new Beat(startTime + gap * 124, "K"),
		               new Beat(startTime + gap * 126, "J"),
		               new Beat(startTime + gap * 128, "Space"),
		               new Beat(startTime + gap * 130, "J"),
		               new Beat(startTime + gap * 131, "S"),
		               new Beat(startTime + gap * 133, "J"),
		               new Beat(startTime + gap * 135, "S"),
		               new Beat(startTime + gap * 137, "D"),
		               new Beat(startTime + gap * 139, "K"),
		               new Beat(startTime + gap * 141, "S"),
		               new Beat(startTime + gap * 143, "J"),
		               new Beat(startTime + gap * 145, "L"),
		               new Beat(startTime + gap * 147, "J"),
		               new Beat(startTime + gap * 149, "F"),
		               new Beat(startTime + gap * 151, "F"),
		               new Beat(startTime + gap * 153, "Space"),
		               new Beat(startTime + gap * 155, "J"),
		               new Beat(startTime + gap * 157, "Space"),
		               new Beat(startTime + gap * 159, "F"),
		               new Beat(startTime + gap * 161, "K"),
		               new Beat(startTime + gap * 163, "S"),
		               new Beat(startTime + gap * 165, "D"),
		               new Beat(startTime + gap * 167, "K"),
		               new Beat(startTime + gap * 169, "D"),
		               new Beat(startTime + gap * 171, "L"),
		               new Beat(startTime + gap * 173, "J"),
		               new Beat(startTime + gap * 175, "S"),
		               new Beat(startTime + gap * 177, "D"),
		               new Beat(startTime + gap * 179, "K"),
		               new Beat(startTime + gap * 181, "S"),
		               new Beat(startTime + gap * 183, "J"),
		               new Beat(startTime + gap * 185, "K"),
		               new Beat(startTime + gap * 187, "L"),
		               new Beat(startTime + gap * 189, "F"),
		               new Beat(startTime + gap * 191, "F"),
		               new Beat(startTime + gap * 193, "Space"),
		               new Beat(startTime + gap * 195, "L"),
		               new Beat(startTime + gap * 197, "Space"),
		               new Beat(startTime + gap * 199, "F"),
					
			};
		}
		else if(titleName.contentEquals("Joakim Karud - Wild Flower")) {
			int startTime = 1000;
			int gap = 125;
			beats = new Beat[] {
					  new Beat(startTime + gap * 1, "S"),
		               new Beat(startTime + gap * 3, "D"),
		               new Beat(startTime + gap * 5, "S"),
		               new Beat(startTime + gap * 7, "D"),
		               new Beat(startTime + gap * 9, "S"),
		               new Beat(startTime + gap * 11, "D"),
		               new Beat(startTime + gap * 13, "S"),
		               new Beat(startTime + gap * 15, "D"),
		               new Beat(startTime + gap * 18, "J"),
		               new Beat(startTime + gap * 20, "K"),
		               new Beat(startTime + gap * 22, "J"),
		               new Beat(startTime + gap * 24, "K"),
		               new Beat(startTime + gap * 26, "J"),
		               new Beat(startTime + gap * 28, "Space"),
		               new Beat(startTime + gap * 30, "J"),
		               new Beat(startTime + gap * 31, "S"),
		               new Beat(startTime + gap * 33, "J"),
		               new Beat(startTime + gap * 35, "S"),
		               new Beat(startTime + gap * 37, "D"),
		               new Beat(startTime + gap * 39, "K"),
		               new Beat(startTime + gap * 41, "S"),
		               new Beat(startTime + gap * 43, "J"),
		               new Beat(startTime + gap * 45, "K"),
		               new Beat(startTime + gap * 47, "J"),
		               new Beat(startTime + gap * 49, "L"),
		               new Beat(startTime + gap * 51, "F"),
		               new Beat(startTime + gap * 53, "Space"),
		               new Beat(startTime + gap * 55, "J"),
		               new Beat(startTime + gap * 57, "Space"),
		               new Beat(startTime + gap * 59, "F"),
		               new Beat(startTime + gap * 61, "K"),
		               new Beat(startTime + gap * 63, "S"),
		               new Beat(startTime + gap * 65, "D"),
		               new Beat(startTime + gap * 67, "K"),
		               new Beat(startTime + gap * 69, "D"),
		               new Beat(startTime + gap * 71, "L"),
		               new Beat(startTime + gap * 73, "J"),
		               new Beat(startTime + gap * 75, "S"),
		               new Beat(startTime + gap * 77, "D"),
		               new Beat(startTime + gap * 79, "K"),
		               new Beat(startTime + gap * 81, "S"),
		               new Beat(startTime + gap * 83, "L"),
		               new Beat(startTime + gap * 85, "K"),
		               new Beat(startTime + gap * 87, "J"),
		               new Beat(startTime + gap * 89, "F"),
		               new Beat(startTime + gap * 91, "F"),
		               new Beat(startTime + gap * 93, "Space"),
		               new Beat(startTime + gap * 95, "J"),
		               new Beat(startTime + gap * 97, "Space"),
		               new Beat(startTime + gap * 99, "F"),
		               new Beat(startTime + gap * 101, "S"),
		               new Beat(startTime + gap * 103, "D"),
		               new Beat(startTime + gap * 105, "S"),
		               new Beat(startTime + gap * 107, "D"),
		               new Beat(startTime + gap * 109, "L"),
		               new Beat(startTime + gap * 111, "D"),
		               new Beat(startTime + gap * 113, "L"),
		               new Beat(startTime + gap * 115, "D"),
		               new Beat(startTime + gap * 118, "J"),
		               new Beat(startTime + gap * 120, "L"),
		               new Beat(startTime + gap * 122, "J"),
		               new Beat(startTime + gap * 124, "K"),
		               new Beat(startTime + gap * 126, "J"),
		               new Beat(startTime + gap * 128, "Space"),
		               new Beat(startTime + gap * 130, "J"),
		               new Beat(startTime + gap * 131, "S"),
		               new Beat(startTime + gap * 133, "J"),
		               new Beat(startTime + gap * 135, "S"),
		               new Beat(startTime + gap * 137, "D"),
		               new Beat(startTime + gap * 139, "K"),
		               new Beat(startTime + gap * 141, "S"),
		               new Beat(startTime + gap * 143, "J"),
		               new Beat(startTime + gap * 145, "L"),
		               new Beat(startTime + gap * 147, "J"),
		               new Beat(startTime + gap * 149, "F"),
		               new Beat(startTime + gap * 151, "F"),
		               new Beat(startTime + gap * 153, "Space"),
		               new Beat(startTime + gap * 155, "J"),
		               new Beat(startTime + gap * 157, "Space"),
		               new Beat(startTime + gap * 159, "F"),
		               new Beat(startTime + gap * 161, "K"),
		               new Beat(startTime + gap * 163, "S"),
		               new Beat(startTime + gap * 165, "D"),
		               new Beat(startTime + gap * 167, "K"),
		               new Beat(startTime + gap * 169, "D"),
		               new Beat(startTime + gap * 171, "L"),
		               new Beat(startTime + gap * 173, "J"),
		               new Beat(startTime + gap * 175, "S"),
		               new Beat(startTime + gap * 177, "D"),
		               new Beat(startTime + gap * 179, "K"),
		               new Beat(startTime + gap * 181, "S"),
		               new Beat(startTime + gap * 183, "J"),
		               new Beat(startTime + gap * 185, "K"),
		               new Beat(startTime + gap * 187, "L"),
		               new Beat(startTime + gap * 189, "F"),
		               new Beat(startTime + gap * 191, "F"),
		               new Beat(startTime + gap * 193, "Space"),
		               new Beat(startTime + gap * 195, "L"),
		               new Beat(startTime + gap * 197, "Space"),
		               new Beat(startTime + gap * 199, "F"),
					
			};
			
		}
		else if(titleName.contentEquals("Bendsound - Energy")) {
			int startTime = 4460 - Home.REACH_TIME * 1000;
			int gap = 125;
			beats = new Beat[] {
					  new Beat(startTime + gap * 1, "S"),
		               new Beat(startTime + gap * 3, "D"),
		               new Beat(startTime + gap * 5, "S"),
		               new Beat(startTime + gap * 7, "D"),
		               new Beat(startTime + gap * 9, "S"),
		               new Beat(startTime + gap * 11, "D"),
		               new Beat(startTime + gap * 13, "S"),
		               new Beat(startTime + gap * 15, "D"),
		               new Beat(startTime + gap * 18, "J"),
		               new Beat(startTime + gap * 20, "K"),
		               new Beat(startTime + gap * 22, "J"),
		               new Beat(startTime + gap * 24, "K"),
		               new Beat(startTime + gap * 26, "J"),
		               new Beat(startTime + gap * 28, "Space"),
		               new Beat(startTime + gap * 30, "J"),
		               new Beat(startTime + gap * 31, "S"),
		               new Beat(startTime + gap * 33, "J"),
		               new Beat(startTime + gap * 35, "S"),
		               new Beat(startTime + gap * 37, "D"),
		               new Beat(startTime + gap * 39, "K"),
		               new Beat(startTime + gap * 41, "S"),
		               new Beat(startTime + gap * 43, "J"),
		               new Beat(startTime + gap * 45, "K"),
		               new Beat(startTime + gap * 47, "J"),
		               new Beat(startTime + gap * 49, "L"),
		               new Beat(startTime + gap * 51, "F"),
		               new Beat(startTime + gap * 53, "Space"),
		               new Beat(startTime + gap * 55, "J"),
		               new Beat(startTime + gap * 57, "Space"),
		               new Beat(startTime + gap * 59, "F"),
		               new Beat(startTime + gap * 61, "K"),
		               new Beat(startTime + gap * 63, "S"),
		               new Beat(startTime + gap * 65, "D"),
		               new Beat(startTime + gap * 67, "K"),
		               new Beat(startTime + gap * 69, "D"),
		               new Beat(startTime + gap * 71, "L"),
		               new Beat(startTime + gap * 73, "J"),
		               new Beat(startTime + gap * 75, "S"),
		               new Beat(startTime + gap * 77, "D"),
		               new Beat(startTime + gap * 79, "K"),
		               new Beat(startTime + gap * 81, "S"),
		               new Beat(startTime + gap * 83, "L"),
		               new Beat(startTime + gap * 85, "K"),
		               new Beat(startTime + gap * 87, "J"),
		               new Beat(startTime + gap * 89, "F"),
		               new Beat(startTime + gap * 91, "F"),
		               new Beat(startTime + gap * 93, "Space"),
		               new Beat(startTime + gap * 95, "J"),
		               new Beat(startTime + gap * 97, "Space"),
		               new Beat(startTime + gap * 99, "F"),
		               new Beat(startTime + gap * 101, "S"),
		               new Beat(startTime + gap * 103, "D"),
		               new Beat(startTime + gap * 105, "S"),
		               new Beat(startTime + gap * 107, "D"),
		               new Beat(startTime + gap * 109, "L"),
		               new Beat(startTime + gap * 111, "D"),
		               new Beat(startTime + gap * 113, "L"),
		               new Beat(startTime + gap * 115, "D"),
		               new Beat(startTime + gap * 118, "J"),
		               new Beat(startTime + gap * 120, "L"),
		               new Beat(startTime + gap * 122, "J"),
		               new Beat(startTime + gap * 124, "K"),
		               new Beat(startTime + gap * 126, "J"),
		               new Beat(startTime + gap * 128, "Space"),
		               new Beat(startTime + gap * 130, "J"),
		               new Beat(startTime + gap * 131, "S"),
		               new Beat(startTime + gap * 133, "J"),
		               new Beat(startTime + gap * 135, "S"),
		               new Beat(startTime + gap * 137, "D"),
		               new Beat(startTime + gap * 139, "K"),
		               new Beat(startTime + gap * 141, "S"),
		               new Beat(startTime + gap * 143, "J"),
		               new Beat(startTime + gap * 145, "L"),
		               new Beat(startTime + gap * 147, "J"),
		               new Beat(startTime + gap * 149, "F"),
		               new Beat(startTime + gap * 151, "F"),
		               new Beat(startTime + gap * 153, "Space"),
		               new Beat(startTime + gap * 155, "J"),
		               new Beat(startTime + gap * 157, "Space"),
		               new Beat(startTime + gap * 159, "F"),
		               new Beat(startTime + gap * 161, "K"),
		               new Beat(startTime + gap * 163, "S"),
		               new Beat(startTime + gap * 165, "D"),
		               new Beat(startTime + gap * 167, "K"),
		               new Beat(startTime + gap * 169, "D"),
		               new Beat(startTime + gap * 171, "L"),
		               new Beat(startTime + gap * 173, "J"),
		               new Beat(startTime + gap * 175, "S"),
		               new Beat(startTime + gap * 177, "D"),
		               new Beat(startTime + gap * 179, "K"),
		               new Beat(startTime + gap * 181, "S"),
		               new Beat(startTime + gap * 183, "J"),
		               new Beat(startTime + gap * 185, "K"),
		               new Beat(startTime + gap * 187, "L"),
		               new Beat(startTime + gap * 189, "F"),
		               new Beat(startTime + gap * 191, "F"),
		               new Beat(startTime + gap * 193, "Space"),
		               new Beat(startTime + gap * 195, "L"),
		               new Beat(startTime + gap * 197, "Space"),
		               new Beat(startTime + gap * 199, "F"),
			};
		
		};
		int i = 0;
		gameMusic.start();
		while(true) {
			if(beats[i].getTime() <= gameMusic.getTime()) {
				Note note = new Note(beats[i].getNoteName()) ;
				note.start();
				noteList.add(note);
				i++;
			}//해당음악에 맞게 노트를 떨어트리는 
		}
	}

public void judge(String input) {
	for(int i = 0; i< noteList.size(); i++) {
		Note note = noteList.get(i);
		if(input.equals(note.getNoteType())) {
			judgeEvent(note.judge());
			break;
		}
	}
}

public void judgeEvent(String judge)
{

	if(judge.equals("Miss")) {
		judgeImage = new ImageIcon(Home.class.getResource("../images/judgeMiss.png")).getImage();
	}
	else if(judge.equals("Good")) {
		judgeImage = new ImageIcon(Home.class.getResource("../images/judgeGood.png")).getImage();
	}
	else if(judge.equals("Great")) {
		judgeImage = new ImageIcon(Home.class.getResource("../images/judgeGreat.png")).getImage();
	}
	else if(judge.equals("Perfect")) {
		judgeImage = new ImageIcon(Home.class.getResource("../images/judgePerfect.png")).getImage();
	}
}
}
