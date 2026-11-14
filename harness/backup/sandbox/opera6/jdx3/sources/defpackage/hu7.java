package defpackage;

import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.i;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class hu7 extends i {
    public final ov0 b;
    public final x77 c;
    public final jv3 d;
    public du7 e;

    public hu7(ov0 ov0Var, x77 x77Var, jv3 jv3Var) {
        super((FrameLayout) ov0Var.b);
        this.b = ov0Var;
        this.c = x77Var;
        this.d = jv3Var;
        ImageView imageView = (ImageView) ov0Var.d;
        pc5 pc5Var = new pc5((Object) this, (byte) 6);
        dll dllVarS = q9n.s(imageView);
        if (dllVarS == null) {
            return;
        }
        u8n.b(dllVarS, imageView, pc5Var);
    }

    public final void U() {
        du7 du7Var = this.e;
        if (du7Var == null) {
            return;
        }
        ImageView imageView = (ImageView) this.b.d;
        imageView.setImageDrawable(exg.m(imageView.getContext(), imageView.getResources().getDimensionPixelSize(2131167247), imageView.getResources().getDimensionPixelSize(2131165499), du7Var.l, (zw0) this.d.get()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu7)) {
            return false;
        }
        hu7 hu7Var = (hu7) obj;
        return Intrinsics.a(this.b, hu7Var.b) && Intrinsics.a(this.c, hu7Var.c) && Intrinsics.a(this.d, hu7Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
