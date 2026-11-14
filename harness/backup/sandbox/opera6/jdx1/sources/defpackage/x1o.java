package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class x1o extends se implements htd {
    public final Context c;
    public final itd d;
    public z8b e;
    public WeakReference f;
    public final /* synthetic */ y1o g;

    public x1o(y1o y1oVar, Context context, z8b z8bVar) {
        this.g = y1oVar;
        this.c = context;
        this.e = z8bVar;
        itd itdVar = new itd(context);
        itdVar.l = true;
        this.d = itdVar;
        itdVar.e = this;
    }

    @Override // defpackage.se
    public final void a() {
        y1o y1oVar = this.g;
        if (y1oVar.j != this) {
            return;
        }
        boolean z = y1oVar.q;
        boolean z2 = y1oVar.r;
        if (z || z2) {
            y1oVar.k = this;
            y1oVar.l = this.e;
        } else {
            this.e.p(this);
        }
        this.e = null;
        y1oVar.w(false);
        ActionBarContextView actionBarContextView = y1oVar.g;
        if (actionBarContextView.k == null) {
            actionBarContextView.e();
        }
        y1oVar.d.j(y1oVar.w);
        y1oVar.j = null;
    }

    @Override // defpackage.se
    public final View b() {
        WeakReference weakReference = this.f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.se
    public final itd c() {
        return this.d;
    }

    @Override // defpackage.se
    public final MenuInflater d() {
        return new lsk(this.c);
    }

    @Override // defpackage.se
    public final CharSequence e() {
        return this.g.g.j;
    }

    @Override // defpackage.se
    public final CharSequence f() {
        return this.g.g.i;
    }

    @Override // defpackage.se
    public final void g() {
        if (this.g.j != this) {
            return;
        }
        itd itdVar = this.d;
        itdVar.w();
        try {
            this.e.v(this, itdVar);
        } finally {
            itdVar.v();
        }
    }

    @Override // defpackage.se
    public final boolean h() {
        return this.g.g.s;
    }

    @Override // defpackage.se
    public final void i(View view) {
        this.g.g.i(view);
        this.f = new WeakReference(view);
    }

    @Override // defpackage.se
    public final void j(int i) {
        k(this.g.a.getResources().getString(i));
    }

    @Override // defpackage.se
    public final void k(CharSequence charSequence) {
        ActionBarContextView actionBarContextView = this.g.g;
        actionBarContextView.j = charSequence;
        actionBarContextView.d();
    }

    @Override // defpackage.se
    public final void l(int i) {
        m(this.g.a.getResources().getString(i));
    }

    @Override // defpackage.se
    public final void m(CharSequence charSequence) {
        ActionBarContextView actionBarContextView = this.g.g;
        actionBarContextView.i = charSequence;
        actionBarContextView.d();
        r5n.m(actionBarContextView, charSequence);
    }

    @Override // defpackage.se
    public final void n(boolean z) {
        this.b = z;
        ActionBarContextView actionBarContextView = this.g.g;
        if (z != actionBarContextView.s) {
            actionBarContextView.requestLayout();
        }
        actionBarContextView.s = z;
    }

    @Override // defpackage.htd
    public final void s(itd itdVar) {
        if (this.e != null) {
            g();
            ne neVar = this.g.g.d;
            if (neVar != null) {
                neVar.l();
            }
        }
    }

    @Override // defpackage.htd
    public final boolean x(itd itdVar, MenuItem menuItem) {
        z8b z8bVar = this.e;
        if (z8bVar != null) {
            return ((re) z8bVar.a).k(this, menuItem);
        }
        return false;
    }
}
