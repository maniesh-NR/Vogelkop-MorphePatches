package defpackage;

import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class x6d implements cr9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ utm b;

    public /* synthetic */ x6d(utm utmVar, byte b) {
        this.a = b;
        this.b = utmVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        utm utmVar = this.b;
        vt9 vt9Var = (ih5) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i = iIntValue & 17;
        switch (b) {
            case 0:
                vt9 vt9Var2 = vt9Var;
                if (vt9Var2.N(iIntValue & 1, i != 16)) {
                    xf8.g(utmVar, a26.Z(mpj.a, 16.0f, 0.0f, 2), vt9Var2, 48);
                } else {
                    vt9Var2.Q();
                }
                break;
            default:
                vt9 vt9Var3 = vt9Var;
                if (vt9Var3.N(iIntValue & 1, i != 16)) {
                    jpo.d(utmVar, a26.Z(z7e.b, 16.0f, 0.0f, 2), vt9Var3, 48);
                } else {
                    vt9Var3.Q();
                }
                break;
        }
        return Unit.a;
    }
}
