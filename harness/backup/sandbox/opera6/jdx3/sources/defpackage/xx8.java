package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class xx8 extends LinkedHashMap {
    public final /* synthetic */ short a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public xx8(int i) {
        super(0, 0.75f, true);
        this.a = i;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > Math.max(1, (int) this.a);
    }
}
