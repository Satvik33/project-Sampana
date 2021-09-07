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
@Document(collection = "Users")
public class UserDAO {
    @Id
    UUID id;
    String name;
    String username;
    String phone;
    String email;
    AddressDAO address;
}
