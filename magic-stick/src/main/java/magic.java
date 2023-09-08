import java.util.Arrays;
import java.util.Scanner;

public class magic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Đọc số lượng gậy và kích thước hộp
        int n = scanner.nextInt();
        int[] wandLengths = new int[n];
        int[] boxSizes = new int[n];

        // Đọc độ dài của từng chiếc gậy
        for (int i = 0; i < n; i++) {
            wandLengths[i] = scanner.nextInt();
        }

        // Đọc kích thước của từng chiếc hộp
        for (int i = 0; i < n; i++) {
            boxSizes[i] = scanner.nextInt();
        }

        // Sắp xếp mảng gậy và hộp theo thứ tự tăng dần
        Arrays.sort(wandLengths);
        Arrays.sort(boxSizes);

        // Kiểm tra xem mỗi chiếc gậy có thể đặt vào hộp tương ứng hay không
        boolean canFitAll = true;
        for (int i = 0; i < n; i++) {
            if (wandLengths[i] > boxSizes[i]) {
                canFitAll = false;
                break;
            }
        }

        // In kết quả
        if (canFitAll) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
