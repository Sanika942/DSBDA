object greatestnumber {
    def main(args: Array[String])={
        // Define three numbers
        var num1 = 10;
        var num2 = 25;
        var num3 = 15;
        
        // Find the greatest number
        var greatest = if (num1 >= num2 && num1 >= num3) {
        num1;
        } else if (num2 >= num1 && num2 >= num3) {
        num2;
        } else {
        num3;
        }
    
        // Print the result
        println(s"The greatest number among $num1, $num2, and $num3 is: $greatest");
    }
}
