/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MultidimensionalArray;

/**
 *
 * @eviota HP
 */
public class MultidimensionalArray {
     public static void main(String[] args) {
         
         //2D Array of Program and Year
         
         String[][] programAndyear ={
             {"BSIT", "First year"},
             {"BSBA", "Second year"},   
             {"BSED", "Third year"}
         };
         //Process using For Loops
         for(int i = 0; i < programAndyear.length; i++) {
             for(int j = 0; j < programAndyear[i].length; j++ ) {
                 System.out.print(programAndyear[i][j] + " ");
             }
             //Output
             System.out.println();
         }
     }
}