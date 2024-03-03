package JavaEnterPriseEdition;

public class demo {
	
	public static void main(String[] args) {
		boolean result = 8>7;
		if(result)
		{
			System.out.println("8");
		}else
		{
		System.out.println("8");
		}
        
		//---------------------
		
		int n1 = 8;
		int n2 = 91;
		int n3 = 10;
		
		if(n1>n2 && n1>n3) {
			System.out.println(n1);
		}else if(n2>n1 && n2>n3) {
			System.out.println(n2);
		}else {
			System.out.println(n3);
		}
		
		//--------------------
		
		int age = 11;
		String result1 = age>=18 ? "Allowed" : "Not allowed";
		
		System.out.println(result);
		
	
		//--------------------
		
		int num = 12;
		
		switch(num) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("none");
		}
				
		//-----------------------
		int i = 0;
		do {
			System.out.println("*");
			i++;
		}while(i<5);
		
		//-----------------------
		
		for(int i1=0;i1<5;i1++) {
			System.out.println("**");
		}
		
		//----------------------
		for(int i3=0;i3<5;i3++) {
		for(int i2=0;i2<5;i2++) {
			System.out.print("*");
		}
		System.out.print("\n");
		}
		
		//---------------------
		for(int i4=0;i4<5;i4++) {
			for(int i5=0;i5<=i4;i5++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		//---------------------
		
		for(int i6=0;i6<5;i6++) {
			for(int i7=0;i7<5;i7++) {
				if(i6==0||i6==4||i7==0||i7==4) { 
				System.out.print("*");
				}else {
					System.out.print(" ");
			}
			}
			System.out.print("\n");
		}
		System.out.println("\n");
		
		//---------------------
		int n=7;
		for(int i8=0;i8<n;i8++) {
			for(int j8=0;j8<n;j8++) {
				if(j8==0||j8==n-1||i8==(n-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");	
			}
			System.out.println();
		}
		
		//----------------------------------
		
		int n11=5;
		for(int i1=0;i1<n11;i1++) {
			for(int j=0;j<n11;j++){
				if(i1==0||j==0||j==n11-1||i1==(n11-1)/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		//----------------------
		
		int n111=5;
		for(int i1=0;i1<n111;i1++) {
			for(int j=0;j<n111;j++) {
				if((i1==0 && j==0) || (i1==0 && j==n111-1)) {
					System.out.print(" ");
				}else if(i1==0||i1==(n111-1)/2||j==0||j==n111-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
	}
}
