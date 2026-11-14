package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class uho extends ozb implements Function1 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uho(long j, byte b) {
        super(1);
        this.i = b;
        this.j = j;
    }

    public final Object invoke(Object obj) {
        byte b = this.i;
        long j = this.j;
        switch (b) {
            case 0:
                return Boolean.valueOf(((txo) obj).b <= j);
            default:
                return Boolean.valueOf(((zip) obj).c <= j);
        }
    }
}
