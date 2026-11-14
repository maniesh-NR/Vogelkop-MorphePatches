package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class yre {
    public static final HashSet a = new HashSet(Arrays.asList("hot_topic", "text_list", "rich_media"));
    public static final HashMap b;

    static {
        HashMap map = new HashMap();
        b = map;
        map.put("hot_topic", new xre(1, 3));
        map.put("normal", new xre(1, 2));
        map.put("big_picture", new xre(2, 2));
    }
}
