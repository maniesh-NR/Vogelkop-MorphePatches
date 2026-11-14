package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class f7e implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cd1 b;

    public /* synthetic */ f7e(cd1 cd1Var, byte b) {
        this.a = b;
        this.b = cd1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        cd1 cd1Var = this.b;
        m1i m1iVar = (m1i) obj;
        switch (b) {
            case 0:
                float fFloatValue = ((Number) cd1Var.d()).floatValue();
                float fD = i7e.d(m1iVar, fFloatValue);
                float fE = i7e.e(m1iVar, fFloatValue);
                m1iVar.h(fE == 0.0f ? 1.0f : fD / fE);
                m1iVar.r(i7e.a);
                break;
            case 1:
                m1iVar.c(((Number) cd1Var.d()).floatValue());
                break;
            default:
                m1iVar.c(((Number) cd1Var.d()).floatValue());
                break;
        }
        return Unit.a;
    }
}
