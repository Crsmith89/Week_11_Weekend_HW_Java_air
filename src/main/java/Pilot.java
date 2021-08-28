public class Pilot extends CabinCrewMember {

    private String licenceNum;

    public Pilot(String name, Rank rank, String licenceNum) {
        super(name, rank);
        this.licenceNum = licenceNum;
    }

    public String getLicenceNumber() {
        return licenceNum;
    }

    public void setLicenceNum(String licenceNum) {
        this.licenceNum = licenceNum;
    }
    public String flyPlane(){
        return "This is your pilot";
    }
}
