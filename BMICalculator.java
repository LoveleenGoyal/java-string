import java.util.Scanner;

public class BMICalculator {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];
        
        // Taking input for 10 people
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }
        
        // Calculating BMI and status
        String[][] results = calculateBMI(data);
        
        // Displaying results
        displayResults(results);
        
        sc.close();
    }
	
    // Method to calculate BMI and determine status
    public static String[][] calculateBMI(double[][] data) {
        String[][] results = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1] / 100.0; 
            double bmi = weight / (height * height);
            String status;
            
            if (bmi <= 18.5) {
                status = "Underweight";
            } else if (bmi < 24.9) {
                status = "Normal weight";
            } else if (bmi < 39.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }
            
            results[i][0] = String.valueOf(weight);
            results[i][1] = String.valueOf(data[i][1]);
            results[i][2] = String.format("%.1f", bmi);
            results[i][3] = status;
        }
        return results;
    }

    // Method to display results in tabular format
    public static void displayResults(String[][] results) {
        System.out.println("Person\tWeight (kg)\tHeight (cm)\tBMI\tStatus");
        for (int i = 0; i < results.length; i++) {
            System.out.printf("%d\t%s\t\t%s\t\t%s\t%s\n", i + 1, results[i][0], results[i][1], results[i][2], results[i][3]);
        }
    }
}

/* 
Enter weight (kg) for person 1: 50
Enter height (cm) for person 1: 160
Enter weight (kg) for person 2: 49
Enter height (cm) for person 2: 167
Enter weight (kg) for person 3: 70
Enter height (cm) for person 3: 170
Enter weight (kg) for person 4: 68
Enter height (cm) for person 4: 169
Enter weight (kg) for person 5: 85
Enter height (cm) for person 5: 188
Enter weight (kg) for person 6: 79
Enter height (cm) for person 6: 176
Enter weight (kg) for person 7: 59
Enter height (cm) for person 7: 164
Enter weight (kg) for person 8: 90
Enter height (cm) for person 8: 162
Enter weight (kg) for person 9: 100
Enter height (cm) for person 9: 154
Enter weight (kg) for person 10: 53
Enter height (cm) for person 10: 158
Person  Weight (kg)     Height (cm)     BMI     Status
1       50.0            160.0           19.5    Normal weight
2       49.0            167.0           17.6    Underweight
3       70.0            170.0           24.2    Normal weight
4       68.0            169.0           23.8    Normal weight
5       85.0            188.0           24.0    Normal weight
6       79.0            176.0           25.5    Overweight
7       59.0            164.0           21.9    Normal weight
8       90.0            162.0           34.3    Overweight
9       100.0           154.0           42.2    Obese
10      53.0            158.0           21.2    Normal weight


 */