package ads_mobile_sdk;

import android.app.UiModeManager;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewStartUpResult;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdView;
import defpackage.cfp;
import defpackage.d2i;
import defpackage.dbh;
import defpackage.fep;
import defpackage.ia6;
import defpackage.iao;
import defpackage.jun;
import defpackage.nkp;
import defpackage.p3p;
import defpackage.pio;
import defpackage.qr9;
import defpackage.t3p;
import defpackage.tso;
import defpackage.u7p;
import defpackage.v9g;
import defpackage.wdp;
import defpackage.xmb;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.IllegalFormatException;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e7 implements tzo, WebViewCompat.WebViewStartUpCallback, wdp, lap, uwn, d2i, qr9 {
    public static final Object b = new Object();
    public static e7 c;
    public Object a;
    public final /* synthetic */ byte d;

    public e7(byte b2) {
        this.d = b2;
        switch (b2) {
            case 15:
                this.a = new int[2];
                break;
            default:
                this.a = new AtomicBoolean(true);
                break;
        }
    }

    public /* synthetic */ e7(byte b2, boolean z) {
        this.d = b2;
    }

    public e7(int i) {
        this.d = (byte) 6;
        this.a = dbh.c(i);
    }

    public /* synthetic */ e7(int i, ByteArrayOutputStream byteArrayOutputStream) {
        this.d = (byte) 26;
        this.a = byteArrayOutputStream;
    }

    public e7(ov ovVar) {
        this.d = (byte) 23;
        byte[] bArr = yb1.a;
        this.a = ovVar;
        ovVar.a = this;
    }

    public e7(ia6 ia6Var) {
        this.d = (byte) 0;
        this.a = (h7) ((tso) ia6Var.y).get();
    }

    public /* synthetic */ e7(Object obj, byte b2) {
        this.d = b2;
        this.a = obj;
    }

    public e7(String str) {
        this.d = (byte) 18;
        this.a = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    public e7(ByteBuffer byteBuffer) {
        this.d = (byte) 5;
        this.a = byteBuffer.slice();
    }

    public e7(HashMap map) {
        this.d = (byte) 24;
        this.a = p3p.t(map);
    }

    public static void a(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                StringBuilder sbR = p3p.r(str2, " [");
                sbR.append(TextUtils.join(", ", objArr));
                sbR.append("]");
            }
        }
    }

    @Override // defpackage.wdp
    /* renamed from: a */
    public final lw0 mo15a() {
        switch (this.d) {
            case 10:
                return lw0.MEMORY;
            case 16:
                return lw0.ICON_AD;
            case 17:
                return lw0.AD_SPAM;
            case 22:
                return lw0.DEVICE_TIER;
            default:
                return lw0.INSPECTOR_SIGNAL;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public final Object m1a() {
        return (jl2) this.a;
    }

    public final Object a(FileInputStream fileInputStream) throws bj1 {
        try {
            ju0 ju0Var = (ju0) ((jl2) this.a).a(7, (ku0) null);
            ul0 ul0VarA = ul0.a();
            ju0Var.getClass();
            v9g v9gVarA = v9g.a(fileInputStream);
            ku0 ku0VarA = ku0.a(ju0Var.a, v9gVarA, ul0VarA);
            v9gVarA.a(0);
            if (ku0.m5a(ku0VarA)) {
                return ku0VarA;
            }
            throw new bj1(new nkp().getMessage());
        } catch (bj1 e) {
            throw new u7p("Cannot read proto.", e);
        }
    }

    public final Object a(String str) {
        Object obj;
        synchronized (this) {
            obj = this.a;
            if (obj == null) {
                throw new IllegalStateException(str.toString());
            }
        }
        return obj;
    }

    public final JSONObject a(View view) throws JSONException {
        switch (this.d) {
            case 3:
                JSONObject jSONObjectA = v62.a(0, 0, 0, 0);
                UiModeManager uiModeManager = nw.f3a;
                char c2 = 3;
                if (uiModeManager != null) {
                    try {
                        int currentModeType = uiModeManager.getCurrentModeType();
                        if (currentModeType == 1) {
                            c2 = 2;
                        } else if (currentModeType == 4) {
                            c2 = 1;
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                try {
                    jSONObjectA.put("noOutputDevice", zwg.a(c2 == 1 ? r9h.a : (byte) 2) == 0);
                } catch (JSONException unused2) {
                }
                return jSONObjectA;
            default:
                int[] iArr = (int[]) this.a;
                if (view == null) {
                    return v62.a(0, 0, 0, 0);
                }
                int width = view.getWidth();
                int height = view.getHeight();
                view.getLocationOnScreen(iArr);
                return v62.a(iArr[0], iArr[1], width, height);
        }
    }

    public final void a(int i) {
        mb1 mb1Var = (mb1) this.a;
        defpackage.na2.B(mb1Var.c, null, null, new ib1(mb1Var, i, null), 3);
    }

    public final void a(ah2 ah2Var) {
        lk2 lk2Var = (lk2) this.a;
        e7 e7Var = lk2.c;
        e7Var.a("prewarm(%s)", lk2Var.b);
        u13 u13Var = lk2Var.a;
        if (u13Var != null) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            u13Var.b(new jk2(u13Var, taskCompletionSource, taskCompletionSource, new jk2(lk2Var, taskCompletionSource, ah2Var, taskCompletionSource)));
        } else {
            Object[] objArr = {"Play Store not found."};
            if (Log.isLoggable("PlayCore", 6)) {
                a((String) e7Var.a, "error: %s", objArr);
            }
        }
    }

    public final void a(ox oxVar) {
        fep fepVar = (fep) this.a;
        fepVar.b$1();
        ((qx) fepVar.b).a(oxVar);
    }

    public final void a(ImageView.ScaleType scaleType) {
        NativeAdView nativeAdView = (NativeAdView) this.a;
        int i = NativeAdView.c;
        ew1 ew1Var = nativeAdView.a;
        ew1Var.getClass();
        synchronized (ew1Var) {
            if (ew1Var.d.get()) {
                return;
            }
            ew1Var.f = scaleType;
        }
    }

    public final void a(Object obj) {
        synchronized (this) {
            this.a = obj;
        }
    }

    public final void a(Object obj, FileOutputStream fileOutputStream) {
        ((g) obj).a(fileOutputStream);
    }

    public final void a(String str, tso tsoVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.a;
        if (tsoVar != null) {
            linkedHashMap.put(str, tsoVar);
        } else {
            t3p.q("provider");
        }
    }

    public final void a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            a((String) this.a, str, objArr);
        }
    }

    public final void a(MessageDigest[] messageDigestArr, long j, int i) {
        ByteBuffer byteBufferSlice;
        synchronized (((ByteBuffer) this.a)) {
            int i2 = (int) j;
            ((ByteBuffer) this.a).position(i2);
            ((ByteBuffer) this.a).limit(i2 + i);
            byteBufferSlice = ((ByteBuffer) this.a).slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }

    public final /* synthetic */ vj0 b() {
        return new vj0(((fep) this.a).c());
    }

    public final void b(int i, pio pioVar, Object obj) {
        g gVar = (g) obj;
        ov ovVar = (ov) this.a;
        ovVar.g(i, 2);
        ovVar.m(gVar.a(pioVar));
        pioVar.a((Object) gVar, this);
    }

    public final void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            a((String) this.a, str, objArr);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // defpackage.wdp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(mt5 r9) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.e7.d(mt5):java.lang.Object");
    }

    @Override // defpackage.d2i
    public final int getAmount() {
        return ((RewardItem) this.a).getAmount();
    }

    @Override // defpackage.d2i
    public final String getType() {
        return ((RewardItem) this.a).getType();
    }

    @Override // defpackage.qr9
    public final void onFailure(Throwable th) {
        iao iaoVar = (iao) this.a;
        iaoVar.a(th);
        iaoVar.a();
    }

    public final void onPostMessage(WebView webView, jun junVar, Uri uri, boolean z, xmb xmbVar) throws JSONException {
        ji jiVar = (ji) this.a;
        try {
            JSONObject jSONObject = new JSONObject(junVar.b());
            ((cfp) jiVar.b).a(jSONObject.getString("method"), jSONObject.getJSONObject("data"));
        } catch (JSONException unused) {
        }
    }

    public final void onSuccess(WebViewStartUpResult webViewStartUpResult) {
        cp3 cp3Var = (cp3) this.a;
        if (cp3Var != null) {
            AtomicBoolean atomicBoolean = ho3.a;
            go3 go3Var = new go3(webViewStartUpResult);
            nh4 nh4Var = cp3Var.a;
            p0i p0iVar = t0i.b;
            nh4Var.resumeWith(new hv0(go3Var));
        }
    }

    @Override // defpackage.qr9
    public final void onSuccess(Object obj) {
        ((iao) this.a).a();
    }

    public final long size() {
        return ((ByteBuffer) this.a).capacity();
    }
}
