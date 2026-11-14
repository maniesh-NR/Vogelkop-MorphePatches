package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;

/* loaded from: classes.dex */
public final class qhi {
    public final URLConnection a;

    public qhi(URLConnection uRLConnection) {
        this.a = uRLConnection;
    }

    public final void a() throws IOException {
        try {
            this.a.connect();
        } catch (IOException e) {
            throw e;
        } catch (NullPointerException e2) {
            t3p.r(e2);
        } catch (Throwable th) {
            t3p.r(th);
        }
    }

    public final void b() {
        URLConnection uRLConnection = this.a;
        if (uRLConnection instanceof HttpURLConnection) {
            try {
                ((HttpURLConnection) uRLConnection).disconnect();
            } catch (Throwable unused) {
            }
        }
    }

    public final InputStream c() throws IOException {
        a();
        try {
            InputStream inputStream = this.a.getInputStream();
            if (inputStream != null) {
                return inputStream;
            }
            throw new IOException("InputStream is null");
        } catch (IOException e) {
            throw e;
        } catch (NullPointerException e2) {
            t3p.r(e2);
            return null;
        } catch (Throwable th) {
            t3p.r(th);
            return null;
        }
    }

    public final int d() throws IOException {
        URLConnection uRLConnection = this.a;
        if (!(uRLConnection instanceof HttpURLConnection)) {
            return -1;
        }
        a();
        try {
            return ((HttpURLConnection) uRLConnection).getResponseCode();
        } catch (IOException e) {
            throw e;
        } catch (NullPointerException e2) {
            t3p.r(e2);
            return 0;
        } catch (Throwable th) {
            t3p.r(th);
            return 0;
        }
    }
}
