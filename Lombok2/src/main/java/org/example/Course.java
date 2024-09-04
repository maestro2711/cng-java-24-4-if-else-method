package org.example;


import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course {
    private String id;
    private String name;

    @With
    private String teacher;

    private List<LombokStudent> students = new ArrayList<>();
}
