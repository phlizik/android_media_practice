package com.media.opengl.sample.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 */
public class ShapeContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<ShapeItem> ITEMS = new ArrayList<ShapeItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, ShapeItem> ITEM_MAP = new HashMap<String, ShapeItem>();

    static {
        addItem(new ShapeItem("1", "Cylinder"));
        addItem(new ShapeItem("2", "CircularRing"));
    }

    private static void addItem(ShapeItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    public static class ShapeItem {
        public final String id;
        public final String content;

        public ShapeItem(String id, String content) {
            this.id = id;
            this.content = content;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
