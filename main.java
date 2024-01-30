import java.util.*;

// creating the circle class
class Circle
{
    private double radius;

    Circle(double r)
    {
        this.radius = r;
    }

    public double calculateArea(){
        double area = 3.14 * (this.radius * this.radius);
        return area;
    }
}


// creating the square class
class Square
{
    private double length;

    Square(double side){
        this.length = side;
    }

    public double calculateArea(){
        double areaSquare = this.length * this.length;
        return areaSquare;
    }
}

// main class starts here
class main
{
    public static void main(String[] args) {
        while (true) {
        // Accept user input
        System.out.println("Choose the shape to calculate the area");
        System.out.println("1: Circle");
        System.out.println("2: Square");
        System.out.println("3: Exit");
        System.out.print("Enter Your Choice:");
        Scanner option = new Scanner(System.in);
        int selected = option.nextInt();
        System.out.println(" ");

        /*
         *  1 represents the circle class and its implementation
         *  2 represents the square class and its implementation
         *  3 let user close the system
         */

         if(selected >= 4 || selected <= 0){
            System.out.println("Choice out of range");
            System.exit(0);
         }else{
        // switch through user selection
        switch (selected) {
            case 1:
                // let user enter the radius
                System.out.print("Enter radius:");
                Scanner input = new Scanner(System.in);
                double inputRadius = input.nextDouble();
                System.out.println(inputRadius);

                Circle oval = new Circle(inputRadius);
                double result = oval.calculateArea();
                System.out.println(" ");
                System.out.println("-------------------------------------------------");
                System.out.println("Area of the circle is:" + result);
                System.out.println("-------------------------------------------------");
                System.out.println(" ");
                break;

            case 2:
                // let user enter length of the square
                System.out.print("Enter Length:");
                Scanner inputSide = new Scanner(System.in);
                double inputLength = inputSide.nextDouble();
                System.out.println(inputLength);

                Square box = new Square(inputLength);
                double finalResult = box.calculateArea();
                System.out.println(" ");
                System.out.println("-------------------------------------------------");
                System.out.println("Area of the circle is:" + finalResult);
                System.out.println("-------------------------------------------------");
                System.out.println(" ");
                break;

            case 3:
                System.out.println(" ");
                System.out.println("-------------------------------------------------");
                System.out.println("User Aborted");
                System.out.println("-------------------------------------------------");
                System.out.println(" ");
                System.exit(0);
                break;
        }
    }

        
    }
}
}