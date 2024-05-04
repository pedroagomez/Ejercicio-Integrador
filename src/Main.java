import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        menu();

    }
    public static void menu()
    {
        Empresa empresa=new Empresa();
        empresa.agregarPaquetes();
        Scanner entrada=new Scanner(System.in);
        int opcion;
        do {
            String cadena= """
                Bienvenido al menu
                \t[1]Ver todos los paquetes 
                \t[2]Ver paquetes tierra
                \t[3]Ver paquetes aire
                \t[4]Cantidad total de paquetes
                \t[5]Buscar y enviar paquete
                \t[6]Productos no enviados
                \t[0]Salir
                
                """;
            System.out.println(cadena);
             opcion=entrada.nextInt();
             switch (opcion)
             {
                 case 1:
                 {
                     System.out.println(empresa.mostrarLista());
                     break;
                 }
                 case 2:
                 {
                     System.out.println(empresa.mostrarPaqueteTierra());
                     break;
                 }
                 case 3:
                 {
                     System.out.println(empresa.mostrarPaqueteAire());
                     break;
                 }
                 case 4:
                 {
                     System.out.println("La cantidad total de paquetes es : "+empresa.cantidadTotalPaquetes());
                     break;
                 }
                 case 5:
                 {
                     ingresarDato(empresa,entrada);
                     break;
                 }
                 case 6:
                 {
                     System.out.println(empresa.mostrarProductosNoEnviados());
                     break;
                 }
                 case 0:
                 {
                     break;
                 }
                 default:
                     System.out.println("Opcion invalida");
             }

        }while(opcion!=0);


    }

    public static void ingresarDato(Empresa empresa,Scanner entrada)
    {
        empresa.mostrarLista();
        System.out.println("Ingrese el Id del producto que desea buscar ");
        int id=entrada.nextInt();
       boolean fueEnviado= empresa.buscarYenviar(id);
        if(fueEnviado==true)
        {
            System.out.println("Prodcuto enviado");
        }
        else
        {
            System.out.println("El producto ya habia sido enviado");
        }

    }
}
