import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

public class Person implements Serializable {

    @Getter @Setter
    private int id;
    @Getter @Setter
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }


}
