package tema6.tienda;

public interface Producto{

    String getCodigo();
    String getNombre();
    Double getPrecio();
    Integer getStock();
    void descontarStock(int cantidad);
    String getInfo();
    void setPrecio(Double precio);
    void setStock(Integer stock);

}