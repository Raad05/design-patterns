package memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<EditorState> states = new ArrayList<>();

    public void push(EditorState state) {
        states.add(state);
    }

    public EditorState pop() {
        int lastIdx = states.size() - 1;
        var item = states.get(lastIdx);
        states.remove(item);

        return item;
    }
}
