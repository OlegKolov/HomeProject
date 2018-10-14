package homeProject1.com.company.details;

import java.util.*;
import java.lang.*;
import java.io.*;

import homeProject1.com.company.vehicles.Engine;
import homeProject1.com.company.profession.Driver;

public class Car {
    public static void main(String[] args) {
        Engine engine = new Engine();
	Driver driver = new Driver();
        System.out.println("I'm driving!");
	for(String str:args){
	System.out.println("znach " + Arrays.asList(args).indexOf(str) + " = " + str);
	}
    }
}