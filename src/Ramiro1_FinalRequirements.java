/**
 * this Project is for Final Requirement in OOP 
 * This code is origin by Hemerson G. Ramiro Jr.(Pogi)
 */

/**
* hello sir Ahmad this is my code for the final requirements i told you before can you judge this if this enough
* the you sent on me that you made that before was totally accept by my Prof but i try to make code ny myself for this
*/

/**
 * thanks for the help ....
 */
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import static java.util.Date.parse;



class Ramiro1_FinalRequirements{
      
private static String code;
  public void Employee(String Code)throws IOException {
       
        boolean back=false;
        BufferedReader Jamer = new BufferedReader(new InputStreamReader(System.in));
        /**
         * Entering Code is starting(Required)
         */
         
        System.out.println("Hello!! Good Day!!!");
        System.out.println("Have a Nice Day!!!");
          System.out.println("The program is Starting");
    /**
     *Condition for the enter code Statement
     */
         do{
       System.out.print("Enter employee's code : ");
        code = Jamer.readLine();
        if(code.equalsIgnoreCase("JR0001")) {
          System.out.println("#############################################################################################################");
           System.out.println("Employee Code: \"JR0001\"\nEmployee Name: \"Jose Rizal\"\nEmployee Level:\" 1\"\nEmployee Rate: \"150\"");
             System.out.println("#############################################################################################################");
                System.out.println("\t\t\t\t\t\tEntering Time:"); 
           back=true;
           
        } 
             else if (code.equalsIgnoreCase("AM0003")) {
               System.out.println("#############################################################################################################");
                 System.out.println("Employee Code: \"AM0002\"\nEmployee Name: \"Apolinario Mabini\"\nEmployee Level:\" 2\"\nEmployee Rate: \"120\"");
                     System.out.println("#############################################################################################################");
                         System.out.println("\t\t\t\t\t\tEntering Time:");
                 back=true;
        }
                  else if (code.equalsIgnoreCase("AB0002")) {
                    System.out.println("#############################################################################################################");
                       System.out.println("Employee Code: \"AB0003\"\nEmployee Name: \"Andres Bonifacio\"\nEmployee Level:\" 3\"\nEmployee Rate: \"135\"");
                           System.out.println("#############################################################################################################");
                               System.out.println("\t\t\t\t\t\tEntering Time:");
                        back=true;  

        } 
                      else if (code.equalsIgnoreCase("GS0004")) {
                       System.out.println("#############################################################################################################");
                           System.out.println("Employee Code: \"GS0004\"\nEmployee Name: \"Gabriela Sialang\"\nEmployee Level:\" 4\"\nEmployee Rate: \"120\"");
                               System.out.println("#############################################################################################################");
                                   System.out.println("\t\t\t\t\t\tEntering Time:");
                           back=true;  
        } 
                            else if (code.equalsIgnoreCase("JL0005")) {
                              System.out.println("#############################################################################################################");
                                 System.out.println("Employee Code: \"JL0005\"\nEmployee Name: \"Juan Luna\"\nEmployee Level:\" 5\"\nEmployee Rate: \"115\"");
                                     System.out.println("#############################################################################################################");
                                        System.out.println("\t\t\t\t\t\tEntering Time:");
                                 back=true;  
        } else {
            System.out.println("Invalid Code!!");
        }
        /**
        *return back if the code is not true inside the statement
        */
        }while(!(back));
/**
 *End of Entering Employee Code...
 
 */}

/**
 * starting the second method...
 */
  /**
   * Time in and Time out Field
   */
   public void Time(long Hours) throws IOException, ParseException{
       
     BufferedReader JamerPogi = new BufferedReader(new InputStreamReader(System.in));
     SimpleDateFormat format1 = new SimpleDateFormat("HH:mm");
     /**
      * use for make the inputted numbers as a Time 
      */
     

        /**
         * 
         * Monday TimeIn and TimeOut
         */
        String M1,M2;
        long t1,t2;
        System.out.println("Monday Time-in");
        M1=JamerPogi.readLine();
        System.out.println("Monday Time-out");
         M2=JamerPogi.readLine();
         Date date1=format1.parse(M1);
         Date date2=format1.parse(M2);
         //pasrsing the numbers as a time
         long diff1 = date2.getTime() - date1.getTime(); 
         
		long totalMin1 = diff1 / (60 * 1000) % 60;
		long totalHrs1 = diff1 / (60 * 60 * 1000) % 24;
		
		t1 = totalHrs1;
		t2 = totalMin1;
               
             /**
              * Tuesday TimeIn and TimeOut  
              */
             
        String T1 = null,T2 = null;
        long t3,t4;
        
        System.out.println("Tuesday Time-in");
        T1=JamerPogi.readLine();
        System.out.println("Tuesday Time-out");
         T2=JamerPogi.readLine();
         
         Date date3=format1.parse(T1);
         Date date4=format1.parse(T2);
         long diff2 = date4.getTime() - date3.getTime(); 
		long totalMin2 = diff2 / (60 * 1000) % 60;
		long totalHrs2 = diff2 / (60 * 60 * 1000) % 24;
		
		t3 = totalHrs2;
		t4 = totalMin2;
                
        /**
         * 
         * Wednesday Time in and Time out
         */
        
        String W1 = null,W2 = null;
        long t5,t6;
        
        System.out.println("WednesdayTime-in");
        W1=JamerPogi.readLine();
        System.out.println("Wednesday Time-out");
         W2=JamerPogi.readLine();
         
         Date date5=format1.parse(W1);
         Date date6=format1.parse(W2);
         long diff3 = date6.getTime() - date5.getTime(); 
		long totalMin3 = diff3 / (60 * 1000) % 60;
		long totalHrs3 = diff3 / (60 * 60 * 1000) % 24;
		
		t5 = totalHrs3;
		t6 = totalMin3;
                
                 /**
                  * Thursday Time in and Time out
                  */
        String TH1 = null,TH2 = null;
        long t7,t8;
        
        System.out.println("ThursdayTime-in");
        TH1=JamerPogi.readLine();
        System.out.println("Thursday Time-out");
         TH2=JamerPogi.readLine();
         
         Date date7=format1.parse(TH1);
         Date date8=format1.parse(TH2);
         long diff4 = date8.getTime() - date7.getTime(); 
		long totalMin4 = diff4/ (60 * 1000) % 60;
		long totalHrs4 = diff4 / (60 * 60 * 1000) % 24;
		
		t7 = totalHrs4;
		t8 = totalMin4;
            
          /**
           * Friday Time In and Time out     
           */
        String F1 = null,F2 = null;
        long t9,t10;
        
        System.out.println("FridayTime-in");
        F1=JamerPogi.readLine();
        System.out.println("Friday Time-out");
         F2=JamerPogi.readLine();
         
         Date date9=format1.parse(F1);
         Date date10=format1.parse(F2);
         long diff5 = date10.getTime() - date9.getTime(); 
		long totalMin5 = diff5/ (60 * 1000) % 60;
		long totalHrs5 = diff5 / (60 * 60 * 1000) % 24;
		
		t9 = totalHrs5;
		t10 = totalMin5;
             
                /**
                 * End of Computing weekly gross income salary
                 */
                
                
                long Minutes;
                /**
                 * Adding all the inputted time
                 */
              Hours=t1+t3+t5+t7+t9;
                Minutes=t2+t4+t6+t8+t10;
              /**
               * condition for the hours and minutes field
               */
                if(Minutes>=60){
                    Hours+=1;
                    Minutes-=60;
                }
                else if(Minutes>=120){
                    Hours=+2;
                    Minutes=-120;
                }
                else if (Minutes>=180){
                     Hours=+3;
                     Minutes=-180;
                }
                else if (Minutes>=240){
                    Hours=+4;
                    Minutes-=240;
                }
                /**
                 * end of condition
                 */
       /**
        * end of task for Time in and out
        */  
     System.out.println("The Total Work of Hours is "+Hours);
     System.out.println("The total Minutes is :"+Minutes);
      
          /**
           * condition field were able to see the elaborate finished process of Time in and out
           */
     if(code.equalsIgnoreCase("JR0001")){
         long sal=Hours*150;
          System.out.printf("Employee Code: \"JR0001\"\nEmployee Name: \"Jose Rizal\"\nEmployee Level:\" 1\"\nEmployee Rate: \"150\"\nWeekly Gross Salary Income:%d\n",sal);
      }
      else if(code.equalsIgnoreCase("AM0003")){
          long sal = Hours * 120;
             System.out.printf("Employee Code: \"AM0002\"\nEmployee Name: \"Apolinario Mabini\"\nEmployee Level:\" 2\"\nEmployee Rate: \"120\"\nWeekly Gross Salary Income:%d\n",sal);
      }
      else if(code.equalsIgnoreCase("AB0002")){
          long sal = Hours*135;
                System.out.printf("Employee Code: \"AB0003\"\nEmployee Name: \"Andres Bonifacio\"\nEmployee Level:\" 3\"\nEmployee Rate: \"135\"\nWeekly Gross Salary Income:%d\n",sal);
      }
      else if(code.equalsIgnoreCase("GS0004")){
          long sal=Hours*120;
  System.out.printf("Employee Code: \"GS0004\"\nEmployee Name: \"Gabriela Sialang\"\nEmployee Level:\" 4\"\nEmployee Rate: \"120\"\nWeekly Gross Salary Income:%d\n",sal);
   }
      else if(code.equalsIgnoreCase("JL0005")){
          long sal=Hours*115;
          System.out.printf("Employee Code: \"JL0005\"\nEmployee Name: \"Juan Luna\"\nEmployee Level:\" 5\"\nEmployee Rate: \"115\"\nWeekly Gross Salary Income:%d\n",sal);
      }
     System.out.println("See you until we meet next ! Hope this program helps you a lot!");
     
     
     /**
      *end of Program...
      */
   }
   public static void main(String args[]) throws IOException, ParseException{
       /**
        * Declaring the all methods 
        */
       /**
        * Declaring the function of Entering Code(Required)
        */
                  String Code="";
     Ramiro1_FinalRequirements EmployeeObject = new Ramiro1_FinalRequirements();
     EmployeeObject.Employee(Code);

    
     Ramiro1_FinalRequirements TimeObject  = new Ramiro1_FinalRequirements();
     long Hours=0;
     TimeObject.Time(Hours);
  /**
   * the following statements above is to declare all methods that this program had..
   */
     }
   }

