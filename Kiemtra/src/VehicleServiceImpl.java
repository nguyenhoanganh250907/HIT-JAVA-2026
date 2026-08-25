import java.util.ArrayList;
import java.util.List;

public class VehicleServiceImpl implements VehicleService{
    private ArrayList<Vehicle> vehicles;

    @Override
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    @Override
    public boolean updateVehicle(String id, Vehicle newVehicle) {
        boolean check = false;
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getId().equalsIgnoreCase(id)) {
                check = true;
                vehicles.set(i, newVehicle);
                return true;
            }
        }
        if (!check) {
            System.out.println("Không tồn tại id!");
            return false;
        }
    }

    @Override
    public boolean deleteVehicle(String id) {
        boolean check = false;
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getId().equalsIgnoreCase(id)) {
                check = true;
                vehicles.remove(i);
                return true;
            }
        }
        if (!check) {
            System.out.println("Không tồn tại id!");
            return false;
        }
    }

    @Override
    public List<Vehicle> searchByName(String name) {
        List<Vehicle> result = new ArrayList<>();
        for (Vehicle i : vehicles) {
            if (i.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(i);
            }
        }
        return result;
    }

    @Override
    public void sortByPrice(boolean ascending) {
        return 0;
    }

    @Override
    public void displayAllVehicles() {
        for (Vehicle i : vehicles){
            i.displayInfo();
        }
    }
}
