package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class iom {
    public final p0e a;
    public final List b;

    public iom(p0e p0eVar, List list) {
        this.a = p0eVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iom)) {
            return false;
        }
        iom iomVar = (iom) obj;
        return this.a.equals(iomVar.a) && Intrinsics.a(this.b, iomVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
