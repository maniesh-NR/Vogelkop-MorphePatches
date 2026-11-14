package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.f;

/* loaded from: classes.dex */
public abstract class hsf {
    public final f a;
    public int b = LinearLayoutManager.INVALID_OFFSET;
    public final Rect c = new Rect();

    public hsf(f fVar) {
        this.a = fVar;
    }

    public static hsf a(f fVar, int i) {
        if (i == 0) {
            return new gsf(fVar, (byte) 0);
        }
        byte b = 1;
        if (i == 1) {
            return new gsf(fVar, b);
        }
        qp2.o("invalid orientation");
        return null;
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public final int m() {
        if (Integer.MIN_VALUE == this.b) {
            return 0;
        }
        return l() - this.b;
    }

    public abstract int n(View view);

    public abstract int o(View view);

    public abstract void p(int i);
}
