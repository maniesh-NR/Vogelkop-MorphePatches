package defpackage;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ob6 implements lkf, mkf {
    public final /* synthetic */ byte a = 1;
    public final gjm b;
    public final Object c;
    public final Object d;

    public ob6(gjm gjmVar, gw3 gw3Var, ojn ojnVar) {
        this.b = gjmVar;
        this.c = gw3Var;
        this.d = ojnVar;
    }

    public ob6(umi umiVar, dw3 dw3Var, gjm gjmVar) {
        this.c = umiVar;
        this.d = dw3Var;
        this.b = gjmVar;
    }

    @Override // defpackage.mkf
    public final l7n a(Class cls) {
        switch (this.a) {
            case 0:
                return null;
            default:
                ojn ojnVar = (ojn) this.d;
                boolean zA = Intrinsics.a(cls, yrk.class);
                gjm gjmVar = this.b;
                if (zA) {
                    return new yrk(gjmVar, ojnVar);
                }
                if (Intrinsics.a(cls, rrk.class)) {
                    return new rrk(gjmVar, ojnVar);
                }
                return null;
        }
    }

    public final Fragment b(Class cls) {
        byte b = this.a;
        Object obj = this.c;
        gjm gjmVar = this.b;
        switch (b) {
            case 0:
                if (Intrinsics.a(cls, sb6.class)) {
                    return new sb6((umi) obj, ((dw3) this.d).b.h(), gjmVar);
                }
                return null;
            default:
                if (Intrinsics.a(cls, xrk.class)) {
                    return new xrk();
                }
                if (Intrinsics.a(cls, qrk.class)) {
                    return new qrk(gjmVar);
                }
                if (Intrinsics.a(cls, vrk.class)) {
                    return new vrk(gjmVar, (gw3) obj);
                }
                return null;
        }
    }
}
