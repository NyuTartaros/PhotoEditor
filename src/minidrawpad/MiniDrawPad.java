package minidrawpad;

import javax.swing.UIManager;
import java.awt.Toolkit;


//主函数类
public class MiniDrawPad {

	public static void main(String[] args) {
		try {//将界面设置为当前windows界面风格
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {}
		NewDrawPad newDrawPad = new NewDrawPad("Photo Editor");
		newDrawPad.setVisible(true);
		newDrawPad.setIconImage(Toolkit.getDefaultToolkit().getImage(MiniDrawPad.class.getResource("/newIcon/icon.png")));
      
	}

}
