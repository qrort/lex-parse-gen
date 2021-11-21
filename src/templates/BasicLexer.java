package templates;

import java.io.FileInputStream;
import java.io.IOException;


public abstract class BasicLexer {
    FileInputStream in;
    protected char cur = ' ';
    protected int pos;
    protected generated.Enum token;
    protected String text;
    protected String old;
    private boolean ended = false;
    public BasicLexer(String file) throws IOException, LexException {
        in = new FileInputStream(file);
        pos = -1;
        nextToken();
    }
    public abstract boolean blank();
    public abstract void nextToken() throws LexException;

    public void nextChar() throws LexException {
        pos++;
        try {
            if (ended) {
                cur = '$';
            } else {
                cur = (char) in.read();
            }
            if (in.available() == 0) {
                if (!ended) {
                    ended = true;
                }
            }
        } catch (IOException e) {
            throw new LexException("read from file failed", pos);
        }
    }
    public String prevToken() {return old; }
    public generated.Enum curToken() {
        return token;
    }
    public char curChar() {
        return cur;
    }
    public int curPos() {
        return pos;
    }
}
