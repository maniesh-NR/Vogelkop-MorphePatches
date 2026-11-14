package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class mve extends r9i {
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mve(uqe uqeVar, fu8 fu8Var, ylg ylgVar, dmg dmgVar, byte b) {
        super(uqeVar, fu8Var, ylgVar, dmgVar, (byte) 22);
        this.h = b;
    }

    @Override // defpackage.r9i
    public final String F(oqe oqeVar, ga6 ga6Var) {
        switch (this.h) {
            case 0:
                return ((dre) oqeVar).D.e.b.b;
            default:
                return ((Uri) ((ure) oqeVar).D.get(0)).toString();
        }
    }

    @Override // defpackage.r9i
    public final String H(oqe oqeVar) {
        switch (this.h) {
            case 0:
                String str = ((dre) oqeVar).D.c.b;
                String[] strArr = aik.a;
                return str != null ? str : "";
            default:
                w9h w9hVar = ((ure) oqeVar).M;
                return w9hVar != null ? w9hVar.b : "";
        }
    }

    @Override // defpackage.r9i
    public final long I(oqe oqeVar) {
        switch (this.h) {
            case 0:
                return ((dre) oqeVar).D.f;
            default:
                return super.I(oqeVar);
        }
    }

    @Override // defpackage.r9i
    public final String J(oqe oqeVar) {
        switch (this.h) {
            case 0:
                return ((dre) oqeVar).D.d;
            default:
                return super.J(oqeVar);
        }
    }
}
