package methods;

public class Methods {
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
	public static void main(String[] args) {
		int[] sayilar = {1,4,74,84,13,3,9};
		boolean varMi = false;
		int aranacak = 74;
		
		for(int sayi: sayilar) {
			if(sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		if(varMi) {
			String mesaj = "Aradığınız sayı dizide mevcuttur.";
			mesajVer(mesaj);
		}else {
			String mesaj = "Aradığınız sayı dizide mevcut değildir.";
			mesajVer(mesaj);
		}
	}
}
