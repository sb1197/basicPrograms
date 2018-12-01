package utility;
import java.util.*;

import com.bridgelabz.libraries.MathFunction;


public class Utility
{

		static Scanner sc = new Scanner(System.in);
		//private static Scanner sc2;
		
		public static int inputNumber()
		{
			return sc.nextInt();
		}
		
		
		public static String inputString() 
		{
			   return sc.nextLine();
		}
		
		public static double doubleNumber()
		{
			return sc.nextDouble();
		}
		
		public static String inputStr()
		{
			return sc.next();
		}
		
		
//**********************************************************************************
		
		
		public static void stopwatch()
		{
			double start=0,stop=0;
			System.out.println("Enter 0 to Start the Watch");	//Start the watch
		    int ch = sc.nextInt();
			if(ch==0)
		    {
		    	  start=System.currentTimeMillis();		//Get the Current time of local system
		    		 System.out.println("Current time of the day: " + start);
		    }
		     System.out.println("Enter 1 to Stop the Watch");	//Stop the watch
		     ch = sc.nextInt();
		     if(ch==1)
		     {
		    	  stop=System.currentTimeMillis();	
		    		 System.out.println("Current time of the day: " + stop);
		     }
		     double elapsedTime=stop-start;		//Calculate elapsed time
		     System.out.println("Calender - Time in milliseconds : " + elapsedTime);
		}
		
//*********************************************************************************
		
		public static void qudraticEquation(int a,int b,int c)
		{
			double delta, root1, root2;
		
			// To calculate value of delta
					delta = b*b - 4*a*c;
					System.out.println(delta);
					
					//To calculate of roots of x
					
					root1 = (-b + Math.sqrt(delta))/(2*a);
					root2 = (-b - Math.sqrt(delta))/(2*a);
					
					// To print the values roots of x
			        if(delta > 0)
			        {
			        	System.out.println("Roots are real and unequal");
			        	System.out.println("First root is:"+root1);
			        	System.out.println("Second root is:"+root2);      	
			        }
			        else if(delta==0)
			        {
			        	System.out.println("Roots are real and equal");
			        	System.out.println("First root is:"+root1);			        	
			        }
			        else
			        	System.out.println("Roots are imaginary..");
			        
		}
		
//********************************************************************************
		
		public static void gambler(int stake, int goal, int trials)
		{
			int bets = 0;        // total number of bets 
	        int wins = 0;        // total number of games won

	        // repeat trials times
	        for (int t = 0; t < trials; t++) 
	        {

	            int cash = stake;
	            while (cash > 0 && cash < goal) 	//To ensure money remaining for playing 
	            {
	                bets++;
	                if (Math.random() < 0.5) 
	                	cash++;     // win 
	                else                     
	                	cash--;     // lose 
	            }
	            if (cash == goal) 
	            	wins++;                
	        }

	        // print results
	        System.out.println(wins + " wins of " + trials);
	        System.out.println("Percent of games won = " + 100.0 * wins / trials);
	        System.out.println("No of bets : "+bets);
	        System.out.println("Average bets           = " + 1.0 * bets / trials);
		}	
		
		
//********************************************************************************
		
		public static void triplet(int n, int arr[])
		{

			int flag=0;
			for (int i = 0; i < n-2; i++)	
			{
			    for (int j = i + 1; j < n-1; j++)
			    {
			        for (int k = j + 1; k < n; k++) 
			        {
			            if (arr[i] + arr[j] + arr[k] == 0)	//check sum of triplets is zero or not
			            {
			                System.out.print(arr[i]);
			                System.out.print(" ");
			                System.out.print(arr[j]);
			                System.out.print(" ");
			                System.out.print(arr[k]);
			                System.out.println("\n");
			                flag=1;
			            }
			        }
			    }
			}
			 if (flag==0) 
			        System.out.println(" not exist "); 
		}
		
//**********************************************************************************
		
		public static double calculateWindChill(double t, double v)
		{
			double windchill;
			//Calculate windchill using formula given
			windchill = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
				
			return windchill;
				
		}
			
		
//**********************************************************************************
		
		public static void coupon()
		{
			char[] chars="123456789".toCharArray();
			int max=100000000;
			int random=(int) (Math.random()*max);	
			StringBuffer sb=new StringBuffer();
			
			while (random>0)
			{
				sb.append(chars[random % chars.length]); //calculate any random number between given array
				random /= chars.length;
			}

			String couponCode=sb.toString();		//To convert generated number to string
			System.out.println("Coupon Code: "+couponCode);		//Print num generated
		}
		

//**********************************************************************************
		
