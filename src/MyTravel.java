import java.nio.file.Path;
import java.nio.file.Paths;

public class MyTravel {

	Travel myTravel[]; 

	public static void main(String[] args) {
		MyTravel my = new MyTravel();
		my.init();
		my.print();
	}
	
	void init() {	
		String line;
		int index=0;
		int numberTravel=0;
		
//		ReadTextFile f = new ReadTextFile("travel.txt");
//
//		f.open();

		Path path = Paths.get("travel.txt");
		ReadTextFile f = new ReadTextFile(path.toAbsolutePath().toString());

		f.open();

		if ((line = f.readline()) != null) { // total entries
			numberTravel = Integer.parseInt(line);
		}		
		
		myTravel = new Travel[numberTravel];
		
		while ((line = f.readline()) != null) {
			String[] info = line.split(",");
			if (info[0].equals("Air"))
				myTravel[index++] = new AirTravel(info[0], info[1],info[2],info[3],info[4],Integer.parseInt(info[5]),info[6],info[7],info[8],Double.parseDouble(info[9]),Integer.parseInt(info[10]));
			else
				myTravel[index++] = new LandTravel(info[0],info[1],info[2],info[3],info[4],Integer.parseInt(info[5]),info[6],Double.parseDouble(info[7]),Integer.parseInt(info[8]),info[9]);
	 	}
	} 
	void print() {
		System.out.print("Travel Details");
		System.out.println("\n");


		int totalAirMileage = 0;
		int totalLandMileage = 0;
		double totalCost = 0;
		int totalDays = 0;

		for(Travel travel : myTravel) {
			travel.print();

			if(travel.travelType.equals("Air")){
				totalAirMileage += travel.travelMileage;
			}

			else if(travel.travelType.equals("Land")){
				totalLandMileage += travel.travelMileage;
			}

			totalCost += travel.cost;
			totalDays += travel.days;

		}
		System.out.println("Total Days: " + totalDays);
		System.out.println("Total Cost: " + "$" + totalCost);
		System.out.println("Total Travel Air Mileage: " + totalAirMileage);
		System.out.println("Total Travel Land Mileage: " + totalLandMileage);





	}
}