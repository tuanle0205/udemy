import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your value");
        String input = scanner.nextLine();
        int n;
        int k;
        int i;
        List<String> inputList = new ArrayList<>();
        for (String a : input.split(" ")) {
            inputList.add(a);
        }
        n = Integer.parseInt(inputList.get(0));
        k = Integer.parseInt(inputList.get(1));
        i = Integer.parseInt(inputList.get(2));
        String content = "";
        List<String> strings = inDayNhiPhanDoDai_n(n, i);
        for (int j = 0; j < i; j++) {
            content += "0";
        }
        List<String> stringsa = new ArrayList<>();
        for (String a : strings) {
            if (!a.contains(content)) {
                stringsa.add(a);
            }
        }
        String result = "";
        if (k > stringsa.size()) {
            System.out.println("-1");
        } else {
            for (int j = 0; j < stringsa.get(k - 1).length(); j++) {
                result += stringsa.get(k - 1).charAt(j) + " ";
            }
            System.out.println(result);
        }

    }

    public static List<String> inDayNhiPhanDoDai_n(int n, int k) {
        int[] array = new int[n];
        int tich;
        List<String> integerList = new ArrayList<>();
        do {
            tich = 1;
            for (int j = 0; j < n; j++) {
                tich *= array[j];
            }
            String result = "";
            for (int i = 0; i < array.length; i++) {
                result += array[i];
            }
            integerList.add(result);

            int i = n - 1;
            do {
                if (array[i] == 0) {
                    array[i] = 1;
                    for (int j = n - 1; j > i; j--) {
                        array[j] = 0;
                    }
                    break;
                } else
                    i--;
            } while (i >= 0);
        } while (tich != 1);
        return integerList;
    }
}
