package JavaTrainningSession;

public class LoopsConcept {

	public static void main(String[] args) {
		
		//1.while loop :
		
		//dis -advantage of while loop : it will generate infinate loop  if you don't give incrementale /decremental parts
		
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			i = i+1;
		}
		
		System.out.println("----------");
		
		//j ++means j = j+1
		
		//2.for loop :
		for(int j =1;j<=10;j++) {
			System.out.println(j);
		}
		
		System.out.println("-------------");
		
		//k --means k = k-1
		
		for(int k =10;k>=1;k--) {
			System.out.println(k);
		}
		
	}

}
