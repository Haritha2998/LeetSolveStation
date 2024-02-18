class ParkingSystem {
    private int[] car_Type;
    public ParkingSystem(int big, int medium, int small) {
        car_Type = new int[]{big, medium, small};
    }
    
    public boolean addCar(int carType) {
        if(car_Type[carType-1] > 0) {
            car_Type[carType-1]--;
            return true;
        }
        else return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
