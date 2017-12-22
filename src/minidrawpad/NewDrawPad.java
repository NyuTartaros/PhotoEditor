package minidrawpad;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import java.awt.BorderLayout;

import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.nio.Buffer;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class NewDrawPad extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1414933209639621372L;
	NewDrawArea drawArea = new NewDrawArea(this);
	NewFileClass fileClass = new NewFileClass(this, drawArea);
	
	JLabel startBar = new JLabel("绘图板");
	JPanel topBar = new JPanel();
	JPanel topBar1 = new JPanel();
	JButton imgEdit = new JButton("");
	JButton imgMerge = new JButton("");
	JButton design = new JButton("");
	JButton open = new JButton("");
	JButton undo = new JButton("");
	JButton redo = new JButton("");
	JButton originImg = new JButton("");
	JButton shot = new JButton("");
	JButton share = new JButton("");
	JButton save = new JButton("");
	JToolBar topBar2 = new JToolBar();
	JButton basic = new JButton("");
	JButton special = new JButton("");
	JButton beautify = new JButton("");
	JButton border = new JButton("");
	JButton tag = new JButton("");
	JButton text = new JButton("");
	JToolBar leftBar = new JToolBar();
	JToolBar leftBar11 = new JToolBar();
	JButton triangleLeft = new JButton("");
	JButton trimbox = new JButton("");
	JButton box = new JButton("");
	JButton flash = new JButton("");
	JToolBar leftBar12 = new JToolBar();
	JButton triangleRight = new JButton("");
	JButton cursor = new JButton("");
	JButton rope = new JButton("");
	JToolBar leftBar2 = new JToolBar();
	JToolBar leftBar21 = new JToolBar();
	JButton pencil = new JButton("");
	JButton eraser = new JButton("");
	JButton rectangle = new JButton("");
	JButton rotate = new JButton("");
	JToolBar leftBar22 = new JToolBar();
	JButton brush = new JButton("");
	JButton bucket = new JButton("");
	JButton stamp = new JButton("");
	JButton circle = new JButton("");
	JToolBar leftBar3 = new JToolBar();
	JToolBar leftBar31 = new JToolBar();
	JButton liquid = new JButton("");
	JButton finger = new JButton("");
	JButton blackloupe = new JButton("");
	JButton eye = new JButton("");
	JButton enlarge = new JButton("");
	JButton liquidpen = new JButton("");
	JButton grab = new JButton("");
	JToolBar leftBar32 = new JToolBar();
	JButton triangle = new JButton("");
	JButton sponge = new JButton("");
	JButton hand = new JButton("");
	JButton pen = new JButton("");
	JButton shrink = new JButton("");
	JButton alphebet = new JButton("");
	JButton loupe = new JButton("");
	JToolBar colorBar = new JToolBar();
	JToolBar bgcolorBarBig = new JToolBar();
	JLabel bgcolorLabel = new JLabel("");
	Color bgcolor = Color.BLACK;
	JToolBar bgcolorBarSmall = new JToolBar();
	JToolBar bgcolorBarSmall1 = new JToolBar();
	JButton bgcolor1Button = new JButton("");
	JButton bgcolor2Button = new JButton("");
	JButton bgcolor3Button = new JButton("");
	JToolBar bgcolorBarSmall2 = new JToolBar();
	JButton bgcolor4Button = new JButton("");
	JButton bgcolor5Button = new JButton("");
	JButton bgcolor6Button = new JButton("");
	Color bgcolor1 = Color.WHITE;
	Color bgcolor2 = Color.WHITE;
	Color bgcolor3 = Color.WHITE;
	Color bgcolor4 = Color.WHITE;
	Color bgcolor5 = Color.WHITE;
	Color bgcolor6 = Color.WHITE;
	private final JToolBar topBarRight = new JToolBar();
	private final JButton pallet = new JButton("");
	private final JButton thickness = new JButton("");
	private final JToolBar topBar1left = new JToolBar();
	private final JToolBar topBar1right = new JToolBar();
	private final JPanel workspace = new JPanel();
	private final JToolBar importBar = new JToolBar();
	private final JButton importImg = new JButton("");
	private final JPanel topBar2Panel = new JPanel();
	private final JPanel topBarRightPanel = new JPanel();
	private final JToolBar clearBar = new JToolBar();
	private final JButton clearWorkspace = new JButton("");
	private final JLabel lblNewLabel = new JLabel("");
	private final JLabel label = new JLabel("   ");
	private final JLabel label_1 = new JLabel("   ");
	private final JLabel label_2 = new JLabel("   ");
	private final JLabel label_3 = new JLabel("   ");
	private final JLabel label_4 = new JLabel("   ");
	private final JLabel label_5 = new JLabel("   ");
	private final JLabel label_6 = new JLabel("   ");
	private final JLabel label_7 = new JLabel("   ");
	private final JLabel label_8 = new JLabel("   ");
	private final JLabel label_9 = new JLabel("   ");
	private final JLabel label_10 = new JLabel("   ");
	private final JLabel label_11 = new JLabel("   ");
	private final JLabel label_12 = new JLabel("   ");
	private final JLabel label_13 = new JLabel("   ");
	private final JLabel label_14 = new JLabel("   ");
	private final JToolBar leftBar1 = new JToolBar();
	private final JLabel lblNewLabel_1 = new JLabel(" ");
	private final JLabel label_15 = new JLabel(" ");

	public NewDrawPad(String name) {
		super(name);
		setIconImage(Toolkit.getDefaultToolkit().getImage(NewDrawPad.class.getResource("/newIcon/icon.png")));
		setBackground(new Color(39, 39, 39));
		setSize(1366, 772);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//topBar.setFloatable(false);
		topBar.setBackground(new Color(39, 39, 39));
		getContentPane().add(topBar, BorderLayout.NORTH);
		topBar.setLayout(new BorderLayout(0, 0));
		topBar.add(topBar1, BorderLayout.WEST);
		topBar1.setBorder(null);
		//topBar.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		
		//topBar1.setFloatable(false);
		topBar1.setBackground(new Color(39, 39, 39));
		topBar1.setLayout(new BorderLayout(0, 0));
		topBar1left.setFloatable(false);
		topBar1left.setBackground(new Color(39, 39, 39));
		
		topBar1.add(topBar1left, BorderLayout.WEST);
		topBar1left.add(imgEdit);
		
		imgEdit.setBackground(new Color(39, 39, 39));
		imgEdit.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/3.png")));
		imgEdit.setBorderPainted(false);
		
		topBar1left.add(label);
		imgMerge.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				fileClass.mergeFile();
			}
		});
		topBar1left.add(imgMerge);
		
				imgMerge.setBackground(new Color(39, 39, 39));
				imgMerge.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/4.png")));
				imgMerge.setBorderPainted(false);
				
				topBar1left.add(label_1);
				topBar1left.add(design);
				
				design.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/5.png")));
				design.setBackground(new Color(39, 39, 39));
				design.setBorderPainted(false);
				
				topBar1left.add(label_2);
				topBar1right.setFloatable(false);
				topBar1right.setBackground(new Color(39, 39, 39));
				topBar1.add(topBar1right, BorderLayout.EAST);
				open.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						fileClass.openFile();
					}
				});
				topBar1right.add(open);
				
				open.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/6.png")));
				open.setBackground(new Color(39, 39, 39));
				open.setBorderPainted(false);
				undo.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						drawArea.undo();
					}
				});
				
				topBar1right.add(label_3);
				topBar1right.add(basic);
				
				basic.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/13.png")));
				basic.setBackground(new Color(39, 39, 39));
				topBar1right.add(label_9);
				topBar1right.add(special);
				
				special.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/14.png")));
				special.setBackground(new Color(39, 39, 39));
				topBar1right.add(label_11);
				topBar1right.add(beautify);
				
				beautify.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/15.png")));
				beautify.setBackground(new Color(39, 39, 39));
				topBar1right.add(label_12);
				topBar1right.add(border);
				
				border.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/16.png")));
				border.setBackground(new Color(39, 39, 39));
				topBar1right.add(label_13);
				topBar1right.add(tag);
				
				tag.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/17.png")));
				tag.setBackground(new Color(39, 39, 39));
				topBar1right.add(label_14);
				topBar1right.add(text);
				text.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						JOptionPane.showMessageDialog(null, "请单击画板以确定输入文字的位置！","提示"
								,JOptionPane.INFORMATION_MESSAGE); 
						drawArea.setCurrentChoice(14);
						drawArea.createNewitem();
						drawArea.repaint();
					}
				});
				
				text.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/18.png")));
				text.setBackground(new Color(39, 39, 39));
				topBar1right.add(label_10);
				topBar1right.add(undo);
				
				undo.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/7.png")));
				undo.setBackground(new Color(39, 39, 39));
				undo.setBorderPainted(false);
				redo.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						drawArea.redo();
					}
				});
				
				topBar1right.add(label_4);
				topBar1right.add(redo);
				
				redo.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/8.png")));
				redo.setBackground(new Color(39, 39, 39));
				redo.setBorderPainted(false);

				originImg.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						drawArea.restore();
					}
				});
				
				topBar1right.add(label_5);
				topBar1right.add(originImg);
				
				originImg.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/9.png")));
				originImg.setBackground(new Color(39, 39, 39));
				originImg.setBorderPainted(false);
				
				topBar1right.add(label_6);
				topBar1right.add(shot);
				
				shot.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/10.png")));
				shot.setBackground(new Color(39, 39, 39));
				shot.setBorderPainted(false);
				
				topBar1right.add(label_7);
				topBar1right.add(share);
				
				share.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/11.png")));
				share.setBackground(new Color(39, 39, 39));
				share.setBorderPainted(false);

				save.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						fileClass.saveFile();
					}
				});
				
				topBar1right.add(label_8);
				topBar1right.add(save);
				
				save.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/12.png")));
				save.setBackground(new Color(39, 39, 39));
				save.setBorderPainted(false);
						topBar.add(topBar2Panel, BorderLayout.CENTER);
						topBar2Panel.setLayout(new BorderLayout(0, 0));
						topBar2Panel.add(topBar2, BorderLayout.WEST);
						topBar2Panel.setBackground(new Color(39, 39, 39));
						
						topBar2.setFloatable(false);
						topBar2.setBackground(new Color(39, 39, 39));
						topBarRightPanel.setBackground(new Color(153, 153, 153));
						topBarRightPanel.setSize(120, topBarRightPanel.getHeight());;
						
						topBar.add(topBarRightPanel, BorderLayout.EAST);
						topBarRightPanel.setLayout(new BorderLayout(0, 0));
						topBarRightPanel.add(topBarRight);
						topBarRight.setBackground(new Color(153, 153, 153));
						topBarRight.setFloatable(false);
						pallet.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent arg0) {
								drawArea.chooseColor();//颜色的选择
								bgcolor = new Color(drawArea.R, drawArea.G, drawArea.B);
								int[] rgbarray = new int[58*56];
								for(int i=0; i<rgbarray.length; i++){
									rgbarray[i] = new Color(drawArea.R, drawArea.G, drawArea.B).getRGB();
								}
								BufferedImage frontcolor = new BufferedImage(58, 56, BufferedImage.TYPE_INT_RGB);
								frontcolor.setRGB(0, 0, 58, 56, rgbarray, 0, 58);
								bgcolorLabel.setIcon(new ImageIcon(frontcolor));
							}
						});
						pallet.setBackground(new Color(153, 153, 153));
						pallet.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/1.png")));
						
						topBarRight.add(pallet);
						thickness.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent e) {
								drawArea.setStroke();//画笔粗细的调整
							}
						});
						thickness.setBackground(new Color(153, 153, 153));
						thickness.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/2.png")));
						
						topBarRight.add(thickness);
		
		leftBar.setBackground(new Color(39, 39, 39));
		leftBar.setOrientation(SwingConstants.VERTICAL);
		leftBar.setFloatable(false);
		getContentPane().add(leftBar, BorderLayout.WEST);
		leftBar1.setFloatable(false);
		leftBar1.setBackground(new Color(39, 39, 39));
		
		leftBar.add(leftBar1);
		leftBar1.add(leftBar11);
		
		leftBar11.setOrientation(SwingConstants.VERTICAL);
		leftBar11.setBackground(new Color(39, 39, 39));
		leftBar11.setFloatable(false);
		
		triangleLeft.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/triangleleft.png")));
		triangleLeft.setBackground(new Color(39, 39, 39));
		leftBar11.add(triangleLeft);
		
		trimbox.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/trimbox.png")));
		trimbox.setBackground(new Color(39, 39, 39));
		leftBar11.add(trimbox);
		box.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				drawArea.setCurrentChoice(23);
				drawArea.capture();
			}
		});
		
		box.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/box.png")));
		leftBar11.add(box);
		box.setBackground(new Color(39, 39, 39));
		
		flash.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/flash.png")));
		leftBar11.add(flash);
		flash.setBackground(new Color(39, 39, 39));
		leftBar1.add(leftBar12);
		
		leftBar12.setOrientation(SwingConstants.VERTICAL);
		leftBar12.setBackground(new Color(39, 39, 39));
		leftBar12.setFloatable(false);
		leftBar12.setBackground(new Color(39, 39, 39));
		
		triangleRight.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/triangleright.png")));
		leftBar12.add(triangleRight);
		triangleRight.setBackground(new Color(39, 39, 39));
		
		cursor.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/cursor.png")));
		leftBar12.add(cursor);
		cursor.setBackground(new Color(39, 39, 39));
		
		rope.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/rope.png")));
		leftBar12.add(rope);
		rope.setBackground(new Color(39, 39, 39));
		
		leftBar12.add(lblNewLabel_1);
		
		leftBar12.add(label_15);
		
		leftBar2.setFloatable(false);
		leftBar.add(leftBar2);
		leftBar2.setBackground(new Color(39, 39, 39));
		
		leftBar21.setFloatable(false);
		leftBar21.setOrientation(SwingConstants.VERTICAL);
		leftBar2.add(leftBar21);
		leftBar21.setBackground(new Color(39, 39, 39));
		pencil.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				drawArea.setCurrentChoice(3);
				drawArea.createNewitem();
				//drawArea.repaint();
			}
		});
		
		pencil.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/pencil.png")));
		leftBar21.add(pencil);
		pencil.setBackground(new Color(39, 39, 39));
		eraser.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				drawArea.setCurrentChoice(13);
				drawArea.createNewitem();
				drawArea.repaint();
			}
		});
		
		eraser.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/eraser.png")));
		leftBar21.add(eraser);
		eraser.setBackground(new Color(39, 39, 39));
		rectangle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				drawArea.setCurrentChoice(6);
				drawArea.createNewitem();
				drawArea.repaint();
			}
		});
		
		rectangle.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/rectangle.png")));
		leftBar21.add(rectangle);
		rectangle.setBackground(new Color(39, 39, 39));
		
		rotate.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/rotate.png")));
		leftBar21.add(rotate);
		rotate.setBackground(new Color(39, 39, 39));
		
		leftBar22.setFloatable(false);
		leftBar22.setOrientation(SwingConstants.VERTICAL);
		leftBar2.add(leftBar22);
		leftBar22.setBackground(new Color(39, 39, 39));
		
		brush.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/brush.png")));
		leftBar22.add(brush);
		brush.setBackground(new Color(39, 39, 39));
		bucket.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				drawArea.setCurrentChoice(4);
				drawArea.createNewitem();
				//drawArea.repaint();
			}
		});
		
		bucket.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/bucket.png")));
		leftBar22.add(bucket);
		bucket.setBackground(new Color(39, 39, 39));
		
		stamp.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/stamp.png")));
		leftBar22.add(stamp);
		stamp.setBackground(new Color(39, 39, 39));
		circle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				drawArea.setCurrentChoice(10);
				drawArea.createNewitem();
				drawArea.repaint();
			}
		});
		
		circle.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/circle.png")));
		leftBar22.add(circle);
		circle.setBackground(new Color(39, 39, 39));
		
		leftBar3.setFloatable(false);
		leftBar.add(leftBar3);
		leftBar3.setBackground(new Color(39, 39, 39));
		
		leftBar31.setFloatable(false);
		leftBar31.setOrientation(SwingConstants.VERTICAL);
		leftBar3.add(leftBar31);
		leftBar31.setBackground(new Color(39, 39, 39));
		
		liquid.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/liquid.png")));
		leftBar31.add(liquid);
		liquid.setBackground(new Color(39, 39, 39));
		
		finger.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/finger.png")));
		leftBar31.add(finger);
		finger.setBackground(new Color(39, 39, 39));
		
		blackloupe.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/blackloupe.png")));
		leftBar31.add(blackloupe);
		blackloupe.setBackground(new Color(39, 39, 39));
		
		eye.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/eye.png")));
		leftBar31.add(eye);
		eye.setBackground(new Color(39, 39, 39));
		
		enlarge.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/enlarge.png")));
		leftBar31.add(enlarge);
		enlarge.setBackground(new Color(39, 39, 39));
		
		liquidpen.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/liquidpen.png")));
		leftBar31.add(liquidpen);
		liquidpen.setBackground(new Color(39, 39, 39));
		
		grab.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/grab.png")));
		leftBar31.add(grab);
		grab.setBackground(new Color(39, 39, 39));
		
		leftBar32.setFloatable(false);
		leftBar32.setOrientation(SwingConstants.VERTICAL);
		leftBar3.add(leftBar32);
		leftBar32.setBackground(new Color(39, 39, 39));
		
		triangle.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/triangle.png")));
		leftBar32.add(triangle);
		triangle.setBackground(new Color(39, 39, 39));
		
		sponge.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/sponge.png")));
		leftBar32.add(sponge);
		sponge.setBackground(new Color(39, 39, 39));
		
		hand.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/hand.png")));
		leftBar32.add(hand);
		hand.setBackground(new Color(39, 39, 39));
		
		pen.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/pen.png")));
		leftBar32.add(pen);
		pen.setBackground(new Color(39, 39, 39));
		
		shrink.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/shrink.png")));
		leftBar32.add(shrink);
		shrink.setBackground(new Color(39, 39, 39));
		
		alphebet.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/alphabet.png")));
		leftBar32.add(alphebet);
		alphebet.setBackground(new Color(39, 39, 39));
		
		loupe.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/loupe.png")));
		leftBar32.add(loupe);
		loupe.setBackground(new Color(39, 39, 39));
		
		colorBar.setOrientation(SwingConstants.VERTICAL);
		colorBar.setFloatable(false);
		leftBar.add(colorBar);
		colorBar.setBackground(new Color(39, 39, 39));
		
		bgcolorBarBig.setFloatable(false);
		colorBar.add(bgcolorBarBig);
		bgcolorBarBig.setBackground(new Color(39, 39, 39));
		
		bgcolorLabel.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/bgcolor.png")));
		bgcolorBarBig.add(bgcolorLabel);
		bgcolorLabel.setBackground(new Color(39, 39, 39));
		
		bgcolorBarSmall.setOrientation(SwingConstants.VERTICAL);
		bgcolorBarSmall.setFloatable(false);
		colorBar.add(bgcolorBarSmall);
		bgcolorBarSmall.setBackground(new Color(39, 39, 39));
		
		bgcolorBarSmall1.setFloatable(false);
		bgcolorBarSmall.add(bgcolorBarSmall1);
		bgcolorBarSmall1.setBackground(new Color(39, 39, 39));
		bgcolor1Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Color tmp = bgcolor;
				bgcolor = bgcolor1;
				bgcolor1 = tmp;
				drawArea.R = bgcolor.getRed();
				drawArea.G = bgcolor.getGreen();
				drawArea.B = bgcolor.getBlue();
				BufferedImage tmpImage = new BufferedImage(58, 56, BufferedImage.TYPE_INT_RGB);
				int[] rgbArray = new int[58*56];
				for(int i=0; i<rgbArray.length; i++){
					rgbArray[i] = bgcolor.getRGB();
				}
				tmpImage.setRGB(0, 0, 58, 56, rgbArray, 0, 58);
				bgcolorLabel.setIcon(new ImageIcon(tmpImage));
				tmpImage = new BufferedImage(15, 15, BufferedImage.TYPE_INT_RGB);
				rgbArray = new int[15*15];
				for(int i=0; i<rgbArray.length; i++){
					rgbArray[i] = bgcolor1.getRGB();
				}
				tmpImage.setRGB(0, 0, 15, 15, rgbArray, 0, 15);
				bgcolor1Button.setIcon(new ImageIcon(tmpImage));
			}
		});
		
		bgcolor1Button.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/bgcolor1.png")));
		bgcolorBarSmall1.add(bgcolor1Button);
		bgcolor1Button.setBackground(new Color(39, 39, 39));
		bgcolor2Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Color tmp = bgcolor;
				bgcolor = bgcolor2;
				bgcolor2 = tmp;
				drawArea.R = bgcolor.getRed();
				drawArea.G = bgcolor.getGreen();
				drawArea.B = bgcolor.getBlue();
				BufferedImage tmpImage = new BufferedImage(58, 56, BufferedImage.TYPE_INT_RGB);
				int[] rgbArray = new int[58*56];
				for(int i=0; i<rgbArray.length; i++){
					rgbArray[i] = bgcolor.getRGB();
				}
				tmpImage.setRGB(0, 0, 58, 56, rgbArray, 0, 58);
				bgcolorLabel.setIcon(new ImageIcon(tmpImage));
				tmpImage = new BufferedImage(15, 15, BufferedImage.TYPE_INT_RGB);
				rgbArray = new int[15*15];
				for(int i=0; i<rgbArray.length; i++){
					rgbArray[i] = bgcolor2.getRGB();
				}
				tmpImage.setRGB(0, 0, 15, 15, rgbArray, 0, 15);
				bgcolor2Button.setIcon(new ImageIcon(tmpImage));
			}
		});
		
		bgcolor2Button.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/bgcolor2.png")));
		bgcolorBarSmall1.add(bgcolor2Button);
		bgcolor2Button.setBackground(new Color(39, 39, 39));
		bgcolor3Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Color tmp = bgcolor;
				bgcolor = bgcolor3;
				bgcolor3 = tmp;
				drawArea.R = bgcolor.getRed();
				drawArea.G = bgcolor.getGreen();
				drawArea.B = bgcolor.getBlue();
				BufferedImage tmpImage = new BufferedImage(58, 56, BufferedImage.TYPE_INT_RGB);
				int[] rgbArray = new int[58*56];
				for(int i=0; i<rgbArray.length; i++){
					rgbArray[i] = bgcolor.getRGB();
				}
				tmpImage.setRGB(0, 0, 58, 56, rgbArray, 0, 58);
				bgcolorLabel.setIcon(new ImageIcon(tmpImage));
				tmpImage = new BufferedImage(15, 15, BufferedImage.TYPE_INT_RGB);
				rgbArray = new int[15*15];
				for(int i=0; i<rgbArray.length; i++){
					rgbArray[i] = bgcolor3.getRGB();
				}
				tmpImage.setRGB(0, 0, 15, 15, rgbArray, 0, 15);
				bgcolor3Button.setIcon(new ImageIcon(tmpImage));
			}
		});
		
		bgcolor3Button.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/bgcolor3.png")));
		bgcolorBarSmall1.add(bgcolor3Button);
		bgcolor3Button.setBackground(new Color(39, 39, 39));
		
		bgcolorBarSmall2.setFloatable(false);
		bgcolorBarSmall.add(bgcolorBarSmall2);
		bgcolorBarSmall2.setBackground(new Color(39, 39, 39));
		bgcolor4Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Color tmp = bgcolor;
				bgcolor = bgcolor4;
				bgcolor4 = tmp;
				drawArea.R = bgcolor.getRed();
				drawArea.G = bgcolor.getGreen();
				drawArea.B = bgcolor.getBlue();
				BufferedImage tmpImage = new BufferedImage(58, 56, BufferedImage.TYPE_INT_RGB);
				int[] rgbArray = new int[58*56];
				for(int i=0; i<rgbArray.length; i++){
					rgbArray[i] = bgcolor.getRGB();
				}
				tmpImage.setRGB(0, 0, 58, 56, rgbArray, 0, 58);
				bgcolorLabel.setIcon(new ImageIcon(tmpImage));
				tmpImage = new BufferedImage(15, 15, BufferedImage.TYPE_INT_RGB);
				rgbArray = new int[15*15];
				for(int i=0; i<rgbArray.length; i++){
					rgbArray[i] = bgcolor4.getRGB();
				}
				tmpImage.setRGB(0, 0, 15, 15, rgbArray, 0, 15);
				bgcolor4Button.setIcon(new ImageIcon(tmpImage));
			}
		});
		
		bgcolor4Button.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/bgcolor4.png")));
		bgcolorBarSmall2.add(bgcolor4Button);
		bgcolor4Button.setBackground(new Color(39, 39, 39));
		bgcolor5Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Color tmp = bgcolor;
				bgcolor = bgcolor5;
				bgcolor5 = tmp;
				drawArea.R = bgcolor.getRed();
				drawArea.G = bgcolor.getGreen();
				drawArea.B = bgcolor.getBlue();
				BufferedImage tmpImage = new BufferedImage(58, 56, BufferedImage.TYPE_INT_RGB);
				int[] rgbArray = new int[58*56];
				for(int i=0; i<rgbArray.length; i++){
					rgbArray[i] = bgcolor.getRGB();
				}
				tmpImage.setRGB(0, 0, 58, 56, rgbArray, 0, 58);
				bgcolorLabel.setIcon(new ImageIcon(tmpImage));
				tmpImage = new BufferedImage(15, 15, BufferedImage.TYPE_INT_RGB);
				rgbArray = new int[15*15];
				for(int i=0; i<rgbArray.length; i++){
					rgbArray[i] = bgcolor5.getRGB();
				}
				tmpImage.setRGB(0, 0, 15, 15, rgbArray, 0, 15);
				bgcolor5Button.setIcon(new ImageIcon(tmpImage));
			}
		});
		
		bgcolor5Button.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/bgcolor5.png")));
		bgcolorBarSmall2.add(bgcolor5Button);
		bgcolor5Button.setBackground(new Color(39, 39, 39));
		bgcolor6Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Color tmp = bgcolor;
				bgcolor = bgcolor6;
				bgcolor6 = tmp;
				drawArea.R = bgcolor.getRed();
				drawArea.G = bgcolor.getGreen();
				drawArea.B = bgcolor.getBlue();
				BufferedImage tmpImage = new BufferedImage(58, 56, BufferedImage.TYPE_INT_RGB);
				int[] rgbArray = new int[58*56];
				for(int i=0; i<rgbArray.length; i++){
					rgbArray[i] = bgcolor.getRGB();
				}
				tmpImage.setRGB(0, 0, 58, 56, rgbArray, 0, 58);
				bgcolorLabel.setIcon(new ImageIcon(tmpImage));
				tmpImage = new BufferedImage(15, 15, BufferedImage.TYPE_INT_RGB);
				rgbArray = new int[15*15];
				for(int i=0; i<rgbArray.length; i++){
					rgbArray[i] = bgcolor6.getRGB();
				}
				tmpImage.setRGB(0, 0, 15, 15, rgbArray, 0, 15);
				bgcolor6Button.setIcon(new ImageIcon(tmpImage));
			}
		});
		
		bgcolor6Button.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/bgcolor6.png")));
		bgcolorBarSmall2.add(bgcolor6Button);
		bgcolor6Button.setBackground(new Color(39, 39, 39));
		
		getContentPane().add(drawArea, BorderLayout.CENTER);
		
		workspace.setSize(90, 1000);
		getContentPane().add(workspace, BorderLayout.EAST);
		workspace.setLayout(new BorderLayout(0, 0));
		importBar.setOrientation(SwingConstants.VERTICAL);
		importBar.setFloatable(false);
		
		workspace.add(importBar, BorderLayout.NORTH);
		importImg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				fileClass.openFile();
			}
		});
		importImg.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/add.png")));
		
		importBar.add(importImg);
		clearBar.setOrientation(SwingConstants.VERTICAL);
		clearBar.setFloatable(false);
		
		workspace.add(clearBar, BorderLayout.SOUTH);
		lblNewLabel.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/line.png")));
		
		clearBar.add(lblNewLabel);
		clearWorkspace.setIcon(new ImageIcon(NewDrawPad.class.getResource("/newIcon/clear.png")));
		
		clearBar.add(clearWorkspace);
		
	}
	
	//设置状态栏显示的字符
	public void setStratBar(String s) {
		startBar.setText(s);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(pencil == e.getSource()){
			drawArea.setCurrentChoice(3);
			drawArea.createNewitem();
			drawArea.repaint();
		}else if(bucket == e.getSource()){
			drawArea.setCurrentChoice(4);
			drawArea.createNewitem();
			drawArea.repaint();
		}else if(rectangle == e.getSource()){
			drawArea.setCurrentChoice(6);
			drawArea.createNewitem();
			drawArea.repaint();
		}else if(circle == e.getSource()){
			drawArea.setCurrentChoice(9);
			drawArea.createNewitem();
			drawArea.repaint();
		}else if(eraser == e.getSource()){
			drawArea.setCurrentChoice(13);
			drawArea.createNewitem();
			drawArea.repaint();
		}else if(text == e.getSource()){
			JOptionPane.showMessageDialog(null, "请单击画板以确定输入文字的位置！","提示"
					,JOptionPane.INFORMATION_MESSAGE); 
			drawArea.setCurrentChoice(14);
			drawArea.createNewitem();
			drawArea.repaint();
		}else if(pallet == e.getSource()){
			drawArea.chooseColor();//颜色的选择
		}else if(thickness == e.getSource()){
			drawArea.setStroke();//画笔粗细的调整
		}else if(design == e.getSource()){
			
		}else if(open == e.getSource()){
			
		}else if(save == e.getSource()){
			
		}
		
	}

}
