package defpackage;

import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class up7 implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hd b;

    public /* synthetic */ up7(hd hdVar, byte b) {
        this.a = b;
        this.b = hdVar;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        hd hdVar = this.b;
        dnn dnnVar = (dnn) obj;
        switch (b) {
            case 0:
                dnnVar.a(hdVar);
                break;
            default:
                dnnVar.a(hdVar);
                break;
        }
    }
}
