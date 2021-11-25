package truongDinhPhuong_987654321;

import java.util.Date;

public class XeKhach extends Xe{
	private String loaiXe;
	private int soVe;
	private double giaVe;
	
	public String getLoaiXe() {
		return loaiXe;
	}

	public void setLoaiXe(String loaiXe) throws Exception {
		if (loaiXe!=null) {
			this.loaiXe = loaiXe;
		} else {
			throw new Exception("Lỗi loại xe rổng");
		}
		
	}

	public int getSoVe() {
		return soVe;
	}

	public void setSoVe(int soVe) {
		this.soVe = soVe;
	}

	public double getGiaVe() {
		return giaVe;
	}

	public void setGiaVe(double giaVe) {
		this.giaVe = giaVe;
	}

	@Override
	public double getThanhTien() {
		if (getLoaiXe()=="Ghế ngồi") {
			return getGiaVe()*getSoVe();
		} else {
			return getGiaVe()*getSoVe()+getGiaVe()*getSoVe()*0.5;
		}
	}
	
	public XeKhach(String ma, Date ngayKhoiHanh, String soXe, String loaiXe, int soVe, double giaVe) throws Exception {
		super(ma, ngayKhoiHanh, soXe);
		this.loaiXe = loaiXe;
		this.soVe = soVe;
		this.giaVe = giaVe;
	}

	@Override
	public String toString() {
		String s="";
		s+=s.format("%15s|%15s|%15s|%15s|", getLoaiXe(), getGiaVe(), getSoVe(), getThanhTien());
		return super.toString()+s;
	}


}
