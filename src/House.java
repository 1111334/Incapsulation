public class House {

    private int floorsNumber;
    private String address;
    private String[] residentsNames;

    // Getter methods
    public int getFloorsNumber() {
        return floorsNumber;
    }

    public String getAddress() {
        return address;
    }

    public String[] getResidentsNames() {
        return residentsNames;
    }

    // Setter methods
    public void setFloorsNumber(int floorsNumber) {
        this.floorsNumber = floorsNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setResidentsNames(String[] residentsNames) {
        this.residentsNames = residentsNames;
    }

}
