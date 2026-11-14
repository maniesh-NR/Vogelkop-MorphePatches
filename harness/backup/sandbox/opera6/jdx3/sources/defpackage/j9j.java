package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j9j {
    public final String a;
    public final List b;
    public final boolean c;

    public j9j(String str, List list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j9j)) {
            return false;
        }
        j9j j9jVar = (j9j) obj;
        return Intrinsics.a(this.a, j9jVar.a) && Intrinsics.a(this.b, j9jVar.b) && this.c == j9jVar.c;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.c) + rfp.f((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return "";
    }
}
