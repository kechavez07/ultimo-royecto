//Ptrones 
//21/08/2022    4:47
package controlador;

import vista.FrmConfirmacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static java.lang.String.valueOf;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.PedidoBebidas;
import modelo.PedidosDAO;
import vista.FrmBebidas;
import vista.FrmEntradas;
import vista.FrmFuerte;
import vista.FrmPostre;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.ClienteDAO;
import modelo.FabricaPedido;
import modelo.PedidosEntradas;
import modelo.PedidosFuertes;
import modelo.PedidosPostres;
import modelo.Plato;
import modelo.PlatoDAO;
import modelo.Usuario;
import modelo.UsuarioDAO;
import vista.FrmEscogeTuSabor;
import vista.FrmLogin;
import vista.FrmMenu;
import vista.FrmPerfil;
import vista.FrmRegistrar;
import vista.FrmVerIngredientes;
import vista.FrmVersion;
import vista.FrmVisualisarInformacionPedido;
import vista.FrmhistorialOrdenes;

public class ControladorRestaurante implements ActionListener, KeyListener  {
    PedidosDAO pedDAO; 
    FrmBebidas objetoVistaBebidas;
    FrmEntradas objetoVistaEntradas;
    FrmFuerte objetoVistaFuerte;
    FrmPostre objetoVistaPostre;
    FrmConfirmacion objetoVistaConfirmacion;
    UsuarioDAO objetoDAO= new UsuarioDAO();
    FrmRegistrar objetoRegistrar=new FrmRegistrar();
    FrmLogin objetoLogin = new FrmLogin();
    FrmPerfil objetoPerfil;
    FrmMenu menu = new FrmMenu();
    FrmEscogeTuSabor menu2 = new FrmEscogeTuSabor();
    Usuario objetoUsuario= new Usuario();
    FrmVerIngredientes objetoVistaIngredientes;
    FrmVisualisarInformacionPedido objetoVistaFactura;
    PlatoDAO platodao;
    Plato pla= new Plato();
    FrmVersion objetoVersion;
    FrmhistorialOrdenes historial;
    Cliente  cliente1;
    ClienteDAO clienteDAO;
    Cliente objetoCliente= new Cliente(); 
    FabricaPedido pedBeb= new PedidoBebidas();
    FabricaPedido pedEntradas= new PedidosEntradas();
    FabricaPedido pedFuertes= new PedidosEntradas();
    FabricaPedido pedPostres= new PedidosPostres();
//inicializamos 
    public ControladorRestaurante(
            FrmEscogeTuSabor vista, 
            FrmLogin frmLogin, 
            FrmRegistrar frmRegistrar,
            FrmMenu frmMenu,
            UsuarioDAO usuarioDao,
            FrmPerfil frmPerfil,
            FrmBebidas frmBebidas,
            PedidosDAO pedidosDAO,
            FrmConfirmacion confirmacion,
            FrmVisualisarInformacionPedido factura,
            FrmVerIngredientes ingrediente,
            PlatoDAO plato,
            FrmEntradas frmEntradas,
            FrmFuerte frmFuertes,
            FrmPostre frmPostre,
            FrmVersion frmVersion,
            FrmhistorialOrdenes frmhistorialOrdenes,
            ClienteDAO clienteDAO
    ){
        menu2= vista;
        menu2.miRegistrarse.addActionListener(this);
        menu2.miLogin.addActionListener(this);
        menu2.miSalir.addActionListener(this);
        
        this.objetoLogin = frmLogin;
        this.objetoLogin.btnLogin.addActionListener(this);
        this.objetoLogin.btnCancelar.addActionListener(this);
        this.objetoLogin.txtID.addKeyListener(this);
        this.objetoLogin.txtContrase??a.addKeyListener(this);
        
        this.objetoRegistrar= frmRegistrar;
        this.objetoRegistrar.btnRegistrar.addActionListener(this);
        this.objetoRegistrar.btnLogin.addActionListener(this);
        this.objetoRegistrar.txtNombre.addKeyListener(this);
        this.objetoRegistrar.txtApellido.addKeyListener(this);
        this.objetoRegistrar.txtID.addKeyListener(this);
        this.objetoRegistrar.txtContrase??a.addKeyListener(this);
        this.objetoRegistrar.txtRepetirContrase??a.addKeyListener(this);
        this.objetoRegistrar.txtEmail.addKeyListener(this);
        this.objetoRegistrar.txtNumeroCelular.addKeyListener(this);
        this.objetoRegistrar.txtDia.addKeyListener(this);
        this.objetoRegistrar.txtMes.addKeyListener(this);
        this.objetoRegistrar.txtA??o.addKeyListener(this);
        
        this.menu = frmMenu;
        this.menu.miPerfil.addActionListener(this);
        this.menu.btnBebidas.addActionListener(this);
        this.menu.btnEntrada.addActionListener(this);
        this.menu.btnFuerte.addActionListener(this);
        this.menu.btnPostre.addActionListener(this);
        this.menu.txtNumeroPedido.addKeyListener(this);
        this.menu.btnConfirmacionPedidos.addActionListener(this);
        this.menu.miCerrarSesion.addActionListener(this);
        this.menu.miVersion.addActionListener(this);
        this.menu.jmHistorial.addActionListener(this);
        
        this.objetoDAO = usuarioDao;
        
        this.objetoPerfil = frmPerfil;
        this.objetoPerfil.btnEditar.addActionListener(this);
        this.objetoPerfil.btnModificar.addActionListener(this);
        this.objetoPerfil.txtNombre.addKeyListener(this);
        this.objetoPerfil.txtApellido.addKeyListener(this);
        this.objetoPerfil.txtContrase??a.addKeyListener(this);
        this.objetoPerfil.txtEmail.addKeyListener(this);
        this.objetoPerfil.txtNumeroCelular.addKeyListener(this);
        this.objetoPerfil.txtDia.addKeyListener(this);
        this.objetoPerfil.txtMes.addKeyListener(this);
        this.objetoPerfil.txtA??o.addKeyListener(this);
        this.objetoPerfil.btnMenu.addActionListener(this);
        
        this.objetoVistaBebidas=frmBebidas;
        this.objetoVistaBebidas.rbCoca.addActionListener(this);
        this.objetoVistaBebidas.txtCoca.addKeyListener(this);
        this.objetoVistaBebidas.rbFanta.addActionListener(this);
        this.objetoVistaBebidas.rbSprite.addActionListener(this);
        this.objetoVistaBebidas.txtSprite.addActionListener(this);
        this.objetoVistaBebidas.txtPedidoBebidas.addKeyListener(this);
        this.objetoVistaBebidas.btnAgregarBebidas.addActionListener(this);
        this.objetoVistaBebidas.btnRegresar.addActionListener(this);
        
        
        this.pedDAO = pedidosDAO;

        this.objetoVistaConfirmacion = confirmacion;
        this.objetoVistaConfirmacion.txtBuscarPedidoconfirmacion.addKeyListener(this);
        this.objetoVistaConfirmacion.btnEliminar.addActionListener(this);
        this.objetoVistaConfirmacion.btnConfirmar.addActionListener(this);
        this.objetoVistaConfirmacion.btnRegresar.addActionListener(this);
        this.objetoVistaConfirmacion.btnActualizar.addActionListener(this);
        
       this.objetoVistaFactura = factura;
       this.objetoVistaFactura.btnVerIngredientes.addActionListener(this);
       this.objetoVistaFactura.btnMenu.addActionListener(this);
       
       this.objetoVistaIngredientes = ingrediente ;
        this.platodao= plato;
        
        this.objetoVistaIngredientes.btnregresar.addActionListener(this);

        
        
        this.objetoVistaEntradas = frmEntradas;
        this.objetoVistaEntradas.btnAgregarEntrada.addActionListener(this);
        this.objetoVistaEntradas.rbBolonVerde.addActionListener(this);
        this.objetoVistaEntradas.rbEmpanadaMorocho.addActionListener(this);
        this.objetoVistaEntradas.rbPanYuca.addActionListener(this);
        this.objetoVistaEntradas.txtCantidadBolon.addKeyListener(this);
        this.objetoVistaEntradas.txtCantidadEmpanadasMorocho.addKeyListener(this);
        this.objetoVistaEntradas.txtCantidadPan.addKeyListener(this);
        this.objetoVistaEntradas.btnRegresarEntrada.addActionListener(this);

        this.objetoVistaFuerte=frmFuertes;
        this.objetoVistaFuerte.rbArroz.addActionListener(this);
        this.objetoVistaFuerte.rbChurrasco.addActionListener(this);
        this.objetoVistaFuerte.rbEncebollado.addActionListener(this);
        this.objetoVistaFuerte.txtCantidadArroz.addKeyListener(this);
        this.objetoVistaFuerte.txtCantidadChurrasco.addKeyListener(this);
        this.objetoVistaFuerte.txtCantidadEncebollado.addKeyListener(this);
        this.objetoVistaFuerte.btnAgregarFuerte.addActionListener(this);
        this.objetoVistaFuerte.jlArrosPrecio.addKeyListener(this);
        this.objetoVistaFuerte.jlChurrascoPrecio.addKeyListener(this);
        this.objetoVistaFuerte.jlEncebollado.addKeyListener(this);
        this.objetoVistaFuerte.btnRegresar.addActionListener(this);
        
        this.objetoVistaPostre=frmPostre;
        this.objetoVistaPostre.rbCoco.addActionListener(this);
        this.objetoVistaPostre.rbDulceGuayaba.addActionListener(this);
        this.objetoVistaPostre.rbEspumillaNaranjilla.addActionListener(this);
        this.objetoVistaPostre.btnAgregarPostre.addActionListener(this);
        this.objetoVistaPostre.txtCantidadCoco.addKeyListener(this);
        this.objetoVistaPostre.txtCantidadDGuayaba.addKeyListener(this);
        this.objetoVistaPostre.txtCatidadEspumilla.addKeyListener(this);
        this.objetoVistaPostre.txtPedidoPostre.addKeyListener(this);
        this.objetoVistaPostre.btnRegresar.addActionListener(this);
        
        this.objetoVersion = frmVersion;
        this.objetoVersion.btnMenu.addActionListener(this);
        this.clienteDAO=clienteDAO;
        this.historial= frmhistorialOrdenes;
        this.historial.btnMenu.addActionListener(this);
        

    }
     public void llenarTabla(JTable tablaD){
        DefaultTableModel modeloT= new DefaultTableModel();
        tablaD.setModel(modeloT);
        modeloT.addColumn("Descripcion ");
        modeloT.addColumn("Cantidad");
        modeloT.addColumn("Precio");
        Object[] columna = new Object[3];
        int numReg= pedDAO.obtenerPedidos().size();
        for( int i=0; i<numReg;i++){
            pedBeb =(PedidoBebidas)pedDAO.obtenerPedidos().get(i);
            columna[0]= pedBeb.getNombrePedido();
            columna[1]= pedBeb.getCantidad();
            columna[2]= pedBeb.getPrecio();
            modeloT.addRow(columna);      
        }
        for( int i=0; i<numReg;i++){
            pedEntradas =(PedidosEntradas)pedDAO.obtenerPedidos().get(i);
            columna[0]= pedEntradas .getNombrePedido();
            columna[1]= pedEntradas .getCantidad();
            columna[2]= pedEntradas .getPrecio();
            modeloT.addRow(columna);      
        }
    }
     
