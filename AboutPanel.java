package portfolio;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JMenuBar;
import java.awt.ScrollPane;
import java.awt.Panel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.JTextArea;

public class AboutPanel extends JPanel {
	
	private JPanel informationPanel;
	private JPanel skillsPanel;
	private JPanel achievePanel;
	private JPanel hobbiesPanel;
	private JPanel itPanel;
	
	public AboutPanel() {

		setBounds(0, 0, 1200, 640);
		setBackground(new Color(236, 236, 236));
		setLayout(null);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(new Color(236, 236, 236));
		mainPanel.setBounds(0, 0, 1200, 640);
		add(mainPanel);
		mainPanel.setLayout(null);
		
		JPanel sidePanel = new JPanel();
		sidePanel.setBackground(new Color(220, 220, 220));
		sidePanel.setBounds(10, 75, 350, 555);
		mainPanel.add(sidePanel);
		sidePanel.setLayout(null);
		
		JPanel personalPanel = new JPanel();
		personalPanel.setBackground(new Color(220, 220, 220));
		personalPanel.setBounds(10, 220, 330, 50);
		sidePanel.add(personalPanel);
		personalPanel.setLayout(null);
		
		JLabel personalLbl = new JLabel("Personal Information");
		personalLbl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 20));
		personalLbl.setHorizontalAlignment(SwingConstants.CENTER);
		personalLbl.setBounds(10, 10, 310, 30);
		personalPanel.add(personalLbl);
		
		JPanel strengthPanel = new JPanel();
		strengthPanel.setLayout(null);
		strengthPanel.setBackground(new Color(220, 220, 220));
		strengthPanel.setBounds(10, 280, 330, 50);
		sidePanel.add(strengthPanel);
		
		JLabel skillsLbl = new JLabel("Strength and Weaknesses");
		skillsLbl.setHorizontalAlignment(SwingConstants.CENTER);
		skillsLbl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 20));
		skillsLbl.setBounds(10, 10, 310, 30);
		strengthPanel.add(skillsLbl);
		
		JPanel achievementsPanel = new JPanel();
		achievementsPanel.setLayout(null);
		achievementsPanel.setBackground(new Color(220, 220, 220));
		achievementsPanel.setBounds(10, 340, 330, 50);
		sidePanel.add(achievementsPanel);
		
		JLabel achievementsLbl = new JLabel("Achievements");
		achievementsLbl.setHorizontalAlignment(SwingConstants.CENTER);
		achievementsLbl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 20));
		achievementsLbl.setBounds(10, 10, 310, 30);
		achievementsPanel.add(achievementsLbl);
		
		JPanel talentsPanel = new JPanel();
		talentsPanel.setLayout(null);
		talentsPanel.setBackground(new Color(220, 220, 220));
		talentsPanel.setBounds(10, 400, 330, 50);
		sidePanel.add(talentsPanel);
		
		JLabel talentsLbl = new JLabel("Talents and Hobbies");
		talentsLbl.setHorizontalAlignment(SwingConstants.CENTER);
		talentsLbl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 20));
		talentsLbl.setBounds(10, 10, 310, 30);
		talentsPanel.add(talentsLbl);
		
		JPanel whyITPanel = new JPanel();
		whyITPanel.setLayout(null);
		whyITPanel.setBackground(new Color(220, 220, 220));
		whyITPanel.setBounds(10, 460, 330, 50);
		sidePanel.add(whyITPanel);
		
		JLabel whyITLbl = new JLabel("Why I chose IT");
		whyITLbl.setHorizontalAlignment(SwingConstants.CENTER);
		whyITLbl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 20));
		whyITLbl.setBounds(10, 10, 310, 30);
		whyITPanel.add(whyITLbl);
		
		JLabel photo = new JLabel("");
		photo.setBackground(new Color(220, 220, 220));
		photo.setIcon(new ImageIcon(AboutPanel.class.getResource("/portfolio/images/346127510_252377387465925_2326692292738106622_n__1_-removebg-preview.png")));
		photo.setHorizontalAlignment(SwingConstants.CENTER);
		photo.setBounds(75, 10, 200, 200);
		sidePanel.add(photo);
		
		JPanel displayPanel = new JPanel();
		displayPanel.setBackground(new Color(220, 220, 220));
		displayPanel.setBounds(370, 75, 820, 555);
		mainPanel.add(displayPanel);
		displayPanel.setLayout(null);
		
		informationPanel = new JPanel();
		personalPanel.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(informationPanel);
			}
		});
		informationPanel.setBackground(new Color(220, 220, 220));
		informationPanel.setBounds(0, 0, 820, 555);
		displayPanel.add(informationPanel);
		informationPanel.setLayout(null);
		
		JPanel namePanel = new JPanel();
		namePanel.setBackground(new Color(220, 220, 220));
		namePanel.setBounds(10, 40, 800, 50);
		informationPanel.add(namePanel);
		namePanel.setLayout(null);
		
		JLabel NameLbl = new JLabel("Name:");
		NameLbl.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 16));
		NameLbl.setVerticalAlignment(SwingConstants.BOTTOM);
		NameLbl.setBounds(10, 0, 130, 50);
		namePanel.add(NameLbl);
		
		JLabel nameLbl = new JLabel("John Robert L. Lasan");
		nameLbl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 16));
		nameLbl.setVerticalAlignment(SwingConstants.BOTTOM);
		nameLbl.setBounds(200, 0, 200, 50);
		namePanel.add(nameLbl);
		
		JPanel agePanel = new JPanel();
		agePanel.setLayout(null);
		agePanel.setBackground(new Color(220, 220, 220));
		agePanel.setBounds(10, 100, 800, 50);
		informationPanel.add(agePanel);
		
		JLabel AgeLbl = new JLabel("Age:");
		AgeLbl.setVerticalAlignment(SwingConstants.BOTTOM);
		AgeLbl.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 16));
		AgeLbl.setBounds(10, 0, 130, 50);
		agePanel.add(AgeLbl);
		
		JLabel ageLbl = new JLabel("19");
		ageLbl.setVerticalAlignment(SwingConstants.BOTTOM);
		ageLbl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 16));
		ageLbl.setBounds(200, 0, 200, 50);
		agePanel.add(ageLbl);
		
		JPanel bdayPanel = new JPanel();
		bdayPanel.setLayout(null);
		bdayPanel.setBackground(new Color(220, 220, 220));
		bdayPanel.setBounds(10, 160, 800, 50);
		informationPanel.add(bdayPanel);
		
		JLabel BdayLbl = new JLabel("Birthday:");
		BdayLbl.setVerticalAlignment(SwingConstants.BOTTOM);
		BdayLbl.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 16));
		BdayLbl.setBounds(10, 0, 130, 50);
		bdayPanel.add(BdayLbl);
		
		JLabel bdayLbl = new JLabel("November 7, 2003");
		bdayLbl.setVerticalAlignment(SwingConstants.BOTTOM);
		bdayLbl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 16));
		bdayLbl.setBounds(200, 0, 200, 50);
		bdayPanel.add(bdayLbl);
		
		JPanel sexPanel = new JPanel();
		sexPanel.setLayout(null);
		sexPanel.setBackground(new Color(220, 220, 220));
		sexPanel.setBounds(10, 220, 800, 50);
		informationPanel.add(sexPanel);
		
		JLabel SexLbl = new JLabel("Sex:");
		SexLbl.setVerticalAlignment(SwingConstants.BOTTOM);
		SexLbl.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 16));
		SexLbl.setBounds(10, 0, 130, 50);
		sexPanel.add(SexLbl);
		
		JLabel sexLbl = new JLabel("Male");
		sexLbl.setVerticalAlignment(SwingConstants.BOTTOM);
		sexLbl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 16));
		sexLbl.setBounds(200, 0, 200, 50);
		sexPanel.add(sexLbl);
		
		JPanel coursePanel = new JPanel();
		coursePanel.setLayout(null);
		coursePanel.setBackground(new Color(220, 220, 220));
		coursePanel.setBounds(10, 280, 800, 50);
		informationPanel.add(coursePanel);
		
		JLabel CourseLbl = new JLabel("Course:");
		CourseLbl.setVerticalAlignment(SwingConstants.BOTTOM);
		CourseLbl.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 16));
		CourseLbl.setBounds(10, 0, 130, 50);
		coursePanel.add(CourseLbl);
		
		JLabel courseLbl = new JLabel("Bachelor of Science in Information Technology Specialized in Mobile and Web Application\r\n");
		courseLbl.setVerticalAlignment(SwingConstants.BOTTOM);
		courseLbl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 16));
		courseLbl.setBounds(200, 0, 640, 50);
		coursePanel.add(courseLbl);
		
		JPanel yrandsctnPanel = new JPanel();
		yrandsctnPanel.setLayout(null);
		yrandsctnPanel.setBackground(new Color(220, 220, 220));
		yrandsctnPanel.setBounds(10, 340, 800, 50);
		informationPanel.add(yrandsctnPanel);
		
		JLabel YrandSctnLbl = new JLabel("Year and Section:");
		YrandSctnLbl.setVerticalAlignment(SwingConstants.BOTTOM);
		YrandSctnLbl.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 16));
		YrandSctnLbl.setBounds(10, 0, 130, 50);
		yrandsctnPanel.add(YrandSctnLbl);
		
		JLabel yrandsctnLbl = new JLabel("1st Year, INF 223");
		yrandsctnLbl.setVerticalAlignment(SwingConstants.BOTTOM);
		yrandsctnLbl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 16));
		yrandsctnLbl.setBounds(200, 0, 200, 50);
		yrandsctnPanel.add(yrandsctnLbl);
		
		JPanel educbgPanel = new JPanel();
		educbgPanel.setLayout(null);
		educbgPanel.setBackground(new Color(220, 220, 220));
		educbgPanel.setBounds(10, 400, 800, 150);
		informationPanel.add(educbgPanel);
		
		JLabel EducbgLbl = new JLabel("Educational Background:");
		EducbgLbl.setVerticalAlignment(SwingConstants.BOTTOM);
		EducbgLbl.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 16));
		EducbgLbl.setBounds(10, 0, 180, 50);
		educbgPanel.add(EducbgLbl);
		
		JLabel preschoolLbl = new JLabel("Preschool - Colegio de San Antonio");
		preschoolLbl.setVerticalAlignment(SwingConstants.BOTTOM);
		preschoolLbl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 16));
		preschoolLbl.setBounds(200, 30, 600, 20);
		educbgPanel.add(preschoolLbl);
		
		JLabel elemLbl = new JLabel("Elementary - San Antonio Village Elementary School");
		elemLbl.setVerticalAlignment(SwingConstants.BOTTOM);
		elemLbl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 16));
		elemLbl.setBounds(200, 50, 600, 20);
		educbgPanel.add(elemLbl);
		
		JLabel jhsLbl = new JLabel("Junior High School - Dalig National High School");
		jhsLbl.setVerticalAlignment(SwingConstants.BOTTOM);
		jhsLbl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 16));
		jhsLbl.setBounds(200, 70, 600, 20);
		educbgPanel.add(jhsLbl);
		
		JLabel shsLbl = new JLabel("Senior High School - Sumulong College of Arts and Sciences");
		shsLbl.setVerticalAlignment(SwingConstants.BOTTOM);
		shsLbl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 16));
		shsLbl.setBounds(200, 90, 600, 20);
		educbgPanel.add(shsLbl);
		
		JLabel collegeLbl = new JLabel("College - National University Manila");
		collegeLbl.setVerticalAlignment(SwingConstants.BOTTOM);
		collegeLbl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 16));
		collegeLbl.setBounds(200, 110, 600, 20);
		educbgPanel.add(collegeLbl);
		
		skillsPanel = new JPanel();
		strengthPanel.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(skillsPanel);
			}
		});
		skillsPanel.setBackground(new Color(220, 220, 220));
		skillsPanel.setBounds(0, 0, 820, 555);
		displayPanel.add(skillsPanel);
		skillsPanel.setVisible(false);
		skillsPanel.setLayout(null);
		
		JPanel skillsHeaderPanel = new JPanel();
		skillsHeaderPanel.setBounds(10, 10, 800, 60);
		skillsHeaderPanel.setBackground(new Color(220, 220, 220));
		skillsPanel.add(skillsHeaderPanel);
		skillsHeaderPanel.setLayout(null);
		
		JLabel strengthTitle = new JLabel("STRENGTH");
		strengthTitle.setFont(new Font("Verdana", Font.PLAIN, 24));
		strengthTitle.setHorizontalAlignment(SwingConstants.CENTER);
		strengthTitle.setBackground(new Color(220, 220, 220));
		strengthTitle.setBounds(70, 0, 240, 60);
		skillsHeaderPanel.add(strengthTitle);
		
		JLabel weaknessTitle = new JLabel("WEAKNESS");
		weaknessTitle.setHorizontalAlignment(SwingConstants.CENTER);
		weaknessTitle.setFont(new Font("Verdana", Font.PLAIN, 24));
		weaknessTitle.setBackground(new Color(220, 220, 220));
		weaknessTitle.setBounds(490, 0, 240, 60);
		skillsHeaderPanel.add(weaknessTitle);
		
		JPanel strengthDisplay = new JPanel();
		strengthDisplay.setBackground(new Color(220, 220, 220));
		strengthDisplay.setBounds(10, 80, 380, 460);
		skillsPanel.add(strengthDisplay);
		strengthDisplay.setLayout(null);
		
		JTextArea strengthText = new JTextArea();
		strengthText.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 22));
		strengthText.setText("- Designing\r\n\r\n- Creative\r\n\r\n- Able to find alternative ideas to\r\n solve problems\r\n\r\n- Documentation");
		strengthText.setBackground(new Color(220, 220, 220));
		strengthText.setBounds(10, 10, 360, 440);
		strengthDisplay.add(strengthText);
		
		JPanel weaknessDisplay = new JPanel();
		weaknessDisplay.setLayout(null);
		weaknessDisplay.setBackground(new Color(220, 220, 220));
		weaknessDisplay.setBounds(430, 80, 380, 460);
		skillsPanel.add(weaknessDisplay);
		
		JTextArea weaknessText = new JTextArea();
		weaknessText.setText("- Logic\r\n\r\n- Takes some time to come up with an idea");
		weaknessText.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 22));
		weaknessText.setBackground(new Color(220, 220, 220));
		weaknessText.setBounds(10, 10, 360, 440);
		weaknessDisplay.add(weaknessText);
		
		achievePanel = new JPanel();
		achievementsPanel.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(achievePanel);
			}
		});
		achievePanel.setBackground(new Color(220, 220, 220));
		achievePanel.setBounds(0, 0, 820, 555);
		displayPanel.add(achievePanel);
		achievePanel.setVisible(false);
		achievePanel.setLayout(null);
		
		JLabel achievementLbl = new JLabel("ACHIEVEMENTS");
		achievementLbl.setBounds(188, 80, 321, 168);
		achievePanel.add(achievementLbl);
		
		hobbiesPanel = new JPanel();
		talentsPanel.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(hobbiesPanel);
			}
		});
		hobbiesPanel.setBackground(new Color(220, 220, 220));
		hobbiesPanel.setBounds(0, 0, 820, 555);
		displayPanel.add(hobbiesPanel);
		hobbiesPanel.setVisible(false);
		hobbiesPanel.setLayout(null);
		
		JLabel hobbiesLbl = new JLabel("TALENTS AND HOBBIES");
		hobbiesLbl.setBounds(111, 52, 589, 222);
		hobbiesPanel.add(hobbiesLbl);
		
		itPanel = new JPanel();
		whyITPanel.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(itPanel);
			}
		});
		itPanel.setBackground(new Color(220, 220, 220));
		itPanel.setBounds(0, 0, 820, 555);
		displayPanel.add(itPanel);
		itPanel.setVisible(false);
		itPanel.setLayout(null);
		
		JLabel itLbl = new JLabel("WHY IT");
		itLbl.setBounds(184, 77, 442, 217);
		itPanel.add(itLbl);
		
		JLabel cornerDesgin = new JLabel("");
		cornerDesgin.setIcon(new ImageIcon(Main.class.getResource("/portfolio/images/Rasd (1).png")));
		cornerDesgin.setBackground(new Color(236, 236, 236));
		cornerDesgin.setBounds(950, -60, 250, 225);
		mainPanel.add(cornerDesgin);
		
		JLabel watercolor = new JLabel("");
		watercolor.setIcon(new ImageIcon(Main.class.getResource("/portfolio/images/watercolor background (2).png")));
		watercolor.setBounds(-350, -155, 720, 336);
		mainPanel.add(watercolor);
		
		JLabel blueWatercolor = new JLabel("");
		blueWatercolor.setIcon(new ImageIcon(AboutPanel.class.getResource("/portfolio/images/blue watercolor.png")));
		blueWatercolor.setBackground(new Color(236, 236, 236));
		blueWatercolor.setBounds(-120, 420, 710, 336);
		mainPanel.add(blueWatercolor);
		
		JPanel headerPanel = new JPanel();
		headerPanel.setBackground(new Color(236, 236, 236));
		headerPanel.setBounds(0, 0, 1200, 65);
		mainPanel.add(headerPanel);
		headerPanel.setLayout(null);
		
		JLabel headerLbl = new JLabel("LEARN MORE ABOUT ME");
		headerLbl.setBounds(425, 0, 350, 65);
		headerPanel.add(headerLbl);
		headerLbl.setBackground(new Color(236, 236, 236));
		headerLbl.setHorizontalAlignment(SwingConstants.CENTER);
		headerLbl.setFont(new Font("Times New Roman", Font.BOLD, 28));
			
		displayPanel.add(informationPanel);
		displayPanel.add(skillsPanel);
		displayPanel.add(achievePanel);
		displayPanel.add(hobbiesPanel);
		displayPanel.add(itPanel);
		
	}
	
		public void menuClicked(JPanel panel) {
			
			informationPanel.setVisible(false);
			skillsPanel.setVisible(false);
			achievePanel.setVisible(false);
			hobbiesPanel.setVisible(false);
			itPanel.setVisible(false);
			
			panel.setVisible(true);
		}
		
}
