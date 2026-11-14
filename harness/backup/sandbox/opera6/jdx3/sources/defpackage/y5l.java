package defpackage;

import android.util.Size;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y5l {
    public final eyj a;
    public final b3c b;
    public final Size c;

    public y5l(eyj eyjVar, b3c b3cVar, Size size) {
        this.a = eyjVar;
        this.b = b3cVar;
        this.c = size;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5l)) {
            return false;
        }
        y5l y5lVar = (y5l) obj;
        return Intrinsics.a(this.a, y5lVar.a) && this.b == y5lVar.b && Intrinsics.a(this.c, y5lVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
