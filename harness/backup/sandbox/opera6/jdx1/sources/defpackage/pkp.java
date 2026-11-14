package defpackage;

import ads_mobile_sdk.fl0;
import ads_mobile_sdk.fm0;
import ads_mobile_sdk.vl3;
import ads_mobile_sdk.wl3;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes.dex */
public final /* synthetic */ class pkp implements dd2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wl3 b;

    public /* synthetic */ pkp(wl3 wl3Var, byte b) {
        this.a = b;
        this.b = wl3Var;
    }

    public final ListenableFuture apply(Object obj) {
        byte b = this.a;
        wl3 wl3Var = this.b;
        switch (b) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    return wl3Var.c(0);
                }
                wl3Var.d.b(fl0.EVENT_ID_PRIMARY_UPDATE_PROGRAM_NOOP_LOCAL_PROGRAM_STILL_VALID);
                return yr9.c(vl3.b);
            default:
                fm0 fm0Var = (fm0) obj;
                yjp yjpVar = wl3Var.c;
                if (fm0Var.q$1() == 2) {
                    return yjpVar.a(fm0Var.p(), fm0Var.o().c());
                }
                if (fm0Var.q$1() == 3) {
                    return yjpVar.a(fm0Var.p(), fm0Var.r().c(), fm0Var.o().c());
                }
                qp2.g("Unreachable");
                return null;
        }
    }
}
