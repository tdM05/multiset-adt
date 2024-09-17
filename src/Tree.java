import java.util.ArrayList;
import java.util.List;

public class Tree {

    private int _root;
    private List<Tree> _subtrees;

    public Tree(int _root, List<Tree> _subtrees) {
        this._root = _root;

        if (_subtrees == null)
        {
            this._subtrees = new ArrayList<>();
        } else {
            this._subtrees = new ArrayList<>(_subtrees);
        }

    }

}
