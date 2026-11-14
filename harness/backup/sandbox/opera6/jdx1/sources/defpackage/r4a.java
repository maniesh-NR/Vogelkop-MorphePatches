package defpackage;

import android.util.LogPrinter;
import android.view.View;
import androidx.gridlayout.widget.GridLayout;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public class r4a {
    public int a;
    public int b;
    public int c;

    public r4a() {
        c();
    }

    public int a(GridLayout gridLayout, View view, nb6 nb6Var, int i, boolean z) {
        int i2 = this.a;
        int i3 = f6n.a;
        return i2 - nb6Var.t(view, i, gridLayout.getLayoutMode());
    }

    public void b(int i, int i2) {
        this.a = Math.max(this.a, i);
        this.b = Math.max(this.b, i2);
    }

    public void c() {
        this.a = LinearLayoutManager.INVALID_OFFSET;
        this.b = LinearLayoutManager.INVALID_OFFSET;
        this.c = 2;
    }

    public int d(boolean z) {
        if (!z) {
            int i = this.c;
            LogPrinter logPrinter = GridLayout.i;
            if ((i & 2) != 0) {
                return 100000;
            }
        }
        return this.a + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Bounds{before=");
        sb.append(this.a);
        sb.append(", after=");
        return fki.s(sb, this.b, '}');
    }
}
