package templates;

import java.util.Objects;

public class Term extends MyToken {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Term term = (Term) o;
        return Objects.equals(name, term.name) &&
                Objects.equals(regex, term.regex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, regex);
    }

    String regex;
    public Term(String _name) {
        name = _name; regex = null;
    }
    public Term(String _name, String _regex) {
        name = _name; regex = _regex;
    }
}
