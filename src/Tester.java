/**
 * This is a tester class to call and run all the methods 
 * from SolveQuestions class, as well as print all results 
 * @author zhangxiang to user interface.
 *
 */
public class Tester{
	public static void main(String[] args) {

		//call the SolveQuestions class.
		SolveQuestions solution = new SolveQuestions();
		
		//print out answer of question 1.
		System.out.println("For quetion 1, there were "+solution.question1() +" Walk-Up trips in 2016.");
		System.out.println("\n###");
		
		System.out.println("For question 2, there were "+ solution.question2() +" stations still active.");
		System.out.println("\n###");
		//print out answer of question 3.
		System.out.printf("For quetion 3, the percentage is "+ solution.question3());
		System.out.println("\n###");
		
		//print out answer for question 4.
		System.out.printf("For quetion 4, the percentage is "+ "%.2f",solution.question4());
		System.out.println("\n###");
		
		//print put answer for question 5.
		System.out.println("For quetion 5, the bike ID of which is  "+solution.question5()+
				" has traveled the most in terms of duration.");
		System.out.println("\n###");
		
		//print out answer for question6.
	    System.out.println("For question 6, On 8/3/16 at 7:00am, "
		+solution.question6() +" bikes were being used ");
	    System.out.println("\n###");
	    
	    //print out answers for question 7.
	    System.out.println("For question 7,  the trip information "
	    		+ "for the longest trip by distance is:");
	    System.out.println("trip ID: " + solution.question7().getTrip_id());
	    System.out.println("duration: "+ solution.question7().getDuration());
	    System.out.println("start time: "+ solution.question7().getStart_time());
	    System.out.println("end time: " + solution.question7().getEnd_time());
	    System.out.println("start station ID: "+ solution.question7().getStart_station_id());
	    System.out.println("start latitude: "+ solution.question7().getStart_lat());
	    System.out.println("start longitude: " + solution.question7().getStart_lon());
	    System.out.println("end station ID: "+solution.question7().getEnd_station_id());
	    System.out.println("end latitude: "+ solution.question7().getEnd_lat());
	    System.out.println("end longitude: "+ solution.question7().getEnd_lon());
	    System.out.println("bike ID: "+solution.question7().getBike_id());
	    System.out.println("plan duration: "+solution.question7().getPlan_duration());
	    System.out.println("trip route category: "+ solution.question7().getTrip_route_category());
	    System.out.println("passholder type: "+solution.question7().getPassholder_type());
	    System.out.println("\n###");
	    
	    //print out answer for question 8.
	    System.out.println("For question8: ");
          int size = solution.question8().size();
          for (int i = 0; i < size; i++){
        	  System.out.println(solution.question8().get(i));
          }
          System.out.println("\n###");
  	    
         //print out answer for question 9.
         System.out.println("For question 9, the average duration of all the trips is: "
        			+solution.question9());
         System.out.println("\n###");
      
         //below are for extra credits
         System.out.println("Extra Credit");
       
         solution.extra1();
         System.out.println("\n###");
         
         System.out.println("The least popular end station is: "+solution.extra2() );
         System.out.println("\n###");
        
         System.out.println("There are "+solution.extra3()+" trips which plan duration is 30 travelled round-trip in 2016.");

		}

	}

