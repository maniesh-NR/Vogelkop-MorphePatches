package ads_mobile_sdk;

import android.content.Context;
import defpackage.hlo;
import defpackage.tso;

/* loaded from: classes.dex */
public final class ej0 implements hlo {
    public final ob1 a;
    public final ob1 b;
    public final tso c;
    public final /* synthetic */ byte d;

    public /* synthetic */ ej0(ob1 ob1Var, ob1 ob1Var2, tso tsoVar, byte b) {
        this.d = b;
        this.a = ob1Var;
        this.b = ob1Var2;
        this.c = tsoVar;
    }

    @Override // defpackage.tso
    public final Object get() {
        switch (this.d) {
            case 0:
                return new dj0((Context) this.a.a, (l7) this.b.a, (ia3) this.c.get());
            default:
                return new z6((qm1) this.c.get());
        }
    }
}
