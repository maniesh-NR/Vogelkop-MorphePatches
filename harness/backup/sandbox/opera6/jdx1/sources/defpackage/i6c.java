package defpackage;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i6c implements k5c {
    public final u6c a;
    public final h6c b;
    public final y4c c;
    public final ro9 d;

    public i6c(u6c u6cVar, h6c h6cVar, y4c y4cVar, ro9 ro9Var) {
        this.a = u6cVar;
        this.b = h6cVar;
        this.c = y4cVar;
        this.d = ro9Var;
    }

    @Override // defpackage.k5c
    public final void a(int i, Object obj, ih5 ih5Var, int i2) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-462424778);
        int i3 = (vt9Var.d(i) ? 4 : 2) | i2 | (vt9Var.h(obj) ? 32 : 16) | (vt9Var.f(this) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY);
        byte b = 1;
        if (vt9Var.N(i3 & 1, (i3 & 147) != 146)) {
            wxe.d(obj, i, this.a.s, gyg.P(-824725566, new m23(this, i, b), vt9Var), vt9Var, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new uf1(this, i, obj, i2, (byte) 7);
        }
    }

    @Override // defpackage.k5c
    public final Object b(int i) {
        phb phbVarO = this.b.k.o(i);
        return phbVarO.c.getType().invoke(Integer.valueOf(i - phbVarO.a));
    }

    @Override // defpackage.k5c
    public final int c(Object obj) {
        return this.d.p(obj);
    }

    @Override // defpackage.k5c
    public final Object d(int i) {
        ro9 ro9Var = this.d;
        Object[] objArr = (Object[]) ro9Var.d;
        int i2 = i - ro9Var.b;
        Object obj = (i2 < 0 || i2 >= objArr.length) ? null : objArr[i2];
        return obj == null ? this.b.D(i) : obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i6c)) {
            return false;
        }
        return Intrinsics.a(this.b, ((i6c) obj).b);
    }

    @Override // defpackage.k5c
    public final int getItemCount() {
        return this.b.B().b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
