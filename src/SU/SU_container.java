package SU;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;


public class SU_container extends JFrame{

	private JPanel su,hong,jian,suhong,hongjian,sujian;
	private JButton jbxx,xxxx,sthd,tcah,draw,back;
	private JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label_kong,denglu;
	private Icon pic1,pic2,pic3,pic4,pic5,pic6,pic7;
	private JLayeredPane layeredPane;
//	private JScrollPane scroll_list;
	private JList list;
	private String []message;
//	private String []message_kong;
	private int i;
	private int pointCount = 0;
	private Point []points;
	private JComboBox xz;
	private JTextField name;
	
	public SU_container()
	{
		super("JAVA����ҵ������");
//		Container shj = this.getContentPane();
		layeredPane = this.getLayeredPane();                                /*���ò����*/
//		layeredPane.add(su,new Integer(200));
//		layeredPane.add(hong,new Integer(0));
//		layeredPane.add(jian,new Integer(300));
//		layeredPane.add(suhong,new Integer(300));
		su = new JPanel();                                                   /*��ʼ��С���*/
		hong = new JPanel();
		jian = new JPanel();
		suhong = new JPanel();
		hongjian = new JPanel();
		sujian = new JPanel();
		message = new String[6];
		list = new JList(message);
		xz = new JComboBox(message);
//		scroll_list = new JScrollPane(list);
//		list_kong = new JList(message_kong);
		jbxx = new JButton("������Ϣ");
		xxxx = new JButton("ѧУ��Ϣ");
		sthd = new JButton("���Ż");
		tcah = new JButton("�س�����");
		draw = new JButton("��������Ŀ�е��ң�����");
//		back = new JButton(pic6);
		pic1 = new ImageIcon("ͼƬ/background.jpg");
		pic2 = new ImageIcon("ͼƬ/2.png");
		pic3 = new ImageIcon("ͼƬ/�绰1.jpg");
		pic4 = new ImageIcon("ͼƬ/�ʼ�1.jpg");
		pic5 = new ImageIcon("ͼƬ/��ַ1.jpg");
		pic6 = new ImageIcon("ͼƬ/6.jpg");
		pic7 = new ImageIcon("ͼƬ/back2.png");
		back = new JButton(pic7);
		label1 = new JLabel(pic1);
		label2 = new JLabel(pic2);
		label3 = new JLabel("Tel :              ",pic3,2);
		label4 = new JLabel("Email :",pic4,2);
		label5 = new JLabel("Add :",pic5,2);
		label6 = new JLabel("      18151533875                 ");
		label7 = new JLabel("      enactus2014shj@163.com");
		label8 = new JLabel("      �����б����������1800��");
		label9 = new JLabel(pic6);
		label_kong = new JLabel("                                  ");
		denglu = new JLabel("����:");
		points = new Point[1000]; 
		name = new JTextField();
//		label2.setForeground(Color.white);
		
//		DefaultListModel listmodel = new DefaultListModel();     
//		list.setModel(listmodel);
		FlowLayout layout_left = new FlowLayout(3);                        /*��岼������*/
//		FlowLayout layout_center = new FlowLayout(1);
		su.setLayout(null);
		jian.setLayout(layout_left);
		suhong.setLayout(null);
		sujian.setLayout(null);
		
//		shj.setLayout(null);
			
//		message_kong = new String[6];
//		message[0] = "suhongjian";
//		message[2] = "�պ齢";
		
	                                                                         /*��ť��Ӧ*/
		jbxx.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						for(i=0;i<6;i++)
						{
							message[i] = " "; 
						}
						i = 0;
						message[0] = "�������պ齢";
						message[1] = "���䣺20";
						message[2] = "���磺��������";
						message[3] = "���ڵأ���������";
						message[4] = " ";
						message[5] = " ";
//						suhong.add(new JScrollPane(list));
//						list.setListData(new String[0]);
						suhong.add(list);
//						layeredPane.add(new JScrollPane(list),new Integer(300));
						suhong.repaint();
//						shj.add(suhong);
//						JOptionPane.showMessageDialog(null, "�պ齢");
//						layeredPane.setLayer(hongjian, 400);
					}
				}
				);
		xxxx.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						for(i=0;i<6;i++)
						{
							message[i] = " "; 
						}
						i = 0;
						message[0] = "ѧУ�����ϴ�ѧ";
						message[1] = "רҵ������������";
						message[2] = "�꼶������";
						message[3] = "�༶��������4��";
						message[4] = "ѧ�ţ�1040514614";
						suhong.add(list);
						suhong.repaint();
