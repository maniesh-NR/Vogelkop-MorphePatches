package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class ksk {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ lsk E;
    public final Menu a;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public ff z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public boolean f = true;
    public boolean g = true;

    public ksk(lsk lskVar, Menu menu) {
        this.E = lskVar;
        this.a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        lsk lskVar = this.E;
        Context context = lskVar.c;
        boolean z = false;
        menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
        int i = this.v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.y != null) {
            if (context.isRestricted()) {
                qp2.n("The android:onClick attribute cannot be used within a restricted context");
                return;
            }
            Object objA = lskVar.d;
            if (objA == null) {
                objA = lsk.a(context);
                lskVar.d = objA;
            }
            String str = this.y;
            jsk jskVar = new jsk();
            jskVar.b = objA;
            Class<?> cls = objA.getClass();
            try {
                jskVar.c = cls.getMethod(str, jsk.d);
                menuItem.setOnMenuItemClickListener(jskVar);
            } catch (Exception e) {
                StringBuilder sbS = p3p.s("Couldn't resolve menu item onClick handler ", str, " in class ");
                sbS.append(cls.getName());
                InflateException inflateException = new InflateException(sbS.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.r >= 2) {
            if (menuItem instanceof ptd) {
                ptd ptdVar = (ptd) menuItem;
                ptdVar.x = (ptdVar.x & (-5)) | 4;
            } else if (menuItem instanceof vtd) {
                vtd vtdVar = (vtd) menuItem;
                msk mskVar = vtdVar.o;
                try {
                    Method declaredMethod = vtdVar.p;
                    if (declaredMethod == null) {
                        declaredMethod = mskVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        vtdVar.p = declaredMethod;
                    }
                    declaredMethod.invoke(mskVar, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
        String str2 = this.x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, lsk.e, lskVar.a));
            z = true;
        }
        int i2 = this.w;
        if (i2 > 0 && !z) {
            menuItem.setActionView(i2);
        }
        ff ffVar = this.z;
        if (ffVar != null && (menuItem instanceof msk)) {
            ((msk) menuItem).u(ffVar);
        }
        CharSequence charSequence = this.A;
        boolean z2 = menuItem instanceof msk;
        if (z2) {
            ((msk) menuItem).setContentDescription(charSequence);
        } else {
            menuItem.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z2) {
            ((msk) menuItem).setTooltipText(charSequence2);
        } else {
            menuItem.setTooltipText(charSequence2);
        }
        char c = this.n;
        int i3 = this.o;
        if (z2) {
            ((msk) menuItem).setAlphabeticShortcut(c, i3);
        } else {
            menuItem.setAlphabeticShortcut(c, i3);
        }
        char c2 = this.p;
        int i4 = this.q;
        if (z2) {
            ((msk) menuItem).setNumericShortcut(c2, i4);
        } else {
            menuItem.setNumericShortcut(c2, i4);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z2) {
                ((msk) menuItem).setIconTintMode(mode);
            } else {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z2) {
                ((msk) menuItem).setIconTintList(colorStateList);
            } else {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }
}