		public static double calculateDistance(int x1, int y1)
		{
			double distance;
			//Declare Origin point
			int x2 = 0,y2 = 0;		
			
			//Calculate distance between given point and origin
			distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));	
			
			//Return calculated distance from origin point
			return distance;
		}
		
//**********************************************************************************
		
		public static void flipCoin(int n)
		{
			double heads = 0, tails=0;
			
				for(int i=1; i<n; i++)
				{
					//To check the possibility of heads or tails
					if(Math.random() <= 0.5)	
					{
						heads++;
					}
					else
					{
						tails++;
					}
					
				}
				// Print the percentage of Heads and Tails
				System.out.println("P(H) = "+((double)heads*100)/n);
				System.out.println("P(T) = "+((double)tails*100)/n);
			
		}

//**********************************************************************************
		
		public static double harmonicNumber(int n)
		{
			double sum = 0;	
			// Calculate till we get n'th term
	        for (double i = 1; i <= n; i++) 
	        {
	            sum = sum + (double)1 / i;	//To calculate the harmonic value of given input  
	        }
	        return sum;
		}
		
//**********************************************************************************
		
		public static void powOfTwo(int n)
		{
			 int i = 0;                // count from 0 to N
		        int powerOfTwo = 1;       // the ith power of two

		        // repeat until i equals n
		        while (i <= n) 
		        {
		            System.out.println(i + " ------ " + powerOfTwo);   // print out the power of two
		            powerOfTwo = 2 * powerOfTwo;                // double to get the next one
		            i = i + 1;
		        }
		}
		
		
//**********************************************************************************
		
		public static void calculatePrimeFactors(int n)
		{
			//find prime factors of a number
				for(int i=2;i*i<=n;i++) 
				{
					while(n%i==0) 
					{
						System.out.print(i + " ");
						//divide the result until n%i goes to zero
			             n = n / i;					
					}
				}
					
		}
		
//**********************************************************************************
		
		
		public static void revstr(String str1)
		{
			String str2, str3;
			str2=str1.substring(0,3);				//To print string up-to given index
			System.out.print("Your name:"+str2);
			System.out.println("\n Hello "+str2+", How are you??");	
			str3=str2.replaceFirst(str2, str1);		//To replace string with original string
			System.out.println("\n Hello "+str3+", How are you??");	
		}
		
		
	//**********************************************************************************
	
		public static void primeCheck(int start, int end)
		{
			int i,j,count=0;
			for(i=1; i<=end; i++)
	        {
	            count = 0;
	            for(j=2; j<i; j++)
	            {
	                if(i%j == 0)
	                {
	                    count++;
	                    break;
	                }
	            }
	            if(count == 0)
	            {
	                System.out.print(i + " ");
	            }
	        }
		}
			
			
			
	//***********************************************************************************
		
				/*********ALGORITHM PROGRAMS*******/
		
	//***********************************************************************************
		 
		public static void anagram(String str1, String str2)
		{
			int m = str1.length();
			int n = str2.length();
			
			if(m == n)
			{
				char[] a = str1.toCharArray();
				Arrays.sort(a);
				char[] b = str2.toCharArray();
				Arrays.sort(b);
				String sortedString1 = new String(a);
				String sortedString2 = new String(b);
//				System.out.println("First string sorted is :"+sortedString1);
//				System.out.println("Second string sorted is :"+sortedString2);
				
				if(sortedString1.equals(sortedString2))
				{
					System.out.println("Input Strings "+str1+" & "+str2+" are Anagram.. ");
				}
				else
				{
					System.out.println("Input Strings "+str1+" & "+str2+" are not Anagram..");
				}
			}
			else
			{
				System.out.println("Input strings are of differnt length..");
			}
		}
		
//*********************************************************************************
		
		public static void primeNumber(int m, int n)
		{
			int flag = 0;
			int  k=0,i;
			int intArray[] = new int[n];
			for(i=m;i<=n;i++)	//loop continue to given range
			{
				for(int j=2;j<i;j++)	// strat checking prime no
				{
					if(i%j==0)		//check given number is prime or not
					{
						flag = 0;
						break;
					}
					else
						flag = 1;
				}
			
				if(flag == 1)
				{
					if(i!=1 || i!=0)				//Number should not be 0 or 1
					{
						System.out.print(i+" ");	//Print the prime numbers
						
						intArray[k] = i;		//scan the result into an integer array
						checkIntPalindrome(i);
						System.out.println(" ");	
						k++;						//scan until the last element
					}
				}
			}
			
			System.out.println();
			System.out.println("Anagrams are :");
			checkAnagram(intArray, k);				//calling the anagram method

		}
		
