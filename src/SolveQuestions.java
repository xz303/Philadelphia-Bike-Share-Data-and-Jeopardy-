/**
 * This is a class to write methods to
 * find out the answers for questions.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

	public class SolveQuestions {

		/**
		 * This is a method to find out answer for question 1.
		 * @return A for-loop is used.
		 */
		public int question1(){
			TripList list1 = new TripList();
			list1.readInLines();
			ArrayList<SingleTrip> data1 = list1.getData();
			int count = 0;
			for (int i = 0; i < data1.size(); i++){
				SingleTrip trip1 = data1.get(i);
				String s = trip1.getPassholder_type();
				if (s.equals("Walk-up")){
					count++;
				}
			}
			return count;	
		}
		
		/**
		 * This is a method for question 2.
		 * @return a for-loop is used.
		 */
		public int question2(){
		StationList list2 = new StationList();
		list2.ReadInStationData();
		ArrayList<SingleStation> data2 = list2.getStationData();
		int count2 = 0;
		for(int e = 0; e<data2.size();e++){
			SingleStation station = data2.get(e);
			ArrayList<Integer> c = station.getGo_live_date();
			int d = c.get(2);
			String r = station.getStatus();
			if(d == 2015 && r.equals("Active")){
				count2++;
			}
		}
		return count2;
		}
		/**
		 * This is a method for question 3.
		 * @return a for-loop is used.
		 */
		public float question3(){
			TripList list3 = new TripList();
			list3.readInLines();
			ArrayList<SingleTrip> data = list3.getData();
			double count3 = 0;
			for (int k = 0; k< data.size(); k++){
				SingleTrip trip3 = data.get(k);
				int l = trip3.getStart_station_id();
				if (l == 3023){
					count3++;
				}
			}
			float percentage = (float)(count3/list3.getData().size())*100;
		
			return percentage;
		}
		/**
		 * This is a method for question 4.
		 * @return a for-loop is used.
		 */
		
		public double question4(){
			TripList list4 = new TripList();
			list4.readInLines();
			ArrayList<SingleTrip> data = list4.getData();
			int count4 = 0;
			for (int m = 0; m < data.size(); m++){
				SingleTrip trip4 = data.get(m);
				String route= trip4.getTrip_route_category();
				String pass = trip4.getPassholder_type();
				if (route.equals("Round Trip") && pass.equals("Indego30")){
					count4++;
				}
			}
			double percentage4 = (double) count4/list4.getData().size();
			return  percentage4;
		}
		/**
		 * This is a method for question 5.
		 * @return hashmap is used here.
		 */
		
		public int question5(){
			TripList list5 = new TripList();
			list5.readInLines();
			ArrayList<SingleTrip> data = list5.getData();
			
			HashMap<Integer, ArrayList<Integer>> idDuration = new HashMap<> ();
			for (int n = 0; n < data.size(); n++){
				int id = data.get(n).getBike_id();
				int duration = data.get(n).getDuration();
				if (!idDuration.containsKey(id)){
					ArrayList<Integer> durations = new ArrayList<>();
					durations.add(duration);
					idDuration.put(id, durations);
				}else if(idDuration.containsKey(id)){
					
					idDuration.get(id).add(duration);
				}
			}
			HashMap<Integer, Integer> idSum = new HashMap<> ();
			for(int id:idDuration.keySet()){
				
				ArrayList <Integer> durationData = idDuration.get(id);
				int sum = 0;
				for(int h=0; h<durationData.size(); h++){
					
					sum =sum+durationData.get(h);
				}
				idSum.put(id, sum);
				
			}
			int max = 0;
			int idOfMax = 0;
			
			for(int id:idSum.keySet()){
				
				if(idSum.get(id)>max){
					max = idSum.get(id);
					idOfMax = id;
				}		
			}
			return idOfMax;
		}
		/**
		 * This is a method for question 6.
		 * @return a for-loop is used.
		 */
		
		public int question6(){
			TripList list6 = new TripList();
			list6.readInLines();
			ArrayList<SingleTrip> data = list6.getData();
			int count6 = 0;
			for (int x = 0; x < data.size(); x++){
				SingleTrip trip6 = data.get(x);	
				int month1 = trip6.getStart_time().get(0);
				int day1 = trip6.getStart_time().get(1);
				int year1 = trip6.getStart_time().get(2);
				
				int hour1 = trip6.getStart_time().get(3);
				
				int minute1 = trip6.getStart_time().get(4);
				
				int month2 = trip6.getEnd_time().get(0);
				
				int day2 = trip6.getEnd_time().get(1);
				
				int year2 = trip6.getEnd_time().get(2);
				int hour2 = trip6.getEnd_time().get(3);
				int minute2 = trip6.getEnd_time().get(4);
				
				double time1 = hour1 + (double) minute1/60;
				double time2 = hour2 + (double) minute2/60;
			
				if(month1== 8 && day1 == 3 && 
						year1 == 2016 && month2 == 8 && day2 == 3 
						&& year2 == 2016 && time1 <= 7.0 && time2>=7.0 ){
					count6 ++;	
				}		
			}
			return count6;	
		}
		/**
		 * This is a method for question 7.
		 * @return a for-loop is used.
		 */
		public SingleTrip question7(){
			TripList list7 = new TripList();
			list7.readInLines();
			ArrayList<SingleTrip> data = list7.getData();
			double distance;
			double max = 0.0;
			SingleTrip trip = null;
			for (int x = 0; x < data.size(); x++){
				SingleTrip trip7 =data.get(x);
				double startLat = trip7.getStart_lat();
				double startLon = trip7.getStart_lon();
				double endLat = trip7.getEnd_lat();
				double endLon = trip7.getEnd_lon();
				double powerStart = Math.pow((endLat- startLat),2.0 );
				double powerEnd = Math.pow((endLon - startLon), 2.0);
				if(startLat!=0 && endLon != 0 && endLat != 0 && endLon != 0){
				distance = Math.sqrt((powerStart + powerEnd));
				} else {
					distance = 0;
				}
				if(distance > max){
					max = distance;
					trip = trip7;	
				}
			}	
			return trip;
				}
		
		
		
		public boolean onlyStation(SingleStation s){
			StationList stations = new StationList();
			stations.ReadInStationData();
			ArrayList<SingleStation> stationData = stations.getStationData();
			
			boolean onlyOneStation = true;
			int month = s.getGo_live_date().get(0);
			int day = s.getGo_live_date().get(1);
			int year = s.getGo_live_date().get(2);
			
			int count9 = 0;
			for(int h =0; h<stationData.size(); h++){
				
				if(stationData.get(h).getGo_live_date().get(0)==month &&
						stationData.get(h).getGo_live_date().get(1)==day	&&
						stationData.get(h).getGo_live_date().get(2)==year){
				
				count9++;
			}
			
			if(count9 == 1){
				onlyOneStation = true;
			}else{
				onlyOneStation = false;
			}
			
		}
			return onlyOneStation;
		}
		/**
		 * This is a method for question 8.
		 * @return a for-loop is used.
		 */
		
		public ArrayList<Integer> question8(){
			ArrayList<Integer>tripIds = new ArrayList<Integer>();
			StationList stations = new StationList();
			stations.ReadInStationData();
			ArrayList<SingleStation> stationData = stations.getStationData();
			
			
			TripList list = new TripList();
			list.readInLines();
			ArrayList<SingleTrip> data = list.getData();
			
			ArrayList<Integer> ids = new ArrayList<>();
			
			for(int r = 0; r < stationData.size(); r++){
				
				SingleStation sta = stationData.get(r);		
       	if(onlyStation(sta)){
     	         
       		ids.add(sta.getStation_ID());
       	}
				
			}
		for(int j =0; j < data.size();j++){
			
			SingleTrip trip = data.get(j);
			
			int starID = trip.getStart_station_id();
			int endID =trip.getEnd_station_id();
			
			for(int u =0; u<ids.size(); u++){
				if(starID== ids.get(u) ||endID==ids.get(u) ){
					
					tripIds.add(trip.getTrip_id());
				}

		           
			}
		}
		return tripIds;
			
		}
		
