public class methods {
    public static int cal(int a,int b){
        return a+b;
    }
    public static int cal(int a){
        int b;
        b=2;
        return cal(a,b)*2;  //calls other methods

    }
    //method overloading
    public static int cal(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args){
        int a,b,c;
        c=3;
        a=1;
        b=2;
        System.out.println(cal(a));
        System.out.println(cal(a,b,c));
        System.out.println(cal(a,b));
    }

}
