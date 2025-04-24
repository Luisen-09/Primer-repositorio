package codigo;
/**
 * @author Luis Enrique Cabrera Lora
 * @version Fecha: 06/03/2025
 */
public class Producto {
	private String nombre;
    private double precio;
    private int stock;

    /**
     * Inicializamos las variables
     */
    public Producto() {
        this.nombre = "Producto desconocido";
        this.precio = 0.0;
        this.stock = 0;
    }
/**
 * Variables para calcular un producto
 * @param nombre Se introduce el nombre del producto
 * @param precio Lo que cuesta el producto
 * @param stock La cantidad total de ese producto que tienen aún
 */
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

  /**
   * Visualiza el nombre
   * @return Devuelve el nombre del producto
   */
    public String getNombre() {
        return nombre;
    }

   /**
    * Cambiamos el nombre del producto
    * @param nombre Asignamos el nombre a la variable privada
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  /**
   * Visualiza el precio
   * @return Devuelve el precio del producto
   */
    public double getPrecio() {
        return precio;
    }

   /**
    * Cambiamos el precio del producto
    * @param precio Asignamos el precio a la variable privada
    */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

 /**
  * Visualiza el stock
  * @return Devuelve la cantidad de stock que hay del producto
  */
    public int getStock() {
        return stock;
    }

   /**
    * Agregamos más productos
    * @throws Si es menor a 0, devuelve una excepción que no puede agregar algo en negativo
    * @param cantidad La cantidad que se añade a la variable del stock
    */
    public void agregarStock(int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("No se puede agregar una cantidad negativa.");
        }
        this.stock += cantidad;
    }

  /**
   * Vender un producto
   * Si la cantidad es menor a 0 ó es mayor a la del stock, devolvemos false y no se hace nada
   * @param cantidad Quitamos la cantidad a la variable del stock
   * @return Devolvemos true con la cantidad quitada del stock
   */
    public boolean vender(int cantidad) {
        if (cantidad < 0) {
            return false;
        }
        if (cantidad > stock) {
            return false;
        }
        this.stock -= cantidad;
        return true;
    }

/**
 * Muestra los datos del producto
 */
    @Override
    public String toString() {
        return "Producto: " + nombre + " | Precio: $" + precio + " | Stock: " + stock;
    }


}
