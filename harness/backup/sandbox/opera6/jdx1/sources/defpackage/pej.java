package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class pej {
    public final boolean a;
    public final Function1 b;
    public h49 c;
    public final a21 d;
    public h49 e;
    public h49 f;

    public pej(boolean z, Function0 function0, Function0 function02, qej qejVar, Function1 function1) {
        this.a = z;
        this.b = function1;
        if (z && qejVar == qej.c) {
            qp2.o("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
            throw null;
        }
        this.c = lej.a;
        this.d = new a21(qejVar, new p01(function0, (byte) 12), function02, new j3i(this, (byte) 25), function1);
        this.e = rm5.Q();
        this.f = rm5.Q();
    }

    public static Object a(pej pejVar, qej qejVar, h49 h49Var, kuk kukVar) {
        Object objB = pejVar.d.b(qejVar, gfe.a, new oej(pejVar, ((p0g) pejVar.d.l).h(), h49Var, null), kukVar);
        return objB == px5.a ? objB : Unit.a;
    }

    public final Object b(kuk kukVar) {
        Object objA;
        qej qejVar = qej.b;
        return (((Boolean) this.b.invoke(qejVar)).booleanValue() && (objA = a(this, qejVar, this.e, kukVar)) == px5.a) ? objA : Unit.a;
    }

    public final qej c() {
        return (qej) ((t0g) this.d.g).getValue();
    }

    public final Object d(kuk kukVar) {
        Object objA;
        qej qejVar = qej.a;
        return (((Boolean) this.b.invoke(qejVar)).booleanValue() && (objA = a(this, qejVar, this.f, kukVar)) == px5.a) ? objA : Unit.a;
    }

    public final boolean e() {
        return ((t0g) this.d.g).getValue() != qej.a;
    }

    public final Object f(kuk kukVar) {
        Object objA;
        if (this.a) {
            qp2.n("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
            return null;
        }
        qej qejVar = qej.c;
        return (((Boolean) this.b.invoke(qejVar)).booleanValue() && (objA = a(this, qejVar, this.f, kukVar)) == px5.a) ? objA : Unit.a;
    }

    public final Object g(kuk kukVar) {
        Object objA;
        x9d x9dVarH = this.d.h();
        qej qejVar = qej.c;
        if (!x9dVarH.a.containsKey(qejVar)) {
            qejVar = qej.b;
        }
        return (((Boolean) this.b.invoke(qejVar)).booleanValue() && (objA = a(this, qejVar, this.e, kukVar)) == px5.a) ? objA : Unit.a;
    }
}