     public void llenarTablaCliente (JTable tabla){
        DefaultTableModel modeloT= new DefaultTableModel();
        tabla.setModel(modeloT);
        modeloT.addColumn("Numero pedido");
        modeloT.addColumn("Nombre del cliente");
        modeloT.addColumn("Total del pedido");
        Object[] columna = new Object[3];//declaro cuants columnas quiero
        int numReg= clienteDAO.obtenerCliente().size();
         System.out.println("NUMERO DE TAMA??O"+numReg);
        for( int i=0; i<numReg;i++){
            objetoCliente =(Cliente)clienteDAO.obtenerCliente().get(i);
            columna[0]= objetoCliente.getnPedido();
            columna[1]= objetoCliente.getNombreCliente();
            columna[2]= objetoCliente.getPrecioTotal();
            modeloT.addRow(columna);      
        }
     }
      public void limpiarElementos()
    {
        objetoPerfil.txtNombre.setText("");
        objetoPerfil.txtNombre.setEditable(true);
        objetoPerfil.txtApellido.setText("");
        objetoPerfil.txtApellido.setEditable(true);
        objetoPerfil.txtContrase??a.setText("");
        objetoPerfil.txtContrase??a.setEditable(true);
        objetoPerfil.txtEmail.setText("");
        objetoPerfil.txtEmail.setEditable(true);
        objetoPerfil.txtNumeroCelular.setText("");
        objetoPerfil.txtNumeroCelular.setEditable(true);
        objetoPerfil.txtMes.setText("");
        objetoPerfil.txtMes.setEditable(true);
        objetoPerfil.txtA??o.setText("");
        objetoPerfil.txtA??o.setEditable(true);
        
    }
      public void limpiarRegistrar(){
          objetoRegistrar.txtNombre.setText("");
          objetoRegistrar.txtApellido.setText("");
          objetoRegistrar.txtID.setText("");
          objetoRegistrar.txtContrase??a.setText("");
          objetoRegistrar.txtRepetirContrase??a.setText("");
          objetoRegistrar.txtEmail.setText("");
          objetoRegistrar.txtNumeroCelular.setText("");
          objetoRegistrar.txtDia.setText("");
          objetoRegistrar.txtMes.setText("");
          objetoRegistrar.txtA??o.setText("");
          objetoRegistrar.txtID.setEditable(true);
          objetoRegistrar.txtNumeroCelular.setEditable(true);
      }
        @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==menu2.miLogin){
            menu2.setVisible(false);
            objetoLogin.setVisible(true);
        }
        if(e.getSource()==menu2.miRegistrarse){
            menu2.setVisible(false);
            objetoRegistrar.setVisible(true);
            
            
        }
        if (e.getSource()==objetoVistaIngredientes.btnregresar){
           objetoVistaIngredientes.setVisible(false);
           objetoVistaFactura.setVisible(true);
        }
