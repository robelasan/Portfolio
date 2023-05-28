package portfolio;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Main extends JFrame {

	private JPanel contentPane;

	private HomePanel homePanel;
	private AboutPanel aboutPanel;
	private PortfolioPanel portfolioPanel;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 700);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 10));
		contentPane.setBackground(new Color(236, 236, 236));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		homePanel = new HomePanel();
		aboutPanel = new AboutPanel();
		portfolioPanel = new PortfolioPanel();
		
		JPanel socialsIconPanel = new JPanel();
		socialsIconPanel.setBackground(new Color(236, 236, 236));
		socialsIconPanel.setBounds(40, 260, 40, 200);
		contentPane.add(socialsIconPanel);
		socialsIconPanel.setLayout(null);
		
		JLabel fbIcon = new JLabel("");
		fbIcon.setBounds(0, 0, 40, 40);
		socialsIconPanel.add(fbIcon);
		fbIcon.setHorizontalAlignment(SwingConstants.CENTER);
		fbIcon.setIcon(new ImageIcon(Main.class.getResource("/portfolio/images/facebook (2).png")));
		
		JLabel igIcon = new JLabel("");
		igIcon.setBounds(0, 42, 40, 40);
		socialsIconPanel.add(igIcon);
		igIcon.setHorizontalAlignment(SwingConstants.CENTER);
		igIcon.setIcon(new ImageIcon(Main.class.getResource("/portfolio/images/instagram (2).png")));
		
		JLabel twitterIcon = new JLabel("");
		twitterIcon.setBounds(0, 80, 40, 40);
		socialsIconPanel.add(twitterIcon);
		twitterIcon.setHorizontalAlignment(SwingConstants.CENTER);
		twitterIcon.setIcon(new ImageIcon(Main.class.getResource("/portfolio/images/twitter (1).png")));
		
		JLabel tiktokIcon = new JLabel("");
		tiktokIcon.setBounds(0, 120, 40, 40);
		socialsIconPanel.add(tiktokIcon);
		tiktokIcon.setHorizontalAlignment(SwingConstants.CENTER);
		tiktokIcon.setIcon(new ImageIcon(Main.class.getResource("/portfolio/images/tiktok (1).png")));
		
		JLabel gmailIcon = new JLabel("");
		gmailIcon.setHorizontalAlignment(SwingConstants.CENTER);
		gmailIcon.setIcon(new ImageIcon(Main.class.getResource("/portfolio/images/email.png")));
		gmailIcon.setBounds(0, 160, 40, 40);
		socialsIconPanel.add(gmailIcon);

		
		JPanel fbPanel = new JPanel();
		fbPanel.setBackground(new Color(236, 236, 236));
		fbPanel.setBounds(80, 260, 80, 40);
		contentPane.add(fbPanel);
		fbPanel.setLayout(null);
		
		JLabel fbLbl = new JLabel("Robe Lasan");
		fbIcon.addMouseListener(new IconMouseAdapter(fbLbl));
		fbLbl.setFont(new Font("Yu Gothic UI Light", Font.ITALIC, 12));
		fbLbl.setBounds(0, 10, 80, 20);
		fbPanel.add(fbLbl);
		
		JPanel igPanel = new JPanel();
		igPanel.setLayout(null);
		igPanel.setBackground(new Color(236, 236, 236));
		igPanel.setBounds(80, 300, 80, 40);
		contentPane.add(igPanel);
		
		JLabel igLbl = new JLabel("@jhnrbrtlsn");
		igIcon.addMouseListener(new IconMouseAdapter(igLbl));
		igLbl.setFont(new Font("Yu Gothic UI Light", Font.ITALIC, 12));
		igLbl.setBounds(0, 10, 80, 20);
		igPanel.add(igLbl);
		
		JPanel twitterPanel = new JPanel();
		twitterPanel.setLayout(null);
		twitterPanel.setBackground(new Color(236, 236, 236));
		twitterPanel.setBounds(80, 340, 80, 40);
		contentPane.add(twitterPanel);
		
		JLabel twitterLbl = new JLabel("@robelasan07");
		twitterIcon.addMouseListener(new IconMouseAdapter(twitterLbl));
		twitterLbl.setFont(new Font("Yu Gothic UI Light", Font.ITALIC, 12));
		twitterLbl.setBounds(0, 10, 80, 20);
		twitterPanel.add(twitterLbl);
		
		JPanel tiktokPanel = new JPanel();
		tiktokPanel.setLayout(null);
		tiktokPanel.setBackground(new Color(236, 236, 236));
		tiktokPanel.setBounds(80, 380, 80, 40);
		contentPane.add(tiktokPanel);
		
		JLabel tiktokLbl = new JLabel("@robelasan");
		tiktokIcon.addMouseListener(new IconMouseAdapter(tiktokLbl));
		tiktokLbl.setFont(new Font("Yu Gothic UI Light", Font.ITALIC, 12));
		tiktokLbl.setBounds(0, 10, 80, 20);
		tiktokPanel.add(tiktokLbl);
		
		JPanel gmailPanel = new JPanel();
		gmailPanel.setLayout(null);
		gmailPanel.setBackground(new Color(236, 236, 236));
		gmailPanel.setBounds(80, 420, 140, 40);
		contentPane.add(gmailPanel);
		
		JLabel gmailLbl = new JLabel("robelasan07@gmail.com");
		gmailIcon.addMouseListener(new IconMouseAdapter(gmailLbl));
		gmailLbl.setFont(new Font("Yu Gothic UI Light", Font.ITALIC, 12));
		gmailLbl.setBounds(0, 10, 130, 20);
		gmailPanel.add(gmailLbl);
		
		JLabel photo = new JLabel("");
		photo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				photo.setBounds(730, 125, 443, 587);
			}
			
			public void mouseExited(MouseEvent e) {
				photo.setBounds(730, 145, 433, 577);
			}
		});
		photo.setBounds(730, 145, 433, 577);
		contentPane.add(photo);
		photo.setIcon(new ImageIcon(Main.class.getResource("/portfolio/images/IMG_0121-removebg-preview.png")));
		setLocationRelativeTo(null);
		
		JLabel watercolor = new JLabel("");
		watercolor.setIcon(new ImageIcon(Main.class.getResource("/portfolio/images/watercolor background (2).png")));
		watercolor.setBounds(-350, -94, 720, 336);
		contentPane.add(watercolor);
		
		JLabel cornerDesgin = new JLabel("");
		cornerDesgin.setIcon(new ImageIcon(Main.class.getResource("/portfolio/images/Rasd (1).png")));
		cornerDesgin.setBackground(new Color(236, 236, 236));
		cornerDesgin.setBounds(950, 5, 250, 225);
		contentPane.add(cornerDesgin);
		
		JLabel blueWatercolor = new JLabel("");
		blueWatercolor.setIcon(new ImageIcon(Main.class.getResource("/portfolio/images/blue watercolor.png")));
		blueWatercolor.setBounds(-120, 480, 710, 336);
		contentPane.add(blueWatercolor);
		
		JLabel yellowWatercolor = new JLabel("");
		yellowWatercolor.setIcon(new ImageIcon(Main.class.getResource("/portfolio/images/yellowSplatter (1).png")));
		yellowWatercolor.setBounds(721, 265, 500, 500);
		contentPane.add(yellowWatercolor);
		
		JPanel mainPageTextPanel = new JPanel();
		mainPageTextPanel.setForeground(new Color(236, 236, 236));
		mainPageTextPanel.setLayout(null);
		mainPageTextPanel.setBorder(null);
		mainPageTextPanel.setBackground(new Color(236, 236, 236));
		mainPageTextPanel.setAutoscrolls(true);
		mainPageTextPanel.setBounds(160, 170, 665, 350);
		contentPane.add(mainPageTextPanel);
		
		JLabel helloWorld = new JLabel("( \"H e l l o,  w o r l d\" );");
		helloWorld.setVerticalAlignment(SwingConstants.TOP);
		helloWorld.setForeground(new Color(0, 0, 0));
		helloWorld.setFont(new Font("Yu Gothic UI Light", Font.ITALIC, 14));
		helloWorld.setBounds(10, 20, 150, 20);
		mainPageTextPanel.add(helloWorld);
		
		JLabel NameLbl = new JLabel("ROBE");
		NameLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				NameLbl.setForeground(new Color (0, 0, 0));
			}
			public void mouseExited(MouseEvent e) {
				NameLbl.setForeground(new Color(50, 50, 50));
			}
		});
		NameLbl.setForeground(new Color(50, 50, 50));
		NameLbl.setFont(new Font("Verdana", Font.BOLD, 40));
		NameLbl.setBounds(140, 50, 160, 40);
		mainPageTextPanel.add(NameLbl);
		
		JLabel imLbl = new JLabel("I am");
		imLbl.setVerticalAlignment(SwingConstants.BOTTOM);
		imLbl.setHorizontalAlignment(SwingConstants.CENTER);
		imLbl.setForeground(new Color(0, 0, 0));
		imLbl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		imLbl.setBounds(100, 55, 30, 35);
		mainPageTextPanel.add(imLbl);
		
		JLabel yearCourseLbl = new JLabel("1 S T   Y E A R   B S I T - M W A   S T U D E N T   O F");
		yearCourseLbl.setForeground(new Color(0, 0, 0));
		yearCourseLbl.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 22));
		yearCourseLbl.setBounds(60, 100, 520, 35);
		mainPageTextPanel.add(yearCourseLbl);
		
		JLabel nationalLbl = new JLabel("NATIONAL");
		nationalLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				nationalLbl.setBounds(5, 145, 500, 70);
			}
			public void mouseExited(MouseEvent e) {
				nationalLbl.setBounds(10, 140, 500, 70);
			}
		});
		nationalLbl.setForeground(new Color(44, 26, 210));
		nationalLbl.setFont(new Font("Arial Black", Font.PLAIN, 80));
		nationalLbl.setBounds(10, 140, 500, 70);
		mainPageTextPanel.add(nationalLbl);
		
		JLabel nationalShadowLbl = new JLabel("NATIONAL");
		nationalShadowLbl.setForeground(new Color(0, 2, 34));
		nationalShadowLbl.setFont(new Font("Arial Black", Font.PLAIN, 80));
		nationalShadowLbl.setBounds(0, 150, 500, 70);
		mainPageTextPanel.add(nationalShadowLbl);
		
		JLabel universityLbl = new JLabel("UNIVERSITY");
		universityLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				universityLbl.setBounds(75, 225, 555, 70);
			}
			public void mouseExited(MouseEvent e) {
				universityLbl.setBounds(80, 220, 555, 70);
			}
		});
		universityLbl.setForeground(new Color(218, 207, 1));
		universityLbl.setFont(new Font("Arial Black", Font.PLAIN, 80));
		universityLbl.setBounds(80, 220, 555, 70);
		mainPageTextPanel.add(universityLbl);
		
		JLabel universityShadowLbl = new JLabel("UNIVERSITY");
		universityShadowLbl.setForeground(new Color(85, 81, 0));
		universityShadowLbl.setFont(new Font("Arial Black", Font.PLAIN, 80));
		universityShadowLbl.setBounds(70, 230, 555, 70);
		mainPageTextPanel.add(universityShadowLbl);
				
		JPanel tabsPanel = new JPanel();
		tabsPanel.setBackground(new Color(236, 236, 236));
		tabsPanel.setBounds(450, 0, 320, 80);
		contentPane.add(tabsPanel);
		tabsPanel.setLayout(null);
		
		JPanel homeTabPanel = new JPanel();
		homeTabPanel.setBackground(new Color(236, 236, 236));
		homeTabPanel.setBounds(10, 20, 100, 30);
		tabsPanel.add(homeTabPanel);
		homeTabPanel.setLayout(null);
		
		JLabel homeTabLbl = new JLabel("HOME");
		homeTabPanel.addMouseListener(new TabButtonMouseAdapter(homeTabPanel,homeTabLbl) {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainPageTextPanel.setVisible(true);
				socialsIconPanel.setVisible(true);
				photo.setVisible(true);
				blueWatercolor.setVisible(true);
				yellowWatercolor.setVisible(true);
				fbPanel.setVisible(true);
				igPanel.setVisible(true);
				twitterPanel.setVisible(true);
				tiktokPanel.setVisible(true);
				gmailPanel.setVisible(true);
				menuClicked(homePanel);
			}
		});
		homeTabLbl.setBounds(20, 0, 60, 30);
		homeTabPanel.add(homeTabLbl);
		homeTabLbl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 10));
		homeTabLbl.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel aboutTabPanel = new JPanel();
		aboutTabPanel.setBackground(new Color(236, 236, 236));
		aboutTabPanel.setBounds(110, 20, 100, 30);
		tabsPanel.add(aboutTabPanel);
		aboutTabPanel.setLayout(null);
		
		JLabel aboutTabLbl = new JLabel("ABOUT");
		aboutTabPanel.addMouseListener(new TabButtonMouseAdapter(aboutTabPanel,aboutTabLbl) {
				@Override
				public void mouseClicked(MouseEvent e) {
					mainPageTextPanel.setVisible(false);
					socialsIconPanel.setVisible(false);
					photo.setVisible(false);
					blueWatercolor.setVisible(false);
					yellowWatercolor.setVisible(false);
					fbPanel.setVisible(false);
					igPanel.setVisible(false);
					twitterPanel.setVisible(false);
					tiktokPanel.setVisible(false);
					gmailPanel.setVisible(false);
					menuClicked(aboutPanel);
			}
		});
		aboutTabLbl.setBounds(20, 0, 60, 30);
		aboutTabPanel.add(aboutTabLbl);
		aboutTabLbl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 10));
		aboutTabLbl.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel portfolioTabPanel = new JPanel();
		portfolioTabPanel.setBackground(new Color(236, 236, 236));
		portfolioTabPanel.setBounds(210, 20, 100, 30);
		tabsPanel.add(portfolioTabPanel);
		portfolioTabPanel.setLayout(null);
		
		JLabel portfolioTabLbl = new JLabel("WORKS");
		portfolioTabPanel.addMouseListener(new TabButtonMouseAdapter(portfolioTabPanel,portfolioTabLbl) {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainPageTextPanel.setVisible(false);
				socialsIconPanel.setVisible(false);
				photo.setVisible(false);
				blueWatercolor.setVisible(false);
				yellowWatercolor.setVisible(false);
				fbPanel.setVisible(false);
				igPanel.setVisible(false);
				twitterPanel.setVisible(false);
				tiktokPanel.setVisible(false);
				gmailPanel.setVisible(false);
				menuClicked(portfolioPanel);			
				}
		});
		portfolioTabLbl.setBounds(20, 0, 60, 30);
		portfolioTabPanel.add(portfolioTabLbl);
		portfolioTabLbl.setHorizontalAlignment(SwingConstants.CENTER);
		portfolioTabLbl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 10));
		
		JPanel exitPanel = new JPanel();
		exitPanel.setBackground(new Color(236, 236, 236));
		exitPanel.setBounds(1160, 0, 40, 40);
		contentPane.add(exitPanel);
		exitPanel.setLayout(null);
		
		JLabel exitLbl = new JLabel("X");
		exitLbl.setBounds(10, 10, 20, 20);
		exitPanel.add(exitLbl);
		exitLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Main.this.dispose();
			}
			public void mouseEntered(MouseEvent e) {
				exitLbl.setForeground(new Color (0, 0, 0));
				exitPanel.setBackground(new Color(200, 200, 200));
			}
			public void mouseExited(MouseEvent e) {
				exitLbl.setForeground(new Color (40, 40, 40));
				exitPanel.setBackground(new Color(236, 236, 236));
			}
			
		});
		exitLbl.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		exitLbl.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(new Color(236, 236, 236));
		mainPanel.setBounds(0, 60, 1200, 640);
		contentPane.add(mainPanel);
		mainPanel.setLayout(null);
		
		//mainPanel.add(homePanel);
		mainPanel.add(aboutPanel);
		mainPanel.add(portfolioPanel);
		
		menuClicked(homePanel);
			
		}
	
	public void menuClicked(JPanel panel) {

		homePanel.setVisible(false);
		aboutPanel.setVisible(false);
		portfolioPanel.setVisible(false);
		
		panel.setVisible(true);
		
	}
	
	private class TabButtonMouseAdapter extends MouseAdapter {
		
		JPanel panel;
		JLabel label;
		public TabButtonMouseAdapter(JPanel panel, JLabel label) {
			this.panel = panel;
			this.label = label;
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			panel.setBackground(new Color(44, 26, 210));
			label.setForeground(Color.WHITE);
			label.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 10));
		}
		public void mousePressed(MouseEvent e) {
			panel.setBackground(new Color(218, 207, 1));
			label.setForeground(Color.BLACK);
			label.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 10));
		}
		public void mouseExited(MouseEvent e) {
			panel.setBackground(new Color(236, 236, 236));
			panel.setBorder(null);
			label.setForeground(Color.BLACK);
			label.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 10));
		}
		public void mouseReleased(MouseEvent e) {
			panel.setBackground(new Color(44, 26, 210));
			label.setForeground(Color.WHITE);
			label.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 10));
		}
		
	}
	
	private class IconMouseAdapter extends MouseAdapter {
		
		JLabel label;
		public IconMouseAdapter(JLabel label) {
			this.label = label;
			label.setVisible(false);
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			label.setVisible(true);
		}
		public void mouseExited(MouseEvent e) {
			label.setVisible(false);
		}
	}
}
