import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public class Basics {
	public static void main(String[] args) {
		//print255Numbers();
		//PrintOddsNumbers();
		//PrintSum();
		int[] nums = {2,10,3};
		//IteratingArray(nums);
		int[] negativeNumbers ={-3, -5, -7};
		//FindMax(nums);
		//FindMax(negativeNumbers);
		int [] y = new int[260];  // this one was defined to ne used in the arrayOddsNumbers
		//ArrayOddsNumbers(y);
		//ArrayOddsNumbers();
		//GetAverage(nums);
		//GreaterThanY( nums, 2 );
		//SquareValuesArray(nums);
		//EliminateNegativeNumbers(negativeNumbers);  //Still required some work to have it done
		MaxMinAverage(nums);



		//System.out.println(GetArraySum(nums));

		//MaxMinAverage(nums);
		
			
	}

	//Print 1-255
	//Write a method that prints all the numbers from 1 to 255.
	public static void print255Numbers() {
		for(int i = 1; i <= 255; i++)
			System.out.println(i);
	}

	//Print odd numbers between 1-255
	//Write a method that prints all the odd numbers from 1 to 255.
	public static void PrintOddsNumbers() {
		for(int i = 0; i <= 255; i++) {
			if(i % 2 != 0)
				System.out.println(i);
		}
	}

	//Sigma of 255 AKA Sum to 255
	//Write a method that creates and eventually returns a sum variable that adds 
	//up all the numbers from 1 to 255. In this method you are not printing the sum, 
	//except to debug if you need to, the method should return the sum. Note: You do 
	//not need an array to write this function. 
	public static int PrintSum() { 
		int sum = 0;
		for(int i = 1; i <= 255; i++) {
			sum += i;
			//System.out.println(String.format("Number: %d, Sum: %d", i, sum));			
		}
		System.out.println(String.format("The result after add 255 numbers is: "+ sum));
		return sum;
	}

	
	
	
	//Iterating through an array
	//Given an array X, say [1,3,5,7,9,13], write a method that would iterate through each 
	//member of the array and print each value on the screen. Being able to loop through each 
	//member of the array is extremely important.
	public static void IteratingArray(int[] array) {
		for(int i: array)
			System.out.println(i);
	}

	




	//Find Max
	//Write a method (sets of instructions) that takes any array and prints the maximum value 
	//in the array. Your method should also work with a given array that has all negative 
	//numbers (e.g. [-3, -5, -7]), or even a mix of positive numbers, negative numbers and zero.
	public static int FindMax(int[] array) {
		int maxNumber = Integer.MIN_VALUE;
		//System.out.println(maxNumber);
		for(int number: array){
			if(number > maxNumber){
			maxNumber = number;
			}
		}
		System.out.println(maxNumber);
		return maxNumber;
	}

	//Array with Odd Numbers 
	//Write a method that creates an array 'y' that contains all the odd numbers between 
	//1 to 255. When the method is done, 'y' should have the value of [1, 3, 5, 7, ... 255].
	public static void ArrayOddsNumbers() {
		ArrayList<Integer> oddsNumbersArray = new ArrayList<Integer>();
		System.out.println(oddsNumbersArray);
		for(int i = 0; i <= 255; i++) {
			if(i % 2 != 0){
				oddsNumbersArray.add(i);
				//System.out.println(oddsNumbersArray);
			}
		}
		System.out.println(oddsNumbersArray);
	}
	
	
	
	/*public static void ArrayOddsNumbers() { //funciona pero incluye los ceros de los numeros pares porque ya estan definidos los valores
		int numbers[] = new int[10];
		//System.out.println(numbers);
		for(int i = 0; i < 10; i++) {
			if(i % 2 != 0){
				numbers[i]=i;
				System.out.println(numbers[i]);
			}else{  // no se necesita
				System.out.println(numbers[i]);
			}
		}
		System.out.println(Arrays.toString(numbers));
		//return array;
	}*/

	

//preguntar porque no funciona
	/*
	/*public static void ArrayOddsNumbers(String args[]) {
		String[] array
		List<Integer> oddsNumbersArray = new ArrayList<Integer>();
		for(int i = 0; i <= 255; i++) {
			if(i % 2 != 0)
				array[i]=i++;
				System.out.println(array);
			

		}
		System.out.println(array);
		//return array;
	}*/

	

    // preguntar porque no funciona
	/* 
	public static void ArrayOddsNumbers(int[] array) {
		
		for(int i = 0; i <= 255; i++) {
			if(i % 2 != 0)
				array[i]=i++;
				System.out.println(array);
			

		}
		System.out.println(array);
		//return array;
	}*/

	//Get Average
	//Write a method that takes an array, and prints the AVERAGE of the values in 
	//the array. For example for an array [2, 10, 3], your method should print an 
	//average of 5. Again, make sure you come up with a simple base case and write 
	//instructions to solve that base case first, then test your instructions for 
	//other complicated cases.


	public static double GetAverage(int[] nums) {
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];			
		}
		System.out.println(sum);
		double average =(double)sum/nums.length;
		System.out.println(average);
		return average;
	}

	

	//Greater Than Y
	//Write a method that takes an array and returns the number of values in that array 
	//whose value is greater than a given value y. For example, if array = [1, 3, 5, 7] 
	//and y = 3, after your method is run it will print 2 (since there are two values in 
	//the array that are greater than 3).
	public static int GreaterThanY(int[] array, int y) {
		int counter = 0;
		for(int number: array) {
			if(number > y)
				counter= counter+1;
		}
		System.out.println(counter);
		return counter;
	}

	//Square the values
	//Given any array x, say [1, 5, 10, -2], write a method that multiplies each value in 
	//the array by itself. When the method is done, the array x should have values that 
	//have been squared, say [1, 25, 100, 4].
	public static void SquareValuesArray(int[] nums) {
		ArrayList<Integer> squareNumbersArray = new ArrayList<Integer>();
		for(int number: nums ) {
			number = number * number;
			squareNumbersArray.add(number);
			System.out.println(number);	
		}
		System.out.println(squareNumbersArray);
	}


	//Eliminate Negative Numbers
	//Given any array x, say [1, 5, 10, -2], write a method that replaces any negative 
	//number with the value of 0. When the method is done, x should have no negative values, 
	//say [1, 5, 10, 0].
		
	public static void EliminateNegativeNumbers(int[] nums) {
		ArrayList<Integer> noNegativeNumbersArray = new ArrayList<Integer>();
		for(int number: nums) {
			if(number < 0){
				number = 0;
				noNegativeNumbersArray.set(number, 0);   //I got an error here, remember ask 
				System.out.println(noNegativeNumbersArray);	 //after have all practices up to date
			}
			noNegativeNumbersArray.add(number);
		}
		System.out.println(noNegativeNumbersArray);
	}