//********************************************************************************
		
		public static void checkAnagram(int intArray[], int k)
		{
			String strArray,str1;
			String br[] = new String[k];
			int flag = 0;
			for (int i = 0; i < k; i++)
			{
				strArray = Integer.toString(intArray[i]);
				char z[] = strArray.toCharArray();
				Arrays.sort(z);
				str1 = String.valueOf(z);
				br[i] = str1;
			}
			System.out.println();
			for(int m=0;m<=k;m++)
			{
				for(int p=m+1;p<k;p++)
				{
						if(br[m].equals(br[p]))
						{
							System.out.println(intArray[m]+"----"+intArray[p]);
							flag=1;
						}
				}
			}
			if(flag==0)
			{
				System.out.println("Exit");
			}
			
		}
		
		
//*********************************************************************************
		
			public static void checkIntPalindrome(int k)
			{
				int numberToCheck = k;
				int numberInReverse = 0;
				int temp = 0;
				//System.out.println("check");	
				while (numberToCheck > 0) 
				{
					temp = numberToCheck % 10;
					numberToCheck = numberToCheck / 10;
					numberInReverse = numberInReverse * 10 + temp;
				}
					if(k == numberInReverse)
					{
						System.out.print("   is a Palindrome");
					}
			}		
				
//********************************************************************************
			
			public static void BSInt(int n, int arr[], int search)
			{
			
				//Binary search on Integer array
				int first=0, last=n-1, mid = (first+last)/2;
				while( first <= last )
			    {
			      if ( arr[mid] < search )
			        first = mid + 1;    
			      else if ( arr[mid] == search )
			      {
			        System.out.println(search + " found at location " + (mid+ 1) + ".");
			        break;
			      }
			      else
			         last = mid - 1;
			 
			      mid = (first + last)/2;
			   }
			   if (first > last)
			      System.out.println(search + " isn't present in the list.\n");
				
			}
			
//********************************************************************************
		
			public static void BsearchString(String Strarr[], String searchstr)
			{
				//Binary search on String array
				int first=0, last=Strarr.length-1, mid = (first+last)/2;
				while( first <= last )
			    {
			      if ( Strarr[mid].compareTo(searchstr)< 0 ) {
			    	 
			        first = mid + 1;  
			      }
			      else if ( Strarr[mid].compareTo(searchstr)==0)
			      {
			        System.out.println(searchstr + " found at location " + (mid+1) + ".");
			        break;
			      }
			      else
			         last = mid - 1;
			 
			      mid = (first + last)/2;
			   }
			   if (first > last)
			      System.out.println(searchstr + " isn't present in the list.\n");
				
			}
			
//********************************************************************************
			
			public static void IsortInt(int arr[],int n)
			{
				int i;
				System.out.println("Elements of Integer array are :");
				for(i=0;i<n;i++)
				{
					System.out.println(arr[i]);
				}
				n = arr.length; 
				for (i=1; i<n; ++i) 
				{ 
					int key = arr[i]; 
					int j = i-1; 

					/* Move elements of arr[0..i-1], that are 
					greater than key, to one position ahead 
					of their current position */
					while (j>=0 && arr[j] > key) 
					{ 
						arr[j+1] = arr[j]; 
						j = j-1; 
					} 
					arr[j+1] = key; 
				} 
				System.out.println("Sorted Elements of Integer array are :");
				for(i=0;i<n;i++)
				{
					System.out.println(arr[i]);
				}
			}
			
//********************************************************************************
			
			public static void IsortSearch(String ar[],int k)
			{
				int i,j;
				System.out.println("Elements of String array are :");
				for(i=0;i<k;i++)
				{
					System.out.println(ar[i]);
				}
				
				//Insertion sort on string array
				String temp="";
				for(i=0;i<k;i++)
				{
					for(j=i+1;j<k;j++)
					{
						if(ar[i].compareToIgnoreCase(ar[j])>0)
						{
							temp = ar[i];
							ar[i]=ar[j];
							ar[j]=temp;
						}
					}
				}
				System.out.println("Sorted Elements of String array are :");
				for(i=0;i<k;i++)
				{
					System.out.println(ar[i]);
				} 
			}
			
//********************************************************************************
			
			public static void BubIntsort(int ar[],int k)
			{
				int i,j;
				for (i = 0; i < k-1; i++)
		            for (j = 0; j < k-i-1; j++)
		                if (ar[j] > ar[j+1])
		                {
		                    // swap temp and arr[i]
		                    int temp = ar[j];
		                    ar[j] = ar[j+1];
		                    ar[j+1] = temp;
		                }
				System.out.println("Elements of Sorted Integer array are : ");
				for(i=0;i<ar.length;i++)
				{
					System.out.println(ar[i]);
				}
			}
			
			
