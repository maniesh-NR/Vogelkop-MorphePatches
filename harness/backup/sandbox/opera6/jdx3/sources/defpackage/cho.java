package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class cho extends ozb implements Function1 {
    public final /* synthetic */ long i;
    public final /* synthetic */ long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cho(long j, long j2) {
        super(1);
        this.i = j;
        this.j = j2;
    }

    public final Object invoke(Object obj) {
        long j = ((txo) obj).b;
        return Boolean.valueOf(j <= this.i || j > this.j);
    }
}
