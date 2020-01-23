/*
 * TreeSet with Comparable.
  
 */
package setsdemo_01;

/**
 *
 * @author ajay
 */
public class Building implements Comparable<Building>{
    private String buildingName;
    private int buildingNo;

    public Building(String buildingName, int buildingNo) {
        this.buildingName = buildingName;
        this.buildingNo = buildingNo;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public int getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(int buildingNo) {
        this.buildingNo = buildingNo;
    }

    @Override
    public String toString() {
        return  buildingName + " " + buildingNo;
    }
   
    @Override
    public int compareTo(Building arg0) {
        return buildingName.compareTo(arg0.buildingName);
        //return Integer.compare(buildingNo, arg0.buildingNo);
    }

}
