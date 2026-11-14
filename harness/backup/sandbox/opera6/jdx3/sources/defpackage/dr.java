package defpackage;

import android.content.Context;
import android.view.View;
import com.opera.android.BrowserActivity;

/* loaded from: classes.dex */
public final class dr implements y9n, rjm {
    public final an a;
    public final o43 b;
    public sjm c = sjm.b;
    public int d;
    public boolean e;
    public boolean f;

    public dr(Context context, o43 o43Var) {
        this.a = (an) ((BrowserActivity) ((zm) q9n.l(context, zm.class))).i1.getValue();
        this.b = o43Var;
    }

    @Override // defpackage.y9n
    public final void T(View view, int i, int i2) {
        if (this.d == i) {
            return;
        }
        a(new br((Object) this, i, (byte) 0));
    }

    public final void a(Runnable runnable) {
        boolean z = false;
        boolean z2 = c() && this.d > 0;
        boolean zC = c();
        runnable.run();
        if (c() && this.d > 0) {
            z = true;
        }
        boolean zC2 = c();
        o43 o43Var = this.b;
        if (zC != zC2) {
            o43Var.i(zC2);
        }
        if (z2 != z) {
            o43Var.q(z);
        }
    }

    @Override // defpackage.rjm
    public final void b(sjm sjmVar) {
        if (this.c.equals(sjmVar)) {
            return;
        }
        a(new xa(this, sjmVar, (byte) 5));
    }

    public final boolean c() {
        return this.e && this.c.a && this.f;
    }

    public final void d(boolean z) {
        if (this.e == z) {
            return;
        }
        a(new ar(this, z, (byte) 1));
    }
}
