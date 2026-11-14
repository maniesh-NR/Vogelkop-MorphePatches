package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class fv6 implements kpi {
    public final Function1 a;
    public final ev6 b = new ev6(this);
    public final mfe c = new mfe();
    public final t0g d;
    public final t0g e;
    public final t0g f;

    public fv6(Function1 function1) {
        this.a = function1;
        Boolean bool = Boolean.FALSE;
        this.d = hyg.k(bool);
        this.e = hyg.k(bool);
        this.f = hyg.k(bool);
    }

    @Override // defpackage.kpi
    public final boolean a() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    @Override // defpackage.kpi
    public final Object b(gfe gfeVar, Function2 function2, nt5 nt5Var) {
        Object objQ = sgb.q(new s3(this, gfeVar, function2, null, (byte) 22), nt5Var);
        return objQ == px5.a ? objQ : Unit.a;
    }

    @Override // defpackage.kpi
    public final float e(float f) {
        return ((Number) this.a.invoke(Float.valueOf(f))).floatValue();
    }
}
