package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class yfd extends ozb implements Function1 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ Context j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yfd(Context context, byte b) {
        super(1);
        this.i = b;
        this.j = context;
    }

    public final Object invoke(Object obj) {
        switch (this.i) {
            case 0:
                return new zfd(this.j, (byte) 0);
            case 1:
                return new bwl(this.j, (byte) 0);
            default:
                return new bwl(this.j, (byte) 1);
        }
    }
}
