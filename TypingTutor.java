import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;  
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;

@SuppressWarnings("serial")
public class TypingTutor extends JFrame implements KeyListener  {
	
	JButton a,b,c,d,e,f,bt_g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0,btTilda,btMinus,btPlus,btBkSpc;
	JButton btTab,btBrO, btBrC, btBkSlsh, btEnter, btColon, btQt, btCaps, btShift, btComma, btDot, btQueMrk, btUp, btDown, btRight, btLeft, btSpace;
	JTextArea txt_ar = new JTextArea();
	JLabel lbSpace = new JLabel(" ");
	
	public TypingTutor(){
		super("TypingTutor");
		JPanel mainpan = new JPanel(new FlowLayout(FlowLayout.LEFT,20,0));
		JPanel panel = new JPanel(new GridBagLayout());
		GridBagConstraints g = new GridBagConstraints();
		g.fill = GridBagConstraints.HORIZONTAL;
		txt_ar.setFocusTraversalKeysEnabled(false);
		
		JLabel labelArea1 = new JLabel("Type some text using your keyboard. The keys you press will be highlighted and the text will be displayed.");
		JLabel labelArea2 = new JLabel("Note: Clicking the buttons with your mouse will not perform any action." + "\nFor Keyboard input press any button with mouse..");
		
		
		g.weightx = 1;
		g.gridx = 0;
		g.gridy = 0;
		panel.add(labelArea1, g);
		
		g.gridx = 0;
		g.gridy = 1;
		panel.add(labelArea2, g);
		
		g.ipady = 200;
		g.gridx = 0;
		g.gridy = 2;
		panel.add(txt_ar, g);
			
		//keyboard keys
		
		//first keyboard line
		JPanel btPanel1 =  new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));
		
		btTilda = new JButton("~");
		btPanel1.add(btTilda);
		btTilda.setPreferredSize(new Dimension(50,50));
		btTilda.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
					 txt_ar.append("~");      
        }});
		btTilda.addKeyListener(this);
		btTilda.setFocusTraversalKeysEnabled(false);
		bt1 = new JButton("1");
		btPanel1.add(bt1);
		bt1.setPreferredSize(new Dimension(50,50));
		
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					 txt_ar.append("1");
		}} );
		bt1.addKeyListener(this);
		bt1.setFocusTraversalKeysEnabled(false);
		bt2 = new JButton("2");
		btPanel1.add(bt2);
		bt2.setPreferredSize(new Dimension(50,50));
		bt2.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append("2");
	        }} );
		bt2.addKeyListener(this);
		bt2.setFocusTraversalKeysEnabled(false);
		bt3 = new JButton("3");
		btPanel1.add(bt3);
		bt3.setPreferredSize(new Dimension(50,50));
		bt3.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append("3");
	        }} );
		bt3.addKeyListener(this);
		bt3.setFocusTraversalKeysEnabled(false);
		bt4 = new JButton("4");
		btPanel1.add(bt4);
		bt4.setPreferredSize(new Dimension(50,50));
		bt4.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append("4");
	        }} );
		bt4.addKeyListener(this);
		bt4.setFocusTraversalKeysEnabled(false);
		bt5 = new JButton("5");
		btPanel1.add(bt5);
		bt5.setPreferredSize(new Dimension(50,50));
		bt5.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append("5");
	        }} );
		bt5.addKeyListener(this);
		bt5.setFocusTraversalKeysEnabled(false);
		bt6 = new JButton("6");
		btPanel1.add(bt6);
		bt6.setPreferredSize(new Dimension(50,50));
		bt6.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append("6");
	        }} );
		bt6.addKeyListener(this);
		bt6.setFocusTraversalKeysEnabled(false);
		bt7 = new JButton("7");
		btPanel1.add(bt7);
		bt7.setPreferredSize(new Dimension(50,50));
		bt7.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append("7");
	        }} );
		bt7.addKeyListener(this);
		bt7.setFocusTraversalKeysEnabled(false);
		bt8 = new JButton("8");
		btPanel1.add(bt8);
		bt8.setPreferredSize(new Dimension(50,50));
		bt8.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append("8");
	        }} );
		bt8.addKeyListener(this);
		bt8.setFocusTraversalKeysEnabled(false);
		bt9 = new JButton("9");
		btPanel1.add(bt9);
		bt9.setPreferredSize(new Dimension(50,50));
		bt9.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append("9");
	        }} );
		bt9.addKeyListener(this);
		bt9.setFocusTraversalKeysEnabled(false);
		bt0 = new JButton("0");
		btPanel1.add(bt0);
		bt0.setPreferredSize(new Dimension(50,50));
		bt0.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append("0");
	        }} );
		bt0.addKeyListener(this);
		bt0.setFocusTraversalKeysEnabled(false);
		btMinus = new JButton("-");
		btPanel1.add(btMinus);
		btMinus.setPreferredSize(new Dimension(50,50));
		btMinus.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append("-");
	        }} );
		btMinus.addKeyListener(this);
		btMinus.setFocusTraversalKeysEnabled(false);
		btPlus = new JButton("+");
		btPanel1.add(btPlus);
		btPlus.setPreferredSize(new Dimension(50,50));
		btPlus.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append("+");
	        }} );
		btPlus.addKeyListener(this);
		btBkSpc = new JButton("Backspace");
		btPanel1.add(btBkSpc);
		btBkSpc.setPreferredSize(new Dimension(130,50));
		btBkSpc.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e) {
					 String conts = txt_ar.getText();
					 conts = conts.substring(0, conts.length()-1);
					txt_ar.setText(conts);
		}});
		btBkSpc.addKeyListener(this);
		btBkSpc.setFocusTraversalKeysEnabled(false);
		
		//second keyboard line
		JPanel btPanel2 =  new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));
		btPanel2.setFocusTraversalKeysEnabled(false);
		
		btTab = new JButton("Tab");
		btPanel2.add(btTab);
		btTab.setPreferredSize(new Dimension(90,50));
		btTab.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append("	");
	        }} );
		btTab.addKeyListener(this);
		btTab.setFocusTraversalKeysEnabled(false);
		q = new JButton("Q");
		btPanel2.add(q);
		q.setPreferredSize(new Dimension(50,50));
		q.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append("q");
	        }} );
		q.addKeyListener(this);
		q.setFocusTraversalKeysEnabled(false);
		w = new JButton("W");
		btPanel2.add(w);
		w.setPreferredSize(new Dimension(50,50));
		w.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append("w");
	        }} );
		w.addKeyListener(this);
		w.setFocusTraversalKeysEnabled(false);
		e = new JButton("E");
		btPanel2.add(e);
		e.setPreferredSize(new Dimension(50,50));
		e.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append("e");
	        }} );
		e.addKeyListener(this);
		e.setFocusTraversalKeysEnabled(false);
		r = new JButton("R");
		btPanel2.add(r);
		r.setPreferredSize(new Dimension(50,50));
		r.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append("r");
	        }} );
		r.addKeyListener(this);
		r.setFocusTraversalKeysEnabled(false);
		t = new JButton("T");
		btPanel2.add(t);
		t.setPreferredSize(new Dimension(50,50));
		t.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append("t");
	        }} );
		t.addKeyListener(this);
		t.setFocusTraversalKeysEnabled(false);
		y = new JButton("Y");
		btPanel2.add(y);
		y.setPreferredSize(new Dimension(50,50));
		y.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append("y");
	        }} );
		y.addKeyListener(this);
		y.setFocusTraversalKeysEnabled(false);
		u = new JButton("U");
		btPanel2.add(u);
		u.setPreferredSize(new Dimension(50,50));
		u.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append("u");
	        }} );
		u.addKeyListener(this);
		u.setFocusTraversalKeysEnabled(false);
		i = new JButton("I");
		btPanel2.add(i);
		i.setPreferredSize(new Dimension(50,50));
		i.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append("i");
	        }} );
		i.addKeyListener(this);
		i.setFocusTraversalKeysEnabled(false);
		o = new JButton("O");
		btPanel2.add(o);
		o.setPreferredSize(new Dimension(50,50));
		o.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append("o");
	        }} );
		o.addKeyListener(this);
		o.setFocusTraversalKeysEnabled(false);
		p = new JButton("P");
		btPanel2.add(p);
		p.setPreferredSize(new Dimension(50,50));
		p.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append("p");
	        }} );
		p.addKeyListener(this);
		p.setFocusTraversalKeysEnabled(false);
		btBrO = new JButton("[");
		btPanel2.add(btBrO);
		btBrO.setPreferredSize(new Dimension(50,50));
		btBrO.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append("[");
	        }} );
		btBrO.addKeyListener(this);
		btBrO.setFocusTraversalKeysEnabled(false);
		btBrC = new JButton("]");
		btPanel2.add(btBrC);
		btBrC.setPreferredSize(new Dimension(50,50));
		btBrC.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append("]");
	        }} );
		btBrC.addKeyListener(this);
		btBrC.setFocusTraversalKeysEnabled(false);
		btBkSlsh = new JButton("\\");
		btPanel2.add(btBkSlsh);
		btBkSlsh.setPreferredSize(new Dimension(50,50));
		btBkSlsh.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append("\\");
	        }} );
		btBkSlsh.addKeyListener(this);
		btBkSlsh.setFocusTraversalKeysEnabled(false);
		
		//third Keyboard line
		JPanel btPanel3 =  new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));
		btPanel3.setFocusTraversalKeysEnabled(false);
		
		btCaps = new JButton("Caps");
		btPanel3.add(btCaps);
		btCaps.setPreferredSize(new Dimension(90,50));
		if(CapsisOn())
			btCaps.setBackground(Color.PINK);
		
		a = new JButton("A");
		btPanel3.add(a);
		a.setPreferredSize(new Dimension(50,50));
		a.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append("a");
	        }} );
		a.addKeyListener(this);
		a.setFocusTraversalKeysEnabled(false);
		s = new JButton("S");
		btPanel3.add(s);
		s.setPreferredSize(new Dimension(50,50));
		s.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append("s");
	        }} );
		s.addKeyListener(this);
		s.setFocusTraversalKeysEnabled(false);
		d = new JButton("D");
		btPanel3.add(d);
		d.setPreferredSize(new Dimension(50,50));
		d.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append("d");
	        }} );
		d.addKeyListener(this);
		d.setFocusTraversalKeysEnabled(false);
		f = new JButton("F");
		btPanel3.add(f);
		f.setPreferredSize(new Dimension(50,50));
		f.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append("f");
	        }} );
		f.addKeyListener(this);
		f.setFocusTraversalKeysEnabled(false);
		bt_g = new JButton("G");
		btPanel3.add(bt_g);
		bt_g.setPreferredSize(new Dimension(50,50));
		bt_g.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append("g");
	        }} );
		bt_g.addKeyListener(this);
		bt_g.setFocusTraversalKeysEnabled(false);
		h = new JButton("H");
		btPanel3.add(h);
		h.setPreferredSize(new Dimension(50,50));
		h.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append("h");
	        }} );
		h.addKeyListener(this);
		h.setFocusTraversalKeysEnabled(false);
		j = new JButton("J");
		btPanel3.add(j);
		j.setPreferredSize(new Dimension(50,50));
		j.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append("j");
	        }} );
		j.addKeyListener(this);
		j.setFocusTraversalKeysEnabled(false);
		k = new JButton("K");
		btPanel3.add(k);
		k.setPreferredSize(new Dimension(50,50));
		k.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append("k");
	        }} );
		k.addKeyListener(this);
		k.setFocusTraversalKeysEnabled(false);
		l = new JButton("L");
		btPanel3.add(l);
		l.setPreferredSize(new Dimension(50,50));
		l.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append("l");
	        }} );
		l.addKeyListener(this);
		l.setFocusTraversalKeysEnabled(false);
		btColon = new JButton(":");
		btPanel3.add(btColon);
		btColon.setPreferredSize(new Dimension(50,50));
		btColon.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append(":");
	        }} );
		btColon.addKeyListener(this);
		btColon.setFocusTraversalKeysEnabled(false);
		btQt = new JButton("\"");
		btPanel3.add(btQt);
		btQt.setPreferredSize(new Dimension(50,50));
		btQt.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append("\"");
	        }} );
		btQt.addKeyListener(this);
		btQt.setFocusTraversalKeysEnabled(false);
		btEnter = new JButton("Enter");
		btPanel3.add(btEnter);
		btEnter.setPreferredSize(new Dimension(100,50));
		btEnter.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        			txt_ar.append("" + '\n');
	        }} );
		btEnter.addKeyListener(this);
		btEnter.setFocusTraversalKeysEnabled(false);
		
		//fourth keyboard line
		JPanel btPanel4 =  new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));
		btPanel4.setFocusTraversalKeysEnabled(false);
		
		btShift = new JButton("Shift");
		btPanel4.add(btShift);
		btShift.setPreferredSize(new Dimension(120,50));
		z = new JButton("Z");
		btPanel4.add(z);
		z.setPreferredSize(new Dimension(50,50));
		z.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append("z");
	        }} );
		z.addKeyListener(this);
		z.setFocusTraversalKeysEnabled(false);
		x = new JButton("X");
		btPanel4.add(x);
		x.setPreferredSize(new Dimension(50,50));
		x.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append("x");
	        }} );
		x.addKeyListener(this);
		x.setFocusTraversalKeysEnabled(false);
		c = new JButton("C");
		btPanel4.add(c);
		c.setPreferredSize(new Dimension(50,50));
		c.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append("c");
	        }} );
		c.addKeyListener(this);
		c.setFocusTraversalKeysEnabled(false);
		v = new JButton("V");
		btPanel4.add(v);
		v.setPreferredSize(new Dimension(50,50));
		v.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append("v");
	        }} );
		v.addKeyListener(this);
		v.setFocusTraversalKeysEnabled(false);
		b = new JButton("B");
		btPanel4.add(b);
		b.setPreferredSize(new Dimension(50,50));
		b.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append("b");
	        }} );
		b.addKeyListener(this);
		b.setFocusTraversalKeysEnabled(false);
		n = new JButton("N");
		btPanel4.add(n);
		n.setPreferredSize(new Dimension(50,50));
		n.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append("n");
	        }} );
		n.addKeyListener(this);
		n.setFocusTraversalKeysEnabled(false);
		m = new JButton("M");
		btPanel4.add(m);
		m.setPreferredSize(new Dimension(50,50));
		m.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append("m");
	        }} );
		m.addKeyListener(this);
		m.setFocusTraversalKeysEnabled(false);
		btComma = new JButton(",");
		btPanel4.add(btComma);
		btComma.setPreferredSize(new Dimension(50,50));
		btComma.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append(",");
	        }} );
		btComma.addKeyListener(this);
		btComma.setFocusTraversalKeysEnabled(false);
		btDot = new JButton(".");
		btPanel4.add(btDot);
		btDot.setPreferredSize(new Dimension(50,50));
		btDot.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append(".");
	        }} );
		btDot.addKeyListener(this);
		btDot.setFocusTraversalKeysEnabled(false);
		btQueMrk = new JButton("?");
		btPanel4.add(btQueMrk);
		btQueMrk.setPreferredSize(new Dimension(50,50));
		btQueMrk.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append("?");
	        }} );
		btQueMrk.addKeyListener(this);
		btQueMrk.setFocusTraversalKeysEnabled(false);
		btPanel4.add(lbSpace);
		lbSpace.setPreferredSize(new Dimension(20,50));
		JLabel emspac = new JLabel(" ");
		btPanel4.add(emspac);
		emspac.setPreferredSize(new Dimension(20,20));
		btUp = new JButton("^");
		btPanel4.add(btUp);
		btUp.setPreferredSize(new Dimension(50,50));
		btUp.addKeyListener(this);
		btUp.setFocusTraversalKeysEnabled(false);
		
		
		//fifth keyboard line
		JPanel btPanel5 =  new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));
		
		JLabel emspace = new JLabel(" ");
		btPanel5.add(emspace);
		emspace.setPreferredSize(new Dimension(218,50));
		btSpace = new JButton(" ");
		btPanel5.add(btSpace);
		btSpace.setPreferredSize(new Dimension(311,50));
		btSpace.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append(" ");
	        }} );
		btSpace.addKeyListener(this);
		btSpace.setFocusTraversalKeysEnabled(false);
		btSpace.requestFocusInWindow();
		btSpace.requestFocus();
		btPanel5.add(lbSpace);
		lbSpace.setPreferredSize(new Dimension(61,50));
		btLeft = new JButton("<");
		btPanel5.add(btLeft);
		btLeft.setPreferredSize(new Dimension(50,50));
		btLeft.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	int currentCaretPosition = txt_ar.getCaretPosition();
	        	txt_ar.setCaretPosition(currentCaretPosition-1);
	        }} );
		btLeft.setFocusTraversalKeysEnabled(false);
		btDown = new JButton("v");
		btPanel5.add(btDown);
		btDown.setPreferredSize(new Dimension(50,50));
		btDown.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append("v");
	        }} );
		btDown.setFocusTraversalKeysEnabled(false);
		btRight = new JButton(">");
		btPanel5.add(btRight);
		btRight.setPreferredSize(new Dimension(50,50));
		btRight.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
						 txt_ar.append(">");
	        }} );
		btRight.setFocusTraversalKeysEnabled(false);
		
		
		//adding bt panels into the main panels
		g.gridx = 0;
		g.gridy = 3;
		g.ipadx = 0;
		g.ipady = 0;
		g.insets = new Insets(0,0,0,0);
		panel.add(btPanel1,g);
		
		g.gridx = 0;
		g.gridy = 4;
		g.ipadx = 0;
		g.ipady = 0;
		g.insets = new Insets(0,0,0,0);
		panel.add(btPanel2,g);
		
		g.gridx = 0;
		g.gridy = 5;
		g.ipadx = 0;
		g.ipady = 0;
		g.insets = new Insets(0,0,0,0);
		panel.add(btPanel3,g);
		
		g.gridx = 0;
		g.gridy = 6;
		g.ipadx = 0;
		g.ipady = 0;
		g.insets = new Insets(0,0,0,0);
		panel.add(btPanel4,g);
		
		g.gridx = 0;
		g.gridy = 7;
		g.ipadx = 0;
		g.ipady = 0;
		g.insets = new Insets(0,0,0,0);
		panel.add(btPanel5,g);
		
		
		//adding frame to the panel
		mainpan.add(panel);
		add(mainpan);
		
	}
	
	public static void main(String[] args){
		TypingTutor tt = new TypingTutor();
		tt.setVisible(true);
		tt.pack();
		tt.setSize(800,550);
		tt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public boolean CapsisOn(){
		boolean isOn = Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK);
		if(isOn)
			return true;
		else
			return false;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent kc) {
		// TODO Auto-generated method stub
		int keyCode = kc.getKeyCode();
		switch(keyCode){
		case 48:
			txt_ar.append("0");
			bt0.setOpaque(true);
			bt0.setBackground(Color.PINK);
			break;
		case 49:
			txt_ar.append("1");
			bt1.setOpaque(true);
			bt1.setBackground(Color.PINK);
			break;
		case 50:
			txt_ar.append("2");
			bt2.setOpaque(true);
			bt2.setBackground(Color.PINK);
			break;
		case 51:
			txt_ar.append("3");
			bt3.setOpaque(true);
			bt3.setBackground(Color.PINK);
			break;
		case 52:
			txt_ar.append("4");
			bt4.setOpaque(true);
			bt4.setBackground(Color.PINK);
			break;
		case 53:
			txt_ar.append("5");
			bt5.setOpaque(true);
			bt5.setBackground(Color.PINK);
			break;
		case 54:
			txt_ar.append("6");
			bt6.setOpaque(true);
			bt6.setBackground(Color.PINK);
			break;
		case 55:
			txt_ar.append("7");
			bt7.setOpaque(true);
			bt7.setBackground(Color.PINK);
			break;
		case 56:
			txt_ar.append("8");
			bt8.setOpaque(true);
			bt8.setBackground(Color.PINK);
			break;
		case 57:
			txt_ar.append("9");
			bt9.setOpaque(true);
			bt9.setBackground(Color.PINK);
			break;
		case 65:
			if(kc.isShiftDown() || CapsisOn())
				txt_ar.append("A");
			else 
				txt_ar.append("a");
			a.setOpaque(true);
			a.setBackground(Color.PINK);
			break;
		case 66:
			if(kc.isShiftDown() || CapsisOn())
				txt_ar.append("B");
			else 
				txt_ar.append("b");
			b.setOpaque(true);
			b.setBackground(Color.PINK);
			break;
		case 67:
			if(kc.isShiftDown() || CapsisOn())
				txt_ar.append("C");
			else 
				txt_ar.append("c");
			c.setOpaque(true);
			c.setBackground(Color.PINK);
			break;
		case 68:
			if(kc.isShiftDown() || CapsisOn())
				txt_ar.append("D");
			else 
				txt_ar.append("d");
			d.setOpaque(true);
			d.setBackground(Color.PINK);
			break;
		case 69:
			if(kc.isShiftDown() || CapsisOn())
				txt_ar.append("E");
			else 
				txt_ar.append("e");
			e.setOpaque(true);
			e.setBackground(Color.PINK);
			break;
		case 70:
			if(kc.isShiftDown() || CapsisOn())
				txt_ar.append("F");
			else 
				txt_ar.append("f");
			f.setOpaque(true);
			f.setBackground(Color.PINK);
			break;
		case 71:
			if(kc.isShiftDown() || CapsisOn())
				txt_ar.append("G");
			else 
				txt_ar.append("g");
			bt_g.setOpaque(true);
			bt_g.setBackground(Color.PINK);
			break;
		case 72:
			if(kc.isShiftDown() || CapsisOn())
				txt_ar.append("H");
			else 
				txt_ar.append("h");
			h.setOpaque(true);
			h.setBackground(Color.PINK);
			break;
		case 73:
			if(kc.isShiftDown() || CapsisOn())
				txt_ar.append("I");
			else 
				txt_ar.append("i");
			i.setOpaque(true);
			i.setBackground(Color.PINK);
			break;
		case 74:
			if(kc.isShiftDown() || CapsisOn())
				txt_ar.append("J");
			else 
				txt_ar.append("j");
			j.setOpaque(true);
			j.setBackground(Color.PINK);
			break;
		case 75:
			if(kc.isShiftDown() || CapsisOn())
				txt_ar.append("K");
			else 
				txt_ar.append("k");
			k.setOpaque(true);
			k.setBackground(Color.PINK);
			break;
		case 76:
			if(kc.isShiftDown() || CapsisOn())
				txt_ar.append("L");
			else 
				txt_ar.append("l");
			l.setOpaque(true);
			l.setBackground(Color.PINK);
			break;
		case 77:
			if(kc.isShiftDown() || CapsisOn())
				txt_ar.append("M");
			else 
				txt_ar.append("m");
			m.setOpaque(true);
			m.setBackground(Color.PINK);
			break;
		case 78:
			if(kc.isShiftDown() || CapsisOn())
				txt_ar.append("N");
			else 
				txt_ar.append("n");
			n.setOpaque(true);
			n.setBackground(Color.PINK);
			break;
		case 79:
			if(kc.isShiftDown() || CapsisOn())
				txt_ar.append("O");
			else 
				txt_ar.append("o");
			o.setOpaque(true);
			o.setBackground(Color.PINK);
			break;
		case 80:
			if(kc.isShiftDown() || CapsisOn())
				txt_ar.append("P");
			else 
				txt_ar.append("p");
			p.setOpaque(true);
			p.setBackground(Color.PINK);
			break;
		case 81:
			if(kc.isShiftDown() || CapsisOn())
				txt_ar.append("Q");
			else 
				txt_ar.append("q");
			q.setOpaque(true);
			q.setBackground(Color.PINK);
			break;
		case 82:
			if(kc.isShiftDown() || CapsisOn())
				txt_ar.append("R");
			else 
				txt_ar.append("r");
			r.setOpaque(true);
			r.setBackground(Color.PINK);
			break;
		case 83:
			if(kc.isShiftDown()|| CapsisOn())
				txt_ar.append("S");
			else 
				txt_ar.append("s");
			s.setOpaque(true);
			s.setBackground(Color.PINK);
			break;
		case 84:
			if(kc.isShiftDown()|| CapsisOn())
				txt_ar.append("T");
			else 
				txt_ar.append("t");
			t.setOpaque(true);
			t.setBackground(Color.PINK);
			break;
		case 85:
			if(kc.isShiftDown()|| CapsisOn())
				txt_ar.append("U");
			else 
				txt_ar.append("u");
			u.setOpaque(true);
			u.setBackground(Color.PINK);
			break;
		case 86:
			if(kc.isShiftDown()|| CapsisOn())
				txt_ar.append("V");
			else 
				txt_ar.append("v");
			v.setOpaque(true);
			v.setBackground(Color.PINK);
			break;
		case 87:
			if(kc.isShiftDown()|| CapsisOn())
				txt_ar.append("W");
			else 
				txt_ar.append("w");
			w.setOpaque(true);
			w.setBackground(Color.PINK);
			break;
		case 88:
			if(kc.isShiftDown()|| CapsisOn())
				txt_ar.append("X");
			else 
				txt_ar.append("x");
			x.setOpaque(true);
			x.setBackground(Color.PINK);
			break;
		case 89:
			if(kc.isShiftDown()|| CapsisOn())
				txt_ar.append("Y");
			else 
				txt_ar.append("y");
			y.setOpaque(true);
			y.setBackground(Color.PINK);
			break;
		case 90:
			if(kc.isShiftDown()|| CapsisOn())
				txt_ar.append("Z");
			else 
				txt_ar.append("z");
			z.setOpaque(true);
			z.setBackground(Color.PINK);
			break;
		case 192:
			txt_ar.append("~");
			btTilda.setOpaque(true);
			btTilda.setBackground(Color.PINK);
			break;
		case 8:
			String conts = txt_ar.getText();
			conts = conts.substring(0, conts.length()-1);
			txt_ar.setText(conts);
			btBkSpc.setOpaque(true);
			btBkSpc.setBackground(Color.PINK);
			break;
		case 91:
			txt_ar.append("[");
			btBrO.setOpaque(true);
			btBrO.setBackground(Color.PINK);
			break;
		case 92:
			txt_ar.append("\\");
			btBkSlsh.setOpaque(true);
			btBkSlsh.setBackground(Color.PINK);
			break;
		case 93:
			txt_ar.append("]");
			btBrC.setOpaque(true);
			btBrC.setBackground(Color.PINK);
			break;
		case 222:
			txt_ar.append("\"");
			btQt.setOpaque(true);
			btQt.setBackground(Color.PINK);
			break;
		case 59:
			txt_ar.append(":");
			btColon.setOpaque(true);
			btColon.setBackground(Color.PINK);
			break;
		case 61:
			txt_ar.append("+");
			btPlus.setOpaque(true);
			btPlus.setBackground(Color.PINK);
			break;
		case 45:
			txt_ar.append("-");
			btMinus.setOpaque(true);
			btMinus.setBackground(Color.PINK);
			break;
		case 10:
			txt_ar.append("" + '\n');
			btEnter.setOpaque(true);
			btEnter.setBackground(Color.PINK);
			break;
		case 44:
			txt_ar.append(",");
			btComma.setOpaque(true);
			btComma.setBackground(Color.PINK);
			break;
		case 46:
			txt_ar.append(".");
			btDot.setOpaque(true);
			btDot.setBackground(Color.PINK);
			break;
		case 47:
			txt_ar.append("?");
			btQueMrk.setOpaque(true);
			btQueMrk.setBackground(Color.PINK);
			break;
		case 37:
			//do something
			btLeft.setOpaque(true);
			btLeft.setBackground(Color.PINK);
			break;
		case 38:
			//do something
			btUp.setOpaque(true);
			btUp.setBackground(Color.PINK);
			break;
		case 39:
			//do something
			btRight.setOpaque(true);
			btRight.setBackground(Color.PINK);
			break;
		case 40:
			//do something
			btDown.setOpaque(true);
			btDown.setBackground(Color.PINK);
			break;
		case 32:
			txt_ar.append(" ");
			btSpace.setOpaque(true);
			btSpace.setBackground(Color.PINK);
			break;
		case 9:
			txt_ar.append("	");
			btTab.setOpaque(true);
			btTab.setBackground(Color.PINK);
			break;
		case 20:
			btCaps.setOpaque(true);
			btCaps.setBackground(Color.PINK);
			break;
		case 16:
			btShift.setOpaque(true);
			btShift.setBackground(Color.PINK);
			break;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent kc) {
		int keyCode = kc.getKeyCode();
		switch(keyCode){
		case 48:
			bt0.setOpaque(true);
			bt0.setBackground(null);
			break;
		case 49:
			bt1.setOpaque(true);
			bt1.setBackground(null);
			break;
		case 50:
			bt2.setOpaque(true);
			bt2.setBackground(null);
			break;
		case 51:
			bt3.setOpaque(true);
			bt3.setBackground(null);
			break;
		case 52:
			bt4.setOpaque(true);
			bt4.setBackground(null);
			break;
		case 53:
			bt5.setOpaque(true);
			bt5.setBackground(null);
			break;
		case 54:
			bt6.setOpaque(true);
			bt6.setBackground(null);
			break;
		case 55:
			bt7.setOpaque(true);
			bt7.setBackground(null);
			break;
		case 56:
			bt8.setOpaque(true);
			bt8.setBackground(null);
			break;
		case 57:
			bt9.setOpaque(true);
			bt9.setBackground(null);
			break;
		case 65:
			a.setOpaque(true);
			a.setBackground(null);
			break;
		case 66:
			b.setOpaque(true);
			b.setBackground(null);
			break;
		case 67:
			c.setOpaque(true);
			c.setBackground(null);
			break;
		case 68:
			d.setOpaque(true);
			d.setBackground(null);
			break;
		case 69:
			e.setOpaque(true);
			e.setBackground(null);
			break;
		case 70:
			f.setOpaque(true);
			f.setBackground(null);
			break;
		case 71:
			bt_g.setOpaque(true);
			bt_g.setBackground(null);
			break;
		case 72:
			h.setOpaque(true);
			h.setBackground(null);
			break;
		case 73:
			i.setOpaque(true);
			i.setBackground(null);
			break;
		case 74:
			j.setOpaque(true);
			j.setBackground(null);
			break;
		case 75:
			k.setOpaque(true);
			k.setBackground(null);
			break;
		case 76:
			l.setOpaque(true);
			l.setBackground(null);
			break;
		case 77:
			m.setOpaque(true);
			m.setBackground(null);
			break;
		case 78:
			n.setOpaque(true);
			n.setBackground(null);
			break;
		case 79:
			o.setOpaque(true);
			o.setBackground(null);
			break;
		case 80:
			p.setOpaque(true);
			p.setBackground(null);
			break;
		case 81:
			q.setOpaque(true);
			q.setBackground(null);
			break;
		case 82:
			r.setOpaque(true);
			r.setBackground(null);
			break;
		case 83:
			s.setOpaque(true);
			s.setBackground(null);
			break;
		case 84:
			t.setOpaque(true);
			t.setBackground(null);
			break;
		case 85:
			u.setOpaque(true);
			u.setBackground(null);
			break;
		case 86:
			v.setOpaque(true);
			v.setBackground(null);
			break;
		case 87:
			w.setOpaque(true);
			w.setBackground(null);
			break;
		case 88:
			x.setOpaque(true);
			x.setBackground(null);
			break;
		case 89:
			y.setOpaque(true);
			y.setBackground(null);
			break;
		case 90:
			z.setOpaque(true);
			z.setBackground(null);
			break;
		case 192:
			btTilda.setOpaque(true);
			btTilda.setBackground(null);
			break;
		case 8:
			btBkSpc.setOpaque(true);
			btBkSpc.setBackground(null);
			break;
		case 91:
			btBrO.setOpaque(true);
			btBrO.setBackground(null);
			break;
		case 92:
			btBkSlsh.setOpaque(true);
			btBkSlsh.setBackground(null);
			break;
		case 93:
			btBrC.setOpaque(true);
			btBrC.setBackground(null);
			break;
		case 222:
			btQt.setOpaque(true);
			btQt.setBackground(null);
			break;
		case 59:
			btColon.setOpaque(true);
			btColon.setBackground(null);
			break;
		case 61:
			btPlus.setOpaque(true);
			btPlus.setBackground(null);
			break;
		case 45:
			btMinus.setOpaque(true);
			btMinus.setBackground(null);
			break;
		case 10:
			btEnter.setOpaque(true);
			btEnter.setBackground(null);
			break;
		case 44:
			btComma.setOpaque(true);
			btComma.setBackground(null);
			break;
		case 46:
			btDot.setOpaque(true);
			btDot.setBackground(null);
			break;
		case 47:
			btQueMrk.setOpaque(true);
			btQueMrk.setBackground(null);
			break;
		case 37:
			btLeft.setOpaque(true);
			btLeft.setBackground(null);
			break;
		case 38:
			btUp.setOpaque(true);
			btUp.setBackground(null);
			break;
		case 39:
			btRight.setOpaque(true);
			btRight.setBackground(null);
			break;
		case 40:
			btDown.setOpaque(true);
			btDown.setBackground(null);
			break;
		case 32:
			btSpace.setOpaque(true);
			btSpace.setBackground(null);
			break;
		case 9:
			btTab.setOpaque(true);
			btTab.setBackground(null);
			break;
		case 20:
			btCaps.setOpaque(true);
			btCaps.setBackground(null);
			break;
		case 16:
			btShift.setOpaque(true);
			btShift.setBackground(null);
			break;
		}
		
	}

}