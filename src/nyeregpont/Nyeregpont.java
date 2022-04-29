
package nyeregpont;

import java.util.Arrays;

/**
 *
 * @author Lacko
 */
public class Nyeregpont {


    public static void main(String[] args) {
        
        //mátrix oszlopainak száma
        int i = 5;
        //mátrix sorainak száma
        int j = 5;

        // nyeregpont osztály példányosítása
        nyeregpont_osztaly nyereg = new nyeregpont_osztaly();
        //matrix.txt beolvasása
        nyereg.beolvas(i, j);
        
        //beolvasott mátrix kiíratása ellenőrzésként
         for (double[] row : nyereg.matrix){
        System.out.println(Arrays.toString(row));
   }
         //nyeregpont keresése a kereső függvénnyel

         System.out.println(nyereg.kereses(nyereg.getMatrix()));
         System.out.println("a mátrix nyeregpontja: "+nyereg.getNyeregpont());

    }
    
}
