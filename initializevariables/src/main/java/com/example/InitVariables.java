package com.example;

public class InitVariables {

    //Class variables
    byte myByte;
    short myShort;
    int myInt;
    long myLong;
    float myFloat;
    double myDouble;
    boolean myBoolean;
    char myChar;

    public static void main(String[] args){

        System.out.println("Inside of InitVariables");
        //Create a new object in order to call methods within static context
        InitVariables run = new InitVariables();
        //Call method to initialize variables
        run.initializeHomeworkVariables();
        //Call method to print to terminal
        run.printToTerminal();


    }
    //Method initializes class variables with values
    public void initializeHomeworkVariables(){

        myByte = 127;      //byte holds a value between -128 and 127
        myShort = 12000;  //short holds a value between -32,768 and 32,767
        myInt = 300;        //int holds a value between -2^31 and 2^31-1
        myLong = 5000L;     //long holds a value between -2^63 and 2^63-1
        myFloat = 12.03f; //float holds decimal values and uses less memory than double
        myDouble = 3.141592653589793238d;  //double holds longer decimals than float
        myBoolean = true;      //boolean holds either 'true' or 'false'
        myChar = 'a';      //char holds a single unicode character
    }
    //Method prints all class variables to terminal
    public void printToTerminal(){
        System.out.println("Byte variable: " + myByte);
        System.out.println("Short variable: " + myShort);
        System.out.println("Int variable: " + myInt);
        System.out.println("Long variable: " + myLong);
        System.out.println("Float variable: " + myFloat);
        System.out.println("Double variable: " + myDouble);
        System.out.println("Boolean variable: " + myBoolean);
        System.out.println("Char variable: " + myChar);
    }
}
