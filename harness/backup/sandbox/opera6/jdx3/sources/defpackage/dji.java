package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class dji extends y0j {
    public final /* synthetic */ byte c;
    public final /* synthetic */ iji d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dji(iji ijiVar, byte b) {
        super(0);
        this.c = b;
        this.d = ijiVar;
    }

    @Override // defpackage.y0j
    public final void a(View view) {
        byte b = this.c;
        byte b2 = 1;
        iji ijiVar = this.d;
        switch (b) {
            case 0:
                ijiVar.l(true);
                break;
            case 1:
                ijiVar.y();
                break;
            case 2:
                ijiVar.H();
                break;
            case 3:
                ijiVar.z();
                ijiVar.b();
                break;
            case 4:
                ijiVar.I();
                break;
            case 5:
                ijiVar.D();
                ijiVar.b();
                ijiVar.w(ijiVar.b.getContext(), new wii(ijiVar, b2));
                break;
            default:
                ijiVar.C();
                lcp.G(ijiVar.c, ijiVar.p, false, new vii(ijiVar, (byte) 0));
                break;
        }
    }
}
