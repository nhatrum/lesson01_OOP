package Rum.dev.model;

import Rum.dev.OOP.*;

public class MainApp {
	public static void main(String[]args) {
		final String arrName[] = {"bao","Tu","Tap,","Teo","Name"};
		final int arrOld[] = {21, 25, 26, 15, 16};
		Person arrPerson[] = new Person[arrName.length];
		for(int i=0; i < arrPerson.length; i++) {
			Person p = new Person (arrName[i], arrOld[i]);
			arrPerson[i]=p;
		} //in ra
		for(int i=0;i < arrPerson.length; i++) {
			arrPerson[i].show();
		}
	}

}
