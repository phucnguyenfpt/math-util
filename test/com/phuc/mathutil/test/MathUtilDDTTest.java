/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.phuc.mathutil.test;

import static com.phuc.mathutil.core.MathUtil.getFactorial;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Minh Phuc
 */
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {

    // ta cần test thử Hàm() getFactorial()bên code chính chạy coi đúng không
    // cần đưa data vào cho Hàm() xem nó chạy và trả kết quả như thế nào
    // 3 việc: chuẩn bị data, đưa data vào trong Hàm() và gọi Hàm()
    //                          Kết luận đúng sai
    // 0! -> 1
    // 1! -> 1
    // 2! -> 2          bộ dữ liệu test, data test
    // 3! -> 6          lưu table SQLSERVER, Excel, .CSV
    // 4! -> 24         lưu trong 1 mảng
    // 5! -> 210
    // 6! -> 720
    // mảng 2 chiều [6][2]
    //[10][20] 1 chung cư có 10 lầu, mỗi lầu 20 căn
    // học cách code tách đám data ra khỏi các câu lệnh getFactorial()
    // tất cả các Framwork UnitTest của mọi ngôn ngữ lập trình đều làm được điều này
    // Hàm() trả về mảng 2 chiều kiểu Object
    // vì các FramWork chơi với Object, mảng số nguyên phải hiểu là Object
    // Wrapper Class nếu mảng số
    // Wrapper Class: Integer(int), Long(long), 
    
    // báo JVM JUnit đây là data nguồn!! -> dùng mapping vào Assert()
    @Parameterized.Parameters
    public static Object[][] initData() {
        // int a[] = {2, 4, 6, 8};
        // int a[4] = {2, 4, 6, 8};   theo Ngôn ngữ C
        // int a[] = {0, 1};

        return new Integer[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120},
            {6, 720}
        };
    }
    
    // cần trích mảng con ra để được cặp Value input/expected
    @Parameterized.Parameter (value = 0) // mapping cột 0
    public int input;

    @Parameterized.Parameter (value = 1) // mapping cột 1
    public int expected;
    
    @Test
    public void testFactorialGivenValidArgumentReturnsWell() {
        
        long actual = getFactorial(input);
        assertEquals(expected, actual);
        
    }
}

// DDT -> tách data test ra 1 chỗ. sau đó lấy từng miếng data mapping vào chỗ gọi Hàm(), chỗ assert()
// tách và mapping vào -> làm hoài như vậy cho các bộ data
// phải thông qua tên biến/tham số
// DDT còn gọi được gọi tên là kỹ thuật: THAM SỐ HÓA TEST DATA PARAMETERIZED
