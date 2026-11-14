package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class mgi {
    public static final HashMap a;

    static {
        HashMap map = new HashMap(9);
        a = map;
        map.put("xx-small", new nei(0.694f, 7));
        map.put("x-small", new nei(0.833f, 7));
        map.put("small", new nei(10.0f, 7));
        map.put("medium", new nei(12.0f, 7));
        map.put("large", new nei(14.4f, 7));
        map.put("x-large", new nei(17.3f, 7));
        map.put("xx-large", new nei(20.7f, 7));
        map.put("smaller", new nei(83.33f, 9));
        map.put("larger", new nei(120.0f, 9));
    }
}
