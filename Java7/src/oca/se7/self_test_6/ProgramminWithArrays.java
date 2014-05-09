

package oca.se7.self_test_6;

/**
 *
 * @author rverbelchuk
 */
public class ProgramminWithArrays {
    public static void main(String arg[]){
        /*
        What lines will compile without errors? (Choose all that apply.)
        A.    Object obj = new Object();
        B.     Object[] obj = new Object();
        C.    Object obj[] = new Object();
        D.    Object[] obj = new Object[];
        E.    Object[] obj = new Object [3]();
        F.    Object[] obj = new Object [7];
        G.    Object obj[] = new Object[];
        H.    Object obj [] = new Object [3]();
        I.      Object obj[] = new Object[7];
        J.     Object [8] obj = new Object [];
        K.    Object [3] obj = new Object [3]();
        L.     Object [7] obj = new Object [7];
        M.    Object obj [] = new {new Object (), new Object ()};
        N.     Object obj [] = {new Object (), new Object ()};
        O.    Object obj [] = {new Object [1], new Object [2]};
        */
        
        // 2.
        String[] numbers ={"1","2","3"};
       // System.out.println(numbers[3]+" "+numbers[2]+" "+numbers[1]+" ");
        
        // 7.
        int[][] sq= new int[3][3];
        for(int i=0; i<3; i++){ sq[i][i]=5;  }
        
        int sum =0;
        for(int i=0; i<3; i++)
            for(int j=0; j<3; j++)
                sum+=sq[i][j];
        
        System.out.println(" sum= " + sum);
        
        
    }
}
