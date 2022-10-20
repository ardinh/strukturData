/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

/**
 *
 * @author ardin
 */
public class Latihan1 {

    /**
     * @param args the command line arguments
     */
    
    //Constant Complexity
    public static void displayFirstCube(int[] items) {
        double result = Math.pow(items[0], 3);
        System.out.println(result);
    }
    
    //Linear Complexity
    public static void displayAllCubes(int[] items) {
        for (int i = 0; i < items.length; i++) {
            double result = Math.pow(items[i], 3);
            System.out.println(result);
        }
    }
    
    //Quadratic Complexity
    public static void displayAllProducts(int[] items) {
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items.length; j++) {
                int result = items[i] * items[j];
                System.out.print(items[i]+"*"+items[j] +"=");
                System.out.println(result);
            }
        }
    }
    
    //Space Complexity
    public static void displayFirstCubeSpace(int[] items) {
        double result = Math.pow(items[0], 3);
        System.out.println(result);
    }
    
    public static void main(String[] args) {
        int[] inputs = {1, 2, 3, 4, 5, 6, 7 };
        //Constant Complexity
        displayFirstCube(inputs);
        
        //Linear Complexity
        displayAllCubes(inputs);
        
        //Quadratic Complexity
        displayAllProducts(inputs);
        
        //Space Complexity
        displayFirstCubeSpace(inputs);
        
        
    }
    
}
