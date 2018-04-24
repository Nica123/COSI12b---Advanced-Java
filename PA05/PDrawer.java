import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class PDrawer extends JPanel {

	/**
	* create PDrawer User interface including sketchpad
	*/
  static Boolean lineshape = true;
  static Color drawingColor = Color.black;
  static String drawingShape = "pen";


	public PDrawer(){
		super();
		JPanel content = this;
		content.setLayout(new BorderLayout());

		// create the header
		JPanel headerPanel = new JPanel();
		headerPanel.add(new JLabel("<html><h1>PDrawer</h1></html>"));
		content.add(headerPanel,BorderLayout.PAGE_START);

    // create the info panel
    JTabbedPane tabbedPane = new JTabbedPane();
    //Create the "cards".
    JPanel card1 = new JPanel();
    card1.setLayout(new GridLayout(0,2));
    JButton black = new JButton("Black"); card1.add(black); black.setBackground(Color.black);black.setForeground(Color.white);
    JButton blue = new JButton("Blue"); card1.add(blue); blue.setBackground(Color.blue); blue.setForeground(Color.white);
    JButton green = new JButton("Green"); card1.add(green); green.setBackground(Color.green);green.setForeground(Color.black);
    JButton cyan = new JButton("Cyan"); card1.add(cyan); cyan.setBackground(Color.cyan);cyan.setForeground(Color.black);
    JButton darkGray = new JButton("Dark Gray"); card1.add(darkGray); darkGray.setBackground(Color.darkGray);darkGray.setForeground(Color.white);
    JButton gray = new JButton("Gray"); card1.add(gray); gray.setBackground(Color.gray);gray.setForeground(Color.white);
    JButton lightGray = new JButton("Light Gray"); card1.add(lightGray); lightGray.setBackground(Color.lightGray);lightGray.setForeground(Color.black);
    JButton magenta = new JButton("Magenta"); card1.add(magenta); magenta.setBackground(Color.magenta);magenta.setForeground(Color.white);
    JButton orange = new JButton("Orange"); card1.add(orange); orange.setBackground(Color.orange);orange.setForeground(Color.white);
    JButton pink = new JButton("pink"); card1.add(pink); pink.setBackground(Color.pink);pink.setForeground(Color.white);
    JButton red = new JButton("red"); card1.add(red); red.setBackground(Color.red);red.setForeground(Color.white);
    JButton yellow = new JButton("Customized"); card1.add(yellow); yellow.setBackground(Color.white);yellow.setForeground(Color.black);


    JPanel card2 = new JPanel();
    card2.setLayout(new GridLayout(0,1));
    JButton pen = new JButton("Pen"); card2.add(pen);
    JButton circle = new JButton("Circle"); card2.add(circle);
    JButton oval = new JButton("Oval"); card2.add(oval);
    JButton arc = new JButton("Arc"); card2.add(arc);
    JButton rectangle = new JButton("Rectangle"); card2.add(rectangle);
    JButton square = new JButton("Square"); card2.add(square);
    JButton clear = new JButton("Clear"); card2.add(clear); clear.setBackground(Color.darkGray); clear.setForeground(Color.pink);
    JButton eraser = new JButton("Eraser"); card2.add(eraser);

    tabbedPane.addTab("Colors", card1);
    tabbedPane.addTab("Shapes", card2);
    content.add(tabbedPane, BorderLayout.LINE_START);

    //add functionality to color buttons(set color)
    black.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
        drawingColor = Color.black;
			}
		});
    blue.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
        drawingColor = Color.blue;
			}
		});
    green.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
        drawingColor = Color.green;
			}
		});
    cyan.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
        drawingColor = Color.cyan;
			}
		});
    darkGray.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
        drawingColor = Color.darkGray;
			}
		});
    gray.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
        drawingColor = Color.gray;
			}
		});
    lightGray.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
        drawingColor = Color.lightGray;
			}
		});
    magenta.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
        drawingColor = Color.magenta;
			}
		});
    orange.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
        drawingColor = Color.orange;
			}
		});
    pink.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
        drawingColor = Color.pink;
			}
		});
    red.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
        drawingColor = Color.red;
			}
		});
    // yellow.addActionListener(new ActionListener(){
		// 	public void actionPerformed(ActionEvent e){
    //     // drawingColor = Color.yellow;
    //
		// 	}
		// });

    yellow.addActionListener(new ActionListener() {
          public void actionPerformed( ActionEvent e ){
             drawingColor =JColorChooser.showDialog( PDrawer.this,"Choose a color", drawingColor );
             if ( drawingColor == null )
                drawingColor = Color.black;
             yellow.setBackground( drawingColor );
          }
       }
    );


    //add functionality to shape buttons
    pen.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
        drawingShape = "";
        lineshape = true;
			}
		});

    circle.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
        drawingShape = "circle";
        lineshape = false;
			}
		});

    oval.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
        drawingShape = "oval";
        lineshape = false;
			}
		});

    arc.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
        drawingShape = "arc";
        lineshape = false;
			}
		});

    rectangle.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
        drawingShape = "rectangle";
        lineshape = false;
			}
		});

    square.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
        drawingShape = "square";
        lineshape = false;
			}
		});
    clear.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
        drawingShape = "clear";
        lineshape = true;
			}
		});
    eraser.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){

			}
		});

		// create the Sketchpad
		Sketchpad sketchPanel = new Sketchpad();
    //sketchPanel.setBackground(Color.white);
		content.add(sketchPanel,BorderLayout.CENTER);

	}

  //Sketchpad
  //---------------------------------------------------------------------


  public class Sketchpad extends JPanel implements MouseListener, MouseMotionListener {

		/*
			We will keep track of the current drawing using an arraylist of points ..

		*/
    public ArrayList<Line> lines = new ArrayList<Line>();
    public ArrayList<Shape> shapes = new ArrayList<Shape>();
    public ArrayList<Point> points = new ArrayList<Point>();
		public int lastx=0;
		public int lasty=0;

    /**
     * This constructor simply sets the background color of the panel to be black
     * and sets the panel to listen for mouse events on itself.
     */
    public Sketchpad() {
        setBackground(Color.black);
        addMouseListener(this);
				addMouseMotionListener(this);
    }


  		/**
  		 *
  		 */
		public void paintComponent(Graphics g){
      // make a wihte sketchpad
			 g.setColor(Color.white);
			 g.fillRect(0,0,getWidth(),getHeight());
      // drawing shapes
       if(shapes.size()!=0){
         for(Shape s: shapes){
           s.draw(g);
         }
       }

       //drawing stored lines
			 if (lines.size()==0)
			   return;
       Point lastPoint;
       for(Line l: lines){
         lastPoint = l.p.get(0);
         for(Point p: l.p){
           g.setColor(l.c);
  				 g.drawLine(lastPoint.x,lastPoint.y, p.x, p.y);
  				 lastPoint = p;
  			 }
       }

       //draw current line
       if (points.size()==0)
			   return;
       Point lastPoint2 = points.get(0);
       for(Point p:points){
         g.setColor(drawingColor);
				 g.drawLine(lastPoint2.x,lastPoint2.y, p.x, p.y);
				 lastPoint2 = p;
       }

		 }

    /**
		 * MouseListener interface methods ...
     */
    public void mousePressed(MouseEvent evt) {
        if ( drawingShape.equals("clear")){
            shapes.clear();
            //points.clear();
            lines.clear();
            lineshape = true;
            return;
        } else {
					// no buttons are pressed
					lastx = evt.getX();  // x-coordinate where user clicked.
					lasty = evt.getY();  // y-coordinate where user clicked.
				}
        //add shape to shapes
        switch(drawingShape){
          case "rectangle":
            //colorshape.add(drawingColor);
            Shape a = new Shape(lastx,lasty,drawingColor,"rectangle");
            shapes.add(a);
            break;
          case "oval":
            Shape b = new Shape(lastx,lasty,drawingColor,"oval");
            shapes.add(b);
            break;
          case "circle":
            Shape c = new Shape(lastx,lasty,drawingColor,"circle");
            shapes.add(c);
            break;
          case "square":
            Shape d = new Shape(lastx,lasty,drawingColor,"square");
            shapes.add(d);
            break;
          case "arc":
            Shape e = new Shape(lastx,lasty,drawingColor,"arc");
            shapes.add(e);
            break;
          default:
            break;
        }

        repaint();

     }// end mousePressed();


      // The next four empty routines are required by the MouseListener interface.
      // They don't do anything in this class, so their definitions are empty.

  	 public void mouseEntered(MouseEvent evt) { }
		 public void mouseExited(MouseEvent evt) { }
		 public void mouseClicked(MouseEvent evt) { }
		 public void mouseReleased(MouseEvent evt) {
       if(lineshape== true){
         //ArrayList<Point>  tempoints = new ArrayList<Point>();
         //Line l = new Line(tempoints,drawingColor);
         //System.out.printf(" %d\n",l.p.size());

         Line l = new Line(new ArrayList<Point>(points),drawingColor);
         lines.add(l);
         points.clear();
         repaint();
         //System.out.printf(" %d\n",l.p.size());
        }
     }

  	 // these are the MouseMotionEvent methods
  	 public void mouseMoved(MouseEvent evt){ }
  	 public void mouseDragged(MouseEvent evt){
        if(lineshape==true){
          int x = evt.getX();  // x-coordinate where user clicked.
    			int y = evt.getY();  // y-coordinate where user clicked.
          points.add(new Point(x,y));
          repaint();
        }
  	 }


  	 class Point{
  			int x;
  			int y;
  			Point(int x,int y){
  				this.x=x; this.y=y;
  			}
        public String toString(){
          return ""+x+","+y;
        }
  		}
     class Line{
       Color c;
       ArrayList<Point> p;
       Line(ArrayList<Point> p,Color c){
         this.p =  p; this.c = c;
       }
     }

     class Shape{
        int x,y;
        Color c;
        String shape;
        Shape(int x,int y,Color c,String shape){
          this.x=x; this.y=y; this.c=c; this.shape=shape;
        }

        public void draw(Graphics g){
          if (shape.equals("rectangle")){
            g.setColor(c);
            g.fillRect( x - 30, y - 15, 60, 30 );
            g.setColor(c);
            g.drawRect( x - 30, y - 15, 60, 30 );
          } else if (shape.equals("oval")){
            g.setColor(c);
            g.fillOval( x - 30, y - 15, 60, 30 );
            g.setColor(c);
            g.drawOval( x - 30, y - 15, 60, 30 );
          } else if(shape.equals("circle")){
            g.setColor(c);
            g.fillOval( x - 30, y - 30, 60, 60 );
            g.setColor(c);
            g.drawOval( x - 30, y - 30, 60, 60 );
          } else if(shape.equals("arc")){
            g.setColor(c);
            g.drawArc( x - 30, y - 30, 60, 60, 155, -100 );
            g.setColor(c);
            g.drawArc( x - 30, y - 30, 60, 60, 155, -100 );
          } else if(shape.equals("square")){
            g.setColor(c);
            g.fillRect( x - 30, y - 30, 60, 60 );
            g.setColor(c);
            g.drawRect( x - 30, y - 30, 60, 60 );
          }

        }

        public String toString(){
          return ""+x+","+y+shape;
        }
      }



  } // end class Sketchpad




   /**
   * Create the GUI and show it.  For thread safety,
   * this method should be invoked from the
   * event-dispatching thread.
   */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("PDrawer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        JComponent newContentPane = new PDrawer();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

        //Display the window.
        frame.setSize(900,700);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        /* Use an appropriate Look and Feel */
        try {
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        /* Turn off metal's use of bold fonts */
        UIManager.put("swing.boldMetal", Boolean.FALSE);

        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }


}
