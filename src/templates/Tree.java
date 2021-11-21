package templates;

import java.util.ArrayList;

public class Tree {
    String node;
    Tree[] children;
    public Tree(String _node) {
        node = _node;
        children = null;
    }
    public Tree(String _node, Tree[] _children) {
        node = _node;
        children = _children.clone();
    }
}
