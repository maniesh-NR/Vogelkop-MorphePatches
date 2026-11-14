package defpackage;

import ads_mobile_sdk.gs3;
import ads_mobile_sdk.k43;

/* loaded from: classes.dex */
public final /* synthetic */ class x8p implements xq9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k43 b;

    public /* synthetic */ x8p(k43 k43Var, byte b) {
        this.a = b;
        this.b = k43Var;
    }

    @Override // defpackage.xq9
    public final Object apply(Object obj) {
        byte b = this.a;
        k43 k43Var = this.b;
        byte[] bArr = (byte[]) obj;
        switch (b) {
            case 0:
                k43Var.a(new gs3(), bArr, false);
                break;
            default:
                k43Var.a(new gs3(), bArr, true);
                break;
        }
        return null;
    }
}
