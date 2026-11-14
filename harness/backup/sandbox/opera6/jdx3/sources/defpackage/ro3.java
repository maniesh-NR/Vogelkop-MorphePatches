package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class ro3 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wo3 b;

    public /* synthetic */ ro3(wo3 wo3Var, byte b) {
        this.a = b;
        this.b = wo3Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        wo3 wo3Var = this.b;
        int iIntValue = ((Integer) obj).intValue();
        switch (b) {
            case 0:
                vf vfVar = (vf) wo3Var.F.H(iIntValue);
                if (vfVar != null) {
                    return vfVar.a;
                }
                return null;
            default:
                kv2 kv2Var = (kv2) wo3Var.G.H(iIntValue);
                if (kv2Var != null) {
                    return kv2Var.a;
                }
                return null;
        }
    }
}
