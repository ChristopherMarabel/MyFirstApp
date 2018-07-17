package beerSong;

public class BeerSong {

	public static void main(String[] args) {
		int beerNum = 99;
		String word = "bottles";
				
		while (beerNum >= 0) {
			if (beerNum == 1) {
				word = "bootle"; // singular, as in ONE bottle.
			}

			if (beerNum > 0) {
				System.out.println(beerNum + " " + word + " of beer on the wall");
				System.out.println(beerNum + " " + word + " of beer.");
				System.out.println("take one down");
				System.out.println("Pass it around");

			}else {
					System.out.println("No more bottles of beer on the wall");		
			}
			beerNum = beerNum - 1;
		}
	}
}
