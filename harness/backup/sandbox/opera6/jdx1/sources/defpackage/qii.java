package defpackage;

import J.N;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.opera.android.browser.chromium.OperaBrowserContext;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class qii implements ml5, wj4, ee5, hyd, dr3, jzh, te, ltm, bnj, zg3, jv0, w7e {
    public static final qii a = new qii();
    public static final qii b = new qii();
    public static final qii c = new qii();
    public static final qii d = new qii();
    public static final qii e = new qii();
    public static final qii f = new qii();
    public static final qii g = new qii();
    public static final qii h = new qii();
    public static final qii i = new qii();
    public static final qii j = new qii();
    public static final qii k = new qii();
    public static final qii l = new qii();
    public static final qii m = new qii();
    public static final qii n = new qii();
    public static final qii o = new qii();
    public static final qii p = new qii();

    public static void n(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            try {
                webView.evaluateJavascript(str, null);
            } catch (IllegalStateException unused) {
                webView.loadUrl("javascript: " + str);
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public static jdj q() {
        return ipe.c(1, 0, h04.b, 2);
    }

    public static int t(int i2, int i3, int i4) {
        int i5 = 1;
        while (i4 >= 32) {
            i5 = (int) (((((i3 * i5) & 4294967295L) * i2) + i5) >>> 32);
            i4 -= 32;
        }
        if (i4 <= 0) {
            return i5;
        }
        return (int) ((((((i3 * i5) & ((-1) >>> (-i4))) & 4294967295L) * i2) + i5) >>> i4);
    }

    public static void x(int i2, int i3, boolean z, jeh[][] jehVarArr) {
        jeh[] jehVarArr2 = jehVarArr[i2];
        jeh jehVar = jehVarArr2[i3];
        if (jehVar != null) {
            jehVar.a = z;
        } else {
            jehVarArr2[i3] = new jeh(z, i2, i3, jehVarArr.length, (keh) null, 0, 0, (jeh) null, 112);
        }
    }

    public static void y(int i2, int i3, jeh[][] jehVarArr) {
        int i4;
        int length = jehVarArr.length;
        jeh jehVar = new jeh(false, i2, i3, length, new keh(leh.a, ieh.k), 7, 7, (jeh) null, NotificationCompat.FLAG_HIGH_PRIORITY);
        int i5 = -1;
        while (true) {
            int i6 = -1;
            while (true) {
                int i7 = i5 + i2;
                if (i7 >= 0 && i7 < length && (i4 = i6 + i3) >= 0 && i4 < length) {
                    jeh jehVar2 = jehVar;
                    jehVar = jehVar2;
                    jehVarArr[i7][i4] = new jeh((i6 >= 0 && i6 < 7 && (i5 == 0 || i5 == 6)) || (i5 >= 0 && i5 < 7 && (i6 == 0 || i6 == 6)) || (2 <= i5 && i5 < 5 && 2 <= i6 && i6 <= 4), i7, i4, length, new keh(leh.a, i5 == 0 ? i6 == 0 ? ieh.a : i6 == 6 ? ieh.b : i6 == 7 ? ieh.j : ieh.c : i5 == 6 ? i6 == 0 ? ieh.g : i6 == 6 ? ieh.h : i6 == 7 ? ieh.j : ieh.i : i5 == 7 ? ieh.j : i6 == 0 ? ieh.d : i6 == 6 ? ieh.e : i6 == 7 ? ieh.j : ieh.f), 0, 0, jehVar2, 96);
                }
                if (i6 == 7) {
                    break;
                } else {
                    i6++;
                }
            }
            if (i5 == 7) {
                return;
            } else {
                i5++;
            }
        }
    }

    public final void F(Bitmap bitmap) {
    }

    @Override // defpackage.zg3
    public final Bitmap a(int i2, int i3, Bitmap.Config config) {
        return Bitmap.createBitmap(i2, i3, config);
    }

    public void b(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // defpackage.zg3
    public final void c(int i2) {
    }

    public final void configure(w18 w18Var) {
        cl2 cl2Var = cl2.a;
        w18Var.registerEncoder(cc3.class, cl2Var);
        w18Var.registerEncoder(tm2.class, cl2Var);
        jl2 jl2Var = jl2.a;
        w18Var.registerEncoder(zyc.class, jl2Var);
        w18Var.registerEncoder(zn2.class, jl2Var);
        dl2 dl2Var = dl2.a;
        w18Var.registerEncoder(i45.class, dl2Var);
        w18Var.registerEncoder(ym2.class, dl2Var);
        bl2 bl2Var = bl2.a;
        w18Var.registerEncoder(e31.class, bl2Var);
        w18Var.registerEncoder(pm2.class, bl2Var);
        il2 il2Var = il2.a;
        w18Var.registerEncoder(wyc.class, il2Var);
        w18Var.registerEncoder(yn2.class, il2Var);
        el2 el2Var = el2.a;
        w18Var.registerEncoder(hd5.class, el2Var);
        w18Var.registerEncoder(zm2.class, el2Var);
        hl2 hl2Var = hl2.a;
        w18Var.registerEncoder(vm8.class, hl2Var);
        w18Var.registerEncoder(nn2.class, hl2Var);
        gl2 gl2Var = gl2.a;
        w18Var.registerEncoder(um8.class, gl2Var);
        w18Var.registerEncoder(mn2.class, gl2Var);
        kl2 kl2Var = kl2.a;
        w18Var.registerEncoder(wle.class, kl2Var);
        w18Var.registerEncoder(bo2.class, kl2Var);
        fl2 fl2Var = fl2.a;
        w18Var.registerEncoder(oj8.class, fl2Var);
        w18Var.registerEncoder(ln2.class, fl2Var);
    }

    public final int d() {
        return 0;
    }

    @Override // defpackage.zg3
    public final void e() {
    }

    public final void f(boolean z) {
    }

    @Override // defpackage.zg3
    public final Bitmap g(int i2, int i3, Bitmap.Config config) {
        return Bitmap.createBitmap(i2, i3, config);
    }

    public final PointF h(gyd gydVar, int i2) {
        return new PointF(gydVar.a, gydVar.b);
    }

    public final int i() {
        return 0;
    }

    public final void j(List list, x92 x92Var) {
    }

    public final String k() {
        j4c j4cVar = OperaBrowserContext.b;
        return (String) N.MFXyJri2();
    }

    public final void l(String str) {
    }

    public final void m(WebView webView, String str, Object... objArr) {
        String string;
        if (webView != null) {
            StringBuilder sb = new StringBuilder(NotificationCompat.FLAG_HIGH_PRIORITY);
            sb.append("if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            if (objArr.length > 0) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        string = "null";
                    } else {
                        if (obj instanceof String) {
                            string = obj.toString();
                            if (!string.startsWith("{")) {
                                sb.append('\"');
                                sb.append(string);
                                sb.append('\"');
                            }
                        } else {
                            sb.append(obj);
                        }
                        sb.append(",");
                    }
                    sb.append(string);
                    sb.append(",");
                }
                sb.setLength(sb.length() - 1);
            }
            sb.append(")}");
            String string2 = sb.toString();
            Handler handler = webView.getHandler();
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            if (Looper.myLooper() == handler.getLooper()) {
                n(webView, string2);
            } else {
                handler.post(new vr9((Object) this, (Object) webView, (Object) string2, (byte) 25));
            }
        }
    }

    @Override // defpackage.dr3
    public final long o(r05 r05Var, int i2) {
        String str = ((njl) r05Var.e).a.a.b;
        return upj.c(exg.r(i2, str), exg.q(i2, str));
    }

    public final z7h p(oj9 oj9Var) {
        byte b2;
        byte b3;
        String str = oj9Var.n;
        if (str != null) {
            b2 = 1;
            b3 = 0;
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new rt1(b3);
                case "application/x-icy":
                    return new iua();
                case "application/id3":
                    return new nua(null);
                case "application/x-emsg":
                    return new rt1(b2);
                case "application/x-scte35":
                    return new i0k();
            }
        }
        qp2.o(sko.j("Attempted to create decoder for unsupported MIME type: ", str));
        return null;
    }

    public final Object r(x79 x79Var) {
        return fr3.I((Executor) x79Var.h(new qfh(ljm.class, Executor.class)));
    }

    @Override // defpackage.jzh
    public final kyh s(kyh kyhVar, trf trfVar) {
        return kyhVar;
    }

    public final boolean u() {
        return false;
    }

    public final boolean v() {
        return false;
    }

    @Override // defpackage.w7e
    public final v7e w(d5o d5oVar) {
        return new v24(new rbe((byte) 26), (byte) 0);
    }

    public final boolean z(oj9 oj9Var) {
        String str = oj9Var.n;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
