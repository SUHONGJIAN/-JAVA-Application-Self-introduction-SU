//package SU;
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//
//
//
//public class SU_MouseDraw extends JFrame{
//	
//	private int pointCount = 0;
//	private Point []points = new Point[1000];;
//	
//	
//	public SU_MouseDraw()
//	{
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
//	}
//	
//	public void paint( Graphics g)
//	{
//		for(int k=0 ; k<points.length && points[k]!=null ; k++)
//			g.fillOval(points[k].x, points[k].y, 4, 4);
//	}
//}
