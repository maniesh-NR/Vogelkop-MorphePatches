package defpackage;

import android.util.LogPrinter;
import android.util.Pair;
import android.view.View;
import androidx.gridlayout.widget.GridLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class q4a {
    public final boolean a;
    public ua7 d;
    public ua7 f;
    public ua7 h;
    public int[] j;
    public int[] l;
    public o4a[] n;
    public int[] p;
    public boolean r;
    public int[] t;
    public final /* synthetic */ GridLayout x;
    public int b = LinearLayoutManager.INVALID_OFFSET;
    public int c = LinearLayoutManager.INVALID_OFFSET;
    public boolean e = false;
    public boolean g = false;
    public boolean i = false;
    public boolean k = false;
    public boolean m = false;
    public boolean o = false;
    public boolean q = false;
    public boolean s = false;
    public boolean u = true;
    public final u4a v = new u4a(0);
    public final u4a w = new u4a(-100000);

    public q4a(GridLayout gridLayout, boolean z) {
        this.x = gridLayout;
        this.a = z;
    }

    public static void k(ArrayList arrayList, s4a s4aVar, u4a u4aVar, boolean z) {
        if (s4aVar.a() != 0) {
            if (z) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (((o4a) obj).a.equals(s4aVar)) {
                        return;
                    }
                }
            }
            arrayList.add(new o4a(s4aVar, u4aVar));
        }
    }

    public static boolean n(int[] iArr, o4a o4aVar) {
        if (!o4aVar.c) {
            return false;
        }
        s4a s4aVar = o4aVar.a;
        int i = s4aVar.a;
        int i2 = s4aVar.b;
        int i3 = iArr[i] + o4aVar.b.a;
        if (i3 <= iArr[i2]) {
            return false;
        }
        iArr[i2] = i3;
        return true;
    }

    public final String a(ArrayList arrayList) {
        String strN;
        String str = this.a ? "x" : "y";
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        boolean z = true;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            o4a o4aVar = (o4a) obj;
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            s4a s4aVar = o4aVar.a;
            int i2 = s4aVar.a;
            int i3 = s4aVar.b;
            int i4 = o4aVar.b.a;
            if (i2 < i3) {
                StringBuilder sb2 = new StringBuilder(str);
                sb2.append(i3);
                sb2.append("-");
                sb2.append(str);
                sb2.append(i2);
                strN = rfp.n(i4, ">=", sb2);
            } else {
                strN = str + i2 + "-" + str + i3 + "<=" + (-i4);
            }
            sb.append(strN);
        }
        return sb.toString();
    }

    public final void b(ua7 ua7Var, boolean z) {
        for (u4a u4aVar : (u4a[]) ((Object[]) ua7Var.d)) {
            u4aVar.a = LinearLayoutManager.INVALID_OFFSET;
        }
        r4a[] r4aVarArr = (r4a[]) ((Object[]) g().d);
        for (int i = 0; i < r4aVarArr.length; i++) {
            int iD = r4aVarArr[i].d(z);
            u4a u4aVar2 = (u4a) ((Object[]) ua7Var.d)[((int[]) ua7Var.b)[i]];
            int i2 = u4aVar2.a;
            if (!z) {
                iD = -iD;
            }
            u4aVar2.a = Math.max(i2, iD);
        }
    }

    public final void c(boolean z) {
        int[] iArr = z ? this.j : this.l;
        GridLayout gridLayout = this.x;
        int childCount = gridLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = gridLayout.getChildAt(i);
            if (childAt.getVisibility() != 8) {
                t4a t4aVar = (t4a) childAt.getLayoutParams();
                boolean z2 = this.a;
                s4a s4aVar = (z2 ? t4aVar.b : t4aVar.a).b;
                int i2 = z ? s4aVar.a : s4aVar.b;
                iArr[i2] = Math.max(iArr[i2], gridLayout.f(childAt, z2, z));
            }
        }
    }

    public final ua7 d(boolean z) {
        s4a s4aVar;
        p4a p4aVar = new p4a(s4a.class, u4a.class);
        v4a[] v4aVarArr = (v4a[]) ((Object[]) g().c);
        int length = v4aVarArr.length;
        for (int i = 0; i < length; i++) {
            if (z) {
                s4aVar = v4aVarArr[i].b;
            } else {
                s4a s4aVar2 = v4aVarArr[i].b;
                s4aVar = new s4a(s4aVar2.b, s4aVar2.a);
            }
            u4a u4aVar = new u4a();
            u4aVar.a = LinearLayoutManager.INVALID_OFFSET;
            p4aVar.add(Pair.create(s4aVar, u4aVar));
        }
        return p4aVar.g();
    }

    public final o4a[] e() {
        if (this.n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ua7 ua7VarD = this.f;
            if (ua7VarD == null) {
                ua7VarD = d(true);
                this.f = ua7VarD;
            }
            if (!this.g) {
                b(ua7VarD, true);
                this.g = true;
            }
            ua7 ua7Var = this.f;
            int i = 0;
            while (true) {
                s4a[] s4aVarArr = (s4a[]) ((Object[]) ua7Var.c);
                if (i >= s4aVarArr.length) {
                    break;
                }
                k(arrayList, s4aVarArr[i], ((u4a[]) ((Object[]) ua7Var.d))[i], false);
                i++;
            }
            ua7 ua7VarD2 = this.h;
            if (ua7VarD2 == null) {
                ua7VarD2 = d(false);
                this.h = ua7VarD2;
            }
            if (!this.i) {
                b(ua7VarD2, false);
                this.i = true;
            }
            ua7 ua7Var2 = this.h;
            int i2 = 0;
            while (true) {
                s4a[] s4aVarArr2 = (s4a[]) ((Object[]) ua7Var2.c);
                if (i2 >= s4aVarArr2.length) {
                    break;
                }
                k(arrayList2, s4aVarArr2[i2], ((u4a[]) ((Object[]) ua7Var2.d))[i2], false);
                i2++;
            }
            if (this.u) {
                int i3 = 0;
                while (i3 < f()) {
                    int i4 = i3 + 1;
                    k(arrayList, new s4a(i3, i4), new u4a(0), true);
                    i3 = i4;
                }
            }
            int iF = f();
            k(arrayList, new s4a(0, iF), this.v, false);
            k(arrayList2, new s4a(iF, 0), this.w, false);
            o4a[] o4aVarArrR = r(arrayList);
            o4a[] o4aVarArrR2 = r(arrayList2);
            LogPrinter logPrinter = GridLayout.i;
            Object[] objArr = (Object[]) Array.newInstance(o4a[].class.getComponentType(), o4aVarArrR.length + o4aVarArrR2.length);
            System.arraycopy(o4aVarArrR, 0, objArr, 0, o4aVarArrR.length);
            System.arraycopy(o4aVarArrR2, 0, objArr, o4aVarArrR.length, o4aVarArrR2.length);
            this.n = (o4a[]) objArr;
        }
        if (!this.o) {
            ua7 ua7VarD3 = this.f;
            if (ua7VarD3 == null) {
                ua7VarD3 = d(true);
                this.f = ua7VarD3;
            }
            if (!this.g) {
                b(ua7VarD3, true);
                this.g = true;
            }
            ua7 ua7VarD4 = this.h;
            if (ua7VarD4 == null) {
                ua7VarD4 = d(false);
                this.h = ua7VarD4;
            }
            if (!this.i) {
                b(ua7VarD4, false);
                this.i = true;
            }
            this.o = true;
        }
        return this.n;
    }

    public final int f() {
        return Math.max(this.b, i());
    }

    public final ua7 g() {
        int iE;
        int i;
        ua7 ua7VarG = this.d;
        boolean z = this.a;
        GridLayout gridLayout = this.x;
        if (ua7VarG == null) {
            p4a p4aVar = new p4a(v4a.class, r4a.class);
            int childCount = gridLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                t4a t4aVar = (t4a) gridLayout.getChildAt(i2).getLayoutParams();
                v4a v4aVar = z ? t4aVar.b : t4aVar.a;
                p4aVar.add(Pair.create(v4aVar, v4aVar.a(z).u()));
            }
            ua7VarG = p4aVar.g();
            this.d = ua7VarG;
        }
        if (!this.e) {
            for (r4a r4aVar : (r4a[]) ((Object[]) ua7VarG.d)) {
                r4aVar.c();
            }
            int childCount2 = gridLayout.getChildCount();
            for (int i3 = 0; i3 < childCount2; i3++) {
                View childAt = gridLayout.getChildAt(i3);
                t4a t4aVar2 = (t4a) childAt.getLayoutParams();
                v4a v4aVar2 = z ? t4aVar2.b : t4aVar2.a;
                if (childAt.getVisibility() == 8) {
                    iE = 0;
                } else {
                    iE = gridLayout.e(childAt, z, false) + gridLayout.e(childAt, z, true) + (z ? childAt.getMeasuredWidth() : childAt.getMeasuredHeight());
                }
                if (v4aVar2.d == 0.0f) {
                    i = 0;
                } else {
                    int[] iArr = this.t;
                    if (iArr == null) {
                        iArr = new int[gridLayout.getChildCount()];
                        this.t = iArr;
                    }
                    i = iArr[i3];
                }
                int i4 = iE + i;
                ua7 ua7Var = this.d;
                r4a r4aVar2 = (r4a) ((Object[]) ua7Var.d)[((int[]) ua7Var.b)[i3]];
                r4aVar2.c &= (v4aVar2.c == GridLayout.p && v4aVar2.d == 0.0f) ? 0 : 2;
                nb6 nb6VarA = v4aVar2.a(z);
                int i5 = f6n.a;
                int iT = nb6VarA.t(childAt, i4, gridLayout.getLayoutMode());
                r4aVar2.b(iT, i4 - iT);
            }
            this.e = true;
        }
        return this.d;
    }

    public final int[] h() {
        boolean z;
        int[] iArr = this.p;
        if (iArr == null) {
            iArr = new int[f() + 1];
            this.p = iArr;
        }
        if (!this.q) {
            boolean z2 = this.s;
            GridLayout gridLayout = this.x;
            float f = 0.0f;
            boolean z3 = this.a;
            if (!z2) {
                int childCount = gridLayout.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        z = false;
                        break;
                    }
                    View childAt = gridLayout.getChildAt(i);
                    if (childAt.getVisibility() != 8) {
                        t4a t4aVar = (t4a) childAt.getLayoutParams();
                        if ((z3 ? t4aVar.b : t4aVar.a).d != 0.0f) {
                            z = true;
                            break;
                        }
                    }
                    i++;
                }
                this.r = z;
                this.s = true;
            }
            if (this.r) {
                int[] iArr2 = this.t;
                if (iArr2 == null) {
                    iArr2 = new int[gridLayout.getChildCount()];
                    this.t = iArr2;
                }
                Arrays.fill(iArr2, 0);
                q(e(), iArr, true);
                int childCount2 = (gridLayout.getChildCount() * this.v.a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = gridLayout.getChildCount();
                    for (int i2 = 0; i2 < childCount3; i2++) {
                        View childAt2 = gridLayout.getChildAt(i2);
                        if (childAt2.getVisibility() != 8) {
                            t4a t4aVar2 = (t4a) childAt2.getLayoutParams();
                            f += (z3 ? t4aVar2.b : t4aVar2.a).d;
                        }
                    }
                    int i3 = -1;
                    boolean z4 = true;
                    int i4 = 0;
                    while (i4 < childCount2) {
                        int i5 = (int) ((i4 + childCount2) / 2);
                        m();
                        p(f, i5);
                        boolean zQ = q(e(), iArr, false);
                        if (zQ) {
                            i4 = i5 + 1;
                            i3 = i5;
                        } else {
                            childCount2 = i5;
                        }
                        z4 = zQ;
                    }
                    if (i3 > 0 && !z4) {
                        m();
                        p(f, i3);
                        q(e(), iArr, true);
                    }
                }
            } else {
                q(e(), iArr, true);
            }
            if (!this.u) {
                int i6 = iArr[0];
                int length = iArr.length;
                for (int i7 = 0; i7 < length; i7++) {
                    iArr[i7] = iArr[i7] - i6;
                }
            }
            this.q = true;
        }
        return this.p;
    }

    public final int i() {
        int i = this.c;
        int i2 = LinearLayoutManager.INVALID_OFFSET;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        GridLayout gridLayout = this.x;
        int childCount = gridLayout.getChildCount();
        int iMax = -1;
        for (int i3 = 0; i3 < childCount; i3++) {
            t4a t4aVar = (t4a) gridLayout.getChildAt(i3).getLayoutParams();
            s4a s4aVar = (this.a ? t4aVar.b : t4aVar.a).b;
            iMax = Math.max(Math.max(Math.max(iMax, s4aVar.a), s4aVar.b), s4aVar.a());
        }
        if (iMax != -1) {
            i2 = iMax;
        }
        int iMax2 = Math.max(0, i2);
        this.c = iMax2;
        return iMax2;
    }

    public final int j(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        u4a u4aVar = this.w;
        u4a u4aVar2 = this.v;
        if (mode == Integer.MIN_VALUE) {
            u4aVar2.a = 0;
            u4aVar.a = -size;
            this.q = false;
            return h()[f()];
        }
        if (mode == 0) {
            u4aVar2.a = 0;
            u4aVar.a = -100000;
            this.q = false;
            return h()[f()];
        }
        if (mode != 1073741824) {
            return 0;
        }
        u4aVar2.a = size;
        u4aVar.a = -size;
        this.q = false;
        return h()[f()];
    }

    public final void l() {
        this.c = LinearLayoutManager.INVALID_OFFSET;
        this.d = null;
        this.f = null;
        this.h = null;
        this.j = null;
        this.l = null;
        this.n = null;
        this.p = null;
        this.t = null;
        this.s = false;
        m();
    }

    public final void m() {
        this.e = false;
        this.g = false;
        this.i = false;
        this.k = false;
        this.m = false;
        this.o = false;
        this.q = false;
    }

    public final void o(int i) {
        if (i == Integer.MIN_VALUE || i >= i()) {
            this.b = i;
        } else {
            GridLayout.g((this.a ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
    }

    public final void p(float f, int i) {
        Arrays.fill(this.t, 0);
        GridLayout gridLayout = this.x;
        int childCount = gridLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = gridLayout.getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                t4a t4aVar = (t4a) childAt.getLayoutParams();
                float f2 = (this.a ? t4aVar.b : t4aVar.a).d;
                if (f2 != 0.0f) {
                    int iRound = Math.round((i * f2) / f);
                    this.t[i2] = iRound;
                    i -= iRound;
                    f -= f2;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b8, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(defpackage.o4a[] r13, int[] r14, boolean r15) {
        /*
            r12 = this;
            boolean r0 = r12.a
            if (r0 == 0) goto L7
            java.lang.String r0 = "horizontal"
            goto L9
        L7:
            java.lang.String r0 = "vertical"
        L9:
            int r1 = r12.f()
            r2 = 1
            int r1 = r1 + r2
            r3 = 0
            r4 = 0
            r5 = r3
        L12:
            int r6 = r13.length
            if (r5 >= r6) goto Lb8
            java.util.Arrays.fill(r14, r3)
            r6 = r3
        L19:
            if (r6 >= r1) goto L7b
            int r7 = r13.length
            r8 = r3
            r9 = r8
        L1e:
            if (r8 >= r7) goto L2a
            r10 = r13[r8]
            boolean r10 = n(r14, r10)
            r9 = r9 | r10
            int r8 = r8 + 1
            goto L1e
        L2a:
            if (r9 != 0) goto L78
            if (r4 == 0) goto Lb8
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
        L38:
            int r1 = r13.length
            if (r3 >= r1) goto L4e
            r1 = r13[r3]
            boolean r5 = r4[r3]
            if (r5 == 0) goto L44
            r14.add(r1)
        L44:
            boolean r5 = r1.c
            if (r5 != 0) goto L4b
            r15.add(r1)
        L4b:
            int r3 = r3 + 1
            goto L38
        L4e:
            androidx.gridlayout.widget.GridLayout r13 = r12.x
            android.util.LogPrinter r13 = r13.h
            java.lang.String r1 = " constraints: "
            java.lang.StringBuilder r0 = defpackage.p3p.r(r0, r1)
            java.lang.String r14 = r12.a(r14)
            r0.append(r14)
            java.lang.String r14 = " are inconsistent; permanently removing: "
            r0.append(r14)
            java.lang.String r12 = r12.a(r15)
            r0.append(r12)
            java.lang.String r12 = ". "
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r13.println(r12)
            return r2
        L78:
            int r6 = r6 + 1
            goto L19
        L7b:
            if (r15 != 0) goto L7e
            return r3
        L7e:
            int r6 = r13.length
            boolean[] r6 = new boolean[r6]
            r7 = r3
        L82:
            if (r7 >= r1) goto L99
            int r8 = r13.length
            r9 = r3
        L86:
            if (r9 >= r8) goto L96
            boolean r10 = r6[r9]
            r11 = r13[r9]
            boolean r11 = n(r14, r11)
            r10 = r10 | r11
            r6[r9] = r10
            int r9 = r9 + 1
            goto L86
        L96:
            int r7 = r7 + 1
            goto L82
        L99:
            if (r5 != 0) goto L9c
            r4 = r6
        L9c:
            r7 = r3
        L9d:
            int r8 = r13.length
            if (r7 >= r8) goto Lb4
            boolean r8 = r6[r7]
            if (r8 == 0) goto Lb1
            r8 = r13[r7]
            s4a r9 = r8.a
            int r10 = r9.a
            int r9 = r9.b
            if (r10 < r9) goto Lb1
            r8.c = r3
            goto Lb4
        Lb1:
            int r7 = r7 + 1
            goto L9d
        Lb4:
            int r5 = r5 + 1
            goto L12
        Lb8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q4a.q(o4a[], int[], boolean):boolean");
    }

    public final o4a[] r(ArrayList arrayList) {
        pyl pylVar = new pyl(this, (o4a[]) arrayList.toArray(new o4a[arrayList.size()]));
        int length = ((o4a[][]) pylVar.d).length;
        for (int i = 0; i < length; i++) {
            pylVar.x(i);
        }
        return (o4a[]) pylVar.c;
    }
}
