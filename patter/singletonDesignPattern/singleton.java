package singletonDesignPattern;

public class singleton {
    public static void main(String[]args){
    A1 onj1=A1.getobject();
    A1 obj=A1.getobject();
    
    
    }
    }
    
    class A1{
    
    //static A1 obj=new A1(); //early instance creation
    static A1 obj;
    private A1(){
    System.out.println("hellow");
    }
    public static A1 getobject(){
    //obj =new A1();
    if(obj==null){
    obj=new A1();
    }
    return obj;
    }
    
    }