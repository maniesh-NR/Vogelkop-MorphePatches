package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public final class bkk extends bud implements SubMenu {
    public final qtd d;

    public bkk(Context context, int i, int i2, int i3, CharSequence charSequence) {
        super(context);
        this.d = new qtd(this, i, i2, i3, charSequence);
    }

    @Override // android.view.SubMenu
    public final void clearHeader() {
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.d;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.d.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.d.setIcon(drawable);
        return this;
    }
}
