package com.ynjTest.homework7;
import com.ynjTest.homework5.*;
public class TotalArea {

	public static void main(String[] args) {
	   Circle[] circleArray;
	   circleArray=creatCircleArray();
	   printCircleArray(circleArray);
	}
public static Circle[] creatCircleArray() {
	Circle[] circleArray=new Circle[5];
	for(int i=0;i<circleArray.length;i++) {
		circleArray[i]=new Circle(Math.random()*100);
	}
	return circleArray;
}
public static void printCircleArray(Circle[] circleArray) {
	System.out.printf("%-30s%-15s\n","Radius","Area");
	for(int i=0;i<circleArray.length;i++) {
		System.out.printf("%-30f%-15f\n",circleArray[i].getRadius(),circleArray[i].getArea());
	}
}
}