//						shj.add(suhong);
//						JOptionPane.showMessageDialog(null, "�պ齢");
					}
				}
				);
		sthd.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						for(i=0;i<6;i++)
						{
							message[i] = " "; 
						}
						i = 0;
						message[0] = "����1�����С�enactus��";
						message[1] = "ְ��1:��BD��������չ������";
						message[2] = "����2��ѧ����";
						message[3] = "ְ��2��������������";
						message[4] = "����3��Ժ�����";
						message[5] = "ְ��3�����ĺ���";
						suhong.add(list);
						suhong.repaint();
					}
				}
				);
		tcah.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						for(i=0;i<6;i++)
						{
							message[i] = " "; 
						}
						
						i = 0;
						message[0] = "�س������򡢸���";
						message[1] = "���ã���̡���Ӱ������";
						suhong.add(list);
						suhong.repaint();
					}
				}
				);
		back.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						layeredPane.remove(su);                                   /*��������*/
						layeredPane.remove(hong);
						layeredPane.remove(jian);
						layeredPane.remove(suhong);
						layeredPane.add(hongjian);
						layeredPane.add(sujian);
					}
				}
				);
		
		draw.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						suhong.remove(list);
						suhong.repaint();
						addMouseMotionListener(
								new MouseMotionAdapter(){
									public void mouseDragged(MouseEvent event){
										if(pointCount < points.length){
											points[ pointCount ] =event.getPoint();
											++pointCount;
											repaint();
										}
									}
								}
								);
					}
				}
				);
		name.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						if(name.getText().equals("�պ齢"))
						{
							name.setText("");
							layeredPane.add(su,new Integer(500));                                   /*��������*/
							layeredPane.add(hong,new Integer(400));
							layeredPane.add(jian,new Integer(500));
							layeredPane.add(suhong,new Integer(500));
							layeredPane.remove(hongjian);
							layeredPane.remove(sujian);
						}
						else
							JOptionPane.showMessageDialog(null,"�����˰�������������","���߶���֪����",JOptionPane.PLAIN_MESSAGE);
			}
		});
		
//		addMouseMotionListener(
//				new MouseMotionAdapter(){
//					public void mouseDragged(MouseEvent event){
//						if(pointCount < points.length){
//							points[ pointCount ] =event.getPoint();
//							++pointCount;
//							repaint();
//						}
//					}
//				}
//				);
	
		
		su.setOpaque(false);                                                  /*�������*/
		jbxx.setBounds(30,100,100,30);
		jbxx.setContentAreaFilled(false);
		jbxx.setFont(new java.awt.Font("�����п�", 1, 20));
		jbxx.setBorderPainted(false);
		jbxx.setForeground(Color.white);
		jbxx.setBorder(BorderFactory.createRaisedBevelBorder());
		xxxx.setBounds(30,180,100,30);
		xxxx.setContentAreaFilled(false);
		xxxx.setFont(new java.awt.Font("�����п�", 1, 20));
		xxxx.setBorderPainted(false);
		xxxx.setForeground(Color.white);
		xxxx.setBorder(BorderFactory.createRaisedBevelBorder());
//		jbxx.setForeground(Color.green);
		sthd.setBounds(30,260,100,30);
		sthd.setContentAreaFilled(false);
		sthd.setFont(new java.awt.Font("�����п�", 1, 20));
		sthd.setBorderPainted(false);
		sthd.setForeground(Color.white);
		sthd.setBorder(BorderFactory.createRaisedBevelBorder());
		tcah.setBounds(30,340,100,30);
		tcah.setContentAreaFilled(false);
		tcah.setFont(new java.awt.Font("�����п�", 1, 20));
		tcah.setBorderPainted(false);
		tcah.setForeground(Color.white);
		tcah.setBorder(BorderFactory.createRaisedBevelBorder());
		
		
		
		jian.setOpaque(false);
