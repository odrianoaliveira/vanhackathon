package com.skipthedishes.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

/**
 * Created by adriano on 18/03/18.
 *
 * @author Adriano Oliveira
 */

@Validated
@NoArgsConstructor
@Data
public class Product {
  @ApiModelProperty(value = "the product id")
  private Long id;

  @ApiModelProperty(value = "the product store id")
  private Long storeId;

  @ApiModelProperty(value = "the product name")
  private String name;

  @ApiModelProperty(value = "the product description")
  private String description;

  @ApiModelProperty(value = "the product price")
  private Double price;
}

