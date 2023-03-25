package productManagementWithBinaryFile;

import java.io.Serializable;
import static productManagementWithBinaryFile.Main.*;

public class Product implements Serializable {
    private int productId;
    private String name;
    private String brand;
    private float price;
    private String description;

    public Product(String name, String brand, float price, String description) {
        this.productId = (product.size() == 0) ? 0 : product.getLast().getProductId() + 1;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.description = description;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return brand;
    }

    public void setBranch(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

}
