package com.enterprise.service;

import java.util.List;

import com.enterprise.dto.ProductRequestDto;
import com.enterprise.dto.ProductResponseDto;

public interface ProductService {
	
	public ProductResponseDto save(ProductRequestDto productRequestDto);

	public List<ProductResponseDto> getProducts();

	public ProductResponseDto getProduct(long id);

	public List<ProductResponseDto> getProductByName(String productName);

	public List<ProductResponseDto> saveAllProducts(List<ProductRequestDto> productRequestDtos);

	public ProductResponseDto updateProductByRating(long id, double rating);

	public String deleteProduct(long id);

}
