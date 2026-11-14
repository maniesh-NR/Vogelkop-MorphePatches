package defpackage;

import android.print.PageRange;

/* loaded from: classes.dex */
public final /* synthetic */ class bii implements tj9, n5o {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pii b;

    public /* synthetic */ bii(pii piiVar, byte b) {
        this.a = b;
        this.b = piiVar;
    }

    @Override // defpackage.tj9
    public final void d(int i) {
        byte b = this.a;
        pii piiVar = this.b;
        switch (b) {
            case 0:
                piiVar.N0();
                break;
            case 1:
                piiVar.N0();
                break;
            default:
                piiVar.D.setVisibility(i == 0 ? 8 : 0);
                break;
        }
    }

    public final Object g(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        pii piiVar = this.b;
        if (zBooleanValue) {
            piiVar.u.h(piiVar.I, new PageRange[]{new PageRange(0, 100)}, new lld((Object) piiVar, (byte) 22));
            return null;
        }
        if (!piiVar.G.a()) {
            return null;
        }
        piiVar.L0();
        return null;
    }
}
