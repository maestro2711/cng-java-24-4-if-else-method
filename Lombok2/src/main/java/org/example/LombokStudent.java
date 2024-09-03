package org.example;

import lombok.*;

@Data  // Getter/Setter/Equals&HashCode/toString
@AllArgsConstructor //Konstruktor mit allen Werte
@NoArgsConstructor  // Konstruktor ohne werte
//@RequiredArgsConstructor  // konstruktur ,der nur Final felde befüllt
@Builder  // ermöglicht builder pattern, also einen Universal Konstruktor
public class LombokStudent {
    private String id;
    private String name;

    private String address;

    private String grade;

}
