/*************************************
 * Author: Dereck Daniel <daniel.dereck@gmail.com>
 * Date: 22/02/2019
 *************************************/

package fr.rennes.clicklunch.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * Class City.
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors
public class City extends EntityBase {
    private String name;
    private String postalCode;
}
