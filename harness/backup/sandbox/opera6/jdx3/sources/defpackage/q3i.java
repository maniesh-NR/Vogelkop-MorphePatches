package defpackage;

import J.N;

/* loaded from: classes.dex */
public final class q3i {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lim b;

    public /* synthetic */ q3i(lim limVar, byte b) {
        this.a = b;
        this.b = limVar;
    }

    public final void a(String str) {
        byte b = this.a;
        lim limVar = this.b;
        switch (b) {
            case 0:
                if (str != null) {
                    ((y3i) ((j4c) ((vl6) limVar).d).get()).e(str);
                    break;
                }
                break;
            default:
                dxk dxkVar = (dxk) limVar;
                dxkVar.l = str;
                if (str == null) {
                    str = "";
                }
                N.Mfa5Y2xC(str);
                x5f x5fVar = dxkVar.g;
                boolean z = dxkVar.l == null;
                if (x5fVar.h) {
                    zpa zpaVar = x5fVar.d;
                    x56 x56VarF = zpa.F();
                    x56VarF.z(zpaVar).r(7, 1, z);
                    x5fVar.U0(x56VarF);
                    break;
                }
                break;
        }
    }
}
