package defpackage;

import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class wfn implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cgn b;

    public /* synthetic */ wfn(cgn cgnVar, byte b) {
        this.a = b;
        this.b = cgnVar;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        cgn cgnVar = this.b;
        switch (b) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    cgnVar.z.a();
                    break;
                }
                break;
            default:
                cgnVar.K0();
                break;
        }
    }
}
