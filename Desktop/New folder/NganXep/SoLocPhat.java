package NganXep;

import java.util.*;

public class SoLocPhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soTest = Integer.parseInt(scanner.nextLine());

        while (soTest --> 0) {
            int size =  scanner.nextInt();
            soLocPhat(size);
        }

    }

    private static void soLocPhat(int size) {
        ArrayList<Long> arrResult = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        queue.add("6");
        queue.add("8");

        while (true){
            String result = queue.poll();
            if (result.length() > size) {
                break;
            }
            queue.add(result + "6");
            queue.add(result + "8");
            arrResult.add(Long.parseLong(result));
        }
        Collections.sort(arrResult);
        System.out.println(arrResult.size());
        for (int i = arrResult.size()-1; i >= 0; i--) {
            System.out.print(arrResult.get(i) + " ");
        }
        System.out.println();
    }
}
