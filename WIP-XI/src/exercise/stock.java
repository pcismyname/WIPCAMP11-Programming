package exercise;

import java.util.Scanner;


public class stock {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("เลือกเมนู");
        int menu = sc.nextInt();
        int amount = 0;
        int item = 3;
        int limit = 10;
        if (menu == 1) {
            if (item < limit) {
                System.out.println("ต้องการที่จะเพิ่ม");
                int add = sc.nextInt();
                amount = amount + add;
                if (item + amount > 10) {
                    System.out.println("ไอเท็มเกินลิมิต");
                } else {
                    item = item + amount;
                    System.out.println("ไอเท็มมั้งหมด"+item);
                }
            } else {
                System.out.println("ไอเท็มเต็มแล้ว");
            }
        } else if (menu == 2) {
            if (item > 0) {
                System.out.println("ต้องการลบ");
                int remove = sc.nextInt();
                amount = amount + remove;
                if (item - remove < 0) {
                    System.out.println("ไอเท็มไม่พอให้ลบ");

                } else {

                    item = item - remove;
                    System.out.println("เหลือไอเท็มอยู่ "+item);
                }

            } else {
                System.out.println("ไอเท็มไม่พอ");
            }

        } else if (menu == 3) {
            System.out.println("มีอยู่"+item);
        } else {
            System.out.println("ไม่มีเมนู");
        }

    }
}
