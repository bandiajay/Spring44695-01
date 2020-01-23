/*
 * HashSet with equals() and hashcode() methods. No need
 * of comparable interface.
 * 
 */
package hashSetDemo;

import java.util.Objects;

/**
 *
 * @author ajay
 */
public class Building{
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
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.buildingName);
        hash = 31 * hash + this.buildingNo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Building other = (Building) obj;
        if (this.buildingNo != other.buildingNo) {
            return false;
        }
        if (!Objects.equals(this.buildingName, other.buildingName)) {
            return false;
        }
        return true;
    }
 
}
