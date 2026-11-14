package defpackage;

import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class se9 implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ eof b;

    public /* synthetic */ se9(eof eofVar, byte b) {
        this.a = b;
        this.b = eofVar;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        eof eofVar = this.b;
        switch (b) {
            case 0:
                eofVar.run((Long) obj);
                break;
            default:
                eofVar.run(null);
                break;
        }
    }
}
