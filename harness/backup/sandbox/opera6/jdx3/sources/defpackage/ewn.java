package defpackage;

import android.net.Uri;
import com.opera.api.Callback;
import okhttp3.internal.ws.RealWebSocket;

/* loaded from: classes.dex */
public final class ewn extends svn {
    public final umi a;
    public final Object b = new Object();
    public RealWebSocket c;
    public String d;
    public Callback e;

    public ewn(umi umiVar, Uri uri, t9f t9fVar) {
        this.a = umiVar;
        fvh fvhVar = new fvh();
        fvhVar.h(uri.toString());
        fvhVar.a("Sec-WebSocket-Protocol", "oscore.v1");
        this.c = t9fVar.a(new kvh(fvhVar), this);
    }

    public final void a(int i, String str) {
        this.a.d(new wvn(this, (byte) 0)).a(null);
    }

    public final void c(Exception exc, pzh pzhVar) {
        this.a.d(new wvn(this, (byte) 0)).a(null);
    }

    public final void e(String str) {
        synchronized (this.b) {
            if (this.d == null) {
                this.d = str;
                this.a.d(new wvn(this, (byte) 1)).a(null);
            } else {
                this.d += str;
            }
        }
    }

    public final void g() {
        String str;
        if (this.e != null) {
            synchronized (this.b) {
                str = this.d;
                this.d = null;
            }
            if (this.c == null || str != null) {
                Callback callback = this.e;
                this.e = null;
                callback.run(str);
            }
        }
    }

    public final void h(Callback callback) {
        String str;
        synchronized (this.b) {
            str = this.d;
            this.d = null;
        }
        if (str != null) {
            callback.run(str);
        } else if (this.c == null) {
            callback.run(null);
        } else {
            this.e = callback;
        }
    }
}
