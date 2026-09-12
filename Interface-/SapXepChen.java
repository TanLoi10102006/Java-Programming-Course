public class SapXepChen implements SapXep {

    @Override
    // Triển khai thuật toán sắp xếp chèn
    public void sapXepTang(int[] arr) {
        for (int i = 1; i < arr.length; i++) { // Bắt đầu từ phần tử thứ hai
            int key = arr[i]; // Lưu giá trị của phần tử hiện tại
            int j = i - 1; // Khởi tạo j là chỉ số của phần tử trước đó
            while (j >= 0 && arr[j] > key) { // Di chuyển phần tử lớn hơn key sang phải
                arr[j + 1] = arr[j];   // Dịch phần tử sang phải
                j--; // Di chuyển j sang trái
            }
            arr[j + 1] = key; // Chèn key vào vị trí đúng
        }
    }

    @Override
    public void sapXepGiam(int[] arr) {
        for (int i = 1; i < arr.length; i++) { // Bắt đầu từ phần tử thứ hai
            int key = arr[i]; // Lưu giá trị của phần tử hiện tại
            int j = i - 1; // Khởi tạo j là chỉ số của phần tử trước đó
            while (j >= 0 && arr[j] < key) { // Di chuyển phần tử nhỏ hơn key sang phải
                arr[j + 1] = arr[j];   // Dịch phần tử sang phải
                j--; // Di chuyển j sang trái
            }
            arr[j + 1] = key; // Chèn key vào vị trí đúng
        }
    }
}