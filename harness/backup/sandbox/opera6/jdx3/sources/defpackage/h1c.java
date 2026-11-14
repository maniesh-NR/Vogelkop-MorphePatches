package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h1c {
    public final String a;
    public final String b;
    public final z4m c;
    public final e5m d;
    public final Set e;

    public h1c(String str, String str2, z4m z4mVar, e5m e5mVar, Set set) {
        this.a = str;
        this.b = str2;
        this.c = z4mVar;
        this.d = e5mVar;
        this.e = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1c)) {
            return false;
        }
        h1c h1cVar = (h1c) obj;
        return this.a.equals(h1cVar.a) && this.b.equals(h1cVar.b) && this.c == h1cVar.c && this.d.equals(h1cVar.d) && Intrinsics.a(this.e, h1cVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + z1m.f(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
