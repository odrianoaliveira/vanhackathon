package com.skipthedishes.vanhacsaopaulofair.model;

/**
 * Created by adriano on 18/03/18.
 *
 * @author Adriano Oliveira
 */

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
public class Cousine {
    private Long id;
    private String name;
}
