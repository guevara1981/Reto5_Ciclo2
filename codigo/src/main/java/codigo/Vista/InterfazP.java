package codigo.Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class InterfazP extends JFrame implements ActionListener {

    JButton btn01;
    JButton btn02;
    JButton btn03;
    JPanel panel01;

    public InterfazP (){

        setTitle("Informes Construccion");
        setSize(500,200);
        setResizable(false);
        setLocation(500, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Boton1
        btn01=new JButton("Informe Uno");
        btn01.setBounds(40,20,120,40);
        btn01.addActionListener(this);
        add(btn01);

         //Boton2
        btn02=new JButton("Informe Dos");
        btn02.setBounds(180,20,120,40);
        btn02.addActionListener(this);
        add(btn02);

         //Boton3
        btn03=new JButton("Informe Tres");
        btn03.setBounds(320,20,120,40);
        btn03.addActionListener(this);
        add(btn03);

        panel01=new JPanel();
        panel01.setBounds(100,20,120,40);
        add(panel01);
       
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        if (e.getSource()==btn01){
        new Interfaz1();
        }

        else if (e.getSource()==btn02){
            new Interfaz2();
        }

       else if (e.getSource()==btn03){
           new Interfaz3();
        }
              
    }

    
}
