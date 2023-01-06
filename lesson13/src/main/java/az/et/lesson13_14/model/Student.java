package az.et.lesson13.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@AllArgsConstructor
public class Student {
    @NotBlank
    private String name;
    private int age;
    @NotBlank
    private String group;
    @NotEmpty
    private List<String> courses;

}
