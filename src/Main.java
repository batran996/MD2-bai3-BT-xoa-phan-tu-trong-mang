import java.util.Scanner;

public class Main {
    static int searchElement(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
    //////////////////////////////////////////////////
    static int delete(int[] arr, int n, int key) {
        int pos = searchElement(arr, key);
        if (pos == -1) {
            System.out.println("Khong tim thay phan tu can xoa");
        }
        // Xoa phan tu
        for (int i = pos; i < n; i++) {
            arr[i] = arr[i + 1];
        }
        return n - 1;

    }
/////////////////////////////////////////////////////
    public static void main(String[] args) {
        int size = 20; // Suc chua cua mang
        int[] arr = new int[size];
        arr[0] = 1;
        arr[1] = -1;
        arr[2] = 6;
        arr[3] = 5;
        arr[4] = 3;
        Scanner scanner = new Scanner(System.in);
        int n = 6; // So luong phan tu trong mang hien tai

        System.out.print("Truoc khi xoa: ");
        for (int i = 0; i < n; i++)
            System.out.printf(arr[i] + " ");

        System.out.println("nhap vao phan tu can xoa");
        int x = scanner.nextInt();
        n = delete(arr, n, x);

        System.out.print("\nSau khi xoa : ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}