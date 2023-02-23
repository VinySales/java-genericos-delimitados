package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;
import service.CalculationService;

public class Main {
	
	public static void main(String[] args) {
		
		String path = "C:\\temp\\test.txt";
		List<Product> p = new ArrayList<Product>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			
			while (line != null) {
				String[] fields = line.split(",");
				
				p.add(new Product(fields[0], Double.parseDouble(fields[1])));
				
				line = br.readLine();
			}
			
			System.out.println("Produtos:");
			
			for (Product product : p) {
				System.out.println(product.toString());
			}
			
			System.out.println();
			System.out.println("Produto mais caro:");
			System.out.println(CalculationService.max(p));
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}
