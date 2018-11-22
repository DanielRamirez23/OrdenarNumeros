
package ordenarnumeros;

public class OrdenarNumeros {

    
    public static void main(String[] args) {
        
    

     int n1 =(int) (Math.random() * 100);
     int n2 =(int) (Math.random() * 100);
     int n3 =(int) (Math.random() * 100);

    System.out.println(n1);
    System.out.println(n2);
    System.out.println(n3);
    System.out.println("");
    
if  (n1<n2 &&  n2<n3){
    System.out.println(n1);
    System.out.println(n2);
    System.out.println(n3);}
if  (n1<n3 && n3<n2){
    System.out.println(n1);
    System.out.println(n3);
    System.out.println(n2);}


if (n2<n1 && n1<n3){
    System.out.println(n2);
    System.out.println(n1);
    System.out.println(n3);}
if  (n2<n3 && n3<n1){
    System.out.println(n2);
    System.out.println(n3);
    System.out.println(n1);}
   
if (n3<n1 && n1<n2){    
    System.out.println(n3);
    System.out.println(n1);
    System.out.println(n2); }
if  (n3<n2 && n2<n1){
    System.out.println(n3);
    System.out.println(n2);
    System.out.println(n1);}
}    
    }
    
    
