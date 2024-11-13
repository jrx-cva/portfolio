import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MainFrame extends JFrame implements ActionListener {
	
	/////////////////////////////////////////////////////////////////////////////////////
	//
	// ESTADO
	//
	/////////////////////////////////////////////////////////////////////////////////////
	
	//Pixeles a usar en los Layouts como "hueco" entre componentes
        private	static final byte GAP = 10;
	
        //Enlace al controlador
	Controlador miControlador;
	
	//Fichero seleccionado con el JFileChooser
	String ficheroSeleccionado;
		   
	// Paneles para dividir la pantalla en zonas    
        JPanel panelBase;
        JPanel panelEntrada;
        JPanel panelEntradaIzq;
        JPanel panelEntradaDer;    
        JPanel panelSelectorFichero;
        JPanel panelContenidoFichero;
        JPanel panelSur;
        JPanel panelBotonera;
        JPanel panelResultado;
    
   	 	//Para los paneles de entrada de datos
		JLabel lGen;
		JLabel lMutaciones;
		JTextField tfGen;
        JLabel lDataMutaciones;
        JButton botonMasMutas;
        JButton botonMenosMutas;
    
        //Selección de fichero FASTA
        JButton botonSelector;    
        JLabel lFileSelected;
        JTextArea taHeadFASTA;
    
        //Para la botonera
        JButton botonEmpezar;
        JButton botonSalir;
    
        //Para mostrar errores/progreso...
        JLabel lEstado;
    
    
	/////////////////////////////////////////////////////////////////////////////////////
	//
	// COMPORTAMIENTO
	//
	/////////////////////////////////////////////////////////////////////////////////////
    
    //Constructor. Se encarga de crear los paneles y colocarlos, crear los componentes
    // y colocarlos
    
    public MainFrame(String title) {
	     super(title);  //Para que se muestre el título
	     
        
	     //Bordes para los paneles
	     Border blackline, loweredetched;
	     blackline = BorderFactory.createLineBorder(Color.black);
	     loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
	     //
	     
	     
	     
	     ficheroSeleccionado="";
    	
	     //Recogemos referencia al controlador
    	      miControlador = Controlador.getSingleton();
    	 
    	//Crear el frame.
		
		//asignamos el tamaño a nuestra ventana, y hacemos que se cierre cuando nos pulsan
		//la X de cerrar la ventana
		
		this.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		//Crear los paneles
		panelBase = new JPanel();
		panelBase.setLayout(new BoxLayout(panelBase,BoxLayout.Y_AXIS));
		panelEntrada = new JPanel(new FlowLayout(FlowLayout.CENTER, GAP,GAP));
	    panelEntradaIzq = new JPanel(new FlowLayout(FlowLayout.CENTER, GAP,GAP));
	    panelEntradaDer = new JPanel(new FlowLayout(FlowLayout.CENTER, GAP,GAP));
	    panelSelectorFichero = new JPanel(new FlowLayout(FlowLayout.CENTER, GAP,GAP));
	    panelContenidoFichero = new JPanel(new FlowLayout(FlowLayout.CENTER, GAP,GAP));
	    panelSur = new JPanel(new FlowLayout(FlowLayout.CENTER, GAP,GAP));
	    panelBotonera = new JPanel(new FlowLayout(FlowLayout.CENTER, GAP,GAP));
	    panelResultado = new JPanel(new FlowLayout(FlowLayout.CENTER, GAP,GAP));		
				
	    //Añadir los paneles en la frame (ventana).
	    panelEntrada.add(panelEntradaIzq);
	    panelEntrada.add(panelEntradaDer);
	    this.add(panelBase);
	    
	    panelBase.add(panelEntrada);//,BorderLayout.NORTH);
	    panelBase.add(Box.createRigidArea(new Dimension(800,5)));
	    panelBase.add(panelSelectorFichero);//,BorderLayout.CENTER);
	    panelBase.add(Box.createRigidArea(new Dimension(800,5)));
	    panelBase.add(panelContenidoFichero);//,BorderLayout.CENTER);
	    panelBase.add(Box.createRigidArea(new Dimension(800,5)));
	    panelBase.add(panelSur);//,BorderLayout.SOUTH);
	    panelSur.add(panelBotonera);
	    panelSur.add(Box.createRigidArea(new Dimension(100,5)));
	    panelSur.add(panelResultado);
	    
	    //4. Coloreamos los paneles para diferenciarlos

	    panelEntrada.setBackground(new java.awt.Color(151, 153, 166));
	    panelEntradaIzq.setBackground(new java.awt.Color(151, 153, 166));
	    panelEntradaDer.setBackground(new java.awt.Color(151, 153, 166));	    
	    panelSelectorFichero.setBackground(new java.awt.Color(193, 199, 217));
	    panelContenidoFichero.setBackground(new java.awt.Color(151, 153, 166));
	    panelBotonera.setBackground(new java.awt.Color(166, 141, 133));
	    panelResultado.setBackground(new java.awt.Color(151, 153, 166));
		
	    //5. Bordes de los paneles
	    panelBase.setBorder(blackline);
	    panelEntrada.setBorder(loweredetched);
	    panelEntradaIzq.setBorder(loweredetched);
	    panelEntradaDer.setBorder(loweredetched);
	    panelSelectorFichero.setBorder(blackline);
	    panelContenidoFichero.setBorder(loweredetched);
	    panelBotonera.setBorder(blackline);
	    panelResultado.setBorder(blackline);
	    
	    
	    //6 Ahora toca crear y añadir los componentes
	    //Panel de entrada
	    lGen = new JLabel("Gen: ");
	    lMutaciones= new JLabel("Mutaciones: ");
	    tfGen = new JTextField(40);
	    lDataMutaciones = new JLabel("0");
	    botonMasMutas = new JButton("+") ;
	    botonMenosMutas = new JButton("-");
	    
	    panelEntradaIzq.add(lGen);
	    panelEntradaIzq.add(tfGen);
	    
	    panelEntradaDer.add(lMutaciones);
	    panelEntradaDer.add(lDataMutaciones);
	    panelEntradaDer.add(botonMasMutas);
	    panelEntradaDer.add(botonMenosMutas);
	    botonMasMutas.addActionListener(this);
	    botonMenosMutas.addActionListener(this);
	    
	     
	    //Panel de selección de fichero
	    
	    botonSelector = new JButton("Abrir el fichero FASTA");
	    botonSelector.addActionListener(this);
	    lFileSelected = new JLabel("Ningún fichero seleccionado");
	    
	    
	    
	    panelSelectorFichero.add(botonSelector);
	    panelSelectorFichero.add(lFileSelected);
	    
	    //Panel de contenido de fichero
	    taHeadFASTA = new JTextArea();	    	   	    
	    panelContenidoFichero.add(taHeadFASTA);
	    
	    //Panel Botonera
	    botonEmpezar = new JButton("Empezar");
	    botonEmpezar.addActionListener(this);
	    botonSalir = new JButton("Salir");
	    botonSalir.addActionListener(this);
	    
	    panelBotonera.add(botonEmpezar);
	    panelBotonera.add(botonSalir);	    
	    
	    //Panel Resultado
	    lEstado = new JLabel("En espera");
	    panelResultado.add(lEstado);
    }

    @Override
	public void actionPerformed(ActionEvent ae) {
		String text = ((JButton)ae.getSource()).getText();
		Controlador miControlador = Controlador.getSingleton();
		// TODO Auto-generated method stub
		if (text.contentEquals("+")) {
			incrementaMutaciones();
		} else if (text.contentEquals("-")) { 
			decrementaMutaciones();
		} else if (text.contentEquals("Empezar")) { 
			lEstado.setText("Realizando proceso búsqueda...");
			if (tfGen.getText().length()==0) {
				lEstado.setText("Introduzca un gen antes de buscar");
			} else if (ficheroSeleccionado.length()==0) {
				lEstado.setText("Seleccione un fichero antes de buscar");
			} else {
				miControlador.realizaBusqueda(tfGen.getText(),lDataMutaciones.getText(),ficheroSeleccionado);
				lEstado.setText("Proceso búsqueda finalizado");
			}
		} else if (text.contentEquals("Salir")) { 
			terminar();
		} else if (text.contentEquals("Abrir el fichero FASTA")) {
			try {
				abrirFichero();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
    
    
    public void incrementaMutaciones() {
		String numero = lDataMutaciones.getText();
		int casteo = Integer.parseInt(numero);
		casteo++;
		numero = String.valueOf(casteo);
		lDataMutaciones.setText(numero);
	}
	
	public void decrementaMutaciones() {
		String numero = lDataMutaciones.getText();
		int casteo = Integer.parseInt(numero);
		casteo--;
		if (casteo >= 0) {
			numero = String.valueOf(casteo);
		}
		lDataMutaciones.setText(numero);

		
	}
	
	
	
	public void terminar() {
	   this.dispose();
		
	}
	
	public void abrirFichero() throws IOException {
		JFileChooser chooser = new JFileChooser();
	    FileNameExtensionFilter filter = new FileNameExtensionFilter(
	        "FASTA files", "txt", "fasta");
	    chooser.setFileFilter(filter);
	    int returnVal = chooser.showOpenDialog(this);
	    if(returnVal == JFileChooser.APPROVE_OPTION) {
             ficheroSeleccionado = chooser.getSelectedFile().getAbsolutePath();
             lFileSelected.setText(ficheroSeleccionado);             
             taHeadFASTA.setText(miControlador.cargaHeadFasta(ficheroSeleccionado));            	              
	    }
		
	}
}
