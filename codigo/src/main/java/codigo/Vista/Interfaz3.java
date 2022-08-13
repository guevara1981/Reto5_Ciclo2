package codigo.Vista;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import codigo.Modelo.VO.Consulta3VO;

public class Interfaz3 extends JFrame {

    JPanel panelg;
    JTable tabla;
    DefaultTableModel modelo;
    JScrollPane scpanel01;

    public Interfaz3 (){
        setTitle("Consulta 3");
        setSize(500,500);
        setLocation(500, 250);
        setResizable(false);

        //Tabla
        String[] columnas={"ID","Constructora","Banco"};
        ArrayList<String[]> d=Consulta3VO.valores();
        String[][] datos=new String[d.size()][3];
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
        scpanel01.setBounds(20,20,440,350);
        add(scpanel01);

        panelg=new JPanel();
        panelg.setBackground(new Color(255,51,51));
        add(panelg);

        setVisible(true);

    }
    
}
