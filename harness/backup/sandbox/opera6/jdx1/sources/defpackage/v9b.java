package defpackage;

import android.os.Build;
import android.view.View;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class v9b extends s75 implements Runnable, bcf, View.OnAttachStateChangeListener {
    public boolean d;
    public int e;
    public g3o f;
    public final see g;
    public final q0g h;
    public final dee i;
    public final puj j;

    public v9b() {
        super(1);
        see seeVar = new see(9);
        m3o.a.getClass();
        seeVar.m(l3o.b, new d4o("caption bar"));
        seeVar.m(l3o.c, new d4o("display cutout"));
        seeVar.m(l3o.d, new d4o("ime"));
        seeVar.m(l3o.e, new d4o("mandatory system gestures"));
        seeVar.m(l3o.f, new d4o("navigation bars"));
        seeVar.m(l3o.g, new d4o("status bars"));
        seeVar.m(l3o.h, new d4o("system gestures"));
        seeVar.m(l3o.i, new d4o("tappable element"));
        seeVar.m(l3o.j, new d4o("waterfall"));
        this.g = seeVar;
        this.h = new q0g(0);
        this.i = new dee(4);
        this.j = new puj();
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0245  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(defpackage.g3o r28) {
        /*
            Method dump skipped, instructions count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v9b.H(g3o):void");
    }

    @Override // defpackage.s75
    public final void h(n2o n2oVar) {
        boolean z = false;
        this.d = false;
        int iD = n2oVar.a.d();
        this.e &= ~iD;
        this.f = null;
        m3o m3oVar = (m3o) o3o.a.e(iD);
        if (m3oVar != null) {
            d4o d4oVar = (d4o) this.g.g(m3oVar);
            d4oVar.c.i(0.0f);
            d4oVar.e.i(1.0f);
            d4oVar.d.i(0L);
            d4oVar.c.i(0.0f);
            d4oVar.b.setValue(Boolean.FALSE);
            d4oVar.j = -1L;
            d4oVar.k = -1L;
            q0g q0gVar = this.h;
            q0gVar.i(q0gVar.h() + 1);
            synchronized (ytj.c) {
                tee teeVar = ytj.j.h;
                if (teeVar != null) {
                    if (teeVar.h()) {
                        z = true;
                    }
                }
            }
            if (z) {
                ytj.c();
            }
        }
    }

    @Override // defpackage.s75
    public final void i(n2o n2oVar) {
        this.d = true;
    }

    @Override // defpackage.s75
    public final g3o j(g3o g3oVar, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            n2o n2oVar = (n2o) list.get(i);
            m3o m3oVar = (m3o) o3o.a.e(n2oVar.a.d());
            if (m3oVar != null) {
                d4o d4oVar = (d4o) this.g.g(m3oVar);
                if (((Boolean) d4oVar.b.getValue()).booleanValue()) {
                    m2o m2oVar = n2oVar.a;
                    d4oVar.c.i(m2oVar.c());
                    d4oVar.e.i(m2oVar.a());
                    d4oVar.d.i(m2oVar.b());
                }
            }
        }
        H(g3oVar);
        return g3oVar;
    }

    @Override // defpackage.s75
    public final mgh k(n2o n2oVar, mgh mghVar) {
        g3o g3oVar = this.f;
        boolean z = false;
        this.d = false;
        this.f = null;
        if (n2oVar.a.b() > 0 && g3oVar != null) {
            int iD = n2oVar.a.d();
            this.e |= iD;
            m3o m3oVar = (m3o) o3o.a.e(iD);
            if (m3oVar != null) {
                d4o d4oVar = (d4o) this.g.g(m3oVar);
                r9b r9bVarI = g3oVar.a.i(iD);
                long j = (r9bVarI.a << 48) | (r9bVarI.b << 32) | (r9bVarI.c << 16) | r9bVarI.d;
                long j2 = d4oVar.h;
                if (!mzg.f(j, j2)) {
                    d4oVar.j = j2;
                    d4oVar.k = j;
                    d4oVar.b.setValue(Boolean.TRUE);
                    m2o m2oVar = n2oVar.a;
                    d4oVar.c.i(m2oVar.c());
                    d4oVar.e.i(m2oVar.a());
                    d4oVar.d.i(m2oVar.b());
                    q0g q0gVar = this.h;
                    q0gVar.i(q0gVar.h() + 1);
                    synchronized (ytj.c) {
                        tee teeVar = ytj.j.h;
                        if (teeVar != null) {
                            if (teeVar.h()) {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        ytj.c();
                        return mghVar;
                    }
                }
            }
        }
        return mghVar;
    }

    @Override // defpackage.bcf
    public final g3o l0(View view, g3o g3oVar) {
        if (this.d) {
            this.f = g3oVar;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return g3oVar;
            }
        } else if (this.e == 0) {
            H(g3oVar);
        }
        return g3oVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = r5n.a;
        h5n.c(view, this);
        n2o.a(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = r5n.a;
        h5n.c(view, null);
        n2o.a(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d) {
            this.e = 0;
            this.d = false;
            g3o g3oVar = this.f;
            if (g3oVar != null) {
                H(g3oVar);
                this.f = null;
            }
        }
    }
}
