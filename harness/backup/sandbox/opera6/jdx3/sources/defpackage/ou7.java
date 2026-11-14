package defpackage;

import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.i;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ou7 extends i {
    public final ov0 b;
    public final ua7 c;
    public final jv3 d;
    public lu7 e;

    public ou7(ov0 ov0Var, ua7 ua7Var, jv3 jv3Var) {
        super((FrameLayout) ov0Var.b);
        this.b = ov0Var;
        this.c = ua7Var;
        this.d = jv3Var;
        ImageView imageView = (ImageView) ov0Var.d;
        pc5 pc5Var = new pc5((Object) this, (byte) 7);
        dll dllVarS = q9n.s(imageView);
        if (dllVarS == null) {
            return;
        }
        u8n.b(dllVarS, imageView, pc5Var);
    }

    public final void U() {
        lu7 lu7Var = this.e;
        if (lu7Var == null) {
            return;
        }
        ImageView imageView = (ImageView) this.b.d;
        imageView.setImageDrawable(exg.m(imageView.getContext(), imageView.getResources().getDimensionPixelSize(2131167247), imageView.getResources().getDimensionPixelSize(2131165499), lu7Var.b, (zw0) this.d.get()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ou7)) {
            return false;
        }
        ou7 ou7Var = (ou7) obj;
        return Intrinsics.a(this.b, ou7Var.b) && Intrinsics.a(this.c, ou7Var.c) && Intrinsics.a(this.d, ou7Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
