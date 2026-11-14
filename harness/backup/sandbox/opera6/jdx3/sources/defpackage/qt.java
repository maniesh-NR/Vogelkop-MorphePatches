package defpackage;

import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public final class qt extends o93 {
    public final /* synthetic */ byte c;
    public final Object d;

    public qt(ami amiVar) {
        this.c = (byte) 4;
        Objects.requireNonNull(amiVar);
        this.d = amiVar;
    }

    public /* synthetic */ qt(Object obj, byte b) {
        this.c = b;
        this.d = obj;
    }

    @Override // defpackage.o93
    public final gtj e(View view) {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                gtj gtjVarD = gtj.d(view, (rxh) obj, 2500, null);
                gtjVarD.a.a(new pt(this, (byte) 0));
                return gtjVarD;
            case 1:
                gtj gtjVarC = gtj.c(view, 2132017574, 5000);
                gtjVarC.f(2132021453, new gf((Object) this, (byte) 12));
                return gtjVarC;
            case 2:
                return gtj.d(view, (qxh) obj, 2500, null);
            case 3:
                gtj gtjVarC2 = gtj.c(view, 2132021044, 2500);
                gtjVarC2.f(2132022116, new h4i((Object) this, (byte) 6));
                return gtjVarC2;
            case 4:
                ami amiVar = (ami) obj;
                gtj gtjVarE = gtj.e(view, (String) amiVar.e, 5000);
                amiVar.c = gtjVarE;
                amiVar.A(gtjVarE);
                gtj gtjVar = (gtj) amiVar.c;
                gtjVar.a.a((pt) amiVar.h);
                return (gtj) amiVar.c;
            default:
                gtj gtjVarC3 = gtj.c(view, 2132022139, 2500);
                gtjVarC3.f(2132021453, (pkm) obj);
                return gtjVarC3;
        }
    }
}
