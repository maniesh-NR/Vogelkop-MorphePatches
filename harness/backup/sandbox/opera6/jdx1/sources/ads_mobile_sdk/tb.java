package ads_mobile_sdk;

import android.content.Context;
import defpackage.hlo;
import defpackage.jlp;
import defpackage.mip;
import defpackage.nap;
import defpackage.tso;
import defpackage.wso;
import defpackage.zjp;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class tb implements hlo {
    public final ah0 a;
    public final tso b;
    public final ob1 c;
    public final tso d;
    public final tso e;
    public final tso f;
    public final tso g;
    public final tso h;
    public final tso i;
    public final tso j;
    public final tso k;
    public final /* synthetic */ byte l = 0;

    public tb(ah0 ah0Var, tso tsoVar, ob1 ob1Var, tso tsoVar2, tso tsoVar3, tso tsoVar4, tso tsoVar5, tso tsoVar6, tso tsoVar7, tso tsoVar8, tso tsoVar9) {
        this.a = ah0Var;
        this.b = tsoVar;
        this.c = ob1Var;
        this.d = tsoVar2;
        this.e = tsoVar3;
        this.f = tsoVar4;
        this.g = tsoVar5;
        this.h = tsoVar6;
        this.i = tsoVar7;
        this.j = tsoVar8;
        this.k = tsoVar9;
    }

    public tb(ob1 ob1Var, tso tsoVar, tso tsoVar2, ah0 ah0Var, tso tsoVar3, tso tsoVar4, tso tsoVar5, tso tsoVar6, tso tsoVar7, tso tsoVar8, tso tsoVar9) {
        this.c = ob1Var;
        this.b = tsoVar;
        this.d = tsoVar2;
        this.a = ah0Var;
        this.e = tsoVar3;
        this.f = tsoVar4;
        this.g = tsoVar5;
        this.h = tsoVar6;
        this.i = tsoVar7;
        this.j = tsoVar8;
        this.k = tsoVar9;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.l;
        tso tsoVar = this.k;
        tso tsoVar2 = this.j;
        tso tsoVar3 = this.i;
        tso tsoVar4 = this.g;
        tso tsoVar5 = this.f;
        tso tsoVar6 = this.e;
        ah0 ah0Var = this.a;
        tso tsoVar7 = this.d;
        tso tsoVar8 = this.b;
        ob1 ob1Var = this.c;
        switch (b) {
            case 0:
                return new sb((nx5) ah0Var.get(), (CoroutineContext) tsoVar8.get(), (Context) ob1Var.a, (nap) tsoVar7.get(), (zjp) tsoVar6.get(), (g0) tsoVar5.get(), (dk) tsoVar4.get(), (mip) this.h.get(), (qr0) tsoVar3.get(), (ux2) tsoVar2.get(), (i41) tsoVar.get());
            default:
                qr0 qr0Var = (qr0) tsoVar8.get();
                CoroutineContext coroutineContext = (CoroutineContext) tsoVar7.get();
                nx5 nx5Var = (nx5) ah0Var.get();
                ux2 ux2Var = (ux2) tsoVar6.get();
                return new yq3(qr0Var, coroutineContext, nx5Var, ux2Var, (qw) tsoVar4.get(), this.h, (jlp) tsoVar3.get(), (wso) tsoVar2.get(), (mip) tsoVar.get());
        }
    }
}
