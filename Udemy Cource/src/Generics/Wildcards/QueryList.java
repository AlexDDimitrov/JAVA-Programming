package Generics.Wildcards;

import java.util.ArrayList;
import java.util.List;

//                                 !classes THEN interfaces!
public class QueryList <T extends  Student & QueryItem> {
    private List<T> items;
    public QueryList(List<T> items) {
        this.items = items;
    }

    public static <S extends QueryItem> List<S> getMatches(List<S> items, String field, String values) {
        List<S> matches = new ArrayList<>();
        for (var item : items) {
            if(item.matchFieldValue(field, values)) {
                matches.add(item);
            }
        }
        return matches;
    }

    public List<T> getMatches(String field, String values) {
        List<T> matches = new ArrayList<>();
        for (var item : items) {
            if(item.matchFieldValue(field, values)) {
                matches.add(item);
            }
        }
        return matches;
    }
}
