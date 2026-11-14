package ads_mobile_sdk;

import android.content.Context;
import defpackage.hlo;
import defpackage.k3p;
import defpackage.tso;

/* loaded from: classes.dex */
public final class vp1 implements hlo {
    public final ob1 a;
    public final tso b;
    public final tso c;
    public final ob1 d;
    public final /* synthetic */ byte e = 1;

    public vp1(ob1 ob1Var, tso tsoVar, ob1 ob1Var2, tso tsoVar2) {
        this.a = ob1Var;
        this.b = tsoVar;
        this.d = ob1Var2;
        this.c = tsoVar2;
    }

    public vp1(ob1 ob1Var, tso tsoVar, tso tsoVar2, ob1 ob1Var2) {
        this.a = ob1Var;
        this.b = tsoVar;
        this.c = tsoVar2;
        this.d = ob1Var2;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.e;
        tso tsoVar = this.c;
        ob1 ob1Var = this.d;
        tso tsoVar2 = this.b;
        ob1 ob1Var2 = this.a;
        switch (b) {
            case 0:
                return new up1((Context) ob1Var2.a, (th3) tsoVar2.get(), (a) tsoVar.get(), (l7) ob1Var.a);
            default:
                return new qk2((k3p) ob1Var2.a, (rp1) tsoVar2.get(), (Context) ob1Var.a, (th3) tsoVar.get(), (byte) 1);
        }
    }
}
