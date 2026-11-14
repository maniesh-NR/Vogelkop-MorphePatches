package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class dr6 extends a63 {
    public final String e;
    public final c37 f;
    public final c37 g;
    public nd6 h;
    public HttpURLConnection i;
    public InputStream j;
    public boolean k;
    public int l;
    public long m;
    public long n;

    public dr6(String str, c37 c37Var) {
        super(true);
        this.e = str;
        this.f = c37Var;
        this.g = new c37((byte) 20);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0194  */
    @Override // defpackage.ed6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(defpackage.nd6 r25) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dr6.b(nd6):long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ed6
    public final void close() {
        try {
            InputStream inputStream = this.j;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    String str = tym.a;
                    throw new joa(2000, 3, e);
                }
            }
        } finally {
            this.j = null;
            g();
            if (this.k) {
                this.k = false;
                d();
            }
            this.i = null;
            this.h = null;
        }
    }

    public final void g() {
        HttpURLConnection httpURLConnection = this.i;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                w7d.r("Unexpected error while disconnecting", e);
            }
        }
    }

    @Override // defpackage.ed6
    public final Map getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.i;
        return httpURLConnection == null ? hsh.d : new cr6(httpURLConnection.getHeaderFields());
    }

    @Override // defpackage.ed6
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.i;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        nd6 nd6Var = this.h;
        if (nd6Var != null) {
            return nd6Var.a;
        }
        return null;
    }

    public final HttpURLConnection h(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) throws IOException {
        String string;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(8000);
        httpURLConnection.setReadTimeout(8000);
        HashMap map2 = new HashMap();
        map2.putAll(this.f.w());
        map2.putAll(this.g.w());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = jra.a;
        if (j == 0 && j2 == -1) {
            string = null;
        } else {
            StringBuilder sbQ = p3p.q(j, "bytes=", "-");
            if (j2 != -1) {
                sbQ.append((j + j2) - 1);
            }
            string = sbQ.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty("Range", string);
        }
        String str2 = this.e;
        if (str2 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str2);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        int i2 = nd6.i;
        if (i == 1) {
            str = "GET";
        } else if (i == 2) {
            str = "POST";
        } else {
            if (i != 3) {
                h9o.e();
                return null;
            }
            str = "HEAD";
        }
        httpURLConnection.setRequestMethod(str);
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnection;
    }

    public final void i(long j) throws IOException {
        if (j != 0) {
            byte[] bArr = new byte[4096];
            while (j > 0) {
                int iMin = (int) Math.min(j, 4096L);
                InputStream inputStream = this.j;
                String str = tym.a;
                int i = inputStream.read(bArr, 0, iMin);
                if (Thread.currentThread().isInterrupted()) {
                    throw new joa(2000, 1, new InterruptedIOException());
                }
                if (i == -1) {
                    throw new joa();
                }
                j -= i;
                a(i);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027 A[Catch: IOException -> 0x0031, TRY_LEAVE, TryCatch #0 {IOException -> 0x0031, blocks: (B:5:0x0004, B:7:0x000d, B:9:0x0016, B:10:0x001c, B:13:0x0027), top: B:18:0x0004 }] */
    @Override // defpackage.oc6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read(byte[] r7, int r8, int r9) throws java.io.IOException {
        /*
            r6 = this;
            if (r9 != 0) goto L4
            r6 = 0
            return r6
        L4:
            long r0 = r6.m     // Catch: java.io.IOException -> L31
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = -1
            if (r2 == 0) goto L1c
            long r4 = r6.n     // Catch: java.io.IOException -> L31
            long r0 = r0 - r4
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L26
            long r4 = (long) r9     // Catch: java.io.IOException -> L31
            long r0 = java.lang.Math.min(r4, r0)     // Catch: java.io.IOException -> L31
            int r9 = (int) r0     // Catch: java.io.IOException -> L31
        L1c:
            java.io.InputStream r0 = r6.j     // Catch: java.io.IOException -> L31
            java.lang.String r1 = defpackage.tym.a     // Catch: java.io.IOException -> L31
            int r7 = r0.read(r7, r8, r9)     // Catch: java.io.IOException -> L31
            if (r7 != r3) goto L27
        L26:
            return r3
        L27:
            long r8 = r6.n     // Catch: java.io.IOException -> L31
            long r0 = (long) r7     // Catch: java.io.IOException -> L31
            long r8 = r8 + r0
            r6.n = r8     // Catch: java.io.IOException -> L31
            r6.a(r7)     // Catch: java.io.IOException -> L31
            return r7
        L31:
            r6 = move-exception
            java.lang.String r7 = defpackage.tym.a
            r7 = 2
            joa r6 = defpackage.joa.d(r7, r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dr6.read(byte[], int, int):int");
    }
}
