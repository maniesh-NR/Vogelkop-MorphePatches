package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class kz9 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ kz9(Function1 function1, byte b) {
        this.a = b;
        this.b = function1;
    }

    public final Object invoke(Object obj) {
        long j;
        switch (this.a) {
            case 0:
                xtj xtjVar = (xtj) obj;
                synchronized (ytj.c) {
                    j = ytj.e;
                    ytj.e = 1 + j;
                }
                return new qlh(j, xtjVar, this.b);
            default:
                return this.b.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
        }
    }
}
