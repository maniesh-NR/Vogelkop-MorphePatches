package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class kea {
    public final boolean a;
    public final aea b;
    public final Set c;
    public final List d;

    public kea(boolean z, aea aeaVar, Set set, List list) {
        this.a = z;
        this.b = aeaVar;
        this.c = set;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kea)) {
            return false;
        }
        kea keaVar = (kea) obj;
        return this.a == keaVar.a && this.b == keaVar.b && Intrinsics.a(this.c, keaVar.c) && Intrinsics.a(this.d, keaVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
