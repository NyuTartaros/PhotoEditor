package minidrawpad;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
//帮助菜单功能的事项类
public class Help extends JFrame {
	private NewDrawPad  drawpad = null;
	Help(NewDrawPad dp)
	{
		drawpad = dp;
	}
	
	public void MainHeip()
	  {
	  	JOptionPane.showMessageDialog(this,"绘图板帮助文档！","绘图板",JOptionPane.WARNING_MESSAGE);
	  } 
	 public void AboutBook()
	  {
	  	JOptionPane.showMessageDialog(drawpad,"绘图板","绘图板",JOptionPane.WARNING_MESSAGE);
	  }
}
