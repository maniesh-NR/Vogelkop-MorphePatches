package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class dqj {
    public static final omj g = new omj((byte) 1);
    public static final omj h = new omj((byte) 2);
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public final Object f;

    public dqj() {
        this.f = new cqj[5];
        this.a = new ArrayList();
        this.b = -1;
    }

    public dqj(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f = staggeredGridLayoutManager;
        this.a = new ArrayList();
        this.b = LinearLayoutManager.INVALID_OFFSET;
        this.c = LinearLayoutManager.INVALID_OFFSET;
        this.d = 0;
        this.e = i;
    }

    public final void a(int i, float f) {
        cqj cqjVar;
        cqj[] cqjVarArr = (cqj[]) this.f;
        int i2 = this.b;
        ArrayList arrayList = this.a;
        if (i2 != 1) {
            Collections.sort(arrayList, g);
            this.b = 1;
        }
        int i3 = this.e;
        if (i3 > 0) {
            int i4 = i3 - 1;
            this.e = i4;
            cqjVar = cqjVarArr[i4];
        } else {
            cqjVar = new cqj();
        }
        int i5 = this.c;
        this.c = i5 + 1;
        cqjVar.a = i5;
        cqjVar.b = i;
        cqjVar.c = f;
        arrayList.add(cqjVar);
        this.d += i;
        while (true) {
            int i6 = this.d;
            if (i6 <= 2000) {
                return;
            }
            int i7 = i6 - 2000;
            cqj cqjVar2 = (cqj) arrayList.get(0);
            int i8 = cqjVar2.b;
            if (i8 <= i7) {
                this.d -= i8;
                arrayList.remove(0);
                int i9 = this.e;
                if (i9 < 5) {
                    this.e = i9 + 1;
                    cqjVarArr[i9] = cqjVar2;
                }
            } else {
                cqjVar2.b = i8 - i7;
                this.d -= i7;
            }
        }
    }

    public final void b(View view) {
        y2k y2kVar = (y2k) view.getLayoutParams();
        y2kVar.e = this;
        ArrayList arrayList = this.a;
        arrayList.add(view);
        this.c = LinearLayoutManager.INVALID_OFFSET;
        if (arrayList.size() == 1) {
            this.b = LinearLayoutManager.INVALID_OFFSET;
        }
        if (y2kVar.a.isRemoved() || y2kVar.a.isUpdated()) {
            this.d = ((StaggeredGridLayoutManager) this.f).c.c(view) + this.d;
        }
    }

    public final void c() {
        z2k z2kVarW;
        View view = (View) am2.k(1, this.a);
        y2k y2kVar = (y2k) view.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f;
        this.c = staggeredGridLayoutManager.c.b(view);
        if (y2kVar.f && (z2kVarW = staggeredGridLayoutManager.m.w(y2kVar.a.getLayoutPosition())) != null && z2kVarW.b == 1) {
            int i = this.c;
            int i2 = this.e;
            int[] iArr = z2kVarW.c;
            this.c = (iArr == null ? 0 : iArr[i2]) + i;
        }
    }

    public final void d() {
        z2k z2kVarW;
        View view = (View) this.a.get(0);
        y2k y2kVar = (y2k) view.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f;
        this.b = staggeredGridLayoutManager.c.e(view);
        if (y2kVar.f && (z2kVarW = staggeredGridLayoutManager.m.w(y2kVar.a.getLayoutPosition())) != null && z2kVarW.b == -1) {
            int i = this.b;
            int i2 = this.e;
            int[] iArr = z2kVarW.c;
            this.b = i - (iArr != null ? iArr[i2] : 0);
        }
    }

    public final void e() {
        this.a.clear();
        this.b = LinearLayoutManager.INVALID_OFFSET;
        this.c = LinearLayoutManager.INVALID_OFFSET;
        this.d = 0;
    }

    public final int f() {
        return ((StaggeredGridLayoutManager) this.f).h ? h(false, r1.size() - 1, -1, false, true) : h(false, 0, this.a.size(), false, true);
    }

    public final int g() {
        return ((StaggeredGridLayoutManager) this.f).h ? h(false, 0, this.a.size(), false, true) : h(false, r1.size() - 1, -1, false, true);
    }

    public final int h(boolean z, int i, int i2, boolean z2, boolean z3) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f;
        int iK = staggeredGridLayoutManager.c.k();
        int iG = staggeredGridLayoutManager.c.g();
        int i3 = i2 > i ? 1 : -1;
        for (int i4 = i; i4 != i2; i4 += i3) {
            View view = (View) this.a.get(i4);
            int iE = staggeredGridLayoutManager.c.e(view);
            int iB = staggeredGridLayoutManager.c.b(view);
            boolean z4 = false;
            boolean z5 = !z3 ? iE >= iG : iE > iG;
            if (!z3 ? iB > iK : iB >= iK) {
                z4 = true;
            }
            if (z5 && z4) {
                if (z && z2) {
                    if (iE >= iK && iB <= iG) {
                        return staggeredGridLayoutManager.getPosition(view);
                    }
                } else {
                    if (z2) {
                        return staggeredGridLayoutManager.getPosition(view);
                    }
                    if (iE < iK || iB > iG) {
                        return staggeredGridLayoutManager.getPosition(view);
                    }
                }
            }
        }
        return -1;
    }

    public final int i(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.a.size() == 0) {
            return i;
        }
        c();
        return this.c;
    }

    public final View j(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f;
        View view = null;
        ArrayList arrayList = this.a;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.h && staggeredGridLayoutManager.getPosition(view2) >= i) || ((!staggeredGridLayoutManager.h && staggeredGridLayoutManager.getPosition(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            View view3 = (View) arrayList.get(i3);
            if ((staggeredGridLayoutManager.h && staggeredGridLayoutManager.getPosition(view3) <= i) || ((!staggeredGridLayoutManager.h && staggeredGridLayoutManager.getPosition(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i3++;
            view = view3;
        }
        return view;
    }

    public final float k() {
        int i = this.b;
        ArrayList arrayList = this.a;
        if (i != 0) {
            Collections.sort(arrayList, h);
            this.b = 0;
        }
        float f = 0.5f * this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            cqj cqjVar = (cqj) arrayList.get(i3);
            i2 += cqjVar.b;
            if (i2 >= f) {
                return cqjVar.c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((cqj) am2.k(1, arrayList)).c;
    }

    public final int l(int i) {
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.a.size() == 0) {
            return i;
        }
        d();
        return this.b;
    }

    public final void m() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        View view = (View) arrayList.remove(size - 1);
        y2k y2kVar = (y2k) view.getLayoutParams();
        y2kVar.e = null;
        if (y2kVar.a.isRemoved() || y2kVar.a.isUpdated()) {
            this.d -= ((StaggeredGridLayoutManager) this.f).c.c(view);
        }
        if (size == 1) {
            this.b = LinearLayoutManager.INVALID_OFFSET;
        }
        this.c = LinearLayoutManager.INVALID_OFFSET;
    }

    public final void n() {
        ArrayList arrayList = this.a;
        View view = (View) arrayList.remove(0);
        y2k y2kVar = (y2k) view.getLayoutParams();
        y2kVar.e = null;
        if (arrayList.size() == 0) {
            this.c = LinearLayoutManager.INVALID_OFFSET;
        }
        if (y2kVar.a.isRemoved() || y2kVar.a.isUpdated()) {
            this.d -= ((StaggeredGridLayoutManager) this.f).c.c(view);
        }
        this.b = LinearLayoutManager.INVALID_OFFSET;
    }

    public final void o(View view) {
        y2k y2kVar = (y2k) view.getLayoutParams();
        y2kVar.e = this;
        ArrayList arrayList = this.a;
        arrayList.add(0, view);
        this.b = LinearLayoutManager.INVALID_OFFSET;
        if (arrayList.size() == 1) {
            this.c = LinearLayoutManager.INVALID_OFFSET;
        }
        if (y2kVar.a.isRemoved() || y2kVar.a.isUpdated()) {
            this.d = ((StaggeredGridLayoutManager) this.f).c.c(view) + this.d;
        }
    }
}
