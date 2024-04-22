Graphic Package
------------------

rectangle.java
------------------
package Graphic;
public class rectangle {
 private double length;
 private double width;
 public rectangle(double len, double wid) {
 length = len;
 width = wid;
 }
 public double calculateArea() {
 return length * width;
 }
}

Triangle.java
--------------
package Graphic;
public class Triangle {
 private double base;
 private double height;
 public Triangle(double b, double h) {
 base = b;
 height = h;
 }
 public double calculateArea() {
 return 0.5 * base * height;
 }
}

Square.java
--------------
package Graphic;
public class Square {
 private double side;
 public Square(double s) {
 side = s;
 }
 public double calculateArea() {
 return side * side;
 }
}

Circle.java
----------------
package Graphic;
public class Circle {
 private double radius;
 public Circle(double r) {
 radius = r;
 }
 public double calculateArea() {
 return Math.PI * radius * radius;
 }
}

TestShape.java
------------------

import Graphic.rectangle;
import Graphic.Triangle;
import Graphic.Square;
import Graphic.Circle;
public class TestShapes {
 public static void main(String[] args) {
 
 rectangle rectangle = new rectangle(5, 3);
 Triangle triangle = new Triangle(4, 6);
 Square square = new Square(4);
 Circle circle = new Circle(3);
 System.out.println("Area of Rectangle: " + rectangle.calculateArea());
 System.out.println("Area of Triangle: " + triangle.calculateArea());
 System.out.println("Area of Square: " + square.calculateArea());
 System.out.println("Area of Circle: " + circle.calculateArea());
 }
}



                   output
--------------------------------------------
C:\Users\mlm\.jdks\openjdk-21.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.3\lib\idea_rt.jar=60734:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\mlm\IdeaProjects\j2\out\production\j2 TestShapes
Area of Rectangle: 15.0
Area of Triangle: 12.0
Area of Square: 16.0
Area of Circle: 28.274333882308138

Process finished with exit code 0
==============================================================






steps to do it
=======================
1)Open IntelliJ IDEA: Launch IntelliJ IDEA on your computer.

2)Create a New Project: If you haven't already created a project, you can do so by selecting "File" > "New" > "Project". Choose the type of project you want to create (e.g., Java, Kotlin, etc.), and follow the prompts to set up your project.

3)Create a New Package:

In the Project tool window on the left side of the screen, right-click on the source directory (usually named "src").
Select "New" > "Package" from the context menu.
Enter the name of your package (e.g., "com.example.myproject").
Press Enter to create the package.
Add Classes to the Package:

Right-click on the newly created package.
Select "New" > "Java Class" or "Kotlin File/Class" depending on your project type.
Enter the name of the class you want to create.
Press Enter to create the class.
Organize Classes Within the Package: You can continue adding more classes to the package by repeating the steps above. Organize your classes logically within the package structure.

Add Code to Your Classes: Double-click on the class files to open them in the editor and start writing your code.

(Optional) Configure Dependencies: If your package requires external libraries or dependencies, you can add them to your project's build configuration. This typically involves modifying the build.gradle or pom.xml file depending on whether you're using Gradle or Maven as your build system.

Build and Run Your Project: Once you've written your code, you can build and run your project to test it. Use the options available in IntelliJ IDEA's toolbar or use keyboard shortcuts to build and run your code.
