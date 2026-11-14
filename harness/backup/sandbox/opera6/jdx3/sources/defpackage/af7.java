package defpackage;

import android.net.Uri;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class af7 implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ igi b;

    public /* synthetic */ af7(igi igiVar, byte b) {
        this.a = b;
        this.b = igiVar;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        igi igiVar = this.b;
        switch (b) {
            case 0:
                if (!((Boolean) obj).booleanValue()) {
                    ((sf7) igiVar.d).a.s((re7) igiVar.f);
                    break;
                } else {
                    cqp.n0((dx3) igiVar.b, (x5f) igiVar.e, new af7(igiVar, (byte) 1));
                    break;
                }
            default:
                sf7 sf7Var = (sf7) igiVar.d;
                vwh vwhVar = (vwh) igiVar.g;
                re7 re7Var = (re7) igiVar.f;
                Uri uri = re7Var.d;
                if (lg7.e((dx3) igiVar.b, uri)) {
                    if (!"content".equals(uri.getScheme())) {
                        long j = re7Var.i() ? re7Var.j : 0L;
                        long jF = sf7Var.a.f(re7Var, uri.getPath());
                        if (jF < 0) {
                            vwhVar.f(new glj(2132018595, 5000));
                        } else if (j > jF) {
                            vwhVar.f(new glj(2132020041, 5000));
                        }
                    }
                    ((x5f) igiVar.e).N(kc0.e, null, false, false, false, false, re7Var.c());
                    re7Var.b();
                    umi umiVar = (umi) igiVar.c;
                    on7 on7Var = pn7.b;
                    fac.B(umiVar, cs5.x0(200, un7.d), new r94(igiVar, (byte) 29));
                    break;
                } else {
                    vwhVar.f(new glj(2132019126, 5000));
                }
                sf7Var.a.s(re7Var);
                break;
        }
    }
}
