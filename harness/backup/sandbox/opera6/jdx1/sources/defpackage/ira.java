package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* loaded from: classes.dex */
public final class ira implements yb6 {
    public final xy9 a;
    public final int b;
    public HttpURLConnection c;
    public InputStream d;
    public volatile boolean e;

    public ira(xy9 xy9Var, int i) {
        this.a = xy9Var;
        this.b = i;
    }

    @Override // defpackage.yb6
    public final Class a() {
        return InputStream.class;
    }

    public final InputStream b(URL url, int i, URL url2, Map map) throws IOException {
        if (i >= 5) {
            throw new g65("Too many (> 5) redirects!", null);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new g65("In re-direct loop", null);
                }
            } catch (URISyntaxException unused) {
            }
        }
        this.c = (HttpURLConnection) url.openConnection();
        for (Map.Entry entry : map.entrySet()) {
            this.c.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        this.c.setConnectTimeout(this.b);
        this.c.setReadTimeout(this.b);
        this.c.setUseCaches(false);
        this.c.setDoInput(true);
        this.c.setInstanceFollowRedirects(false);
        this.c.connect();
        this.d = this.c.getInputStream();
        if (this.e) {
            return null;
        }
        int responseCode = this.c.getResponseCode();
        int i2 = responseCode / 100;
        if (i2 == 2) {
            HttpURLConnection httpURLConnection = this.c;
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.d = new tq5(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    httpURLConnection.getContentEncoding();
                }
                this.d = httpURLConnection.getInputStream();
            }
            return this.d;
        }
        if (i2 != 3) {
            if (responseCode == -1) {
                throw new g65(sko.i(responseCode, "Http request failed with status code: "), null);
            }
            throw new g65(this.c.getResponseMessage(), null);
        }
        String headerField = this.c.getHeaderField("Location");
        if (TextUtils.isEmpty(headerField)) {
            throw new g65("Received empty or null redirect url", null);
        }
        URL url3 = new URL(url, headerField);
        c();
        return b(url3, i + 1, url, map);
    }

    @Override // defpackage.yb6
    public final void c() throws IOException {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.c = null;
    }

    @Override // defpackage.yb6
    public final void cancel() {
        this.e = true;
    }

    @Override // defpackage.yb6
    public final void e(nyg nygVar, xb6 xb6Var) {
        xy9 xy9Var = this.a;
        SystemClock.elapsedRealtimeNanos();
        try {
            try {
                xb6Var.g(b(xy9Var.d(), 0, null, xy9Var.b.b()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    SystemClock.elapsedRealtimeNanos();
                }
            } catch (IOException e) {
                xb6Var.d(e);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    SystemClock.elapsedRealtimeNanos();
                }
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
            throw th;
        }
    }

    @Override // defpackage.yb6
    public final int f() {
        return 2;
    }
}
