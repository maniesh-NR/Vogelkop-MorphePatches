package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class jff implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vg9 b;
    public final /* synthetic */ vg9 c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ yo7 e;
    public final /* synthetic */ Object f;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ jff(vg9 vg9Var, vg9 vg9Var2, Object obj, int i, yo7 yo7Var, byte b) {
        this.a = b;
        this.b = vg9Var;
        this.c = vg9Var2;
        this.f = obj;
        this.d = i;
        this.e = yo7Var;
    }

    public final Object invoke(Object obj) throws pxb {
        byte b = this.a;
        yo7 yo7Var = this.e;
        byte b2 = this.d;
        Object obj2 = this.f;
        vg9 vg9Var = this.c;
        vg9 vg9Var2 = this.b;
        switch (b) {
            case 0:
                vg9 vg9Var3 = (vg9) obj2;
                md3 md3Var = (md3) obj;
                if (vg9Var2 != ui6.f0(vg9Var).l.f()) {
                    return Boolean.TRUE;
                }
                boolean zG0 = y9m.g0(vg9Var, vg9Var3, b2, yo7Var);
                Boolean boolValueOf = Boolean.valueOf(zG0);
                if (zG0 || !md3Var.a()) {
                    return boolValueOf;
                }
                return null;
            default:
                voh vohVar = (voh) obj2;
                md3 md3Var2 = (md3) obj;
                if (vg9Var2 != ui6.f0(vg9Var).l.f()) {
                    return Boolean.TRUE;
                }
                boolean zX = xgh.x(b2, yo7Var, vg9Var, vohVar);
                Boolean boolValueOf2 = Boolean.valueOf(zX);
                if (zX || !md3Var2.a()) {
                    return boolValueOf2;
                }
                return null;
        }
    }
}
