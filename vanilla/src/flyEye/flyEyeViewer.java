package flyEye;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import vncviewer.VNCViewer;

public class flyEyeViewer {
	
	private static ArrayList<JPanel> viewerJPanels;
	private static ArrayList<String> hostnames;
	private static ArrayList<VNCViewer> viewers;
	
	private static MouseListener ml = new MouseListener() {
    	
    	public void mouseClicked(MouseEvent e) {
    		//System.out.println("debug: mouseClicked event");
    		Point p = e.getPoint();
    		//System.out.println("debug: point "+p.toString());
    		
    		// for each frame...
    		for (int i = 0; i < viewerJPanels.size(); i++) {
    			
    			//System.out.println("debug: panellocation: ("+viewerJPanels.get(i).getX()+", "+viewerJPanels.get(i).getY()+")");
    			
    			if (viewers.get(i) != null && !viewers.get(i).ioException && viewers.get(i).cc.desktop.contains(p)) {
    				
    				String[] server = {"Server="+hostnames.get(i)+"::9001"};
    				
    				//System.out.println("debug: launching bigviewer");
    				VNCViewer bigViewer = new VNCViewer(server);
    				bigViewer.isBig = true;
    				bigViewer.start();
    				    				
    			}
    			
    		}
    		
    	}
    	
    	public void mouseEntered(MouseEvent e) {
    		//System.out.println("debug: mouseEntered event");
    	}
    	
    	public void mouseExited(MouseEvent e) {
    		//System.out.println("debug: mouseExited event");
    	}
    	
    	public void mouseReleased(MouseEvent e) {
    		//System.out.println("debug: mouseReleased event");
    	}
    	
    	public void mousePressed(MouseEvent e) {
    		//System.out.println("debug: mousePressed event");
    	}
    	
    };
	
