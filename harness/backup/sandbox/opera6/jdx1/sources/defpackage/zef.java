package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class zef implements Function2 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ c8e b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ zef(c8e c8eVar, Function2 function2, int i, int i2) {
        this.b = c8eVar;
        this.e = function2;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ zef(yg3 yg3Var, boolean z, c8e c8eVar, int i) {
        this.e = yg3Var;
        this.d = z;
        this.b = c8eVar;
        this.c = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        boolean z = this.d;
        int i = this.c;
        Object obj3 = this.e;
        c8e c8eVar = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                phj.n((yg3) obj3, z, c8eVar, (ih5) obj, aoh.m(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                dkk.a(c8eVar, (Function2) obj3, (ih5) obj, aoh.m(i | 1), z ? 1 : 0);
                break;
        }
        return Unit.a;
    }
}
