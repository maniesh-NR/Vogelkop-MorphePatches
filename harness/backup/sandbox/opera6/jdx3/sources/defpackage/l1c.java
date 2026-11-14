package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class l1c {
    public final Map a;
    public final Set b;
    public final l0c c;
    public final boolean d;

    public l1c(LinkedHashMap linkedHashMap, LinkedHashSet linkedHashSet, l0c l0cVar, boolean z) {
        this.a = Collections.unmodifiableMap(linkedHashMap);
        this.b = Collections.unmodifiableSet(linkedHashSet);
        this.c = l0cVar;
        this.d = z;
    }
}
