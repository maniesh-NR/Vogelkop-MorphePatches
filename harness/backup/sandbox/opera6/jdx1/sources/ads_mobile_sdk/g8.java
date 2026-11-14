package ads_mobile_sdk;

import android.content.Context;
import defpackage.hlo;
import defpackage.tso;
import defpackage.vkp;
import java.util.Optional;

/* loaded from: classes.dex */
public final class g8 implements hlo {
    public final tso a;
    public final ob1 b;
    public final tso c;
    public final ob1 d;
    public final tso e;
    public final tso f;
    public final /* synthetic */ byte g = 0;

    public g8(tso tsoVar, ob1 ob1Var, tso tsoVar2, ob1 ob1Var2, tso tsoVar3, tso tsoVar4) {
        this.a = tsoVar;
        this.b = ob1Var;
        this.c = tsoVar2;
        this.d = ob1Var2;
        this.e = tsoVar3;
        this.f = tsoVar4;
    }

    public g8(tso tsoVar, ob1 ob1Var, tso tsoVar2, tso tsoVar3, ob1 ob1Var2, tso tsoVar4) {
        this.a = tsoVar;
        this.b = ob1Var;
        this.c = tsoVar2;
        this.e = tsoVar3;
        this.d = ob1Var2;
        this.f = tsoVar4;
    }

    @Override // defpackage.tso
    public final Object get() {
        switch (this.g) {
            case 0:
                return new f8((Optional) this.a.get(), (Optional) this.b.a, (av2) this.c.get(), (Context) this.d.a, (qr0) this.e.get(), (kj0) this.f.get());
            default:
                return new jz2((String) this.a.get(), (a2) this.b.a, (ax0) this.c.get(), (vkp) this.e.get(), (av2) this.d.a, (qr0) this.f.get());
        }
    }
}
