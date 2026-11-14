package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class lz7 extends olb {
    public String c;
    public final boolean d;
    public final int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz7(String str, int i, int i2) {
        super(nlb.c);
        boolean z = (i2 & 2) != 0;
        i = (i2 & 4) != 0 ? 0 : i;
        this.c = str;
        this.d = z;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lz7)) {
            return false;
        }
        lz7 lz7Var = (lz7) obj;
        return Intrinsics.a(this.c, lz7Var.c) && this.d == lz7Var.d && this.e == lz7Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + fki.k(this.c.hashCode() * 31, 31, this.d);
    }

    public final String toString() {
        String str = this.c;
        StringBuilder sb = new StringBuilder("EmojiViewData(emoji=");
        sb.append(str);
        sb.append(", updateToSticky=");
        sb.append(this.d);
        sb.append(", dataIndex=");
        return p3p.k(this.e, ")", sb);
    }
}
