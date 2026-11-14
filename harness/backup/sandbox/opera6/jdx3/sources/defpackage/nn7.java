package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.SparseArray;
import com.leanplum.internal.Constants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class nn7 extends ldk {
    public final b59 j;
    public final x5f k;
    public final vzk l;
    public final n57 m;
    public final ArrayList n;
    public bn7 o;
    public ey p;
    public il q;
    public SparseArray r;

    public nn7(Context context, umi umiVar, x5f x5fVar, vzk vzkVar) {
        b59 b59VarL = w1h.l(context, umiVar, "ads_dup", new bg1[0]);
        n57 n57Var = new n57((byte) 9);
        r16 r16Var = ngh.a;
        super(umiVar);
        this.n = new ArrayList();
        this.j = b59VarL;
        this.k = x5fVar;
        this.l = vzkVar;
        this.m = n57Var;
        h();
        vzkVar.h(new rx(this, (byte) 2));
    }

    public static int j(yz yzVar) {
        int iHashCode;
        int iHashCode2;
        if (yzVar instanceof w10) {
            w10 w10Var = (w10) yzVar;
            cie cieVar = w10Var.u;
            mgh mghVar = cieVar.X;
            eyi eyiVar = mghVar != null ? (eyi) mghVar.b : null;
            if (eyiVar != null) {
                iHashCode = ((String) eyiVar.c).hashCode();
            } else {
                String str = cieVar.q;
                String[] strArr = aik.a;
                if (str == null) {
                    str = "";
                }
                iHashCode = str.hashCode();
            }
            iHashCode2 = w10Var.i.name().hashCode() * 31;
        } else {
            iHashCode = yzVar.i.name().hashCode() * 31;
            iHashCode2 = yzVar.a.hashCode();
        }
        return iHashCode2 + iHashCode;
    }

    @Override // defpackage.ldk
    public final Object a() {
        Set setO = w1h.o((SharedPreferences) this.j.get(), Constants.Params.DATA, (Set) null);
        if (setO == null) {
            return null;
        }
        SparseArray sparseArray = new SparseArray(setO.size());
        Iterator it = setO.iterator();
        while (it.hasNext()) {
            String[] strArrSplit = ((String) it.next()).split(":");
            if (strArrSplit.length == 3) {
                try {
                    sparseArray.put(Integer.parseInt(strArrSplit[0]), new mn7(Integer.parseInt(strArrSplit[1]), Long.parseLong(strArrSplit[2])));
                } catch (NumberFormatException unused) {
                }
            }
        }
        return sparseArray;
    }

    @Override // defpackage.ldk
    public final void b(Object obj) {
        ((SharedPreferences) this.j.get()).edit().putStringSet(Constants.Params.DATA, (Set) obj).apply();
    }

    @Override // defpackage.ldk
    public final int c() {
        return 2;
    }

    @Override // defpackage.ldk
    public final void d(Object obj) {
        SparseArray sparseArray = (SparseArray) obj;
        if (sparseArray == null) {
            sparseArray = new SparseArray();
        }
        this.r = sparseArray;
        if (this.p != null) {
            o();
        }
    }

    public final boolean k(yz yzVar, esk eskVar) {
        ey eyVar;
        if (this.r == null || (eyVar = this.p) == null) {
            return true;
        }
        return l(yzVar, eskVar, !((eyVar.a & 2) != 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
    
        if ((r23.r.a - r5.r.a) > r22.q.b) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
    
        if (r23.r.a <= r22.q.b) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(defpackage.yz r23, esk r24, boolean r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            ey r2 = r0.p
            long r2 = r2.a
            r4 = 1
            long r2 = r2 & r4
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 1
            if (r2 == 0) goto Lbf
            ap r2 = r1.r
            int r2 = r2.b
            if (r2 == r3) goto Lbf
            int r13 = j(r1)
            android.util.SparseArray r2 = r0.r
            java.lang.Object r2 = r2.get(r13)
            mn7 r2 = (defpackage.mn7) r2
            if (r2 == 0) goto Lbf
            n57 r4 = r0.m
            r4.getClass()
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r2.b
            ey r8 = r0.p
            long r9 = r8.c
            long r6 = r6 + r9
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 < 0) goto L3e
            r0.m(r4)
            return r3
        L3e:
            int r2 = r2.a
            int r4 = r8.b
            if (r2 < r4) goto Lbf
            r2 = 0
            if (r25 == 0) goto L84
            il r4 = r0.q
            if (r4 == 0) goto L84
            if (r24 == 0) goto L7a
            java.lang.Object r4 = r24.get()
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r4 = r4.iterator()
        L57:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L7a
            java.lang.Object r5 = r4.next()
            yz r5 = (defpackage.yz) r5
            r6 = 0
            boolean r6 = r0.l(r5, r6, r2)
            if (r6 == 0) goto L57
            ap r4 = r1.r
            int r4 = r4.a
            ap r5 = r5.r
            int r5 = r5.a
            int r4 = r4 - r5
            il r5 = r0.q
            int r5 = r5.b
            if (r4 <= r5) goto L84
            goto Lbf
        L7a:
            ap r4 = r1.r
            int r4 = r4.a
            il r5 = r0.q
            int r5 = r5.b
            if (r4 > r5) goto Lbf
        L84:
            java.lang.String r6 = r1.g
            yo r3 = r1.i
            u50 r7 = defpackage.yo.h(r3)
            dl r3 = r1.o
            q50 r9 = r3.b
            java.lang.String r10 = r3.c
            dl r3 = r1.h()
            q50 r11 = r3.b
            dl r3 = r1.h()
            java.lang.String r12 = r3.c
            ap r3 = r1.r
            float r15 = r3.c()
            v50 r20 = r1.e()
            java.lang.String r21 = r1.j()
            x5f r4 = r0.k
            boolean r0 = r4.h
            if (r0 != 0) goto Lb3
            return r2
        Lb3:
            r16 = -1
            r18 = -1
            d60 r5 = defpackage.d60.e
            r8 = 0
            r14 = 1
            r4.q(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r21)
            return r2
        Lbf:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nn7.l(yz, esk, boolean):boolean");
    }

    public final void m(long j) {
        if (this.r == null || this.p == null) {
            return;
        }
        int i = 0;
        while (i < this.r.size()) {
            if (j >= ((mn7) this.r.valueAt(i)).b + this.p.c) {
                this.r.removeAt(i);
            } else {
                i++;
            }
        }
    }

    public final boolean n(int i) {
        mn7 mn7Var;
        SparseArray sparseArray = this.r;
        if (sparseArray == null || this.p == null || (mn7Var = (mn7) sparseArray.get(i)) == null) {
            return false;
        }
        this.m.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < mn7Var.b + this.p.c) {
            return true;
        }
        m(jCurrentTimeMillis);
        return false;
    }

    public final void o() {
        this.q = ((cy) this.l.a).c().h;
        this.m.getClass();
        m(System.currentTimeMillis());
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ln7 ln7Var = (ln7) obj;
            p(ln7Var.a, ln7Var.b);
        }
        arrayList.clear();
    }

    public final void p(int i, long j) {
        SparseArray sparseArray = this.r;
        if (sparseArray == null || this.p == null) {
            return;
        }
        mn7 mn7Var = (mn7) sparseArray.get(i);
        if (mn7Var != null) {
            if (j < mn7Var.b + this.p.c) {
                mn7Var.a++;
                mn7Var.b = j;
                return;
            }
            m(j);
        }
        this.r.put(i, new mn7(1, j));
        if (this.o == null) {
            bn7 bn7Var = new bn7(this, (byte) 2);
            this.o = bn7Var;
            vml.d(bn7Var, 300000L);
        }
    }

    public final void q() {
        if (this.r == null) {
            return;
        }
        bn7 bn7Var = this.o;
        if (bn7Var != null) {
            vml.a(bn7Var);
            this.o = null;
        }
        HashSet hashSet = new HashSet(this.r.size());
        for (int i = 0; i < this.r.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.r.keyAt(i));
            sb.append(':');
            mn7 mn7Var = (mn7) this.r.valueAt(i);
            sb.append(mn7Var.a);
            sb.append(':');
            sb.append(mn7Var.b);
            hashSet.add(sb.toString());
        }
        g(hashSet);
    }
}
