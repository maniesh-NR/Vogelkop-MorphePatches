package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class na1 implements Function2 {
    public final /* synthetic */ c8e a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ byte d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ na1(c8e c8eVar, Function0 function0, boolean z, int i) {
        this.a = c8eVar;
        this.b = function0;
        this.c = z;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        scd.i(aoh.m(this.d | 1), (ih5) obj, this.a, this.b, this.c);
        return Unit.a;
    }
}
