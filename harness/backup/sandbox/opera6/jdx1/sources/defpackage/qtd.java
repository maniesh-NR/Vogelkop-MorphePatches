package defpackage;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class qtd implements MenuItem {
    public final int a;
    public final int b;
    public final int c;
    public CharSequence d;
    public CharSequence e;
    public char f;
    public char g;
    public Drawable h;
    public final bud j;
    public MenuItem.OnMenuItemClickListener k;
    public int i = 0;
    public int l = 16;

    public qtd(bud budVar, int i, int i2, int i3, CharSequence charSequence) {
        this.j = budVar;
        this.a = i2;
        this.b = i;
        this.c = i3;
        this.d = charSequence;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        return null;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.g;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.h;
        if (drawable != null) {
            return drawable;
        }
        if (this.i == 0) {
            return null;
        }
        this.i = 0;
        Drawable drawableF = sgb.F(0, this.j.a);
        this.h = drawableF;
        return drawableF;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return null;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.j;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.d;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.e;
        return charSequence != null ? charSequence : this.d;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.j instanceof SubMenu;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.l & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.l & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.l & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.l & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.g == c) {
            return this;
        }
        this.g = Character.toLowerCase(c);
        this.j.d(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.l;
        int i2 = (i & (-2)) | (z ? 1 : 0);
        this.l = i2;
        if (i != i2) {
            this.j.d(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        int i = this.l;
        int i2 = i & 4;
        bud budVar = this.j;
        if (i2 != 0) {
            ArrayList arrayList = budVar.b;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                MenuItem menuItem = (MenuItem) obj;
                qtd qtdVar = (qtd) menuItem;
                if (menuItem.getGroupId() == this.b && (qtdVar.l & 4) != 0 && qtdVar.isCheckable()) {
                    boolean z2 = menuItem == this;
                    int i4 = qtdVar.l;
                    int i5 = (i4 & (-3)) | (z2 ? 2 : 0);
                    qtdVar.l = i5;
                    if (i4 != i5) {
                        qtdVar.j.d(false);
                    }
                }
            }
        } else {
            int i6 = (i & (-3)) | (z ? 2 : 0);
            this.l = i6;
            if (i != i6) {
                budVar.d(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        int i = this.l;
        if (z) {
            this.l = i | 16;
        } else {
            this.l = i & (-17);
        }
        this.j.d(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.h = null;
        this.i = i;
        this.j.d(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.i = 0;
        this.h = drawable;
        this.j.d(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.f == c) {
            return this;
        }
        this.f = c;
        this.j.d(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.k = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f = c;
        this.g = Character.toLowerCase(c2);
        this.j.d(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.j.a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.d = charSequence;
        this.j.d(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.e = charSequence;
        this.j.d(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i = this.l;
        int i2 = (i & (-9)) | (z ? 0 : 8);
        this.l = i2;
        if (i != i2) {
            this.j.d(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.d;
        return charSequence != null ? charSequence.toString() : "";
    }
}
