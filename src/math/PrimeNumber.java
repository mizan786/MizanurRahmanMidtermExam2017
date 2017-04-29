package math;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		System.out.println("The list of prime numbers from 2 to 1000000 are ");
		int counter = 0;
		for(int i = 2; i <500; i++){
			if(isPrime(i)){
				counter++;
				System.out.println(i);
			}
		}
	}
	public static boolean isPrime(int number){
		if ( number % 2 == 0){
			return false;
		}
		for (int i= 3; i*i <= number; i =i+2){
			if(number % i ==0){
				return false;
			}
		}
		return true;
	}
}
