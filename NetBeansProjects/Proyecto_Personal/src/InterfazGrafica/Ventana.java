package InterfazGrafica;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{
    JPanel panel; //Crear el panel
    public Ventana(){
        setTitle("Mi primera ventana"); //Ponerle un titulo a la ventana
        //setLocation(400, 150); //Posición de donde quiero mi ventana
        setSize(500, 500);//Ancho y largo de la ventana
        //setBounds(450, 140, 500, 500); //Contiene la posición(setLocation) y el anho y largo(setSize)
        setLocationRelativeTo(null); //Poner la ventana en el centro
        //setResizable(false); // Establecemos si queremos cambiar el tamaño de la vemtana o no
        setMinimumSize(new Dimension(200,200)); //Hasta que tamaño puedo empequeñar mi ventana
        //getContentPane().setBackground(Color.DARK_GRAY);
        iniciarComponentes(); //LLamar el metodo para el panel
        setDefaultCloseOperation(EXIT_ON_CLOSE); //AL darle click en la x se me termina la ejecución
    }

    //Metodo para trabajar en el panel
    private void crearPanel(){
        panel = new JPanel(); //Instanciamos el panel
        //panel.setBackground(Color.DARK_GRAY); //Establecemos el color del panel
        panel.setLayout(null); //Desactivando el diseño
        getContentPane().add(panel);//Agregamos el panel a la ventana
    }

    private void crearEtiquetas(){
        //Etiqueta tipo texto
        JLabel etiqueta = new JLabel(); //Creamos una etiqueta y le ponemos un nombre a la etiqueta}
        //Aca podemos asignarle al constructor de una vez el nombre y la alineación:
        //JLabel etiqueta = new JLabel("Diego Bautista", SwingConstants.CENTER); 
        etiqueta.setText("El GATO"); //Tambien se puede de esta manera para ponerle un nombre a la etiqueta
        etiqueta.setBounds(85, 10, 300, 80); //Contiene la posición(setLocation) y el anho y largo(setSize)
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER); //Asignamos la alineación horizontal del texto
        etiqueta.setForeground(Color.BLACK); //Color de la letra
        //etiqueta.setOpaque(true); //Le decimos que si queremos pintar el fondo, ya que por defecto no se puede(false)
        //etiqueta.setBackground(Color.WHITE); //Cambiar fondo de la etiqueta
        etiqueta.setFont(new Font("ink free",Font.BOLD, 40));
        panel.add(etiqueta); //Agregamos la etiqueta al panel       

        //Etiqueta tipo imagen
        ImageIcon imagen = new ImageIcon("C:\\Users\\diego\\Downloads\\gato.jpg");
        JLabel etiqueta2 = new JLabel();//Crear una etiqueta
        //JLabel etiqueta2 = new JLabel(new ImageIcon("C:\\Users\\diego\\Downloads\\gato.jpg"));//2da Opcion para añadir imagen
        etiqueta2.setBounds(43, 80, 400, 300);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(etiqueta2);
    }

    private void crearBotones(){
        JButton boton1 = new JButton();
        boton1.setBounds(50, 400, 110, 40);;
        boton1.setText("Aceptar");
        boton1.setEnabled(true);//Establecer si el botón se puede o no clickear
        //boton1.setMnemonic('w'); //Establecemos alt + letra que le pongamos
        boton1.setForeground(Color.WHITE); //Color de la letra del botón
        boton1.setFont(new Font("arial", Font.BOLD, 15)); //Fuente del botón
        boton1.setBackground(Color.BLUE);
        panel.add(boton1);


        //Boton con imagen
        JButton boton2 = new JButton();
        ImageIcon imagen2 = new ImageIcon("C:\\Users\\diego\\Downloads\\x.png");
        boton2.setBounds(180, 400, 110, 40);
        boton2.setForeground(Color.WHITE);
        boton2.setBackground(Color.RED);
        boton2.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(boton2);

        //Boton con bordes
        JButton boton3 = new JButton();
        boton3.setBounds(310, 400, 110, 40);
        boton3.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2, true)); //Darle color, grosor y borde
        panel.add(boton3);
    }

    private void crearBotonRadio(){
        JRadioButton botonradio1 = new JRadioButton();
        botonradio1.setBounds(50,50,100,30);
        botonradio1.setText("Opción1");
        panel.add(botonradio1);

        JRadioButton botonradio2 = new JRadioButton("Opción2",true);
        //JRadioButton botonradio2 = new JRadioButton();
        botonradio2.setBounds(50,80,100,30);
        //botonradio2.setText("Opción2");
        panel.add(botonradio2);

        ButtonGroup grupoBotones = new ButtonGroup();
        grupoBotones.add(botonradio1);
        grupoBotones.add(botonradio2);
    }

    private void crearCajaTexto(){
        JTextField caja = new JTextField();
        caja.setBounds(20, 20, 60, 30);
        caja.setText("Diego");
        System.out.println("El texto es: "+caja.getText()); //Obtener lo que esta en el area de texto
        panel.add(caja);
    }

    private void crearAreaTexto(){
        JTextArea area = new JTextArea();
        area.setBounds(20, 20, 200, 100);
        area.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2, true));
        panel.add(area);
    }

    private void crearListaDesplegable(){
        String[] paises = {"Colombia", "Argentina","Peru", "Chile", "Mexico"};
        JComboBox lista = new JComboBox(paises);
        lista.setBounds(20, 20, 100, 30);
        lista.addItem("Uruguay"); //Añadir mas items a mi lista
        lista.setSelectedItem("Argentina"); //Para indicar cual quiero ver de primeras en mi lista
        panel.add(lista);
    }

    private void iniciarComponentes(){
        crearPanel();
        crearEtiquetas();
        //crearrBotones();
        //crearBotonRadio();
        //crearCajaTexto();
        //crearAreaTexto();
        //crearListaDesplegable();
    }
}
