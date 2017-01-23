/**
 * This class creates a new array list, which contains
 * all the split elements of read-in data.
 */
import java.util.ArrayList; 

public class TripList {
	
  private ArrayList<SingleTrip> tripList;
  //private SingleTrip aTrip;
  FileReader readTrip;
 
  public TripList(){
	  this.tripList = new ArrayList<SingleTrip>();
	  readTrip = new FileReader("Q3_2016_trips.csv");
  }

  public void readInLines(){
	  
	ArrayList<String> trips = readTrip.getLines();
	for (int n = 1; n < trips.size(); n++){
		
		String[] singleLine = trips.get(n).split(",");
		//split by"," and store each as a object with different types.
		int trip_id = Integer.parseUnsignedInt(singleLine[0]);
		int duration = Integer.parseUnsignedInt(singleLine[1]);
		
		//long start_time = Long.parseLong(singleLine[2].replaceAll("/", "").replaceAll(":", ""));
		
		ArrayList<Integer> start_time = splitStartTime(singleLine[2]);
		
		ArrayList<Integer> end_time = splitEndTime(singleLine[3]);
		
		//long end_time = Long.parseLong(singleLine[3].replaceAll("/", "").replaceAll(":",""));
		
		int start_station_id = Integer.parseUnsignedInt(singleLine[4]);
		double start_lat = removeN(singleLine[5]);
		
		double start_lon = removeN(singleLine[6]);
	
		int end_station_id = Integer.parseUnsignedInt(singleLine[7]);
		
	
		double end_lat =removeN(singleLine[8]);
		
		
		double end_lon = removeN(singleLine[9]);
		
		int bike_id = Integer.parseUnsignedInt(singleLine[10]);
		
		int plan_duration = Integer.parseUnsignedInt(singleLine[11]);
		
		String trip_route_category = singleLine[12];
		
		String passholder_type = singleLine[13];
		
		SingleTrip aTrip = new SingleTrip (trip_id, duration, start_time,  end_time,
				start_station_id, start_lat, start_lon,end_station_id,
				end_lat, end_lon, bike_id,  plan_duration, trip_route_category, passholder_type);
		tripList.add(aTrip); 
			
	}
	}
  
  /**
   * This is a method to split time to month, day, year, hour and minute,
   * split and convert them to integers.
   * @param start_time
   * @return
   */
  public ArrayList<Integer> splitStartTime(String start_time){
	 
		  
		  String[] splitData = start_time.split("/");
		  
		  int start_month = Integer.parseUnsignedInt(splitData[0]);
		  
		  int start_day = Integer.parseUnsignedInt(splitData[1]);
		  
		  String[] splitData1 = splitData[2].split(" ");
		  
		  int start_year = Integer.parseUnsignedInt(splitData1[0]);
		  
		  //split the rest of data:hours and minutes.
		  
		  String[] splitData2 = splitData1[1].split(":");
		  
		  //store hours and minutes separately.
		  
		  int start_hour = Integer.parseUnsignedInt(splitData2[0]);
		  
		  int start_minute = Integer.parseUnsignedInt(splitData2[1]);
		  
	    // int[] aStartDate = new int[]{start_month,start_day, start_year,start_hour,  start_minute };
		  
	     ArrayList<Integer> a = new ArrayList<>();
	     a.add(start_month);
	     a.add(start_day);
	     a.add(start_year);
	     a.add(start_hour);
	     a.add(start_minute);
	     
	     return a; 
		  
	  }
  
  /**
   * This is a method to split time to month, day, year, hour and minute,
   * split and convert them to integers.
   * @param end_time
   * @return
   */
  public ArrayList<Integer> splitEndTime(String end_time){
	  
	  String[] dataToSplit = end_time.split("/");
	  int end_month = Integer.parseUnsignedInt(dataToSplit[0]);
	  int end_day = Integer.parseUnsignedInt(dataToSplit[1]);
	  String[] dataToSplit1 = dataToSplit[2].split(" ");
	  int end_year = Integer.parseUnsignedInt(dataToSplit1[0]);
	  String[] dataToSplit2 = dataToSplit1[1].split(":");
	  int end_hour = Integer.parseUnsignedInt(dataToSplit2[0]);
	  int end_minute = Integer.parseUnsignedInt(dataToSplit2[1]);
	  
	  ArrayList<Integer> b = new ArrayList<>();
	  b.add(end_month);
      b.add(end_day);
      b.add(end_year);
      b.add(end_hour);
      b.add(end_minute);
	  
      return b;
	  
  }
  
//some lines is "\N", return 0.0 if it is \N.
  public double removeN(String lat_lon){
	  
	  double latLon;
	  
	  if(lat_lon.contains("N")){
		  latLon = 0.0;

		}else{
			latLon = Double.parseDouble(lat_lon);	
		}
	  
	  return latLon;  
  }
	
  public ArrayList<SingleTrip> getData(){
	  return tripList;
  }
  

}
