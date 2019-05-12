package projlab_sceleton;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

//Grafikus kirajzolashoz szukseges osztaly, Jpanel leszarmazottja
@SuppressWarnings("serial")
class DrawRect extends JPanel {

	//negyzetek adatai
    private int squareW = 20;
    private int squareH = 20;
    
    //koordinatak
    static int x1 = 50;
    static int y1 = 50;
    static int x2 = 120;
    static int y2 = 50;
    static int x3 = 50;
    static int y3 = 300;
    static int x4 = 50;
    static int y4 = 600;
    static int x5 = 120;
    static int y5 = 550;
    static int x6 = 120;
    static int y6 = 450;
    static int x7 = 120;
    static int y7 = 300;
    static int x8 = 120;
    static int y8 = 150;
    static int x9 = 190;
    static int y9 = 50;
    static int x10 = 260;
    static int y10 = 50;
    
    static int x11 = 260;
    static int y11 = 300;
    static int x12 = 260;
    static int y12 = 400;
    static int x13 = 190;
    static int y13 = 500;
    static int x14 = 120;
    static int y14 = 620;
    static int x15 = 190;
    static int y15 = 620;
    static int x16 = 320;
    static int y16 = 620;
    static int x17 = 260;
    static int y17 = 550;
    static int x18 = 320;
    static int y18 = 450;
    static int x19 = 390;
    static int y19 = 390;
    static int x20 = 500;
    static int y20 = 620;

    
    static int x21 = 640;
    static int y21 = 620;
    static int x22 = 570;
    static int y22 = 450;
    static int x23 = 500;
    static int y23 = 390;
    static int x24 = 500;
    static int y24 = 300;
    static int x25 = 320;
    static int y25 = 50;
    static int x26 = 390;
    static int y26 = 50;
    static int x27 = 500;
    static int y27 = 50;
    static int x28 = 570;
    static int y28 = 50;
    static int x29 = 640;
    static int y29 = 50;
    static int x30 = 720;
    static int y30 = 50;
    static int x31 = 700;
    static int y31 = 150;
    static int x32 = 570;
    static int y32 = 120;
    static int x33 = 570;
    static int y33 = 250;
    static int x34 = 570;
    static int y34 = 350;
    static int x35 = 640;
    static int y35 = 450;
    static int x36 = 720;
    static int y36 = 620;
    static int x37 = 790;
    static int y37 = 620;
    static int x38 = 790;
    static int y38 = 550;
    static int x39 = 670;
    static int y39 = 400;
    static int x40 = 780;
    static int y40 = 400;
    static int x41 = 850;
    static int y41 = 300;
    static int x42 = 850;
    static int y42 = 400;

    //koordinatak tarolasa
    public static int[] xcoord = {x1,x2,x3,x4,x5,x6,x7,x8,x9,x10,x11,x12,x13,x14,x15,x16,x17,x18,x19,x20,x21,x22,x23,x24,x25,x25,x26,x27,x28,x29,x31,x32,x33,x34,x35,x36,x37,x38,x39,x40,x41,x42,};
    public static int[] ycoord = {y1,y2,y3,y4,y5,y6,y7,y8,y9,y10,y11,y12,y13,y14,y15,y16,y17,y18,y19,y20,y21,y22,y23,y24,y25,y25,y26,y27,y28,y29,y31,y32,y33,y34,y35,y36,y37,y38,y39,y40,y41,y42,};
    
    //negyzetek kirajzolasa
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // do your superclass's painting routine first, and then paint on top of it.
        g.setColor(Color.blue);
        g.fillRect(x1, y1, squareW, squareH);
        g.fillRect(x2, y2, squareW, squareH);
        g.fillRect(x3, y3, squareW, squareH);
        g.fillRect(x4, y4, squareW, squareH);
        g.fillRect(x5, y5, squareW, squareH);
        g.fillRect(x6, y6, squareW, squareH);
        g.fillRect(x7, y7, squareW, squareH);
        g.fillRect(x8, y8, squareW, squareH);
        g.fillRect(x9, y9, squareW, squareH);
        g.fillRect(x10, y10, squareW, squareH);
        g.fillRect(x11, y11, squareW, squareH);
        g.fillRect(x12, y12, squareW, squareH);
        g.fillRect(x13, y13, squareW, squareH);
        g.fillRect(x14, y14, squareW, squareH);
        g.fillRect(x15, y15, squareW, squareH);
        g.fillRect(x16, y16, squareW, squareH);
        g.fillRect(x17, y17, squareW, squareH);
        g.fillRect(x18, y18, squareW, squareH);
        g.fillRect(x19, y19, squareW, squareH);
        g.fillRect(x20, y20, squareW, squareH);
        g.fillRect(x21, y21, squareW, squareH);
        g.fillRect(x22, y22, squareW, squareH);
        g.fillRect(x23, y23, squareW, squareH);
        g.fillRect(x24, y24, squareW, squareH);
        g.fillRect(x25, y25, squareW, squareH);
        g.fillRect(x26, y26, squareW, squareH);
        g.fillRect(x27, y27, squareW, squareH);
        g.fillRect(x28, y28, squareW, squareH);
        g.fillRect(x29, y29, squareW, squareH);
        g.fillRect(x30, y30, squareW, squareH);
        g.fillRect(x31, y31, squareW, squareH);
        g.fillRect(x32, y32, squareW, squareH);
        g.fillRect(x33, y33, squareW, squareH);
        g.fillRect(x34, y34, squareW, squareH);
        g.fillRect(x35, y35, squareW, squareH);
        g.fillRect(x36, y36, squareW, squareH);
        g.fillRect(x37, y37, squareW, squareH);
        g.fillRect(x38, y38, squareW, squareH);
        g.fillRect(x39, y39, squareW, squareH);
        g.fillRect(x40, y40, squareW, squareH);
        g.fillRect(x41, y41, squareW, squareH);
        g.fillRect(x42, y42, squareW, squareH);
        
        
        //szomszedos negyzetek koze vonal rajzolasa
        
