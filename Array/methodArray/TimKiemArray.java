import java.util.Arrays;

public class TimKiemArray {

    public static void main(String[] args) {
        int[] a = new int[] {1, 8, 2, 6, 4, 3, 7, 9};
        int[] b = new int[15];

        // Hàm Arrays.sort(): xắp sếp thứ tự tăng dần

        Arrays.sort(a); // sắp xếp mảng a
        System.out.println("Thuat toan sau khi sap xep roi  " + Arrays.toString(a));



        // Hàm tìm kiếm Arrays.binarySearch();
        System.out.println("vi tri cua 6 trong mang a la " + Arrays.binarySearch(a, 6));


        // Hàm Arrays.fill(array, fromIndex, toIndex, value): hàm điền giá trị
        Arrays.fill(b, 10);
        System.out.println("gia tri sau khi duoc dien la " + Arrays.toString(b));

        // xắp sếp đảo ngược mảng
        int[] c = daoNguocMang(a);
        System.out.println("mang dao nguoc la " + Arrays.toString(c));
        a = TimKiemArray.daoNguocMang(a);
        System.out.println("()" + Arrays.toString(a));

    }

    public static int[] daoNguocMang(int[] a) {
        int[] rs = new int[a.length];
        int index = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            rs[index] = a[i];
            index++;
        }
        return rs;
    }
}
