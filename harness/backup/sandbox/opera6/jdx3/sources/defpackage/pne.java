package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class pne {
    public final String a;
    public final String b;
    public final List c;

    public pne(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pne)) {
            return false;
        }
        pne pneVar = (pne) obj;
        return Intrinsics.a(this.a, pneVar.a) && Intrinsics.a(this.b, pneVar.b) && Intrinsics.a(this.c, pneVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + z1m.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "";
    }
}
