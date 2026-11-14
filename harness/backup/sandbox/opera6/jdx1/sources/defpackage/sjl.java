package defpackage;

import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class sjl {
    public final t0g a = hyg.k((Object) null);
    public sf1 b;
    public final puj c;

    public sjl(sf1 sf1Var) {
        bvk bvkVar = new bvk((byte) 29);
        sf1Var.getClass();
        qf1 qf1Var = new qf1(sf1Var);
        ArrayList arrayList = qf1Var.c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            List list = (List) bvkVar.invoke(((pf1) arrayList.get(i)).a(LinearLayoutManager.INVALID_OFFSET));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                rf1 rf1Var = (rf1) list.get(i2);
                Object obj = rf1Var.a;
                arrayList3.add(new pf1(rf1Var.d, rf1Var.b, rf1Var.c, obj));
            }
            o95.t(arrayList3, arrayList2);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.b = qf1Var.h();
        this.c = new puj();
    }

    public static rf1 c(rf1 rf1Var, njl njlVar) {
        int iC = njlVar.b.c(r3.f - 1, false);
        if (rf1Var.b < iC) {
            return rf1.a(rf1Var, null, Math.min(rf1Var.c, iC), 11);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r8v2 */
    public final void a(ih5 ih5Var, int i) {
        byte b;
        byte b2;
        boolean z;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1154651354);
        byte b3 = 4;
        byte b4 = 2;
        int i2 = (vt9Var.h(this) ? 4 : 2) | i;
        ?? r8 = 0;
        if (vt9Var.N(i2 & 1, (i2 & 3) != 2)) {
            tb1 tb1Var = (tb1) vt9Var.j(mi5.s);
            sf1 sf1Var = this.b;
            List listA = sf1Var.a(sf1Var.b.length());
            int size = listA.size();
            int i3 = 0;
            while (i3 < size) {
                rf1 rf1Var = (rf1) listA.get(i3);
                int i4 = rf1Var.b;
                Object obj = rf1Var.a;
                if (i4 != rf1Var.c) {
                    vt9Var.W(725478935);
                    Object objK = vt9Var.K();
                    zpa zpaVar = hh5.a;
                    if (objK == zpaVar) {
                        objK = new lde();
                        vt9Var.g0(objK);
                    }
                    lde ldeVar = (lde) objK;
                    b2 = b4;
                    c8e c8eVarN = z5i.N(z7e.b, new gil(this, rf1Var, b4));
                    Object objK2 = vt9Var.K();
                    if (objK2 == zpaVar) {
                        objK2 = new qjl((byte) r8);
                        vt9Var.g0(objK2);
                    }
                    c8e c8eVarK = qyn.K(h0j.a(c8eVarN, r8, (Function1) objK2).d(new yjl(new roj(this, rf1Var, b3))), ldeVar);
                    kmg.a.getClass();
                    c8e c8eVarW0 = o0g.w0(c8eVarK, k1g.e);
                    boolean zH = vt9Var.h(this) | vt9Var.f(rf1Var) | vt9Var.h(tb1Var);
                    Object objK3 = vt9Var.K();
                    if (zH || objK3 == zpaVar) {
                        objK3 = new eek(this, rf1Var, tb1Var);
                        vt9Var.g0(objK3);
                    }
                    nr3.a(jpo.r(c8eVarW0, ldeVar, (Function0) objK3), vt9Var, 0);
                    pfc pfcVar = (pfc) obj;
                    tjl tjlVarB = pfcVar.b();
                    if (tjlVarB == null || (tjlVarB.a == null && tjlVarB.b == null && tjlVarB.c == null && tjlVarB.d == null)) {
                        b = b3;
                        z = false;
                        vt9Var.W(728331710);
                        vt9Var.p(false);
                    } else {
                        vt9Var.W(726303039);
                        Object objK4 = vt9Var.K();
                        if (objK4 == zpaVar) {
                            objK4 = new cgc(ldeVar);
                            vt9Var.g0(objK4);
                        }
                        cgc cgcVar = (cgc) objK4;
                        Unit unit = Unit.a;
                        Object objK5 = vt9Var.K();
                        if (objK5 == zpaVar) {
                            b = b3;
                            objK5 = new zhl((byte) 1, (mt5) rwjVar, (Object) cgcVar);
                            vt9Var.g0(objK5);
                        } else {
                            b = b3;
                        }
                        rm5.e(vt9Var, unit, (Function2) objK5);
                        q0g q0gVar = cgcVar.b;
                        q0g q0gVar2 = cgcVar.b;
                        Boolean boolValueOf = Boolean.valueOf((q0gVar.h() & 2) != 0);
                        Boolean boolValueOf2 = Boolean.valueOf((q0gVar2.h() & 1) != 0);
                        Boolean boolValueOf3 = Boolean.valueOf((q0gVar2.h() & 4) != 0);
                        tjl tjlVarB2 = pfcVar.b();
                        rwj rwjVar = tjlVarB2 != null ? tjlVarB2.a : null;
                        tjl tjlVarB3 = pfcVar.b();
                        rwj rwjVar2 = tjlVarB3 != null ? tjlVarB3.b : null;
                        tjl tjlVarB4 = pfcVar.b();
                        rwj rwjVar3 = tjlVarB4 != null ? tjlVarB4.c : null;
                        tjl tjlVarB5 = pfcVar.b();
                        Object[] objArr = {boolValueOf, boolValueOf2, boolValueOf3, rwjVar, rwjVar2, rwjVar3, tjlVarB5 != null ? tjlVarB5.d : null};
                        boolean zH2 = vt9Var.h(this) | vt9Var.f(rf1Var);
                        Object objK6 = vt9Var.K();
                        if (zH2 || objK6 == zpaVar) {
                            objK6 = new gil(this, rf1Var, cgcVar);
                            vt9Var.g0(objK6);
                        }
                        b(objArr, (Function1) objK6, vt9Var, (i2 << 6) & 896);
                        z = false;
                        vt9Var.p(false);
                    }
                    vt9Var.p(z);
                } else {
                    b = b3;
                    b2 = b4;
                    z = r8;
                    vt9Var.W(728345598);
                    vt9Var.p(z);
                }
                i3++;
                r8 = z;
                b4 = b2;
                b3 = b;
            }
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new nqi(this, i);
        }
    }

    public final void b(Object[] objArr, Function1 function1, ih5 ih5Var, int i) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-2083052099);
        int i2 = (vt9Var.h(function1) ? 32 : 16) | i | (vt9Var.h(this) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY);
        vt9Var.U(-358306546, Integer.valueOf(objArr.length));
        int i3 = i2 | (vt9Var.d(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i3 |= vt9Var.h(obj) ? 4 : 0;
        }
        vt9Var.p(false);
        if ((i3 & 14) == 0) {
            i3 |= 2;
        }
        byte b = 1;
        if (vt9Var.N(i3 & 1, (i3 & 147) != 146)) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(function1);
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
            }
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean zH = vt9Var.h(this) | ((i3 & 112) == 32);
            Object objK = vt9Var.K();
            if (zH || objK == hh5.a) {
                objK = new lb3(this, function1, b);
                vt9Var.g0(objK);
            }
            rm5.c(array, (Function1) objK, vt9Var);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new g9(this, objArr, function1, i, (byte) 29, false);
        }
    }
}
