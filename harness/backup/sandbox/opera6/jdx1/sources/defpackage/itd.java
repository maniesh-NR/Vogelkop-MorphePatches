package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class itd implements Menu {
    public static final int[] z = {1, 4, 5, 3, 2, 0};
    public final Context a;
    public final Resources b;
    public boolean c;
    public final boolean d;
    public htd e;
    public final ArrayList f;
    public final ArrayList g;
    public boolean h;
    public final ArrayList i;
    public final ArrayList j;
    public boolean k;
    public jwf m;
    public CharSequence n;
    public Drawable o;
    public View p;
    public ptd w;
    public boolean y;
    public boolean l = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public boolean t = false;
    public final ArrayList u = new ArrayList();
    public final CopyOnWriteArrayList v = new CopyOnWriteArrayList();
    public boolean x = false;

    public itd(Context context) {
        boolean z2 = false;
        this.a = context;
        Resources resources = context.getResources();
        this.b = resources;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = true;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = true;
        if (resources.getConfiguration().keyboard != 1 && ViewConfiguration.get(context).shouldShowMenuShortcutsWhenKeyboardPresent()) {
            z2 = true;
        }
        this.d = z2;
    }

    public final ptd a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            qp2.o("order does not contain a valid category.");
            return null;
        }
        int i6 = (z[i5] << 16) | (65535 & i3);
        ptd ptdVar = new ptd(this, i, i2, i3, i6, charSequence, this.l ? 1 : 0);
        jwf jwfVar = this.m;
        if (jwfVar != null) {
            ptdVar.D = jwfVar;
        }
        ArrayList arrayList = this.f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((ptd) arrayList.get(size)).d <= i6) {
                i4 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i4, ptdVar);
        p(true);
        return ptdVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.b.getString(i4));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            ptd ptdVarA = a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            ptdVarA.setIcon(resolveInfo.loadIcon(packageManager));
            ptdVarA.g = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = ptdVarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        ptd ptdVarA = a(i, i2, i3, charSequence);
        akk akkVar = new akk(this.a, this, ptdVarA);
        ptdVarA.o = akkVar;
        akkVar.setHeaderTitle(ptdVarA.e);
        return akkVar;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(lud ludVar, Context context) {
        this.v.add(new WeakReference(ludVar));
        ludVar.i(context, this);
        this.k = true;
    }

    public final void c(boolean z2) {
        if (this.t) {
            return;
        }
        this.t = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.v;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            lud ludVar = (lud) weakReference.get();
            if (ludVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                ludVar.f(this, z2);
            }
        }
        this.t = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        ptd ptdVar = this.w;
        if (ptdVar != null) {
            d(ptdVar);
        }
        this.f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.o = null;
        this.n = null;
        this.p = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(ptd ptdVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.v;
        boolean zC = false;
        if (!copyOnWriteArrayList.isEmpty() && this.w == ptdVar) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                lud ludVar = (lud) weakReference.get();
                if (ludVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zC = ludVar.c(ptdVar);
                    if (zC) {
                        break;
                    }
                }
            }
            v();
            if (zC) {
                this.w = null;
            }
        }
        return zC;
    }

    public boolean e(itd itdVar, MenuItem menuItem) {
        htd htdVar = this.e;
        return htdVar != null && htdVar.x(itdVar, menuItem);
    }

    public boolean f(ptd ptdVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.v;
        boolean zH = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            lud ludVar = (lud) weakReference.get();
            if (ludVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                zH = ludVar.h(ptdVar);
                if (zH) {
                    break;
                }
            }
        }
        v();
        if (zH) {
            this.w = ptdVar;
        }
        return zH;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ptd ptdVar = (ptd) arrayList.get(i2);
            if (ptdVar.a == i) {
                return ptdVar;
            }
            if (ptdVar.hasSubMenu() && (menuItemFindItem = ptdVar.o.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final ptd g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.u;
        arrayList.clear();
        h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (ptd) arrayList.get(0);
        }
        boolean zN = n();
        for (int i2 = 0; i2 < size; i2++) {
            ptd ptdVar = (ptd) arrayList.get(i2);
            char c = zN ? ptdVar.j : ptdVar.h;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zN && c == '\b' && i == 67))) {
                return ptdVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f.get(i);
    }

    public final void h(ArrayList arrayList, int i, KeyEvent keyEvent) {
        char c;
        int i2;
        boolean zN = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList2 = this.f;
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                ptd ptdVar = (ptd) arrayList2.get(i3);
                if (ptdVar.hasSubMenu()) {
                    ptdVar.o.h(arrayList, i, keyEvent);
                }
                if (zN) {
                    c = ptdVar.j;
                    i2 = ptdVar.k;
                } else {
                    c = ptdVar.h;
                    i2 = ptdVar.i;
                }
                if ((modifiers & 69647) == (i2 & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (zN && c == '\b' && i == 67)) && ptdVar.isEnabled()) {
                        arrayList.add(ptdVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.y) {
            return true;
        }
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((ptd) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListL = l();
        if (this.k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.v;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean zG = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                lud ludVar = (lud) weakReference.get();
                if (ludVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zG |= ludVar.g();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.j;
            if (zG) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListL.size();
                for (int i = 0; i < size; i++) {
                    ptd ptdVar = (ptd) arrayListL.get(i);
                    if ((ptdVar.x & 32) == 32) {
                        arrayList.add(ptdVar);
                    } else {
                        arrayList2.add(ptdVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public itd k() {
        return this;
    }

    public final ArrayList l() {
        boolean z2 = this.h;
        ArrayList arrayList = this.g;
        if (!z2) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            ptd ptdVar = (ptd) arrayList2.get(i);
            if (ptdVar.isVisible()) {
                arrayList.add(ptdVar);
            }
        }
        this.h = false;
        this.k = true;
        return arrayList;
    }

    public boolean m() {
        return this.x;
    }

    public boolean n() {
        return this.c;
    }

    public boolean o() {
        return this.d;
    }

    public final void p(boolean z2) {
        if (this.q) {
            this.r = true;
            if (z2) {
                this.s = true;
                return;
            }
            return;
        }
        if (z2) {
            this.h = true;
            this.k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.v;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            lud ludVar = (lud) weakReference.get();
            if (ludVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                ludVar.e();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return q(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        ptd ptdVarG = g(i, keyEvent);
        boolean zQ = ptdVarG != null ? q(ptdVarG, null, i2) : false;
        if ((i2 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(android.view.MenuItem r7, defpackage.lud r8, int r9) {
        /*
            r6 = this;
            ptd r7 = (defpackage.ptd) r7
            r0 = 0
            if (r7 == 0) goto Lbc
            boolean r1 = r7.isEnabled()
            if (r1 == 0) goto Lbc
            itd r1 = r7.n
            android.view.MenuItem$OnMenuItemClickListener r2 = r7.p
            r3 = 1
            if (r2 == 0) goto L18
            boolean r2 = r2.onMenuItemClick(r7)
            if (r2 != 0) goto L32
        L18:
            boolean r2 = r1.e(r1, r7)
            if (r2 != 0) goto L32
            android.content.Intent r2 = r7.g
            if (r2 == 0) goto L28
            android.content.Context r1 = r1.a     // Catch: android.content.ActivityNotFoundException -> L28
            r1.startActivity(r2)     // Catch: android.content.ActivityNotFoundException -> L28
            goto L32
        L28:
            ff r1 = r7.A
            if (r1 == 0) goto L34
            boolean r1 = r1.e()
            if (r1 == 0) goto L34
        L32:
            r1 = r3
            goto L35
        L34:
            r1 = r0
        L35:
            ff r2 = r7.A
            if (r2 == 0) goto L41
            boolean r4 = r2.a()
            if (r4 == 0) goto L41
            r4 = r3
            goto L42
        L41:
            r4 = r0
        L42:
            boolean r5 = r7.c()
            if (r5 == 0) goto L53
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Lbb
            r6.c(r3)
            goto Lbb
        L53:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L62
            if (r4 != 0) goto L62
            r9 = r9 & r3
            if (r9 != 0) goto Lbb
            r6.c(r3)
            goto Lbb
        L62:
            r9 = r9 & 4
            if (r9 != 0) goto L69
            r6.c(r0)
        L69:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L7d
            akk r9 = new akk
            android.content.Context r5 = r6.a
            r9.<init>(r5, r6, r7)
            r7.o = r9
            java.lang.CharSequence r5 = r7.e
            r9.setHeaderTitle(r5)
        L7d:
            akk r7 = r7.o
            if (r4 == 0) goto L84
            r2.f(r7)
        L84:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.v
            boolean r2 = r9.isEmpty()
            if (r2 != 0) goto Lb5
            if (r8 == 0) goto L92
            boolean r0 = r8.b(r7)
        L92:
            java.util.Iterator r8 = r9.iterator()
        L96:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto Lb5
            java.lang.Object r2 = r8.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r4 = r2.get()
            lud r4 = (defpackage.lud) r4
            if (r4 != 0) goto Lae
            r9.remove(r2)
            goto L96
        Lae:
            if (r0 != 0) goto L96
            boolean r0 = r4.b(r7)
            goto L96
        Lb5:
            r1 = r1 | r0
            if (r1 != 0) goto Lbb
            r6.c(r3)
        Lbb:
            return r1
        Lbc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.itd.q(android.view.MenuItem, lud, int):boolean");
    }

    public final void r(lud ludVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.v;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            lud ludVar2 = (lud) weakReference.get();
            if (ludVar2 == null || ludVar2 == ludVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((ptd) arrayList.get(i3)).b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((ptd) arrayList.get(i3)).b != i) {
                    break;
                }
                if (i3 >= 0 && i3 < arrayList.size()) {
                    arrayList.remove(i3);
                }
                i2 = i4;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((ptd) arrayList.get(i2)).a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i2);
        p(true);
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle != null) {
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
            int size = this.f.size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (actionView != null && actionView.getId() != -1) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((akk) item.getSubMenu()).s(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
                return;
            }
            menuItemFindItem.expandActionView();
        }
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z2, boolean z3) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ptd ptdVar = (ptd) arrayList.get(i2);
            if (ptdVar.b == i) {
                ptdVar.x = (ptdVar.x & (-5)) | (z3 ? 4 : 0);
                ptdVar.setCheckable(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.x = z2;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z2) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ptd ptdVar = (ptd) arrayList.get(i2);
            if (ptdVar.b == i) {
                ptdVar.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z2) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            ptd ptdVar = (ptd) arrayList.get(i2);
            if (ptdVar.b == i) {
                int i3 = ptdVar.x;
                int i4 = (i3 & (-9)) | (z2 ? 0 : 8);
                ptdVar.x = i4;
                if (i3 != i4) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.c = z2;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((akk) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.p = view;
            this.n = null;
            this.o = null;
        } else {
            if (i > 0) {
                this.n = this.b.getText(i);
            } else if (charSequence != null) {
                this.n = charSequence;
            }
            if (i2 > 0) {
                this.o = this.a.getDrawable(i2);
            } else if (drawable != null) {
                this.o = drawable;
            }
            this.p = null;
        }
        p(false);
    }

    public final void v() {
        this.q = false;
        if (this.r) {
            this.r = false;
            p(this.s);
        }
    }

    public final void w() {
        if (this.q) {
            return;
        }
        this.q = true;
        this.r = false;
        this.s = false;
    }
}
