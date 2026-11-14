package defpackage;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class gtd {
    public final rxh a;
    public final lxh b;
    public final View.OnClickListener c;

    public gtd(rxh rxhVar, lxh lxhVar, View.OnClickListener onClickListener) {
        this.a = rxhVar;
        this.b = lxhVar;
        this.c = onClickListener;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtd)) {
            return false;
        }
        gtd gtdVar = (gtd) obj;
        return this.a.equals(gtdVar.a) && Intrinsics.a(this.b, gtdVar.b) && this.c.equals(gtdVar.c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a.a) * 31;
        lxh lxhVar = this.b;
        return this.c.hashCode() + ((iHashCode + (lxhVar == null ? 0 : Integer.hashCode(lxhVar.a))) * 31);
    }

    public final String toString() {
        return "";
    }
}
