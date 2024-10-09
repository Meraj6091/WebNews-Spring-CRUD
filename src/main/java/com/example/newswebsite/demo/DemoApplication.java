package com.example.newswebsite.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);



//i dont remember lists i'll code using arrays

		//Problem 1
		//1
		int arr[]={1,2,4};
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}
//		System.out.println(sum);

		//2
		for(int i:arr){
			sum=sum+i;
		}
//		System.out.println(sum);


		//problem 2
		int arr2 []={1,2,3,4};
		int arr3 []={5,6,7,8};
		int comArr []=new int[arr2.length+arr3.length];

		for(int i=0;i<arr2.length;i++){
			comArr[i]=arr2[i];
		}

		for(int i=0;i<arr3.length;i++){
			comArr[arr2.length+i]=arr3[i];
		}

		for(int i=0;i<comArr.length;i++){
			System.out.println(comArr[i]);
		}


		//problem 4
		int arr5[]={1,8,3};
		int largeNo=arr5[0];

		for(int i=0;i<arr5.length;i++){
			if(arr5[i]>largeNo){
				largeNo=arr5[i];
			}
		}
		System.out.println(largeNo);


		//problem 5
		int arr6[]={1,2,3,4,5,6,7,8,9};
		

	}

}
