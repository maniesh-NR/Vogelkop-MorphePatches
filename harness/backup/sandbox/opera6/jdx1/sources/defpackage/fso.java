package defpackage;

import ads_mobile_sdk.cb3;
import ads_mobile_sdk.fl0;
import ads_mobile_sdk.h7;
import ads_mobile_sdk.jl2;
import ads_mobile_sdk.th3;
import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes.dex */
public final /* synthetic */ class fso implements dd2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fso(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final ListenableFuture apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                cb3 cb3Var = (cb3) obj3;
                th3 th3Var = cb3Var.d;
                fl0 fl0Var = fl0.EVENT_ID_ORCAS_STORAGE_UPDATE_METADATA;
                m7m m7mVarA = cb3Var.a.a((jl2) obj2);
                th3Var.a(fl0Var, (ef9) m7mVarA);
                return m7mVarA;
            case 1:
                cb3 cb3Var2 = (cb3) obj3;
                th3 th3Var2 = cb3Var2.d;
                fl0 fl0Var2 = fl0.EVENT_ID_ORCAS_STORAGE_UPDATE_METADATA;
                m7m m7mVarA2 = cb3Var2.a.a((jl2) obj2);
                th3Var2.a(fl0Var2, (ef9) m7mVarA2);
                return m7mVarA2;
            default:
                return ((edp) ((h7) obj3).b.f.get()).a((Context) obj2);
        }
    }
}