//********************************************************************************
			
			public static void BubStrsort(String arr[],int n)
			{
				int i,j;
				for (i = 0; i < n-1; i++)
		            for (j = 0; j < n-i-1; j++)
		                if (arr[j].compareToIgnoreCase(arr[j+1]) > 0 )
		                {
		                    // swap temp and arr[i]
		                    String temp = arr[j];
		                    arr[j] = arr[j+1];
		                    arr[j+1] = temp;
		                }
				System.out.println("Elements of Sorted String array are : ");
				for(i=0;i<arr.length;i++)
				{
					System.out.println(arr[i]);
				}	
			}
			
//********************************************************************************
			
			 static void search(int low, int high)
			{
				 //Scanner sc2 = new Scanner(System.in);
				int mid=(high+low)/2;
				if(high==low)
				{
					System.out.println("your number is "+mid);
					System.exit(0);
				}
				System.out.println("Is it less than "+mid);
				boolean reply=sc.nextBoolean();
				if(reply)
					search(low,mid-1);
				else 
					search(mid+1, high);
			}
			
//********************************************************************************
	
	public static void sort(String[] word)
	{
		 int i, j;
         String temp;

         for ( i = 0;  i < word.length - 1;  i++ )
         {
             for ( j = i + 1;  j < word.length;  j++ )
             {  
                      if ( word[ i ].compareToIgnoreCase(word [ j ] ) > 0 )
                       {                                             // ascending sort
                                   temp = word [ i ];
                                   word[ i ] = word [ j ];    // swapping
                                   word [ j ] = temp; 
                                   
                        } 
                } 
          }
	}
	//********************************************************************************
	
	public static void yournum(int arr[])
	{
		int low=0;
		int high=arr.length-1;
		System.out.println("Think any number between "+low+" and "+ high);
		Utility.search(low, high);
	}

	   
	//*************************************************************************************************

	
	public static void merge(String[] arr, int l, int m, int r) 
	    { 
	        // Find sizes of two subarrays to be merged 
	        int n1 = m - l + 1; 
	        int n2 = r - m; 
	  
	        /* Create temp arrays */
	        String L[] = new String [n1]; 
	        String R[] = new String [n2]; 
	  
	        /*Copy data to temp arrays*/
	        for (int i=0; i<n1; ++i) 
	            L[i] = arr[l + i]; 
	        for (int j=0; j<n2; ++j) 
	            R[j] = arr[m + 1+ j]; 
	  
	  
	        /* Merge the temp arrays */
	  
	        // Initial indexes of first and second subarrays 
	        int i = 0, j = 0; 
	  
	        // Initial index of merged subarry array 
	        int k = l; 
	        while (i < n1 && j < n2) 
	        { 
	            if (L[i].compareTo(R[j])<=0) 
	            { 
	                arr[k] = L[i]; 
	                i++; 
	            } 
	            else
	            { 
	                arr[k] = R[j]; 
	                j++; 
	            } 
	            k++; 
	        } 
	  
	        /* Copy remaining elements of L[] if any */
	        while (i < n1) 
	        { 
	            arr[k] = L[i]; 
	            i++; 
	            k++; 
	        } 
	  
	        /* Copy remaining elements of R[] if any */
	        while (j < n2) 
	        { 
	            arr[k] = R[j]; 
	            j++; 
	            k++; 
	        } 
	    } 
	  
	    // Main function that sorts arr[l..r] using 
	    // merge() 
	  public static void Msort(String arr[], int l, int r) 
	    { 
	        if (l < r) 
	        { 
	            // Find the middle point 
	            int m = (l+r)/2; 
	  
	            // Sort first and second halves 
	            Msort(arr, l, m); 
	            Msort(arr , m+1, r); 
	  
	            // Merge the sorted halves 
	            merge(arr, l, m, r); 
	        } 
	    } 
	
	  
