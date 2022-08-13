package codigo.Vista;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import codigo.Modelo.VO.Consulta1VO;

public class Interfaz1 extends JFrame {

    JPanel panelg;
    JTable tabla;
    DefaultTableModel modelo;
    JScrollPane scpanel01; 
   
    public Interfaz1 (){

        setTitle("Primer Informe");
        setSize(500,500);
        setLocation(500, 250);
        setResizable(false);
             
       

        //Tabla
        String[] columnas={"ID","Nombre","Apellido","Ciudad"};
        ArrayList<String[]> d=Consulta1VO.valores();
        String[][] datos=new String[d.size()][4];
        for (int i = 0; i < d.size(); i++) {
            int j=0;
            for (String s : d.get(i)) {
                datos[i][j]=s;
                j++;
                
            }
            
        }
       


        //String [][] datos={{"","","",""},{"","","",""}};
        modelo=new DefaultTableModel(datos, columnas);
        tabla=new JTable(modelo);
        scpanel01=new JScrollPane(tabla);
        scpanel01.setBounds(20,20,440,420);
        add(scpanel01);

        panelg=new JPanel();
        panelg.setBackground(new Color(240,255,51));
        add(panelg);



        setVisible(true);

    }

   
    
}
