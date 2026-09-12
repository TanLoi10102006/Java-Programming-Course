package tester;
import codee.ViDu;
public class testVD {
    public static void main(String[] args) {
        ViDu vd = new ViDu(5, 6);
        System.out.println("a = " + vd.geta());
        System.out.println("b = " + vd.getb());

        System.out.println("t============");

        codeb.ViDu vd1= new codeb.ViDu(1,2,3); // k import thì dùng FQCN
        System.out.println(vd1.geta());
       
    }
}