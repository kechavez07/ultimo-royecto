
package modelo;

/**
 *
 * @author Jeimy
 */
public class PedidosPostres extends FabricaPedido {

    public PedidosPostres(String numeroPedido, String nombrePedido, int cantidad, String precio1, String total) {
        super(numeroPedido, nombrePedido, cantidad, precio1, total);
    }

    public PedidosPostres() {
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getNombrePedido() {
        return nombrePedido;
    }

    public void setNombrePedido(String nombrePedido) {
        this.nombrePedido = nombrePedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecio1() {
        return precio1;
    }

    public void setPrecio1(String precio1) {
        this.precio1 = precio1;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
    

    @Override
    public float calcularPrecio(float precioProducto) {
        
    return super.getCantidad()*precioProducto;
    }
    
}
