/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xuong;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Xuan Dat
 */
public class Xuong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hello");
        Scanner sc = new Scanner(System.in);
        System.out.println("+-------- Thong tin Ti Vi cua hang -------+");
        System.out.println("Moi ban nhap so luong tivi la: ");
        int tiVi = Integer.parseInt(sc.nextLine());
        int[] arrtiVi = new int[tiVi];
        for (int i = 0; i < arrtiVi.length; i++) {
            System.out.println("Kich co cua tivi " + (i + 1) + " la: ");
            arrtiVi[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.println("+------  Xuat thong tin Ti Vi ------ +");
        double dem = 0, tong = 0;
        for (int i = 0; i < arrtiVi.length; i++) {
            dem++;
            tong += arrtiVi[i];
        }
        if (dem > 0) {
            System.out.println("Kich co trung binh cua tivi la: " + (tong / dem));
        }
        int max = 0, viTri = 0;
        for (int i = 0; i < arrtiVi.length; i++) {
            if (arrtiVi[i] >= max) {
                max = arrtiVi[i];
                viTri += i;
            }
        }
        int min = arrtiVi[0];
        int min1 = arrtiVi[0];

        for (int i = 0; i < arrtiVi.length; i++) {
            if (arrtiVi[i] < min) {
                min = arrtiVi[i];
            }
            min1 = Math.min(min, arrtiVi[i]);
        }
        System.out.println("min " + min);
        System.out.println("min " + min1);
        System.out.println("Vi tri lon nhat la" + (viTri + 1));
        int dem1 = 0;
        for (int i = 0; i < arrtiVi.length; i++) {
            if (arrtiVi[i] % 2 == 0) {
                dem1++;
            }
        }
        System.out.println("So luong Ti vi co kich thuoc la so chan la:" + dem1);

        System.out.println("Mang kich co Ti Vi theo thu tu tang dan");
        Arrays.sort(arrtiVi);
        for (double d : arrtiVi) {
            System.out.println(d);
        }
    }
    
}
