package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public final class akk extends itd implements SubMenu {
    public final itd A;
    public final ptd B;

    public akk(Context context, itd itdVar, ptd ptdVar) {
        super(context);
        this.A = itdVar;
        this.B = ptdVar;
    }

    @Override // defpackage.itd
    public final boolean d(ptd ptdVar) {
        return this.A.d(ptdVar);
    }

    @Override // defpackage.itd
    public final boolean e(itd itdVar, MenuItem menuItem) {
        return super.e(itdVar, menuItem) || this.A.e(itdVar, menuItem);
    }

    @Override // defpackage.itd
    public final boolean f(ptd ptdVar) {
        return this.A.f(ptdVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.B;
    }

    @Override // defpackage.itd
    public final String j() {
        int i = this.B.a;
        if (i == 0) {
            return null;
        }
        return sko.i(i, "android:menu:actionviewstates:");
    }

    @Override // defpackage.itd
    public final itd k() {
        return this.A.k();
    }

    @Override // defpackage.itd
    public final boolean m() {
        return this.A.m();
    }

    @Override // defpackage.itd
    public final boolean n() {
        return this.A.n();
    }

    @Override // defpackage.itd
    public final boolean o() {
        return this.A.o();
    }

    @Override // defpackage.itd, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.A.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        u(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.B.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.B.setIcon(drawable);
        return this;
    }

    @Override // defpackage.itd, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.A.setQwertyMode(z);
    }
}
