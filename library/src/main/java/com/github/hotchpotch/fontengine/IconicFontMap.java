package com.github.hotchpotch.fontengine;

import java.util.HashMap;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by yuichi-tateno on 2015/02/28.
 */
public class IconicFontMap {
    private HashMap<String, Character> fontMap;

    public IconicFontMap() {
        super();
        fontMap = new HashMap<>();
    }

    public IconicFontMap put(String key, Character value) {
        fontMap.put(key, value);
        return this;
    }

    public Character get(String key) {
        return fontMap.get(key);
    }

    public SortedSet<String> allNames() {
        return new TreeSet<>(fontMap.keySet());
    }
}
