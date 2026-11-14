package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import com.opera.android.ui.catalog.widget.OperaListItem;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class bud implements Menu {
    public final Context a;
    public final ArrayList b = new ArrayList();
    public eog c;

    public bud(Context context) {
        this.a = context;
    }

    public final qtd a(int i, int i2, int i3, CharSequence charSequence) {
        qtd qtdVar = new qtd(this, i, i2, i3, charSequence);
        b(i, i3, qtdVar);
        return qtdVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(1, 0, 0, this.a.getResources().getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.a.getResources().getString(i4));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(1, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        return 0;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return c(1, 0, 0, this.a.getResources().getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return c(i, i2, i3, this.a.getResources().getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return c(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return c(1, 0, 0, charSequence);
    }

    public final void b(int i, int i2, qtd qtdVar) {
        ArrayList arrayList;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            arrayList = this.b;
            if (i4 >= arrayList.size()) {
                break;
            }
            if (((MenuItem) arrayList.get(i4)).getGroupId() == i) {
                i3 = i4;
                break;
            }
            i4++;
        }
        while (i3 < arrayList.size() && i2 >= ((MenuItem) arrayList.get(i3)).getOrder()) {
            i3++;
        }
        arrayList.add(i3, qtdVar);
        d(true);
    }

    public final bkk c(int i, int i2, int i3, CharSequence charSequence) {
        bkk bkkVar = new bkk(this.a, i, i2, i3, charSequence);
        b(i, i3, bkkVar.d);
        return bkkVar;
    }

    @Override // android.view.Menu
    public final void clear() {
        this.b.clear();
        d(true);
    }

    @Override // android.view.Menu
    public final void close() {
        eog eogVar = this.c;
        if (eogVar == null || eogVar.f == null) {
            return;
        }
        eogVar.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.view.View, androidx.constraintlayout.widget.ConstraintLayout, com.opera.android.ui.catalog.widget.OperaListItem] */
    public final void d(boolean z) {
        eog eogVar = this.c;
        if (eogVar == null || eogVar.f == null) {
            return;
        }
        int i = 0;
        ArrayList arrayList = this.b;
        if (!z) {
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                MenuItem menuItem = (MenuItem) obj;
                OperaListItem operaListItem = (OperaListItem) eogVar.g.findViewById(menuItem.getItemId());
                eog.k0(operaListItem, menuItem);
                operaListItem.t(menuItem.isChecked());
            }
            return;
        }
        eogVar.g.removeAllViews();
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            MenuItem menuItem2 = (MenuItem) obj2;
            if (menuItem2.isVisible()) {
                ?? r4 = (OperaListItem) eogVar.e.inflate(2131559191, eogVar.g, false);
                if (menuItem2.getIcon() != null) {
                    r4.y(new plf());
                    r4.v(new mxh(menuItem2.getIcon()));
                }
                r4.setId(menuItem2.getItemId());
                eog.k0(r4, menuItem2);
                if (menuItem2.isCheckable()) {
                    r4.B(new bmf());
                    r4.setChecked(menuItem2.isChecked());
                    r4.u = new mgf((Object) eogVar, (Object) menuItem2, (byte) 7);
                } else {
                    r4.B(amf.l);
                }
                r4.setOnClickListener(new wke(eogVar, menuItem2));
                eogVar.g.addView(r4);
            }
        }
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            MenuItem menuItem = (MenuItem) obj;
            if (menuItem.getItemId() == i) {
                return menuItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.b;
        if (i < arrayList.size()) {
            return (MenuItem) arrayList.get(i);
        }
        return null;
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((MenuItem) obj).isVisible()) {
                return true;
            }
        }
        return true;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return false;
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return false;
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (((MenuItem) it.next()).getGroupId() == i) {
                it.remove();
            }
        }
        d(true);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        MenuItem menuItemFindItem = findItem(i);
        if (menuItemFindItem == null) {
            return;
        }
        this.b.remove(menuItemFindItem);
        d(true);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            qtd qtdVar = (MenuItem) obj;
            if (qtdVar.b == i) {
                qtdVar.l = (qtdVar.l & (-5)) | (z2 ? 4 : 0);
                qtdVar.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            MenuItem menuItem = (MenuItem) obj;
            if (menuItem.getGroupId() == i) {
                menuItem.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            MenuItem menuItem = (MenuItem) obj;
            if (menuItem.getGroupId() == i) {
                menuItem.setVisible(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
    }

    @Override // android.view.Menu
    public final int size() {
        return this.b.size();
    }
}
