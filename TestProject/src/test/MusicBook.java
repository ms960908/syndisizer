package test;

import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MusicBook extends JFrame {
	public MusicBook() {
		getContentPane().setLayout(null);
		
		
		JButton btnDispose = new JButton("닫기");
		btnDispose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 	{
				dispose();
				}
			});
		btnDispose.setBounds(349, 403, 97, 23);
		getContentPane().add(btnDispose);
		
		JButton pongdang = new JButton("퐁당퐁당");
		pongdang.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				MB_pongdangpongdang f3= new MB_pongdangpongdang();
			
			}
		});
		pongdang.setBounds(81, 62, 119, 35);
		getContentPane().add(pongdang);
		
		JButton jamjali = new JButton("잠자리");
		jamjali.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				MB_jamjali f7= new MB_jamjali();
			
			}
		});
		jamjali.setBounds(268, 61, 119, 36);
		getContentPane().add(jamjali);
		
		JButton star = new JButton("\uC791\uC740\uBCC4");
		star.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				MB_star f7= new MB_star();
			
			}
		});
		star.setBounds(81, 130, 119, 37);
		getContentPane().add(star);
		
		JButton airplane = new JButton("\uBE44\uD589\uAE30");
		airplane.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				MB_airplane f7= new MB_airplane();
			
			}
		});
		airplane.setBounds(268, 131, 119, 35);
		getContentPane().add(airplane);
		
		JButton same = new JButton("\uB611\uAC19\uC544\uC694");
		same.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				MB_same f7= new MB_same();
			
			}
		});
		same.setBounds(81, 202, 119, 35);
		getContentPane().add(same);
		
		JButton stop = new JButton("\uADF8\uB300\uB85C\uBA48\uCDB0\uB77C");
		stop.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				MB_stop f7= new MB_stop();
			
			}
		});
		stop.setBounds(268, 202, 119, 35);
		getContentPane().add(stop);
		
		JButton snow = new JButton("\uB208");
		snow.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				MB_snow f7= new MB_snow();
			
			}
		});
		snow.setBounds(81, 281, 119, 35);
		getContentPane().add(snow);
		
		JButton elephant = new JButton("\uCF54\uB07C\uB9AC");
		elephant.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				MB_elephant f7= new MB_elephant();
			
			}
		});
		elephant.setBounds(268, 281, 119, 35);
		getContentPane().add(elephant);
		
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);//프레임 스크린 중앙
		setResizable(false);//프레임 스크린 크기 변경 불가능
		setTitle("민수짱");
		setVisible(true);
	}
	
}
