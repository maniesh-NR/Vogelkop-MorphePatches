package ads_mobile_sdk;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class gl0 extends LinkedHashMap {
    public final int a;
    public final qz2 b = qz2.EVICTION_REASON_OVERFLOW;
    public final ArrayList c;

    public gl0(int i, ArrayList arrayList) {
        this.a = i;
        this.c = arrayList;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        if (size() <= this.a) {
            return false;
        }
        this.c.add(new Pair(this.b, entry.getValue()));
        return true;
    }
}
