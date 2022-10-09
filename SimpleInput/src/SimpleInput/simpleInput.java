/*
Mosammad Kabir
CUS 1115
Professor DeBello
2/11/2021
 */

package SimpleInput;

import java.util.Scanner;//step 1
public class simpleInput
{
    public static void main(String[] args)
    {
        Scanner kb=new Scanner(System.in);//step 2
        System.out.print("Enter your id number as an integer value:");//step 3
        int id=kb.nextInt();//step 4 as an integer variable

        System.out.print("Enter your GPA:");//step 3
        double gpa=kb.nextDouble();//Step 4 as a double

        System.out.println("ID/t/tGPA");
        System.out.println(id+"\t\t"+gpa);

//lets add to this project
//create an integer called x and another integer called y
//ask the user to interactively type in the 2 integer values of x and y
//create the formula for the sum of x and y and difference of x and y
//output the sum and difference/

        int x; //x declared as an integer
        int y;// y declared as an integer

        System.out.print("Enter an integer value for x:");
        x=kb.nextInt();// since we declared x above we just put the assignment statement
        System.out.print("Enter an integer value for y:");
        y=kb.nextInt();//assignment statement for y

//now that we have integer values stored in x and y, we can create any formula we want
        int sum=x+y;
        int difference=x-y;
        System.out.println("The sum of "+x+" and "+y+" is "+sum);
        System.out.println("The difference of "+x+" and "+y+" is "+difference);

/*
Enter your id number as an integer value:1234
Enter your GPA:4.0
1234		4.0
Enter an integer value for x:5
Enter an integer value for y:2
The sum of 5 and 2 is 7
The difference of 5 and 2 is 3
*/
    }
}