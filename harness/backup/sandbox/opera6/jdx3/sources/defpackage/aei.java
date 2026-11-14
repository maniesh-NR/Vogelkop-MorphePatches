package defpackage;

import J.N;
import android.content.Context;
import android.os.AsyncTask;
import android.security.KeyChain;
import android.security.KeyChainException;
import java.security.PrivateKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

/* loaded from: classes.dex */
public final class aei extends AsyncTask {
    public byte[][] a;
    public PrivateKey b;
    public final long c;
    public final Context d;
    public final String e;

    public aei(Context context, String str, long j) {
        this.c = j;
        this.d = context;
        this.e = str;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) throws InterruptedException, KeyChainException {
        PrivateKey privateKey;
        X509Certificate[] certificateChain;
        Context context = this.d;
        String str = this.e;
        if (str != null) {
            try {
                privateKey = KeyChain.getPrivateKey(context, str);
            } catch (KeyChainException | InterruptedException unused) {
                privateKey = null;
            }
            try {
                certificateChain = KeyChain.getCertificateChain(context, str);
            } catch (KeyChainException | InterruptedException unused2) {
                certificateChain = null;
            }
            if (privateKey != null && certificateChain != null && certificateChain.length != 0) {
                byte[][] bArr = new byte[certificateChain.length][];
                for (int i = 0; i < certificateChain.length; i++) {
                    try {
                        bArr[i] = certificateChain[i].getEncoded();
                    } catch (CertificateEncodingException unused3) {
                    }
                }
                this.a = bArr;
                this.b = privateKey;
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        N.MtT_tevO(this.c, this.a, this.b);
    }
}
