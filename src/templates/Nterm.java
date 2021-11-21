package templates;

import java.util.Objects;

public class Nterm extends MyToken {
    String attrs = "";
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nterm nterm = (Nterm) o;
        return Objects.equals(name, nterm.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    Nterm(String _name) {
        name = _name;
    }
    Nterm(String _name, String _attrs) {
        name = _name;
        attrs = _attrs;
    }
}
