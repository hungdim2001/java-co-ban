/* java có 2 loại kiểu dữ liệu đó là:
    +kiểu dữ liệu nguyên thuỷ:(primitive data types):
        1. boolean: kiểu dữ liệu chỉ lưu 2 giá trị là: true và false
            ex: boolean isDone:false
        2.byte: lưu số nguyên có giá trị bằng 1 byte(8bit). Có giá trị trong khoảng từ
                -128 dến 127
                ex: byte a =100
        3.short:lưu số liệu là số nguyên có giá  trị bằng 2 byte nằm trong khoảng từ -2^15 
                đến 2^15-1
                ex: short s = 10000
        4.int:lưu số liệu số nguyên có giá trị bằng 4 byte nằm trong khoảng từ -2^31 đến
                2^31-1
                ex: int i = 2000000
        5. long:lưu số liệu số nguyên có kích thước bằng 8 byte nằm trong khoảng từ -2^63 
                đến 2^63-1. Giá trị cần gán phải có ký tự "l"nằm sau
                ex:long l = 1000000l
        6.float:Kiểu dữ liệu Float dùng để lưu trữ số thực có kích cỡ bằng 4 byte (32 bit). 
                Giá trị có thể lưu được nằm trong khoảng từ -3.4028235 x 10^38 đến -3.4028235 x 10^38.
                Giá trị gán cần có kí tự ‘f’ phía sau.
                ex: float pi = 3.14f;
        7.double:Kiểu dữ liệu Double dùng để lưu trữ số thực có kích cỡ bằng 8 byte (64 bit).
         Giá trị có thể lưu nằm trong khoảng từ -1.7976931348623157 x 10^308
          đến -1.7976931348623157 x 10^308. Giá trị gán có thể có hoặc không kí tự ‘d’ phía sau.
          ex:double a = 2.52.d hoặc double a = 2.52
        8.Kiểu Char:Kiểu dữ liệu Char dùng để lưu trữ kí tự có kích cỡ bằng 2 byte.
         Bản chất Char lưu trữ code Unicode nhưng khi lại hiển thị ra ‘kí tự’ ứng với mã đó. 
         Giá trị có thể lưu trữ nằm trong khoảng ‘u0000’ đến ‘uffff’.
         ex:Khi ta khai báo char a = ‘Ă’ thì bộ nhớ sẽ lưu mã Unicode là ‘\u0102’
    +kiểu dữ liệu tham chiếu:(Reference Types):Kiểu dữ liệu tham chiếu là kiểu dữ liệu 
                            của đối tượng. Biến của kiểu dữ liệu tham chiếu chỉ chứa địa
                            chỉ của đối tượng dữ liệu tại bộ nhớ Stack. Đối tượng dữ liệu 
                            lại nằm ở bộ nhớ Heap. Một số kiểu dữ liệu cụ thể như các mảng 
                            (Array), lớp đối tượng (Class) hay kiểu lớp giao tiếp (Interface).
*/
