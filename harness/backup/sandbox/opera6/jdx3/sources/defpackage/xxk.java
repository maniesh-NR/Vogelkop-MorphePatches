package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class xxk {
    public static final omj a = new omj((byte) 11);
    public static final HashMap b;

    static {
        HashMap map = new HashMap();
        map.put("sync.passwords", new wxk(map.size(), 2131364356, 2132021432));
        map.put("sync.bookmarks", new wxk(map.size(), 2131364355, 2132021425));
        map.put("sync.typed_urls", new wxk(map.size(), 2131364358, 2132021431));
        map.put("sync.tabs", new wxk(map.size(), 2131364357, 2132021433));
        b = map;
    }
}
