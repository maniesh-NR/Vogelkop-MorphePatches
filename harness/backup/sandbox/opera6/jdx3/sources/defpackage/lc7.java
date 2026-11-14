package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class lc7 implements Function2 {
    public final /* synthetic */ c8e a;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ byte e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ lc7(c8e c8eVar, float f, long j, int i, int i2) {
        this.a = c8eVar;
        this.b = f;
        this.c = j;
        this.d = i;
        this.e = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        scd.d(this.a, this.b, this.c, (ih5) obj, aoh.m(this.d | 1), this.e);
        return Unit.a;
    }
}
