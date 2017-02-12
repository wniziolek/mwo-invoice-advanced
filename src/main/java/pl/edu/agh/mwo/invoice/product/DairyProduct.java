package pl.edu.agh.mwo.invoice.product;

import java.math.BigDecimal;

public class DairyProduct extends Product {
	public DairyProduct(String name, BigDecimal price) {
		super(name, price, new BigDecimal("0.08"));
		
		if (error.exists) {
			  throw new RuntimeException("A message that explains a casue of an exception");
			}
	}
}
