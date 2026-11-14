package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class b3k extends se implements htd {
    public final Context c;
    public final ActionBarContextView d;
    public final itd e;
    public re f;
    public WeakReference g;

    public b3k(Context context, ActionBarContextView actionBarContextView, re reVar) {
        this.c = context;
        this.d = actionBarContextView;
        this.f = reVar;
        itd itdVar = new itd(context);
        itdVar.l = true;
        this.e = itdVar;
        itdVar.e = this;
    }

    @Override // defpackage.se
    public final void a() {
        this.f.p(this);
        this.f = null;
        ActionBarContextView actionBarContextView = this.d;
        actionBarContextView.e();
        actionBarContextView.setVisibility(8);
    }

    @Override // defpackage.se
    public final View b() {
        WeakReference weakReference = this.g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.se
    public final itd c() {
        return this.e;
    }

    @Override // defpackage.se
    public final MenuInflater d() {
        return new lsk(this.d.getContext());
    }

    @Override // defpackage.se
    public final CharSequence e() {
        return this.d.j;
    }

    @Override // defpackage.se
    public final CharSequence f() {
        return this.d.i;
    }

    @Override // defpackage.se
    public final void g() {
        itd itdVar = this.e;
        itdVar.w();
        try {
            this.f.v(this, itdVar);
        } finally {
            itdVar.v();
        }
    }

    @Override // defpackage.se
    public final boolean h() {
        return this.d.s;
    }

    @Override // defpackage.se
    public final void i(View view) {
        this.d.i(view);
        this.g = new WeakReference(view);
    }

    @Override // defpackage.se
    public final void j(int i) {
        k(this.c.getResources().getString(i));
    }

    @Override // defpackage.se
    public final void k(CharSequence charSequence) {
        ActionBarContextView actionBarContextView = this.d;
        actionBarContextView.j = charSequence;
        actionBarContextView.d();
    }

    @Override // defpackage.se
    public final void l(int i) {
        m(this.c.getResources().getString(i));
    }

    @Override // defpackage.se
    public final void m(CharSequence charSequence) {
        ActionBarContextView actionBarContextView = this.d;
        actionBarContextView.i = charSequence;
        actionBarContextView.d();
        r5n.m(actionBarContextView, charSequence);
    }

    @Override // defpackage.se
    public final void n(boolean z) {
        this.b = z;
        ActionBarContextView actionBarContextView = this.d;
        if (z != actionBarContextView.s) {
            actionBarContextView.requestLayout();
        }
        actionBarContextView.s = z;
    }

    @Override // defpackage.htd
    public final void s(itd itdVar) {
        if (this.f != null) {
            g();
            ne neVar = this.d.d;
            if (neVar != null) {
                neVar.l();
            }
        }
    }

    @Override // defpackage.htd
    public final boolean x(itd itdVar, MenuItem menuItem) {
        re reVar = this.f;
        if (reVar != null) {
            return reVar.k(this, menuItem);
        }
        return false;
    }
}
