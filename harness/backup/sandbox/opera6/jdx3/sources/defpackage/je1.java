package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class je1 extends ozb implements Function2 {
    public static final je1 j;
    public static final je1 k;
    public final /* synthetic */ byte i;

    static {
        int i = 2;
        j = new je1((byte) 0, i);
        k = new je1((byte) 1, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ je1(byte b, int i) {
        super(i);
        this.i = b;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                e48 e48Var = (e48) obj2;
                return Boolean.valueOf(((e48) obj) == e48Var && e48Var == e48.c);
            default:
                ((Number) obj).intValue();
                ((Number) obj2).intValue();
                return Unit.a;
        }
    }
}
