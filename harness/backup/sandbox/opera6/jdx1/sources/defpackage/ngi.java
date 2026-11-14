package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class ngi {
    public static final HashMap a;

    static {
        HashMap map = new HashMap(13);
        a = map;
        map.put("normal", 400);
        map.put("bold", 700);
        u35.n(1, map, "bolder", -1, "lighter");
        u35.n(100, map, "100", 200, "200");
        map.put("300", 300);
        map.put("400", 400);
        u35.n(500, map, "500", 600, "600");
        u35.l(800, 700, "700", "800", map);
        map.put("900", 900);
    }
}
