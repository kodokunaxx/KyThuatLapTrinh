package LapTrinhCoBan;

import java.util.Scanner;

public class UclnNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soLuongTest = scanner.nextInt();

        while (soLuongTest-- > 0) {
            long number = scanner.nextLong();
            if (checkNguyenTo(number)) {
                System.out.println(number);
            } else {
                long maxNT = 0;
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        if (checkNguyenTo(number / i) == true) {
                            maxNT = number / i;
                        } else {
                            if (checkNguyenTo(i)) {
                                maxNT = i;
                            }
                        }
                    }
                }
                System.out.println(maxNT);
            }
        }
    }

        public static boolean checkNguyenTo ( long x){
            for (long i = 2; i <= (long) Math.sqrt(x); i++) {
                if (x % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
