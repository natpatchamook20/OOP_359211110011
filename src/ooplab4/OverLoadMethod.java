package ooplab4;
//Overlosding method

public class OverLoadMethod {
    private static int number =100;
    public static void Summation(int x,int y){

        System.out.println(x+y);
        int t = number+x+y;

    }
    public static void  Summation(){
        System.out.println("Hello"+number);

    }
    public static void Summation(int x,int y,int z){
        System.out.println(x+y+z+number);

    }
    public static void main(String[] args){
        Summation();
        Summation(x:10,y:10);
        Summation(x:5,y:5,z:5);
    }



}
