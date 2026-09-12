import java.util.Scanner;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stackChuoi = new Stack<>();
        // stackChuoi.push("giá trị ") => đưa giá trị vào stack
        // stackChuoi.pop()=> lấy giá trị ra,xóa khỏi stack;
        // stackChuoi.peek()=> lấy giá trị ra,nhưng k xóa khỏi stack
        // stackChuoi.contains("giá trị") => xác định giá trị đó có tồn tại k
        // stackChuoi.size()=> Lấy độ dài của stack

        System.out.println("nhao vao chuoi");
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            stackChuoi.push(s.charAt(i) + "");
        }
        System.out.println("chuoi ban dau la " + s);
        for (int i = 0; i < s.length(); i++) {
            System.out.print(stackChuoi.pop());
        }
        System.out.println("=============");

        // chuyển số thập phân sang nhị phân

        Stack<Integer> stackSoDu = new Stack<>();

        System.out.println("moi ban nhap so ");
        int n = sc.nextInt();
        while (n > 0) {
            int sodu = n % 2;
            stackSoDu.push(sodu);
            n = n / 2;
        }
        System.out.println("so nhi phan la ");
        while (!stackSoDu.isEmpty()) {
            System.out.print(stackSoDu.pop());
        }
    }
}
