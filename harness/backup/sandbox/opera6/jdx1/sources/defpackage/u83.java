package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.core.app.NotificationCompat;

/* loaded from: classes.dex */
public abstract class u83 implements Cloneable {
    public int a;
    public boolean h;
    public boolean l;
    public boolean m;
    public boolean o;
    public w97 b = w97.d;
    public nyg c = nyg.a;
    public boolean d = true;
    public int e = -1;
    public int f = -1;
    public hub g = w08.b;
    public trf i = new trf();
    public v74 j = new v74(0);
    public Class k = Object.class;
    public boolean n = true;

    public static boolean g(int i, int i2) {
        return (i & i2) != 0;
    }

    public u83 b(u83 u83Var) {
        if (this.m) {
            return clone().b(u83Var);
        }
        int i = u83Var.a;
        if (g(u83Var.a, 1048576)) {
            this.o = u83Var.o;
        }
        if (g(u83Var.a, 4)) {
            this.b = u83Var.b;
        }
        if (g(u83Var.a, 8)) {
            this.c = u83Var.c;
        }
        if (g(u83Var.a, 16)) {
            this.a &= -33;
        }
        if (g(u83Var.a, 32)) {
            this.a &= -17;
        }
        if (g(u83Var.a, 64)) {
            this.a &= -129;
        }
        if (g(u83Var.a, NotificationCompat.FLAG_HIGH_PRIORITY)) {
            this.a &= -65;
        }
        if (g(u83Var.a, NotificationCompat.FLAG_LOCAL_ONLY)) {
            this.d = u83Var.d;
        }
        if (g(u83Var.a, NotificationCompat.FLAG_GROUP_SUMMARY)) {
            this.f = u83Var.f;
            this.e = u83Var.e;
        }
        if (g(u83Var.a, 1024)) {
            this.g = u83Var.g;
        }
        if (g(u83Var.a, 4096)) {
            this.k = u83Var.k;
        }
        if (g(u83Var.a, 8192)) {
            this.a &= -16385;
        }
        if (g(u83Var.a, 16384)) {
            this.a &= -8193;
        }
        if (g(u83Var.a, 131072)) {
            this.h = u83Var.h;
        }
        if (g(u83Var.a, 2048)) {
            this.j.putAll(u83Var.j);
            this.n = u83Var.n;
        }
        this.a |= u83Var.a;
        this.i.b.g(u83Var.i.b);
        k();
        return this;
    }

    @Override // 
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public u83 clone() {
        try {
            u83 u83Var = (u83) super.clone();
            trf trfVar = new trf();
            u83Var.i = trfVar;
            trfVar.b.g(this.i.b);
            v74 v74Var = new v74(0);
            u83Var.j = v74Var;
            v74Var.putAll(this.j);
            u83Var.l = false;
            u83Var.m = false;
            return u83Var;
        } catch (CloneNotSupportedException e) {
            rqd.p(e);
            return null;
        }
    }

    public final u83 e(Class cls) {
        if (this.m) {
            return clone().e(cls);
        }
        this.k = cls;
        this.a |= 4096;
        k();
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u83)) {
            return false;
        }
        u83 u83Var = (u83) obj;
        return this.d == u83Var.d && this.e == u83Var.e && this.f == u83Var.f && this.h == u83Var.h && this.b.equals(u83Var.b) && this.c == u83Var.c && this.i.equals(u83Var.i) && this.j.equals(u83Var.j) && this.k.equals(u83Var.k) && this.g.equals(u83Var.g);
    }

    public final u83 f(w97 w97Var) {
        if (this.m) {
            return clone().f(w97Var);
        }
        this.b = w97Var;
        this.a |= 4;
        k();
        return this;
    }

    public final int hashCode() {
        return rm5.B(rm5.B(rm5.B(rm5.B(rm5.B(rm5.B(rm5.B(rm5.A(0, rm5.A(0, rm5.A(1, rm5.A(this.h ? 1 : 0, rm5.A(this.f, rm5.A(this.e, rm5.A(this.d ? 1 : 0, rm5.B(rm5.A(0, rm5.B(rm5.A(0, rm5.B(rm5.A(0, rm5.A(1065353216, 17)), null)), null)), null)))))))), this.b), this.c), this.i), this.j), this.k), this.g), null);
    }

    public final u83 i(int i, int i2) {
        if (this.m) {
            return clone().i(i, i2);
        }
        this.f = i;
        this.e = i2;
        this.a |= NotificationCompat.FLAG_GROUP_SUMMARY;
        k();
        return this;
    }

    public final u83 j() {
        if (this.m) {
            return clone().j();
        }
        this.c = nyg.b;
        this.a |= 8;
        k();
        return this;
    }

    public final void k() {
        if (this.l) {
            qp2.n("You cannot modify locked T, consider clone()");
        }
    }

    public final u83 l(mrf mrfVar) {
        bh7 bh7Var = bh7.b;
        if (this.m) {
            return clone().l(mrfVar);
        }
        qyn.k(mrfVar);
        this.i.b.put(mrfVar, bh7Var);
        k();
        return this;
    }

    public final u83 m(o6f o6fVar) {
        if (this.m) {
            return clone().m(o6fVar);
        }
        this.g = o6fVar;
        this.a |= 1024;
        k();
        return this;
    }

    public final u83 n() {
        if (this.m) {
            return clone().n();
        }
        this.d = false;
        this.a |= NotificationCompat.FLAG_LOCAL_ONLY;
        k();
        return this;
    }

    public final u83 o(b69 b69Var) {
        bh7 bh7Var = bh7.b;
        if (this.m) {
            return clone().o(b69Var);
        }
        l(bh7.e);
        return p(b69Var, true);
    }

    public final u83 p(f2m f2mVar, boolean z) {
        if (this.m) {
            return clone().p(f2mVar, z);
        }
        hl7 hl7Var = new hl7(f2mVar, z);
        q(Bitmap.class, f2mVar, z);
        q(Drawable.class, hl7Var, z);
        q(BitmapDrawable.class, hl7Var, z);
        q(kx9.class, new mx9(f2mVar), z);
        k();
        return this;
    }

    public final u83 q(Class cls, f2m f2mVar, boolean z) {
        if (this.m) {
            return clone().q(cls, f2mVar, z);
        }
        this.j.put(cls, f2mVar);
        int i = this.a;
        this.a = 67584 | i;
        this.n = false;
        if (z) {
            this.a = i | 198656;
            this.h = true;
        }
        k();
        return this;
    }

    public final u83 r() {
        if (this.m) {
            return clone().r();
        }
        this.o = true;
        this.a |= 1048576;
        k();
        return this;
    }
}
