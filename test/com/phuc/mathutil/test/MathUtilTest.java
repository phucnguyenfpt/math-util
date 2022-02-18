/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.phuc.mathutil.test;

//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
import static com.phuc.mathutil.core.MathUtil.*;
import org.junit.Test;
import static org.junit.Assert.*;

// nếu muốn sử dụng các Hàm STATIC
// -- Cách 1: gọi tên class.tên hàm static() truyền thống đó giờ
//          nhớ import packages... tên class chứa hàm static

// -- Cách 2: không gọi tên clas.tên hàm static() mà gọi tên hàm() một mình giống như C
//          nhớ import static packages...tên class.tên hàm static không ngoặc
//     hoặc                                       .* lấy tất cả các hàm() static

/**
 *
 * @author Minh Phuc
 */
public class MathUtilTest {

    // Test case #1: check getFactorial() with valid argumennt
    // n = 0 , expected = 1; actual = (chạy thử)
    // Test biến 1 hàm bất kì trong Class thành Main()
    @Test
    public void testFactorialGivenValidArgumentN0ReturnsWell() {
        long expected = 1; // hy vọng hàm trả về 1 nếu tính 0!
        long actual = getFactorial(0);

        assertEquals(expected, actual);
        // Trong main() in ra kết quả của EXPECTED và ACTUAL
        // ta tự nhìn bằng mắt và so sánh
        // Bên JUnit nhìn bằng 2 màu
                // Xanh: khi EXPECTED và ACTUAL khớp nhau
                    // Đỏ: khi EXPECTED và ACTUAL không khớp
        // chạy bằng cách chuột phải -> run test
        // ko F6, nó sẽ chạy main()
    }

    // Test case #2: check getFactorial() with valid argumennt
    // n = 6 , expected = 720; actual = (chạy thử)
    @Test
    public void testFactorialGivenValidArgumentN6ReturnsWell() {
        long expected = 720; // hy vọng hàm trả về 1 nếu tính 0!
        long actual = getFactorial(6);

        assertEquals(expected, actual);
        
    }
    
    
    // NGOẠI LỆ LÀM SAO ĐỂ TEST
    // NGOẠI LỆ KHÔNG PHẢI LÀ 1 VALUE
    // NGOẠI LỆ LÀ 1 TÌNH HUỐNG BẤT THƯỜNG, CÓ KHẢ NĂNG XẢY RA
    // KHÔNG LÀ VALUE ĐỂ SO SÁNH THEO KIỂU " assertEquals " 
    //  ngoại lệ không dùng hàm assertEquals()
    // chỉ có thể đo lường xem nó có thể xuất hiện hay không?
    
    // Test case #3: check getFactorial() with InValid argumennt
    // n = -5 , expected = ngoại lệ xảy ra
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenInvalidArgumentThrowsException() {
        getFactorial(-5);
        
    }
    
}
