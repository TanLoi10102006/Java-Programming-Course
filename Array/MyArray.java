import java.util.Arrays;

public class MyArray {
    public static void main(String[] agrs) {
        // kiểu nguyên thủy
        int[] mang1 = {1, 2, 3, 4};

        // Coppy mảng
        int[] mang1_a = mang1;
        mang1_a[0] = 100;
        for (int i = 0; i < mang1_a.length; i++) {
            System.out.println(mang1_a[i]);
        }
        for (int i = 0; i < mang1.length; i++) {
            System.out.println(mang1[i]);
        }
        // arrays.toString => dùng để in mảng
        System.out.print(Arrays.toString(mang1));
        System.out.println(Arrays.toString(mang1_a));

        // dùng clone;
        System.out.println("Dung clone");
        int[] mang1_b = mang1.clone();
        mang1_b[0] = 50;
        System.out.println(Arrays.toString(mang1_b));
        System.out.println(Arrays.toString(mang1)); // mang1 vị trí 0 không đổi
        // dùng hàm System.arraycopy
        System.out.println("dung arraycopy");
        int[] mang1_c = new int[mang1.length];
        System.arraycopy(mang1, 0, mang1_c, 0, mang1.length);
        mang1_c[0] = 90;
        System.out.println(Arrays.toString(mang1_c));
        System.out.println(Arrays.toString(mang1)); // mang1 vị trí 0 không đổi

    }
}
