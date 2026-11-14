package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class yyh {
    public final int a;
    public final ki9 b;
    public final ji9 c;

    public yyh(int i, ki9 ki9Var, ji9 ji9Var) {
        this.a = i;
        this.b = ki9Var;
        this.c = ji9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yyh)) {
            return false;
        }
        yyh yyhVar = (yyh) obj;
        return this.a == yyhVar.a && Intrinsics.a(this.b, yyhVar.b) && this.c.equals(yyhVar.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + (((this.a * 31) + this.b.a) * 29791);
    }

    public final String toString() {
        return "ResourceFont(resId=" + this.a + ", weight=" + this.b + ", style=Normal, loadingStrategy=Blocking)";
    }
}