//Cerrar todo
        if(e.getSource()==menu2.miSalir){
            this.menu2.dispose();
        }
//Resgistrar se agregan los datos del no usuario, usamos la clase Usuario para usar los metodos de usauarioDAO
        if(e.getSource()==objetoRegistrar.btnRegistrar){
                String nombre= objetoRegistrar.txtNombre.getText();
                String apellido= objetoRegistrar.txtApellido.getText();
                String id= objetoRegistrar.txtID.getText();
                String contrase??a= objetoRegistrar.txtContrase??a.getText();
                String email= objetoRegistrar.txtEmail.getText();
                String numeroCelular= objetoRegistrar.txtNumeroCelular.getText();
                String dia= objetoRegistrar.txtDia.getText();
                String mes= objetoRegistrar.txtMes.getText();
                String a??o= objetoRegistrar.txtA??o.getText();
                Usuario objetoUsuario= new Usuario(nombre,apellido,id,contrase??a,email,numeroCelular,dia,mes,a??o);
                objetoDAO.insertarUsuario(objetoUsuario);
                limpiarRegistrar();
                
        }
        if(e.getSource()==objetoRegistrar.btnLogin){
            objetoRegistrar.setVisible(false);
            objetoLogin.setVisible(true);
        }
//Valida el id y contrase??a en la base de datos, 
        if(e.getSource()== objetoLogin.btnLogin){
                String id = "";
                String contrase??a = "";
                id=objetoLogin.txtID.getText();
                contrase??a=objetoLogin.txtContrase??a.getText();
                if(objetoDAO.validarLogin(id, contrase??a)){
                    objetoUsuario = objetoDAO.obtenerUsuario(id);
                    objetoLogin.setVisible(false);
                    menu.setVisible(true);
                }else{
                JOptionPane.showMessageDialog(null, "Id o contrase??a\n  INCORRECTA");
                    }
                objetoLogin.txtID.setText("");
                objetoLogin.txtContrase??a.setText("");
            }
        if(e.getSource()==objetoLogin.btnCancelar){
            objetoLogin.setVisible(false);
            menu2.setVisible(true);
        }
        if(e.getSource()==objetoVersion.btnMenu){
            objetoVersion.setVisible(false);
            menu.setVisible(true);
        }
        if(e.getSource()==objetoVistaConfirmacion.btnRegresar){
            menu.txtNumeroPedido.setText("");
            objetoVistaConfirmacion.setVisible(false);
            menu.setVisible(true);
          }
