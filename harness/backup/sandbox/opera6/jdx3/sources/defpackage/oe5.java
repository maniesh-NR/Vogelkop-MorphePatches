package defpackage;

import android.view.View;
import com.opera.android.ui.catalog.widget.OperaTextView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class oe5 extends k1g {
    public final View i;
    public final OperaTextView j;

    public oe5(View view, OperaTextView operaTextView) {
        this.i = view;
        this.j = operaTextView;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oe5)) {
            return false;
        }
        oe5 oe5Var = (oe5) obj;
        return this.i.equals(oe5Var.i) && Intrinsics.a(this.j, oe5Var.j);
    }

    public final int hashCode() {
        int iHashCode = this.i.hashCode() * 31;
        OperaTextView operaTextView = this.j;
        return iHashCode + (operaTextView == null ? 0 : operaTextView.hashCode());
    }

    public final String toString() {
        return "";
    }
}
