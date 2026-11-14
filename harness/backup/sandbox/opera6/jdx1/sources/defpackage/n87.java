package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n87 extends k1g {
    public final /* synthetic */ ArrayList i;
    public final /* synthetic */ List j;
    public final /* synthetic */ nv6 k;

    public n87(ArrayList arrayList, List list, nv6 nv6Var) {
        this.i = arrayList;
        this.j = list;
        this.k = nv6Var;
    }

    @Override // defpackage.k1g
    public final int C() {
        return this.j.size();
    }

    @Override // defpackage.k1g
    public final int D() {
        return this.i.size();
    }

    @Override // defpackage.k1g
    public final boolean h(int i, int i2) {
        return Intrinsics.a(this.i.get(i), this.j.get(i2));
    }

    @Override // defpackage.k1g
    public final boolean i(int i, int i2) {
        Function1 function1 = (Function1) this.k.a;
        return ((Number) function1.invoke(this.i.get(i))).longValue() == ((Number) function1.invoke(this.j.get(i2))).longValue();
    }
}
