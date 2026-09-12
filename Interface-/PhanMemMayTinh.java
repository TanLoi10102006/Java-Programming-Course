public class PhanMemMayTinh implements MayTinhBoTui, SapXep {

    @Override
    public double tinhTong(double a, double b) {
        return a + b;
    }

    @Override
    public double tinhHieu(double a, double b) {
        return a - b;
    }

    @Override
    public double tinhTich(double a, double b) {
        return a * b;
    }

    @Override
    public double tinhThuong(double a, double b) {
        if (b == 0) {
            System.out.println("Không thể chia cho 0");
            return 0;
        }
        return a / b;
    }

    @Override
    public void sapXepTang(int[] arr) {
        // Triển khai thuật toán sắp xếp chèn tăng dần
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    @Override
    public void sapXepGiam(int[] arr) {
        // Triển khai thuật toán sắp xếp chèn giảm dần
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    } 
}