/**
 * This class create a arraylist of split read-data.
 */
import java.util.ArrayList;

public class StationList {
	//build a instance variable of ArrayList type to store new single stations.
	private ArrayList<SingleStation> stations;
	//call the FileReader to read input data.
	FileReader readStation;
	
	//build constructor and initialize the instance variables.
	public StationList(){
		this.stations = new ArrayList<>();
		readStation = new FileReader("Station-Table.csv");
	}
	
	//This method is to read in data, convert and store it into ArrayLsit "stations".
	public void ReadInStationData(){
		//read in the ArrayList of String type and store them. 
		ArrayList<String> stationData = readStation.getLines();
		//for loop to split and store all lines.
		int station_ID= 0;
		 String station_Name =null;
		 ArrayList<Integer> go_live_date =new ArrayList<>();
		 String status =null;
		for(int m = 1; m < stationData.size();m++ ){
			//build a new array to store the split content as a array of Strings.
		   String[] aStationLine = stationData.get(m).split(",");
			//store and convert each element.
		 if(aStationLine.length == 4){
		   station_ID = Integer.parseUnsignedInt(aStationLine[0]);
		   station_Name = aStationLine[1];
       go_live_date = splitStationDate(aStationLine[2]);
		 //  splitStationDate(aStationLine[2]);
		   status = aStationLine[3];
		 }else if(aStationLine.length == 5){
			 station_ID = Integer.parseUnsignedInt(aStationLine[0]);
			   station_Name = aStationLine[1];
	       go_live_date = splitStationDate(aStationLine[3]);
	       status = aStationLine[4];
		 }
		//build a new SingleStation type object and add it to ArrayList stations.
   SingleStation aStation = new SingleStation(station_ID, station_Name,go_live_date, status);
   stations.add(aStation);
		}		
	}

		//This method is to split the time.
	public ArrayList<Integer> splitStationDate(String station_date){
		//firstly, split by"/".
		
		ArrayList<Integer> b = new ArrayList<>();
		String[] goLiveDate = station_date.split("/");
		
        int goLiveMonth = Integer.parseInt(goLiveDate[0]);
		int goLiveDay = Integer.parseInt(goLiveDate[1]);
		int goLiveYear = Integer.parseInt(goLiveDate[2]);
		//Make an ArrayList to store the time elements.
	
        b.add(goLiveMonth);
		b.add(goLiveDay);
		b.add(goLiveYear);
		
		return b;	
	}
	//getter method to get ArrayList stations.
	 public ArrayList<SingleStation> getStationData(){
		  return stations;
	  }
}
