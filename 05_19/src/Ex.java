import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {

		Scanner scanf = new Scanner(System.in);
		System.out.println("입력");
		int weight = scanf.nextInt();
		
		int array[][] = new int[weight][weight];
		setArray(array,weight);
		
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.print("["+array[i][j]+"]");
			}
			System.out.println("");
		}
	}
	
	public static void setArray(int array[][], int weight) {
		int x= 0;
		int n=weight-1;
		int y= n/2;
		int count = 1 ; 
		
		for(int i=0; i<weight * weight; i++) {
			if(array[x][y] == 0) {
				array[x][y] = count;
				y--;
				if(y<0)
					y=n;
				x--;
				if(x<0)
					x=n;
				count++;
			}
			if(array[x][y] != 0) {
				x++;
				if(x>n)
					x=0;
				y++;
				if(y>n)
					y=0;
				x++;
			}
		}
	}
}
