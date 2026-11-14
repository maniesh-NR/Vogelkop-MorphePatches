package defpackage;

import kotlin.jvm.functions.Function0;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes.dex */
public final /* synthetic */ class fk6 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fk6(Object obj, int i, int i2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.c = i2;
    }

    public final Object invoke() {
        byte b = this.a;
        int i = this.c;
        int i2 = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                return ((gjf) obj).b(i2, i);
            default:
                return Http2Connection.ReaderRunnable.b((Http2Connection) obj, i2, i);
        }
    }
}
