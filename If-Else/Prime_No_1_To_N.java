// import java.util.Scanner;

// class Prime_No_1_To_N {
//     public static void main(String arg[]) {
//         int i, count;
//         System.out.print("Enter n value : ");
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         System.out.println("Prime numbers between 1 to " + n + " are ");
//         for (int j = 2; j <= n; j++) {
//             count = 0;
//             for (i = 1; i <= j; i++) {
//                 if (j % i == 0) {
//                     count++;
//                 }
//             }
//             if (count == 2)
//                 System.out.print(j + "  ");

//         sc.close();
//         }
//     }
// }

import java.util.Scanner;

class FindPrime {
	FindPrime(int num) {
		int count = 0, i = 1;
		while (i <= num) {
			if (num % i == 0) {
				count++;
			}
			i++;
		}
		if (count == 2)
			System.out.println(num + " is a prime number ");
		else
			System.out.println(num + " is a Not a prime number ");
	}
}

class Prime {
	public static void main(String arg[]) {
		System.out.println("Enter a number ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		new FindPrime(n);

		sc.close();
	}
}