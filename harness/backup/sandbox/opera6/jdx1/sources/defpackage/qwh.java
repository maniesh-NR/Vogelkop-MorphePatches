package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class qwh extends if4 {
    public final man a;
    public final List b;
    public final e3a c;
    public final aa4 d;

    public qwh(man manVar, List list, e3a e3aVar, aa4 aa4Var) {
        this.a = manVar;
        this.b = list;
        this.c = e3aVar;
        this.d = aa4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qwh) {
            qwh qwhVar = (qwh) obj;
            return this.a == qwhVar.a && Intrinsics.a(this.b, qwhVar.b) && Intrinsics.a(this.c, qwhVar.c) && this.d == qwhVar.d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((((this.c.hashCode() + rfp.f(this.a.hashCode() * 31, 31, this.b)) * 31) + 1237) * 31);
    }

    public final String toString() {
        return "RequestOpen(virtualCamera=" + this.a + ", sharedCameraIds=" + this.b + ", graphListener=" + this.c + ", isPrewarm=false, isForegroundObserver=" + this.d + ')';
    }
}
