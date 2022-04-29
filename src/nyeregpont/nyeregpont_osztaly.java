package nyeregpont;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Lacko
 */
public class nyeregpont_osztaly {
    
    double[][] matrix;
    double nyeregpont;

    public nyeregpont_osztaly() {
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public double getNyeregpont() {
        return nyeregpont;
    }
    
    

public void beolvas(int x, int y){
   try{
    double[][] matrix = new double[x][y];
   BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lacko\\Documents\\NetBeansProjects\\nyeregpont\\src\\matrix.txt"));

   for (int i = 0; i < x; i++) {
        String[] st = br.readLine().trim().split(" ");
        for (int j = 0;j < y; j++) {
            matrix[i][j] = Double.parseDouble(st[j]);
        }
   }
   this.matrix = matrix;
   br.close();
    } catch(IOException | NumberFormatException e){
            System.out.println(e);
    }
}

public boolean kereses(double[][] matrix){
    //van-e találat változó;
    boolean talalat = false;
    int i,j,k;
    
    try{
    if(matrix!=null){
      boolean van_nyeregpont = false;
    //minden sor legkisebb számát tároljuk a sorMIn-ben valamint annak indexét  
    for (i = 0; i < matrix.length; i++ ){
        double sorMin = matrix[i][0];
        int oszlopIndex = 0;
        
//Legkisebb elem megkersése soronként
    for (j = 1; j < matrix [ 0 ] .length; j++ ){
        if ( matrix [ i ][ j ] < sorMin ){
            sorMin = matrix [ i ][ j ];
            oszlopIndex = j;
}
}
//a sor legkisebb elemének ellenőrzése hogy a legnagyobb-e a sorában.
    for (k = 0; k < matrix.length; k++ ){
        if (sorMin < matrix [ k ][ oszlopIndex ]){
            van_nyeregpont = false;
            break;
}
}
    //ha sikerül végigmenni a mátrixon úgy hogy nincs a sorminimumnál kisebb elem akkor találat van
    if(k==matrix.length){
        van_nyeregpont = true;
        talalat = true;
        this.nyeregpont = sorMin;
    }else{
        talalat = false;
        this.nyeregpont = -1;
    }

}
    
}else{
        System.out.println("Nincs beolvasott mátrix");
    }
}catch(Exception e){
            System.out.println(e);
}
return talalat;    
}    
}
