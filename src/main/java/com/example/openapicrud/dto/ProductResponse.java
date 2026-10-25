package com.example.openapicrud.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Schema(description = "Product response")
public class ProductResponse {

    @Schema(description = "Product ID", example = "1")
    private Long id;

    @Schema(description = "Product name", example = "iPhone 16")
    private String name;

    @Schema(description = "Product description", example = "Latest Apple smartphone")
    private String description;

    @Schema(description = "Product price", example = "999.99")
    private Double price;

    @Schema(description = "Available quantity", example = "50")
    private Integer quantity;
}