/*
	public static int FindMin(int[] arr) {
		int currMin = Integer.MAX_VALUE;
		for(int val: arr){
			if(val < currMin)
				currMin = val;
		}
		return currMin;
	}*/

	//Max, Min, and Average
	//Given any array x, say [1, 5, 10, -2], write a method that returns an array with 
	//the maximum number in the array, the minimum value in the array, and the average 
	//of the values in the array. The returned array should be three elements long and 
	//contain: [MAXNUM, MINNUM, AVG]

	public static int FindMin(int[] array) {  //This method was written to achieve the next one
		int minNumber = Integer.MAX_VALUE;    //It works pretty similar to FindMax
		//System.out.println(minNumber);
		for(int number: array){
			if(number < minNumber){
			minNumber = number;
			}
		}
		System.out.println(minNumber);
		return minNumber;
	}

	public static void MaxMinAverage(int[] nums) {
		int min = FindMin(nums);
		int max = FindMax(nums);
		double avg = GetAverage(nums);
		System.out.println(String.format("Max: %d, Min: %d, Average: %f", max, min, avg));
	}


	//Shifting the Values in the Array
	//Given any array x, say [1, 5, 10, 7, -2], write a method that shifts each number 
	//by one to the front. For example, when the method is done, an x of [1, 5, 10, 7, -2] 
	//should become [5, 10, 7, -2, 0]. Notice that the last number is 0. The method does not 
	//need to wrap around the values shifted out of bounds.

	//Need to work on this one
	
	
	
}