package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ok {
    public final a7j a;
    public final List b;
    public final List c;
    public final List d;

    public ok(a7j a7jVar, List list, List list2, List list3) {
        this.a = a7jVar;
        this.b = list;
        this.c = list2;
        this.d = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ok)) {
            return false;
        }
        ok okVar = (ok) obj;
        return this.a == okVar.a && Intrinsics.a(this.b, okVar.b) && Intrinsics.a(this.c, okVar.c) && Intrinsics.a(this.d, okVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + rfp.f(rfp.f(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "";
    }
}
