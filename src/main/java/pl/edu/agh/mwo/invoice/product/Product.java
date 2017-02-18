package pl.edu.agh.mwo.invoice.product;

import java.math.BigDecimal;

public abstract class Product {
	private final String name;

	private final BigDecimal price;

	private final BigDecimal taxPercent;

	protected Product(String name, BigDecimal price, BigDecimal tax) {
		
		if(name == null || name == ""){
			throw new IllegalArgumentException("Puste imie");
		}
		if(price == null){
			throw new IllegalArgumentException("Brak ceny");
		}
		
		if(price.compareTo(BigDecimal.ZERO)<0){
			throw new IllegalArgumentException("Cena mniejsza ni¿ 0");
		}
		
		this.name = name;
		this.price = price;
		this.taxPercent = tax;
	}

	public String getName() {
		return this.name;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public BigDecimal getTaxPercent() {
		return this.taxPercent;
	}

	public BigDecimal getPriceWithTax() {
		BigDecimal taxWithPrice = price.add(price.multiply(taxPercent));
		return taxWithPrice;
	}
}
