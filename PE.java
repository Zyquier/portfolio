import java.io.*;
import java.util.*;
/**
 *2019 Proficiency Exam
 * 
 * @Zyquier Brownridge
 * @5-3-2019
 */
public class PE
{
    static String[][] Data = new String[100][7];
    public static void main(String[] args) throws IOException{
        {
            File myFile = new File("students.txt");
            Scanner inputFile = new Scanner(myFile);
            int row = 0;
            while (inputFile.hasNext()) {
                String aLine = inputFile.nextLine();
                StringTokenizer st = new StringTokenizer(aLine,",");
                Data[row][0] = st.nextToken();
                Data[row][1] = st.nextToken();
                Data[row][2] = st.nextToken();
                Data[row][3] = st.nextToken();
                Data[row][4] = st.nextToken();
                Data[row][5] = st.nextToken();
                row++;
            }

            printTable();
            System.out.println("*******************************");
            task1();
            System.out.println("*******************************");
            task2(); 
            System.out.println("*******************************");
            findMaxTestScore();
            System.out.println("*******************************");
            findleastTestScore();
            System.out.println("*******************************");
            task();
            System.out.println("*******************************");
            task4();
        }
    }
    // Displays the information 
    public static void printTable() {
        System.out.println("Name\t\t\tAge\t\t\tGrade \t\t\tCredit_Hour\t\t\tGPA\t\t\tEmail");
        for (int row = 0; row < Data.length; row++) {
            if (Data[row][0] != null) {
                System.out.println(Data[row][0] + "\t\t\t"
                    + Data[row][1] + "\t\t\t"
                    + Data[row][2] + "\t\t\t"
                    + Data[row][3] + "\t\t\t"
                    + Data[row][4] + "\t\t\t"
                    + Data[row][5] + "\t\t\t"
                );

            }
        }
    }
    // displays the class average
    public static void task1(){     
        System.out.println("The class average:");
        double average= 0;
        for( int row=0; row<Data.length; row++){
            if(Data[row][0]!= null){   
                int test1Score=Integer.parseInt(Data[row][2]);   
                average+=test1Score/8.0;
            }   
        }
        System.out.println(average); 
    }
    // displays the academic level 
    public static void task2(){     
        System.out.println("Academic Levels:");

        for( int row=0; row<Data.length; row++){
            if(Data[row][0]!= null){   
                int aL=Integer.parseInt(Data[row][3]); 
                String name =Data[row][0]; 
                if(aL>= 90)
                    System.out.println( "This is a Senior Student: " + name); 
                if(aL>= 60 && aL<90 )
                    System.out.println( "This is a junior Student: " + name); 
                if(aL>= 30 && aL<60 )
                    System.out.println( "This is a Sophmore Student: " + name);
                if(aL< 30 )
                    System.out.println( "This is a Freshman Student: " + name);
            }   
        }

    }
    // displays the highest test score
    public static void findMaxTestScore(){
        double max = Integer.parseInt(Data[0][2]);
        String name =Data[0][0];
        for (int row = 0; row < Data.length; row++) {
            if (Data[row][0] != null) {
                if (Double.parseDouble(Data[row][2]) > max) {
                    max = Integer.parseInt(Data[row][2]);
                    name=Data[row][0];
                }
            }
        }
        System.out.println("Highest Test Grade:  ");
        System.out.println("The Highest Test Grade is: " + max+" by "+name);
    }
    // Displays the lowest test score 
    public static void findleastTestScore(){
        double max = Integer.parseInt(Data[0][2]);
        String name =Data[0][0];
        for (int row = 0; row < Data.length; row++) {
            if (Data[row][0] != null) {
                if (Double.parseDouble(Data[row][2]) < max) {
                    max = Integer.parseInt(Data[row][2]);
                    name=Data[row][0];
                }
            }
        }
        System.out.println("Lowest Test Grade: ");
        System.out.println("The Lowest Test Grade is: " + max+" by "+name);
    }
    // Seniors who could fail 
    public static void task(){     
        System.out.println("Seniors who could fail:");

        for( int row=0; row<Data.length; row++){
            if(Data[row][0]!= null){   
                int aL=Integer.parseInt(Data[row][3]); 
                String name =Data[row][0]; 
                int t =Integer.parseInt(Data[row][2]); 
                if(aL>= 90 && t<60)
                    System.out.println( "This Senior will fail the course: " + name); 

            }   
        }

    }
    // invalid emails

    public static void task4(){

        for( int row=0; row<Data.length; row++){
            String names = Data[row][0]; 

            if(Data[row][0]!= null){   
                String email = Data[row][5]; 
                for(int j =0; j<email.length();j++){
                    char c = email.charAt(j);

                    if(Character.isLetter(c) && c != '@')
                    
                    {
                             
                    } 

                }
            }
        }

    }
}
