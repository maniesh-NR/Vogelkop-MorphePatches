package defpackage;

import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes.dex */
public final class hvj implements Closeable {
    public final ks3 a;
    public String b = "";
    public String c = "--\r\n";
    public HttpsURLConnection d;
    public GZIPOutputStream e;

    public hvj(ks3 ks3Var) {
        this.a = ks3Var;
    }

    public static void k(ks3 ks3Var, String str) {
        if (!str.startsWith("CrashID=")) {
            ks3Var.getClass();
            ks3.G("No CrashID from server");
            return;
        }
        String strSubstring = str.substring(8);
        ks3Var.getClass();
        if (tz5.b.get() != null) {
            am2.x(tz5.c().edit().putString("crash.last.upload.status", strSubstring), "crash.last.upload.timestamp");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        HttpsURLConnection httpsURLConnection;
        try {
            GZIPOutputStream gZIPOutputStream = this.e;
            if (gZIPOutputStream != null) {
                gZIPOutputStream.close();
            }
            HttpsURLConnection httpsURLConnection2 = this.d;
            if (httpsURLConnection2 == null) {
                if (httpsURLConnection2 != null) {
                    httpsURLConnection2.disconnect();
                    return;
                }
                return;
            }
            int responseCode = httpsURLConnection2.getResponseCode();
            int i = responseCode / 100;
            ks3 ks3Var = this.a;
            if (i == 2) {
                try {
                    k(ks3Var, xvg.z(this.d.getInputStream()));
                } catch (IOException e) {
                    String str = "I/O Error " + e.getMessage();
                    ks3Var.getClass();
                    ks3.G(str);
                }
                if (httpsURLConnection != null) {
                    return;
                } else {
                    return;
                }
            }
            Locale locale = Locale.ROOT;
            String str2 = responseCode + " " + this.d.getResponseMessage();
            ks3Var.getClass();
            ks3.G(str2);
            throw new IOException(str2);
        } finally {
            httpsURLConnection = this.d;
            if (httpsURLConnection != null) {
                httpsURLConnection.disconnect();
            }
        }
    }

    public final void h(URL url) {
        if (this.b.isEmpty()) {
            this.b = UUID.randomUUID().toString();
            this.c = z1m.l(new StringBuilder("--"), this.b, "\r\n");
        }
        HttpURLConnection.setFollowRedirects(true);
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
        this.d = httpsURLConnection;
        httpsURLConnection.setConnectTimeout(1500);
        this.d.setDoInput(true);
        this.d.setDoOutput(true);
        this.d.setUseCaches(false);
        this.d.setChunkedStreamingMode(0);
        this.d.setRequestProperty("Content-Encoding", "gzip");
        this.d.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + this.b);
        this.e = new GZIPOutputStream(new BufferedOutputStream(this.d.getOutputStream()));
    }

    public final void l() throws IOException {
        this.e.write(this.c.getBytes());
    }

    public final void m(HashMap map) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            this.e.write(this.c.getBytes());
            this.e.write(z1m.l(new StringBuilder("Content-Disposition: form-data; name=\""), (String) entry.getKey(), "\"\r\n\r\n").getBytes());
            this.e.write(z1m.l(new StringBuilder(), (String) entry.getValue(), "\r\n").getBytes());
        }
    }
}
