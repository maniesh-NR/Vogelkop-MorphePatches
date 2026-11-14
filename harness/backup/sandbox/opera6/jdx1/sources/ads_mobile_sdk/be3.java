package ads_mobile_sdk;

import android.content.Context;
import defpackage.hlo;
import defpackage.nip;
import defpackage.szo;
import defpackage.tso;
import java.util.Optional;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class be3 implements hlo {
    public final ah0 a;
    public final ob1 b;
    public final ah0 c;
    public final tso d;
    public final tso e;
    public final tso f;
    public final /* synthetic */ byte g = 0;

    public be3(ah0 ah0Var, ob1 ob1Var, ah0 ah0Var2, tso tsoVar, tso tsoVar2, tso tsoVar3) {
        this.a = ah0Var;
        this.b = ob1Var;
        this.c = ah0Var2;
        this.d = tsoVar;
        this.e = tsoVar2;
        this.f = tsoVar3;
    }

    public be3(ob1 ob1Var, tso tsoVar, ah0 ah0Var, ah0 ah0Var2, tso tsoVar2, tso tsoVar3) {
        this.b = ob1Var;
        this.d = tsoVar;
        this.a = ah0Var;
        this.c = ah0Var2;
        this.e = tsoVar2;
        this.f = tsoVar3;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.g;
        tso tsoVar = this.f;
        tso tsoVar2 = this.e;
        ah0 ah0Var = this.c;
        ah0 ah0Var2 = this.a;
        tso tsoVar3 = this.d;
        ob1 ob1Var = this.b;
        switch (b) {
            case 0:
                return new ae3((nx5) ah0Var2.get(), (a2) ob1Var.a, (z2) ah0Var.get(), (nip) tsoVar3.get(), (szo) tsoVar2.get(), (Optional) tsoVar.get());
            default:
                return new s52((Context) ob1Var.a, (CoroutineContext) tsoVar3.get(), (nx5) ah0Var2.get(), (ah3) ah0Var.get(), (ux2) tsoVar2.get(), (String) tsoVar.get());
        }
    }
}
