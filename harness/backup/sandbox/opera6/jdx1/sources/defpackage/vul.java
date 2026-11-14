package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class vul {
    public final int a;
    public final int b;
    public final xul c;

    public vul(int i, int i2, xul xulVar) {
        this.a = i;
        this.b = i2;
        this.c = xulVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vul)) {
            return false;
        }
        vul vulVar = (vul) obj;
        return this.a == vulVar.a && this.b == vulVar.b && Intrinsics.a(this.c, vulVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rfp.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "";
    }
}
