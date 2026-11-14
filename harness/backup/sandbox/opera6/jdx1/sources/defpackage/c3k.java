package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class c3k extends se implements htd {
    public Context c;
    public ActionBarContextView d;
    public z8b e;
    public WeakReference f;
    public boolean g;
    public itd h;

    @Override // defpackage.se
    public final void a() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.e.p(this);
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
        return this.h;
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
        this.e.v(this, this.h);
    }

    @Override // defpackage.se
    public final boolean h() {
        return this.d.s;
    }

    @Override // defpackage.se
    public final void i(View view) {
        this.d.i(view);
        this.f = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.se
    public final void j(int i) {
        k(this.c.getString(i));
    }

    @Override // defpackage.se
    public final void k(CharSequence charSequence) {
        ActionBarContextView actionBarContextView = this.d;
        actionBarContextView.j = charSequence;
        actionBarContextView.d();
    }

    @Override // defpackage.se
    public final void l(int i) {
        m(this.c.getString(i));
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
        g();
        ne neVar = this.d.d;
        if (neVar != null) {
            neVar.l();
        }
    }

    @Override // defpackage.htd
    public final boolean x(itd itdVar, MenuItem menuItem) {
        return ((re) this.e.a).k(this, menuItem);
    }
}
