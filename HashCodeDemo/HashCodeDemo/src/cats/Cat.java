/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cats;

import java.util.Objects;

/**
 *
 * @author ajaybandi
 */
public class Cat {
    private String catName;
    private int catAge;

    public Cat(String catName, int catAge) {
        this.catName = catName;
        this.catAge = catAge;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public int getCatAge() {
        return catAge;
    }

    public void setCatAge(int catAge) {
        this.catAge = catAge;
    }

    @Override
    public String toString() {
        return "Cat{" + "catName=" + catName + ", catAge=" + catAge + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.catName);
        hash = 97 * hash + this.catAge;
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
        final Cat other = (Cat) obj;
        if (this.catAge != other.catAge) {
            return false;
        }
        if (!Objects.equals(this.catName, other.catName)) {
            return false;
        }
        return true;
    }
    
}