//*************************************************************************************************

	  public static void countCurrency(int amount)
	  {
		  int[] notes = new int[]{ 2000, 500, 200, 100, 50, 20, 10, 5, 1 }; 
	        int[] noteCounter = new int[9]; 
	       
	        // count notes 
	        for (int i = 0; i < 9; i++) 
	        { 
	            if (amount >= notes[i])
	            { 
	                noteCounter[i] = amount / notes[i]; 
	                amount = amount - noteCounter[i] * notes[i]; 
	            } 
	        } 
	       
	        // Print notes 
	        System.out.println("Currency Count ->"); 
	        for (int i = 0; i < 9; i++) 
	        { 
	            if (noteCounter[i] != 0) 
	            { 
	                System.out.println(notes[i] + " : "
	                    + noteCounter[i]); 
	            } 
	        } 
	  }

	//*************************************************************************************************

	  public static void convertTemp(double temp)
	  {
		  double celsius, fahrenheit;
		 //return results to main
		  System.out.println("1)Celsius to Fahrenheit \n 2)Fahrenheit to Celsius");
		  System.out.println("Enter choice: ");
		  int ch = Utility.inputNumber();
		  if(ch==1)
		  {
			  fahrenheit = (temp * 9/5) + 32;
			  System.out.println("Temperature in Celsius to Fahrenheit: "+fahrenheit);
		  }
		  else if(ch==2)
		  {
			  celsius = (temp-32) * 5/9;
			  System.out.println("Temperature in Fahrenheit to Celsius : "+celsius);
		  }
	  }

	//*************************************************************************************************

	  public static double monthlyPay(double loanAmount,double termInYears,double interestRate)
	  {
		// Convert interest rate into a decimal
	       
	      //interestRate /= 100.0;
	       
	      // Monthly interest rate 
	       
	      double monthlyRate = interestRate / (12*100);
	       
	      // The length of the term in months 
	       
	      double termInMonths = 12 * termInYears;
	       
	      // Calculate the car loan payment
	       
	      // The Math.pow() method is used calculate values raised to a power
	       
	      double monthlyPayment =  (loanAmount*monthlyRate) / (1-Math.pow(1+monthlyRate, -termInMonths));
    
	      return monthlyPayment;
	  }

	//*************************************************************************************************

	  public static int dayOfWeek(int d, int m, int y) 
	  {
		  // Calculate day of week by taking date input from user.
		  int y0 = y-(14 - m) / 12;
		  int x = y0 + y0/4 -y0/100 +y0/400;
		  int m0 = m + 12 * ((14 - m) /12) - 2;
		   // Calculate day of week
		  int d0 = (d + x +(31*m0)/12)%7;
		   // Print the values calculated
//		  System.out.println(y0);
//		  System.out.println(x);
//		  System.out.println(m0);
		 // System.out.println(d0);
		
		  return d0;
		//change logic
//		  if(d0==0)
//			{
//				System.out.println("Sunday");
//			}
//			else if(d0==1)
//			{
//				System.out.println("Monday");
//			}
//			else if(d0==2)
//			{
//				System.out.println("Tuesday");
//			}
//			else if(d0==3)
//			{
//				System.out.println("Wednesday");
//			}
//			else if(d0==4)
//			{
//				System.out.println("Thursday");
//			}
//			else if(d0==5)
//			{
//				System.out.println("Friday");
//			}
//			else
//			{
//				System.out.println("Saturday");
//			}
//		  
	  }

	//*************************************************************************************************
