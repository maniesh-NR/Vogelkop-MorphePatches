package defpackage;

import J.N;
import android.net.Uri;

/* loaded from: classes.dex */
public final /* synthetic */ class kqh implements mo7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e3j b;

    public /* synthetic */ kqh(e3j e3jVar, byte b) {
        this.a = b;
        this.b = e3jVar;
    }

    public final void o(boolean z) {
        byte b = this.a;
        e3j e3jVar = this.b;
        switch (b) {
            case 0:
                c3j c3jVarC = ((d3j) e3jVar.i()).c(6);
                String string = c3jVarC == null ? "https://redirect.opera.com/r" : ((Uri) c3jVarC.d).toString();
                dyg.a = string;
                N.MuFUde_q(string);
                break;
            default:
                qsh qshVarB = ((d3j) e3jVar.i()).b(2);
                N.MMzuJL8o(qshVarB != null ? (String) qshVarB.b : null);
                break;
        }
    }
}
