package defpackage;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class kbe implements Comparator {
    public final long a;

    public kbe(long j) {
        this.a = j;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        jbe jbeVar = (jbe) obj;
        jbe jbeVar2 = (jbe) obj2;
        if (((d7l) jbeVar2.a).j.isActive() != ((d7l) jbeVar.a).j.isActive()) {
            return Boolean.compare(((d7l) jbeVar2.a).j.isActive(), ((d7l) jbeVar.a).j.isActive());
        }
        long j = jbeVar.c;
        long j2 = this.a;
        boolean z = j >= j2;
        long j3 = jbeVar2.c;
        boolean z2 = j3 >= j2;
        return (z && z2 && j != j3) ? Intrinsics.c(j3, j) : z != z2 ? Boolean.compare(z2, z) : Intrinsics.b(jbeVar.b, jbeVar2.b);
    }
}
