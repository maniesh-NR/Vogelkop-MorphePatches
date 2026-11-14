package ads_mobile_sdk;

import defpackage.tso;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class fn1 extends e {
    public static final ob1 b = ob1.a(Collections.EMPTY_MAP);

    @Override // defpackage.tso
    public final Object get() {
        Map map = this.a;
        int size = map.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((tso) entry.getValue()).get());
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }
}
