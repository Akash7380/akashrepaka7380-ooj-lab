import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Division extends Frame implements ActionListener{
    TextField n1,n2,res;
    Label l1,l2,lres;
    Button b;
    public Division(){
        setLayout(new FlowLayout());
        Label l1=new Label("NUM1",Label.RIGHT);
        Label l2=new Label("NUM2",Label.RIGHT);
        Label lres=new Label("RESULT",Label.RIGHT);
        n1=new TextField(12);
        n2=new TextField(8);
        res=new TextField(10);
        b=new Button("DIVIDE");
        add(l1);
        add(n1);
        add(l2);
        add(n2);
        add(b);
        add(lres);
        add(res);      
        b.addActionListener(this);
   addWindowListener(new MyWindowAdapter());
}
public void actionPerformed(ActionEvent ae)
{
    if(ae.getSource()==b)
    {
        try{
        int num1=Integer.parseInt(n1.getText());
        int num2=Integer.parseInt(n2.getText());
        int num3=num1/num2;
        res.setText(String.valueOf(num3));
    }catch(NumberFormatException ne ){
        JOptionPane.showMessageDialog(this,ne,"ERROR", JOptionPane.ERROR_MESSAGE);
    }
    catch(ArithmeticException a){
        JOptionPane.showMessageDialog(this,a,"ERROR", JOptionPane.ERROR_MESSAGE);
    }
}
}
public static void main(String args[])
{
    Division i=new Division();
    i.setSize(new Dimension(400,400));
    i.setTitle("INTEGER DIVISION OF TWO NUMBERS");
    i.setVisible(true);
}

 class MyWindowAdapter extends WindowAdapter{
     public void windowClosing(WindowEvent we)
     {
         System.exit(0);
     }
 }
}