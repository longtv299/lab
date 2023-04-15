
import java.util.Scanner;
public class Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the height of triangle: ");
		int inputHeight = sc.nextInt();
		if (inputHeight > 1) {
			int lastRow = inputHeight*2-1;
            int difRow = 0;
			for (int i = inputHeight; i > 0; i--) {
				for (int j = 1; j <= lastRow; j++) {
					if (j < i || j > i+difRow) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
                difRow = difRow + 2;
				System.out.println();
			}
		} else {
			System.out.println("The height of triangle must > 1");
		}
		sc.close();
	}

}

