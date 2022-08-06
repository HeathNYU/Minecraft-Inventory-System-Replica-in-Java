package CraftingTable;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingContainer;
import java.util.Random;
import java.util.Set;

public class CraftingTable extends JFrame {
	
	private int lastType;
	private int lastID;
	
	private JLabel title = new JLabel("Heath's Minecraft Crafting Table");
	
	private JLabel craftingSlotEmpty1 = new JLabel();
    private JLabel craftingSlotEmpty2 = new JLabel();
    private JLabel craftingSlotEmpty3 = new JLabel();
    private JLabel craftingSlotEmpty4 = new JLabel();
    private JLabel craftingSlotEmpty5 = new JLabel();
    private JLabel craftingSlotEmpty6 = new JLabel();
    private JLabel craftingSlotEmpty7 = new JLabel();
    private JLabel craftingSlotEmpty8 = new JLabel();
    private JLabel craftingSlotEmpty9 = new JLabel();
    
    private List<JLabel> craftingSlotsEmpty = Arrays.asList(craftingSlotEmpty1,
											    		craftingSlotEmpty2,
											    		craftingSlotEmpty3,
											    		craftingSlotEmpty4,
											    		craftingSlotEmpty5,
											    		craftingSlotEmpty6,
											    		craftingSlotEmpty7,
											    		craftingSlotEmpty8,
											    		craftingSlotEmpty9);
    
    private JLabel resultSlotEmpty = new JLabel();
    
    private JLabel inventorySlotEmpty1 = new JLabel();
    private JLabel inventorySlotEmpty2 = new JLabel();
    private JLabel inventorySlotEmpty3 = new JLabel();
    private JLabel inventorySlotEmpty4 = new JLabel();
    private JLabel inventorySlotEmpty5 = new JLabel();
    private JLabel inventorySlotEmpty6 = new JLabel();
    private JLabel inventorySlotEmpty7 = new JLabel();
    private JLabel inventorySlotEmpty8 = new JLabel();
    private JLabel inventorySlotEmpty9 = new JLabel();
    private JLabel inventorySlotEmpty10 = new JLabel();
    private JLabel inventorySlotEmpty11 = new JLabel();
    private JLabel inventorySlotEmpty12 = new JLabel();
    private JLabel inventorySlotEmpty13 = new JLabel();
    private JLabel inventorySlotEmpty14 = new JLabel();
    private JLabel inventorySlotEmpty15 = new JLabel();
    private JLabel inventorySlotEmpty16 = new JLabel();
    private JLabel inventorySlotEmpty17 = new JLabel();
    private JLabel inventorySlotEmpty18 = new JLabel();
    private JLabel inventorySlotEmpty19 = new JLabel();
    private JLabel inventorySlotEmpty20 = new JLabel();
    private JLabel inventorySlotEmpty21 = new JLabel();
    private JLabel inventorySlotEmpty22 = new JLabel();
    private JLabel inventorySlotEmpty23 = new JLabel();
    private JLabel inventorySlotEmpty24 = new JLabel();
    private JLabel inventorySlotEmpty25 = new JLabel();
    private JLabel inventorySlotEmpty26 = new JLabel();
    private JLabel inventorySlotEmpty27 = new JLabel();
    private JLabel inventorySlotEmpty28 = new JLabel();
    private JLabel inventorySlotEmpty29 = new JLabel();
    private JLabel inventorySlotEmpty30 = new JLabel();
    private JLabel inventorySlotEmpty31 = new JLabel();
    private JLabel inventorySlotEmpty32 = new JLabel();
    private JLabel inventorySlotEmpty33 = new JLabel();
    private JLabel inventorySlotEmpty34 = new JLabel();
    private JLabel inventorySlotEmpty35 = new JLabel();
    private JLabel inventorySlotEmpty36 = new JLabel();
    
    private List<JLabel> inventorySlotsEmpty = new ArrayList<>(Arrays.asList(inventorySlotEmpty1,inventorySlotEmpty2,
																    		inventorySlotEmpty3,
																    		inventorySlotEmpty4,
																    		inventorySlotEmpty5,
																    		inventorySlotEmpty6,
																    		inventorySlotEmpty7,
																    		inventorySlotEmpty8,
																    		inventorySlotEmpty9,
																    		inventorySlotEmpty10,
																    		inventorySlotEmpty11,
																    		inventorySlotEmpty12,
																    		inventorySlotEmpty13,
																    		inventorySlotEmpty14,
																    		inventorySlotEmpty15,
																    		inventorySlotEmpty16,
																    		inventorySlotEmpty17,
																    		inventorySlotEmpty18,
																    		inventorySlotEmpty19,
																    		inventorySlotEmpty20,
																    		inventorySlotEmpty21,
																    		inventorySlotEmpty22,
																    		inventorySlotEmpty23,
																    		inventorySlotEmpty24,
																    		inventorySlotEmpty25,
																    		inventorySlotEmpty26,
																    		inventorySlotEmpty27,
																    		inventorySlotEmpty28,
																    		inventorySlotEmpty29,
																    		inventorySlotEmpty30,
																    		inventorySlotEmpty31,
																    		inventorySlotEmpty32,
																    		inventorySlotEmpty33,
																    		inventorySlotEmpty34,
																    		inventorySlotEmpty35,
																    		inventorySlotEmpty36));
	
	private JButton craftingSlot1 = new JButton();
    private JButton craftingSlot2 = new JButton();
    private JButton craftingSlot3 = new JButton();
    private JButton craftingSlot4 = new JButton();
    private JButton craftingSlot5 = new JButton();
    private JButton craftingSlot6 = new JButton();
    private JButton craftingSlot7 = new JButton();
    private JButton craftingSlot8 = new JButton();
    private JButton craftingSlot9 = new JButton();
    
