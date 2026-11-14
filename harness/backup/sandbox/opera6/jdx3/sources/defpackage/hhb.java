package defpackage;

import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class hhb implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lhb b;

    public /* synthetic */ hhb(lhb lhbVar, byte b) {
        this.a = b;
        this.b = lhbVar;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        lhb lhbVar = this.b;
        switch (b) {
            case 0:
                yz yzVar = (yz) obj;
                lhbVar.j = false;
                if (lhbVar.h == null) {
                    lhbVar.h = yzVar;
                    break;
                } else {
                    yzVar.c();
                    break;
                }
            default:
                lhbVar.j = false;
                lhbVar.i = (s50) obj;
                lhbVar.k = false;
                break;
        }
    }
}
