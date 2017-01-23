/**
 * This class is for building a new type of SingleTrip,
 * as well as get the information.
 */

import java.util.ArrayList;
public class SingleTrip {
	/**
	 * instance variables, which are
	 *  all elements a single trip should have.
	 */
	private int trip_id;
	private int duration;
	private ArrayList<Integer> start_time;
	private ArrayList<Integer> end_time;
	private int start_station_id;
	private double start_lat; 
	private double start_lon;
	private int end_station_id;
	private double end_lat;
	private double end_lon;
	private int bike_id;
	private int plan_duration;
    private String trip_route_category;
    private String passholder_type;
    
   //This is the constructor of this class.
    public SingleTrip(int trip_id,int duration, ArrayList<Integer> start_time, 
    		ArrayList<Integer> end_time,  int start_station_id, double start_lat, double start_lon,
    		int end_station_id, double end_lat, double end_lon, int bike_id,  int plan_duration, 
    		String trip_route_category, String passholder_type  ){
    	//initialize the instance variables.
    	this.trip_id = trip_id;
    	this.duration = duration;
    	this.start_time =  start_time;
    	this.end_time = end_time;
    	this.start_station_id = start_station_id;
    	this.start_lat = start_lat;
    	this.start_lon = start_lon;
    	this.end_station_id = end_station_id;
    	this.end_lat = end_lat;
    	this.end_lon = end_lon;
    	this.bike_id = bike_id;
    	this.plan_duration = plan_duration;
    	this.plan_duration = plan_duration;
    	this.trip_route_category = trip_route_category;
    	this.passholder_type = passholder_type;
    }

    /**
     * getter methods
     * @return value of each variable.
     */
	public int getTrip_id() {
		return trip_id;
	}

	public int getDuration() {
		return duration;
	}

	public ArrayList<Integer> getStart_time() {
		return start_time;
	}

	public ArrayList<Integer> getEnd_time() {
		return end_time;
	}

	public int getStart_station_id() {
		return start_station_id;
	}

	public double getStart_lat() {
		return start_lat;
	}
	
	public double getStart_lon() {
		return start_lon;
	}

	public int getEnd_station_id() {
		return end_station_id;
	}
	
	public double getEnd_lat() {
		return end_lat;
	}

	public double getEnd_lon() {
		return end_lon;
	}


	public int getBike_id() {
		return bike_id;
	}

	public int getPlan_duration() {
		return plan_duration;
	}

	public String getTrip_route_category() {
		return trip_route_category;
	}

	public String getPassholder_type() {
		return passholder_type;
	}
}