    private List<JButton> craftingSlots = Arrays.asList(craftingSlot1,
											    		craftingSlot2,
											    		craftingSlot3,
											    		craftingSlot4,
											    		craftingSlot5,
											    		craftingSlot6,
											    		craftingSlot7,
											    		craftingSlot8,
											    		craftingSlot9);
    
    private JButton resultSlot = new JButton();
    
    private JButton inventorySlot1 = new JButton();
    private JButton inventorySlot2 = new JButton();
    private JButton inventorySlot3 = new JButton();
    private JButton inventorySlot4 = new JButton();
    private JButton inventorySlot5 = new JButton();
    private JButton inventorySlot6 = new JButton();
    private JButton inventorySlot7 = new JButton();
    private JButton inventorySlot8 = new JButton();
    private JButton inventorySlot9 = new JButton();
    private JButton inventorySlot10 = new JButton();
    private JButton inventorySlot11 = new JButton();
    private JButton inventorySlot12 = new JButton();
    private JButton inventorySlot13 = new JButton();
    private JButton inventorySlot14 = new JButton();
    private JButton inventorySlot15 = new JButton();
    private JButton inventorySlot16 = new JButton();
    private JButton inventorySlot17 = new JButton();
    private JButton inventorySlot18 = new JButton();
    private JButton inventorySlot19 = new JButton();
    private JButton inventorySlot20 = new JButton();
    private JButton inventorySlot21 = new JButton();
    private JButton inventorySlot22 = new JButton();
    private JButton inventorySlot23 = new JButton();
    private JButton inventorySlot24 = new JButton();
    private JButton inventorySlot25 = new JButton();
    private JButton inventorySlot26 = new JButton();
    private JButton inventorySlot27 = new JButton();
    private JButton inventorySlot28 = new JButton();
    private JButton inventorySlot29 = new JButton();
    private JButton inventorySlot30 = new JButton();
    private JButton inventorySlot31 = new JButton();
    private JButton inventorySlot32 = new JButton();
    private JButton inventorySlot33 = new JButton();
    private JButton inventorySlot34 = new JButton();
    private JButton inventorySlot35 = new JButton();
    private JButton inventorySlot36 = new JButton();
    
    private List<JButton> inventorySlots = new ArrayList<>(Arrays.asList(inventorySlot1,inventorySlot2,
																    		inventorySlot3,
																    		inventorySlot4,
																    		inventorySlot5,
																    		inventorySlot6,
																    		inventorySlot7,
																    		inventorySlot8,
																    		inventorySlot9,
																    		inventorySlot10,
																    		inventorySlot11,
																    		inventorySlot12,
																    		inventorySlot13,
																    		inventorySlot14,
																    		inventorySlot15,
																    		inventorySlot16,
																    		inventorySlot17,
																    		inventorySlot18,
																    		inventorySlot19,
																    		inventorySlot20,
																    		inventorySlot21,
																    		inventorySlot22,
																    		inventorySlot23,
																    		inventorySlot24,
																    		inventorySlot25,
																    		inventorySlot26,
																    		inventorySlot27,
																    		inventorySlot28,
																    		inventorySlot29,
																    		inventorySlot30,
																    		inventorySlot31,
																    		inventorySlot32,
																    		inventorySlot33,
																    		inventorySlot34,
																    		inventorySlot35,
																    		inventorySlot36));
    
    private JButton dummyButton = new JButton();
    private JButton dummyButton2 = new JButton();
    private JButton dummyButton3 = new JButton();
    
    private JButton connectButton = new JButton();
    private JButton updateButton = new JButton();
	
    Image slot;
    
    Image empty;
    Image stick;
    Image coal;
    Image cobblestone;
    Image ironIngot;
    Image goldIngot;
    Image diamond;
    Image string;
    Image flint;
    Image feather;
    Image honeycomb;
    
    Image fishingRod;
    Image bow;
    Image arrow;
    Image torch;
    Image candle;
    Image ladder;
    Image lever;
    Image shears;
    Image bucket;
    Image flintAndSteel;
    Image stoneShovel;
    Image ironShovel;
    Image goldenShovel;
    Image diamondShovel;
    Image stoneHoe;
    Image ironHoe;
    Image goldenHoe;
    Image diamondHoe;
    Image stoneSword;
    Image ironSword;
    Image goldenSword;
    Image diamondSword;
    Image stoneAxe;
    Image ironAxe;
    Image goldenAxe;
    Image diamondAxe;
    Image stonePickaxe;
    Image ironPickaxe;
    Image goldenPickaxe;
    Image diamondPickaxe;
    
    int inventory[] = new int[46];
    Map<Integer, Image> itemList = new HashMap<>();
    Map<Integer, Integer[]> costList = new HashMap<>();
    
    Socket socket = null;
    DataOutputStream toServer = null;
    DataInputStream fromServer = null;
    
	final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;
    final int FIELD_WIDTH = 10;
	
	public CraftingTable() {
		
		lastType = 0;
		lastID = 0;
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		setSize(1280,960);
		setLocationRelativeTo(null);
		setLayout(null);
		this.setTitle("Heath's Minecraft Crafting Table");
		setBackground(Color.LIGHT_GRAY);
		addComponentsToPane(this.getContentPane());
		
		setVisible(true);
		
		WindowListener exitListener = new WindowAdapter() {

		    @Override
		    public void windowClosing(WindowEvent e) {
		        int confirm = JOptionPane.showOptionDialog(
		             null, "Confirm exiting Heath's Minecraft Crafting Table?",
		             "Exit Confirmation", JOptionPane.YES_NO_OPTION,
		             JOptionPane.QUESTION_MESSAGE, null, null, null);
		        if (confirm == 0) {
					if (socket != null) {
						try {
							socket.close();
							System.out.println("Connection Closed");
						}
						catch (Exception e1) {
							System.err.println("Error while attempting to close connection.");
						}
					}
					setVisible(false);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					System.exit(0);
		        }
		    }
		};
		this.addWindowListener(exitListener);
		
	}
    
