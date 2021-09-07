package com.project.getResponse;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class AddressDAO {
    @Id
    UUID addressId;
    String street;
    String city;
    String zipCode;
}
