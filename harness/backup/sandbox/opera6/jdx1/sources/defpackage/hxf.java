package defpackage;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class hxf implements k5c {
    public final gu6 a;
    public final gxf b;
    public final ro9 c;

    public hxf(gu6 gu6Var, gxf gxfVar, ro9 ro9Var) {
        this.a = gu6Var;
        this.b = gxfVar;
        this.c = ro9Var;
    }

    @Override // defpackage.k5c
    public final void a(int i, Object obj, ih5 ih5Var, int i2) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1201380429);
        int i3 = (vt9Var.d(i) ? 4 : 2) | i2 | (vt9Var.h(obj) ? 32 : 16) | (vt9Var.f(this) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY);
        if (vt9Var.N(i3 & 1, (i3 & 147) != 146)) {
            wxe.d(obj, i, this.a.y, gyg.P(1142237095, new m23((Object) this, i, (byte) 3), vt9Var), vt9Var, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new uf1(this, i, obj, i2, (byte) 10);
        }
    }

    @Override // defpackage.k5c
    public final int c(Object obj) {
        return this.c.p(obj);
    }

    @Override // defpackage.k5c
    public final Object d(int i) {
        ro9 ro9Var = this.c;
        Object[] objArr = (Object[]) ro9Var.d;
        int i2 = i - ro9Var.b;
        Object obj = (i2 < 0 || i2 >= objArr.length) ? null : objArr[i2];
        return obj == null ? this.b.D(i) : obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hxf)) {
            return false;
        }
        return Intrinsics.a(this.b, ((hxf) obj).b);
    }

    @Override // defpackage.k5c
    public final int getItemCount() {
        return this.b.l.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
