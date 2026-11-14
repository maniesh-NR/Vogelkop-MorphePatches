package ads_mobile_sdk;

import defpackage.eno;
import defpackage.qso;
import defpackage.udj;
import defpackage.v7p;
import defpackage.yxo;
import defpackage.zep;

/* loaded from: classes.dex */
public final class a10 implements qso {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte b;

    public /* synthetic */ a10(Object obj, byte b) {
        this.b = b;
        this.a = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.v7p r9, nt5 r10) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.a10.a(v7p, nt5):java.lang.Object");
    }

    @Override // defpackage.qso
    public final Object a(zep zepVar, rk1 rk1Var) {
        byte b = this.b;
        mt5 mt5Var = null;
        Object obj = this.a;
        switch (b) {
            case 1:
                Object objB = ((v7p) zepVar).b(new eno((byte) 6, mt5Var, obj), rk1Var);
                if (objB != px5.a) {
                    break;
                }
                break;
            case 2:
                ((yxo) obj).getClass();
                break;
            case 4:
                Object objB2 = ((v7p) zepVar).b(new udj((byte) 17, mt5Var, obj), rk1Var);
                if (objB2 != px5.a) {
                    break;
                }
                break;
        }
        return a((v7p) zepVar, (nt5) rk1Var);
    }
}
