/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.phuc.mathutil.core;

/**
 *
 * @author Minh Phuc
 */
// Class cung cấp các tiện ích/ 1 loạt các hàm toán học 
// giúp cho các class khác sử dụng,.., ví dụ app Calculator cần rất nhiều hàm toán học
// Cái gì mà là tiện ích dùng chung => nó nên được Design là STATIC
public class MathUtil {

    // hàm tính n giai thừa n! = 1.2.3.4.....n
    // không có giai thừa số âm
    // 0! = 1! = 1 quy ước
    // giai thừa tăng rất nhanh, 20! vừa đủ cho kiểu long, 18 con số 0 (long chứa 18 số 0)
    // 21! vượt quá kiêu Long => tràn vùng lưu trữ (long = 8byte = 2^63 = 18 số 0)
    // chặn việc n < 0 và n > 21
    public static long getFactorial(int n) {

        if (n < 0 || n > 21) {
            throw new IllegalArgumentException("Invalid argument. "
                    + "n must be between 0..20");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        // nếu chạy được đến đây thì chắc chắn n từ 2..20
        long product = 1;   // kết quả trung gian (kết quả tệ nhất phải bằng 1)
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }

}
