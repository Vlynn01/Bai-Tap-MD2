package $12_JavaCollectionFrameWork.BaiTap.LuyenTapSuDungArrayList_LinkedList_TrongJavaCollectionFramework;

import java.util.Comparator;

public class Product implements Comparable<Product>, Comparator<Product> {
    private String productName;
    private int productID;
    private int productPrice;

    public Product() {
    }

    public Product(String productName, int productID, int productPrice) {
        this.productName = productName;
        this.productID = productID;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productID=" + productID +
                ", productPrice=" + productPrice +
                '}';
    }

    @Override
    public int compareTo(Product p) {
        return this.getProductName().compareTo(p.getProductName());
    }

    @Override
    public int compare(Product p1, Product p2) {
        return p1.getProductPrice() - p2.getProductPrice();
    }
}