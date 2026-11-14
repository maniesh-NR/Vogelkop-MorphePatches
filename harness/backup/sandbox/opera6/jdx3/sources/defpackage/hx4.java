package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class hx4 {
    public final char a;
    public final Set b;
    public final LinkedHashSet c;

    /* JADX WARN: Multi-variable type inference failed */
    public hx4(int i, Set set) {
        this.a = i;
        this.b = set;
        this.c = CollectionsKt.m0(set);
    }

    public final ix4 a() {
        return new ix4(this.c, this.b);
    }

    public final void b(int i) {
        this.c.remove(Integer.valueOf(this.a + i));
    }
}
