package truongDinhPhuong_987654321;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TestXe {

	public static void main(String[] args) throws Exception {
		String ngay= "22/08/2012";
		SimpleDateFormat df= new SimpleDateFormat("dd/MM/yyyy");
		Date ngayKH=df.parse(ngay);
		Xe x1 = new XeKhach("763123", ngayKH, "51A-1234", "Giường nằm", 20, 30000);
		System.out.println(x1);
		ListXe ls= new ListXe();
		ls.themXe(x1);
		System.out.println("Nhập tháng:");
		Scanner sc= new Scanner(System.in);
		int thang=sc.nextInt();
		System.out.println("Nhập năm:");
		int nam=sc.nextInt();
		ls.inKetQuaThang(thang,nam);
		//Thang ngay theo day
		Date d1= new Date();
		
		System.out.println(d1);
		Calendar calendar = Calendar.getInstance();
        calendar.set(2020, 2, 4);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
 
        System.out.printf("%04d-%02d-%02d%n",year,month+1,day+1);
        // 2020-03-05
        // Tháng trong Calendar bắt đầu từ 0-11
        // Tương tự cho ngày
        System.out.println(dayOfWeek);
		
	}

}
