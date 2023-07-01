package org.ctdl;

/**
 * @author BAO
 * 6/30/2023
 */

/**
 * các elements có thể nằm rãi rác không nhất thiết phải nằm bên cạnh nhau như của dynamic array (array list)
 * địa chỉ của node cuối cùng trỏ đến lun là null
 * <p>
 * tìm kiếm node sau sẽ phải hỏi thằng node trước. không nhất thiết phải nằm trên cùng 1 thanh ghi
 * Có 2 loại linkedList . singly: không biết thằng phía trươc là ai và doubly biết cả thằng phía trước và thằng phía sau
 * nghĩa là : singly chỉ trỏ đến địa chỉ của thằng tiếp theo trong khi double nó vừa trỏ đến địa chỉ của node phía sau, vừa trỏ đến địa chỉ của node trước nó
 * <p>
 * singly : ít tốn bộ nhớ, code dễ, nếu đang ở node giữa muốn tìm node trước thì rất khó phải lặp lại từ node đầu
 * <p>
 * doubly : x2 bộ nhớ vì nó vừa trỏ node trước vừa trỏ node sau, code khó, truy vẫn ngước đến node trước, có thể đi đuôi lên cái đầu
 */
public class LinkedListDemo {
}
