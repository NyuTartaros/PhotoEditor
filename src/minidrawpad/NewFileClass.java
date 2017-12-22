package minidrawpad;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.*;

//�ļ��� ���ļ��Ĵ򿪡��½������棩
public class NewFileClass {
   private NewDrawPad drawpad;
   NewDrawArea drawarea = null;
    NewFileClass(NewDrawPad dp,NewDrawArea da) {
		drawpad = dp;
		drawarea = da;
	}
    
	public void newFile() {
		// TODO �½�ͼ��
		drawarea.setIndex(0);
		drawarea.setCurrentChoice(3);//����Ĭ��Ϊ��ʻ�
		drawarea.setColor(Color.black);//������ɫ
		drawarea.setStroke(1.0f);//���û��ʵĴ�ϸ
		drawarea.createNewitem();
		drawarea.repaint();
	}

	public void openFile() {
		// TODO ��ͼ��
		
		 //JFileChooser Ϊ�û�ѡ���ļ��ṩ��һ�ּ򵥵Ļ���
		 JFileChooser filechooser = new JFileChooser();
		 filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		  /* FileNameExtensionFilter filter = new FileNameExtensionFilter(
			        "JPG & GIF Images", "jpg", "gif");//����ֻ��ʾ .jpg �� .gif ͼ��
		   filechooser.setFileFilter(filter);*/
		    int returnVal = filechooser.showOpenDialog(drawpad);
		    
		    if(returnVal == JFileChooser.CANCEL_OPTION) {//�������ȷ����ť��ִ������ó���
		       return;
		    }
		    File fileName = filechooser.getSelectedFile();//getSelectedFile()����ѡ�е��ļ�
		    fileName.canRead();
		    if(fileName == null || fileName.getName().equals(""))//�ļ���������ʱ
		    {
		    	JOptionPane.showMessageDialog(filechooser,"�ļ���","�������ļ�����",JOptionPane.ERROR_MESSAGE);
		    }else {
			    try {
					BufferedImage image = ImageIO.read(new FileInputStream(fileName));
					drawarea.setImg(image);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		    
	}
    
	//����ͼ���ļ�����Σ��õ��ļ��ԣ�FileOupputSream������
	public void saveFile() {
		// TODO ����ͼ��
		
		 //JFileChooser Ϊ�û�ѡ���ļ��ṩ��һ�ּ򵥵Ļ���
		JFileChooser filechooser = new JFileChooser();
		filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		//setFileSelectionMode()���� JFileChooser���������û�ֻѡ���ļ���ֻѡ��Ŀ¼�����߿�ѡ���ļ���Ŀ¼��
		int result = filechooser.showSaveDialog(drawpad);
		if(result == JFileChooser.CANCEL_OPTION){
        	return ;
        }
        
        File fileName = filechooser.getSelectedFile();//getSelectedFile()����ѡ�е��ļ�
	    fileName.canWrite();//����Ӧ�ó����Ƿ�����޸Ĵ˳���·������ʾ���ļ�
	    if(fileName == null || fileName.getName().equals("")){//�ļ���������ʱ
	    	JOptionPane.showMessageDialog(filechooser,"�ļ���","�������ļ�����",JOptionPane.ERROR_MESSAGE);
	    }else {
	    	try {
	    		fileName = new File(fileName.getAbsolutePath()+".jpg");
		    	if(drawarea.merging()){	//ƴͼ
		    		ImageIO.write(drawarea.mergedImage, "JPEG", fileName);
		    	}else if(drawarea.cutting()){	//����
		    		ImageIO.write(drawarea.cuttedImage, "JPEG", fileName);
		    	}else{	//��ƴͼ
			    	drawarea.capture();
					ImageIO.write(drawarea.image, "JPEG", fileName);
		    	}
	    	}catch (IOException e) {
	    		e.printStackTrace();
			}
	    }
	}
	
	public void mergeFile(){
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setMultiSelectionEnabled(true);
		int result = fileChooser.showOpenDialog(drawpad);
		if(result == JFileChooser.CANCEL_OPTION){
			return ;
		}
		File[] filename = fileChooser.getSelectedFiles();
		if(filename.length < 1){
			JOptionPane.showMessageDialog(drawpad, "ͼƬ����С��1���޷�ƴ��.");
			throw new RuntimeException("ͼƬ����С��1");  
		}
		ArrayList<BufferedImage> imglist = new ArrayList<BufferedImage>();
		for(int i=0; i<filename.length; i++){
			try {
				imglist.add(ImageIO.read(filename[i]));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		drawarea.mergeImage(imglist);
	}
	
}
