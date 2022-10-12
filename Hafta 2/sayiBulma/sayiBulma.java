package sayiBulma;

public class sayiBulma {
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
			System.out.println("Aradığınız sayı dizide mevcuttur.");
		}else {
			System.out.println("Aradığınız sayı dizide mevcut değildir.");
		}

	}
}
