import Paquete.Paquete;
import Paquete.PaqueteAire;
import Paquete.PaqueteTierra;

import java.util.LinkedList;

public class Empresa {
    private LinkedList<Paquete>listaPaquete;

    public Empresa()
    {
        this.listaPaquete=new LinkedList<>();
    }


    public void agregarPaquetes()
    {
        listaPaquete.add(new PaqueteAire(30,"Mar del Plata","aerolineas","express"));
        listaPaquete.add(new PaqueteAire(10,"Bariloche","aerolineas","express"));
        listaPaquete.add(new PaqueteAire(100,"Formosa","aerolineas","express"));
        listaPaquete.add(new PaqueteAire(120,"Buenos aires","aerolineas","normal"));

        listaPaquete.add(new PaqueteTierra(true,1300,"Usuahia",true,true,2500,"Camion"));
        listaPaquete.add(new PaqueteTierra(130,"Barcelona",4000,"auto"));

    }

    public String mostrarLista()
    {
        StringBuilder cadena= new StringBuilder();
        for(Paquete aux : listaPaquete)
        {
            cadena.append(aux.toString()).append("\n");
        }
        return cadena.toString();
    }

    public String mostrarPaqueteTierra()
    {
        StringBuilder cadena= new StringBuilder();
        for(Paquete aux : listaPaquete)
        {
            if(aux instanceof PaqueteTierra)
            {
                cadena.append(aux.toString()).append("\n");
            }

        }
        return cadena.toString();
    }

    public String mostrarPaqueteAire()
    {
        StringBuilder cadena= new StringBuilder();
        for(Paquete aux : listaPaquete)
        {
            if(aux instanceof PaqueteAire)
            {
                cadena.append(aux.toString()).append("\n");
            }

        }
        return cadena.toString();
    }

    public int cantidadTotalPaquetes()
    {
        return listaPaquete.size();
    }

    public String enviarPaquetesEnDeposito()
    {
        for(Paquete paquetito:listaPaquete)
        {
            if(paquetito.isEnviado()==false)
            {
                paquetito.setEnviado(true);
            }
        }
        return "Paquetes enviados";
    }

    public boolean buscarYenviar(int id)
    {
        boolean fueEnviado=false;
        for(Paquete paquete : listaPaquete)
        {
            if(paquete.getId() == id && paquete.isEnviado()== false)
            {
                paquete.setEnviado(true);
                fueEnviado=true;
            }
        }
        return fueEnviado;
    }

    public String mostrarProductosNoEnviados()
    {
        StringBuilder cadena= new StringBuilder();
        for(Paquete paquetes : listaPaquete)
        {
            if(paquetes.isEnviado()==false)
            {
                cadena.append(paquetes.toString()).append("\n");
            }
        }
        return cadena.toString();
    }


}
