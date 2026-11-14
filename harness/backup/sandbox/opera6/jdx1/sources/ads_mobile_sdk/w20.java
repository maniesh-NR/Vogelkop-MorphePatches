package ads_mobile_sdk;

import defpackage.fsg;
import defpackage.rap;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.h;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes.dex */
public final class w20 extends UrlRequest.Callback {
    public final ByteArrayOutputStream a;
    public final WritableByteChannel b;
    public final ByteBuffer c;
    public boolean d;
    public cd5 e;
    public nh4 f;
    public final /* synthetic */ p30 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ h21 i;

    public w20(nh4 nh4Var, p30 p30Var, boolean z, h21 h21Var) {
        this.g = p30Var;
        this.h = z;
        this.i = h21Var;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.a = byteArrayOutputStream;
        this.b = Channels.newChannel(byteArrayOutputStream);
        this.c = ByteBuffer.allocateDirect(32768);
        this.f = nh4Var;
    }

    public final void a() {
        try {
            this.b.close();
        } catch (Throwable th) {
            xu0.a(new d30(th, (byte) 1));
        }
    }

    public final void a(rap rapVar) {
        if (!this.d) {
            a();
        }
        nh4 nh4Var = this.f;
        if (nh4Var != null && (nh4Var.r() instanceof c0f)) {
            p0i p0iVar = t0i.b;
            nh4Var.resumeWith(rapVar);
        }
        this.f = null;
    }

    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        if (!this.d) {
            a(new ev0("Request was cancelled", ae1.k));
            return;
        }
        cd5 cd5Var = this.e;
        if (cd5Var != null) {
            cd5Var.B0(new CancellationException("Request was cancelled"));
        }
        a();
    }

    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        if (!this.d) {
            a(new bv0(cronetException, ae1.e, null, 4));
            return;
        }
        cd5 cd5Var = this.e;
        if (cd5Var != null) {
            cd5Var.B0(cronetException);
        }
        a();
    }

    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) throws IOException {
        byteBuffer.flip();
        this.b.write(byteBuffer);
        byteBuffer.clear();
        urlRequest.read(byteBuffer);
    }

    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        defpackage.pr prVar = new defpackage.pr((byte) 9);
        prVar.a = urlResponseInfo.getHttpStatusCode();
        prVar.a(urlResponseInfo.getAllHeaders());
        prVar.b = urlResponseInfo.getHttpStatusText();
        prVar.f = str;
        a(new hv0(prVar.a()));
        urlRequest.cancel();
    }

    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        p30 p30Var = this.g;
        qr0 qr0Var = p30Var.b;
        mt5 mt5Var = null;
        defpackage.na2.B(p30Var.a, h.a, null, new fsg(new zj((Object) this.i, (Object) urlResponseInfo, mt5Var, (byte) 10), mt5Var, (byte) 3), 2);
        if (this.h && qr0Var != null && ((Boolean) qr0Var.a("gads:enable_normalization_before_body", Boolean.FALSE, fo.a)).booleanValue()) {
            Map allHeaders = urlResponseInfo.getAllHeaders();
            if (!allHeaders.isEmpty()) {
                Iterator it = allHeaders.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    qr0Var.getClass();
                    if (kotlin.text.c.m(str, (String) qr0Var.a("gads:html_body_header", "X-Afma-Is-Html-Response", fo.a$23), true) && Boolean.parseBoolean((String) CollectionsKt.firstOrNull((List) entry.getValue()))) {
                        this.d = true;
                        this.e = new cd5();
                        defpackage.pr prVar = new defpackage.pr((byte) 9);
                        prVar.a = urlResponseInfo.getHttpStatusCode();
                        prVar.a(urlResponseInfo.getAllHeaders());
                        prVar.b = urlResponseInfo.getHttpStatusText();
                        prVar.e = this.e;
                        a(new hv0(prVar.a()));
                        break;
                    }
                }
            }
        }
        urlRequest.read(this.c);
    }

    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        boolean z = this.d;
        ByteArrayOutputStream byteArrayOutputStream = this.a;
        if (z) {
            gv2 gv2Var = new gv2(byteArrayOutputStream.toByteArray());
            cd5 cd5Var = this.e;
            if (cd5Var != null) {
                cd5Var.j0(gv2Var);
            }
            a();
            return;
        }
        defpackage.pr prVar = new defpackage.pr((byte) 9);
        prVar.a = urlResponseInfo.getHttpStatusCode();
        prVar.a(urlResponseInfo.getAllHeaders());
        prVar.b = urlResponseInfo.getHttpStatusText();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray != null) {
            prVar.d = new gv2(byteArray);
        }
        a(new hv0(prVar.a()));
    }
}
