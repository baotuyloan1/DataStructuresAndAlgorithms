package org.ctdl.bigo;

/**
 * @author BAO
 * 6/30/2023
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * static array : access O(1), search O(n),
 * không thể insertion vì nó là vùng chứa có độ dài cố định, các phần tử trong mảng sau khi khai báo sẽ là 0 nếu chưa set.
 * không thể appending được luôn
 * không thể xóa element trong static array
 * array sẽ lưu vào địa chỉ index là địa chỉ của element trên thanh ghi.
 * khi thai báo 1 static array sẽ đưa độ dài vào cho nó.
 * java sẽ tìm trong cả vùng nhớ của chúng ta chỗ nào có size = size của array. thì array sẽ được đặt vào trong đấy
 * element[0] sẽ là địa chỉ bắt đầu của array cũng là địa chỉ của array. nó giống pointer . pointer = 0;
 * muốn tìm index không thì array point vào element đầu tiên
 * muốn đến index số 3 = pointer + 3;
 * <p>
 * <p>
 * dinamic array: access O(1), search O(n)
 * *insertion đến vị trí cần insert và di chuyển tất cả các element phía sau index đó lên 1 nấc. Nó luôn loop từ index đến n-1 . F(n) = (n-1) - index => O(f(n)) = O(n)
 * - appending sẽ là O(1) vì nó chỉ cần thêm element đó vào cuối array là xong.
 * -delete sẽ lùi các phần tử xuoogns 1 nất giống insert nên sẽ là O(n)
 * khi 1 mảng đầy nó sẽ tìm 1 chỗ mới, có nhiều chỗ trống hơn, copy tất cả array cũ và đem qua chỗ mới
 * <p>
 * insertion : thêm element vào bất kỳ vị trí nào của array
 * <p>
 * appending: gắn thê element vào cuối array.
 */
public class ArrayBigO {
    public static void main(String[] args) {
//        int[] a = new int[3];
//        System.out.println(a[2]);
//
//        String[] b = new String[3];
//        System.out.println(b[2]);
//        List c = new ArrayList();
//        c.remove(1);

        List<Integer> listA = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> listB = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Kiểm tra xem mảng A có chứa tất cả các phần tử của mảng B không
        boolean containsAll = listA.containsAll(listB);
        System.out.println(containsAll);
    }
}
