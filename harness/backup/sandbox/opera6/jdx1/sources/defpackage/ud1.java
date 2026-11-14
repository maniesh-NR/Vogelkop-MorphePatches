package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ud1 extends ozb implements Function1 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ vd1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ud1(vd1 vd1Var, byte b) {
        super(1);
        this.i = b;
        this.j = vd1Var;
    }

    public final Object invoke(Object obj) {
        int i;
        char c;
        byte b = this.i;
        int i2 = 0;
        vd1 vd1Var = this.j;
        char c2 = ' ';
        switch (b) {
            case 0:
                p1d p1dVar = (p1d) obj;
                ifg[] ifgVarArr = vd1Var.c;
                int i3 = vd1Var.e;
                int i4 = vd1Var.g;
                int length = ifgVarArr.length;
                while (i2 < length) {
                    ifg ifgVar = ifgVarArr[i2];
                    if (ifgVar != null) {
                        long jA = vd1Var.a.b.a((ifgVar.a << 32) | (ifgVar.b & 4294967295L), (i3 << 32) | (i4 & 4294967295L), d2c.a);
                        p1d.f(p1dVar, ifgVar, (int) (jA >> 32), (int) (jA & 4294967295L));
                    }
                    i2++;
                }
                break;
            default:
                p1d p1dVar2 = (p1d) obj;
                ifg[] ifgVarArr2 = vd1Var.b;
                int i5 = vd1Var.d;
                int i6 = vd1Var.f;
                int length2 = ifgVarArr2.length;
                while (i2 < length2) {
                    ifg ifgVar2 = ifgVarArr2[i2];
                    if (ifgVar2 != null) {
                        c = c2;
                        i = i2;
                        long jA2 = vd1Var.a.b.a((ifgVar2.a << c2) | (ifgVar2.b & 4294967295L), (i5 << c) | (i6 & 4294967295L), d2c.a);
                        p1d.f(p1dVar2, ifgVar2, (int) (jA2 >> c), (int) (jA2 & 4294967295L));
                    } else {
                        i = i2;
                        c = c2;
                    }
                    i2 = i + 1;
                    c2 = c;
                }
                break;
        }
        return Unit.a;
    }
}
