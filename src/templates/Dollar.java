package templates;

import java.util.Objects;

public class Dollar extends Term {
    public Dollar() {
        super("DOLLAR", "\"\\\\$\"");
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dollar dollar = (Dollar) o;
        return Objects.equals(name, dollar.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
