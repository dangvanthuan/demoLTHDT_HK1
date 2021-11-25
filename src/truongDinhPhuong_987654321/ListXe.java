package truongDinhPhuong_987654321;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListXe {
	List<Xe> ls;
	public ListXe() {
		ls= new ArrayList<Xe>();
	}
	public boolean themXe(Xe x) {
		if (ls.contains(x)) {
			return false;
		} else {
			return ls.add(x);
		}
	}
	public void xuatXeKhach() {
		for (Xe xe : ls) {
			if (xe instanceof XeKhach) {
				System.out.println(xe);
			}
		}
	}
	public void inKetQuaThang(int thang, int nam) {
		Calendar ngayKH=Calendar.getInstance();
		for (Xe xe : ls) {
			ngayKH.setTime(xe.getNgayKhoiHanh());
			ngayKH.add(Calendar.MONTH,1);
			if (ngayKH.get(Calendar.MONTH)==thang && ngayKH.get(Calendar.YEAR)==nam) {
				System.out.println(xe);
			}
		}
	}
	public void sapXe() {
		Collections.sort(ls, new Comparator<Xe>() {
			@Override
			public int compare(Xe o1, Xe o2) {
				String x= new String(o1.getSoXe());
				String y= new String(o2.getSoXe());
				return x.compareToIgnoreCase(y);
			}
		});
	}


}
