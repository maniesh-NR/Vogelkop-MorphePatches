package defpackage;

import android.view.View;
import androidx.appcompat.widget.SwitchCompat;

/* loaded from: classes.dex */
public final class c9n implements r8n {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public c9n(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final void a(View view) {
        SwitchCompat switchCompat = (SwitchCompat) view;
        int i = this.b;
        if (i != 0) {
            switchCompat.k(sgb.F(i, switchCompat.getContext()));
        }
        int i2 = this.a;
        if (i2 != 0) {
            switchCompat.i(sgb.F(i2, switchCompat.getContext()));
        }
        int i3 = this.d;
        if (i3 != 0) {
            switchCompat.l(nb6.v(i3, view.getContext()));
        }
        int i4 = this.c;
        if (i4 != 0) {
            switchCompat.j(nb6.v(i4, view.getContext()));
        }
        view.jumpDrawablesToCurrentState();
    }
}
