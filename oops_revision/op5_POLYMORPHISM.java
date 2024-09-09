package oops_revision;
import oops_revision.*;
public class op5_POLYMORPHISM {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        // System.out.println(calc.sum(2, 3));
        // System.out.println(calc.sum(2, 3, 4));
        // System.out.println(calc.sum(2.0f, 3.0f));
        System.out.println(calc.sum(2,3));
        

        // // Deer d = new Deer();
        // // d.eats();
        // Reptyle rr = new Reptyle();
        // rr.hashCode();

    }
}
// Runtime polymorphism/dynamic polymerism -->method overridding. 
// class Animal{
//     void eats(){
//         System.out.println("eats anything");
//     }
// }
// class Deer extends Animal{
//     void eats(){
//         System.out.println("eats grass");
//     }
// }
// compile time polymorphism/static polymorphism --> method overloading 
class Calculator{
    int sum(int a , int b){
        return a+b;
    }
    // float sum(float a, float b){
    //     return a+b;
    // }
    // int sum(int a, int b, int c){
    //     return a+b;
    // }

  
  
}