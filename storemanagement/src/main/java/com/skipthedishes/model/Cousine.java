package com.skipthedishes.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.index.TextIndexed;
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
public class Cousine {
    @ApiModelProperty(value = "the cousine id")
    @Id
    private String id;

    @ApiModelProperty(value = "the cousine name")
    @NotEmpty
    @TextIndexed
    private String name;
}
