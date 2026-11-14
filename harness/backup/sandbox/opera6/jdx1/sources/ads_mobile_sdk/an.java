package ads_mobile_sdk;

import android.content.Context;
import defpackage.hlo;
import defpackage.llp;
import defpackage.tso;

/* loaded from: classes.dex */
public final class an implements hlo {
    public final ob1 a;
    public final ob1 b;
    public final tso c;
    public final ob1 d;
    public final tso e;
    public final tso f;
    public final ab0 g;
    public final ob1 h;
    public final /* synthetic */ byte i;

    public /* synthetic */ an(ob1 ob1Var, ob1 ob1Var2, tso tsoVar, ob1 ob1Var3, tso tsoVar2, tso tsoVar3, ab0 ab0Var, ob1 ob1Var4, byte b) {
        this.i = b;
        this.a = ob1Var;
        this.b = ob1Var2;
        this.c = tsoVar;
        this.d = ob1Var3;
        this.e = tsoVar2;
        this.f = tsoVar3;
        this.g = ab0Var;
        this.h = ob1Var4;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.i;
        ob1 ob1Var = this.h;
        tso tsoVar = this.f;
        tso tsoVar2 = this.e;
        ob1 ob1Var2 = this.d;
        tso tsoVar3 = this.c;
        ob1 ob1Var3 = this.b;
        ob1 ob1Var4 = this.a;
        switch (b) {
            case 0:
                return new zm((defpackage.r83) ob1Var4.a, (defpackage.v23) ob1Var3.a, (cu2) tsoVar3.get(), (Context) ob1Var2.a, (g0) tsoVar2.get(), (rh0) tsoVar.get(), this.g, (llp) ob1Var.a);
            case 1:
                return new bm((defpackage.r83) ob1Var4.a, (defpackage.v23) ob1Var3.a, (cu2) tsoVar3.get(), (Context) ob1Var2.a, (g0) tsoVar2.get(), (rh0) tsoVar.get(), this.g, (llp) ob1Var.a);
            default:
                return new fm((defpackage.r83) ob1Var4.a, (defpackage.v23) ob1Var3.a, (cu2) tsoVar3.get(), (Context) ob1Var2.a, (g0) tsoVar2.get(), (rh0) tsoVar.get(), this.g, (llp) ob1Var.a);
        }
    }
}
