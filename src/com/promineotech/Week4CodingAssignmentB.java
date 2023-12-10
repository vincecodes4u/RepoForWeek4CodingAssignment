package com.promineotech;

public class Week4CodingAssignmentB {

	public static void main(String[] args) {
		
//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
//a. Programmatically subtract the value of the first element in the array from the value in the last 
//element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
//b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages
//array, and have more elements).  
//c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.

int [] ages = {3, 9, 23, 64, 2, 8, 28, 93};		
		int result = ages [ages.length - 1] - ages[0];
		System.out.println(result);

		int [] ages2 = {11, 22, 33, 44, 55, 66, 77, 88, 99};
		// int result2 = ages2 [ages.length - 1] - ages[0];
		// System.out.println(result2);
		
		int sum = 0;
		for (int age : ages2) {
			sum += age;
		}
		double average = (double) sum / ages2.length;
		System.out.println("Average" + average);
		
	//2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.	
//a.Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.		
		
		String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		int sum2 = 0;
		
		for (int i = 0; i < names.length; i++) {
			
			sum2 += names[i].length();
			
			System.out.println(names[i]);
			System.out.println(names[i].length());
	
		}
		System.out.println("Value of sum for names is " + sum2);
		System.out.println("Average letters per name in names array = " + (sum2/names.length));
		
		String concatNames = "";
		for (int i = 0; i < names.length; i++ ) {
			concatNames += names[i] + " ";
			System.out.println(concatNames);
		}
//3. How do you access the last element of any array?
		int lastElement = ages2[ages2.length - 1];
		System.out.println("Last element is " + lastElement);

//4. How do you access the first element of any array?
		int firstElement = ages2[0];
		System.out.println("First element is " + firstElement);
		
//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
         //int sum2 = 0;
		
		//for (int i = 0; i < names.length; i++) {
			
			//sum2 += names[i].length();
			
			//System.out.println(names[i]);
			//System.out.println(names[i].length());
//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.		
		//System.out.println("Value of sum for names is " + sum2);
//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).		
		String result2 = concatenateWord("Hello",4);
		System.out.println(result2);
		
		
//Test concatStrings method
//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		System.out.println(concatStrings("John", "Smith"));	
//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		
		int [] numbers = {55,66,77,88};
		boolean result3 = isSumGreaterThan100(numbers);
		System.out.println("The sum is greater than 100:" + " " + result3);
//10.Write a method that takes an array of double and returns the average of all the elements in the array.
		double[] values = {11.5, 22.5, 33.5, 44.5, 55.5};
		double average2 = calculateAverage(values);
		System.out.println("The average of the values is " + average2);
//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.	
		double [] array1 = {1.5, 2.5, 3.5, 4.5};
		double [] array2 = {5.5, 6.5, 7.5, 8.5};
		boolean result4 = compareAverages(array1, array2);
		System.out.println("Average of array1 is greater than average of array2 " + result4);
//12.Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		boolean isHotOutside = true;
		double moneyInPocket = 19.99;
		boolean willBuyDrink = willBuyDrink(isHotOutside, moneyInPocket);
			System.out.println("Will buy a drink: " + willBuyDrink);
//13 method will return true if a paint color is a primary color
			String color = "green"; 
			boolean isPrimaryColor = isPrimaryColorString(color);
			System.out.println("Is the this color a primary color? " + isPrimaryColor);
		
		
		
		
		
		
}//main ends here,methods below this line
   //Create a method that takes 2 Strings and concatenates them together Question 7
	public static String concatStrings(String str1, String str2) {
		
		return str1 + " " + str2;
	}
	public static String concatenateWord(String word, int n) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < n; i++) {
			result.append(word);
		}
		return result.toString();
	}
	public static boolean isSumGreaterThan100(int[] array) {
		int sum = 0;
		for (int num : array) {
			sum += num;
		}
		return sum > 100;
	}
	
public static double calculateAverage(double [] array) {
	if (array.length == 0) {
		return 0.0;
	}
	double sum = 0;
	for (double num : array) {
		sum += num;
	}
	return sum/array.length;
	}
//11
public static boolean compareAverages(double[] array1, double[] array2) {
	double average1 = calculateAverage(array1);
	double average2 = calculateAverage(array2);
	return average1 > average2;
}
public static double calculateAverage4(double [] array) {
	if (array.length == 0) {
		return 0.0;
	}
	double sum = 0;
	for (double num : array) {
		sum += num;
	}
	return sum/array.length;
	}
//12
public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	return isHotOutside && moneyInPocket > 10.50;
}

//13 Primary color method
public static boolean isPrimaryColorString(String input) {
	String [] primaryColorNames = {"red", "blue", "yellow"};
	
	for (String color : primaryColorNames) {
		
		if (input.equals(color)) {
			return true;
		}
	}
	return false;
}

}//Public Class ends here
