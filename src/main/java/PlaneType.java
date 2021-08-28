public enum PlaneType {

    BOEING747(400, 138500),
    BOEING777(450, 150000),
    AIRBUSA380(853, 574000),
    GULFSTREAMG550(20, 21000);



    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }


}

