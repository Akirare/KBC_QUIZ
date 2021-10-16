/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circular_progressbar;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

/**
 *
 * @author MyPC
 */
public class progress extends JPanel{
    
    int totalSecond = 1;
    int totalMinute;
    int progress_value=0;
    
    public void countDown(int progress, int Minute){
        this.progress_value = progress;
        this.totalSecond = Minute*60;
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        g2.translate(this.getWidth()/2, this.getHeight()/2);
        g2.rotate(Math.toRadians(270));
        
        Arc2D.Float arc = new Arc2D.Float(Arc2D.PIE);
        arc.setFrameFromCenter(new Point(0, 0), new Point(90, 90));
        
        Ellipse2D circleIn = new Ellipse2D.Double.Float(0, 0, 80, 80);
        circleIn.setFrameFromCenter(new Point(0, 0), new Point(80, 80));
        
        Ellipse2D circleOut = new Ellipse2D.Double.Float(0, 0, 89, 89);
        circleOut.setFrameFromCenter(new Point(0, 0), new Point(89, 89));
        
        g2.setColor(new Color(255,0,0,200));
        g2.draw(circleOut);
        g2.fill(circleOut);
        
        arc.setAngleStart(1);
        arc.setAngleExtent(progress_value * (360/totalSecond));
//        arc.setArcByCenter(0, 0, 90, 1, progress_value * (360/totalSecond), 2);
        g2.setColor(new Color(0,0,0,160));     //color: black + alpha
        g2.draw(arc);
        g2.fill(arc);
        
        g2.setColor(new Color(102,102,102,160));     //color: gray + alpha
        g2.draw(circleIn);
        g2.fill(circleIn);
        
        g2.rotate(Math.toRadians(90));
        
//        FontMetrics fm = g2.getFontMetrics();
        
        //display Minute countdown
        int minuteOut = (int)((totalSecond-progress_value)/60);
        
        g2.setFont(new Font(TOOL_TIP_TEXT_KEY, Font.PLAIN, 40));
        g2.setColor(new Color(255,0,0,250));     //color: red
//        Rectangle2D rM = fm.getStringBounds(minuteOut+"M", g);
        g2.drawString(minuteOut+"M", -25, 10);
        
        //display Second countdown
        int secondOut = totalSecond-progress_value;
        
        g2.setFont(new Font(TOOL_TIP_TEXT_KEY, Font.PLAIN, 20));
        g2.setColor(new Color(255,255,255,250));     //color: white
//        Rectangle2D rS = fm.getStringBounds(secondOut+"s", g);
        g2.drawString(secondOut+"s", -15, 30);
        
        
        
    }
}
