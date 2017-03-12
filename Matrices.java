public class Matrices {
   public static void main(String[] args){
       /*apartado a): se crean dos matrices cuadrada de tres elementos, para crearla,
       se utiliza un array de dos dimensiones; la primera dimension del array se refiere
       al numero de filas que tiene la matriz (en este caso 3), la segunda dimension del
       array se refiere al numero de elementos que tiene cada fila. (columnas)
       (tambien tiene 3 en este caso)*/
       
       //apartado b): a continuacion se muestran los errores.
       int [][] matriz1 = {{1,2,3},{4,5,6},{7,8,9}};
       int [][] matriz2 = {{3,2,7},{2,8,6},{3,6,3}};
       int [][] resultado = {{0,0,0},{0,0,0},{0,0,0}};
       
       int i=0; //error 1: el identificador estaba junto a la variable. (no encontraba otro error)
       int j=0;
       int k=0;
       int valor=0;
       for (i=0;i<3;i++){
           for (j=0;j<3;j++){ //error 2: se sustituye la i por j.
               for (k=0;k<3;k++){ //error 3: se sustituye la i por k.
                   valor=matriz1[i][k]*matriz2[k][j];
                   resultado[i][j]+=valor; //error 4: se sustituye la asignacion por un incremento
                   }
            }
       }
       
       //apartado c: presentar por pantalla la matriz resultado
       
       System.out.println("\nel resultado de la matriz es:");
       for(i=0;i<3;i++){
           j=0;
           System.out.printf("\n%3d %3d %3d\n", resultado[i][j], resultado[i][j+1], resultado[i][j+2]);
       }
       System.out.println("\n=)\n");
   }
}
