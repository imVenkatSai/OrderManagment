package com.enterprise.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.enterprise.dto.OrderRequestDTO;
import com.enterprise.dto.OrderResponseDTO;

public interface OrderService {
	
	public OrderResponseDTO placeOrder(List<OrderRequestDTO> orderRequestDTOList);

	public ResponseEntity<OrderResponseDTO> getOrderInfo(long orderId);

	public ResponseEntity<Void> cancelItem(long orderItemId);
}
