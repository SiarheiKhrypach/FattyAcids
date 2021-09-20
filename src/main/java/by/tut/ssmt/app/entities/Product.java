package by.tut.ssmt.app.entities;

public class Product {

    private String name;
    private int omegaThree;
    private int omegaSix;
    private int portionNumber;

    public Product(String name, int omegaThree, int omegaSix, int portionNumber) {
        this.name = name;
        this.omegaThree = omegaThree;
        this.omegaSix = omegaSix;
        this.portionNumber = portionNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOmegaThree() {
        return omegaThree;
    }

    public void setOmegaThree(int omegaThree) {
        this.omegaThree = omegaThree;
    }

    public int getOmegaSix() {
        return omegaSix;
    }

    public void setOmegaSix(int omegaSix) {
        this.omegaSix = omegaSix;
    }

    public int getPortionNumber() {
        return portionNumber;
    }

    public void setPortionNumber(int portionNumber) {
        this.portionNumber = portionNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (omegaThree != product.omegaThree) return false;
        if (omegaSix != product.omegaSix) return false;
        if (portionNumber != product.portionNumber) return false;
        return name != null ? name.equals(product.name) : product.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + omegaThree;
        result = 31 * result + omegaSix;
        result = 31 * result + portionNumber;
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", omegaThree='" + omegaThree + '\'' +
                ", omegaSix='" + omegaSix + '\'' +
                ", portionNumber=" + portionNumber +
                '}';
    }
}
