package ads_mobile_sdk;

import defpackage.hlo;
import defpackage.tso;
import defpackage.vgp;
import java.util.Map;

/* loaded from: classes.dex */
public final class aa implements hlo {
    public final tso a;
    public final fn1 b;
    public final /* synthetic */ byte c;

    public /* synthetic */ aa(tso tsoVar, fn1 fn1Var, byte b) {
        this.c = b;
        this.a = tsoVar;
        this.b = fn1Var;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.c;
        fn1 fn1Var = this.b;
        tso tsoVar = this.a;
        switch (b) {
            case 0:
                return new z9((nx5) tsoVar.get(), (Map) fn1Var.get());
            case 1:
                return new fr3((nx5) tsoVar.get(), (Map) fn1Var.get());
            case 2:
                return new ja((nx5) tsoVar.get(), (Map) fn1Var.get());
            case 3:
                return new qr3((nx5) tsoVar.get(), (Map) fn1Var.get());
            case 4:
                return new vgp((nx5) tsoVar.get(), (Map) fn1Var.get());
            default:
                return new tjp((nx5) tsoVar.get(), (Map) fn1Var.get());
        }
    }
}
