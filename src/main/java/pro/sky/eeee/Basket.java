package pro.sky.eeee;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
@Service
@SessionScope
public class Basket {
    private final List<Integer> items = new ArrayList<>();
    public  void add(Integer[] ids) {
        for (Integer id:ids) {
            items.add(id);
        }
    }

    public List<Integer> getAll() {
        return Collections.unmodifiableList(items);
    }
}
