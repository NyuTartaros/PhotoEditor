package minidrawpad;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
//�����˵����ܵ�������
public class Help extends JFrame {
	private NewDrawPad  drawpad = null;
	Help(NewDrawPad dp)
	{
		drawpad = dp;
	}
	
	public void MainHeip()
	  {
	  	JOptionPane.showMessageDialog(this,"��ͼ������ĵ���","��ͼ��",JOptionPane.WARNING_MESSAGE);
	  } 
	 public void AboutBook()
	  {
	  	JOptionPane.showMessageDialog(drawpad,"��ͼ��","��ͼ��",JOptionPane.WARNING_MESSAGE);
	  }
}
