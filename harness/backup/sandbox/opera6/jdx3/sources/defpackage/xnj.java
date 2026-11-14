package defpackage;

import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class xnj implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ynj b;

    public /* synthetic */ xnj(ynj ynjVar, byte b) {
        this.a = b;
        this.b = ynjVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        znj znjVar = znj.a;
        ynj ynjVar = this.b;
        switch (b) {
            case 0:
                ynjVar.g = null;
                Uri uriA = ((x4l) obj).a();
                if (uriA != null) {
                    String strA = f8a.e.a(uriA.toString());
                    ynjVar.e.f(strA, new tmi(ynjVar, uriA, strA, (byte) 6));
                } else {
                    ynjVar.a(znjVar);
                }
                break;
            default:
                Uri uri = (Uri) obj;
                if (uri != null) {
                    nwa nwaVar = new nwa(ynjVar, (byte) 2);
                    dwh dwhVarG = ynjVar.b.g(uri);
                    ynjVar.c.invoke(dwhVarG);
                    dwhVarG.f(nwaVar);
                    ynjVar.i = nwaVar;
                } else {
                    ynjVar.a(znjVar);
                }
                break;
        }
        return Unit.a;
    }
}