/*	ANOTHER METHOD TO FIND DAY OF WEEK*/
	  public static int method(int year, int month, int day) 
	    { 
	        // to check the validity of day of month 
	        int[] darr = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; 
	  
	        // check validity of year and month 
	        if (year > 0 && (month > 0 && month <= 12)) 
	        { 
	  
	            // check for a leap year and month of February 
	  
	            if ((year % 4 == 0 || year % 400 == 0) &&  
	                month == 2 && (day > 0 && day <= 29)) 
	            { 
	  
	                // month starts at zero, so we need to put ( month - 1 ). 
	                Calendar calendar = new GregorianCalendar(year, month - 1, day); 
	                return calendar.get(Calendar.DAY_OF_WEEK); 
	            } 
	            else { 
	  
	                // check the range of day of month 
	                if (day > 0 && day <= darr[month - 1]) 
	                { 
	  
	                    // month starts at zero, so we need to put ( month - 1 ). 
	                    Calendar calendar = new GregorianCalendar(year, month - 1, day); 
	                    return calendar.get(Calendar.DAY_OF_WEEK); 
	                } 
	                else
	                    return 0; 
	            } 
	        } 
	        else
	            return 0; 
	    } 

	//*************************************************************************************************


	  public static void decimalToBinary(int n)
	  {
		// array to store binary number 
	        int[] binaryNum = new int[1000]; 
	   
	        // counter for binary array 
	        int count = 0; 
	        while (n > 0)  
	        { 
	            // storing remainder in binary array 
	            binaryNum[count] = n % 2; 
	            n = n / 2; 
	            count++; 
	        }     
	
	        // printing binary array in reverse order 
	        for (int j = count - 1; j >= 0; j--) 
	        {
	            System.out.print(binaryNum[j]);	         
	        }	
	  }

	//*************************************************************************************************

	  /*CONVERTING A DECIMAL NUMBER TO BINARY USING INBUILT FUNCTION AND SWAP THE
		 * NIBBLES
		 */
	  public static int binaryswap(int num)
	  {
			
				System.out.println("Decimal Number:"+num);
				String bin=Integer.toBinaryString(num);
				System.out.println("Binary Number after conversion:"+bin);
				
				int n=bin.length();
				
				String  s1 = "0";
				if(n<4)
				{
					bin = s1.concat(bin);
				}
				if(n>0 && n<8) 
				{					
						bin = requiredZero(8-bin.length())+bin;
				} 
				
					String nibble1=bin.substring(0, 4);
					System.out.println("Nibble 1:"+nibble1);
					String nibble2=bin.substring(4,8);
					System.out.println("Nibble 2:"+nibble2);
					String swappNibble=nibble2.concat(nibble1);
					System.out.println("After swapping nibbles:"+swappNibble);
					int dec=Integer.parseInt(swappNibble,2);
						
				
					return dec;
				
	  }

	  
	  public static String requiredZero(int n)
	  {
		  String s="";
		  for(int i=0;i<n;i++)
		  {
			  s=s+0;
		  }
		  return s;
	  }

		//*************************************************************************************************

	 
	  public static boolean checkLeapYear(int year)
	  {
		  boolean isLeap = false;	 
			  if(year % 4 == 0)
			  {
				  if( year % 100 == 0)
				  {
					  if ( year % 400 == 0)
						  isLeap = true;
					  else
						  isLeap = false;
				  }
				  else
					  isLeap = true;
			  }
			  else 
			  {
				  isLeap = false;
			  }		 
		  return isLeap; 
	  }


	//*************************************************************************************************

	  public static void K_Pattern()
	  {
		  // Function to generate the pattern K 
			int i,j;
			 // loop for rows 
			for(i=0;i<=6;i++)
			{
				 // loop for columns 
				for(j=0;j<=6;j++)
				{
					 //To print vertical lines
					if(j==0) 
					System.out.print("**");
					
					// Logic to generate stars 
					
					else if(i==0 && j==5)
						System.out.print("***");
					else if(i==1 && j==4)
						System.out.print("***");
					else if(i==2 && j==3)
					System.out.print("***");
					else if(i==3 && j==1)
					System.out.print("***");
					else if(i==4 && j==3)
						System.out.print("***");
					else if(i==5 && j==4)
						System.out.print("***");
					else if(i==6 && j==5)
						System.out.print("***");
					else 
						 // For the spaces 
					System.out.print(" ");
				}
				// For changing line 
				System.out.println();
			}
	  }

	//*************************************************************************************************

	  public static void D_Pattern()
	  {
		// Function to generate the pattern D 
					int n = 6;
			          
			        // loop for rows 
			        for (int i = 0; i < n; i++)
			        { 	              
			            // loop for columns 
			            for (int j = 0; j <= n; j++)
			            { 	                  
			                // Logic to generate stars 
			                
			                if (j == 1 || ((i == 0 || i == n-1) && (j > 1 && j < n-2)) || (j == n-2 && i != 0 && i != n-1)) 
			                    System.out.print("**");  	                      
			                // For the spaces 
			                else
			                    System.out.print("  ");  
			            } 	              
			        // For changing line 
			        System.out.println(); 
			        } 	
	  }


		//*************************************************************************************************

	  public static void W_Pattern()
	  {
		  // Function to generate the pattern W
			int i,j;
			 // loop for rows 
			for(i=0;i<=6;i++)
			{
				 // loop for columns 
				for(j=0;j<=20;j++)
				{			 
					// Logic to generate stars 
					
					if(j==0 || j==12)
					System.out.print("**");
					else if(i==5 && (j==2 || j==10))
					System.out.print("*");
					else if(i==4 && (j==4 || j==8))
					System.out.print("*");
					else if(i==3 && j==6)
					System.out.print("*");
					else 
						 // For the spaces 
					System.out.print(" ");
				}
				// For changing line 
				System.out.println();
			}	
			
	  }

	//*************************************************************************************************

	  public static double sumOfTwoDice(int a, int b)
	  {
		  double random1, random2;
		  double sum = 0;
		  	//To check the Numbers generated using Math.random() must be in between 1 to 6
	        if(a < b) 
	        {
	        	//To calculate two random values for addition
	            random1 = Math.random();
	            random2 = Math.random();
	        
	            System.out.println("First random number : "+random1+"  "+"Second random number : "+random2);
	        // Adding two random values generated using Math.random()
	        	sum = random1 + random2;	      
	        }
	        return sum; 
	  }
	  

	//*************************************************************************************************

	  public static void state5(int a,int b)
	  {
		  double num1,num2,num3,num4,num5;
		  double min,max,average;
		//To check the Numbers generated using Math.random() must be in between 0 and 1
			if(a < b)
			{
				//Calculating random five numbers using Math.random()
				num1 = Math.random();
				System.out.println("Number 1:"+num1);
				
				num2 = Math.random();
				System.out.println("Number 2:"+num2);
				
				num3 = Math.random();
				System.out.println("Number 3:"+num3);
				
				num4 = Math.random();
				System.out.println("Number 4:"+num4);
				
				num5 = Math.random();
				System.out.println("Number 5:"+num5);
				
				//To calculate minimum of five random numbers generated above using Math.min() 
				min = Math.min(num1, Math.min(num2, Math.min(num3, Math.min(num4,num5))));
				System.out.println("Minimum of five numbers :"+min);
				
				//To calculate maximum of five random numbers generated above using Math.max() 
				max = Math.max(num1, Math.max(num2, Math.max(num3, Math.max(num4, num5))));
				System.out.println("Maximum of five numbers :"+max);
				
				//To calculate average of five random numbers generated above
				average = (num1+num2+num3+num4+num5)/5;
				System.out.println("Average of five numbers :"+average);
			}
			
	  }

	//*************************************************************************************************

	  public static boolean isSpringSeason(int date,int month)
	  {
		  boolean flag = (month == 3 && date>=20 && date<=31)||
				  (month == 4 && date>=1 && date<=30)||
				  (month == 5 && date>=1 && date<=31)||
				 (month == 6 && date>=1 && date<=20);
		  		return flag;
	  }

	//*************************************************************************************************

	  public static double squareRoot(double c)
	  {
		  double epsilon = 1e-15;    
	        double t = c;              // calculate the square root of c
	        
	        // repeatedly apply Newton method until desired precision is achieved
	        while (Math.abs(t - c/t) > epsilon*t) {
	            t = (c/t + t) / 2.0;
	        }
	        return t;
	  }
	  
	  
	//*************************************************************************************************


	  public static void printRepeating(int arr[], int size)  
	    { 
	        int i, j; 
	        System.out.println("Repeated Elements are :"); 
	        for (i = 0; i < size; i++)  
	        { 
	            for (j = i + 1; j < size; j++)  
	            { 
	                if (arr[i] == arr[j])  
	                    System.out.print(arr[i] + " "); 
	            } 
	        } 
	    } 
	  

	//*************************************************************************************************

	 public static boolean isPowerOfTwo(int n) 
	    { 
	        if (n == 0) 
	            return false; 
	          
	            if (n % 2 != 0) 
	                return false; 
	            else
	            	return true; 
	    } 


	//*************************************************************************************************

	 public static int checkRepeated(int arr[], int size)
	 {	
	
		 int count=0,i;
		 for (i = 0; i < size; i++)  
	        { 
	            for (int j = i + 1; j < size; j++)  
	            { 
	                if (arr[i] == arr[j]) 
	                
	                	count++;
	            } 
	        } 
		 return count;
	 }

