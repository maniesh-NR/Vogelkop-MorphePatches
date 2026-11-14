package defpackage;

import android.os.Build;
import android.view.View;
import java.util.List;

/* loaded from: classes.dex */
public final class w9b extends s75 implements Runnable, bcf, View.OnAttachStateChangeListener {
    public final k3o d;
    public boolean e;
    public boolean f;
    public g3o g;

    public w9b(k3o k3oVar) {
        super(!k3oVar.u ? 1 : 0);
        this.d = k3oVar;
    }

    @Override // defpackage.s75
    public final void h(n2o n2oVar) {
        this.e = false;
        this.f = false;
        g3o g3oVar = this.g;
        if (n2oVar.a.b() > 0 && g3oVar != null) {
            d3o d3oVar = g3oVar.a;
            k3o k3oVar = this.d;
            k3oVar.t.f(y4h.r(d3oVar.i(8)));
            k3oVar.s.f(y4h.r(d3oVar.i(8)));
            k3o.b(k3oVar, g3oVar);
        }
        this.g = null;
    }

    @Override // defpackage.s75
    public final void i(n2o n2oVar) {
        this.e = true;
        this.f = true;
    }

    @Override // defpackage.s75
    public final g3o j(g3o g3oVar, List list) {
        k3o k3oVar = this.d;
        k3o.b(k3oVar, g3oVar);
        return k3oVar.u ? g3o.b : g3oVar;
    }

    @Override // defpackage.s75
    public final mgh k(n2o n2oVar, mgh mghVar) {
        this.e = false;
        return mghVar;
    }

    @Override // defpackage.bcf
    public final g3o l0(View view, g3o g3oVar) {
        this.g = g3oVar;
        k3o k3oVar = this.d;
        i0n i0nVar = k3oVar.s;
        d3o d3oVar = g3oVar.a;
        i0nVar.f(y4h.r(d3oVar.i(8)));
        if (this.e) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f) {
            k3oVar.t.f(y4h.r(d3oVar.i(8)));
            k3o.b(k3oVar, g3oVar);
        }
        return k3oVar.u ? g3o.b : g3oVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.e) {
            this.e = false;
            this.f = false;
            g3o g3oVar = this.g;
            if (g3oVar != null) {
                k3o k3oVar = this.d;
                k3oVar.t.f(y4h.r(g3oVar.a.i(8)));
                k3o.b(k3oVar, g3oVar);
                this.g = null;
            }
        }
    }
}
