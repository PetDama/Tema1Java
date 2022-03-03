import java.util.Scanner;

public class MAIN {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in); 
//		Problema01(sc); 
//		Problema02(sc); 
//		Problema03(sc); 
//		Problema04(sc); 
//		Problema05(sc); 
//		Problema06(sc); 
//		Problema07(sc); 
//		Problema08(sc); 
//		Problema09(1009); 
//		Problema10(); 
//		Problema12(sc);
//		Problema13();
//		Problema14();
//		Problema16(sc);
//		Problema17(sc);
//		Problema18(sc);
//		Problema19(sc);
//		Problema20(sc);

		
		

	}

	
	public static void Problema01(Scanner sc) {
	System.out.println("Introdu nota");
		int n = sc.nextInt();
	if (n>=5)
		System.out.println("ADMIS");
	else if (n<=5 && n >=1)
		System.out.println("RESPINS");
	if (n<1 || n>10)
		System.out.println("INVALID");
		
		
	}



	public static void Problema02(Scanner sc) {
			System.out.print("Introdu numarul: ");
			byte n = sc.nextByte();
			switch (n) {
			
			case 1:
				System.out.println("UNU");
				break;
				
			case 2:
				System.out.println("DOI");
				break;
				
			case 3:
				System.out.println("TREI");
				break;
				
			case 4:
				System.out.println("PATRU");
				break;
				
			case 5:
				System.out.println("CINCI");
				break;
				
			default:
				System.out.println("INVALID");
				break;
		}
	}

	
		public static void Problema03(Scanner sc) {
			System.out.println("Introdu numarele: ");
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();
				
			if (n1%2 == 0 && n2%2 ==0)
				System.out.println("Produs" + n1*n2);
			
			else if (n1%2 != 0 && n2%2 !=0) {
				
				
				int Media = (n1+n2)/2;
				System.out.println("Media: " + Media);
			}
				
			else 
				System.out.println("Suma: " + n1+n2);
				 
			
	}


		public static void Problema04(Scanner sc) {
			System.out.println("Introdu trei numere: ");
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int n3 = sc.nextInt();
			
		if (n1<n2 && n1<n3)
			System.out.println("Valoarea minima: " + n1);
		
		else if (n2<n1 && n2<n3)
			System.out.println("Valoarea minima: " + n2);
		
		else if (n3<n2 && n3<n1)
			System.out.println("Valoarea minima: " + n3);
		
		}
		
		public static void Problema05(Scanner sc) {
			System.out.print("Introdu numarul: ");
			int n = sc.nextInt();
			int suma = 0;
			
		for (int i = 1; i<=n; i++) {
			if (i%2 == 0) {
				
				suma = suma + i;
			}
		}		
		System.out.println("Suma: " + suma);
	}
		
		
		
		public static void Problema06(Scanner sc) {
			System.out.print("Introdu numarul: ");
			int n = sc.nextInt();
			int suma = 0;
			
		for (int i = 1; i<=n; i++) {
			if (i%2 != 0) {
				
				suma = suma + i;
			}
		}
		System.out.println("Suma: " + suma);
	}
		
		

		public static void Problema07(Scanner sc) {
			System.out.print("Cate numere: ");
			int n = sc.nextInt();
			int suma = 0;
			int result = 0;
			
		for (int i = 1; i<=n; i++) {
			System.out.print("Optiunea ta");
			int optiunea_ta = sc.nextInt();
				suma = suma + optiunea_ta;
		}
		result = suma / n;
		System.out.println("Result: " + result);
	}

		public static void Problema08(Scanner sc) {
			System.out.println("Introdu numarul");
			int n = sc.nextInt();
			int factorial = 1;
			for (int i = 1; i<=n; i++) {
				factorial = factorial * i;
			}
			System.out.println("Factorial de " +n + " este " + factorial);
	}
		public static boolean Problema09(int n) {
			boolean set = true;
			if (n % 2 == 0) {
				return set;
			}
			for (int dvz = 3; dvz <= Math.sqrt(n); dvz++) {
				if (n % dvz == 0) {
					set = false;
					break;
				}
				dvz++;
			}
			if(set)
				System.out.println("N este prim");
			else
				System.out.println("N nu este prim");
			return set;
		}
		
		public static void Problema10() {
			int n = 1001;
			while(true) {
				if (Problema09(n)) {
					System.out.println("Numarul este prim: " + n);
					break;
				}
				n = n + 2;
			}
		}
		
	
		//n.11 Sa se afiseze toti divizorii numarului ‘n’ dat.
		public static boolean esteNrPrim(int n) {
				boolean set = true;
				if((n%2) ==0)
				return false;
				for(int dvz=3; dvz<=Math.sqrt(n);dvz++) {
					if(n%dvz==0) {
						set = false;
						System.out.println("Am gasit un prim divizor: " + dvz);
						break;
					}
					dvz++;
				}
				return set;
			}
		
		
		public static void Problema12(Scanner sc) {
			System.out.println("Introduceti numarul: ");
			int n = sc.nextInt();
			int dvz = 2;
			while (n != 1) {
				while (n % dvz == 0) {
					if( n % dvz == 0) {
						n = n / dvz;
						if(esteNrPrim(dvz)) {
							System.out.println("Divizorii primi: " + dvz);
							dvz += 2;
						}
						System.out.println("Numarul n: " +n);
					}
				}
				dvz++;
			}
		}
		

		public static void Problema13() {
			int n1 = 1000;
			int n2 = 0;
			int n3 = n1;

			while (n2 <= n1) {
				if (n2 % 17 == 0 && n3 % 19 == 0) {
					System.out.println("Num1: " + n2 + "\n" + "Num2: " + n3);
					System.out.println();
				}
				++n2;
				--n3;
			}
		}

		public static void Problema14() {
			int a = 1000;
			int b = 1;
			int c = a - 1;

			while (b < a) {
				if (b + c == a) {
					if ((b % 17 == 0 || b % 13 == 0) && (c % 19 == 0 || c % 7 == 0)) {
						System.out.println("Num1: " + b + "\n" + "Num2: " + c);
						System.out.println();
					}
					b++;
					c--;
				}
			}
		}

		
		public static void Problema16(Scanner sc) {
			System.out.println("Introduceti numarul: ");
			int a = sc.nextInt();
			int b = a;
			while(a > 10) {
				b = a % 10 ;
				System.out.println(b);
				a = a/10;
			}
			System.out.println(a);
		}
		
		public static void Problema17(Scanner sc) {
			System.out.println("Introduceti numarul: ");
			int a = sc.nextInt();
			int maxx = 1;
			while (a!=0) {
				if(maxx<a%10)
				maxx=a%10;
				a/=10;
			}
			
			System.out.println("Cifra maxima a unui numar: " + maxx);
		}
		
		public static void Problema18(Scanner sc) {
			System.out.println("Introduceti numarul: ");
			int a = sc.nextInt();
			int b = a;
			int min = a%10;
			while (a > 10) {
				b = a % 10;
			if(b < min)
				min = b;
			a = a/10;
			}
			System.out.println("Cifra minima a unui numar: " +min);
		}
		
		
		public static void Problema19(Scanner sc) {
			System.out.println("Introduceti numarul: ");
			int n = 0;
	        int reversen = 0;
	        n = sc.nextInt();
	        while (n != 0) {
	            reversen = reversen * 10;
	            reversen = reversen + n % 10;
	            n = n / 10;
	        }

	        System.out.println ("Inversul numarului este: "+ reversen);
	    }
	
		public static void Problema20(Scanner sc) {
			System.out.println("Introduceti numarul: ");
			int n1 = sc.nextInt();
			int n2 = n1;
			int numarnou = 0;
			while(n1 > 0) {
				int m = n1;
				m = n1 % 10;
				numarnou = numarnou *10 +m;
				n1 = n1 / 10;
			}
			if(n2 == numarnou)
			System.out.println("Este palindrom: ");
			else 
				System.out.println("Nu este palindrom: ");
			
		}
}

		
		
		
		
		