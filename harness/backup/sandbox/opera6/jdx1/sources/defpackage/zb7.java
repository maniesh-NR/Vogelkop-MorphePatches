package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Settings;

/* loaded from: classes.dex */
public final /* synthetic */ class zb7 implements Function0 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zb7(afe afeVar, Function1 function1, boolean z) {
        this.c = afeVar;
        this.d = function1;
        this.b = z;
    }

    public /* synthetic */ zb7(Http2Connection.ReaderRunnable readerRunnable, boolean z, Settings settings) {
        this.c = readerRunnable;
        this.b = z;
        this.d = settings;
    }

    public /* synthetic */ zb7(boolean z, pki pkiVar, String str) {
        this.b = z;
        this.c = pkiVar;
        this.d = str;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                boolean z = this.b;
                pki pkiVar = (pki) this.c;
                String str = (String) this.d;
                if (z) {
                    ijd ijdVar = pkiVar.a;
                    synchronized (((ftj) ijdVar.f)) {
                    }
                }
                return Unit.a;
            case 1:
                afe afeVar = (afe) this.c;
                Function1 function1 = (Function1) this.d;
                boolean z2 = this.b;
                afeVar.setValue(new tj8());
                function1.invoke(Boolean.valueOf(!z2));
                return Unit.a;
            default:
                return Http2Connection.ReaderRunnable.d((Http2Connection.ReaderRunnable) this.c, this.b, (Settings) this.d);
        }
    }
}
