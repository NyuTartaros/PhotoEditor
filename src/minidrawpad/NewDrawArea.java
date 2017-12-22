package minidrawpad;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;
import java.nio.Buffer;
import java.util.ArrayList;

//绘图区类（各种图形的绘制和鼠标事件）
public class NewDrawArea extends JPanel{
	NewDrawPad drawpad =null;
    Drawing[] itemList =new Drawing[5000];; //绘制图形类
    
    private int currentChoice = 3;//设置默认基本图形状态为随笔画
    int index = 0;//当前已经绘制的图形数目
    private Color color = Color.black;//当前画笔的颜色
    int R,G,B;//用来存放当前颜色的彩值
    int f1,f2;//用来存放当前字体的风格
    String stytle ;//存放当前字体
    float stroke = 1.0f;//设置画笔的粗细 ，默认的是 1.0
    public BufferedImage image;
    public BufferedImage inputImage = null;
    public BufferedImage mergedImage;
    public BufferedImage cuttedImage;
    Graphics2D g;
    int width=900;
    int height=800;
    int cutx1;
    int cuty1;
    int cutx2;
    int cuty2;
    
    
	NewDrawArea(NewDrawPad dp) {
		drawpad = dp;
		setSize(width, height);
		/*
		System.out.print("width: ");
		System.out.println(width);
		System.out.print("height: ");
		System.out.println(height);
		*/
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		g = image.createGraphics();
		paint(g);
		g.dispose();
		// 把鼠标设置成十字形
		setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		// setCursor 设置鼠标的形状 ，getPredefinedCursor()返回一个具有指定类型的光标的对象

		setBackground(Color.white);// 设置绘制区的背景是白色
		addMouseListener(new MouseA());// 添加鼠标事件
		addMouseMotionListener(new MouseB());
		 createNewitem();
	}
    
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;//定义随笔画
		int  j = 0;
		if(inputImage != null){
			System.out.print("index: ");
			System.out.println(j);
			System.out.println(".\t");
			System.out.println("paintComponent(): inputImage != null");
			g.drawImage(inputImage, 0, 0, inputImage.getWidth(), inputImage.getHeight(), null);
		}
		if(index == 0){
			return;
		}
		while(j<=index)
		{
			System.out.println(itemList[j].getClass().getName());
			draw(g2d,itemList[j]);
			j++;
	    }
	}
	void draw(Graphics2D g2d , Drawing i)
	{
		i.draw(g2d);//将画笔传到个各类的子类中，用来完成各自的绘图
	}
	
	public void capture(){
		try {
			image = new Robot().createScreenCapture(new Rectangle(getX(), getY()+23, width, 580));
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setImg(BufferedImage image){
		this.inputImage = image;
		getGraphics().drawImage(this.inputImage, 0, 0, this.inputImage.getWidth(), this.inputImage.getHeight(), null);
		index = 0;
	}
	
	public void restore(){
		index=0;
		inputImage = null;
		repaint();
	}
	
	public void undo(){
		if(index>0){
			index--;
			repaint();
		}else{
			System.out.println("nothing to undo.");
		}
	}
	
	public void redo(){
		index++;
		repaint();
	}
	
	public void mergeImage(ArrayList<BufferedImage> imglist){
		int height = imglist.get(1).getHeight();
		int num = imglist.size();
		int[][] ImageArrays = new int[num][];  
		for(int i=0; i<imglist.size(); i++){
			if(imglist.get(i).getHeight() != height){
				JOptionPane.showMessageDialog(drawpad, "图片高度不一致，无法拼接.");
				return;
			}
            ImageArrays[i] = new int[imglist.get(i).getWidth() * imglist.get(i).getHeight()];  
            ImageArrays[i] = imglist.get(i).getRGB(0, 0, imglist.get(i).getWidth(), imglist.get(i).getHeight(), ImageArrays[i], 0, imglist.get(i).getWidth());  
		}
        int newHeight = 0;  
        int newWidth = 0;  
        for (int i = 0; i < imglist.size(); i++) {  
            // 横向   
            newHeight = newHeight > imglist.get(i).getHeight() ? newHeight : imglist.get(i).getHeight();  
            newWidth += imglist.get(i).getWidth();  
        }  
        if (newWidth < 1) {  
        	JOptionPane.showMessageDialog(drawpad, "Internal Error, Image Merge stopped.");
            return;  
        }  
        BufferedImage ImageNew = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_RGB);  
        int height_i = 0;  
        int width_i = 0;  
        for (int i = 0; i < imglist.size(); i++) {  
            ImageNew.setRGB(width_i, 0, imglist.get(i).getWidth(), newHeight, ImageArrays[i], 0,  
            		imglist.get(i).getWidth());  
            width_i += imglist.get(i).getWidth();  
        }  
        mergedImage = ImageNew;
        inputImage = mergedImage;
        getGraphics().drawImage(mergedImage, 0, 0, mergedImage.getWidth(), mergedImage.getHeight(), null);
        setCurrentChoice(22); //Merging Image
	}
	
	public boolean merging(){
		if(currentChoice == 22){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean cutting(){
		if(currentChoice == 23){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean bucketing(){
		if(currentChoice == 4){
			return true;
		}else{
			return false;
		}
	}
	
	//新建一个图形的基本单元对象的程序段
	void createNewitem(){
		if(currentChoice == 14)//字体的输入光标相应的设置为文本输入格式
			setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		else  	setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
			switch(currentChoice){
			case 3: itemList[index] = new Pencil();break;
			case 4: 
				capture();
				itemList[index] = new Bucket(image);break;
			case 5: itemList[index] = new Rect();break;
			case 6: itemList[index] = new fillRect();break;
			case 7: itemList[index] = new Oval();break;
			case 8: itemList[index] = new fillOval();break;
			case 9: itemList[index] = new Circle();break;
			case 10: itemList[index] = new fillCircle();break;
			case 11: itemList[index] = new RoundRect();break;
			case 12: itemList[index] = new fillRoundRect();break;
			case 13: itemList[index] = new Rubber();break;
			case 14: itemList[index] = new Word();break;
		}
	  itemList[index].type = currentChoice;
	  itemList[index].R = R;
	  itemList[index].G = G;
	  itemList[index].B = B;
	  itemList[index].stroke = stroke ;
	 
	}
   
    public void setIndex(int x){//设置index的接口
    	index = x;
    }
    public int getIndex(){//设置index的接口
    	return index ;
    }
    public void setColor(Color color)//设置颜色的值
    {
    	this.color = color; 
    }
    public void setStroke(float f)//设置画笔粗细的接口
    {
    	stroke = f;
    }
	public void chooseColor()//选择当前颜色
	{
		color = JColorChooser.showDialog(drawpad, "请选择颜色", color);
		try {
			R = color.getRed();
			G = color.getGreen();
			B = color.getBlue();
		} catch (Exception e) {
			R = 0;
			G = 0;
			B = 0;
		}
		itemList[index].R = R;
		itemList[index].G = G;
		itemList[index].B = B;
	}
	public void setStroke()//画笔粗细的调整
	{
		String input ;
		input = JOptionPane.showInputDialog("请输入画笔的粗细( >0 )");
		try {
			stroke = Float.parseFloat(input);
			
		} catch (Exception e) {
			stroke = 1.0f;
			
		}itemList[index].stroke = stroke;
		
	}
	public void setCurrentChoice(int i )//文字的输入
	{
		currentChoice = i;
	}
	
	public void setFont(int  i,int font)//设置字体
	{
		if(i == 1)
		{
			f1 = font; 
		}
		else 
			f2 = font;
	}

// TODO 鼠标事件MouseA类继承了MouseAdapter 
//用来完成鼠标的响应事件的操作（鼠标的按下、释放、单击、移动、拖动、何时进入一个组件、何时退出、何时滚动鼠标滚轮 )
class MouseA extends MouseAdapter
{

	

	@Override
	public void mouseEntered(MouseEvent me) {
		// TODO 鼠标进入
		drawpad.setStratBar("鼠标进入在：["+me.getX()+" ,"+me.getY()+"]");
	}

	@Override
	public void mouseExited(MouseEvent me) {
		// TODO 鼠标退出
		drawpad.setStratBar("鼠标退出在：["+me.getX()+" ,"+me.getY()+"]");
	}

	@Override
	public void mousePressed(MouseEvent me) {
		// TODO 鼠标按下
		drawpad.setStratBar("鼠标按下在：["+me.getX()+" ,"+me.getY()+"]");//设置状态栏提示
		
		//剪切
		if(cutting()){
			cutx1 = me.getX();
			cuty1 = me.getY();
			return;
		}
		
		itemList[index].x1 = itemList[index].x2 = me.getX();
		itemList[index].y1 = itemList[index].y2 = me.getY();
		
		//如果当前选择为随笔画或橡皮擦 ，则进行下面的操作
		if(currentChoice == 3||currentChoice ==13){
			itemList[index].x1 = itemList[index].x2 = me.getX();
			itemList[index].y1 = itemList[index].y2 = me.getY();
			index++;
			createNewitem();//创建新的图形的基本单元对象
		}
		//如果选择图形的文字输入，则进行下面的操作
		if(currentChoice == 14){
			itemList[index].x1 = me.getX();
			itemList[index].y1 = me.getY();
			String input ;
			input = JOptionPane.showInputDialog("请输入你要写入的文字！");
			itemList[index].s1 = input;
			itemList[index].x2 = f1;
			itemList[index].y2 = f2;
			itemList[index].s2 = stytle;
			
			index++;
			currentChoice = 14;
			createNewitem();//创建新的图形的基本单元对象
			repaint();
		}

	}

	@Override
	public void mouseReleased(MouseEvent me) {
		// TODO 鼠标松开
		if(cutting()){
			cutx2 = me.getX();
			cuty2 = me.getY();
			int[] rgbArray = new int[(cutx2-cutx1)*(cuty2-cuty1)];
			image.getRGB(cutx1, cuty1, cutx2-cutx1, cuty2-cuty1, rgbArray, 0, cutx2-cutx1);
			BufferedImage tmpimage = new BufferedImage(cutx2-cutx1, cuty2-cuty1, BufferedImage.TYPE_INT_RGB);
			tmpimage.setRGB(0, 0, cutx2-cutx1, cuty2-cuty1, rgbArray, 0, cutx2-cutx1);
			cuttedImage = tmpimage;
			return;
		}
		drawpad.setStratBar("鼠标松开在：["+me.getX()+" ,"+me.getY()+"]");
		if(currentChoice == 3||currentChoice ==13){
			itemList[index].x1 = me.getX();
			itemList[index].y1 = me.getY();
		}
		itemList[index].x2 = me.getX();
		itemList[index].y2 = me.getY();
		repaint();
		index++;
		createNewitem();//创建新的图形的基本单元对象
	}

}

	// 鼠标事件MouseB继承了MouseMotionAdapter
	// 用来处理鼠标的滚动与拖动
	class MouseB extends MouseMotionAdapter {
      public void mouseDragged(MouseEvent me)//鼠标的拖动
      {
    	  drawpad.setStratBar("鼠标拖动在：["+me.getX()+" ,"+me.getY()+"]");
    	  if(cutting()){
    		  getGraphics().drawImage(image, 0, 9, image.getWidth(), image.getHeight(), null);
    		  getGraphics().drawRect(cutx1, cuty1, me.getX()-cutx1, me.getY()-cuty1);
    		  return;
    	  }
    	  
    	  if(currentChoice == 3||currentChoice ==13){
    		  itemList[index-1].x1 = itemList[index].x2 = itemList[index].x1 =me.getX();
    		  itemList[index-1].y1 = itemList[index].y2 = itemList[index].y1 = me.getY();
    		  index++;
    		  createNewitem();//创建新的图形的基本单元对象
    	  }
    	  else 
    	  {
    		  itemList[index].x2 = me.getX();
    		  itemList[index].y2 = me.getY();
    	  }
    	  repaint();
      }
      public void mouseMoved(MouseEvent me)//鼠标的移动
      {
    	  drawpad.setStratBar("鼠标移动在：["+me.getX()+" ,"+me.getY()+"]");
      }
	}

}
