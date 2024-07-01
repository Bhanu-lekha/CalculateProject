package package1;


public class Calculator {
//Calculating the average of 3 marks
	public double findAverage(int num1, int num2, int num3) {
        double average = (num1 + num2 + num3) / 3.0;
        return Math.round(average * 100.0) / 100.0;
    }

    public static void main(String[] args) {
    	Calculator calculator = new Calculator();
        double result = calculator.findAverage(13, 9, 16);
        System.out.println(result);  
    }

}
