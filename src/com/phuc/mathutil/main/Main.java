/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.phuc.mathutil.main;

import com.phuc.mathutil.core.MathUtil;

/**
 *
 * @author Minh Phuc
 */
public class Main {

    public static void main(String[] args) {
        // ta kiểm thử bằng cách gọi hàm, với data đưa vào, chạy
        // nhìn kết quả của hàm trả về ACTUAL so sánh với cái ta mong đợi EXPECTED
        // ví dụ 5! thì ta hy vọng (EXPECTED) nhận về là = 120
        //                 thực tế (ACTUAL) hàm getFactoiaal(5) trả về kết quả ACTUAL = ?
        // chạy xong so sánh EXPECTED với ACTUAL   
        // để đảm bảo hàm đúng => ta phải chia các trường hợp
        // nghĩ ra các tình huống hàm sẽ được sài, tức là nghĩ ra các bộ Data
        // để đưa cho Hàm, Hàm chạy, nhân Output và Kết Luận
        // MỖI BỘ DATA ĐƯA VÀO, MỖI DATA CỤ THỂ ĐỂ TEST HÀM CHO 1 MỤC ĐÍCH NÀO ĐÓ
        //            => TA GỌI LẦ TEST-CASE - TÌNH HUỐNG TEST
        //n = 5, gọi hàm getFactorial() => test case
        //n = -5 gọi hàm getFactorial() => test case
        // Test case #1: check getFactorial() with valid argumennt
        // n = 0 , expected = 1; actual = (chạy thử)
        long expected = 1; // hy vọng
        long actual = MathUtil.getFactorial(0); // kết quả khi chạy hàm
        // so sánh Compare
        System.out.println("0! -> expected: " + expected + "; acutal: " + actual);

        // Test case #2: check getFactorial() with valid argumennt
        // n = 6 , expected = 720; actual = (chạy thử)
        expected = 720; // hy vọng
        actual = MathUtil.getFactorial(6); // kết quả khi chạy hàm
        // so sánh Compare
        System.out.println("6! -> expected: " + expected + "; acutal: " + actual);

        // Test case #3: check getFactorial() with invalid argumennt
        // n = -5 , expected = ??? ném ra ngoại lệ; actual = (chạy thử)
        // thấy ngoại lệ mừng
        //expected = Exception sẽ xuất hiện, không phải kiểu long; // hy vọng
        // kết quả khi chạy hàm có r a được ngoại lệ Exception
        System.out.println("Check if an exception í throw by using invalid argument");
        MathUtil.getFactorial(-5);
    }
}
