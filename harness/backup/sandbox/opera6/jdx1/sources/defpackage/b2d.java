package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class b2d extends ozb implements Function1 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ e2d j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b2d(e2d e2dVar, int i, byte b) {
        super(1);
        this.i = b;
        this.j = e2dVar;
        this.k = i;
    }

    public final Object invoke(Object obj) {
        byte b = this.i;
        int i = this.k;
        e2d e2dVar = this.j;
        switch (b) {
        }
        return Boolean.valueOf(e2dVar.c(i, ((Number) obj).longValue()));
    }
}
