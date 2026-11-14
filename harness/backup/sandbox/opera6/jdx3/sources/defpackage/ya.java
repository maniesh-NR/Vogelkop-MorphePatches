package defpackage;

import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class ya implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bb b;

    public /* synthetic */ ya(bb bbVar, byte b) {
        this.a = b;
        this.b = bbVar;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        bb bbVar = this.b;
        switch (b) {
            case 0:
                bbVar.d = true;
                bbVar.a();
                break;
            default:
                bbVar.e = true;
                bbVar.a();
                break;
        }
    }
}
