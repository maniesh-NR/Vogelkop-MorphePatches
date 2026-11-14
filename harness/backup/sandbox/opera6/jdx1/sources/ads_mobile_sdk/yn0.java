package ads_mobile_sdk;

import android.content.Context;
import defpackage.bro;
import defpackage.hlo;
import defpackage.m7p;
import defpackage.tso;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class yn0 implements hlo {
    public final ob1 a;
    public final tso b;
    public final tso c;
    public final ah0 d;
    public final tso e;
    public final ah0 f;
    public final tso g;
    public final tso h;
    public final ah0 i;
    public final tso j;
    public final ob1 k;
    public final tso l;
    public final tso m;
    public final ob1 n;
    public final ob1 o;
    public final tso p;
    public final tso q;
    public final tso r;
    public final /* synthetic */ byte s;

    public /* synthetic */ yn0(ob1 ob1Var, tso tsoVar, tso tsoVar2, ah0 ah0Var, tso tsoVar3, ah0 ah0Var2, tso tsoVar4, tso tsoVar5, ah0 ah0Var3, tso tsoVar6, ob1 ob1Var2, tso tsoVar7, tso tsoVar8, ob1 ob1Var3, ob1 ob1Var4, tso tsoVar9, tso tsoVar10, tso tsoVar11, byte b) {
        this.s = b;
        this.a = ob1Var;
        this.b = tsoVar;
        this.c = tsoVar2;
        this.d = ah0Var;
        this.e = tsoVar3;
        this.f = ah0Var2;
        this.g = tsoVar4;
        this.h = tsoVar5;
        this.i = ah0Var3;
        this.j = tsoVar6;
        this.k = ob1Var2;
        this.l = tsoVar7;
        this.m = tsoVar8;
        this.n = ob1Var3;
        this.o = ob1Var4;
        this.p = tsoVar9;
        this.q = tsoVar10;
        this.r = tsoVar11;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.s;
        tso tsoVar = this.r;
        tso tsoVar2 = this.q;
        tso tsoVar3 = this.p;
        ob1 ob1Var = this.o;
        ob1 ob1Var2 = this.n;
        tso tsoVar4 = this.m;
        tso tsoVar5 = this.l;
        ob1 ob1Var3 = this.k;
        tso tsoVar6 = this.j;
        ah0 ah0Var = this.i;
        tso tsoVar7 = this.h;
        tso tsoVar8 = this.g;
        ah0 ah0Var2 = this.f;
        tso tsoVar9 = this.e;
        ah0 ah0Var3 = this.d;
        tso tsoVar10 = this.c;
        tso tsoVar11 = this.b;
        ob1 ob1Var4 = this.a;
        switch (b) {
            case 0:
                Context context = (Context) ob1Var4.a;
                nx5 nx5Var = (nx5) tsoVar11.get();
                CoroutineContext coroutineContext = (CoroutineContext) tsoVar10.get();
                nx5 nx5Var2 = (nx5) ah0Var3.get();
                qr0 qr0Var = (qr0) tsoVar9.get();
                ah3 ah3Var = (ah3) ah0Var2.get();
                return new xn0(context, nx5Var, coroutineContext, nx5Var2, qr0Var, ah3Var, (String) tsoVar7.get(), (z2) ah0Var.get(), (tjp) tsoVar6.get(), (sy0) ob1Var3.a, (ux2) tsoVar5.get(), (kh3) tsoVar4.get(), (av2) ob1Var2.a, (a2) ob1Var.a, (m7p) tsoVar3.get(), (ax0) tsoVar2.get(), (bro) tsoVar.get());
            default:
                return new yo0((Context) ob1Var4.a, (nx5) tsoVar11.get(), (CoroutineContext) tsoVar10.get(), (nx5) ah0Var3.get(), (qr0) tsoVar9.get(), (ah3) ah0Var2.get(), (k8) tsoVar8.get(), (String) tsoVar7.get(), (z2) ah0Var.get(), (tjp) tsoVar6.get(), (sy0) ob1Var3.a, (ux2) tsoVar5.get(), (kh3) tsoVar4.get(), (av2) ob1Var2.a, (a2) ob1Var.a, (m7p) tsoVar3.get(), (ax0) tsoVar2.get(), (bro) tsoVar.get());
        }
    }
}
