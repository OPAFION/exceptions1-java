package cursojava;

import entities.ImportedProduct;
import entities.Product2;
import entities.UsedProduct;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramProduct2 {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        List<Product2> list = new ArrayList<>();
        
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        
		for (int i=1; i<=n; i++) {

			System.out.println("Product #" + i + " data:");

			System.out.print("Common, used or imported (c/u/i)? ");

			char type = sc.next().charAt(0);

			System.out.print("Name: ");

			sc.nextLine();

			String name = sc.nextLine();

			System.out.print("Price: ");

			double price = sc.nextDouble();

			if (type == 'c') {

				list.add(new Product2(name, price));

			}

			else if (type == 'u') {

				System.out.print("Manufacture date (DD/MM/YYYY): ");

				Date date = sdf.parse(sc.next());

				list.add(new UsedProduct(date, name, price));

			}

			else {

				System.out.print("Customs fee: ");

				double customsFee = sc.nextDouble();

				list.add(new ImportedProduct(customsFee, name, price));

			}

		}



		System.out.println();

		System.out.println("PRICE TAGS:");

		for (Product2 prod : list) {

			System.out.println(prod.priceTag());

		}

		

		sc.close();

	}

}
 

