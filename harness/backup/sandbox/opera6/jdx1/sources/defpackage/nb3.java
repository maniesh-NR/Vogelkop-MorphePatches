package defpackage;

import ads_mobile_sdk.r11;
import ads_mobile_sdk.s11;
import android.os.Trace;
import android.util.Pair;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final /* synthetic */ class nb3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ nb3(s11 s11Var, String str, l94 l94Var, boolean z, String str2, byte[] bArr) {
        this.a = (byte) 3;
        this.c = s11Var;
        this.e = str;
        this.d = l94Var;
        this.b = z;
        this.f = str2;
        this.g = bArr;
    }

    public /* synthetic */ nb3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yee yeeVarC;
        HttpURLConnection httpURLConnection;
        byte b = this.a;
        HttpURLConnection httpURLConnection2 = null;
        boolean z = this.b;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.d;
        Object obj4 = this.e;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                ikl iklVar = (ikl) obj5;
                d2c d2cVar = (d2c) obj3;
                String str = (String) obj4;
                n27 n27Var = (n27) obj2;
                mh9 mh9Var = (mh9) obj;
                boolean z2 = this.b;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    ttj ttjVarH = ytj.h();
                    yee yeeVar = ttjVarH instanceof yee ? (yee) ttjVarH : null;
                    if (yeeVar == null || (yeeVarC = yeeVar.C(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        ttj ttjVarJ = yeeVarC.j();
                        try {
                            ikl iklVarV = xgh.v(iklVar, d2cVar);
                            l08 l08Var = l08.a;
                            c91 c91Var = new c91(str, iklVarV, l08Var, l08Var, mh9Var, n27Var, z2);
                            c91Var.i.c();
                            c91Var.b();
                            yeeVarC.w().f();
                            return;
                        } finally {
                            ttj.q(ttjVarJ);
                        }
                    } finally {
                    }
                } finally {
                    Trace.endSection();
                }
            case 1:
                Pair pair = (Pair) obj3;
                ((el6) ((vrd) obj5).b.i).i(((Integer) pair.first).intValue(), (jrd) pair.second, (bsc) obj4, (tjd) obj2, (IOException) obj, this.b);
                return;
            case 2:
                y2n y2nVar = (y2n) obj5;
                ntk ntkVar = (ntk) obj3;
                zd4 zd4Var = (zd4) obj4;
                j3n j3nVar = (j3n) obj2;
                zpl zplVar = (zpl) obj;
                if (zd4Var == y2nVar.e()) {
                    y2nVar.x = ntkVar.d(zd4Var, true);
                    k4n k4nVar = (k4n) j3nVar.i(j3n.b);
                    Objects.requireNonNull(k4nVar);
                    k4nVar.f(y2nVar.x, zplVar, z);
                    y2nVar.T();
                    return;
                }
                return;
            default:
                s11 s11Var = (s11) obj5;
                String str2 = (String) obj4;
                l94 l94Var = (l94) obj3;
                String str3 = (String) obj2;
                byte[] bArr = (byte[]) obj;
                long j = s11Var.c;
                try {
                    try {
                        httpURLConnection = (HttpURLConnection) URI.create(str2).toURL().openConnection();
                    } finally {
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                    }
                } catch (SocketTimeoutException e) {
                    e = e;
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    Objects.requireNonNull(httpURLConnection);
                    l94Var.a(new ttn(httpURLConnection, (byte) 26), s11Var.a);
                    httpURLConnection.setRequestProperty("User-Agent", s11Var.b);
                    int i = (int) j;
                    httpURLConnection.setConnectTimeout(i);
                    httpURLConnection.setReadTimeout(i);
                    if (z) {
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setRequestMethod("POST");
                        if (str3 != null) {
                            httpURLConnection.setRequestProperty("Content-Type", str3);
                        }
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                        try {
                            bufferedOutputStream.write(bArr);
                            bufferedOutputStream.close();
                        } finally {
                        }
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    l94Var.b(new r11(responseCode, s11.a(httpURLConnection, responseCode)));
                    httpURLConnection.disconnect();
                    return;
                } catch (SocketTimeoutException e2) {
                    e = e2;
                    httpURLConnection2 = httpURLConnection;
                    l94Var.d(new TimeoutException("Timeout: " + e.getMessage()));
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    httpURLConnection2 = httpURLConnection;
                    l94Var.d(th);
                    if (httpURLConnection2 != null) {
                    }
                    return;
                }
        }
    }
}