	public void addComponentsToPane(Container pane) {
		
		for(int i = 0; i < 46; i++) {
			
        	inventory[i] = 0;
        	
        }
		
		try {
			
			slot = ImageIO.read(getClass().getResource("/Slot.png")).getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
			
			empty = ImageIO.read(getClass().getResource("/Empty.png")).getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		    stick = ImageIO.read(getClass().getResource("/Stick.png")).getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		    cobblestone = ImageIO.read(getClass().getResource("/Cobblestone.png")).getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		    coal = ImageIO.read(getClass().getResource("/Coal.png")).getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		    ironIngot = ImageIO.read(getClass().getResource("/IronIngot.png")).getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		    goldIngot = ImageIO.read(getClass().getResource("/GoldIngot.png")).getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		    diamond = ImageIO.read(getClass().getResource("/Diamond.png")).getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		    string = ImageIO.read(getClass().getResource("/String.png")).getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		    flint = ImageIO.read(getClass().getResource("/Flint.png")).getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		    feather = ImageIO.read(getClass().getResource("/Feather.png")).getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		    honeycomb = ImageIO.read(getClass().getResource("/Honeycomb.png")).getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		    
		    fishingRod = ImageIO.read(getClass().getResource("/FishingRod.png")).getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		    bow = ImageIO.read(getClass().getResource("/Bow.png")).getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		    arrow = ImageIO.read(getClass().getResource("/Arrow.png")).getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		    torch = ImageIO.read(getClass().getResource("/Torch.png")).getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		    candle = ImageIO.read(getClass().getResource("/Candle.png")).getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		    ladder = ImageIO.read(getClass().getResource("/Ladder.png")).getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		    lever = ImageIO.read(getClass().getResource("/Lever.png")).getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		    shears = ImageIO.read(getClass().getResource("/Shears.png")).getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		    bucket = ImageIO.read(getClass().getResource("/Bucket.png")).getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		    flintAndSteel = ImageIO.read(getClass().getResource("/FlintAndSteel.png")).getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		    stoneShovel = ImageIO.read(getClass().getResource("/StoneShovel.png")).getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		    ironShovel = ImageIO.read(getClass().getResource("/IronShovel.png")).getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		    goldenShovel = ImageIO.read(getClass().getResource("/goldenShovel.png")).getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		    diamondShovel = ImageIO.read(getClass().getResource("/DiamondShovel.png")).getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		    stoneHoe = ImageIO.read(getClass().getResource("/StoneHoe.png")).getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		    ironHoe = ImageIO.read(getClass().getResource("/IronHoe.png")).getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		    goldenHoe = ImageIO.read(getClass().getResource("/goldenHoe.png")).getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		    diamondHoe = ImageIO.read(getClass().getResource("/DiamondHoe.png")).getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		    stoneSword = ImageIO.read(getClass().getResource("/StoneSword.png")).getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		    ironSword = ImageIO.read(getClass().getResource("/IronSword.png")).getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		    goldenSword = ImageIO.read(getClass().getResource("/goldenSword.png")).getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		    diamondSword = ImageIO.read(getClass().getResource("/DiamondSword.png")).getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		    stoneAxe = ImageIO.read(getClass().getResource("/StoneAxe.png")).getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		    ironAxe = ImageIO.read(getClass().getResource("/IronAxe.png")).getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		    goldenAxe = ImageIO.read(getClass().getResource("/goldenAxe.png")).getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		    diamondAxe = ImageIO.read(getClass().getResource("/DiamondAxe.png")).getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		    stonePickaxe = ImageIO.read(getClass().getResource("/StonePickaxe.png")).getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		    ironPickaxe = ImageIO.read(getClass().getResource("/IronPickaxe.png")).getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		    goldenPickaxe = ImageIO.read(getClass().getResource("/goldenPickaxe.png")).getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		    diamondPickaxe = ImageIO.read(getClass().getResource("/DiamondPickaxe.png")).getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		    
		}
		catch (Exception ex) {
			System.out.println(ex);
		}
		
		itemList.put(0, empty);
		itemList.put(1, stick);
		itemList.put(2, cobblestone);
		itemList.put(3, coal);
		itemList.put(4, ironIngot);
		itemList.put(5, goldIngot);
		itemList.put(6, diamond);
		itemList.put(7, string);
		itemList.put(8, flint);
		itemList.put(9, feather);
		itemList.put(10, honeycomb);
		itemList.put(11, fishingRod);
		itemList.put(12, bow);
		itemList.put(13, arrow);
		itemList.put(14, torch);
		itemList.put(15, candle);
		itemList.put(16, ladder);
		itemList.put(17, lever);
		itemList.put(18, shears);
		itemList.put(19, bucket);
		itemList.put(20, flintAndSteel);
		itemList.put(21, stoneShovel);
		itemList.put(22, ironShovel);
		itemList.put(23, goldenShovel);
		itemList.put(24, diamondShovel);
		itemList.put(25, stoneHoe);
		itemList.put(26, ironHoe);
		itemList.put(27, goldenHoe);
		itemList.put(28, diamondHoe);
		itemList.put(29, stoneSword);
		itemList.put(30, ironSword);
		itemList.put(31, goldenSword);
		itemList.put(32, diamondSword);
		itemList.put(33, stoneAxe);
		itemList.put(34, ironAxe);
		itemList.put(35, goldenAxe);
		itemList.put(36, diamondAxe);
		itemList.put(37, stonePickaxe);
		itemList.put(38, ironPickaxe);
		itemList.put(39, goldenPickaxe);
		itemList.put(40, diamondPickaxe);
		
		Integer[] fishingRod = {3,5,6,7,9};
		Integer[] bow = {2,3,4,6,8,9};
		Integer[] arrow = {2,5,8};
		Integer[] torch = {5,8};
		Integer[] candle = {2,5};
		Integer[] ladder = {1,3,4,5,6,7,9};
		Integer[] lever = {5,8};
		Integer[] shears = {5,7};
		Integer[] bucket = {4,6,8};
		Integer[] flintAndSteel = {4,5};
		Integer[] stoneShovel = {2,5,8};
		Integer[] ironShovel = {2,5,8};
		Integer[] goldenShovel = {2,5,8};
		Integer[] diamondShovel = {2,5,8};
		Integer[] stoneHoe = {1,2,5,8};
		Integer[] ironHoe = {1,2,5,8};
		Integer[] goldenHoe = {1,2,5,8};
		Integer[] diamondHoe = {1,2,5,8};
		Integer[] stoneSword = {2,5,8};
		Integer[] ironSword = {2,5,8};
		Integer[] goldenSword = {2,5,8};
		Integer[] diamondSword = {2,5,8};
		Integer[] stoneAxe = {1,2,4,5,8};
		Integer[] ironAxe = {1,2,4,5,8};
		Integer[] goldenAxe = {1,2,4,5,8};
		Integer[] diamondAxe = {1,2,4,5,8};
		Integer[] stonePickaxe = {1,2,3,5,8};
		Integer[] ironPickaxe = {1,2,3,5,8};
		Integer[] goldenPickaxe = {1,2,3,5,8};
		Integer[] diamondPickaxe = {1,2,3,5,8};
		
		costList.put(11, fishingRod);
		costList.put(12, bow);
		costList.put(13, arrow);
		costList.put(14, torch);
		costList.put(15, candle);
		costList.put(16, ladder);
		costList.put(17, lever);
		costList.put(18, shears);
		costList.put(19, bucket);
		costList.put(20, flintAndSteel);
		costList.put(21, stoneShovel);
		costList.put(22, ironShovel);
		costList.put(23, goldenShovel);
		costList.put(24, diamondShovel);
		costList.put(25, stoneHoe);
		costList.put(26, ironHoe);
		costList.put(27, goldenHoe);
		costList.put(28, diamondHoe);
		costList.put(29, stoneSword);
		costList.put(30, ironSword);
		costList.put(31, goldenSword);
		costList.put(32, diamondSword);
		costList.put(33, stoneAxe);
		costList.put(34, ironAxe);
		costList.put(35, goldenAxe);
		costList.put(36, diamondAxe);
		costList.put(37, stonePickaxe);
		costList.put(38, ironPickaxe);
		costList.put(39, goldenPickaxe);
		costList.put(40, diamondPickaxe);
		
		if (RIGHT_TO_LEFT) {
	        pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
	    }
		
		pane.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		if (shouldFill) {
		//Natural height, maximum width
		c.fill = GridBagConstraints.HORIZONTAL;
		}
		
		class MoveListener implements ActionListener {
			
			private int thisType;
			private int thisID;
			
			public MoveListener (int type, int id) {
				
				this.thisType = type;
				this.thisID = id;
				
			}
			
	         public void actionPerformed(ActionEvent e) {
	        	 
        	 	int temp;
        	 	
				if(lastType == 0) {
					 
					 if (thisType == 1 && inventory[thisID] != 0) {
						 
						 lastType = thisType;
						 lastID = thisID;
						 
					 }
					 
					 else if (thisType == 2 && inventory[thisID + 10] != 0) {
						 
						 lastType = thisType;
						 lastID = thisID;
						 
					 }
					 
					 else if (thisType == 3 && inventory[thisID] != 0) {
						 
						 lastType = thisType;
						 lastID = thisID;
						 
					 }
					 
					 else {
						 
						//Nothing happens
						 
					 }
					 
				}
	        	 
				else {
					
	        		 if (thisType == lastType && thisID == lastID) {
	        			 
	        			 //Nothing happens
	        			 
	 	        	 }
	 	        	 
	        		 else if (thisType == 1) {
	        			 
	        			 if (lastType == 1 && inventory[thisID] != inventory[lastID]) {
	        				 
	        				 temp = inventory[lastID];
		        			 inventory[lastID] = inventory[thisID];
		        			 inventory[thisID] = temp;
		        			 craftingSlots.get(thisID).setIcon(new ImageIcon(itemList.get(inventory[thisID])));
		        			 craftingSlots.get(lastID).setIcon(new ImageIcon(itemList.get(inventory[lastID])));
			        		 
			        		 lastType = 0;
			        		 lastID = 0;
			        		 
	        			 }
	        			 
	        			 else if (lastType == 2 && inventory[thisID] != inventory[lastID + 10]) {
	        				 
	        				 temp = inventory[lastID + 10];
		        			 inventory[lastID + 10] = inventory[thisID];
		        			 inventory[thisID] = temp;
		        			 craftingSlots.get(thisID).setIcon(new ImageIcon(itemList.get(inventory[thisID])));
		        			 inventorySlots.get(lastID).setIcon(new ImageIcon(itemList.get(inventory[lastID + 10])));
			        		 
			        		 lastType = 0;
			        		 lastID = 0;
			        		 
	        			 }
	        			 
	        			 else if (lastType == 3 && inventory[thisID] == 0) {
	        				 
	        				 //Clear ingredients
							 for (Integer i : costList.get(inventory[9])) {
								 inventory[i - 1] = 0;
								 craftingSlots.get(i - 1).setIcon(new ImageIcon(empty));
							 }
							 
							 inventory[thisID] = inventory[lastID];
							 inventory[lastID] = 0;
							 craftingSlots.get(thisID).setIcon(new ImageIcon(itemList.get(inventory[thisID])));
							 resultSlot.setIcon(new ImageIcon(empty));
							 
							 lastType = 0;
							 lastID = 0;
	        				 
	        			 }
	        			 
	        			 else {
	        				 
	        				 lastType = thisType;
							 lastID = thisID;
	        				 
	        			 }
	 	        	 }
	 	        	 
	        		 else if (thisType == 2) {
	        			 
	        			 if (lastType == 1 && inventory[thisID + 10] != inventory[lastID]) {
	        				 
	        				 temp = inventory[lastID];
		        			 inventory[lastID] = inventory[thisID + 10];
		        			 inventory[thisID + 10] = temp;
		        			 inventorySlots.get(thisID).setIcon(new ImageIcon(itemList.get(inventory[thisID + 10])));
		        			 craftingSlots.get(lastID).setIcon(new ImageIcon(itemList.get(inventory[lastID])));
		        			 
		        			 lastType = 0;
			        		 lastID = 0;
	        			 }
	        			 
	        			 else if (lastType == 2 && inventory[thisID + 10] != inventory[lastID + 10]) {
	        				 
	        				 temp = inventory[lastID + 10];
		        			 inventory[lastID + 10] = inventory[thisID + 10];
		        			 inventory[thisID + 10] = temp;
		        			 inventorySlots.get(thisID).setIcon(new ImageIcon(itemList.get(inventory[thisID + 10])));
		        			 inventorySlots.get(lastID).setIcon(new ImageIcon(itemList.get(inventory[lastID + 10])));
			        		 
			        		 lastType = 0;
			        		 lastID = 0;
			        		 
	        			 }
	        			 
	        			 else if (lastType == 3 && inventory[thisID + 10] == 0) {
	        				 
	        				 //Clear ingredients
			        		 for (Integer i : costList.get(inventory[9])) {
			        			 inventory[i - 1] = 0;
			        			 craftingSlots.get(i - 1).setIcon(new ImageIcon(empty));
			        		 }
        					 
		        			 inventory[thisID + 10] = inventory[lastID];
		        			 inventory[lastID] = 0;
		        			 inventorySlots.get(thisID).setIcon(new ImageIcon(itemList.get(inventory[thisID + 10])));
		        			 resultSlot.setIcon(new ImageIcon(empty));
			        		 
			        		 lastType = 0;
			        		 lastID = 0;
	        				 
	        			 }
	        			 
	        			 else {
	        				 
	        				 lastType = thisType;
							 lastID = thisID;
	        				 
	        			 }
	        			 
	 	        	 }
	        		 
	        		 else if (thisType == 3 && inventory[9] != 0) {
	        			 
	        			 lastType = thisType;
						 lastID = thisID;
	        			 
	        		 }
	        		 
	        		 else {
	        			 
	        			 lastType = 0;
		        		 lastID = 0;
	        			 
	        		 }
	        		 
	        		 //Recipes
	        		 recipies();
	        		 
	        	 }
	        	 
	         }
	     }
		
		class ConnectListener implements ActionListener {
			
			public void actionPerformed(ActionEvent e) {
				
				lastType = 0;
				lastID = 0;
				
				for(int i = 0; i < 46; i++) {
		        	inventory[i] = 0;
		        }
				
				for(int i = 0; i < 9; i++) {
		        	craftingSlots.get(i).setIcon(new ImageIcon(itemList.get(inventory[i])));
		        }
				
				resultSlot.setIcon(new ImageIcon(itemList.get(inventory[9])));
				
				for(int i = 0; i < 36; i++) {
		        	//inventorySlots.get(i).setText(String.valueOf(inventory[i]));
		        	inventorySlots.get(i).setIcon(new ImageIcon(itemList.get(inventory[i + 10])));
		        }
				
				try {
					socket = new Socket("localhost", 8000);
					System.out.println("Connection Successful");
				}
				
				catch (IOException e1) {
					JOptionPane.showMessageDialog(
				             null, "Server not detected. Please make sure the server is running.",
				             "Connection Failure", JOptionPane.ERROR_MESSAGE);
					e1.printStackTrace();
					System.out.println("Connection Failure");
				}
				
				try {
	
					// Create an input stream to receive data from the server
					fromServer = new DataInputStream(socket.getInputStream());
					
					// Create an output stream to send data to the server
					toServer = new DataOutputStream(socket.getOutputStream());
					
				}
				
				catch (IOException ex) {
				    	System.out.println(ex.toString());
			    }
			    
			    try {
			    	
			        int inventoryID = 1;
			        
			        toServer.writeInt(inventoryID);
			  
			        //Get inventory data from the server
			        for(int i = 10; i < 46; i++) {
			        	
			        	inventory[i] = fromServer.readInt();
			        	toServer.writeInt(inventory[i]);
			        	
			        }
			        
			        for(int i = 0; i < 36; i++) {
			        	
			        	//inventorySlots.get(i).setText(String.valueOf(inventory[i + 10]));
			        	inventorySlots.get(i).setIcon(new ImageIcon(itemList.get(inventory[i + 10])));
			        	
			        }
			        
			        System.out.println("Inventory " + inventoryID + " Loaded");
			        
			    }
				catch (IOException ex) {
					System.err.println(ex);
				}
			    
			}
			
	     }
		
		class UpdateInventoryListener implements ActionListener {
			
		    public void actionPerformed(ActionEvent e) {
		    	
		    	lastType = 0;
				lastID = 0;
				
				int counter;
				
				if (socket == null) {
					
					JOptionPane.showMessageDialog(
				             null, "No server connection.",
				             "Connection Failure", JOptionPane.ERROR_MESSAGE);
					System.out.println("Connection Failure");
					
				}
				
				else {
					
					for(int i = 0; i < 9; i++) {
						
						if (inventory[i] != 0) {
							
							counter = 0;
							
							while (inventory[counter + 10] != 0 && counter < 35) {
								
								counter++;
								
							}
							
							if (inventory[counter + 10] == 0) {
								
								inventory[counter + 10] = inventory[i];
								inventory[i] = 0;
								craftingSlots.get(i).setIcon(new ImageIcon(empty));
								inventorySlots.get(counter).setIcon(new ImageIcon(itemList.get(inventory[counter + 10])));
								
							}
							
						}
						
					}
					
					inventory[9] = 0;
					resultSlot.setIcon(new ImageIcon(empty));
				
					try {
						
						//Create an input stream to receive data from the server
						fromServer = new DataInputStream(socket.getInputStream());
						
						//Create an output stream to send data to the server
						toServer = new DataOutputStream(socket.getOutputStream());
						
					}
					
					catch (IOException ex) {
						
					    	System.out.println(ex.toString());
					    	
				    }
				    
				    try {
				        
				        for(int i = 0; i < 36; i++) {
				        	
				        	toServer.writeInt(inventory[i + 10]);
				        	
				        }
				        
				        toServer.flush();
				        
				        System.out.println("Inventory Updated");
				        
				    }
					catch (IOException ex) {
						
						System.err.println(ex);
						
					}
					
				}
			    
		    }
		}
		
		//Title
		
		title.setFont(new Font("Cambria", Font.PLAIN, 36));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0;
		c.weighty = 0.1;
		c.gridwidth = 0;
		c.ipady = 0;
		c.gridx = 2;
		c.gridy = 0;
		pane.add(title, c);
		
		//Create 9 Crafting Slots in 3x3 layout

		for (int row = 2; row < 5; row++) {
			for (int column = 2; column < 5; column++) {
				int buttonID = (row - 2) * (5 - 2) + column - 2;
				craftingSlots.get(buttonID).setOpaque(false);
				craftingSlots.get(buttonID).setContentAreaFilled(false);
				craftingSlots.get(buttonID).setBorderPainted(false);
				craftingSlots.get(buttonID).setPreferredSize(new Dimension(68, 68));
				//craftingSlots.get(buttonID).setFont(new Font("Cambria", Font.PLAIN, 0));
				//craftingSlots.get(buttonID).setText("0");
				craftingSlots.get(buttonID).setIcon(new ImageIcon(empty));
				c.weightx = 0;
				c.weighty = 0;
				c.gridwidth = 1;
				c.ipady = 0;
				c.gridx = column;
				c.gridy = row;
				pane.add(craftingSlots.get(buttonID), c);
			
				craftingSlots.get(buttonID).addActionListener(new MoveListener(1, buttonID));
			}
		}
		
		for (int row = 2; row < 5; row++) {
			for (int column = 2; column < 5; column++) {
				int slotID = (row - 2) * (5 - 2) + column - 2;
				craftingSlotsEmpty.get(slotID).setOpaque(false);
				craftingSlotsEmpty.get(slotID).setPreferredSize(new Dimension(68, 68));
				craftingSlotsEmpty.get(slotID).setIcon(new ImageIcon(slot));
				c.weightx = 0;
				c.weighty = 0;
				c.gridwidth = 1;
				c.ipady = 0;
				c.gridx = column;
				c.gridy = row;
				pane.add(craftingSlotsEmpty.get(slotID), c);
			}
		}
		
		//Result slot
		
		resultSlot.setOpaque(false);
		resultSlot.setContentAreaFilled(false);
		resultSlot.setBorderPainted(false);
		resultSlot.setPreferredSize(new Dimension(68, 68));
		//resultSlot.setText("0");
		resultSlot.setIcon(new ImageIcon(empty));
		c.weightx = 0;
		c.weighty = 0;
		c.gridwidth = 1;
		c.ipady = 0;
		c.gridx = 7;
		c.gridy = 3;
		pane.add(resultSlot, c);
		
		resultSlotEmpty.setOpaque(false);
		resultSlotEmpty.setPreferredSize(new Dimension(68, 68));
		resultSlotEmpty.setIcon(new ImageIcon(slot));
		c.weightx = 0;
		c.weighty = 0;
		c.gridwidth = 1;
		c.ipady = 0;
		c.gridx = 7;
		c.gridy = 3;
		pane.add(resultSlotEmpty, c);
		
		resultSlot.addActionListener(new MoveListener(3, 9));
		
		//Invisible button in between two sections as a filler
		
		dummyButton.setOpaque(false);
		dummyButton.setContentAreaFilled(false);
		dummyButton.setBorderPainted(false);
		dummyButton.setEnabled(false);
		dummyButton.setPreferredSize(new Dimension(68, 68));
		c.weightx = 0;
		c.weighty = 0;
		c.gridwidth = 1;
		c.ipady = 0;
		c.gridx = 0;
		c.gridy = 5;
		pane.add(dummyButton, c);
		
		//Invisible buttons at two corners
		
		dummyButton2.setOpaque(false);
		dummyButton2.setContentAreaFilled(false);
		dummyButton2.setBorderPainted(false);
		dummyButton2.setEnabled(false);
		dummyButton.setPreferredSize(new Dimension(68, 68));
		c.weightx = .2;
		c.weighty = .2;
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 11;
		pane.add(dummyButton2, c);
		
		dummyButton3.setOpaque(false);
		dummyButton3.setContentAreaFilled(false);
		dummyButton3.setBorderPainted(false);
		dummyButton3.setEnabled(false);
		dummyButton.setPreferredSize(new Dimension(68, 68));
		c.weightx = .2;
		c.weighty = .2;
		c.gridwidth = 1;
		c.gridx = 10;
		c.gridy = 11;
		pane.add(dummyButton3, c);
		
		//Create 36 Crafting Slots in 9x4 layout
		
		for (int row = 7; row < 11; row++) {
			for (int column = 1; column < 10; column++) {
				int buttonID = (row - 7) * (10 - 1) + column - 1;
				inventorySlots.get(buttonID).setOpaque(false);
				inventorySlots.get(buttonID).setContentAreaFilled(false);
				inventorySlots.get(buttonID).setBorderPainted(false);
				inventorySlots.get(buttonID).setPreferredSize(new Dimension(68, 68));
				//inventorySlots.get(buttonID).setText("0");
				inventorySlots.get(buttonID).setIcon(new ImageIcon(empty));
				c.weightx = 0;
				c.weighty = 0;
				c.gridwidth = 1;
				c.gridx = column;
				c.gridy = row;
				pane.add(inventorySlots.get(buttonID), c);
				
				inventorySlots.get(buttonID).addActionListener(new MoveListener(2, buttonID));
			}
		}
		
		for (int row = 7; row < 11; row++) {
			for (int column = 1; column < 10; column++) {
				int slotID = (row - 7) * (10 - 1) + column - 1;
				inventorySlotsEmpty.get(slotID).setOpaque(false);
				inventorySlotsEmpty.get(slotID).setPreferredSize(new Dimension(68, 68));
				inventorySlotsEmpty.get(slotID).setIcon(new ImageIcon(slot));
				c.weightx = 0;
				c.weighty = 0;
				c.gridwidth = 1;
				c.gridx = column;
				c.gridy = row;
				pane.add(inventorySlotsEmpty.get(slotID), c);
			}
		}
		
		connectButton.setText("Connect to Server and Load Inventory");
		c.insets = new Insets(0,0,0,10);
		c.weightx = 0;
		c.weighty = 0;
		c.gridwidth = 4;
		c.gridheight = 2;
		c.ipady = 10;
		c.gridx = 1;
		c.gridy = 11;
		pane.add(connectButton, c);
		
		connectButton.addActionListener(new ConnectListener());
		
		updateButton.setText("Update Inventory");
		c.insets = new Insets(0,0,0,10);
		c.weightx = 0;
		c.weighty = 0;
		c.gridwidth = 4;
		c.gridheight = 2;
		c.ipady = 10;
		c.gridx = 6;
		c.gridy = 11;
		pane.add(updateButton, c);
		
		updateButton.addActionListener(new UpdateInventoryListener());
		
	}
    
