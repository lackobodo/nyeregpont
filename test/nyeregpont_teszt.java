
import nyeregpont.nyeregpont_osztaly;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;


/**
 *
 * @author Lacko
 */
public class nyeregpont_teszt {
    
    nyeregpont_osztaly nyereg = new nyeregpont_osztaly();
    
    @Before
   public void init(){
    nyereg.beolvas(5, 5);
    
    
            }
   
   @Test
    //txt-ben megadott mátrix nyeregpontja 21 tehát a teszt eredménye true
   // mátrix: 
    //1 2 3 4 5
    //6 7 8 9 10
    //11 12 13 14 15
    //16 17 18 19 20
    //21 22 23 24 25
   
   public void nyeregpont_teszt(){
       assertEquals("létezik", true, nyereg.kereses(nyereg.getMatrix()));
   }
   
   @Test
   public void siker_matrix(){
       
       //ezen a mátrixon egyértelműen látszik hogy az 5 a sorának legkisebb elemen
       // és az oszlopának a legnagyobb tagja tehát van nyeregpont
       double[][] elso_matrix =  {{1,0,0,0,0},
                                  {2,0,0,0,0},
                                  {3,0,0,0,0},
                                  {4,0,0,0,0},
                                  {5,6,7,8,9}};
       assertEquals(true, nyereg.kereses(elso_matrix));
   }
   
   @Test
   public void hamis_teszt(){
       
       //ezen a mátrixon egyértelműen látszik hogy nincs olyan elem amelyik a sorának legkisebb eleme
       //lenne és oszlopának legnagyobbika tehát az eredmény false
       double[][] elso_matrix =  {{5,0,1,0,0},
                                  {4,0,2,0,0},
                                  {3,0,3,0,0},
                                  {2,0,4,0,0},
                                  {1,2,3,4,5}};
       
       assertEquals(false, nyereg.kereses(elso_matrix));
       
   }
   
    
    
}
