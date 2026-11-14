package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class pf1 {
    public final Object a;
    public final int b;
    public int c;
    public final String d;

    public pf1(String str, int i, int i2, Object obj) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
    }

    public /* synthetic */ pf1(of1 of1Var, int i, int i2, int i3) {
        this((i3 & 8) != 0 ? "" : "URL", i, (i3 & 4) != 0 ? LinearLayoutManager.INVALID_OFFSET : i2, of1Var);
    }

    public final rf1 a(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            i = i2;
        }
        if (!(i != Integer.MIN_VALUE)) {
            b8b.b("Item.end should be set first");
        }
        return new rf1(this.d, this.b, i, this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pf1)) {
            return false;
        }
        pf1 pf1Var = (pf1) obj;
        return Intrinsics.a(this.a, pf1Var.a) && this.b == pf1Var.b && this.c == pf1Var.c && Intrinsics.a(this.d, pf1Var.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + rfp.c(this.c, rfp.c(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "MutableRange(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ")";
    }
}
