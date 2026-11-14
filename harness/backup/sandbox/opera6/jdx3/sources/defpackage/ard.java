package defpackage;

import J.N;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.leanplum.internal.Constants;
import com.opera.android.OperaApplication;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.browser.chromium.media.OperaMediaRouterClient;
import java.util.HashSet;
import org.chromium.base.SysUtils;
import org.chromium.content.browser.MediaSessionImpl;
import org.chromium.content_public.browser.MediaSession;
import org.chromium.content_public.browser.WebContents;
import org.chromium.services.media_session.MediaMetadata;
import org.chromium.services.media_session.MediaPosition;

/* loaded from: classes.dex */
public final class ard {
    public final umi a;
    public ChromiumContent b;
    public epd c;
    public evn d;
    public Bitmap e;
    public Bitmap f;
    public Bitmap g;
    public String h;
    public boolean i;
    public zqd j;
    public final int k;
    public ikd l;
    public String m;
    public MediaMetadata n;
    public MediaMetadata o;
    public final ac1 p;
    public HashSet q;
    public MediaPosition r;
    public oml s;
    public int t = Integer.MIN_VALUE;
    public final k03 u;
    public final wub v;

    public ard(ChromiumContent chromiumContent, umi umiVar) {
        this.k = Integer.MIN_VALUE;
        k03 k03Var = new k03();
        k03Var.a = -1L;
        k03Var.b = -1L;
        this.u = k03Var;
        this.v = new wub(this);
        ty3 ty3Var = new ty3(this, (byte) 7);
        this.b = chromiumContent;
        Context context = t8.a;
        String[] strArr = OperaApplication.K;
        this.c = (epd) ((OperaApplication) context.getApplicationContext()).r.c0.get();
        this.d = (evn) ((OperaApplication) t8.a.getApplicationContext()).r.q1.get();
        this.b.k(ty3Var);
        int i = SysUtils.b() ? Constants.Crypt.KEY_LENGTH : 512;
        ac1 ac1Var = new ac1();
        ac1Var.a = i;
        ac1Var.b = -1;
        ac1Var.d = null;
        this.p = ac1Var;
        WebContents webContentsE = this.b.e();
        ac1Var.c = webContentsE;
        ac1Var.b = -1;
        ac1Var.d = null;
        MediaSessionImpl mediaSessionImpl = (MediaSessionImpl) N.Mtun$qW8(webContentsE);
        zqd zqdVar = this.j;
        if (zqdVar == null || mediaSessionImpl != zqdVar.a) {
            a();
            if (mediaSessionImpl != null) {
                this.j = new zqd(this, mediaSessionImpl, mediaSessionImpl);
            }
            f();
        }
        fp1 fp1VarC = this.b.c();
        if (fp1VarC != null) {
            this.k = fp1VarC.getVolumeControlStream();
        }
        this.a = umiVar;
    }

    public final void a() {
        if (this.j == null) {
            return;
        }
        int i = this.t;
        if (i != Integer.MIN_VALUE) {
            OperaMediaRouterClient.b.a.remove(i);
            this.t = Integer.MIN_VALUE;
        }
        MediaSession mediaSession = this.j.a;
        if (mediaSession != null) {
            this.c.a(mediaSession, false, false);
            this.d.n(mediaSession);
        }
        zqd zqdVar = this.j;
        MediaSession mediaSession2 = zqdVar.a;
        if (mediaSession2 != null) {
            mediaSession2.c(zqdVar);
            zqdVar.a = null;
        }
        this.j = null;
        this.q = null;
    }

    public final MediaMetadata b() {
        String str;
        String str2;
        String str3 = this.m;
        MediaMetadata mediaMetadata = this.n;
        if (mediaMetadata != null) {
            boolean zIsEmpty = TextUtils.isEmpty(mediaMetadata.a);
            MediaMetadata mediaMetadata2 = this.n;
            if (!zIsEmpty) {
                return mediaMetadata2;
            }
            str = mediaMetadata2.b;
            str2 = mediaMetadata2.c;
        } else {
            str = "";
            str2 = "";
        }
        MediaMetadata mediaMetadata3 = this.o;
        return (mediaMetadata3 != null && TextUtils.equals(str3, mediaMetadata3.a) && TextUtils.equals(str, this.o.b) && TextUtils.equals(str2, this.o.c)) ? this.o : new MediaMetadata(str3, str, str2);
    }

    public final void c() {
        if (this.b == null) {
            return;
        }
        oml omlVar = this.s;
        if (omlVar != null) {
            omlVar.cancel(false);
            this.s = null;
        }
        d();
        this.l = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r8 = this;
            com.opera.android.browser.chromium.ChromiumContent r0 = r8.b
            int r0 = r0.i
            r1 = 2131363343(0x7f0a060f, float:1.8346492E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            android.util.SparseArray r3 = lkd.a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            android.util.Pair r3 = android.util.Pair.create(r3, r2)
            java.util.HashMap r4 = lkd.b
            java.lang.Object r3 = r4.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L24
            int r3 = r3.intValue()
            goto L25
        L24:
            r3 = r1
        L25:
            android.util.SparseArray r5 = lkd.a
            java.lang.Object r6 = r5.get(r3)
            hkd r6 = (hkd) r6
            if (r6 == 0) goto L66
            jkd r7 = r6.g
            if (r7 == 0) goto L3c
            int r7 = r7.e
            if (r7 != r0) goto L66
            if (r0 != r7) goto L3c
            r6.b()
        L3c:
            r5.remove(r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r0 = android.util.Pair.create(r0, r2)
            r4.remove(r0)
            android.util.SparseIntArray r0 = lkd.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r2 = r0.get(r1, r2)
            java.lang.Object r4 = r5.get(r2)
            hkd r4 = (hkd) r4
            if (r3 == r2) goto L60
            if (r4 == 0) goto L60
            boolean r2 = r4.i
            if (r2 != 0) goto L66
        L60:
            r0.delete(r1)
            lkd.c(r1, r3)
        L66:
            com.opera.android.browser.chromium.ChromiumContent r0 = r8.b
            dx3 r0 = r0.c()
            if (r0 == 0) goto L73
            int r8 = r8.k
            r0.setVolumeControlStream(r8)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ard.d():void");
    }

    public final boolean e() {
        return this.l == null;
    }

    public final void f() {
        int i;
        int i2;
        if (this.j == null || (i = this.b.i) == (i2 = this.t)) {
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            OperaMediaRouterClient.b.a.remove(i2);
            this.t = Integer.MIN_VALUE;
        }
        this.t = i;
        OperaMediaRouterClient.b.a.put(i, new y0a(this, (byte) 20));
    }

    public final void g() {
        oml omlVar = this.s;
        if (omlVar != null) {
            omlVar.cancel(false);
            this.s = null;
        }
        f03.h0(this.l.a());
    }

    public final void h() {
        Bitmap bitmap = this.e;
        if (bitmap == null) {
            bitmap = this.f;
        }
        if (this.g != bitmap) {
            this.g = bitmap;
            if (e()) {
                return;
            }
            ikd ikdVar = this.l;
            ikdVar.g = this.g;
            ikdVar.h = this.e;
            g();
        }
    }

    public final void i() {
        if (e()) {
            return;
        }
        MediaMetadata mediaMetadataB = b();
        if (this.o.equals(mediaMetadataB)) {
            return;
        }
        this.o = mediaMetadataB;
        this.l.a = mediaMetadataB;
        g();
    }
}
