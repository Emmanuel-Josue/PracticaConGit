
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user01
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner A=new Scanner(System.in);
       String B,C;//B = variable en donde almacenaremos el nombre del producto a mover
                  //C = Nombre de almacen hacia donde se movera el producto
                  
       double Galletas,Refresco,G,DULG,TIEG,DULR,TIER;//G=Cantidad de GALLETAS a mover  
      //DULG=inventario galletas sub almacen1 //TIEG=inventario galletas Sub almacen 2 
      //DULR=Inventario refresco sub almacen1 //TIER=Inventario refresco sub almacen 2
      
      
      //Empieza cuando haya que reabastecer 
      do{//comienzo del primer do (1)
          
       //Cantidad de producto en sub almacen inicialmente
       DULG=0;
       TIEG=0;
       DULR=0;
       TIER=0;
       
       System.out.println("Bienvenido");
       System.out.println("Ingrese la cantidad de su inventario\nGalletas:");
       Galletas=A.nextDouble();//Guardaremos la cantidad de inventario que exista al principio 
       System.out.println("Refresco:");
       Refresco=A.nextDouble();//Guardaremos la cantidad de inventario que exista al principio 
       
       do{//comienzo del sefundo do (2)
               
       System.out.println("Que producto desea mover de ubicacion: \n - Galletas \n - Refresco ");
       //B=A.nextLine();//AL USAR ESTA ENTRADA DE CODIGO EL PROGRAMA SE LO SALTAVA 
       B=A.next();//Pedimos que ingrese el nombredel producto a mover 
       
       
       switch (B){
           //Cuando se usan datos de tipo caracter, deben ir entre comillas dobles 
           case "Galletas":
               System.out.println("Digite el numero de pz que desea mover:");
               G=A.nextDouble();
               //Se restara G al inventario de galletas 
               
               //Este bucle es para cuando la cantidad a mover sea mayor a la cantidad que hay disponible en inventario
               while(G>Galletas){
                    System.out.println("Su inventario no es suficiente \n \n \n solo cuenta con: "+Galletas);
                    System.out.println("Por favor corrija la cantidad a mover: ");
                    G=A.nextDouble();
                     }
               Galletas=Galletas-G;//Se restara G al inventario de galletas 
               
               System.out.println("A que sub almacen desea moverlo: \n \n-DULCERIA \n-TIENDA \n");
               C=A.next();
               switch(C){
                   case"DULCERIA":
                       //Se suma la cantidad a mover al sub almacen 1 
                       DULG=DULG+G;
                       System.out.println("Usted ha movido "+G+" PZ de galletas ha DULCERIA y ahora cuenta con:"+DULG+" PZ de galletas");
                       break;
                   case"TIENDA":
                       //Se suma la cantidad a mover al sub almacen 2 
                       TIEG=TIEG+G;
                       System.out.println("Usted ha movido "+G+" cantidad de galletas a TIENDA y ahora cuenta con "+TIEG+" de galletas ");
                       break;
               
               }
                break; 
           case "Refresco":
               System.out.println("Digite el numero de pz de Refresco que desea mover:");
               G=A.nextDouble();//cantidad a mover 
               //Si G es mayor a la cantidad que se tiene en el inventario refresco
               //se ejecutara el siguiente bucle
               
               
               
               while(G>Refresco){
               
               System.out.println("Su inventario no es suficiente \n \n \n solo cuenta con: "+Refresco);
               System.out.println("Por favor corrija la cantidad a mover ");
               G=A.nextDouble();
              }
               //Se resta la cantidad a mover a el invenrario Refrescos
               Refresco=Refresco-G;
               
              
               System.out.println("A que sub almacen desa moverlo: \n \n-DULCERIA \n-TIENDA \n");
               //Utilizare la misma variable C que en el caso anterior, estar atento si perjudica
               //tambien la misma variable G
               C=A.next();
               switch(C){
                   case"DULCERIA":
                       DULR=DULR+G;
                       System.out.println("Usted ha movido "+G+" PZ de refresco a DULCERIA y ahora cuenta con "+DULR+" en DULCERIA");
                       break;
                    case"TIENDA":
                        TIER=TIER+G;
                        System.out.println("Usted ha movido "+G+" PZ de refresco a TIENDA y ahora cuenta con "+TIER+" en TIENDA");
                        break;
                       }
               
                
                  }//termina el primer switch
       System.out.println("INVENTARIO ACTUAL DE GALLETAS: "+Galletas+" \n INVENTARIO ACTUAL DE TEFRESCO "+Refresco+"\n \n \n");
       
       }while((Galletas+Refresco)>0);//fin del segundo do(2), en el momento que sean 0 o menores, el bucle terminara
       
       
       //En este punto el procedimiento volvera a comenzar 
            System.out.println("oh!! no su inventario de ambos productos se ha agotado \n favor de reabastecer almacen general \n \n \n"
                    + "");
       
       
       
        
        
        
        
        
        
        
        
     //cuando el inventario de ambas cosas en alamcen general sean iguales 
     //o menores a cero el bucle se repetira 
    }while((Galletas+Refresco)<=0);//Fin del primer do (1)
      
    } //termina la clase main
        }//termina la public class mai
