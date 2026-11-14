package ads_mobile_sdk;

import android.content.Context;
import defpackage.hlo;
import defpackage.tso;
import defpackage.xf8;
import defpackage.yko;
import java.util.Map;
import java.util.Optional;

/* loaded from: classes.dex */
public final class a3 implements hlo {
    public final tso a;
    public final tso b;
    public final hlo c;
    public final /* synthetic */ byte d;

    public a3(ah0 ah0Var, ob1 ob1Var, ah0 ah0Var2) {
        this.d = (byte) 5;
        this.a = ah0Var;
        this.c = ob1Var;
        this.b = ah0Var2;
    }

    public a3(ob1 ob1Var, ob1 ob1Var2, ob1 ob1Var3) {
        this.d = (byte) 2;
        this.c = ob1Var;
        this.a = ob1Var2;
        this.b = ob1Var3;
    }

    public /* synthetic */ a3(tso tsoVar, tso tsoVar2, hlo hloVar, byte b) {
        this.d = b;
        this.a = tsoVar;
        this.b = tsoVar2;
        this.c = hloVar;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.d;
        tso tsoVar = this.b;
        hlo hloVar = this.c;
        tso tsoVar2 = this.a;
        switch (b) {
            case 0:
                return new z2((nx5) ((ah0) tsoVar2).get(), (Map) ((fn1) tsoVar).get(), (a2) ((ob1) hloVar).a);
            case 1:
                return new a02((ux2) tsoVar2.get(), (oo3) tsoVar.get(), (yko) ((m) hloVar).get());
            case 2:
                return new kh3((eq2) xf8.N((Optional) ((ob1) hloVar).a, new eq2()), (ih1) xf8.N((Optional) ((ob1) tsoVar2).a, new ih1()), (dt2) xf8.N((Optional) ((ob1) tsoVar).a, new dt2()), new s8());
            case 3:
                return new g02((ux2) tsoVar2.get(), (oo3) tsoVar.get(), (yko) ((m) hloVar).get());
            case 4:
                return new uv2((a2) tsoVar2.get(), (xv) tsoVar.get(), (tv2) ((ef2) hloVar).get());
            default:
                return new wi3((nx5) ((ah0) tsoVar2).get(), (Context) ((ob1) hloVar).a, (ah3) ((ah0) tsoVar).get());
        }
    }
}
