package test;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class MB_jamjali extends JFrame {
	
	private Image screenImage;
	private Graphics screenGrapics;
	private Image introBackground;
    JScrollPane scrollPane;
    ImageIcon icon;
    
	public MB_jamjali() {
		
		icon = new ImageIcon("C:\\Users\\96090\\eclipse-workspace\\TestProject\\src\\images\\���ڸ�.gif");

        //��� Panel ������ �������������� ����      
        JPanel panel = new JPanel() {
            public void paintComponent(Graphics g) {
                // Approach 1: Dispaly image at at full size
                g.drawImage(icon.getImage(), 0, 0, null);
                // Approach 2: Scale image to size of component
                // Dimension d = getSize();
                // g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                // Approach 3: Fix the image position in the scroll pane
                // Point p = scrollPane.getViewport().getViewPosition();
                // g.drawImage(icon.getImage(), p.x, p.y, null);
                setOpaque(false); //�׸��� ǥ���ϰ� ����,�����ϰ� ����
                super.paintComponent(g);
            }
        };
    	panel.setBounds(12, 10, 679, 587);
    	getContentPane().add(panel);
		getContentPane().setLayout(null);
	

	
	
	JButton btnDispose = new JButton("�ݱ�");
	btnDispose.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) 	{
			dispose();
			}
		});
	btnDispose.setBounds(594, 623, 97, 23);
	getContentPane().add(btnDispose);
	

	
	setSize(736, 695);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLocationRelativeTo(null);//������ ��ũ�� �߾�
	setResizable(false);//������ ��ũ�� ũ�� ���� �Ұ���
	setTitle("�μ�¯");
	setVisible(true);
	}
}

