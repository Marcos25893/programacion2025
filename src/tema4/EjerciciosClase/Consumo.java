package tema4.EjerciciosClase;

public class Consumo {

    private Integer kms;
    private Double litros;
    private Double vmed;
    private Double pgas;

    public Consumo(Integer kms, Double litros, Double vmed, Double pgas) {
        this.kms = kms;
        this.litros = litros;
        this.vmed = vmed;
        this.pgas = pgas;
    }

    public Integer getKms() {
        return kms;
    }

    public void setKms(Integer kms) {
        this.kms = kms;
    }

    public Double getLitros() {
        return litros;
    }

    public void setLitros(Double litros) {
        this.litros = litros;
    }

    public Double getVmed() {
        return vmed;
    }

    public void setVmed(Double vmed) {
        this.vmed = vmed;
    }

    public Double getPgas() {
        return pgas;
    }

    public void setPgas(Double pgas) {
        this.pgas = pgas;
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Consumo{");
        sb.append("kms=").append(kms);
        sb.append(", litros=").append(litros);
        sb.append(", vmed=").append(vmed);
        sb.append(", pgas=").append(pgas);
        sb.append('}');
        return sb.toString();
    }

    public double getTiempo(){
        double tiempo;
        return tiempo=this.kms/this.vmed;
    }
    public double consumoMedio(){
        double consumoG;
        return consumoG=(this.litros*100)/this.kms;
    }
    public double consumoEuros(){
        double consumoE;
        return consumoE=(this.litros*this.pgas*100)/this.kms;
    }
}
