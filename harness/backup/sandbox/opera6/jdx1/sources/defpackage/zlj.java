package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zlj {
    public static final boolean y = Log.isLoggable("Request", 2);
    public final abk a;
    public final Object b;
    public final Context c;
    public final ry9 d;
    public final Object e;
    public final Class f;
    public final uvh g;
    public final int h;
    public final int i;
    public final nyg j;
    public final zbl k;
    public final ArrayList l;
    public final ir5 m;
    public final ng8 n;
    public kyh o;
    public ua7 p;
    public volatile f38 q;
    public Drawable r;
    public Drawable s;
    public Drawable t;
    public int u;
    public int v;
    public boolean w;
    public int x;

    public zlj(Context context, ry9 ry9Var, Object obj, Object obj2, Class cls, uvh uvhVar, int i, int i2, nyg nygVar, zbl zblVar, ArrayList arrayList, f38 f38Var, ng8 ng8Var) {
        ir5 ir5Var = jye.a;
        if (y) {
            String.valueOf(hashCode());
        }
        this.a = new abk();
        this.b = obj;
        this.c = context;
        this.d = ry9Var;
        this.e = obj2;
        this.f = cls;
        this.g = uvhVar;
        this.h = i;
        this.i = i2;
        this.j = nygVar;
        this.k = zblVar;
        this.l = arrayList;
        this.q = f38Var;
        this.m = ir5Var;
        this.n = ng8Var;
        this.x = 1;
        ry9Var.getClass();
    }

    public final void a() {
        synchronized (this.b) {
            if (this.w) {
                throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            }
            this.a.a();
            SystemClock.elapsedRealtimeNanos();
            if (this.e == null) {
                if (rm5.E(this.h, this.i)) {
                    this.u = this.h;
                    this.v = this.i;
                }
                Drawable drawable = this.t;
                if (drawable == null) {
                    this.g.getClass();
                    drawable = null;
                    this.t = null;
                }
                g(new ty9("Received null model"), drawable == null ? 5 : 3);
                return;
            }
            int i = this.x;
            if (i == 2) {
                throw new IllegalArgumentException("Cannot restart a running request");
            }
            if (i == 4) {
                h(this.o, 5);
                return;
            }
            this.x = 3;
            if (rm5.E(this.h, this.i)) {
                j(this.h, this.i);
            } else {
                this.k.f(this);
            }
            int i2 = this.x;
            if (i2 == 2 || i2 == 3) {
                zbl zblVar = this.k;
                d();
                zblVar.getClass();
            }
            if (y) {
                SystemClock.elapsedRealtimeNanos();
            }
        }
    }

    public final void b() {
        if (this.w) {
            qp2.n("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            return;
        }
        this.a.a();
        this.k.a(this);
        ua7 ua7Var = this.p;
        if (ua7Var != null) {
            synchronized (((f38) ua7Var.d)) {
                ((r38) ua7Var.b).g((zlj) ua7Var.c);
            }
            this.p = null;
        }
    }

    public final void c() {
        synchronized (this.b) {
            if (this.w) {
                throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            }
            this.a.a();
            if (this.x == 6) {
                return;
            }
            b();
            kyh kyhVar = this.o;
            if (kyhVar != null) {
                this.o = null;
            } else {
                kyhVar = null;
            }
            this.k.e(d());
            this.x = 6;
            if (kyhVar != null) {
                this.q.getClass();
                f38.e(kyhVar);
            }
        }
    }

    public final Drawable d() {
        Drawable drawable = this.s;
        if (drawable != null) {
            return drawable;
        }
        this.g.getClass();
        this.s = null;
        return null;
    }

    public final boolean e() {
        boolean z;
        synchronized (this.b) {
            z = this.x == 4;
        }
        return z;
    }

    public final boolean f() {
        boolean z;
        synchronized (this.b) {
            int i = this.x;
            z = i == 2 || i == 3;
        }
        return z;
    }

    public final void g(ty9 ty9Var, int i) {
        Drawable drawable;
        this.a.a();
        synchronized (this.b) {
            ty9Var.getClass();
            byte b = this.d.g;
            if (b <= i) {
                Objects.toString(this.e);
                if (b <= 4) {
                    ArrayList arrayList = new ArrayList();
                    ty9.d(ty9Var, arrayList);
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        int i3 = i2 + 1;
                        i2 = i3;
                    }
                }
            }
            Drawable drawable2 = null;
            this.p = null;
            this.x = 5;
            this.w = true;
            try {
                ArrayList arrayList2 = this.l;
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                }
                if (this.e != null) {
                    drawable = null;
                } else {
                    drawable = this.t;
                    if (drawable == null) {
                        this.g.getClass();
                        this.t = null;
                        drawable = null;
                    }
                }
                if (drawable == null) {
                    Drawable drawable3 = this.r;
                    if (drawable3 == null) {
                        this.g.getClass();
                        this.r = null;
                    } else {
                        drawable2 = drawable3;
                    }
                    drawable = drawable2;
                }
                if (drawable == null) {
                    d();
                }
                this.k.d();
            } finally {
                this.w = false;
            }
        }
    }

    public final void h(kyh kyhVar, int i) {
        this.a.a();
        kyh kyhVar2 = null;
        try {
            synchronized (this.b) {
                try {
                    this.p = null;
                    if (kyhVar == null) {
                        g(new ty9("Expected to receive a Resource<R> with an object of " + this.f + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = kyhVar.get();
                    if (obj != null && this.f.isAssignableFrom(obj.getClass())) {
                        i(kyhVar, obj, i);
                        return;
                    }
                    try {
                        this.o = null;
                        StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                        sb.append(this.f);
                        sb.append(" but instead got ");
                        sb.append(obj != null ? obj.getClass() : "");
                        sb.append("{");
                        sb.append(obj);
                        sb.append("} inside Resource{");
                        sb.append(kyhVar);
                        sb.append("}.");
                        sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        g(new ty9(sb.toString()), 5);
                        this.q.getClass();
                        f38.e(kyhVar);
                    } catch (Throwable th) {
                        kyhVar2 = kyhVar;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (kyhVar2 != null) {
                this.q.getClass();
                f38.e(kyhVar2);
            }
            throw th3;
        }
    }

    public final void i(kyh kyhVar, Object obj, int i) {
        this.x = 4;
        this.o = kyhVar;
        if (this.d.g <= 3) {
            Objects.toString(this.e);
            SystemClock.elapsedRealtimeNanos();
        }
        this.w = true;
        try {
            ArrayList arrayList = this.l;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
            this.m.getClass();
            this.k.b(obj);
        } finally {
            this.w = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    public final void j(int i, int i2) throws Throwable {
        ?? r1 = i;
        this.a.a();
        Object obj = this.b;
        synchronized (obj) {
            try {
                try {
                    boolean z = y;
                    if (z) {
                        SystemClock.elapsedRealtimeNanos();
                    }
                    if (this.x != 3) {
                        return;
                    }
                    this.x = 2;
                    this.g.getClass();
                    int iRound = r1;
                    if (r1 != -2147483648) {
                        iRound = Math.round(((float) r1) * 1.0f);
                    }
                    this.u = iRound;
                    this.v = i2 == Integer.MIN_VALUE ? i2 : Math.round(1.0f * i2);
                    if (z) {
                        SystemClock.elapsedRealtimeNanos();
                    }
                    f38 f38Var = this.q;
                    ry9 ry9Var = this.d;
                    Object obj2 = this.e;
                    uvh uvhVar = this.g;
                    this.p = f38Var.a(ry9Var, obj2, uvhVar.g, this.u, this.v, uvhVar.k, this.f, this.j, uvhVar.b, uvhVar.j, uvhVar.h, uvhVar.n, uvhVar.i, uvhVar.d, uvhVar.o, this, this.n);
                    if (this.x != 2) {
                        this.p = null;
                    }
                    if (z) {
                        SystemClock.elapsedRealtimeNanos();
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                r1 = obj;
                throw th;
            }
        }
    }
}
