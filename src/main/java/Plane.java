public class Plane {

    private PlaneType planeType;
    private int capacity;
    private int weightLimit;

    public Plane(PlaneType planeType) {
        this.planeType = planeType;
        this.capacity = planeType.getCapacity();
        this.weightLimit = planeType.getWeight();
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

     public int getCapacity() {
        return capacity;
    }

    public int getWeightLimit() {
        return weightLimit;
    }




}

