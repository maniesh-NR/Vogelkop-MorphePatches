package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class oc {
    public final rxh a;
    public final View.OnClickListener b;

    public oc(rxh rxhVar, View.OnClickListener onClickListener) {
        this.a = rxhVar;
        this.b = onClickListener;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc)) {
            return false;
        }
        oc ocVar = (oc) obj;
        return this.a.equals(ocVar.a) && this.b.equals(ocVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
