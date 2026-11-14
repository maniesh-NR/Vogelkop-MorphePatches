package defpackage;

import android.graphics.Matrix;

/* loaded from: classes.dex */
public final class sfi extends wfi implements lei {
    public Matrix r;

    @Override // defpackage.lei
    public final void k(Matrix matrix) {
        this.r = matrix;
    }

    @Override // defpackage.jfi
    public final String n() {
        return "text";
    }
}
