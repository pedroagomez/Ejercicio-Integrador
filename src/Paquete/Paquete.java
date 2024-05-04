package Paquete;

public abstract class Paquete {
    private int id;
    private boolean enviado;
    private static int idGnerado=0;
    private float peso;
    private String destino;
    private boolean seguro;
    private boolean entregaMismoDia;


    public Paquete(float peso, String destino) {

        this.peso = peso;
        this.destino = destino;
        this.id=idGnerado++;
        this.seguro=false;
        this.entregaMismoDia=false;
        this.enviado=false;

    }

    public Paquete(boolean enviado,float peso, String destino, boolean seguro, boolean entregaMismoDia) {
        this.enviado = enviado;

        this.peso = peso;
        this.destino = destino;
        this.seguro = seguro;
        this.entregaMismoDia = entregaMismoDia;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public boolean isEnviado() {
        return enviado;
    }

    public void setEnviado(boolean enviado) {
        this.enviado = enviado;
    }



    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public boolean isSeguro() {
        return seguro;
    }

    public void setSeguro(boolean seguro) {
        this.seguro = seguro;
    }

    public boolean isEntregaMismoDia() {
        return entregaMismoDia;
    }

    public void setEntregaMismoDia(boolean entregaMismoDia) {
        this.entregaMismoDia = entregaMismoDia;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract float calcularTarifaEnvio();
    public abstract float calcularCostoAdicional();
    public abstract String calcularTotalPaquete();
    @Override
    public String toString() {
        return
                "| id=" + id +
                ", destino='" + destino + '\'' +
                ", seguro=" + seguro +
                ", entregaMismoDia=" + entregaMismoDia + "Estado de producto : "+enviado+
                '|';
    }

    @Override
    public boolean equals(Object o) {
        boolean sonIguales=false;
        if(o !=null)
        {
            if(o instanceof Paquete)
            {
                Paquete paquetito=(Paquete)o;
                if(this.id == paquetito.getId())
                {
                    sonIguales=true;
                }
            }
        }
        return sonIguales;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
