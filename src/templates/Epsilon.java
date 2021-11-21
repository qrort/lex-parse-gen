package templates;

import java.util.Objects;

public class Epsilon extends MyToken {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Epsilon epsilon = (Epsilon) o;
        return Objects.equals(name, epsilon.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public Epsilon() {
        name = "EPSILON";
    }
}
