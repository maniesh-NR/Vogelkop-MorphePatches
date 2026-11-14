package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import okhttp3.internal.connection.RealCall;

/* loaded from: classes.dex */
public abstract class g3k implements f94 {
    public static final ii e = new ii(23);
    public final t9f a;
    public final String b;
    public int c;
    public RealCall d;

    public g3k(String str, t9f t9fVar, int i) {
        this.b = str;
        this.a = t9fVar;
        this.c = i;
    }

    public void a(pzh pzhVar, byte[] bArr) {
        d(pzhVar, bArr);
    }

    public boolean b(int i) {
        int i2 = this.c;
        if (i2 <= 0) {
            return false;
        }
        this.c = i2 - 1;
        return true;
    }

    public abstract void c(String str);

    public abstract void d(pzh pzhVar, byte[] bArr);

    public abstract void e(fvh fvhVar);

    public byte[] f(vzh vzhVar, pzh pzhVar) {
        return vzhVar.bytes();
    }

    public final void g() {
        fvh fvhVar = new fvh();
        fvhVar.h(this.b);
        e(fvhVar);
        RealCall realCallQ = j7c.q(fvhVar, this.a);
        this.d = realCallQ;
        realCallQ.enqueue(this);
    }

    public final void onFailure(v84 v84Var, IOException iOException) {
        vml.c(new ky((Object) this, iOException instanceof SocketTimeoutException ? 1 : ((iOException instanceof ConnectException) || (iOException instanceof NoRouteToHostException) || (iOException instanceof UnknownHostException)) ? 2 : iOException instanceof SSLException ? 4 : 3, (Object) v84Var, (Serializable) iOException, (byte) 1));
    }

    public final void onResponse(v84 v84Var, pzh pzhVar) {
        vzh vzhVar = null;
        try {
            try {
                vzhVar = pzhVar.g;
                byte[] bArrF = f(vzhVar, pzhVar);
                xvg.l(vzhVar);
                vml.c(new iv(this, pzhVar, bArrF, (byte) 12));
            } catch (IOException e2) {
                onFailure(v84Var, e2);
                xvg.l(vzhVar);
            }
        } catch (Throwable th) {
            xvg.l(vzhVar);
            throw th;
        }
    }
}
