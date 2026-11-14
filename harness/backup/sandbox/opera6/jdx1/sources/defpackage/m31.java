package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class m31 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ m31(byte b, int i) {
        this.a = b;
        this.b = i;
    }

    public final Object invoke(Object obj) {
        boolean zA1;
        byte b = this.a;
        byte b2 = this.b;
        vg9 vg9Var = (vg9) obj;
        switch (b) {
            case 0:
                zA1 = vg9Var.a1(b2);
                break;
            case 1:
                zA1 = vg9Var.a1(b2);
                break;
            case 2:
                zA1 = vg9Var.a1(b2);
                break;
            default:
                zA1 = vg9Var.a1(b2);
                break;
        }
        return Boolean.valueOf(zA1);
    }
}
