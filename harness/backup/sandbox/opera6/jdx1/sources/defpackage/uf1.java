package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class uf1 implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ uf1(int i, k5c k5cVar, Object obj) {
        this.a = (byte) 6;
        this.c = k5cVar;
        this.b = i;
        this.d = obj;
    }

    public /* synthetic */ uf1(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    public /* synthetic */ uf1(k5c k5cVar, int i, Object obj, int i2, byte b) {
        this.a = b;
        this.c = k5cVar;
        this.b = i;
        this.d = obj;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                vf1.a((sf1) obj4, (List) obj3, (ih5) obj, aoh.m(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                z5i.d((fx4) obj4, (c8e) obj3, (ih5) obj, aoh.m(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((ue5) obj4).b(obj3, (ih5) obj, aoh.m(i) | 1);
                break;
            case 3:
                ((Integer) obj2).getClass();
                kfo.d((k7h[]) obj4, (Function2) obj3, (ih5) obj, aoh.m(i | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                kfo.c((k7h) obj4, (Function2) obj3, (ih5) obj, aoh.m(i | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                lk8.a((kk8) obj4, (ue5) obj3, (ih5) obj, aoh.m(i | 1));
                break;
            case 6:
                k5c k5cVar = (k5c) obj4;
                ih5 ih5Var = (ih5) obj;
                int iIntValue = ((Integer) obj2).intValue();
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    k5cVar.a(i, obj3, vt9Var, 0);
                } else {
                    vt9Var.Q();
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((i6c) obj4).a(i, obj3, (ih5) obj, aoh.m(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                sfe.j((Function0) obj4, (c8e) obj3, (ih5) obj, aoh.m(i | 1));
                break;
            case 9:
                break;
            case 10:
                ((Integer) obj2).getClass();
                ((hxf) obj4).a(i, obj3, (ih5) obj, aoh.m(1));
                break;
            default:
                ((Integer) obj2).intValue();
                ((b3m) obj4).a(obj3, (ih5) obj, aoh.m(i | 1));
                break;
        }
        return Unit.a;
    }
}
