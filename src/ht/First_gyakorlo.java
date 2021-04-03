package ht;

public class First_gyakorlo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;
		int count = 0;
		
		for(int i=1; i<=a; i++) {
			if(a%i==0) {
				count ++;
			}
		}
		
		if(count == 2 ) {
			System.out.println("Ez egy prim");
			
		}
		else {
			 {
					System.out.println("Nem prim");
				}
		}
		
		
		int i=1;
		try { 
		     for (int j = -1; j > -1  ; j--) {
		           i = i / j ; 
		           out.print(i+",  ");
		      }
		} catch (Exception e) {
		      out.print("Hiba történt.   ");
		} finally {
		       i = 100; 
		       out.println(i);      
		}
		
		
	}

}
