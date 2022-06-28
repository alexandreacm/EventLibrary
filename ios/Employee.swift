//
//  Employee.swift
//  Eventlib
//
//  Created by Alexandre carvalho Marques on 27/06/22.
//  Copyright © 2022 Facebook. All rights reserved.
//

import UIKit

public class Employee {
    var name: String
    var age: Int
    var designation: String
    var salary: Double
    
    init(name: String){
        self.name = name
    }

    func getName() -> String {
       return name
     }

     /* Print the Employee details */
     func printEmployee() -> (){
        print("Name: \(self.name)")
        print("Age: \(self.age)")
        print("Designation: \(self.designation)")
        print("Salary: \(self.salary)")
     }
}
