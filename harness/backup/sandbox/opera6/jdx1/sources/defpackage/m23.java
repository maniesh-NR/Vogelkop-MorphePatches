package defpackage;

import android.content.res.Resources;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class m23 implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m23(int i, gu6 gu6Var, int i2) {
        this.a = (byte) 0;
        this.b = i;
        this.c = gu6Var;
    }

    public /* synthetic */ m23(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    public final Object invoke(Object obj, Object obj2) throws Resources.NotFoundException {
        byte b = this.a;
        int i = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                o0g.f(i, (gu6) obj3, (ih5) obj, aoh.m(1));
                break;
            case 1:
                i6c i6cVar = (i6c) obj3;
                ih5 ih5Var = (ih5) obj;
                int iIntValue = ((Integer) obj2).intValue();
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    phb phbVarO = i6cVar.b.k.o(i);
                    ((g6c) phbVarO.c).c.j(i6cVar.c, Integer.valueOf(i - phbVarO.a), vt9Var, 0);
                } else {
                    vt9Var.Q();
                }
                break;
            case 2:
                ((Integer) obj2).intValue();
                sfe.o((Integer) obj3, (ih5) obj, aoh.m(i | 1));
                break;
            default:
                hxf hxfVar = (hxf) obj3;
                ih5 ih5Var2 = (ih5) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                vt9 vt9Var2 = (vt9) ih5Var2;
                if (vt9Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    phb phbVarO2 = hxfVar.b.l.o(i);
                    ((cxf) phbVarO2.c).b.j(kxf.a, Integer.valueOf(i - phbVarO2.a), vt9Var2, 0);
                } else {
                    vt9Var2.Q();
                }
                break;
        }
        return Unit.a;
    }
}
