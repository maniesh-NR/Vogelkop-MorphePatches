package defpackage;

import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class e8d implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h8d b;

    public /* synthetic */ e8d(h8d h8dVar, byte b) {
        this.a = b;
        this.b = h8dVar;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        h8d h8dVar = this.b;
        ff3 ff3Var = (ff3) obj;
        switch (b) {
            case 0:
                ff3Var.s0(h8dVar);
                break;
            default:
                ff3Var.s0(h8dVar);
                break;
        }
    }
}
