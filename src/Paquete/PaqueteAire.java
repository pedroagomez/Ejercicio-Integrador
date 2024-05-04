package Paquete;

public class PaqueteAire extends Paquete{
    private String aerolinea;
    private String claseEnvio;

    public PaqueteAire(float peso, String destino, String aerolinea, String claseEnvio) {
        super(peso, destino);
        this.aerolinea = aerolinea;
        this.claseEnvio = claseEnvio;
    }

    public PaqueteAire(boolean enviado, float peso, String destino, boolean seguro, boolean entregaMismoDia, String aerolinea, String claseEnvio) {
        super(enviado,peso, destino, seguro, entregaMismoDia);
        this.aerolinea = aerolinea;
        this.claseEnvio = claseEnvio;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getClaseEnvio() {
        return claseEnvio;
    }

    public void setClaseEnvio(String claseEnvio) {
        this.claseEnvio = claseEnvio;
    }

    @Override
    public String toString() {
        return  super.toString()+calcularTotalPaquete()+"  Aire{" +
                "aerolinea='" + aerolinea + '\'' +
                ", claseEnvio='" + claseEnvio + '\'' +
                '}';
    }

    @Override
    public float calcularTarifaEnvio() {
        float envioAire=30;
        float precioFinal=getPeso()*envioAire;
        if(aerolinea.equalsIgnoreCase("AA"))
        {
            precioFinal*=1.50f;
        }
        if(claseEnvio.equalsIgnoreCase("express"))
        {
           precioFinal+=1000;
        }
        return precioFinal;

    }

    @Override
    public float calcularCostoAdicional() {
        float costoAdicional=calcularTarifaEnvio();
        if(isSeguro() == true)
        {
            costoAdicional+=2500;
        }
        if(isEntregaMismoDia()==true)
        {
            costoAdicional*=1.50f;
        }
        return costoAdicional;
    }

    @Override
    public String calcularTotalPaquete() {
        return "El total del paquete es  : "+calcularCostoAdicional();
    }
}
