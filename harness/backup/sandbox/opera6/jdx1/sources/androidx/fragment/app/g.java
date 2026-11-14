package androidx.fragment.app;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import defpackage.an9;
import defpackage.aw6;
import defpackage.cw6;
import defpackage.dw6;
import defpackage.ew6;
import defpackage.f6n;
import defpackage.gn9;
import defpackage.hyj;
import defpackage.jh;
import defpackage.jz2;
import defpackage.kff;
import defpackage.pqh;
import defpackage.r5n;
import defpackage.vd2;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class g extends hyj {
    public final ArrayList c;
    public final c0 d;
    public final c0 e;
    public final gn9 f;
    public final Object g;
    public final ArrayList h;
    public final ArrayList i;
    public final ArrayMap j;
    public final ArrayList k;
    public final ArrayList l;
    public final ArrayMap m;
    public final ArrayMap n;
    public final boolean o;
    public final jh p = new jh();
    public Object q;
    public boolean r;

    public g(ArrayList arrayList, c0 c0Var, c0 c0Var2, gn9 gn9Var, Object obj, ArrayList arrayList2, ArrayList arrayList3, ArrayMap arrayMap, ArrayList arrayList4, ArrayList arrayList5, ArrayMap arrayMap2, ArrayMap arrayMap3, boolean z) {
        this.c = arrayList;
        this.d = c0Var;
        this.e = c0Var2;
        this.f = gn9Var;
        this.g = obj;
        this.h = arrayList2;
        this.i = arrayList3;
        this.j = arrayMap;
        this.k = arrayList4;
        this.l = arrayList5;
        this.m = arrayMap2;
        this.n = arrayMap3;
        this.o = z;
    }

    public static void f(View view, ArrayList arrayList) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = f6n.a;
        if (viewGroup.isTransitionGroup()) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                f(childAt, arrayList);
            }
        }
    }

    @Override // defpackage.hyj
    public final boolean a() {
        Object obj;
        Object obj2;
        gn9 gn9Var = this.f;
        if (gn9Var.l()) {
            ArrayList arrayList = this.c;
            if (arrayList.isEmpty()) {
                obj = this.g;
                return obj != null ? true : true;
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj3 = arrayList.get(i);
                i++;
                ew6 ew6Var = (ew6) obj3;
                if (Build.VERSION.SDK_INT < 34 || (obj2 = ew6Var.b) == null || !gn9Var.m(obj2)) {
                    break;
                }
            }
            obj = this.g;
            if (obj != null || gn9Var.m(obj)) {
            }
        }
        return false;
    }

    @Override // defpackage.hyj
    public final void b(ViewGroup viewGroup) {
        this.p.a();
    }

    @Override // defpackage.hyj
    public final void c(ViewGroup viewGroup) {
        boolean zIsLaidOut = viewGroup.isLaidOut();
        int i = 0;
        ArrayList arrayList = this.c;
        if (!zIsLaidOut || this.r) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ew6 ew6Var = (ew6) obj;
                c0 c0Var = ew6Var.a;
                if (w.N(2)) {
                    if (this.r) {
                        Objects.toString(c0Var);
                    } else {
                        viewGroup.toString();
                        Objects.toString(c0Var);
                    }
                }
                ew6Var.a.c(this);
            }
            this.r = false;
            return;
        }
        Object obj2 = this.q;
        gn9 gn9Var = this.f;
        c0 c0Var2 = this.e;
        c0 c0Var3 = this.d;
        if (obj2 != null) {
            gn9Var.c(obj2);
            if (w.N(2)) {
                Objects.toString(c0Var3);
                Objects.toString(c0Var2);
                return;
            }
            return;
        }
        Pair pairG = g(viewGroup, c0Var2, c0Var3);
        ArrayList arrayList2 = (ArrayList) pairG.a;
        Object obj3 = pairG.b;
        ArrayList arrayList3 = new ArrayList(k95.o(arrayList, 10));
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj4 = arrayList.get(i3);
            i3++;
            arrayList3.add(((ew6) obj4).a);
        }
        int size3 = arrayList3.size();
        while (i < size3) {
            Object obj5 = arrayList3.get(i);
            i++;
            c0 c0Var4 = (c0) obj5;
            gn9Var.u(c0Var4.c, obj3, this.p, new aw6(c0Var4, this, (byte) 1));
        }
        i(arrayList2, viewGroup, new cw6(this, viewGroup, obj3));
        if (w.N(2)) {
            Objects.toString(c0Var3);
            Objects.toString(c0Var2);
        }
    }

    @Override // defpackage.hyj
    public final void d(jz2 jz2Var) {
        Object obj = this.q;
        if (obj != null) {
            this.f.r(obj, jz2Var.c);
        }
    }

    @Override // defpackage.hyj
    public final void e(ViewGroup viewGroup) {
        Object obj;
        boolean zIsLaidOut = viewGroup.isLaidOut();
        int i = 0;
        ArrayList arrayList = this.c;
        if (!zIsLaidOut) {
            int size = arrayList.size();
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                c0 c0Var = ((ew6) obj2).a;
                if (w.N(2)) {
                    viewGroup.toString();
                    Objects.toString(c0Var);
                }
            }
            return;
        }
        boolean zH = h();
        c0 c0Var2 = this.e;
        c0 c0Var3 = this.d;
        if (zH && (obj = this.g) != null && !a()) {
            Objects.toString(obj);
            Objects.toString(c0Var3);
            Objects.toString(c0Var2);
        }
        if (a() && h()) {
            pqh pqhVar = new pqh();
            Pair pairG = g(viewGroup, c0Var2, c0Var3);
            ArrayList arrayList2 = (ArrayList) pairG.a;
            Object obj3 = pairG.b;
            ArrayList arrayList3 = new ArrayList(k95.o(arrayList, 10));
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj4 = arrayList.get(i2);
                i2++;
                arrayList3.add(((ew6) obj4).a);
            }
            int size3 = arrayList3.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj5 = arrayList3.get(i3);
                i3++;
                c0 c0Var4 = (c0) obj5;
                bl6 bl6Var = new bl6(pqhVar, (byte) 7);
                Fragment fragment = c0Var4.c;
                this.f.v(obj3, this.p, bl6Var, new aw6(c0Var4, this, (byte) 0));
            }
            i(arrayList2, viewGroup, new dw6(this, viewGroup, obj3, pqhVar));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair g(android.view.ViewGroup r30, androidx.fragment.app.c0 r31, androidx.fragment.app.c0 r32) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.g.g(android.view.ViewGroup, androidx.fragment.app.c0, androidx.fragment.app.c0):kotlin.Pair");
    }

    public final boolean h() {
        ArrayList arrayList = this.c;
        if (arrayList.isEmpty()) {
            return true;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (!((ew6) obj).a.c.mTransitioning) {
                return false;
            }
        }
        return true;
    }

    public final void i(ArrayList arrayList, ViewGroup viewGroup, Function0 function0) {
        an9.a(4, arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.i;
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList3.get(i);
            WeakHashMap weakHashMap = r5n.a;
            arrayList2.add(view.getTransitionName());
            view.setTransitionName(null);
        }
        boolean zN = w.N(2);
        ArrayList arrayList4 = this.h;
        if (zN) {
            int size2 = arrayList4.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj = arrayList4.get(i2);
                i2++;
                View view2 = (View) obj;
                Objects.toString(view2);
                WeakHashMap weakHashMap2 = r5n.a;
                view2.getTransitionName();
            }
            int size3 = arrayList3.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj2 = arrayList3.get(i3);
                i3++;
                View view3 = (View) obj2;
                Objects.toString(view3);
                WeakHashMap weakHashMap3 = r5n.a;
                view3.getTransitionName();
            }
        }
        function0.invoke();
        int size4 = arrayList3.size();
        ArrayList arrayList5 = new ArrayList();
        for (int i4 = 0; i4 < size4; i4++) {
            View view4 = (View) arrayList4.get(i4);
            WeakHashMap weakHashMap4 = r5n.a;
            String transitionName = view4.getTransitionName();
            arrayList5.add(transitionName);
            if (transitionName != null) {
                view4.setTransitionName(null);
                String str = (String) this.j.get(transitionName);
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        break;
                    }
                    if (str.equals(arrayList2.get(i5))) {
                        ((View) arrayList3.get(i5)).setTransitionName(transitionName);
                        break;
                    }
                    i5++;
                }
            }
        }
        kff.a(viewGroup, new vd2(size4, arrayList3, arrayList2, arrayList4, arrayList5));
        an9.a(0, arrayList);
        this.f.x(this.g, arrayList4, arrayList3);
    }
}
