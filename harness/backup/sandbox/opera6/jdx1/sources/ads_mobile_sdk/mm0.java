package ads_mobile_sdk;

import defpackage.xq9;
import java.io.File;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class mm0 {
    public final File a;
    public final ExecutorService b;
    public final lap c;
    public final xq9 d;

    public mm0(File file, ExecutorService executorService, lap lapVar, xq9 xq9Var) {
        this.a = file;
        this.b = executorService;
        this.c = lapVar;
        this.d = xq9Var;
    }

    public final m7m a(Object obj) {
        return yr9.e(new defpackage.d9(this, obj, (byte) 10), this.b);
    }
}
