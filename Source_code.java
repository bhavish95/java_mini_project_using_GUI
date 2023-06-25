import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class javaproject {
public static void main(String[] args) {
new project();
      }
 }

class project extends JFrame implements ActionListener{

JFrame frame= new JFrame();
//Panel panel= new Panel();

       //Used to show Original List
LinkedList<Integer> list1 = new LinkedList<Integer>(); 
      //Used to shoe Updated List
LinkedList<Integer> list2 = new LinkedList<Integer>();

JLabel label;
JLabel label1;

JTextArea Text1;
JTextArea Text2;

JRadioButton r1= new JRadioButton("STACK");
JRadioButton r2=new JRadioButton("QUEUE");

Button b1= new Button("PUSH");

Button b2= new Button("POP");
Button b3= new Button("ADD");
Button b4= new Button("DELETE");

project(){

Random random = new Random();

for(int i=0;i<10;i++) {
list1.add(random.nextInt(100));
}

list2=list1;

label = new JLabel("Previous List Elements are: ");
label1 = new JLabel("Updated List Elements are: ");

label.setBounds(100, 10, 100, 100);
label1.setBounds(100, 30, 100, 100);

String s1 = new String(); //Used to pass list elements as string in JTextArea Area field
String s2 = new String(); //Used to pass list1 elements as string in JTextArea Area field

//for loop used to convert each list elements to string
for(int i=0;i<list1.size();i++) {
 s1= s1+list1.get(i).toString()+"\t";
}

//for loop used to convert each list1 elements to string
for(int i=0;i<list2.size();i++) {
s2 = s2+list1.get(i).toString()+"\t";
}

Text1 = new JTextArea(s1);
Font f1=new Font(Text1.getFont().getName(), Font.BOLD,Text1.getFont().getSize());
Text1.setFont(f1);
Text1.setEditable(false);
Text1.setLineWrap(true);
Text1.setVisible(true);
Text2 = new JTextArea(s2);
Font f2=new Font(Text2.getFont().getName(), Font.BOLD,Text2.getFont().getSize());
Text2.setFont(f2);
Text2.setEditable(false);
Text2.setLineWrap(true);
Text2.setVisible(true);

frame.setSize(10000,4000);
frame.setLayout(null);

label.setBounds(50,50,330,40);
frame.add(label);
label1.setBounds(50,600,330,40);
label1.setVisible(true);

Text1.setBounds(300,50,1500,30);
frame.add(Text1);
Text2.setBounds(300,600,1000,300);

// adding radio button r1
r1.setBounds(500, 250, 330, 40);
r1.setForeground(Color.red);

frame.add(r1);

// adding radio button r2
r2.setBounds(1000, 250, 330, 30);
r2.setForeground(Color.red);

frame.add(r2);

//adding both radio button in one group...so that only one radio button is selected at a time
ButtonGroup B = new ButtonGroup();
B.add(r1);
B.add(r2);

// adding button b1
b1.addActionListener(this);
b1.setBounds(260, 350, 110, 60);
frame.add(b1);
Font f3=new Font(b1.getFont().getName(), Font.BOLD,b1.getFont().getSize());
b1.setFont(f3);
b1.setForeground(Color.BLUE);


// adding button b2
b2.addActionListener(this);
b2.setBounds(560, 350,110, 60);
frame.add(b2);
Font f4=new Font(b2.getFont().getName(), Font.BOLD,b2.getFont().getSize());
b2.setFont(f4);
b2.setForeground(Color.BLUE);

// adding button b3
b3.addActionListener(this);
b3.setBounds(860, 350, 110, 60);
frame.add(b3);
Font f5=new Font(b3.getFont().getName(), Font.BOLD,b3.getFont().getSize());
b3.setFont(f5);
b3.setForeground(Color.BLUE);

// adding button b4
b4.addActionListener(this);
b4.setBounds(1160, 350, 110, 60);
frame.add(b4);
Font f6=new Font(b4.getFont().getName(), Font.BOLD,b4.getFont().getSize());
b4.setFont(f6);
b4.setForeground(Color.BLUE);

frame.add(label1);
frame.add(Text2);

frame.setBounds(10, 100, 300, 200);
frame.setSize(300, 200);
frame.setLayout(null);

frame.setTitle("MADE BY SUBHAM SHARMA 1000015301");
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public void actionPerformed(ActionEvent e){
try {
if((r1.isSelected()) && (e.getSource()==b1))
{

String num=JOptionPane.showInputDialog(frame,"Enter Value For Stack: ");

list2.addLast(Integer.parseInt(num));

String s3 = new String();
for(int i=0;i<list2.size();i++) {
s3 = s3+list2.get(i).toString()+"\t";
}

Text2.setText(null); //for clear text area
Text2.append(s3); //for insert new string in text area

}
else if((r1.isSelected()) && (e.getSource()==b2))
{

list2.removeLast();

String s3 = new String();
for(int i=0;i<list2.size();i++) {
s3 = s3+list2.get(i).toString()+"\t";
}

Text2.setText(null);
Text2.append(s3);

}


else if((r2.isSelected()) && (e.getSource()==b3))
{
String num=JOptionPane.showInputDialog(frame,"Enter Value For Queue: ");

list2.addLast(Integer.parseInt(num));

String s3 = new String();
for(int i=0;i<list2.size();i++) {
s3 = s3+list2.get(i).toString()+"\t";
}

Text2.setText(null);
Text2.append(s3);

}

else if((r2.isSelected()) && (e.getSource()==b4))
{
list2.removeFirst();

String s3 = new String();
for(int i=0;i<list1.size();i++) {
s3 = s3+list1.get(i).toString()+"\t";
}

Text2.setText(null);
Text2.append(s3);
}

else if((r1.isSelected()) && (e.getSource()==b3))
  {
    throw new Exception();
   }
else if((r1.isSelected()) && (e.getSource()==b4)) 
  {
    throw new Exception();
  }
else if((r2.isSelected()) && (e.getSource()==b1)) 
  {
  throw new Exception();
  }
else if((r2.isSelected()) && (e.getSource()==b2))
  {
  throw new Exception();
  }

}catch(Exception Ex) {

if((r1.isSelected()) && (e.getSource()==b3)) {
JOptionPane.showMessageDialog(frame,"Invalid Operation!","WARNING",JOptionPane.WARNING_MESSAGE);
frame.setDefaultCloseOperation(3);
}
else if((r1.isSelected()) && (e.getSource()==b4)) {
JOptionPane.showMessageDialog(frame,"Invalid Operation!","WARNING",JOptionPane.WARNING_MESSAGE);
frame.setDefaultCloseOperation(3);
}
else if((r2.isSelected()) && (e.getSource()==b1)) {
JOptionPane.showMessageDialog(frame,"Invalid Operation!","WARNING",JOptionPane.WARNING_MESSAGE);
frame.setDefaultCloseOperation(3);
}
