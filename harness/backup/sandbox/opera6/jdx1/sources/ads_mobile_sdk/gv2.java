package ads_mobile_sdk;

import java.io.Closeable;
import java.nio.charset.Charset;
import kotlin.text.Charsets;

/* loaded from: classes.dex */
public final class gv2 implements Closeable {
    public final byte[] a;

    public gv2(byte[] bArr) {
        this.a = bArr;
    }

    public static String a(gv2 gv2Var) {
        Charset charset = Charsets.UTF_8;
        gv2Var.getClass();
        return new String(gv2Var.a, charset);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
