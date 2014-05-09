package test;

public class Test2 {
    public static void main(String arg[]){
        System.out.println("---------------- 1 -------------------");
        Test2.main1(new String[] {"a", "b", "c"});
        System.out.println("---------------- 2 -------------------");
        Test2.main2("a", "b", "c");
        System.out.println("---------------- 3 -------------------");
        Test2.main2(new String[] {"a", "b", "c"});
        System.out.println("---------------- 4 -------------------");
        Test2.main3(2);
        System.out.println("---------------- 5 -------------------");
        Test2.main3(2,"a", "b", "c");
        /*ca*/ 
   }
    
    public static void main2(String... args){
        System.out.println(args.getClass() == String[].class);
        for (String s : args) {
            System.out.println(s);
        }
    }
    
    public static void main1(String args[]){
        System.out.println(args.getClass() == String[].class);
        for (String s : args) {System.out.println(s);}
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
    
    public static void main3(int i,String... args){
        System.out.println(args.getClass() == String[].class);
        
        System.out.println(i);
        
        for (String s : args) {
            System.out.println(s);
        }
    }
}