//		label2.setBounds(0,0,180,10);
//		label3.setBounds(0,80,180,10);
//		label4.setBounds(0,120,180,10);
//		label5.setBounds(0,160,180,10);
//		label6.setBounds(0,90,180,10);
//		label7.setBounds(0,130,180,10);
//		label8.setBounds(0,170,180,10);
		
		suhong.setOpaque(false);
		list.setBounds(166,120,150,800);
		list.setOpaque(false);
		list.setBackground(new Color(0, 0, 0, 0));
		list.setVisibleRowCount(3);
		list.setSelectionMode(0);
		draw.setBounds(0,0,450,30);
		draw.setContentAreaFilled(false);
		draw.setFont(new java.awt.Font("����", 2, 16));
		draw.setBorderPainted(false);
		draw.setForeground(Color.white);
        draw.setBorder(BorderFactory.createRaisedBevelBorder());
		back.setBounds(380,650,60,60);
		back.setContentAreaFilled(false);
		back.setBorderPainted(false);
		back.setBorder(BorderFactory.createRaisedBevelBorder());
        
        
        sujian.setOpaque(false);
        denglu.setBounds(166,250,150,30);
//        denglu.setContentAreaFilled(false);
		denglu.setFont(new java.awt.Font("���Ĳ���", 1, 20));
//		denglu.setBorderPainted(false);
		denglu.setForeground(Color.black);
//        denglu.setOpaque(false);
//		denglu.setBackground(new Color(0, 0, 0, 0));
		name.setBounds(168,285,88,20);
		name.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.gray));
		xz.setBounds(0,0,150,30);
		xz.setOpaque(false);

        
		
		
		su.setBounds(0,0,150,450);                                        /*����С����*/
		hong.setBounds(0, -50, 600, 800);
		jian.setBounds(0, 450, 180, 350);
		suhong.setBounds(150,0,450,800);
		hongjian.setBounds(0,0,600,800);
		sujian.setBounds(0,0,600,800);
		
		su.add(jbxx);                                                       /*������*/
		su.add(xxxx);
		su.add(sthd);
		su.add(tcah);
		
		hong.add(label1);
		
		jian.add(label2);
		jian.add(label_kong);
		jian.add(label3);
		jian.add(label6);
		jian.add(label4);
		jian.add(label7);
		jian.add(label5);
		jian.add(label8);
		
//		suhong.add(list);
		suhong.add(draw);
		suhong.add(back);
		
		hongjian.add(label9);
		
		sujian.add(denglu);
		sujian.add(name);
//		sujian.add(xz);
		
//		message[0] = "����1�����С�enactus��";
//		message[1] = "ְ��1:��BD��������չ������";
//		message[2] = "����2��ѧ����";
//		message[3] = "ְ��2��������������";
//		message[4] = "����3��Ժ�����";
//		message[5] = "ְ��3�����ĺ���";
//		xz.setBounds(166,200,100,20);
//		xz.setOpaque(false);
//		xz.setBackground(new Color(0, 0, 0, 0));
//		xz.setMaximumRowCount(3);
//		xz.setEditable(false);
//		suhong.add(xz);
//		layeredPane.add(xz,new Integer(300));
		
		 
//		Border b1 = BorderFactory.createEtchedBorder();
        Border b2 = BorderFactory.createMatteBorder(0, 0, 0, 1, Color.white);   /*���߿�����*/
		su.setBorder(b2);
		
		                                                       /*��������*/
//		layeredPane.add(hong,new Integer(0));
//		layeredPane.add(su,new Integer(100));
//		layeredPane.add(jian,new Integer(100));
//		layeredPane.add(suhong,new Integer(100));
		layeredPane.add(hongjian, new Integer(200));
		layeredPane.add(sujian, new Integer(300));
//		layeredPane.setLayer(hongjian, 400);
//		shj.add(su);
//		shj.add(jian);
//		shj.add(suhong);
//		shj.add(hong);
		
		
		
		
		
//		layeredPane.add(su,new Integer(300));
//		su.setBounds(0, 0, 150, 750);
//		super.repaint();
		setLayeredPane(layeredPane);                                    /*��JFrame����*/
		setSize(600,750);
		setLocation(666,188);
		setVisible(true);
		setResizable(false);
//		setBackground(Color.red);
	}
	
	public void paint( Graphics g)
	{
		super.paint(g);
		for(int k=0 ; k<points.length && points[k]!=null ; k++)
			g.fillOval(points[k].x, points[k].y, 4, 4);
	}
}
