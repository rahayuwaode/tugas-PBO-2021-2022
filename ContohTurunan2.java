class Unggas {
	public int jumlah_kaki = 2;
	public void berkokok() {
		System.out.println("Unggas berkokok");
	}
	
	public Unggas() {}
	public Unggas(String nama_unggas) {
	
	}
}

class Ayam extends Unggas {
	public Ayam() {
}
	public Ayam(String nama_ayam) {
	}
}
	
class ContohTurunan2 {
	public static void main (String [] args) {
		Ayam ayam = new Ayam();
		ayam.berkokok();
	}
}
 
