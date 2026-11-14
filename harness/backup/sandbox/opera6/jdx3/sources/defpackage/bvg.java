package defpackage;

import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class bvg implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tah b;

    public /* synthetic */ bvg(tah tahVar, byte b) {
        this.a = b;
        this.b = tahVar;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        tah tahVar = this.b;
        switch (b) {
            case 0:
                if (!((Boolean) obj).booleanValue()) {
                    tahVar.L(0);
                    break;
                } else {
                    ((c0i) tahVar.g).a();
                    break;
                }
            default:
                tahVar.getClass();
                ((ff3) obj).s0(tahVar);
                break;
        }
    }
}
