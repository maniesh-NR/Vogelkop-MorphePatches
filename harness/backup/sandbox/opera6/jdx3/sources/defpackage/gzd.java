package defpackage;

import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public final class gzd extends ByteArrayInputStream {
    public final String h() {
        Charset charset = StandardCharsets.UTF_8;
        byte[] bArr = ((ByteArrayInputStream) this).buf;
        int i = ((ByteArrayInputStream) this).pos;
        return new String(bArr, i, ((ByteArrayInputStream) this).count - i, charset);
    }
}
