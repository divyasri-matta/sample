package Jv;

public class PatternG {

	public static void main(String[] args) {
		for(int a=1;a<=8;a++) {
		for(int b=1;b<=8;b++) {
			if(a==1&&(b>1&&b<5)||b==1&&(a>1&&a<7)||a==7&&(b>1&&b<4)||b==4&&(a>3&&a<7)||a==4&&(b>2&&b<6)||b==5&&(a>3&&a<8)||a==2&&(b<6&&b>4))
	
				System.out.print("a ");
		else
		
			System.out.print("  ");	
	}

			
		
		System.out.println();
		}
}
}