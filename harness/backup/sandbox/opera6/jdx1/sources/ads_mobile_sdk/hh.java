package ads_mobile_sdk;

import android.content.Context;
import defpackage.hlo;
import defpackage.tso;

/* loaded from: classes.dex */
public final class hh implements hlo {
    public final ob1 a;
    public final tso b;
    public final ob1 c;
    public final tso d;
    public final tso e;
    public final ab0 f;
    public final /* synthetic */ byte g;

    public /* synthetic */ hh(ob1 ob1Var, tso tsoVar, ob1 ob1Var2, tso tsoVar2, tso tsoVar3, ab0 ab0Var, byte b) {
        this.g = b;
        this.a = ob1Var;
        this.b = tsoVar;
        this.c = ob1Var2;
        this.d = tsoVar2;
        this.e = tsoVar3;
        this.f = ab0Var;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.g;
        tso tsoVar = this.e;
        tso tsoVar2 = this.d;
        ob1 ob1Var = this.c;
        tso tsoVar3 = this.b;
        ob1 ob1Var2 = this.a;
        switch (b) {
            case 0:
                return new gh((defpackage.r83) ob1Var2.a, (cu2) tsoVar3.get(), (Context) ob1Var.a, (g0) tsoVar2.get(), (rh0) tsoVar.get(), this.f);
            default:
                return new yh((defpackage.r83) ob1Var2.a, (cu2) tsoVar3.get(), (Context) ob1Var.a, (g0) tsoVar2.get(), (rh0) tsoVar.get(), this.f);
        }
    }
}
