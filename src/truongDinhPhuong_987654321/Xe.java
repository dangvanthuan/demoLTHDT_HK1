package truongDinhPhuong_987654321;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public abstract class Xe {
	// kb
	protected String maChuyen = "XXXXXX";
	protected Date ngayKhoiHanh;
	protected String soXe;

	// phương thức ảo
	public abstract double getThanhTien();

	public String getMaChuyen() {
		return maChuyen;
	}

	public void setMaChuyen(String ma) throws Exception {
		if (maChuyen != null) {
			this.maChuyen = ma;
		} else {
			throw new Exception("Lỗi mã");
		}

	}

	public Date getNgayKhoiHanh() {
		return ngayKhoiHanh;
	}

	public void setNgayKhoiHanh(Date ngayKhoiHanh) {
		this.ngayKhoiHanh = ngayKhoiHanh;
	}

	public String getSoXe() {
		return soXe;
	}

	public void setSoXe(String soXe) {
		this.soXe = soXe;
	}
	// rb
	public void setNgayKhoiHanh(int ngay, int thang, int nam) {
		Calendar ngayKH = Calendar.getInstance();
		ngayKH.set(nam, thang, ngay);
		this.ngayKhoiHanh=ngayKH.getTime();
	}
	

	// toString


	public Xe(String ma, Date ngayKhoiHanh, String soXe) throws Exception {
		super();
		if (ma!=null) {
			this.maChuyen = ma;
		} else {
throw new Exception("Lỗi mã");
		}
		
		this.ngayKhoiHanh = ngayKhoiHanh;
		this.soXe = soXe;
	}
	

	public Xe() {
		super();
		// TODO Auto-generated constructor stub
	}
	SimpleDateFormat df= new SimpleDateFormat("dd/MM/yyyy");

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maChuyen == null) ? 0 : maChuyen.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Xe other = (Xe) obj;
		if (maChuyen == null) {
			if (other.maChuyen != null)
				return false;
		} else if (!maChuyen.equals(other.maChuyen))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Xe [maChuyen=" + maChuyen + ", ngayKhoiHanh=" + df.format(ngayKhoiHanh.getTime()) + ", soXe=" + soXe + "]";
	}
	
}
