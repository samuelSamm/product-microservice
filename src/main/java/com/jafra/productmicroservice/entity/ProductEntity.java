package com.jafra.productmicroservice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document(value="product")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class ProductEntity {
	@Id
	private String id;
	private String productName;
	private String productDescription;
	private Double unitPrice;
}