//Se muestra los campo llenos de nuestro usuario 
        if(e.getSource()==menu.miPerfil){
            menu.setVisible(false);
            objetoPerfil.setVisible(true);
            objetoPerfil.txtNombre.setText(objetoUsuario.getNombre());
            objetoPerfil.txtApellido.setText(objetoUsuario.getApellido());
            objetoPerfil.txtID.setText(objetoUsuario.getId());
            objetoPerfil.txtContrase??a.setText(objetoUsuario.getContrase??a());
            objetoPerfil.txtEmail.setText(objetoUsuario.getEmail());
            objetoPerfil.txtNumeroCelular.setText(objetoUsuario.getNumeroCelular());
            objetoPerfil.txtDia.setText(objetoUsuario.getDia());
            objetoPerfil.txtMes.setText(objetoUsuario.getMes());
            objetoPerfil.txtA??o.setText(objetoUsuario.getA??o());
            objetoPerfil.txtNombre.setEditable(false);
            objetoPerfil.txtApellido.setEditable(false);
            objetoPerfil.txtID.setEditable(false);
            objetoPerfil.txtEmail.setEditable(false);
            objetoPerfil.txtContrase??a.setEditable(false);
            objetoPerfil.txtEmail.setEditable(false);
            objetoPerfil.txtNumeroCelular.setEditable(false);
            objetoPerfil.txtDia.setEditable(false);
            objetoPerfil.txtMes.setEditable(false);
            objetoPerfil.txtA??o.setEditable(false);
        }    
        if(e.getSource()==objetoPerfil.btnMenu){
            objetoPerfil.setVisible(false);
            menu.setVisible(true);
        }

        if(e.getSource()==menu.miVersion){
            menu.setVisible(false);
            objetoVersion.setVisible(true);
        }
        
        if(e.getSource()==menu.miCerrarSesion){
            menu.setVisible(false);
            menu2.setVisible(true);
        }
        if(e.getSource()== menu.jmHistorial){
           menu.setVisible(false);
           historial.setVisible(true);
           llenarTablaCliente(historial.jtHistorial);
        }
        if(e.getSource()==historial.btnMenu){
            historial.setVisible(false);
            menu.setVisible(true);
        }       
        //permite modificar el perfil
        if(e.getSource()==objetoPerfil.btnModificar){
            String nombre = objetoPerfil.txtNombre.getText();
            String apellido = objetoPerfil.txtApellido.getText();
            String id = objetoPerfil.txtID.getText();
            String contrase??a = objetoPerfil.txtContrase??a.getText();
            String email = objetoPerfil.txtEmail.getText();
            String numeroCelular = objetoPerfil.txtNumeroCelular.getText();
            String dia = objetoPerfil.txtDia.getText();
            String mes = objetoPerfil.txtMes.getText();
            String a??o = objetoPerfil.txtA??o.getText();
            objetoDAO.modificar(nombre, apellido, id, contrase??a, email, numeroCelular, dia, mes, a??o);
            objetoPerfil.txtNombre.setEditable(false);
            objetoPerfil.txtApellido.setEditable(false);
            objetoPerfil.txtID.setEditable(false);
            objetoPerfil.txtEmail.setEditable(false);
            objetoPerfil.txtContrase??a.setEditable(false);
            objetoPerfil.txtEmail.setEditable(false);
            objetoPerfil.txtNumeroCelular.setEditable(false);
            objetoPerfil.txtDia.setEditable(false);
            objetoPerfil.txtMes.setEditable(false);
            objetoPerfil.txtA??o.setEditable(false);
            
        }
        
        if(e.getSource()==objetoPerfil.btnEditar){
            objetoPerfil.txtNombre.setEditable(true);
            objetoPerfil.txtApellido.setEditable(true);
            objetoPerfil.txtEmail.setEditable(true);
            objetoPerfil.txtContrase??a.setEditable(true);
            objetoPerfil.txtEmail.setEditable(true);
            objetoPerfil.txtNumeroCelular.setEditable(true);
            objetoPerfil.txtDia.setEditable(true);
            objetoPerfil.txtMes.setEditable(true);
            objetoPerfil.txtA??o.setEditable(true);
        }
        
// llenamos la tabla con los pedidos
        if(e.getSource()==menu.btnConfirmacionPedidos){
            menu.setVisible(false);
            objetoVistaConfirmacion.setVisible(true);
            objetoVistaConfirmacion.txtBuscarPedidoconfirmacion.setText(menu.txtNumeroPedido.getText());
            String pedido=objetoVistaConfirmacion.txtBuscarPedidoconfirmacion.getText();
            DefaultTableModel modeloT= new DefaultTableModel();
            objetoVistaConfirmacion.jlPedidos.setModel(modeloT);
            modeloT.addColumn("Descripcion");
            modeloT.addColumn("Cantidad");
            modeloT.addColumn("Precio");
            modeloT.addColumn("Total");
            Object [] columna= new Object[4];
            int numReg= pedDAO.buscarPedido(pedido).size();
            for(int i=0;i<numReg;i++){
                pedBeb= (PedidoBebidas) pedDAO.buscarPedido(pedido).get(i);
                System.out.println(pedBeb);
                columna[0]=pedBeb.getNombrePedido();
                columna[1]=pedBeb.getCantidad();
                columna[2]= pedBeb.getPrecio();
                columna[3]= pedBeb.getTotal();
                modeloT.addRow(columna);
            }
            for(int i=0;i<numReg;i++){
                pedEntradas = (PedidosEntradas) pedDAO.buscarPedido(pedido).get(i);
                System.out.println(pedEntradas);
                columna[0]=pedEntradas .getNombrePedido();
                columna[1]=pedEntradas .getCantidad();
                columna[2]= pedEntradas .getPrecio();
                columna[3]= pedEntradas .getTotal();
                modeloT.addRow(columna);
            }
            objetoVistaConfirmacion.txtBuscarPedidoconfirmacion.setEditable(false);

        }
        if(e.getSource()==objetoVistaConfirmacion.btnActualizar){
            objetoVistaConfirmacion.txtBuscarPedidoconfirmacion.setText(menu.txtNumeroPedido.getText());
            String pedido=objetoVistaConfirmacion.txtBuscarPedidoconfirmacion.getText();
            DefaultTableModel modeloT= new DefaultTableModel();
            objetoVistaConfirmacion.jlPedidos.setModel(modeloT);
            modeloT.addColumn("Descripcion");
            modeloT.addColumn("Cantidad");
            modeloT.addColumn("Precio");
            modeloT.addColumn("Total");
            Object [] columna= new Object[4];
            int numReg= pedDAO.buscarPedido(pedido).size();
            for(int i=0;i<numReg;i++){
                pedBeb= (PedidoBebidas) pedDAO.buscarPedido(pedido).get(i);
                System.out.println(pedBeb);
                columna[0]=pedBeb.getNombrePedido();
                columna[1]=pedBeb.getCantidad();
                columna[2]= pedBeb.getPrecio();
                columna[3]= pedBeb.getTotal();
                modeloT.addRow(columna);
            }
            for(int i=0;i<numReg;i++){
                pedEntradas = (PedidosEntradas) pedDAO.buscarPedido(pedido).get(i);
                System.out.println(pedEntradas );
                columna[0]=pedEntradas .getNombrePedido();
                columna[1]=pedEntradas .getCantidad();
                columna[2]= pedEntradas .getPrecio();
                columna[3]= pedEntradas .getTotal();
                modeloT.addRow(columna);
            }
            objetoVistaConfirmacion.txtBuscarPedidoconfirmacion.setEditable(false);
        }
