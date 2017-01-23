/**
 * This class is designed to build a new type-SingleStation,
 * as well as get information of it.
 */

import java.util.ArrayList;

public class SingleStation {
	//Here are instance variables, there are four of them.
	private int station_ID;
	private String station_Name;
	private ArrayList<Integer>go_live_date;
	private String status;
	
	//Here is the constructor,initialize the instance variables.
	public SingleStation(int station_ID, String station_Name, ArrayList<Integer> go_live_date, String status) {
		this.station_ID = station_ID;
		this.station_Name = station_Name;
		this.go_live_date = go_live_date;
		this.status = status;
	}
/**
 * getter methods for this class
 * @return value of each variable.
 */
	public int getStation_ID() {
		return station_ID;
	}

	public String getStation_Name() {
		return station_Name;
	}

	public ArrayList<Integer> getGo_live_date() {
		return go_live_date;
	}

	public String getStatus() {
		return status;
	}

}