        g.drawLine(x1, y1, x3, y3);
        g.drawLine(x1, y1, x2, y2);
        

        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x2, y2, x8, y8);
        
        g.drawLine(x3, y3, x4, y4);
        g.drawLine(x3, y3, x5, y5);
        g.drawLine(x3, y3, x6, y6);
        g.drawLine(x3, y3, x7, y7);
        g.drawLine(x3, y3, x8, y8);
        
        
        
        g.drawLine(x4, y4, x5, y5);
        
        g.drawLine(x5, y5, x6, y6);
        g.drawLine(x5, y5, x14, y14);
        
        g.drawLine(x6, y6, x7, y7);
        g.drawLine(x6, y6, x13, y13);
        
        g.drawLine(x7, y7, x8, y8);
        g.drawLine(x7, y7, x11, y11);
        g.drawLine(x7, y7, x12, y12);

        g.drawLine(x8, y8, x9, y9);
        g.drawLine(x8, y8, x11, y11);
        

        g.drawLine(x9, y9, x10, y10);
        g.drawLine(x9, y9, x11, y11);

        g.drawLine(x10, y10, x11, y11);
        g.drawLine(x10, y10, x25, y25);
        
        g.drawLine(x11, y11, x12, y12);
        g.drawLine(x11, y11, x18, y18);
        g.drawLine(x11, y11, x19, y19);
        g.drawLine(x11, y11, x24, y24);
        

        g.drawLine(x12, y12, x13, y13);
        g.drawLine(x12, y12, x18, y18);

        g.drawLine(x13, y13, x14, y14);
        g.drawLine(x13, y13, x15, y15);
        g.drawLine(x13, y13, x17, y17);

        g.drawLine(x15, y15, x16, y16);

        g.drawLine(x16, y16, x17, y17);
        g.drawLine(x16, y16, x20, y20);

        g.drawLine(x17, y17, x18, y18);
        g.drawLine(x17, y17, x20, y20);

        g.drawLine(x18, y18, x19, y19);
        g.drawLine(x18, y18, x20, y20);

        g.drawLine(x19, y19, x20, y20);
        g.drawLine(x19, y19, x24, y24);
        g.drawLine(x19, y19, x23, y23);

        g.drawLine(x20, y20, x21, y21);
        g.drawLine(x20, y20, x22, y22);
        g.drawLine(x20, y20, x23, y23);

        g.drawLine(x21, y21, x22, y22);
        g.drawLine(x21, y21, x36, y36);

        g.drawLine(x22, y22, x23, y23);
        g.drawLine(x22, y22, x35, y35);

        g.drawLine(x23, y23, x24, y24);
        g.drawLine(x23, y23, x34, y34);

        g.drawLine(x24, y24, x25, y25);
        g.drawLine(x24, y24, x26, y26);
        g.drawLine(x24, y24, x27, y27);
        g.drawLine(x24, y24, x32, y32);
        g.drawLine(x24, y24, x33, y33);
        g.drawLine(x24, y24, x34, y34);

        g.drawLine(x25, y25, x26, y26);

        g.drawLine(x26, y26, x27, y27);

        g.drawLine(x27, y27, x28, y28);
        g.drawLine(x27, y27, x32, y32);

        g.drawLine(x28, y28, x29, y29);
        g.drawLine(x28, y28, x31, y31);

        g.drawLine(x29, y29, x30, y30);
        
        g.drawLine(x30, y30, x31, y31);
        g.drawLine(x30, y30, x41, y41);

        g.drawLine(x31, y31, x32, y32);
        g.drawLine(x31, y31, x41, y41);

        g.drawLine(x32, y32, x33, y33);
        g.drawLine(x32, y32, x41, y41);

        g.drawLine(x33, y33, x34, y34);
        g.drawLine(x33, y33, x39, y39);
        g.drawLine(x33, y33, x41, y41);

        g.drawLine(x34, y34, x35, y35);
        

        g.drawLine(x35, y35, x36, y36);
        g.drawLine(x35, y35, x38, y38);
        g.drawLine(x35, y35, x39, y39);
        

        g.drawLine(x36, y36, x37, y37);

        g.drawLine(x37, y37, x38, y38);

        g.drawLine(x38, y38, x39, y39);
        g.drawLine(x38, y38, x40, y40);

        g.drawLine(x39, y39, x40, y40);
        g.drawLine(x39, y39, x41, y41);

        g.drawLine(x40, y40, x41, y41);
        g.drawLine(x40, y40, x42, y42);

        g.drawLine(x41, y41, x42, y42);
        
        
    }
}