package minidrawpad;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.*;

//文件类 （文件的打开、新建、保存）
public class NewFileClass {
   private NewDrawPad drawpad;
   NewDrawArea drawarea = null;
    NewFileClass(NewDrawPad dp,NewDrawArea da) {
		drawpad = dp;
		drawarea = da;
	}
    
	public void newFile() {
		// TODO 新建图像
		drawarea.setIndex(0);
		drawarea.setCurrentChoice(3);//设置默认为随笔画
		drawarea.setColor(Color.black);//设置颜色
		drawarea.setStroke(1.0f);//设置画笔的粗细
		drawarea.createNewitem();
		drawarea.repaint();
	}

	public void openFile() {
		// TODO 打开图像
		
		 //JFileChooser 为用户选择文件提供了一种简单的机制
		 JFileChooser filechooser = new JFileChooser();
		 filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		  /* FileNameExtensionFilter filter = new FileNameExtensionFilter(
			        "JPG & GIF Images", "jpg", "gif");//其中只显示 .jpg 和 .gif 图像
		   filechooser.setFileFilter(filter);*/
		    int returnVal = filechooser.showOpenDialog(drawpad);
		    
		    if(returnVal == JFileChooser.CANCEL_OPTION) {//如果单击确定按钮就执行下面得程序
		       return;
		    }
		    File fileName = filechooser.getSelectedFile();//getSelectedFile()返回选中的文件
		    fileName.canRead();
		    if(fileName == null || fileName.getName().equals(""))//文件名不存在时
		    {
		    	JOptionPane.showMessageDialog(filechooser,"文件名","请输入文件名！",JOptionPane.ERROR_MESSAGE);
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
    
	//保存图像文件程序段，用到文件对（FileOupputSream）象流
	public void saveFile() {
		// TODO 保存图像
		
		 //JFileChooser 为用户选择文件提供了一种简单的机制
		JFileChooser filechooser = new JFileChooser();
		filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		//setFileSelectionMode()设置 JFileChooser，以允许用户只选择文件、只选择目录，或者可选择文件和目录。
		int result = filechooser.showSaveDialog(drawpad);
		if(result == JFileChooser.CANCEL_OPTION){
        	return ;
        }
        
        File fileName = filechooser.getSelectedFile();//getSelectedFile()返回选中的文件
	    fileName.canWrite();//测试应用程序是否可以修改此抽象路径名表示的文件
	    if(fileName == null || fileName.getName().equals("")){//文件名不存在时
	    	JOptionPane.showMessageDialog(filechooser,"文件名","请输入文件名！",JOptionPane.ERROR_MESSAGE);
	    }else {
	    	try {
	    		fileName = new File(fileName.getAbsolutePath()+".jpg");
		    	if(drawarea.merging()){	//拼图
		    		ImageIO.write(drawarea.mergedImage, "JPEG", fileName);
		    	}else if(drawarea.cutting()){	//剪切
		    		ImageIO.write(drawarea.cuttedImage, "JPEG", fileName);
		    	}else{	//非拼图
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
			JOptionPane.showMessageDialog(drawpad, "图片数量小于1，无法拼接.");
			throw new RuntimeException("图片数量小于1");  
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
