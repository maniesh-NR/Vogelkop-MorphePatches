package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class zqk implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mrk b;

    public /* synthetic */ zqk(mrk mrkVar, byte b) {
        this.a = b;
        this.b = mrkVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        mrk mrkVar = this.b;
        switch (b) {
            case 0:
                xf8.F0(mrkVar.x, mrkVar.e());
                break;
            case 1:
                if (mrkVar.h.b()) {
                    mrkVar.g();
                }
                break;
            case 2:
                String str = (String) obj;
                rv7 rv7Var = mrkVar.G;
                if (mrkVar.d()) {
                    mrkVar.c.a.k(str);
                    eri eriVar = (eri) mrkVar.h.f.g();
                    if (eriVar.getId() == 9223372036854775805L || eriVar.getId() == 9223372036854775804L) {
                        rv7Var.n.m(true);
                        rv7Var.a();
                        mrkVar.g();
                    } else {
                        mrkVar.n.a.K(str, 6, false, 1, false, eriVar);
                    }
                }
                break;
            case 3:
                mrkVar.B.G();
                break;
            case 4:
                xf8.F0(mrkVar.x, mrkVar.e());
                break;
            default:
                xf8.F0(mrkVar.x, mrkVar.e());
                break;
        }
        return Unit.a;
    }
}
