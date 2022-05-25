import java.util.Scanner;
class Kotak {
	public int panjang;
	public int lebar;
	public int tinggi;
	
	public int volume() {
	 return panjang*lebar*tinggi;
	}
	public Kotak() {
		System.out.println("Ini adalah constructor class Kotak");
		panjang = 3;
		lebar = 3;
		tinggi = 3;
	}
	
	public static void main(String [] args) {
		Kotak kotak = new Kotak();
		
		Scanner in = new Scanner(System.in);
		System.out.println("masukan nilai panjang: ");
		kotak.panjang = in.nextInt();
		
		System.out.println("masukan nilai lebar: ");
		kotak.lebar = in.nextInt();
		
		System.out.println("masukan nilai tinggi: ");
		kotak.tinggi = in.nextInt();
		
		System.out.println(String.format("volume kotak: %s", kotak
		.volume()));
	}
}
