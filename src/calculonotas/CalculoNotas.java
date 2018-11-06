package calculonotas;
import java.util.Scanner;

public class CalculoNotas {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        principal();
                
    }
  
    public static void principal(){
    
    int i;
    float total = 0;
    float promGeneral = 0;
    float promGeneralRed = 0;
    float[] notas = new float[20];
    float[] notasRed = new float[20];

    
    for (i=0;i<notas.length;i++){
        
        notas[i] = (float) ((Math.random())*6.0+1.0);
        notasRed[i] = (float) (Math.round(notas[i]*10.0)/10.0); //redondeado
                 
        System.out.println("Estudiante "+(i+1)+" : "+notasRed[i]);
        
        total += notasRed[i];
        promGeneral = (total/notasRed.length);
        promGeneralRed = (float) (Math.round(promGeneral*10.0)/10.0); //redondeado

    }
    
    System.out.println("El promedio del curso es : "+promGeneralRed);
    
    //MAXIMO
        float maxx = notasRed[0];

        for (i = 0; i < notasRed.length; i++) {
            if (maxx < notasRed[i]) {
                maxx = notasRed[i];
            }
        }
        System.out.println("La nota más alta es: "+(Math.round(maxx*10.0)/10.0));
    
    //MINIMO
        float minn = notasRed[0];

        for (i = 0; i < notasRed.length; i++) {
            if (minn > notasRed[i]) {
                minn = notasRed[i];
            }
        }
        System.out.println("La nota más baja es: "+(Math.round(minn*10.0)/10.0));
        
    //SOBRE LA MEDIA
 
        int j=0 ;
        for (i = 0; i < notasRed.length; i++) {
                           
            if (notasRed[i] > promGeneralRed) {
                j++;
            }
        }
        System.out.println("El número de notas sobre la media es: "+j);

    // BAJO LA MEDIA
        int k = 0;
        for (i = 0; i < notasRed.length; i++) {
                           
            if (notasRed[i] < promGeneralRed) {
                k++;
            }
        }
        System.out.println("El número de notas sobre la media es: "+k);
          
    }
    }