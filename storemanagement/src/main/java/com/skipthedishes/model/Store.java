package com.skipthedishes.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

/**
 * Created by adriano on 18/03/18.
 *
 * @author Adriano Oliveira
 */

@Validated
@NoArgsConstructor
@Data
@Document
public class Store {
    @ApiModelProperty(value = "the store id")
    @Id
    private String id;

    @ApiModelProperty(value = "the store name")
    @NotEmpty
    private String name;

    @ApiModelProperty(value = "the store address")
    @NotEmpty
    private String address;

    @ApiModelProperty(value = "the store cousine id")
    @NotEmpty
    private String cousineId;
}
