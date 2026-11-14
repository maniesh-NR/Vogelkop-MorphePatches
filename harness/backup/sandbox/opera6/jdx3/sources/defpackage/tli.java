package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class tli {
    public final uli a;
    public final View.OnClickListener b;

    public tli(uli uliVar, View.OnClickListener onClickListener) {
        this.a = uliVar;
        this.b = onClickListener;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tli)) {
            return false;
        }
        tli tliVar = (tli) obj;
        return this.a.equals(tliVar.a) && this.b.equals(tliVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
