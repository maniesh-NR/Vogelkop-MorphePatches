package defpackage;

import ads_mobile_sdk.ab3;
import ads_mobile_sdk.fl0;
import ads_mobile_sdk.jl2;
import ads_mobile_sdk.xk2;
import ads_mobile_sdk.yk2;
import java.io.File;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class oko implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ab3 b;

    public /* synthetic */ oko(ab3 ab3Var, byte b) {
        this.a = b;
        this.b = ab3Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        byte b = this.a;
        ab3 ab3Var = this.b;
        switch (b) {
            case 0:
                yk2 yk2Var = ab3Var.a;
                jl2 jl2VarA = yk2Var.a(1);
                if (jl2VarA == null) {
                    yk2Var.e.b(fl0.EVENT_ID_DG_STORAGE_PROGRAM_CACHE_GET_PROGRAM_BYTECODE_NOT_FOUND);
                    return null;
                }
                String strR = jl2VarA.r().r();
                File fileC = ddh.c(yk2Var.a(), strR, "pcam.jar");
                fileC.getClass();
                if (!fileC.exists()) {
                    fileC = ddh.c(yk2Var.a(), strR, "pcam");
                    fileC.getClass();
                }
                File fileC2 = ddh.c(yk2Var.a(), strR, "pcopt");
                fileC2.getClass();
                File fileC3 = ddh.c(yk2Var.a(), strR, "pcbc");
                fileC3.getClass();
                return new xk2(jl2VarA.r(), fileC, fileC3, fileC2);
            default:
                jl2 jl2VarA2 = ab3Var.a.a(1);
                return jl2VarA2 == null ? jl2.q() : jl2VarA2;
        }
    }
}
