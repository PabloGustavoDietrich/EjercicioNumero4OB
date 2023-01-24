
package ejercicionumero4ob;

public class EjercicioNumero4OB {

    public static void main(String[] args) {
/*Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
*/
int numero=2;

if(numero>0){
    System.out.println("numero es positivo");
}else if(numero==0){
    System.out.println("numero es igual a 0");
}else{
    System.out.println("numero es negativo");
}

/*
Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
Incrementar el valor de la variable en uno cada vez que se ejecute.
Mostrarlo por pantalla cada vez que se ejecute.
*/
int numero2=0;

while(numero2<3){
    System.out.println(numero2);
    numero2++;
}

/*
Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
*/
int numero3=4;

do{
    System.out.println(numero3);
    numero3++;
}while(numero3<3);

/*
Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable 
sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
*/
 for (int i = 0; i <= 3; i++) {
System.out.println(i);
 }

/*
Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable 
 estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.*/
 String estacion="primavera";
    
        switch (estacion) {
                case ("verano"):
                System.out.println("estamos en verano");
                break;
                case ("otoño"):
                System.out.println("estamos en otoño");
                break;
                case ("invierno"):
                System.out.println("estamos en invierno");
                break;
                case ("primavera"):
                System.out.println("estamos en primavera");
                break;
            default:
               System.out.println("no es una estacion correcta");;
        }
    
    }
    
}
