package control;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectManager {

    static public ObjectManager instance = new ObjectManager();

    public List<Object> list;
    public List<Object> tempList;

    private ObjectManager() {
        this.list = new ArrayList<>();
        this.tempList = new ArrayList<>();
    }

    public void add(Object object) {
        this.tempList.add(object);
    }

    public void runAll() {
        this.list.forEach(object -> object.run());
        this.list.addAll(this.tempList);
        this.tempList.clear();
    }

    public void renderAll(Graphics graphics) {
        this.list.forEach(object -> object.render(graphics));
    }
}