	public static void main(String[] args) {
		
		if (args.length != 1) {
			System.out.println("Please supply a configuration file!");
			System.exit(-1);			
		}
		
		final String filename = args[0];
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
		
            	// make file
            	File configFile = new File(filename);		
            	
            	// parse config file for hostnames and locations
            	GridLayout layout = makeGridLayout(configFile);
            	//System.out.println("debug: "+layout.getRows()+" rows, "+layout.getColumns()+" cols");
            	
            	hostnames = getHostnames(configFile);
            	//System.out.println("debug: "+hostnames.toString());
            	// build the vnc viewers
            	viewers = makeVncViewers(hostnames);
            	initVncViewers(viewers);
            	
            	// display the vnc viewers
            	createAndShowGUI(layout, viewers);		
            	
            }
        });
        
	}
	
	public static GridLayout makeGridLayout(File configFile) {
		
		GridLayout layout;
		BufferedReader configBuffer = null;
		Scanner config = null;
		
		int rows = 0;
		int cols = 0;
		int curCols = 0;

		try {
			configBuffer = new BufferedReader(new FileReader(configFile));
			config = new Scanner(configBuffer);
			config.useDelimiter("\n");
		} catch (FileNotFoundException e) {
			System.out.println("file "+configFile+" has been eaten by kitties! nom!");
			e.printStackTrace();
			System.exit(-1);
		}

		// get ## of rows
		while (config.hasNext()) {
			
			String line = config.next();
			
			// get ## of cols
			Scanner thisLine = new Scanner(line);
			
			curCols = 0;
			while (thisLine.hasNext()) {
				
				thisLine.next();
				curCols++;
				
			}
			
			if (curCols > cols) cols = curCols;
			
			if (!line.isEmpty()) rows++; 
			
		}
		
		layout = new GridLayout(rows, cols, 5, 5);
		return layout;
		
	}
	
	public static ArrayList<String> getHostnames(File configFile) {
		
		ArrayList<String> hostnames = new ArrayList<String>();
		
		BufferedReader configBuffer = null;
		Scanner config = null;

		try {
			configBuffer = new BufferedReader(new FileReader(configFile));
			config = new Scanner(configBuffer);
		} catch (FileNotFoundException e) {
			System.out.println("file "+configFile+" has been eaten by kitties! nom!");
			e.printStackTrace();
			System.exit(-1);
		}
		
		while (config.hasNext()) {
			
			String next = config.next();
			if (!next.equalsIgnoreCase(".")) hostnames.add(next);
			else hostnames.add(null);
			
		}
		
		return hostnames;
		
	}
	
	public static ArrayList<VNCViewer> makeVncViewers(ArrayList<String> hostnames) {
		
		ArrayList<VNCViewer> viewers = new ArrayList<VNCViewer>(hostnames.size());
		
		for (int i = 0; i < hostnames.size(); i++) {
			
			if (hostnames.get(i) != null && !hostnames.get(i).equalsIgnoreCase(".")) {
				
				String[] vncArg = {"Server="+hostnames.get(i)+"::9000"};
				viewers.add(new VNCViewer(vncArg));
				
			} else {
				
				viewers.add(null);
				
			}
			
		}
		
		return viewers;
		
	}
	
	public static void initVncViewers(ArrayList<VNCViewer> viewers) {
		
		for (int i = 0; i < viewers.size(); i++) {
			if (viewers.get(i) != null) viewers.get(i).start();
		}
		
		try {
			
			for (int i = 0; i < viewers.size(); i++) {
				
				if (viewers.get(i) != null) {
					
					while (!viewers.get(i).ioHasBeenSet) Thread.sleep(10);
					if (!viewers.get(i).ioException) waitTillReady(viewers.get(i));
					
				}
				
			}
			
		} catch (InterruptedException e){
			System.out.println("Unhandled interrupt exception; terminating...");
			e.printStackTrace();
			System.exit(-1);
		}
		
	}
	
	public static void createAndShowGUI(GridLayout layout, ArrayList<VNCViewer> viewers) {
		
        JFrame thumbFrame = new JFrame("FlyEye Thumbnails");
        thumbFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        thumbFrame.setLayout(layout);
    	//thumbFrame.addMouseListener(ml);

    	boolean[] isButton = new boolean[viewers.size()];
    	viewerJPanels = new ArrayList<JPanel>(viewers.size()); 
    	
    	for (int i = 0; i < viewers.size(); i++) {
    		
    		if (viewers.get(i) != null) {
    			
    			viewerJPanels.add(new JPanel());
    			if (!viewers.get(i).ioException) {
    				
    				viewerJPanels.get(i).add(viewers.get(i).cc.desktop);
    				isButton[i] = false;
    				
    			} else {
    				
    				JButton jb = new JButton();
    				jb.setText("not available");
    				viewerJPanels.get(i).add(jb);
    				isButton[i] = true;
    				
    			}
    			
    		} else {
    			
    			viewerJPanels.add(new JPanel());
				JButton jb = new JButton();
				jb.setText("not available");
				viewerJPanels.get(i).add(jb);
    			isButton[i] = true;
				
    		}
    		
    	}
    	
    	for (int i = 0; i < viewerJPanels.size(); i++) {
    		
    		thumbFrame.getContentPane().add(viewerJPanels.get(i));
    		
    	}

        thumbFrame.pack();
        thumbFrame.setVisible(true);
    	
    	for (int i = 0; i < viewerJPanels.size(); i++) {
    		
    		if (viewerJPanels.get(i) != null && !isButton[i] 
    			&& !viewers.get(i).ioException) {
    			
    			viewers.get(i).cc.desktop.initGraphics();
				//viewerJPanels.get(i).addMouseListener(ml);
				viewers.get(i).cc.desktop.addMouseListener(ml);
				
    			
    		}
    		
    	}
    	
	}
	
	private static void waitTillReady(VNCViewer viewer) {
		
		while(!viewer.runIsCalled) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// this should never be called
				System.out.println("Unhandled interrupt exception; terminating...");
				e.printStackTrace();
			}
		}
		while(!viewer.cc.createIsCalled) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// this should never be called
				e.printStackTrace();
			}
		}
		
	}
	
}
