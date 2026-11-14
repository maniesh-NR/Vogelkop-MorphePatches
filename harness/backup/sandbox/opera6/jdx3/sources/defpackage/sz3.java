package defpackage;

import J.N;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class sz3 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sz3(byte b, Object obj, boolean z) {
        this.a = b;
        this.b = z;
        this.c = obj;
    }

    public /* synthetic */ sz3(tz3 tz3Var, boolean z) {
        this.a = (byte) 0;
        this.c = tz3Var;
        this.b = z;
    }

    public final Object invoke() {
        jdj jdjVarI;
        byte b = this.a;
        Object obj = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                ((tz3) obj).b(z);
                return Unit.a;
            case 1:
                t71 t71Var = (t71) obj;
                if (z && (jdjVarI = t71Var.i()) != null) {
                    jdjVarI.i(Unit.a);
                }
                return Unit.a;
            case 2:
                kg9 kg9Var = (kg9) obj;
                if (z) {
                    kg9.a(kg9Var);
                }
                return Unit.a;
            default:
                return Boolean.valueOf(z && N.MFRS03S8((String) obj));
        }
    }
}
