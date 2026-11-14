package ads_mobile_sdk;

import defpackage.byh;
import defpackage.l94;
import defpackage.nb3;
import defpackage.o94;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class s11 {
    public final ExecutorService a;
    public final String b;
    public final long c;

    public s11(ExecutorService executorService, String str, long j) {
        this.a = executorService;
        this.b = str;
        this.c = j;
    }

    public static byte[] a(HttpURLConnection httpURLConnection, int i) throws IOException {
        InputStream inputStream = i < 400 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                if (inputStream == null) {
                    byte[] bArr = new byte[0];
                    byteArrayOutputStream.close();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return bArr;
                }
                byte[] bArr2 = new byte[4096];
                while (true) {
                    int i2 = inputStream.read(bArr2);
                    if (i2 == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        inputStream.close();
                        return byteArray;
                    }
                    byteArrayOutputStream.write(bArr2, 0, i2);
                }
            } finally {
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final o94 a(String str, boolean z, byte[] bArr, String str2) {
        l94 l94Var = new l94();
        l94Var.c = new byh();
        o94 o94Var = new o94(l94Var);
        l94Var.b = o94Var;
        l94Var.a = vep.class;
        try {
            this.a.execute(new nb3(this, str, l94Var, z, str2, bArr));
            l94Var.a = "";
            return o94Var;
        } catch (Exception e) {
            o94Var.a(e);
            return o94Var;
        }
    }
}
