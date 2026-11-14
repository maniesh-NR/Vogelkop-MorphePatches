package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class wl4 implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ c8e e;
    public final /* synthetic */ int f;

    public /* synthetic */ wl4(Function0 function0, Function0 function02, String str, c8e c8eVar, int i, byte b) {
        this.a = b;
        this.b = function0;
        this.c = function02;
        this.d = str;
        this.e = c8eVar;
        this.f = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.f;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = aoh.m(i | 1);
                z4o.g(this.b, this.c, this.d, this.e, (ih5) obj, iM);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM2 = aoh.m(i | 1);
                gyg.h(this.b, this.c, this.d, this.e, (ih5) obj, iM2);
                break;
        }
        return Unit.a;
    }
}
