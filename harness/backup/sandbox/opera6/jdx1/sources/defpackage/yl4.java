package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class yl4 implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ c8e d;

    public /* synthetic */ yl4(String str, String str2, c8e c8eVar, int i, byte b) {
        this.a = b;
        this.b = str;
        this.c = str2;
        this.d = c8eVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        c8e c8eVar = this.d;
        String str = this.c;
        String str2 = this.b;
        ih5 ih5Var = (ih5) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                z4o.j(str2, str, c8eVar, ih5Var, aoh.m(1));
                break;
            default:
                aib.h(str2, str, c8eVar, ih5Var, aoh.m(49));
                break;
        }
        return Unit.a;
    }
}
