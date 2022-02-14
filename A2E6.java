import java.util.Scanner;
public class A2E6
{
    static Scanner entrada = new Scanner(System.in);
    public static void main(String args[])
    {
        int promedioEdadMayor = 0;
        int promedioEdadMenor = 0;
        int edadMayorAux = 0;
        int edadMenorAux = 0;
        int i = 1;
        System.out.println("Bienvenido al sistema de promedio de edades comprendidas entre: ");
        System.out.println("Menores de 25 años o mayores o iguales a 25 años");
        System.out.println("Ingrese el numero total del grupo de personas que desea sacar el promedio de edades:");
        int n = entrada.nextInt();
        while(i <= n)
        {
            System.out.println("Ingrese la edad de la persona #"+i);
            int edadt = entrada.nextInt();
            if(edadt < 25)
            {
                promedioEdadMenor = promedioEdadMenor+edadt;
                edadMenorAux = edadMenorAux+1;
            }else{
                promedioEdadMayor = promedioEdadMayor+edadt;
                edadMayorAux = edadMayorAux+1;
            }
            i++;
        }
        int promedioMayorReal = (promedioEdadMayor/edadMayorAux);
        int promedioMenorReal = (promedioEdadMenor/edadMenorAux);
        System.out.println("El promedio de las edades menores de 25 es: "+promedioMenorReal);
        System.out.println("");
        System.out.println("El promedio de las edades mayores o iguales de 25 es: "+promedioMayorReal);
    }
}