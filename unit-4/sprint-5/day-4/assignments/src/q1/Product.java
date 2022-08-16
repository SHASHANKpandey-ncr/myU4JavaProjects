package q1;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

import q2.Employee;

public class Product {

	private int productId;
	private String productName;
	private double productPrice;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	
	public Product(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]"+"\n";
	}
	
}

class ProductPriceComp implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		if(p1.getProductPrice()>p2.getProductPrice())return 1;
		else if(p1.getProductPrice()<p2.getProductPrice())return -1;
		else return p1.getProductName().compareTo(p2.getProductName());
	}
	
}

class ProductNameComp implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		 return p1.getProductName().compareTo(p2.getProductName());
	}
	
}

class ProductIdComp implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		if(p1.getProductId()>p2.getProductId())return 1;
		else if(p1.getProductId()<p2.getProductId())return -1;
		else return p1.getProductName().compareTo(p2.getProductName());
	}
	
}


class Main{
		public static void main(String[] args) {
			
			
			System.out.println("Enter your sorting choice : ");
			System.out.println(" 1 for sorting the product according to the productPrice");
			System.out.println(" 2 for sorting the product according to the productName");
			System.out.println(" 3 for sorting the product according to the productId ");
			
			
			
			Scanner s=new Scanner(System.in);
			String choice=s.nextLine();
			
			if(choice.equals("1")) {
				TreeSet<Product> ts=new TreeSet<>(new ProductPriceComp());
				int i=0;
				while(true) {
					System.out.println("Product "+(i+1)+" details: ");
					
					System.out.println("Enter productId");
					Scanner sc=new Scanner(System.in);
					int proId=sc.nextInt();
					
					System.out.println("Enter productName");
					Scanner sc1=new Scanner(System.in);
					String proName=sc1.nextLine();
					
					System.out.println("Enter productPrice");
					Scanner sc2=new Scanner(System.in);
					double price=sc2.nextDouble();
					
					System.out.println("Product "+(i+1)+" details done ");
					System.out.println("Want to add more Products ?? (y/n) : ");
					ts.add(new Product(proId, proName, price));i++;
					Scanner sc3=new Scanner(System.in);
					if(sc3.nextLine().equalsIgnoreCase("n")) {break;}
					
				}
				System.out.println(ts);
			}
			else if (choice.equals("2")) {
				TreeSet<Product> ts=new TreeSet<>(new ProductNameComp());
				int i=0;
				while(true) {
					System.out.println("Product "+(i+1)+" details: ");
					
					System.out.println("Enter productId");
					Scanner sc=new Scanner(System.in);
					int proId=sc.nextInt();
					
					System.out.println("Enter productName");
					Scanner sc1=new Scanner(System.in);
					String proName=sc1.nextLine();
					
					System.out.println("Enter productPrice");
					Scanner sc2=new Scanner(System.in);
					double price=sc2.nextDouble();
					
					System.out.println("Product "+(i+1)+" details done ");
					System.out.println("Want to add more Products ?? (y/n) : ");
					ts.add(new Product(proId, proName, price));i++;
					Scanner sc3=new Scanner(System.in);
					if(sc3.nextLine().equalsIgnoreCase("n")) {break;}
					
				}
				System.out.println(ts);
			}
			else if (choice.equals("3")) {
				TreeSet<Product> ts=new TreeSet<>(new ProductIdComp());
				int i=0;
				while(true) {
					System.out.println("Product "+(i+1)+" details: ");
					
					System.out.println("Enter productId");
					Scanner sc=new Scanner(System.in);
					int proId=sc.nextInt();
					
					System.out.println("Enter productName");
					Scanner sc1=new Scanner(System.in);
					String proName=sc1.nextLine();
					
					System.out.println("Enter productPrice");
					Scanner sc2=new Scanner(System.in);
					double price=sc2.nextDouble();
					
					System.out.println("Product "+(i+1)+" details done ");
					System.out.println("Want to add more Products ?? (y/n) : ");
					ts.add(new Product(proId, proName, price));i++;
					Scanner sc3=new Scanner(System.in);
					if(sc3.nextLine().equalsIgnoreCase("n")) {break;}
					
				}
				System.out.println(ts);
			}
			else {
				TreeSet<Product> ts=new TreeSet<>(new ProductIdComp());
				int i=0;
				while(true) {
					System.out.println("Product "+(i+1)+" details: ");
					
					System.out.println("Enter productId");
					Scanner sc=new Scanner(System.in);
					int proId=sc.nextInt();
					
					System.out.println("Enter productName");
					Scanner sc1=new Scanner(System.in);
					String proName=sc1.nextLine();
					
					System.out.println("Enter productPrice");
					Scanner sc2=new Scanner(System.in);
					double price=sc2.nextDouble();
					
					System.out.println("Product "+(i+1)+" details done ");
					System.out.println("Want to add more Products ?? (y/n) : ");
					ts.add(new Product(proId, proName, price));i++;
					Scanner sc3=new Scanner(System.in);
					if(sc3.nextLine().equalsIgnoreCase("n")) {break;}
					
				}
				System.out.println(ts);
			}
			
			
		}
}












