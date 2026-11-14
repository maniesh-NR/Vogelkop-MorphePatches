package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class q56 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.e;
        ef0 ef0Var2 = ef0.b;
        f = new ef0[]{ef0Var, ef0Var2, ef0Var2, ef0Var2, ef0Var2, ef0Var2, ef0Var2, ef0Var2, ef0Var2, ef0Var2, ef0Var, ef0Var, ef0Var, ef0Var2, ef0Var2, ef0Var2, ef0Var2, ef0Var, ef0Var2, ef0Var, ef0Var, ef0Var2, ef0Var2, ef0Var2, ef0Var, ef0Var2, ef0Var, ef0Var2, ef0Var, ef0Var2, ef0Var, ef0Var, ef0Var, ef0Var};
        df0 df0Var = df0.d;
        g = new df0[]{df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var};
    }

    public final hf0 A() {
        List list = (List) n(10);
        if (list != null && !list.isEmpty()) {
            return new hf0(this, 10, list);
        }
        ArrayList arrayList = new ArrayList();
        q(10, 1, arrayList);
        return new hf0(this, 10, arrayList);
    }

    public final hf0 B() {
        List list = (List) n(23);
        if (list != null && !list.isEmpty()) {
            return new hf0(this, 23, list);
        }
        ArrayList arrayList = new ArrayList();
        q(23, 1, arrayList);
        return new hf0(this, 23, arrayList);
    }

    @Override // defpackage.jf0
    public final df0 a(int i) {
        return g[i];
    }

    @Override // defpackage.jf0
    public final ef0 b(int i) {
        return f[i];
    }

    @Override // defpackage.jf0
    public final jf0 m(jf0 jf0Var) {
        q56 q56Var = (q56) jf0Var;
        Object objI = jf0.i((List) q56Var.n(0), (List) n(0));
        if (objI != null) {
            q(0, 1, objI);
        }
        Object obj = (n56) jf0.f((n56) q56Var.n(1), (n56) n(1));
        if (obj != null) {
            q(1, 1, obj);
        }
        Object objI2 = jf0.i((List) q56Var.n(2), (List) n(2));
        if (objI2 != null) {
            q(2, 1, objI2);
        }
        Object objK = jf0.k((Map) q56Var.n(3), (Map) n(3));
        if (objK != null) {
            q(3, 1, objK);
        }
        Object obj2 = (Boolean) q56Var.n(4);
        Object obj3 = (Boolean) n(4);
        if (obj2 == null || obj3 != null) {
            obj2 = obj3;
        }
        if (obj2 != null) {
            q(4, 1, obj2);
        }
        Object obj4 = (Integer) q56Var.n(5);
        Object obj5 = (Integer) n(5);
        if (obj4 == null || obj5 != null) {
            obj4 = obj5;
        }
        if (obj4 != null) {
            q(5, 1, obj4);
        }
        Object objK2 = jf0.k((Map) q56Var.n(6), (Map) n(6));
        if (objK2 != null) {
            q(6, 1, objK2);
        }
        Object obj6 = (Boolean) q56Var.n(7);
        Object obj7 = (Boolean) n(7);
        if (obj6 == null || obj7 != null) {
            obj6 = obj7;
        }
        if (obj6 != null) {
            q(7, 1, obj6);
        }
        Object objH = jf0.h((Long) q56Var.n(8), (Long) n(8));
        if (objH != null) {
            q(8, 1, objH);
        }
        Object objI3 = jf0.i((List) q56Var.n(9), (List) n(9));
        if (objI3 != null) {
            q(9, 1, objI3);
        }
        Object objI4 = jf0.i((List) q56Var.n(10), (List) n(10));
        if (objI4 != null) {
            q(10, 1, objI4);
        }
        Object objI5 = jf0.i((List) q56Var.n(11), (List) n(11));
        if (objI5 != null) {
            q(11, 1, objI5);
        }
        Object objI6 = jf0.i((List) q56Var.n(12), (List) n(12));
        if (objI6 != null) {
            q(12, 1, objI6);
        }
        Object objI7 = jf0.i((List) q56Var.n(13), (List) n(13));
        if (objI7 != null) {
            q(13, 1, objI7);
        }
        Object obj8 = (Boolean) q56Var.n(14);
        Object obj9 = (Boolean) n(14);
        if (obj8 == null || obj9 != null) {
            obj8 = obj9;
        }
        if (obj8 != null) {
            q(14, 1, obj8);
        }
        Integer numValueOf = (Integer) q56Var.n(15);
        Integer num = (Integer) n(15);
        if (num != null) {
            numValueOf = numValueOf == null ? num : Integer.valueOf(Math.max(numValueOf.intValue(), num.intValue()));
        }
        if (numValueOf != null) {
            q(15, 1, numValueOf);
        }
        Object objH2 = jf0.h((Long) q56Var.n(16), (Long) n(16));
        if (objH2 != null) {
            q(16, 1, objH2);
        }
        Object objH3 = jf0.h((Long) q56Var.n(17), (Long) n(17));
        if (objH3 != null) {
            q(17, 1, objH3);
        }
        Object objI8 = jf0.i((List) q56Var.n(18), (List) n(18));
        if (objI8 != null) {
            q(18, 1, objI8);
        }
        Object objI9 = jf0.i((List) q56Var.n(19), (List) n(19));
        if (objI9 != null) {
            q(19, 1, objI9);
        }
        Object objI10 = jf0.i((List) q56Var.n(20), (List) n(20));
        if (objI10 != null) {
            q(20, 1, objI10);
        }
        Object obj10 = (e70) jf0.f((e70) q56Var.n(21), (e70) n(21));
        if (obj10 != null) {
            q(21, 1, obj10);
        }
        Object objI11 = jf0.i((List) q56Var.n(22), (List) n(22));
        if (objI11 != null) {
            q(22, 1, objI11);
        }
        Object objI12 = jf0.i((List) q56Var.n(23), (List) n(23));
        if (objI12 != null) {
            q(23, 1, objI12);
        }
        Object obj11 = (ei0) q56Var.n(24);
        Object obj12 = (ei0) n(24);
        if (obj11 == null || obj12 != null) {
            obj11 = obj12;
        }
        if (obj11 != null) {
            q(24, 1, obj11);
        }
        Object obj13 = (Boolean) q56Var.n(25);
        Object obj14 = (Boolean) n(25);
        if (obj13 == null || obj14 != null) {
            obj13 = obj14;
        }
        if (obj13 != null) {
            q(25, 1, obj13);
        }
        Object objL = jf0.l((Map) q56Var.n(26), (Map) n(26));
        if (objL != null) {
            q(26, 1, objL);
        }
        Object obj15 = (Long) q56Var.n(27);
        Object obj16 = (Long) n(27);
        if (obj15 == null || obj16 != null) {
            obj15 = obj16;
        }
        if (obj15 != null) {
            q(27, 1, obj15);
        }
        Object obj17 = (Integer) q56Var.n(28);
        Object obj18 = (Integer) n(28);
        if (obj17 == null || obj18 != null) {
            obj17 = obj18;
        }
        if (obj17 != null) {
            q(28, 1, obj17);
        }
        Object objL2 = jf0.l((Map) q56Var.n(29), (Map) n(29));
        if (objL2 != null) {
            q(29, 1, objL2);
        }
        Object obj19 = (Boolean) q56Var.n(30);
        Object obj20 = (Boolean) n(30);
        if (obj19 == null || obj20 != null) {
            obj19 = obj20;
        }
        if (obj19 != null) {
            q(30, 1, obj19);
        }
        Object obj21 = (Long) q56Var.n(31);
        Object obj22 = (Long) n(31);
        if (obj21 == null || obj22 != null) {
            obj21 = obj22;
        }
        if (obj21 != null) {
            q(31, 1, obj21);
        }
        Object obj23 = (Long) q56Var.n(32);
        Object obj24 = (Long) n(32);
        if (obj23 == null || obj24 != null) {
            obj23 = obj24;
        }
        if (obj23 != null) {
            q(32, 1, obj23);
        }
        Object objI13 = jf0.i((List) q56Var.n(33), (List) n(33));
        if (objI13 != null) {
            q(33, 1, objI13);
        }
        return this;
    }

    public final void x(q56 q56Var) {
        if (n(4) != null) {
            q56Var.q(4, 1, (Boolean) n(4));
        }
        if (n(5) != null) {
            q56Var.q(5, 1, (Integer) n(5));
        }
        if (n(7) != null) {
            q56Var.q(7, 1, (Boolean) n(7));
        }
        if (n(15) != null) {
            q56Var.q(15, 1, (Integer) n(15));
        }
        if (n(24) != null) {
            q56Var.q(24, 1, (ei0) n(24));
        }
        if (n(27) != null) {
            q56Var.q(27, 1, (Long) n(27));
        }
        if (n(28) != null) {
            q56Var.q(28, 1, (Integer) n(28));
        }
        if (n(30) != null) {
            q56Var.q(30, 1, (Boolean) n(30));
        }
        if (n(31) != null) {
            q56Var.q(31, 1, (Long) n(31));
        }
        if (n(32) != null) {
            q56Var.q(32, 1, (Long) n(32));
        }
    }

    public final n56 y(zpa zpaVar) {
        n56 n56Var = (n56) n(1);
        if (n56Var != null) {
            return n56Var;
        }
        zpaVar.getClass();
        q(1, 1, new n56(2443, 1, 6));
        return (n56) n(1);
    }

    public final hf0 z() {
        List list = (List) n(33);
        if (list != null && !list.isEmpty()) {
            return new hf0(this, 33, list);
        }
        ArrayList arrayList = new ArrayList();
        q(33, 1, arrayList);
        return new hf0(this, 33, arrayList);
    }
}
