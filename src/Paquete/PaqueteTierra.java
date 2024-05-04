package Paquete;

public class PaqueteTierra extends Paquete{
    private int distancia;
    private String tipoVehiculo;


    public PaqueteTierra(float peso, String destino, int distancia, String tipoVehiculo) {
        super(peso, destino);
        this.distancia = distancia;
        this.tipoVehiculo = tipoVehiculo;
    }

    public PaqueteTierra(boolean enviado, float peso, String destino, boolean seguro, boolean entregaMismoDia, int distancia, String tipoVehiculo) {
        super(enviado,peso, destino, seguro, entregaMismoDia);
        this.distancia = distancia;
        this.tipoVehiculo = tipoVehiculo;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    @Override
    public String toString() {
        return  super.toString()+ calcularTotalPaquete()+"  Tierra{" +
                "distancia=" + distancia +
                ", tipoVehiculo='" + tipoVehiculo + '\'' +
                '}';
    }

    @Override
    public float calcularTarifaEnvio() {
        float envioTierra=25;
        float precioFinal=getPeso()*envioTierra;
        if(tipoVehiculo.equalsIgnoreCase("camion"))
        {
            precioFinal*=1.10f;
        }
        if(distancia>100)
        {
            int kmAdicional=distancia-100;
            precioFinal+=precioFinal+(kmAdicional*0.05f);
        }

        return precioFinal;
    }


    public float calcularCostoAdicional() {
        float costoAdicional=calcularTarifaEnvio();
        if(isSeguro() == true)
        {
            costoAdicional+=1500;
        }
        if(isEntregaMismoDia()==true)
        {
            costoAdicional*=1.25f;
        }
        return costoAdicional;
    }

    @Override
    public String calcularTotalPaquete() {
        return "El total del paquete es  : "+calcularCostoAdicional();
    }
}
