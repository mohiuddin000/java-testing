package builder;

public class LaptopMain {
    public static void main(String []args)
    {
       // laptop l =new laptop("hp" , 8 , "i5" , "1tb" , "2gb");

       laptop l = new laptopbilderPattern().setGpu("2gb").setLaptopProperty();
        System.out.println(l);
    }
}
