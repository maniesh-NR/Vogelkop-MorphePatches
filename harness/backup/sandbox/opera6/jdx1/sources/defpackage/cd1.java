package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class cd1 {
    public final j8m a;
    public final Object b;
    public final xe1 c;
    public final t0g d;
    public final t0g e;
    public final nfe f;
    public final a2k g;
    public final if1 h;
    public final if1 i;
    public final if1 j;
    public final if1 k;

    public cd1(Object obj, j8m j8mVar, Object obj2) {
        this.a = j8mVar;
        this.b = obj2;
        xe1 xe1Var = new xe1(j8mVar, obj, null, 60);
        this.c = xe1Var;
        this.d = hyg.k(Boolean.FALSE);
        this.e = hyg.k(obj);
        this.f = new nfe();
        this.g = new a2k(obj2);
        if1 if1Var = xe1Var.c;
        boolean z = if1Var instanceof ef1;
        ef1 ef1Var = z ? ui6.e : if1Var instanceof ff1 ? ui6.f : if1Var instanceof gf1 ? ui6.g : ui6.h;
        this.h = ef1Var;
        ef1 ef1Var2 = z ? ui6.a : if1Var instanceof ff1 ? ui6.b : if1Var instanceof gf1 ? ui6.c : ui6.d;
        this.i = ef1Var2;
        this.j = ef1Var;
        this.k = ef1Var2;
    }

    public /* synthetic */ cd1(Object obj, j8m j8mVar, Object obj2, int i) {
        this(obj, j8mVar, (i & 4) != 0 ? null : obj2);
    }

    public static Object a(cd1 cd1Var, Object obj, we1 we1Var, mt5 mt5Var, int i) {
        if ((i & 2) != 0) {
            we1Var = cd1Var.g;
        }
        we1 we1Var2 = we1Var;
        Object objInvoke = cd1Var.a.b.invoke(cd1Var.c.c);
        Object objD = cd1Var.d();
        j8m j8mVar = cd1Var.a;
        return nfe.a(cd1Var.f, new ad1(cd1Var, objInvoke, new ecl(we1Var2, j8mVar, objD, obj, (if1) j8mVar.a.invoke(objInvoke)), cd1Var.c.d, null), mt5Var);
    }

    public final Object b(Object obj) {
        if1 if1Var = this.h;
        if1 if1Var2 = this.j;
        boolean zA = Intrinsics.a(if1Var2, if1Var);
        if1 if1Var3 = this.k;
        if (!zA || !Intrinsics.a(if1Var3, this.i)) {
            j8m j8mVar = this.a;
            if1 if1Var4 = (if1) j8mVar.a.invoke(obj);
            int iB = if1Var4.b();
            boolean z = false;
            for (int i = 0; i < iB; i++) {
                if (if1Var4.a(i) < if1Var2.a(i) || if1Var4.a(i) > if1Var3.a(i)) {
                    if1Var4.e(djh.b(if1Var4.a(i), if1Var2.a(i), if1Var3.a(i)), i);
                    z = true;
                }
            }
            if (z) {
                return j8mVar.b.invoke(if1Var4);
            }
        }
        return obj;
    }

    public final void c() {
        xe1 xe1Var = this.c;
        xe1Var.c.d();
        xe1Var.d = Long.MIN_VALUE;
        this.d.setValue(Boolean.FALSE);
    }

    public final Object d() {
        return this.c.b.getValue();
    }

    public final Object e(mt5 mt5Var, Object obj) {
        Object objA = nfe.a(this.f, new bd1(this, obj, null, (byte) 0), mt5Var);
        return objA == px5.a ? objA : Unit.a;
    }
}
