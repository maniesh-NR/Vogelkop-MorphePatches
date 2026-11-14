package defpackage;

import android.net.http.SslCertificate;
import java.security.cert.X509Certificate;

/* loaded from: classes.dex */
public final class kq4 {
    public final X509Certificate a;
    public final SslCertificate b;
    public final byte[] c;
    public final byte[] d;

    public kq4(X509Certificate x509Certificate, byte[] bArr, byte[] bArr2) {
        this.a = x509Certificate;
        this.b = new SslCertificate(x509Certificate);
        this.c = bArr;
        this.d = bArr2;
    }
}
