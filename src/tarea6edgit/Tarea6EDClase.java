package tarea6edgit;

/**
 *
 * @author Víctor del Río Gago
 */
public class Tarea6EDClase {

    public void aplicarDescuento(double precioProducto, int numProductos) {
        
        double Total;
        if (numProductos > 3) {
            precioProducto -= 5;
        }
        calculoPagar(numProductos, precioProducto);

    }

    private void calculoPagar(int numProductos, double precioProducto) {
        double Total;
        if (numProductos != 0) {
            Total = precioProducto * DescuentoGrande;
            System.out.println("El total a pagar es:" + Total);
            System.out.println("Enviado");
        } else {
            Total = precioProducto * DescuentoPequenio;
            System.out.println("El total a pagar es:" + Total);
            System.out.println("Enviado");
        }
    }
    private static final double DescuentoPequenio = 0.95;
    private static final double DescuentoGrande = 0.8;
}
