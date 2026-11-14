package defpackage;

import ads_mobile_sdk.ab3;
import ads_mobile_sdk.cl2;
import ads_mobile_sdk.fl0;
import ads_mobile_sdk.g43;
import ads_mobile_sdk.th3;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes.dex */
public final /* synthetic */ class sso implements dd2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sso(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final ListenableFuture apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return ((cl2) obj2).c.a();
            default:
                ab3 ab3Var = ((g43) obj2).b;
                th3 th3Var = ab3Var.c;
                fl0 fl0Var = fl0.EVENT_ID_DG_STORAGE_GET_PROGRAM;
                m7m m7mVarE = yr9.e(new oko(ab3Var, (byte) 0), ab3Var.b);
                th3Var.a(fl0Var, (ef9) m7mVarE);
                return m7mVarE;
        }
    }
}
