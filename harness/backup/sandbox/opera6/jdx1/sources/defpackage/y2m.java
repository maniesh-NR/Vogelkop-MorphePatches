package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.collection.ArrayMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class y2m implements Cloneable {
    public static final Animator[] B = new Animator[0];
    public static final int[] C = {2, 1, 3, 4};
    public static final cpj D = new cpj((byte) 6);
    public static final ThreadLocal E = new ThreadLocal();
    public long A;
    public ArrayList k;
    public ArrayList l;
    public x2m[] m;
    public qs7 v;
    public hn9 w;
    public long y;
    public t2m z;
    public final String a = getClass().getName();
    public long b = -1;
    public long c = -1;
    public TimeInterpolator d = null;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public t9l g = new t9l();
    public t9l h = new t9l();
    public j3m i = null;
    public final int[] j = C;
    public final ArrayList n = new ArrayList();
    public Animator[] o = B;
    public int p = 0;
    public boolean q = false;
    public boolean r = false;
    public y2m s = null;
    public ArrayList t = null;
    public ArrayList u = new ArrayList();
    public cpj x = D;

    public static void e(t9l t9lVar, View view, k3m k3mVar) {
        ArrayMap arrayMap = (ArrayMap) t9lVar.a;
        ArrayMap arrayMap2 = (ArrayMap) t9lVar.d;
        SparseArray sparseArray = (SparseArray) t9lVar.b;
        j1d j1dVar = (j1d) t9lVar.c;
        arrayMap.put(view, k3mVar);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = r5n.a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (arrayMap2.containsKey(transitionName)) {
                arrayMap2.put(transitionName, null);
            } else {
                arrayMap2.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (j1dVar.e(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    j1dVar.g(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) j1dVar.c(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    j1dVar.g(itemIdAtPosition, null);
                }
            }
        }
    }

    public static ArrayMap s() {
        ThreadLocal threadLocal = E;
        ArrayMap arrayMap = (ArrayMap) threadLocal.get();
        if (arrayMap != null) {
            return arrayMap;
        }
        ArrayMap arrayMap2 = new ArrayMap(0);
        threadLocal.set(arrayMap2);
        return arrayMap2;
    }

    public void A(ViewGroup viewGroup) {
        if (this.r) {
            return;
        }
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.o);
        this.o = B;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.o = animatorArr;
        z(this, bxl.e, false);
        this.q = true;
    }

    public void B() {
        ArrayMap arrayMapS = s();
        this.y = 0L;
        int i = 0;
        while (true) {
            int size = this.u.size();
            ArrayList arrayList = this.u;
            if (i >= size) {
                arrayList.clear();
                return;
            }
            Animator animator = (Animator) arrayList.get(i);
            o2m o2mVar = (o2m) arrayMapS.get(animator);
            if (animator != null && o2mVar != null) {
                Animator animator2 = o2mVar.f;
                long j = this.c;
                if (j >= 0) {
                    animator2.setDuration(j);
                }
                long j2 = this.b;
                if (j2 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j2);
                }
                TimeInterpolator timeInterpolator = this.d;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.n.add(animator);
                this.y = Math.max(this.y, animator.getTotalDuration());
            }
            i++;
        }
    }

    public y2m C(x2m x2mVar) {
        y2m y2mVar;
        ArrayList arrayList = this.t;
        if (arrayList != null) {
            if (!arrayList.remove(x2mVar) && (y2mVar = this.s) != null) {
                y2mVar.C(x2mVar);
            }
            if (this.t.size() == 0) {
                this.t = null;
            }
        }
        return this;
    }

    public void D(View view) {
        this.f.remove(view);
    }

    public void E(View view) {
        if (this.q) {
            if (!this.r) {
                ArrayList arrayList = this.n;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.o);
                this.o = B;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.o = animatorArr;
                z(this, bxl.f, false);
            }
            this.q = false;
        }
    }

    public void F() {
        N();
        ArrayMap arrayMapS = s();
        ArrayList arrayList = this.u;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Animator animator = (Animator) obj;
            if (arrayMapS.containsKey(animator)) {
                N();
                if (animator != null) {
                    animator.addListener(new al9(this, arrayMapS, (byte) 4));
                    long j = this.c;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.b;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new kc(this, (byte) 29));
                    animator.start();
                }
            }
        }
        this.u.clear();
        p();
    }

    public void G(long j, long j2) {
        long j3 = this.y;
        int i = 0;
        boolean z = j < j2;
        if ((j2 < 0 && j >= 0) || (j2 > j3 && j <= j3)) {
            this.r = false;
            z(this, bxl.b, z);
        }
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.o);
        this.o = B;
        while (i < size) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            ((AnimatorSet) animator).setCurrentPlayTime(Math.min(Math.max(0L, j), animator.getTotalDuration()));
            i++;
            j3 = j3;
        }
        long j4 = j3;
        this.o = animatorArr;
        if ((j <= j4 || j2 > j4) && (j >= 0 || j2 < 0)) {
            return;
        }
        if (j > j4) {
            this.r = true;
        }
        z(this, bxl.c, z);
    }

    public void H(long j) {
        this.c = j;
    }

    public void I(hn9 hn9Var) {
        this.w = hn9Var;
    }

    public void J(TimeInterpolator timeInterpolator) {
        this.d = timeInterpolator;
    }

    public void K(cpj cpjVar) {
        if (cpjVar == null) {
            this.x = D;
        } else {
            this.x = cpjVar;
        }
    }

    public void L(qs7 qs7Var) {
        this.v = qs7Var;
    }

    public void M(long j) {
        this.b = j;
    }

    public final void N() {
        if (this.p == 0) {
            z(this, bxl.b, false);
            this.r = false;
        }
        this.p++;
    }

    public String O(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.c != -1) {
            sb.append("dur(");
            sb.append(this.c);
            sb.append(") ");
        }
        if (this.b != -1) {
            sb.append("dly(");
            sb.append(this.b);
            sb.append(") ");
        }
        if (this.d != null) {
            sb.append("interp(");
            sb.append(this.d);
            sb.append(") ");
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public final void b(x2m x2mVar) {
        ArrayList arrayList = this.t;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.t = arrayList;
        }
        arrayList.add(x2mVar);
    }

    public void c(View view) {
        this.f.add(view);
    }

    public void cancel() {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.o);
        this.o = B;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.o = animatorArr;
        z(this, bxl.d, false);
    }

    public void f(k3m k3mVar) {
        kr4.P(k3mVar);
    }

    public final void g(View view, boolean z) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                k3m k3mVar = new k3m(view);
                if (z) {
                    j(k3mVar);
                } else {
                    f(k3mVar);
                }
                k3mVar.c.add(this);
                i(k3mVar);
                if (z) {
                    e(this.g, view, k3mVar);
                } else {
                    e(this.h, view, k3mVar);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    g(viewGroup.getChildAt(i), z);
                }
            }
        }
    }

    public void i(k3m k3mVar) {
        if (this.v != null) {
            HashMap map = k3mVar.a;
            if (map.isEmpty()) {
                return;
            }
            this.v.getClass();
            String[] strArr = qs7.m;
            for (int i = 0; i < 2; i++) {
                if (!map.containsKey(strArr[i])) {
                    this.v.getClass();
                    View view = k3mVar.b;
                    Integer numValueOf = (Integer) map.get("android:visibility:visibility");
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(view.getVisibility());
                    }
                    map.put("android:visibilityPropagation:visibility", numValueOf);
                    int[] iArr = {iRound, 0};
                    view.getLocationOnScreen(iArr);
                    int iRound = Math.round(view.getTranslationX()) + iArr[0];
                    iArr[0] = (view.getWidth() / 2) + iRound;
                    int iRound2 = Math.round(view.getTranslationY()) + iArr[1];
                    iArr[1] = iRound2;
                    iArr[1] = (view.getHeight() / 2) + iRound2;
                    map.put("android:visibilityPropagation:center", iArr);
                    return;
                }
            }
        }
    }

    public void j(k3m k3mVar) {
        kr4.P(k3mVar);
    }

    public final void k(ViewGroup viewGroup, boolean z) {
        l(z);
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        if (size <= 0 && arrayList2.size() <= 0) {
            g(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                k3m k3mVar = new k3m(viewFindViewById);
                if (z) {
                    j(k3mVar);
                } else {
                    f(k3mVar);
                }
                k3mVar.c.add(this);
                i(k3mVar);
                if (z) {
                    e(this.g, viewFindViewById, k3mVar);
                } else {
                    e(this.h, viewFindViewById, k3mVar);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            k3m k3mVar2 = new k3m(view);
            if (z) {
                j(k3mVar2);
            } else {
                f(k3mVar2);
            }
            k3mVar2.c.add(this);
            i(k3mVar2);
            if (z) {
                e(this.g, view, k3mVar2);
            } else {
                e(this.h, view, k3mVar2);
            }
        }
    }

    public final void l(boolean z) {
        if (z) {
            ((ArrayMap) this.g.a).clear();
            ((SparseArray) this.g.b).clear();
            ((j1d) this.g.c).b();
        } else {
            ((ArrayMap) this.h.a).clear();
            ((SparseArray) this.h.b).clear();
            ((j1d) this.h.c).b();
        }
    }

    @Override // 
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public y2m clone() {
        try {
            y2m y2mVar = (y2m) super.clone();
            y2mVar.u = new ArrayList();
            y2mVar.g = new t9l();
            y2mVar.h = new t9l();
            y2mVar.k = null;
            y2mVar.l = null;
            y2mVar.z = null;
            y2mVar.s = this;
            y2mVar.t = null;
            return y2mVar;
        } catch (CloneNotSupportedException e) {
            rqd.p(e);
            return null;
        }
    }

    public Animator n(ViewGroup viewGroup, k3m k3mVar, k3m k3mVar2) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01f0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o(android.view.ViewGroup r26, t9l r27, t9l r28, java.util.ArrayList r29, java.util.ArrayList r30) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y2m.o(android.view.ViewGroup, t9l, t9l, java.util.ArrayList, java.util.ArrayList):void");
    }

    public final void p() {
        int i = this.p - 1;
        this.p = i;
        if (i == 0) {
            z(this, bxl.c, false);
            for (int i2 = 0; i2 < ((j1d) this.g.c).j(); i2++) {
                View view = (View) ((j1d) this.g.c).k(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((j1d) this.h.c).j(); i3++) {
                View view2 = (View) ((j1d) this.h.c).k(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.r = true;
        }
    }

    public final k3m q(View view, boolean z) {
        j3m j3mVar = this.i;
        if (j3mVar != null) {
            return j3mVar.q(view, z);
        }
        ArrayList arrayList = z ? this.k : this.l;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            k3m k3mVar = (k3m) arrayList.get(i);
            if (k3mVar == null) {
                return null;
            }
            if (k3mVar.b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (k3m) (z ? this.l : this.k).get(i);
        }
        return null;
    }

    public final y2m r() {
        j3m j3mVar = this.i;
        return j3mVar != null ? j3mVar.r() : this;
    }

    public String[] t() {
        return null;
    }

    public final String toString() {
        return O("");
    }

    public final k3m u(View view, boolean z) {
        j3m j3mVar = this.i;
        if (j3mVar != null) {
            return j3mVar.u(view, z);
        }
        return (k3m) ((ArrayMap) (z ? this.g : this.h).a).get(view);
    }

    public boolean v() {
        return !this.n.isEmpty();
    }

    public boolean w() {
        return this instanceof kr4;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f A[LOOP:0: B:9:0x0012->B:18:0x002f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[LOOP:1: B:20:0x003a->B:39:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean x(defpackage.k3m r7, defpackage.k3m r8) {
        /*
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L60
            java.util.HashMap r7 = r7.a
            if (r8 == 0) goto L60
            java.util.HashMap r8 = r8.a
            java.lang.String[] r6 = r6.t()
            r1 = 1
            if (r6 == 0) goto L32
            int r2 = r6.length
            r3 = r0
        L12:
            if (r3 >= r2) goto L60
            r4 = r6[r3]
            java.lang.Object r5 = r7.get(r4)
            java.lang.Object r4 = r8.get(r4)
            if (r5 != 0) goto L24
            if (r4 != 0) goto L26
            r4 = r0
            goto L2d
        L24:
            if (r4 != 0) goto L28
        L26:
            r4 = r1
            goto L2d
        L28:
            boolean r4 = r5.equals(r4)
            r4 = r4 ^ r1
        L2d:
            if (r4 != 0) goto L5f
            int r3 = r3 + 1
            goto L12
        L32:
            java.util.Set r6 = r7.keySet()
            java.util.Iterator r6 = r6.iterator()
        L3a:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L60
            java.lang.Object r2 = r6.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r7.get(r2)
            java.lang.Object r2 = r8.get(r2)
            if (r3 != 0) goto L54
            if (r2 != 0) goto L56
            r2 = r0
            goto L5d
        L54:
            if (r2 != 0) goto L58
        L56:
            r2 = r1
            goto L5d
        L58:
            boolean r2 = r3.equals(r2)
            r2 = r2 ^ r1
        L5d:
            if (r2 == 0) goto L3a
        L5f:
            return r1
        L60:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y2m.x(k3m, k3m):boolean");
    }

    public final boolean y(View view) {
        int id = view.getId();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final void z(y2m y2mVar, bxl bxlVar, boolean z) {
        y2m y2mVar2 = this.s;
        if (y2mVar2 != null) {
            y2mVar2.z(y2mVar, bxlVar, z);
        }
        ArrayList arrayList = this.t;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.t.size();
        x2m[] x2mVarArr = this.m;
        if (x2mVarArr == null) {
            x2mVarArr = new x2m[size];
        }
        this.m = null;
        x2m[] x2mVarArr2 = (x2m[]) this.t.toArray(x2mVarArr);
        for (int i = 0; i < size; i++) {
            x2m x2mVar = x2mVarArr2[i];
            switch (bxlVar.a) {
                case 1:
                    x2mVar.b(y2mVar);
                    break;
                case 2:
                    x2mVar.g(y2mVar);
                    break;
                case 3:
                    x2mVar.d(y2mVar);
                    break;
                case 4:
                    x2mVar.a();
                    break;
                default:
                    x2mVar.c();
                    break;
            }
            x2mVarArr2[i] = null;
        }
        this.m = x2mVarArr2;
    }
}
