public class test{
    public static void main (String[]args){
        MyMath mm = new MyMath();
        System .out.println("Min of 3 and 5: " + mm.timMin(3, 5));
        System .out.println("Min of 3.5 and 2.5: " + mm.timMin(3.5, 2.5));
        System .out.println("Sum of 3.5 and 2.5: " + mm.tinhTong(3.5, 2.5));
        double [] arr = {1.0, 2.0, 3.0};
        System .out.println("Sum of array: " + mm.tinhTong(arr));

    } 
}