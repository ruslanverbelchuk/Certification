package test;

public class Bank {
    public static void main1(String arg[]){
            
    }
    //public static void main(String... arg){
    public static void main(String arg[]){
        System.out.println("------------------------------");
        double num =0.2;
        if (num == 0.2f)
            System.out.println("true");
        else
            System.out.println("false");
        
        System.out.println("------------------------------");
        System.out.println(4 & 4);
        
        System.out.println("------------------------------");
        A1:for(int i= 0; i<2; ++i)
        A2:for(int j=-1; j<2; ++j)    
            
        A3:for(int k=-1; k<2; ++k){
            System.out.println(" K "+k+ "   i="+i+" j="+j);
            if((i++ - k++)==2)
                break;
        }
        
        System.out.println("------------------------------");
        outer:  for(int x= 0; x<2; x++)
        middle: for(int y= 0; y<2; y++)
        inner:  for(int z= 0; z<2; z++){
            if(y == x){
                System.out.println("x="+x+" y="+y+" z="+z);
                break middle;
            }
        }
        
        System.out.println("------------------------------");
        int []a= {1,2,3,4,5,6};
        int i = a.length - 1;
        
        while (i >=0){
            System.out.println(a[i]); i--;
        }
        
        System.out.println("------------------------------");
        /*
        Pattern Class nethods: quote
        StringBuilder Class; StringBuffer Class
        PrintWrite Class; PrintStream Class
        
        */
    }

}