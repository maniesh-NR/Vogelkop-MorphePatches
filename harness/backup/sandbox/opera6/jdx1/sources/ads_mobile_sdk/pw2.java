package ads_mobile_sdk;

import android.content.Context;
import defpackage.hlo;
import defpackage.tso;

/* loaded from: classes.dex */
public final class pw2 implements hlo {
    public final ob1 a;
    public final ob1 b;
    public final tso c;
    public final ob1 d;
    public final tso e;
    public final tso f;
    public final ab0 g;
    public final /* synthetic */ byte h;

    public /* synthetic */ pw2(ob1 ob1Var, ob1 ob1Var2, tso tsoVar, ob1 ob1Var3, tso tsoVar2, tso tsoVar3, ab0 ab0Var, byte b) {
        this.h = b;
        this.a = ob1Var;
        this.b = ob1Var2;
        this.c = tsoVar;
        this.d = ob1Var3;
        this.e = tsoVar2;
        this.f = tsoVar3;
        this.g = ab0Var;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.h;
        tso tsoVar = this.f;
        tso tsoVar2 = this.e;
        ob1 ob1Var = this.d;
        tso tsoVar3 = this.c;
        ob1 ob1Var2 = this.b;
        ob1 ob1Var3 = this.a;
        switch (b) {
            case 0:
                return new ow2((av2) ob1Var3.a, (defpackage.r83) ob1Var2.a, (cu2) tsoVar3.get(), (Context) ob1Var.a, (g0) tsoVar2.get(), (rh0) tsoVar.get(), this.g);
            default:
                return new sx2((av2) ob1Var3.a, (defpackage.r83) ob1Var2.a, (cu2) tsoVar3.get(), (Context) ob1Var.a, (g0) tsoVar2.get(), (rh0) tsoVar.get(), this.g);
        }
    }
}
