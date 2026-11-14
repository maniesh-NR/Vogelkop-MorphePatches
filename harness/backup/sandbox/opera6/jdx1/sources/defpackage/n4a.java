package defpackage;

import android.view.View;
import androidx.gridlayout.widget.GridLayout;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class n4a extends r4a {
    public int d;

    @Override // defpackage.r4a
    public final int a(GridLayout gridLayout, View view, nb6 nb6Var, int i, boolean z) {
        return Math.max(0, super.a(gridLayout, view, nb6Var, i, z));
    }

    @Override // defpackage.r4a
    public final void b(int i, int i2) {
        super.b(i, i2);
        this.d = Math.max(this.d, i + i2);
    }

    @Override // defpackage.r4a
    public final void c() {
        super.c();
        this.d = LinearLayoutManager.INVALID_OFFSET;
    }

    @Override // defpackage.r4a
    public final int d(boolean z) {
        return Math.max(super.d(z), this.d);
    }
}