//*******************************************************************************************
	 
	
	 public static void integerOperation(int a, int b, int c)
	 {
		 	System.out.println("Result 1 :"+(a + b *c));
			System.out.println("Result 2 :"+(a * b + c));
			System.out.println("Result 3 :"+(c + a / b));
			System.out.println("Result 4 :"+(a % b + c));
	 }

//******************************************************************************************
	 

	 public static int stringPattern(String initialName)
	 {
		 int flag=1;
		 if(initialName.charAt(0)=='K')
		 {
			 Utility.K_Pattern();
		 }
		 else if(initialName.charAt(0)=='D')
		 {
			System.out.println();
			Utility.D_Pattern();
		 }
		 else if(initialName.charAt(0)=='W')
		 {
			System.out.println();
			Utility.W_Pattern();
		 }
		 else
			 flag=0;
			 return flag;		 
	 }

//*************************************************************************************
	 

	 public static void doubleOperation(double a, double b, double c)
	 {
		 System.out.println("Result 1 :"+(a + b *c));
		 System.out.println("Result 2 :"+(a * b + c));
		 System.out.println("Result 3 :"+(c + a / b));
		 System.out.println("Result 4 :"+(a % b + c));
	 }

	//***********************************************************************************
	 
	 
	 public static void calTrignometricFunction(double angle)
	 {
			double PI = 3.14159;
			//double inDegrees = angle * 180 / PI;
			
			
			//Convert given angle value to radian manually
			double inRadians = angle * PI / 180;
			
			//Convert given angle value to radian using inbuild function
			double radians = Math.toRadians(angle);
			double sine = Math.sin(radians);
			double cosine = Math.cos(radians);
			
			//System.out.println("Angle in Degrees: "+inDegrees);
			
			//Print angle value in radian, sine and cosine
			System.out.println("Angle in Radians: "+inRadians);
			System.out.println("Angle in Radians using Math.toRadians(): "+radians);
		
			System.out.println("Sine value of "+angle+" is :"+sine);
			System.out.println("Cosine value of "+angle+" is :"+cosine);
	 }
	 
	 
	//***********************************************************************************
	 
	 
	 public static void secondLargestInt(int arr[],int n)
	 {
		 int largest = arr[0];
			int secondLargest = arr[0];
			
			for (int i = 0; i < n; i++)
			{	 
				if (arr[i] > largest)
				{
					secondLargest = largest;
					largest = arr[i];
	 
				} 
				else if (arr[i] > secondLargest)
				{
					secondLargest = arr[i];	 
				}
			}
	 
			System.out.println("\nSecond largest number is:" + secondLargest);			 
	 }
	 
	//***********************************************************************************
	 
	 public static void secondSmallestInt(int arr[],int n)
	 {
		 int smallest = arr[0];
			int secondSmallest = arr[0];
			
			for (int i = 0; i < n; i++)
			{	  
				if(arr[i]==smallest)
				{
					secondSmallest=smallest;
		        } 
		        else if (arr[i] < smallest) 
		        {
		            secondSmallest = smallest;
		            smallest = arr[i];
		        } 
		        else if (arr[i] < secondSmallest) 
		        {
		            secondSmallest = arr[i];
		        }
			}
	 
			System.out.println("\nSecond smallest number is:" + secondSmallest);			 
	 }
	 
	//*********************************************************************************** 
	 
	 public static boolean stringPalindrome(String str)
	 {
			String reverse = "";
			boolean flag = false;
			int length = str.length();
			for ( int i = length - 1; i >= 0; i-- )
			{
				 reverse = reverse + str.charAt(i);
			}
		    if (str.equals(reverse))		       
		    	flag = true;
		    else		       
		    	flag = false;
	 
	 return flag;
	 
	 }
	 
	//*********************************************************************************** 
	 
		public static void strIterativePermutation(String prefix, String str) {
		    int n = str.length();
		    if (n == 0) 
		    	System.out.println(prefix);
		    else 
		    {
		        for (int i = 0; i < n; i++)
		        	strIterativePermutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
		    }
		}
	 
	 //*****************************************************************************************
		
		public static void strPermute(char[] char_arr, int i)
		{
		    if(i==char_arr.length-1)
		    {
		        // print the shuffled string 
		            String str="";
		            for(int j=0; j<char_arr.length; j++)
		            {
		                str=str+char_arr[j];
		            }
		            System.out.println(str);
		    }
		    else
		    {
			    for(int j=i; j<char_arr.length; j++)
			    {
			        char tmp = char_arr[i];
			        char_arr[i] = char_arr[j];
			        char_arr[j] = tmp;
			        strPermute(char_arr,i+1);
			        char tmp1 = char_arr[i];
			        char_arr[i] = char_arr[j];
			        char_arr[j] = tmp1;
			    }
		    }
		}
	 
	 //*****************************************************************************************

		public static double calcSine(double num)
		{
			//Convert angle x to an angle between -­2PI and 2PI
			double x = num % (2 * 3.14159);
			System.out.println("Convert angle: "+x);
			double sum = 0.0,term = 1.0;
			double numerator,denominator;
			int count = 0;
			for(int i = 1;term!=0.0; i++)
			{
				numerator = Math.pow(x, i);
				System.out.println("Numerator:"+numerator);
				denominator = MathFunction.findFactorial(i);
				System.out.println("Denominator:"+denominator);
				term = ( numerator / denominator);
				if (i % 4 == 1) 
					sum = sum + term;
	            if (i % 4 == 3) 
	            	sum = sum - term;
	            count++;
			}	
			//System.out.println("Count:"+count);
			return sum;
		}









































































}



