import java.util.Scanner;

public class Module1Buoi1 {
    public static void main(String[] args) {
        //       int a = 12;
//        double b = 10.2;
//        String c = "cdaasdas";
//        char e = 'r';
//        boolean isabc = true;
//        final double Pi = 3.14;
//        System.out.println(a);
//        Scanner input = new Scanner(System.in);
//        int adc = input.nextInt();
//        System.out.println(adc);
//
//        Danh sách bài tập:
//        Hoàn thành kiến thức vào XMIND
//        Nhập xuất:
//        1. In ra Hello World
//        System.out.println("Hello World");
//        2. In ra Hello world, Hi Ae
//        System.out.println("Hello world, Hi Ae");
//        3. Nhập vào tên bạn, ví dụ NA => in ra ""Hello C06""
//        Scanner input = new Scanner(System.in);
//        String adc = input.nextLine();
//        if (adc == "duong") {
//            System.out.println("Hello C07");
//        }
//
//        Kiểu dữ liệu:
//        1. Khai báo 1 biến kiểu int, in ra số đó.
//        int a = 10;
//        System.out.println(a);
//        2. Nhập 1 biến kiểu int, in ra số đó.
//        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//        System.out.println(a);
//        3. Nhập vào 2 biến kiểu int, in ra tổng, tích, hiệu, thương, số dư của 2 số đó.
//        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//        int b = input.nextInt();
//        System.out.println("tổng" + (a + b));
//        System.out.println("tích" + (a * b));
//        System.out.println("hiệu" + (a - b));
//        System.out.println("thương" + (a / b));
//        System.out.println("số dư" + (a % b));
//        4. Nhập vào tên, tuổi. In ra: ""Xin chào ..., tôi năm nay ..."""
//        Scanner input = new Scanner(System.in);
//        String name = input.nextLine();
//        int age = input.nextInt();
//        System.out.println("Xin chào " + name + ", tôi năm nay " + age + "tuổi");
//
//        Toán tử:
//        Nhập vào 2 số:
//        1. Sử dụng: +, -, *, /, %
//        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//        int b = input.nextInt();
//        System.out.println("tổng" + (a + b));
//        System.out.println("tích" + (a * b));
//        System.out.println("hiệu" + (a - b));
//        System.out.println("thương" + (a / b));
//        System.out.println("số dư" + (a % b));
////        2. Sử dụng =, +=, -=, *=, /=
//        System.out.println("tổng" + (a = b));
//        System.out.println("tích" + (a *= b));
//        System.out.println("hiệu" + (a -= b));
//        System.out.println("thương" + (a /= b));
//        3. Sử dụng ++, --
//        System.out.println("++" + a++);
//        System.out.println("--" + a--);
//        4. Sử dụng <, >, <=, >=, ==, !=
//        System.out.println(">" + (a > b));
//        System.out.println("<" + (a < b));
//        System.out.println(">=" + (a >= b));
//        System.out.println("==" + (a == b));
//        System.out.println("!=" + (a != b));
//
//Bài 1: Nhập vào hai số a và b, và kiểm tra xem a có chia hết cho b hay không.
//        Scanner input = new Scanner(System.in);
//        System.out.println("nhap a");
//        int a = input.nextInt();
//        System.out.println("nhap b");
//        int b = input.nextInt();
//        if (a % b == 0) {
//            System.out.println("a chia het cho b");
//        }else {
//            System.out.println("a khong chia het cho b");
//        }
//Bài 2: Nhập tuổi và in ra kết quả nếu tuổi học sinh đó không đủ điều kiện vào học lớp 10.
//        Scanner input = new Scanner(System.in);
//        System.out.println("nhap tuoi");
//        int age = input.nextInt();
//        if (age < 14) {
//            System.out.println("không đủ điều kiện vào học lớp 10");
//        }
////Bài 3: Nhập một số nguyên bất kỳ và in kết quả ra màn hình để nói cho người dùng biết số đó là lớn hay nhỏ hơn 0
//        Scanner input = new Scanner(System.in);
//        System.out.println("nhap so:");
//        int a = input.nextInt();
//        if (a < 0) {
//            System.out.println("nhỏ hơn 0");
//        } else {
//            System.out.println("lớn hơn 0");
//        }
//Bài 4: Nhập 3 số nguyên và tìm giá trị lớn nhất của ba số nguyên đó
//        Scanner input = new Scanner(System.in);
//        System.out.println("nhap 3 so:");
//        int a = input.nextInt();
//        int b = input.nextInt();
//        int c = input.nextInt();
//        if (a > b && a > c) {
//            System.out.println("max = " + a);
//        } else if (b > a && b > c) {
//            System.out.println("max = " + b);
//        } else if (c > a && c > b) {
//            System.out.println("max = " + c);
//        }
//Bài 5: Xếp hạng học lực của học sinh dựa trên các điểm bài kiểm tra, điểm thi giữa kỳ, điểm thi cuối kỳ
//        Scanner input = new Scanner(System.in);
//        System.out.println("nhap diem giua ki:");
//        int a = input.nextInt();
//        System.out.println("nhap diem cuoi ki:");
//        int b = input.nextInt();
//        int diemthi = (a * 2 + b * 3) / 5;
//        if (diemthi >= 8) {
//            System.out.println("gioi");
//        } else if (diemthi <= 8 && diemthi >= 6) {
//            System.out.println("kha");
//        } else if (diemthi < 6) {
//            System.out.println("tb");
//        }
//Bài 6: Tính hoa hồng nhận được tuỳ theo mức doanh số bán hàng
//        Scanner input = new Scanner(System.in);
//        System.out.println("nhap số sản phẩm bán ra:");
//        int a = input.nextInt();
//        System.out.println("nhap gia tien moi sp:");
//        int giatien = input.nextInt();
//        int lai = a * giatien * 50 / 100;
//        System.out.println("hoa hong " + lai);
//Bài 7: Tính cước điện thoại cho một hộ gia đình với các thông số đã cho
//Bài 1: Chuyển từ độ C sang độ F. °C  x  9/5 + 32 = °F
//        Scanner input = new Scanner(System.in);
//        System.out.println("nhap do c:");
//        int c = input.nextInt();
//        int f = c * 9 / 5 + 32;
//        System.out.println(f);
//Bài 2: Chuyển từ mét sang feet: ft =m * 3.2808
//        Scanner input = new Scanner(System.in);
//        System.out.println("nhap m:");
//        int m = input.nextInt();
//        double ft = m * 3.2808;
//        System.out.println(ft);
//Bài 3: Tính diện tích hình vuông khi biết cạnh a.
//        Scanner input = new Scanner(System.in);
//        System.out.println("nhap canh:");
//        int a = input.nextInt();
//        int dt = a * a;
//        System.out.println(dt);
//Bài 4: Tính diện tích hình  chữ nhật khi biết 02 cạnh a, b.
//        Scanner input = new Scanner(System.in);
//        System.out.println("nhap 3 so:");
//        int a = input.nextInt();
//        int b = input.nextInt();
//        int dt = a * b;
//        System.out.println(dt);
//Bài 5: Tính diện tích tam giác vuông khi biết 02 cạnh kề a, b.
//        Scanner input = new Scanner(System.in);
//        System.out.println("nhap 3 so:");
//        int a = input.nextInt();
//        int b = input.nextInt();
//        int dt = (a * b)/2;
//        System.out.println(dt);
//Bài 6: Giải phương trình bậc 1. ax + b = 0
//        Scanner input = new Scanner(System.in);
//        System.out.println("he phuong trinh ax + b");
//        System.out.println("a");
//        int a = input.nextInt();
//        System.out.println("b");
//        int b = input.nextInt();
//        if (a == 0) {
//            System.out.println("pt vo nghiem");
//        } else {
//            System.out.println(" pt co nghiem:" + (-b / a));
//        }
//Bài 7: Giải phương trình bậc 2. ax2 + bx + c =0
//        Scanner input = new Scanner(System.in);
//        System.out.println("he phuong trinh ax2 + bx + c");
//        System.out.println("a");
//        int a = input.nextInt();
//        System.out.println("b");
//        int b = input.nextInt();
//        System.out.println("c");
//        int c = input.nextInt();
//        double delta = b * b - 4 * a * c;
//        if (delta < 0) {
//            System.out.println("pt vo nghiem");
//        } else if (delta == 0) {
//            System.out.println("pt co nghiem kep" + -b / (2 * a));
//        } else if (delta > 0) {
//            System.out.println(" pt co 2 nghiem" + ((-b + Math.sqrt(delta)) / (2 * a)) + "," +((-b - Math.sqrt(delta)) / (2 * a)));
//        }
//Bài 8: Kiểm tra xem một số nhập vào có phải là tuổi của một người không. Một số nguyên là tuổi của một người khi nhỏ 120 và lơn hơn 0.
//        Scanner input = new Scanner(System.in);
//        System.out.println("Nhap tuoi");
//        int a = input.nextInt();
//        if (a < 120 && a > 0) {
//            System.out.println("la tuoi");
//        } else {
//            System.out.println("khong la tuoi");
//        }
//Bài 9: Kiểm tra xem 3 số thực (a,b,c) nhập vào có phải là cạnh của một tam giác. Điều kiện để a,b,c là cạnh của một tam giác là:
//a,b,c > 0
//a + b > c
//b + c > a
//a + c > b
//        Scanner input = new Scanner(System.in);
//        System.out.println("nhap 3 so:");
//        int a = input.nextInt();
//        int b = input.nextInt();
//        int c = input.nextInt();
//        if (a > 0 && b > 0 && c > 0 && (a + b) > c && b + c > a && a + c > b) {
//            System.out.println("la tam giac");
//        } else {
//            System.out.println("khong la tam giac");
//        }
//Bài 10: Viết chương trình tính giá điện.
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so dien:");
        int a = input.nextInt();
        final double giadien = 3000;
        System.out.println("tien dien" + (a * giadien) + "đ");
//Bài 11: Viết chương trình tính thuế thu nhập cá nhân.
    }
}