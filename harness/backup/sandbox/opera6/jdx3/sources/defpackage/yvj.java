package defpackage;

import androidx.recyclerview.widget.d;

/* loaded from: classes.dex */
public abstract class yvj extends qw4 {
    public final d a;

    public yvj(d dVar) {
        this.a = dVar;
    }

    @Override // defpackage.qw4
    public final void I(int i, int i2, Object obj) {
        this.a.notifyItemRangeChanged(i, i2, obj);
    }

    public final void S(int i, int i2) {
        this.a.notifyItemMoved(i, i2);
    }

    public final void f(int i, int i2) {
        this.a.notifyItemRangeRemoved(i, i2);
    }

    public final void t(int i, int i2) {
        this.a.notifyItemRangeInserted(i, i2);
    }
}
