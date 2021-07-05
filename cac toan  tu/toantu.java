/*
            Toán tử thao tác bit trong Java
Java định nghĩa một số toán tử thao tác bit có thể được áp dụng cho các kiểu giá trị integer, long, int, short, char, và byte.

Toán tử thao tác bit làm việc trên các bit. Giả sử nếu a = 60 và b = 13, thì trong định dạng nhị phân chúng sẽ như sau:

a = 0011 1100

b = 0000 1101

-----------------

a&b = 0000 1100

a|b = 0011 1101

a^b = 0011 0001

~a  = 1100 0011

Bảng dưới đây liệt kê các toán tử bit được hỗ trợ trong Java:

Giả sử biến A giữ giá trị 60 và biến B giữ 13 thì khi đó:
Toán tử	Miêu tả	                                                                                                             Ví dụ
&	    Toán tử Và nhị phân sao chép một bit tới kết quả nếu nó tồn tại trong cả hai toán hạng	(A & B) sẽ cho kết quả 12, hay là 0000 1100
|	    Toán tử Hoặc nhị phân sao chép một bit tới kết quả nếu nó tồn tại trong một hoặc hai toán hạng	(A | B) sẽ cho kết quả 61, hay là 0011 1101
^	    Toán tử Hoặc loại trừ nhị phân sao chép bit nếu nó được thiết lập trong một toán hạng nhưng không phải trong cả hai	(A ^ B) sẽ cho kết quả 49, hay là 0011 0001
~	    Toán tử đảo bit là toán tử một ngôi. Đảo bít 1 thành 0 và ngược lại	(~A ) sẽ cho kết quả -61, hay là 1100 0011
<<	    Toán tử dịch trái. Giá trị toán hạng trái được dịch chuyển sang trái bởi số các bit được xác định bởi toán hạng bên phải.	A << 2 sẽ cho kết quả 240, hay là 1111 0000
>>	    Toán tử dịch phải. Giá trị toán hạng trái được dịch chuyển sang phải bởi số các bit được xác định bởi toán hạng bên phải	A >> 2 sẽ cho kết quả 15, hay là 1111
>>>	    Toán tử dịch phải và điền 0 vào chỗ trống	A >>>2 sẽ cho kết quả 15, hay là 0000 1111
         

        Toán tử instanceof trong Java
Toán tử này chỉ được sử dụng cho các biến tham chiếu đối tượng. Toán tử kiểm tra có hay không đối tượng là một kiểu cụ thể (kiểu class hoặc kiểu interface). Toán tử instanceof được viết như sau:

( Object reference variable ) instanceof  (class/interface type)
Toán tử trả về true nếu toán hạng trái là biến thể hiện của toán hạng phải. Ví dụ:

public class Test {

   public static void main(String args[]){
      String name = "Doan";
      // Duoi day se tra ve true neu name la mot kieu String
      boolean result = name instanceof String;  
      System.out.println( result );
   }
}
Nó sẽ cho kết quả:

true
*/
public class toantu {

  public static void main(String args[]) {
    int a, b;
    a = 10;
    b = (a == 1) ? 20 : 30; //Day la vi du ve toan tu dieu kien.
    System.out.println("Gia tri cua b la : " + b);

    b = (a == 10) ? 20 : 30; //Day la vi du ve toan tu dieu kien.
    System.out.printf("Gia tri cua b la : %d %d ", a, b);
    System.out.println("Gia tri cua b la : " + a + " " + b);
  }
}
