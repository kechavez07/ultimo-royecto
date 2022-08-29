
package modelo;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import java.util.ArrayList;

public class PedidosDAO {
    public void insertarPedidos(FabricaPedido ped){
        Conexion objCon = new Conexion();
        BasicDBObject documento = new BasicDBObject();
        documento.put("npedido",ped.getNumeroPedido());
        documento.put("nombrePedido",ped.getNombrePedido());
        documento.put("cantidad",ped.getCantidad());
        documento.put("precio",ped.getPrecio());
        documento.put("total",ped.getTotal());
        objCon.coleccionPedido.insert(documento);
    }
    public void eliminarPedidos(String nombrePedido){
         Conexion objCon = new Conexion();
        BasicDBObject documento = new BasicDBObject();
        documento.put("nombrePedido", nombrePedido);
//        documento.put("cantidad", cantidad);
        objCon.coleccionPedido.remove(documento);
    }
    
    public ArrayList obtenerPedidos(){
        ArrayList<FabricaPedido> listaPedidos= new ArrayList<FabricaPedido>();
        FabricaPedido aux1= null;
        FabricaPedido aux2= null;
        FabricaPedido aux3= null;
        FabricaPedido aux4= null;
        Conexion objCon= new Conexion();
        DBCursor cursor= objCon.coleccionPedido.find();
        while (cursor.hasNext()){
            aux1= new PedidoBebidas((String) cursor.next().get("npedido"),
            (String) cursor.next().get("nombrePedido"),
            (int) cursor.next().get("cantidad"),(String) cursor.next().get("precio"),(String) cursor.next().get("total")); 
            aux2= new PedidosEntradas((String) cursor.next().get("npedido"),
            (String) cursor.next().get("nombrePedido"),
            (int) cursor.next().get("cantidad"),(String) cursor.next().get("precio"),(String) cursor.next().get("total")); 
            aux3= new PedidosFuertes((String) cursor.next().get("npedido"),
            (String) cursor.next().get("nombrePedido"),
            (int) cursor.next().get("cantidad"),(String) cursor.next().get("precio"),(String) cursor.next().get("total")); 
            aux4= new PedidosEntradas((String) cursor.next().get("npedido"),
            (String) cursor.next().get("nombrePedido"),
            (int) cursor.next().get("cantidad"),(String) cursor.next().get("precio"),(String) cursor.next().get("total")); 
            listaPedidos.add(aux1);
            listaPedidos.add(aux2);
            listaPedidos.add(aux3);
            listaPedidos.add(aux4);
           
        }
        return listaPedidos;
    }
    public ArrayList buscarPedido(String pedidos) {
        ArrayList<FabricaPedido> listPe = new ArrayList();
        FabricaPedido p1;
        FabricaPedido p2;
        FabricaPedido p3;
        FabricaPedido p4;
        Conexion objCon = new Conexion(); 
        BasicDBObject buscado = new BasicDBObject ("npedido", pedidos);
        DBCursor cursor = objCon.coleccionPedido.find(buscado);
        while(cursor.hasNext()){
            //primero se utiliza el next  y luego los curr
            p1 = new PedidoBebidas((String)cursor.next().get("npedido"), 
                    (String)cursor.curr().get("nombrePedido"),
                    (int)cursor.curr().get("cantidad"),(String)cursor.curr().get("precio"),(String)cursor.curr().get("total"));
                listPe.add(p1);           
        }
        while(cursor.hasNext()){
            p2= new PedidosEntradas((String)cursor.next().get("npedido"), 
                    (String)cursor.curr().get("nombrePedido"),
                    (int)cursor.curr().get("cantidad"),(String)cursor.curr().get("precio"),(String)cursor.curr().get("total"));
                      
            listPe.add(p2);
        }
        while(cursor.hasNext()){
            p3 = new PedidosFuertes((String)cursor.next().get("npedido"), 
                    (String)cursor.curr().get("nombrePedido"),
                    (int)cursor.curr().get("cantidad"),(String)cursor.curr().get("precio"),(String)cursor.curr().get("total"));
            listPe.add(p3); 
        }
        while (cursor.hasNext()){
            p4 = new PedidosPostres((String)cursor.next().get("npedido"), 
                    (String)cursor.curr().get("nombrePedido"),
                    (int)cursor.curr().get("cantidad"),(String)cursor.curr().get("precio"),(String)cursor.curr().get("total"));
            listPe.add(p4);
        }
        return listPe;
    }
    public ArrayList buscarPedidoBebidas(String pedidos) {
        ArrayList<FabricaPedido> listPe = new ArrayList();
        FabricaPedido p1;
        Conexion objCon = new Conexion(); 
        BasicDBObject buscado = new BasicDBObject ("npedido", pedidos);
        DBCursor cursor = objCon.coleccionPedido.find(buscado);
        while(cursor.hasNext()){
            //primero se utiliza el next  y luego los curr
            p1 = new PedidoBebidas((String)cursor.next().get("npedido"), 
                    (String)cursor.curr().get("nombrePedido"),
                    (int)cursor.curr().get("cantidad"),(String)cursor.curr().get("precio"),(String)cursor.curr().get("total"));
 
            listPe.add(p1);
        }
        return listPe;
    }
    public ArrayList buscarPedidoEntradas(String pedidos) {
        ArrayList<FabricaPedido> listPe = new ArrayList();
        FabricaPedido p1;
        Conexion objCon = new Conexion(); 
        BasicDBObject buscado = new BasicDBObject ("npedido", pedidos);
        DBCursor cursor = objCon.coleccionPedido.find(buscado);
        while(cursor.hasNext()){
            //primero se utiliza el next  y luego los curr
            p1 = new PedidosEntradas((String)cursor.next().get("npedido"), 
                    (String)cursor.curr().get("nombrePedido"),
                    (int)cursor.curr().get("cantidad"),(String)cursor.curr().get("precio"),(String)cursor.curr().get("total"));
 
            listPe.add(p1);
        }
        return listPe;
    }
    public ArrayList buscarPedidoFuertes(String pedidos) {
        ArrayList<FabricaPedido> listPe = new ArrayList();
        FabricaPedido p1;
        Conexion objCon = new Conexion(); 
        BasicDBObject buscado = new BasicDBObject ("npedido", pedidos);
        DBCursor cursor = objCon.coleccionPedido.find(buscado);
        while(cursor.hasNext()){
            //primero se utiliza el next  y luego los curr
            p1 = new PedidosFuertes((String)cursor.next().get("npedido"), 
                    (String)cursor.curr().get("nombrePedido"),
                    (int)cursor.curr().get("cantidad"),(String)cursor.curr().get("precio"),(String)cursor.curr().get("total"));
 
            listPe.add(p1);
        }
        return listPe;
    }

    
}