	public void recipies() {
		
		int result;
		inventory[9] = 0;
		resultSlot.setIcon(new ImageIcon(empty));
		
		if (inventory[2] == 1 && inventory[4] == 1 && inventory[5] == 7 && inventory[6] == 1 && inventory[8] == 7) {
			
			result = 11;
			
			inventory[9] = result;
			resultSlot.setIcon(new ImageIcon(itemList.get(result)));
		}
		
		if (inventory[1] == 1 && inventory[2] == 7 && inventory[3] == 1 && inventory[5] == 7 && inventory[7] == 1 && inventory[8] == 7) {
			
			result = 12;
			
			inventory[9] = result;
			resultSlot.setIcon(new ImageIcon(itemList.get(result)));
		}
		
		
		if (inventory[1] == 8 && inventory[4] == 1 && inventory[7] == 9) {
			
			result = 13;
			
			inventory[9] = result;
			resultSlot.setIcon(new ImageIcon(itemList.get(result)));
		}
		
		
		if (inventory[4] == 3 && inventory[7] == 1) {
			
			result = 14;
			
			inventory[9] = result;
			resultSlot.setIcon(new ImageIcon(itemList.get(result)));
		}
		
		
		if (inventory[1] == 7 && inventory[4] == 10) {
			
			result = 15;
			
			inventory[9] = result;
			resultSlot.setIcon(new ImageIcon(itemList.get(result)));
		}
		
		
		if (inventory[0] == 1 && inventory[2] == 1 && inventory[3] == 1 &&inventory[4] == 1 && inventory[5] == 1 && inventory[6] == 1 && inventory[8] == 1) {
			
			result = 16;
			
			inventory[9] = result;
			resultSlot.setIcon(new ImageIcon(itemList.get(result)));
		}
		
		
		if (inventory[4] == 1 && inventory[7] == 2) {
			
			result = 17;
			
			inventory[9] = result;
			resultSlot.setIcon(new ImageIcon(itemList.get(result)));
		}
		
		
		if (inventory[4] == 4 && inventory[6] == 4) {
			
			result = 18;
			
			inventory[9] = result;
			resultSlot.setIcon(new ImageIcon(itemList.get(result)));
		}
		
		
		if (inventory[3] == 4 && inventory[5] == 4 && inventory[7] == 4) {
			
			result = 19;
			
			inventory[9] = result;
			resultSlot.setIcon(new ImageIcon(itemList.get(result)));
		}
		
		
		if (inventory[3] == 4 && inventory[4] == 8) {
			
			result = 20;
			
			inventory[9] = result;
			resultSlot.setIcon(new ImageIcon(itemList.get(result)));
		}
		
		if (inventory[1] == 2 && inventory[4] == 1 && inventory[7] == 1) {
			
			result = 21;
			
			inventory[9] = result;
			resultSlot.setIcon(new ImageIcon(itemList.get(result)));
		}
		
		if (inventory[1] == 4 && inventory[4] == 1 && inventory[7] == 1) {
			
			result = 22;
			
			inventory[9] = result;
			resultSlot.setIcon(new ImageIcon(itemList.get(result)));
		}
		
		
		if (inventory[1] == 5 && inventory[4] == 1 && inventory[7] == 1) {
			
			result = 23;
			
			inventory[9] = result;
			resultSlot.setIcon(new ImageIcon(itemList.get(result)));
		}
		
		
		if (inventory[1] == 6 && inventory[4] == 1 && inventory[7] == 1) {
			
			result = 24;
			
			inventory[9] = result;
			resultSlot.setIcon(new ImageIcon(itemList.get(result)));
		}
		
		
		if (inventory[0] == 2 && inventory[1] == 2 && inventory[4] == 1 && inventory[7] == 1) {
			
			result = 25;
			
			inventory[9] = result;
			resultSlot.setIcon(new ImageIcon(itemList.get(result)));
		}
		
		
		if (inventory[0] == 4 && inventory[1] == 4 && inventory[4] == 1 && inventory[7] == 1) {
			
			result = 26;
			
			inventory[9] = result;
			resultSlot.setIcon(new ImageIcon(itemList.get(result)));
		}
		
		
		if (inventory[0] == 5 && inventory[1] == 5 && inventory[4] == 1 && inventory[7] == 1) {
			
			result = 27;
			
			inventory[9] = result;
			resultSlot.setIcon(new ImageIcon(itemList.get(result)));
		}
		
		
		if (inventory[0] == 6 && inventory[1] == 6 && inventory[4] == 1 && inventory[7] == 1) {
			
			result = 28;
			
			inventory[9] = result;
			resultSlot.setIcon(new ImageIcon(itemList.get(result)));
		}
		
		
		if (inventory[1] == 2 && inventory[4] == 2 && inventory[7] == 1) {
			
			result = 29;
			
			inventory[9] = result;
			resultSlot.setIcon(new ImageIcon(itemList.get(result)));
		}
		
		
		if (inventory[1] == 4 && inventory[4] == 4 && inventory[7] == 1) {
			
			result = 30;
			
			inventory[9] = result;
			resultSlot.setIcon(new ImageIcon(itemList.get(result)));
		}
		
		
		if (inventory[1] == 5 && inventory[4] == 5 && inventory[7] == 1) {
			
			result = 31;
			
			inventory[9] = result;
			resultSlot.setIcon(new ImageIcon(itemList.get(result)));
		}
		
		if (inventory[1] == 6 && inventory[4] == 6 && inventory[7] == 1) {
			
			result = 32;
			
			inventory[9] = result;
			resultSlot.setIcon(new ImageIcon(itemList.get(result)));
		}
		
		
		if (inventory[0] == 2 && inventory[1] == 2 && inventory[3] == 2 && inventory[4] == 1 && inventory[7] == 1) {
			
			result = 33;
			
			inventory[9] = result;
			resultSlot.setIcon(new ImageIcon(itemList.get(result)));
		}
		
		
		if (inventory[0] == 4 && inventory[1] == 4 && inventory[3] == 4 && inventory[4] == 1 && inventory[7] == 1) {
			
			result = 34;
			
			inventory[9] = result;
			resultSlot.setIcon(new ImageIcon(itemList.get(result)));
		}
		
		
		if (inventory[0] == 5 && inventory[1] == 5 && inventory[3] == 5 && inventory[4] == 1 && inventory[7] == 1) {
			
			result = 35;
			
			inventory[9] = result;
			resultSlot.setIcon(new ImageIcon(itemList.get(result)));
		}
		
		
		if (inventory[0] == 6 && inventory[1] == 6 && inventory[3] == 6 && inventory[4] == 1 && inventory[7] == 1) {
			
			result = 36;
			
			inventory[9] = result;
			resultSlot.setIcon(new ImageIcon(itemList.get(result)));
		}
		
		
		if (inventory[0] == 2 && inventory[1] == 2 && inventory[2] == 2 && inventory[4] == 1 && inventory[7] == 1) {
			
			result = 37;
			
			inventory[9] = result;
			resultSlot.setIcon(new ImageIcon(itemList.get(result)));
		}
		
		
		if (inventory[0] == 4 && inventory[1] == 4 && inventory[2] == 4 && inventory[4] == 1 && inventory[7] == 1) {
			
			result = 38;
			
			inventory[9] = result;
			resultSlot.setIcon(new ImageIcon(itemList.get(result)));
		}
		
		
		if (inventory[0] == 5 && inventory[1] == 5 && inventory[2] == 5 && inventory[4] == 1 && inventory[7] == 1) {
			
			result = 39;
			
			inventory[9] = result;
			resultSlot.setIcon(new ImageIcon(itemList.get(result)));
		}
		
		
		if (inventory[0] == 6 && inventory[1] == 6 && inventory[2] == 6 && inventory[4] == 1 && inventory[7] == 1) {
			
			result = 40;
			
			inventory[9] = result;
			resultSlot.setIcon(new ImageIcon(itemList.get(result)));
		}
		
	}
	
    public static void main(String[] args) {
    	CraftingTable ct = new CraftingTable();
	}
}