// se escogen los productos
        if(e.getSource()==menu.btnBebidas){
            menu.setVisible(false);
            objetoVistaBebidas.setVisible(true);
            objetoVistaBebidas.txtPedidoBebidas.setText(menu.txtNumeroPedido.getText());
            objetoVistaBebidas.txtPedidoBebidas.setEditable(false);
        }
        if(e.getSource()==menu.btnEntrada){
            menu.setVisible(false);
            objetoVistaEntradas.setVisible(true);
            objetoVistaEntradas.txtPedidoEntrada.setText(menu.txtNumeroPedido.getText());
            objetoVistaEntradas.txtPedidoEntrada.setEditable(false);
        }
        if(e.getSource()==menu.btnFuerte){
            menu.setVisible(false);
            objetoVistaFuerte.setVisible(true);
            objetoVistaFuerte.txtPedidoFuertes.setText(menu.txtNumeroPedido.getText());
            objetoVistaFuerte.txtPedidoFuertes.setEditable(false);
        }
        if(e.getSource()==menu.btnPostre){
            menu.setVisible(false);
            objetoVistaPostre.setVisible(true);
            objetoVistaPostre.txtPedidoPostre.setText(menu.txtNumeroPedido.getText());
            objetoVistaPostre.txtPedidoPostre.setEditable(false);
        }
            
        if(e.getSource()==objetoVistaBebidas.btnAgregarBebidas){
           float total=0f;
            String numPedido=objetoVistaBebidas.txtPedidoBebidas.getText();
            if(objetoVistaBebidas.rbCoca.getLabel().equalsIgnoreCase("Coca cola")){
         
                String nombrePed=objetoVistaBebidas.rbCoca.getLabel();
                String cantidad= objetoVistaBebidas.txtCoca.getText();
                String precio= objetoVistaBebidas.jlCoca.getText();
                FabricaPedido objPed= new PedidoBebidas(numPedido,nombrePed, Integer.parseInt(cantidad),precio,valueOf(total));
                objPed.getTotal();
                objPed.setTotal(valueOf(objPed.calcularPrecio(Float.parseFloat(objetoVistaBebidas.jlCoca.getText()))));                

                pedDAO.insertarPedidos(objPed);
            }
            if(objetoVistaBebidas.rbFanta.getLabel().equalsIgnoreCase("Fanta")){

                String nombrePed=objetoVistaBebidas.rbFanta.getLabel();
                String cantidad= objetoVistaBebidas.txtFanta.getText();
                String precio= objetoVistaBebidas.jlFanta.getText();
                FabricaPedido objPed= new PedidoBebidas(numPedido,nombrePed, Integer.parseInt(cantidad),precio,valueOf(total));
                objPed.getTotal();
                objPed.setTotal(valueOf(objPed.calcularPrecio(Float.parseFloat(objetoVistaBebidas.jlFanta.getText()))));  

                pedDAO.insertarPedidos(objPed);
            }
            if(objetoVistaBebidas.rbSprite.getLabel().equalsIgnoreCase("Sprite")){
                
                String nombrePed=objetoVistaBebidas.rbSprite.getLabel();
                String cantidad= objetoVistaBebidas.txtSprite.getText();
                String precio=objetoVistaBebidas.jlSprite.getText();
                FabricaPedido objPed= new PedidoBebidas(numPedido,nombrePed, Integer.parseInt(cantidad),precio,valueOf(total));
                objPed.getTotal();
                objPed.setTotal(valueOf(objPed.calcularPrecio(Float.parseFloat(objetoVistaBebidas.jlSprite.getText()))));  
                pedDAO.insertarPedidos(objPed);
            }
            
        }
        
        if(e.getSource()==objetoVistaBebidas.btnRegresar){
            objetoVistaBebidas.rbCoca.setSelected(false);
            objetoVistaBebidas.rbFanta.setSelected(false);
            objetoVistaBebidas.rbSprite.setSelected(false);
            objetoVistaBebidas.txtCoca.setText("");
            objetoVistaBebidas.txtFanta.setText("");
            objetoVistaBebidas.txtSprite.setText("");
            objetoVistaBebidas.setVisible(false);
            menu.setVisible(true);
        }
        //----------
        if(e.getSource()==objetoVistaPostre.btnAgregarPostre){
            float total=0f;
            String numPedido=objetoVistaPostre.txtPedidoPostre.getText();

            if(objetoVistaPostre.rbDulceGuayaba.getLabel().equalsIgnoreCase("Dulce de Guayaba")){
                String nombrePed=objetoVistaPostre.rbDulceGuayaba.getLabel();
                String cantidad= objetoVistaPostre.txtCantidadDGuayaba.getText();
                String precio=objetoVistaPostre.jlPrecioGuayaba.getText();
                FabricaPedido objPed= new PedidosPostres(numPedido,nombrePed, Integer.parseInt(cantidad),precio,valueOf(total));
                objPed.getTotal();
                objPed.setTotal(valueOf(objPed.calcularPrecio(Float.parseFloat(objetoVistaPostre.jlPrecioGuayaba.getText()))));  
                 pedDAO.insertarPedidos(objPed);
            }
            if(objetoVistaPostre.rbEspumillaNaranjilla.getLabel().equalsIgnoreCase("Espumilla de Naranjilla")){
                String nombrePed=objetoVistaPostre.rbEspumillaNaranjilla.getLabel();
                String cantidad= objetoVistaPostre.txtCatidadEspumilla.getText();
                String precio=objetoVistaPostre.jlPrecioEspumilla.getText();
                FabricaPedido objPed= new PedidosPostres(numPedido,nombrePed, Integer.parseInt(cantidad),precio,valueOf(total));
                objPed.getTotal();
                objPed.setTotal(valueOf(objPed.calcularPrecio(Float.parseFloat(objetoVistaPostre.jlPrecioEspumilla.getText()))));  
                 pedDAO.insertarPedidos(objPed);
            }
            if(objetoVistaPostre.rbCoco.getLabel().equalsIgnoreCase("Bien me sabe de Coco")){ 
                String nombrePed=objetoVistaPostre.rbCoco.getLabel();
                String cantidad= objetoVistaPostre.txtCantidadCoco.getText();
                String precio=objetoVistaPostre.jlPrecioBienCoco.getText();
                FabricaPedido objPed= new PedidosPostres(numPedido,nombrePed, Integer.parseInt(cantidad),precio,valueOf(total));
                objPed.getTotal();
                objPed.setTotal(valueOf(objPed.calcularPrecio(Float.parseFloat(objetoVistaPostre.jlPrecioBienCoco.getText()))));  
                pedDAO.insertarPedidos(objPed);
            }
        }
        if(e.getSource()==objetoVistaPostre.btnRegresar){
            objetoVistaPostre.rbDulceGuayaba.setSelected(false);
            objetoVistaPostre.rbCoco.setSelected(false);
            objetoVistaPostre.rbEspumillaNaranjilla.setSelected(false);
            objetoVistaPostre.txtCantidadCoco.setText("");
            objetoVistaPostre.txtCatidadEspumilla.setText("");
            objetoVistaPostre.txtCantidadDGuayaba.setText("");
            objetoVistaPostre.setVisible(false);
            menu.setVisible(true);
        }
        if(e.getSource()==objetoVistaFuerte.btnAgregarFuerte){
            float total=0f;            
            String numPedido=objetoVistaFuerte.txtPedidoFuertes.getText();
            if(objetoVistaFuerte.rbArroz.getLabel().equalsIgnoreCase("Arroz con Conchas")){ 
                String nombrePed=objetoVistaFuerte.rbArroz.getLabel();
                String cantidad= objetoVistaFuerte.txtCantidadArroz.getText();
                String precio=objetoVistaFuerte.jlArrosPrecio.getText();
                FabricaPedido objPed= new PedidosFuertes(numPedido,nombrePed, Integer.parseInt(cantidad),precio,valueOf(total));
                objPed.getTotal();
                objPed.setTotal(valueOf(objPed.calcularPrecio(Float.parseFloat(objetoVistaFuerte.jlArrosPrecio.getText()))));  
                pedDAO.insertarPedidos(objPed);
                
            }
            if(objetoVistaFuerte.rbChurrasco.getLabel().equalsIgnoreCase("Churrasco")){
                String nombrePed=objetoVistaFuerte.rbChurrasco.getLabel();
                String cantidad= objetoVistaFuerte.txtCantidadChurrasco.getText();
                String precio=objetoVistaFuerte.jlChurrascoPrecio.getText();
                FabricaPedido objPed= new PedidosFuertes(numPedido,nombrePed, Integer.parseInt(cantidad),precio,valueOf(total));
                objPed.getTotal();
                objPed.setTotal(valueOf(objPed.calcularPrecio(Float.parseFloat(objetoVistaFuerte.jlChurrascoPrecio.getText()))));  
                pedDAO.insertarPedidos(objPed);
            }
            if(objetoVistaFuerte.rbEncebollado.getLabel().equalsIgnoreCase("Encebollado")){
                String nombrePed=objetoVistaFuerte.rbEncebollado.getLabel();
                String cantidad= objetoVistaFuerte.txtCantidadEncebollado.getText();
                String precio=objetoVistaFuerte.jlEncebollado.getText();
                FabricaPedido objPed= new PedidosFuertes(numPedido,nombrePed, Integer.parseInt(cantidad),precio,valueOf(total));
                objPed.getTotal();
                objPed.setTotal(valueOf(objPed.calcularPrecio(Float.parseFloat(objetoVistaFuerte.jlEncebollado.getText()))));  
                pedDAO.insertarPedidos(objPed);
            }
        }
        if(e.getSource()==objetoVistaFuerte.btnRegresar){
            objetoVistaFuerte.rbArroz.setSelected(false);
            objetoVistaFuerte.rbChurrasco.setSelected(false);
            objetoVistaFuerte.rbEncebollado.setSelected(false);
            objetoVistaFuerte.txtCantidadArroz.setText("");
            objetoVistaFuerte.txtCantidadChurrasco.setText("");
            objetoVistaFuerte.txtCantidadEncebollado.setText("");
            objetoVistaFuerte.setVisible(false);
            menu.setVisible(true);
        }
        ///----------------------------------------------------------
        if(e.getSource()==objetoVistaEntradas.btnAgregarEntrada){
            float total=0f;
            String numPedido=objetoVistaEntradas.txtPedidoEntrada.getText();
            if(objetoVistaEntradas.rbBolonVerde.getLabel().equalsIgnoreCase("Bolon de Verde")){ 
                String nombrePed=objetoVistaEntradas.rbBolonVerde.getLabel();
                String cantidad= objetoVistaEntradas.txtCantidadBolon.getText();
                String precio=objetoVistaEntradas.jlPrecioBolon.getText();
                FabricaPedido objPed= new PedidosEntradas(numPedido,nombrePed, Integer.parseInt(cantidad),precio,valueOf(total));
                objPed.getTotal();
                objPed.setTotal(valueOf(objPed.calcularPrecio(Float.parseFloat(objetoVistaEntradas.jlPrecioBolon.getText()))));                
                pedDAO.insertarPedidos(objPed);
            }
            if(objetoVistaEntradas.rbEmpanadaMorocho.getLabel().equalsIgnoreCase("Empanadas de morocho")){
                String nombrePed=objetoVistaEntradas.rbEmpanadaMorocho.getLabel();
                String cantidad= objetoVistaEntradas.txtCantidadEmpanadasMorocho.getText();
                String precio=objetoVistaEntradas.jlPrecioEmpanadas.getText();
                FabricaPedido objPed= new PedidosEntradas(numPedido,nombrePed, Integer.parseInt(cantidad),precio,valueOf(total));
                objPed.getTotal();
                objPed.setTotal(valueOf(objPed.calcularPrecio(Float.parseFloat(objetoVistaEntradas.jlPrecioEmpanadas.getText()))));                
                pedDAO.insertarPedidos(objPed);
            }
            if(objetoVistaEntradas.rbPanYuca.getLabel().equalsIgnoreCase("Pan de Yuca")){
                String nombrePed=objetoVistaEntradas.rbPanYuca.getLabel();
                String cantidad= objetoVistaEntradas.txtCantidadPan.getText();
                String precio=objetoVistaEntradas.jlPanYuca.getText();
                FabricaPedido objPed= new PedidosEntradas(numPedido,nombrePed, Integer.parseInt(cantidad),precio,valueOf(total));
                objPed.getTotal();
                objPed.setTotal(valueOf(objPed.calcularPrecio(Float.parseFloat(objetoVistaEntradas.jlPanYuca.getText()))));                
                pedDAO.insertarPedidos(objPed);
            }
        }
        if(e.getSource()==objetoVistaEntradas.btnRegresarEntrada){
            objetoVistaEntradas.rbBolonVerde.setSelected(false);
            objetoVistaEntradas.rbEmpanadaMorocho.setSelected(false);
            objetoVistaEntradas.rbPanYuca.setSelected(false);
            objetoVistaEntradas.txtCantidadBolon.setText("");
            objetoVistaEntradas.txtCantidadEmpanadasMorocho.setText("");
            objetoVistaEntradas.txtCantidadPan.setText("");
            objetoVistaEntradas.setVisible(false);
            objetoVistaEntradas.setVisible(false);
            menu.setVisible(true);
        }

        if(e.getSource()==objetoVistaConfirmacion.btnEliminar){
            int filaInicio=objetoVistaConfirmacion.jlPedidos.getSelectedRow();
            int numFS= objetoVistaConfirmacion.jlPedidos.getSelectedRowCount();
            ArrayList<String> lista= new ArrayList();
            String nom="";
            if(filaInicio>0){
                for(int i=-1;1<numFS;i++){
                    nom=String.valueOf(objetoVistaConfirmacion.jlPedidos.getValueAt(i+filaInicio,0 ));
                    lista.add(nom);
                }
                for(int i=0;i<numFS;i++){
                    int respuesta= JOptionPane.showConfirmDialog(null,"Quiere eliminar el pedido:\n"+nom+"?");
                    if (respuesta==0){
                        pedDAO.eliminarPedidos(nom);
                    }
                    llenarTabla(objetoVistaConfirmacion.jlPedidos);
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "Debe seleccionar una fila a eliminar");
            }
        }
        if(e.getSource()==objetoVistaConfirmacion.btnConfirmar){
            float total=0;
           String pedido=objetoVistaConfirmacion.txtBuscarPedidoconfirmacion.getText();
           objetoVistaFactura.nombreCliente.setText(objetoVistaConfirmacion.txtNombreCliente.getText());
           objetoVistaFactura.numeroPedido.setText(objetoVistaConfirmacion.txtBuscarPedidoconfirmacion.getText());
           DefaultTableModel modeloT= new DefaultTableModel();
            objetoVistaFactura.jtFactura.setModel(modeloT);
            modeloT.addColumn("Descripcion");
            modeloT.addColumn("Cantidad");
            modeloT.addColumn("Precio");
            modeloT.addColumn("Total");
            Object [] columna= new Object[4];
            int numReg= pedDAO.buscarPedido(pedido).size();
            for(int i=0;i<numReg;i++){
                pedBeb= (PedidoBebidas) pedDAO.buscarPedido(pedido).get(i);
                System.out.println(pedBeb);
                columna[0]=pedBeb.getNombrePedido();
                columna[1]=pedBeb.getCantidad();
                columna[2]= pedBeb.getPrecio();
                columna[3]= pedBeb.getTotal();
                total = total + Float.parseFloat(pedBeb.getTotal());
                modeloT.addRow(columna);
            }
            for(int i=0;i<numReg;i++){
                pedEntradas= (PedidosEntradas) pedDAO.buscarPedido(pedido).get(i);
                System.out.println(pedEntradas);
                columna[0]=pedEntradas.getNombrePedido();
                columna[1]=pedEntradas.getCantidad();
                columna[2]= pedEntradas.getPrecio();
                columna[3]= pedEntradas.getTotal();
                total = total + Float.parseFloat(pedEntradas.getTotal());
                modeloT.addRow(columna);
                
            }

            for(int i=0;i<numReg;i++){
                pedFuertes= (PedidosFuertes) pedDAO.buscarPedido(pedido).get(i);
                System.out.println(pedFuertes);
                columna[0]=pedFuertes.getNombrePedido();
                columna[1]=pedFuertes.getCantidad();
                columna[2]= pedFuertes.getPrecio();
                columna[3]= pedFuertes.getTotal();
                total = total + Float.parseFloat(pedFuertes.getTotal());
                modeloT.addRow(columna);
                
            }
            for(int i=0;i<numReg;i++){
                pedPostres= (PedidosFuertes) pedDAO.buscarPedido(pedido).get(i);
                System.out.println(pedPostres);
                columna[0]=pedPostres.getNombrePedido();
                columna[1]=pedPostres.getCantidad();
                columna[2]= pedPostres.getPrecio();
                columna[3]= pedPostres.getTotal();
                total = total + Float.parseFloat(pedPostres.getTotal());
                modeloT.addRow(columna);
                
            }
            objetoVistaFactura.labelTotal.setText(Float.toString(total));
            objetoVistaConfirmacion.setVisible(false);
            objetoVistaFactura.setVisible(true);
            //___________
            //LlenarTabla
           String numeroPed= objetoVistaConfirmacion.txtBuscarPedidoconfirmacion.getText();
           String nombreCli= objetoVistaConfirmacion.txtNombreCliente.getText();
           String totalCliente = objetoVistaFactura.labelTotal.getText();
           Cliente cliente1= new Cliente(numeroPed,nombreCli,totalCliente);
           clienteDAO.insertarCliente(cliente1);
                       
            //____________
            
        }
        if(e.getSource()==objetoVistaFactura.btnVerIngredientes){
           objetoVistaIngredientes.setVisible(true);
           objetoVistaFactura.setVisible(false);
           objetoVistaIngredientes.LabelCliente.setText(objetoVistaFactura.nombreCliente.getText());
           objetoVistaIngredientes.LabelNumeroPedido.setText(objetoVistaFactura.numeroPedido.getText());   
           String pedido=objetoVistaFactura.numeroPedido.getText();
           ArrayList<Plato> listPe = new ArrayList();
           DefaultTableModel modeloT= new DefaultTableModel();
        objetoVistaIngredientes.jIngredientes.setModel(modeloT);
        int k =0; 
        modeloT.addColumn("Nombre del plato ");
        modeloT.addColumn("Ingredientes");
        int numReg3= pedDAO.buscarPedido(pedido).size();
        listPe = platodao.obtenerPlato();        
        Object[] columna = new Object[2];
            for(int i=0;i<numReg3;i++){
                pedBeb= (PedidoBebidas) pedDAO.buscarPedido(objetoVistaFactura.numeroPedido.getText()).get(i);
                System.out.println(pedBeb);
              pla = platodao.buscarPlato(pedBeb.nombrePedido);
               System.out.println("Lista buscada "+listPe.size());
                System.out.println("pla= "+pla);
                 columna[0]=pla.getNombre();
                 columna[1]=pla.getIngredientes();             
                modeloT.addRow(columna);     
            }
            for(int i=0;i<numReg3;i++){
                pedEntradas= (PedidosEntradas) pedDAO.buscarPedido(objetoVistaFactura.numeroPedido.getText()).get(i);
                System.out.println(pedEntradas);
              pla = platodao.buscarPlato(pedEntradas.nombrePedido);
               System.out.println("Lista buscada "+listPe.size());
                System.out.println("pla= "+pla);
                 columna[0]=pla.getNombre();
                 columna[1]=pla.getIngredientes();             
                modeloT.addRow(columna);     
        }
    }
    if(e.getSource()==objetoVistaFactura.btnMenu){
        menu.txtNumeroPedido.setText("");
        objetoVistaFactura.setVisible(false);
        menu.setVisible(true);
    }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    if (e.getSource()== objetoRegistrar.txtNombre) 
        {
            char c= e.getKeyChar();
            if ((c<'a' || c>'z') && (c< 'A'|| c >'Z'))
            {
                e.consume();
            }
        }
          if (e.getSource()== objetoRegistrar.txtApellido) 
        {
            char c= e.getKeyChar();
            if ((c<'a' || c>'z') && (c< 'A'|| c >'Z'))
            {
                e.consume();
            }
        }
         if (e.getSource()== objetoRegistrar.txtID) 
        {
            char c= e.getKeyChar();
            if ((c<'0' || c>'9') )
            {
                e.consume();
            }
        }
         if (e.getSource()== objetoRegistrar.txtNumeroCelular) 
        {
            char c= e.getKeyChar();
            if ((c<'0' || c>'9') )
            {
                e.consume();
            }
        }
         if (e.getSource()== objetoPerfil.txtNombre) 
        {
            char c= e.getKeyChar();
            if ((c<'a' || c>'z') && (c< 'A'|| c >'Z'))
            {
                e.consume();
            }
        }
          if (e.getSource()== objetoPerfil.txtApellido) 
        {
            char c= e.getKeyChar();
            if ((c<'a' || c>'z') && (c< 'A'|| c >'Z'))
            {
                e.consume();
            }
        }
         if (e.getSource()== objetoPerfil.txtNumeroCelular) 
        {
            char c= e.getKeyChar();
            if ((c<'0' || c>'9') )
            {
                e.consume();
            }
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        String id= objetoRegistrar.txtID.getText();
        int lenght1 = id.length();
        if(e.getKeyChar()>='0' && e.getKeyChar()<='9'){
            if (lenght1<10){
                objetoRegistrar.txtID.setEditable(true);
            }else{
                objetoRegistrar.txtID.setEditable(false);
            }
        }
        String numeroCelular1= objetoRegistrar.txtNumeroCelular.getText();
        int lenght2 = numeroCelular1.length();
        if(e.getKeyChar()>='0' && e.getKeyChar()<='9'){
            if (lenght2<10){
                objetoRegistrar.txtNumeroCelular.setEditable(true);
            }else{
                objetoRegistrar.txtNumeroCelular.setEditable(false);
            }
        }
        String numeroCelular2= objetoPerfil.txtNumeroCelular.getText();
        int lenght3 = id.length();
        if(e.getKeyChar()>='0' && e.getKeyChar()<='9'){
            if (lenght3<10){
                objetoPerfil.txtNumeroCelular.setEditable(true);
            }else{
                objetoPerfil.txtNumeroCelular.setEditable(false);
            }
        }
        String id2= objetoRegistrar.txtID.getText();
        int lenght4 = id.length();
        if(e.getKeyChar()>='0' && e.getKeyChar()<='9'){
            if (lenght1<10){
                objetoRegistrar.txtID.setEditable(true);
            }else{
                objetoRegistrar.txtID.setEditable(false);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
       
    }  
}
