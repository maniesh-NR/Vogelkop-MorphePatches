package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class yq3 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pej b;

    public /* synthetic */ yq3(pej pejVar, byte b) {
        this.a = b;
        this.b = pejVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        pej pejVar = this.b;
        m1i m1iVar = (m1i) obj;
        switch (b) {
            case 0:
                a21 a21Var = pejVar.d;
                float fH = ((p0g) a21Var.k).h();
                float fC = a21Var.h().c();
                float f = fH < fC ? fC - fH : 0.0f;
                m1iVar.h(f > 0.0f ? (Float.intBitsToFloat((int) (m1iVar.r & 4294967295L)) + f) / Float.intBitsToFloat((int) (m1iVar.r & 4294967295L)) : 1.0f);
                m1iVar.r(z7h.a(0.5f, 0.0f));
                break;
            default:
                a21 a21Var2 = pejVar.d;
                float fH2 = ((p0g) a21Var2.k).h();
                float fC2 = a21Var2.h().c();
                float f2 = fH2 < fC2 ? fC2 - fH2 : 0.0f;
                m1iVar.h(f2 > 0.0f ? 1.0f / ((Float.intBitsToFloat((int) (m1iVar.r & 4294967295L)) + f2) / Float.intBitsToFloat((int) (m1iVar.r & 4294967295L))) : 1.0f);
                m1iVar.r(z7h.a(0.5f, 0.0f));
                break;
        }
        return Unit.a;
    }
}
