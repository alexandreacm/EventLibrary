package com.reactnativeeventlibrary;
import android.util.Log;
import java.io.*;

public class Employee {
  String name;
  int age;
  String designation;
  double salary;
  private static final String TAG = "MyEvent";

  // This is the constructor of the class Employee
  public Employee(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setAge(int age) {
    age = age;
  }

  public void setDesignation(String desig) {
    designation = desig;
  }

  public void setSalary(double salary) {
    salary = salary;
  }

  /* Print the Employee details */
  public void printEmployee() {
    Log.i(TAG,"Name:" + name);
    Log.i(TAG, "Age:" + age );
    Log.i(TAG, "Designation:" + designation );
    Log.i(TAG, "Salary:" + salary);
  }
}