//Question 9: what is the average duration of all the trips?

	   public float question9(){
		   TripList list9= new TripList();
			list9.readInLines();
			ArrayList<SingleTrip> data9 = list9.getData();
			int sum9 = 0;
			for (int x = 0; x < data9.size(); x++){
				SingleTrip trip9 = data9.get(x);
				int duration9 = trip9.getDuration();
			    sum9 = sum9 + duration9;   
	   }
			float average = sum9/data9.size();
			return average;
			}
	   
	   
	// Extra credit 1
	   public void extra1(){
		   TripList list11 = new TripList();
		   list11.readInLines();
		   ArrayList<SingleTrip> data = list11.getData();
		   HashMap<Integer, ArrayList<Double>> positions = new HashMap<>();
		   for (int i = 0; i < data.size(); i++){
			   SingleTrip trip = data.get(i);
			   if (!positions.containsKey(trip.getStart_station_id())){
				   ArrayList<Double> position = new ArrayList<>();
				   position.add(trip.getStart_lat());
				   position.add(trip.getStart_lon());
				   positions.put(trip.getStart_station_id(), position);
			   }
		   }
		   
		   ArrayList<ArrayList<Integer>> pairs = new ArrayList<>();
		   Set<Integer> stationID = positions.keySet();
		   for(int id1 : stationID){
			   for (int id2 : stationID){
				   if (id1 == id2) continue;
				   ArrayList<Double> trip1 = positions.get(id1);
				   ArrayList<Double> trip2 = positions.get(id2);
				   double trip1lat = trip1.get(0);
				   double trip2lat = trip2.get(0);
				   double trip1lon = trip1.get(1);
				   double trip2lon = trip2.get(1);
				   
				   double diffLat = Math.abs(trip1lat - trip2lat);
				   double diffLon = Math.abs(trip1lon - trip2lon);
				   double avgDiff = (diffLat + diffLon) / 2;
				   if (avgDiff < 0.02){
					   ArrayList<Integer> pair = new ArrayList<Integer>();
					   pair.add(id1);
					   pair.add(id2);
					   if (!pairs.contains(pair)){
						   pairs.add(pair);
					   }
				   }
			   }
		   }
		   System.out.println("The size of pairs is: " + pairs.size());
		   System.out.println("Pairs are: "+pairs);
	   }
		
	//Extra credit 2
	   
	   public int extra2(){
			TripList list10 = new TripList();
			list10.readInLines();
			ArrayList<SingleTrip> data = list10.getData();
			
			HashMap<Integer, Integer> frequency = new HashMap<> ();
			for (int n = 0; n < data.size(); n++){				
				int id = data.get(n).getEnd_station_id();
				if (!frequency.containsKey(id)){
					frequency.put(id, 1);
				}else if(frequency.containsKey(id)){
					int count = frequency.get(id);
					frequency.put(id, count + 1);
				}
			}
			int min = Integer.MAX_VALUE;
			int idOfMin = 0;
			
			for(int id : frequency.keySet()){
				if(frequency.get(id) < min){
					min = frequency.get(id);
					idOfMin = id;
				}
			}
			return idOfMin;
		}
	   
	 //Extra credit 3
	//Question: how many trips which plan duration is 30 travelled round-trip in 2016?
	   
	   public int extra3(){
			TripList list = new TripList();
			list.readInLines();
			ArrayList<SingleTrip> data = list.getData();
			int count = 0;
			for (int m = 0; m < data.size(); m++){
				SingleTrip trip = data.get(m);
				int duration = trip.getPlan_duration();
				String route= trip.getTrip_route_category();
				int startYear = trip.getStart_time().get(2);
				int endYear = trip.getEnd_time().get(2);
				
				if (route.equals("Round Trip") && duration == 30 && startYear == 2016 && endYear == 2016){
					count++;
				}
			}
			return  count;
		}
	   

}
