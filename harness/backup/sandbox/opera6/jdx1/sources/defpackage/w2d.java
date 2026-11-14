package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class w2d extends ozb implements Function0 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ x2d j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w2d(x2d x2dVar, byte b) {
        super(0);
        this.i = b;
        this.j = x2dVar;
    }

    public final Object invoke() {
        byte b = this.i;
        x2d x2dVar = this.j;
        switch (b) {
            case 0:
                return Boolean.valueOf((((p2d) x2dVar.b.getValue()) == null && ((Throwable) x2dVar.c.getValue()) == null) ? false : true);
            case 1:
                return Boolean.valueOf(((Throwable) x2dVar.c.getValue()) != null);
            case 2:
                if (((p2d) x2dVar.b.getValue()) == null && ((Throwable) x2dVar.c.getValue()) == null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                return Boolean.valueOf(((p2d) x2dVar.b.getValue()) != null);
        }
    }
}
