package minidrawpad;

import javax.swing.UIManager;
import java.awt.Toolkit;


//��������
public class MiniDrawPad {

	public static void main(String[] args) {
		try {//����������Ϊ��ǰwindows������
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {}
		NewDrawPad newDrawPad = new NewDrawPad("Photo Editor");
		newDrawPad.setVisible(true);
		newDrawPad.setIconImage(Toolkit.getDefaultToolkit().getImage(MiniDrawPad.class.getResource("/newIcon/icon.png")));
      
	}

}
