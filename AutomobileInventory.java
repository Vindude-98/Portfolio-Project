import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AutomobileInventory {

	public static void main(String[] args) {

		ArrayList<Automobile> inventoryList = new ArrayList<>();
		Scanner scnr = new Scanner(System.in);
		
		try {
			// Create sample automobile using parameterized constructor
			Automobile car1 = new Automobile("Jeep", "Compass", "Grey", 2024, 8000);
			inventoryList.add(car1);
			
			// Print vehicle info
			System.out.println("Listing initial vehicleL");
			String[] carInfo = car1.listVehicleInfo();
			for (String info : carInfo) {
				System.out.println(info);
			}

            // Remove vehicle and confirm action
            System.out.println("\nRemoving vehicle...");
            System.out.println(car1.removeVehicle());

            // Add a new vehicle
            System.out.println("\nAdding a new vehicle...");
            Automobile car2 = new Automobile();
            System.out.println(car2.addNewVehicle("Honda", "Civic", "Red", 2022, 5000));
            inventoryList.add(car2);

            // List new vehicle information
            System.out.println("\nListing new vehicle:");
            carInfo = car2.listVehicleInfo();
            for (String info : carInfo) {
                System.out.println(info);
            }

            // Update vehicle
            System.out.println("\nUpdating vehicle...");
            System.out.println(car2.updateVehicleAttributes("Honda", "Civic", "Black", 2023, 4000));

            // List updated vehicle information
            System.out.println("\nListing updated vehicle:");
            carInfo = car2.listVehicleInfo();
            for (String info : carInfo) {
                System.out.println(info);
            }

            // Ask user if they want to print the vehicle info to a file
            System.out.print("\nWould you like to print the vehicle information to a file? (Y/N): ");
            String response = scnr.nextLine();

            if (response.equalsIgnoreCase("Y")) {
                // Print vehicle info to file
                try {
                    File file = new File("C:\\Temp\\Autos.txt");
                    if (!file.exists()) {
                        file.getParentFile().mkdirs(); // Create directories if they don't exist
                    }
                    FileWriter writer = new FileWriter(file);

                    for (Automobile automobile : inventoryList) {
                        String[] vehicleInfo = automobile.listVehicleInfo();
                        for (String info : vehicleInfo) {
                            writer.write(info + "\n");
                        }
                        writer.write("\n------------------------\n");
                    }
                    writer.close();
                    System.out.println("Vehicle information has been written to C:\\Temp\\Autos.txt");
                } catch (IOException e) {
                    System.out.println("Error writing to file: " + e.getMessage());
                }
            } else {
                System.out.println("File will not be printed.");
            }
        } catch (Exception e) {
            System.out.println("Error in the automobile inventory: " + e.getMessage());
        } finally {
            scnr.close();
        }			
	}
		
}