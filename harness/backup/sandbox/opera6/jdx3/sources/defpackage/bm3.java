package defpackage;

/* loaded from: classes.dex */
public final class bm3 extends yz7 {
    public final void e(boolean z) {
        wz7 wz7Var = this.b;
        am3 am3Var = wz7Var instanceof am3 ? (am3) wz7Var : null;
        if (am3Var == null || am3Var.h == z) {
            return;
        }
        am3Var.h = z;
        if (am3Var.e) {
            am3Var.notifyItemChanged(0);
        }
    }

    public final void f(boolean z) {
        wz7 wz7Var = this.b;
        am3 am3Var = wz7Var instanceof am3 ? (am3) wz7Var : null;
        if (am3Var == null || am3Var.i == z) {
            return;
        }
        am3Var.i = z;
        if (am3Var.e) {
            am3Var.notifyItemChanged(0);
        }
    }

    public final void g(cm3 cm3Var) {
        wz7 wz7Var = this.b;
        am3 am3Var = wz7Var instanceof am3 ? (am3) wz7Var : null;
        if (am3Var == null || am3Var.g == cm3Var) {
            return;
        }
        am3Var.g = cm3Var;
        if (am3Var.e) {
            am3Var.notifyItemChanged(0);
        }
    }

    public final void h(boolean z) {
        wz7 wz7Var = this.b;
        am3 am3Var = wz7Var instanceof am3 ? (am3) wz7Var : null;
        if (am3Var == null || am3Var.j == z) {
            return;
        }
        am3Var.j = z;
        if (am3Var.e) {
            am3Var.notifyItemChanged(0);
        }
    }
}
