package defpackage;

import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.opera.android.BrowserActivity;
import com.opera.android.settings.SettingsManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class bx8 extends PagerAdapter {
    public final BrowserActivity b;
    public final nue c;
    public final kue d;
    public final x5f e;
    public final x5f f;
    public final umi g;
    public final cq5 h;
    public final SettingsManager i;
    public final fqe j;
    public final qie k;
    public final View.OnLongClickListener l;
    public final hx8 m;
    public final kze p;
    public final qq6 q;
    public final pde r;
    public boolean s;
    public boolean t;
    public int u;
    public final ArrayList a = new ArrayList();
    public final u37 n = new u37(new yw8(this));
    public final isd o = new isd((byte) 26);

    public bx8(BrowserActivity browserActivity, nue nueVar, kue kueVar, x5f x5fVar, x5f x5fVar2, umi umiVar, cq5 cq5Var, SettingsManager settingsManager, fqe fqeVar, qie qieVar, View.OnLongClickListener onLongClickListener, kze kzeVar, qq6 qq6Var, pde pdeVar) {
        this.b = browserActivity;
        this.c = nueVar;
        this.d = kueVar;
        this.e = x5fVar;
        this.f = x5fVar2;
        this.g = umiVar;
        this.h = cq5Var;
        this.i = settingsManager;
        this.j = fqeVar;
        this.k = qieVar;
        this.l = onLongClickListener;
        this.m = new hx8(browserActivity, new yw8(this));
        this.p = kzeVar;
        this.q = qq6Var;
        this.r = pdeVar;
    }

    public final int a(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return -1;
            }
            if (((zw8) arrayList.get(i)).a.a().equals(str)) {
                return i;
            }
            i++;
        }
    }

    public final void b(int i, boolean z) {
        xw8 xw8Var = ((zw8) this.a.get(i)).b;
        if (xw8Var == null || xw8Var.D == z) {
            return;
        }
        xw8Var.k(z);
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        zw8 zw8Var = (zw8) obj;
        xw8 xw8Var = zw8Var.b;
        zw8Var.c = xw8Var.f();
        zw8Var.b = null;
        ArrayList arrayList = this.a;
        xw8Var.c(!arrayList.contains(zw8Var));
        viewGroup.removeView(xw8Var.a);
        bwf bwfVar = zw8Var.a;
        hx8 hx8Var = this.m;
        hx8Var.getClass();
        if (bwfVar.a().equals("topnews")) {
            hx8Var.c(null);
        }
        int i2 = this.u;
        if (i2 != i || i2 >= arrayList.size()) {
            return;
        }
        b(this.u, true);
    }

    public final int getCount() {
        return this.a.size();
    }

    public final int getItemPosition(Object obj) {
        int iIndexOf = this.a.indexOf((zw8) obj);
        if (iIndexOf < 0) {
            return -2;
        }
        return iIndexOf;
    }

    public final CharSequence getPageTitle(int i) {
        return ((zw8) this.a.get(i)).a.b();
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        zw8 zw8Var = (zw8) this.a.get(i);
        SparseArray sparseArray = zw8Var.c;
        zw8Var.c = null;
        xw8 xw8Var = new xw8(this.b, this.c, this.d, viewGroup, zw8Var.a, i == 0, sparseArray, this.n, this.o, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.p, this.q, this.r);
        zw8Var.b = xw8Var;
        viewGroup.addView(xw8Var.a);
        bwf bwfVar = zw8Var.a;
        hx8 hx8Var = this.m;
        hx8Var.getClass();
        if (bwfVar.a().equals("topnews")) {
            hx8Var.c(bwfVar);
        }
        if (this.u == i) {
            xw8Var.k(true);
        }
        if (this.s) {
            xw8Var.i(true);
        }
        if (this.t) {
            xw8Var.C = true;
            xw8Var.d();
            xw8Var.h.b(new ix8(xw8Var.D, xw8Var.C));
        }
        return zw8Var;
    }

    public final boolean isViewFromObject(View view, Object obj) {
        xw8 xw8Var = ((zw8) obj).b;
        return xw8Var != null && xw8Var.a.equals(view);
    }

    public final void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        ArrayList arrayList = this.a;
        if (parcelable == null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                zw8 zw8Var = (zw8) obj;
                xw8 xw8Var = zw8Var.b;
                if (xw8Var != null) {
                    xw8Var.A = null;
                    xw8Var.g.x0(0);
                    xw8Var.h.I(null);
                } else {
                    zw8Var.c = null;
                }
            }
            return;
        }
        if (parcelable instanceof ax8) {
            ax8 ax8Var = (ax8) parcelable;
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                zw8 zw8Var2 = (zw8) obj2;
                SparseArray sparseArray = (SparseArray) ax8Var.a.get(zw8Var2.a.a());
                xw8 xw8Var2 = zw8Var2.b;
                if (sparseArray == null) {
                    if (xw8Var2 != null) {
                        xw8Var2.A = null;
                        xw8Var2.g.x0(0);
                        xw8Var2.h.I(null);
                    } else {
                        zw8Var2.c = null;
                    }
                } else if (xw8Var2 == null) {
                    zw8Var2.c = sparseArray;
                } else {
                    xw8Var2.A = sparseArray;
                    if (xw8Var2.i.e) {
                        xw8Var2.a();
                    }
                }
            }
        }
    }

    public final Parcelable saveState() {
        return new ax8(this.a);
    }
}
