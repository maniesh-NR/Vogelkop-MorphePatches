package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o14 {
    public final int a;
    public final String b;
    public final List c;

    public o14(int i, String str, List list) {
        this.a = i;
        this.b = str;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o14)) {
            return false;
        }
        o14 o14Var = (o14) obj;
        return this.a == o14Var.a && Intrinsics.a(this.b, o14Var.b) && this.c.equals(o14Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + z1m.f(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbP = p3p.p(this.a, "EmojiDataCategory(headerIconId=", ", categoryName=", this.b, ", emojiDataList=");
        sbP.append(this.c);
        sbP.append(")");
        return sbP.toString();
    }
}
