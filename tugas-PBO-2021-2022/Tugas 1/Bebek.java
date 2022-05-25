class Bebek {
	private static String jenis_unggas = "Bebek";
	private static int jumlah_kaki = 2;
	
	public static String getJenisUnggas() {
		return jenis_unggas;
	}
	
	public static int getJumlahKaki() {
		return jumlah_kaki;
	}
	
	private static void menguik() {
		System.out.println("Aku menguik");
	}
	
	private static void berjalan() {
		System.out.println("Aku berjalan");
	}
	
	public static void main(String [] args) {
		System.out.println(
			String.format("Jenis unggas: %s", getJenisUnggas())
			);
		System.out.println(
			String.format("Jumlah kaki: %s", getJumlahKaki())
			);
		menguik();
		berjalan();
	}
}
