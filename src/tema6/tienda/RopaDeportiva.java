package tema6.tienda;

public class RopaDeportiva extends ProductoBase{

    private String talla;
    private String material;

    public RopaDeportiva(String codigo, String nombre, Double precio, Integer stock, String material, String talla) {
        super(codigo, nombre, precio, stock);
        this.material = material;
        this.talla = talla;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String getInfo() {
        final StringBuffer sb = new StringBuffer("RopaDeportiva{");
        sb.append("codigo='").append(codigo).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", precio=").append(precio);
        sb.append(", stock=").append(stock);
        sb.append(", talla='").append(talla).append('\'');
        sb.append(", material='").append(material).append('\'');
        sb.append('}');
        return sb.toString();
    }


}
