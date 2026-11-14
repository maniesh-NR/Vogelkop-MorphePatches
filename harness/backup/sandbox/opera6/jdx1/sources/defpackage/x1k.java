package defpackage;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class x1k {
    public static final fo7 p = new fo7(1);
    public static final fo7 q = new fo7(2);
    public static final fo7 r = new fo7(3);
    public static final fo7 s = new fo7(4);
    public static final fo7 t = new fo7(5);
    public static final fo7 u = new fo7(0);
    public float a;
    public float b;
    public boolean c;
    public final Object d;
    public final i41 e;
    public boolean f;
    public float g;
    public float h;
    public long i;
    public float j;
    public final ArrayList k;
    public final ArrayList l;
    public y1k m;
    public float n;
    public boolean o;

    public x1k(dz7 dz7Var) {
        this.a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.i = 0L;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = null;
        this.e = new go7(dz7Var);
        this.j = 1.0f;
        this.m = null;
        this.n = Float.MAX_VALUE;
        this.o = false;
    }

    public x1k(Object obj, i41 i41Var) {
        this.a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.i = 0L;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = obj;
        this.e = i41Var;
        if (i41Var == r || i41Var == s || i41Var == t) {
            this.j = 0.1f;
        } else if (i41Var == u) {
            this.j = 0.00390625f;
        } else if (i41Var == p || i41Var == q) {
            this.j = 0.002f;
        } else {
            this.j = 1.0f;
        }
        this.m = null;
        this.n = Float.MAX_VALUE;
        this.o = false;
    }

    public static se1 b() {
        ThreadLocal threadLocal = se1.i;
        if (threadLocal.get() == null) {
            threadLocal.set(new se1(new c37((byte) 4)));
        }
        return (se1) threadLocal.get();
    }

    public final void a(float f) {
        if (this.f) {
            this.n = f;
            return;
        }
        y1k y1kVar = this.m;
        if (y1kVar == null) {
            y1kVar = new y1k(f);
            this.m = y1kVar;
        }
        double d = f;
        y1kVar.i = d;
        double d2 = (float) d;
        if (d2 > this.g) {
            yt7.k("Final position of the spring cannot be greater than the max value.");
            return;
        }
        if (d2 < this.h) {
            yt7.k("Final position of the spring cannot be less than the min value.");
            return;
        }
        double dAbs = Math.abs(this.j * 0.75f);
        y1kVar.d = dAbs;
        y1kVar.e = dAbs * 62.5d;
        if (Thread.currentThread() != ((Looper) b().e.b).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z = this.f;
        if (z || z) {
            return;
        }
        this.f = true;
        if (!this.c) {
            this.b = this.e.C(this.d);
        }
        float f2 = this.b;
        if (f2 > this.g || f2 < this.h) {
            qp2.o("Starting value need to be in between min value and max value");
        } else {
            b().a(this);
        }
    }

    public final void c(float f) {
        if (f > 0.0f) {
            this.j = f;
        } else {
            qp2.o("Minimum visible change must be positive.");
        }
    }

    public final void d(float f) {
        ArrayList arrayList;
        this.e.i0(this.d, f);
        int i = 0;
        while (true) {
            arrayList = this.l;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                t2m t2mVar = (t2m) arrayList.get(i);
                float f2 = this.b;
                j3m j3mVar = t2mVar.h;
                long jMax = Math.max(-1L, Math.min(j3mVar.y + 1, Math.round(f2)));
                j3mVar.G(jMax, t2mVar.a);
                t2mVar.a = jMax;
            }
            i++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void e() {
        if (this.m.b <= 0.0d) {
            yt7.k("Spring animations can only come to an end when there is damping");
            return;
        }
        if (Thread.currentThread() != ((Looper) b().e.b).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f) {
            this.o = true;
        }
    }
}
