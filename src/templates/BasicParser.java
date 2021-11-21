package templates;

import java.io.IOException;

abstract public class BasicParser {
    public abstract Tree parse() throws LexException, ParseException;
}
