package defpackage;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class h3o extends w1h {
    public final Window a;
    public final oji b;

    public h3o(Window window, oji ojiVar) {
        this.a = window;
        this.b = ojiVar;
    }

    public final void C(int i) {
        View decorView = this.a.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | i);
    }

    public final void D(int i) {
        View decorView = this.a.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (~i));
    }

    public final void p(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    C(4);
                } else if (i2 == 2) {
                    C(2);
                } else if (i2 == 8) {
                    ((rii) this.b.a).i();
                }
            }
        }
    }

    public final boolean q() {
        return (this.a.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }

    public final void v(boolean z) {
        if (!z) {
            D(16);
            return;
        }
        Window window = this.a;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        C(16);
    }

    public final void w(boolean z) {
        if (!z) {
            D(8192);
            return;
        }
        Window window = this.a;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        C(8192);
    }

    public final void x() {
        this.a.getDecorView().setTag(356039078, 2);
        D(2048);
        C(4096);
    }
}
