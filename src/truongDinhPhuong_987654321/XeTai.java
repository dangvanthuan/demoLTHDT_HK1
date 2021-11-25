package truongDinhPhuong_987654321;

import java.util.Date;

public class XeTai extends Xe{
	private int soChuyen;
	private String loaiXe;
	private double giaChuyen;
	private final double PHI=50000;
// dg
	

	@Override
	public double getThanhTien() {
		if (getLoaiXe()=="8 Tấn" || getLoaiXe()=="16 Tấn") {
			return getSoChuyen()*getGiaChuyen()+PHI;
			
		} else {
			return getSoChuyen()*getGiaChuyen();
		}
	}

	public int getSoChuyen() {
		return soChuyen;
	}


	public void setSoChuyen(int soChuyen) throws Exception {
		if (soChuyen>=1) {
			this.soChuyen = soChuyen;
		} else {
			throw new Exception("số chuyến >0");
		}
		
	}
	public String getLoaiXe() {
		return loaiXe;
	}


	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}


	public double getGiaChuyen() {
		return giaChuyen;
	}

	public void setGiaChuyen(double giaChuyen) {
		this.giaChuyen = giaChuyen;
	}

	public XeTai(String maChuyen, Date ngayKhoiHanh, String soXe, int soChuyen, String loaiXe, double giaChuyen)
			throws Exception {
		super(maChuyen, ngayKhoiHanh, soXe);
		this.soChuyen = soChuyen;
		this.loaiXe = loaiXe;
		this.giaChuyen = giaChuyen;
	}

	public XeTai() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		String s="";
		s+=s.format("%10s|%10S|%10s|%10s|", getLoaiXe(), getGiaChuyen(), getSoChuyen(), getThanhTien());
		return super.toString()+s;
	}

	

	
	
	

}
