import java.util.ArrayList;


public class Main {

	public static ArrayList<Integer> _primeNumbers = new ArrayList<Integer>();
	public static ArrayList<Integer> _cPrimeNumbers = new ArrayList<Integer>();
	public static void main(String arg[]) {
		
		calculatePrime(1000000);
		circularPrime(1);
		circularPrime(2);
		circularPrime(3);
		circularPrime(4);
		circularPrime(5);
		circularPrime(6);
		
		System.out.println(_cPrimeNumbers.size());
	}

	private static void circularPrime(int i) 
	{
		if (i == 1)
		{
			for (int j = 0; j < _primeNumbers.size(); j++)
			{
				if (_primeNumbers.get(j).toString().length() == 1)
				{
					_cPrimeNumbers.add(_primeNumbers.get(j));
				}
			}
		}
		
		if (i == 2)
		{
			for (int j = 0; j < _primeNumbers.size(); j++)
			{
				if (_primeNumbers.get(j).toString().length() == 2)
				{
					int k = _primeNumbers.get(j);
					int firstDigit = k / 10;
					int secondDigit = k % 10;
					
					int l = secondDigit*10 + firstDigit;
					
					if(_primeNumbers.contains(l))
					{
						_cPrimeNumbers.add(k);
					}
				}
			}
		}
		
		if (i == 3)
		{
			for (int j = 0; j < _primeNumbers.size(); j++)
			{
				if (_primeNumbers.get(j).toString().length() == 3)
				{
					String k = _primeNumbers.get(j).toString();
					int firstDigit = k.codePointBefore(1) - 48;
					int secondDigit = k.codePointBefore(2) - 48;
					int thirdDigit = k.codePointBefore(3) - 48;
					
					int firstNumber = secondDigit*100 + thirdDigit*10 + firstDigit;
					int secondNumber = thirdDigit*100 + firstDigit*10 + secondDigit;
					
					if (_primeNumbers.contains(firstNumber) && _primeNumbers.contains(secondNumber))
					{
						_cPrimeNumbers.add(_primeNumbers.get(j));
					}
				}
			}
		}
		
		if (i == 4)
		{
			for (int j = 0; j < _primeNumbers.size(); j++)
			{
				if (_primeNumbers.get(j).toString().length() == 4)
				{
					String k = _primeNumbers.get(j).toString();
					int firstDigit = k.codePointBefore(1) - 48;
					int secondDigit = k.codePointBefore(2) - 48;
					int thirdDigit = k.codePointBefore(3) - 48;
					int fourthDigit = k.codePointBefore(4) - 48;
					
					
					int firstNumber = secondDigit*1000 + thirdDigit*100 + fourthDigit*10 + firstDigit;
					int secondNumber = thirdDigit*1000 + fourthDigit*100 + firstDigit*10 + secondDigit;
					int thirdNumber = fourthDigit*1000 + firstDigit*100 + secondDigit*10 + thirdDigit;
					
					
					if (_primeNumbers.contains(firstNumber) && _primeNumbers.contains(secondNumber) && _primeNumbers.contains(thirdNumber))
					{
						_cPrimeNumbers.add(_primeNumbers.get(j));
					}
				}
			}

		}
		
		if (i == 5)
		{
			for (int j = 0; j < _primeNumbers.size(); j++)
			{
				if (_primeNumbers.get(j).toString().length() == 5)
				{
					String k = _primeNumbers.get(j).toString();
					int firstDigit = k.codePointBefore(1) - 48;
					int secondDigit = k.codePointBefore(2) - 48;
					int thirdDigit = k.codePointBefore(3) - 48;
					int fourthDigit = k.codePointBefore(4) - 48;
					int fifthDigit = k.codePointBefore(5) - 48;
					
					int firstNumber = secondDigit*10000 + thirdDigit*1000 + fourthDigit*100 + fifthDigit*10 + firstDigit;
					int secondNumber = thirdDigit*10000 + fourthDigit*1000 + fifthDigit*100 + firstDigit*10 + secondDigit;
					int thirdNumber = fourthDigit*10000 + fifthDigit*1000 + firstDigit*100 + secondDigit*10 + thirdDigit;
					int fourthNumber = fifthDigit*10000 + firstDigit*1000 + secondDigit*100 + thirdDigit*10 + fourthDigit;
					
					if (_primeNumbers.contains(firstNumber) && _primeNumbers.contains(secondNumber) && _primeNumbers.contains(thirdNumber)
							 && _primeNumbers.contains(fourthNumber))
					{
						_cPrimeNumbers.add(_primeNumbers.get(j));
					}
				}
			}
			
		}
		
		if (i == 6)
		{
			for (int j = 0; j < _primeNumbers.size(); j++)
			{
				if (_primeNumbers.get(j).toString().length() == 6)
				{
					String k = _primeNumbers.get(j).toString();
					int firstDigit = k.codePointBefore(1) - 48;
					int secondDigit = k.codePointBefore(2) - 48;
					int thirdDigit = k.codePointBefore(3) - 48;
					int fourthDigit = k.codePointBefore(4) - 48;
					int fifthDigit = k.codePointBefore(5) - 48;
					int sixthDigit = k.codePointBefore(6) - 48;
					
					int firstNumber = secondDigit*100000 + thirdDigit*10000 + fourthDigit*1000 + fifthDigit*100 + sixthDigit*10 + firstDigit;
					int secondNumber = thirdDigit*100000 + fourthDigit*10000 + fifthDigit*1000 + sixthDigit*100 + firstDigit*10 + secondDigit;
					int thirdNumber = fourthDigit*100000 + fifthDigit*10000 + sixthDigit*1000 + firstDigit*100 + secondDigit*10 + thirdDigit;
					int fourthNumber = fifthDigit*100000 + sixthDigit*10000 + firstDigit*1000 + secondDigit*100 + thirdDigit*10 + fourthDigit;
					int fifthNumber = sixthDigit*100000 + firstDigit*10000 + secondDigit*1000 + thirdDigit*100 + fourthDigit*10 + fifthDigit;
					
					if (_primeNumbers.contains(firstNumber) && _primeNumbers.contains(secondNumber) && _primeNumbers.contains(thirdNumber)
							 && _primeNumbers.contains(fourthNumber) && _primeNumbers.contains(fifthNumber))
					{
						_cPrimeNumbers.add(_primeNumbers.get(j));
					}
				}
			}			
		}
		
	}

	private static void calculatePrime(int number) {
		
		for (int i = 2; i < number; i++)
		{
			boolean isPrime = true;
			
			for (int j = 2; j < i && j < Math.sqrt(number); j++)
			{
				if(i%j == 0)
				{
					isPrime = false;
					break;
				}
			}
			
			if(isPrime)
			{
				_primeNumbers.add(i);
				System.out.println(i);
			}
		}	
	}

}
