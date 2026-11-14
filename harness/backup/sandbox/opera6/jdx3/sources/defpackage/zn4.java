package defpackage;

import J.N;
import android.net.Uri;
import com.opera.android.http.server.HttpServer;
import java.util.HashSet;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class zn4 {
    public final HttpServer d;
    public final Uri e;
    public boolean g;
    public final Random a = new Random();
    public final HashSet b = new HashSet();
    public final HashSet c = new HashSet();
    public final ExecutorService f = Executors.newSingleThreadExecutor();

    public zn4(HttpServer httpServer, Uri uri) {
        this.d = httpServer;
        this.e = uri;
    }

    public final void a() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.b.clear();
        HttpServer httpServer = this.d;
        long j = httpServer.b;
        if (j == 0) {
            return;
        }
        N.MUXtkyI5(j);
        httpServer.b = 0L;
    }

    public final String b() {
        return "/media/" + System.currentTimeMillis() + "/" + this.a.nextInt();
    }

    public final void c(Uri uri) {
        if (this.g) {
            return;
        }
        String scheme = uri.getScheme();
        Uri uri2 = this.e;
        if (Objects.equals(scheme, uri2.getScheme()) && Objects.equals(uri.getAuthority(), uri2.getAuthority())) {
            boolean zRemove = this.b.remove(uri.getPath());
            HttpServer httpServer = this.d;
            if (zRemove) {
                httpServer.a(uri.getPath());
            } else if (this.c.remove(uri.getPath())) {
                httpServer.a(uri.getPath());
            }
        }
    }
}
