package defpackage;

import ads_mobile_sdk.ax0;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.Trace;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.Surface;
import com.appsflyer.internal.o;
import com.google.android.gms.internal.mlkit_common.zzss;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.g;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl;
import org.chromium.content.browser.webcontents.WebContentsImpl;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class dvj implements tnk, igd, ybf, o3n, vbn, ktn, g, dnp, ee5 {
    public final /* synthetic */ byte a;

    public /* synthetic */ dvj(byte b) {
        this.a = b;
    }

    public static Uri a(Uri uri, String str) {
        String string = uri.toString();
        int iL = StringsKt.L(string, "&adurl", 0, false, 6);
        if (iL == -1) {
            iL = StringsKt.L(string, "?adurl=", 0, false, 6);
        }
        if (iL == -1) {
            return uri.buildUpon().appendQueryParameter("ms", str).build();
        }
        StringBuilder sb = new StringBuilder(str.length() + string.length() + 2 + 2);
        int i = iL + 1;
        sb.append(string.substring(0, i));
        sb.append("ms=");
        sb.append(str);
        sb.append("&");
        sb.append(string.substring(i));
        return Uri.parse(sb.toString());
    }

    public static String o(Context context) throws NoSuchAlgorithmException {
        String string;
        AtomicReference atomicReference = ax0.g;
        String str = (String) atomicReference.get();
        if (str != null) {
            return str;
        }
        String strQ = "B3EEABB8EE11C2BE770B684D95219ECB";
        if (!jym.c() && (string = Settings.Secure.getString(context.getContentResolver(), "android_id")) != null && string.length() != 0) {
            strQ = q(string);
        }
        atomicReference.set(strQ);
        return (String) atomicReference.get();
    }

    public static String p(String str, String str2) {
        tcd tcdVarA;
        ucd ucdVarD = Regex.d(new Regex(str), str2);
        if (ucdVarD == null || (tcdVarA = ucdVarD.a()) == null) {
            return null;
        }
        a4 a4Var = (a4) tcdVarA;
        if (a4Var.d() < 2) {
            return null;
        }
        int iD = a4Var.d();
        for (int i = 1; i < iD; i++) {
            tcd tcdVar = tcdVarA;
            if (!StringsKt.N((CharSequence) tcdVar.get(i))) {
                return (String) tcdVar.get(i);
            }
        }
        return null;
    }

    public static String q(String str) throws NoSuchAlgorithmException {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(str.getBytes(Charsets.UTF_8));
                return String.format(Locale.US, "%032X", Arrays.copyOf(new Object[]{new BigInteger(1, messageDigest.digest())}, 1));
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static MediaCodec s(igi igiVar) throws IOException {
        String str = ((ogd) igiVar.b).a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return mediaCodecCreateByCodecName;
    }

    @Override // defpackage.tnk
    public final boolean b(oj9 oj9Var) {
        return false;
    }

    @Override // defpackage.ybf
    public final int c() {
        return 0;
    }

    public final Object d(IBinder iBinder) {
        int i = ibp.j;
        if (iBinder == null) {
            return null;
        }
        dcp dcpVarQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
        return dcpVarQueryLocalInterface instanceof dcp ? dcpVarQueryLocalInterface : new gap(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService", (byte) 0);
    }

    public final void destroy() {
    }

    public final Object e(WebContentsImpl webContentsImpl) {
        return new WebContentsAccessibilityImpl(new wci(webContentsImpl));
    }

    @Override // defpackage.ybf
    public final int f() {
        return 0;
    }

    @Override // defpackage.igd
    public final jgd g(igi igiVar) {
        MediaCodec mediaCodecS = null;
        try {
            mediaCodecS = s(igiVar);
            Trace.beginSection("configureCodec");
            Surface surface = (Surface) igiVar.e;
            mediaCodecS.configure((MediaFormat) igiVar.c, surface, (MediaCrypto) igiVar.f, (surface == null && ((ogd) igiVar.b).h && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodecS.start();
            Trace.endSection();
            return new bzk(mediaCodecS, (r3d) igiVar.g);
        } catch (IOException | RuntimeException e) {
            if (mediaCodecS != null) {
                mediaCodecS.release();
            }
            throw e;
        }
    }

    @Override // defpackage.o3n
    public final void h(MediaMetadataRetriever mediaMetadataRetriever, Object obj) throws IllegalArgumentException {
        mediaMetadataRetriever.setDataSource(new n3n((ByteBuffer) obj));
    }

    public final boolean i(ndc ndcVar, ode odeVar) {
        return false;
    }

    public final o2g j() {
        return null;
    }

    @Override // defpackage.tnk
    public final vnk k(oj9 oj9Var) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // defpackage.tnk
    public final int l(oj9 oj9Var) {
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(long r5, kotlin.jvm.functions.Function1 r7, nt5 r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.vw0
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.vw0 r0 = (ads_mobile_sdk.vw0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ads_mobile_sdk.vw0 r0 = new ads_mobile_sdk.vw0
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r4 = r0.a
            px5 r8 = px5.a
            int r1 = r0.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            defpackage.ybh.y(r4)     // Catch: kql -> L46
            goto L40
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            return r2
        L2e:
            defpackage.ybh.y(r4)
            wc2 r4 = new wc2     // Catch: kql -> L46
            r1 = 6
            r4.<init>(r7, r2, r1)     // Catch: kql -> L46
            r0.c = r3     // Catch: kql -> L46
            java.lang.Object r4 = uyg.v(r5, r4, r0)     // Catch: kql -> L46
            if (r4 != r8) goto L40
            return r8
        L40:
            ads_mobile_sdk.hv0 r5 = new ads_mobile_sdk.hv0     // Catch: kql -> L46
            r5.<init>(r4)     // Catch: kql -> L46
            return r5
        L46:
            r4 = move-exception
            ads_mobile_sdk.iv0 r5 = new ads_mobile_sdk.iv0
            r5.<init>(r4, r3)
            ads_mobile_sdk.rg3 r6 = ads_mobile_sdk.hh3.a()
            ads_mobile_sdk.ub2 r7 = r6.e()
            r8 = 0
            r7.m = r8
            r6.a(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvj.m(long, kotlin.jvm.functions.Function1, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(ads_mobile_sdk.td1 r5, nt5 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.bg1
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.bg1 r0 = (ads_mobile_sdk.bg1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.bg1 r0 = new ads_mobile_sdk.bg1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.b
            px5 r6 = px5.a
            int r1 = r0.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            ads_mobile_sdk.td1 r5 = r0.a
            defpackage.ybh.y(r4)
            goto L79
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            return r2
        L30:
            defpackage.ybh.y(r4)
            ads_mobile_sdk.ru0 r4 = defpackage.xgp.a
            r4.getClass()
            xgp r4 = ads_mobile_sdk.ru0.a()
            ads_mobile_sdk.sb0 r4 = (ads_mobile_sdk.sb0) r4
            tso r4 = r4.w
            java.lang.Object r4 = r4.get()
            kotlin.coroutines.CoroutineContext r4 = (kotlin.coroutines.CoroutineContext) r4
            r0.a = r5
            r0.d = r3
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Looper r3 = android.os.Looper.myLooper()
            boolean r1 = kotlin.jvm.internal.Intrinsics.a(r1, r3)
            if (r1 == 0) goto L6b
            ads_mobile_sdk.fv2 r4 = new ads_mobile_sdk.fv2
            fq r0 = r5.l()
            android.view.View r1 = r5.m
            android.content.Context r2 = r1.getContext()
            r4.<init>(r2, r0)
            r4.addView(r1)
            goto L76
        L6b:
            u6k r1 = new u6k
            r3 = 14
            r1.<init>(r3, r2, r5)
            java.lang.Object r4 = defpackage.na2.Z(r4, r1, r0)
        L76:
            if (r4 != r6) goto L79
            return r6
        L79:
            ads_mobile_sdk.fv2 r4 = (ads_mobile_sdk.fv2) r4
            gie r6 = new gie
            ads_mobile_sdk.tl r0 = new ads_mobile_sdk.tl
            r0.<init>(r5, r4)
            r6.<init>(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvj.n(ads_mobile_sdk.td1, nt5):java.lang.Object");
    }

    public final Object r(x79 x79Var) {
        zzss.zzb("common");
        return new psp();
    }

    public final Object t(orb orbVar) throws JSONException {
        switch (this.a) {
            case 0:
                String strM = orbVar.m("id", "");
                JSONObject jSONObject = orbVar.a;
                if (TextUtils.isEmpty(strM)) {
                    o.a("id can't be empty for a user");
                    break;
                } else {
                    String strM2 = orbVar.m("name", "");
                    orbVar.m("description", "");
                    orbVar.m("portrait", "");
                    orbVar.m("original_portrait", "");
                    orbVar.g("points");
                    orbVar.g("video_points");
                    orbVar.g("follower_count");
                    orbVar.g("follow_flag");
                    orbVar.g("following_count");
                    orb orbVarI = orbVar.i("recommend_reason");
                    if ((orbVarI != null ? orbVarI.m("content", "") : "").isEmpty()) {
                        orbVar.m("reason", "");
                    }
                    orbVar.m("infra_feedback", "");
                    orbVar.g("role");
                    jSONObject.optInt("type", 0);
                    orbVar.m("contact_id", (String) null);
                    orb orbVarI2 = orbVar.i("phone");
                    if (orbVarI2 != null) {
                        orbVarI2.m("number", "");
                        orbVarI2.m("country_prefix", (String) null);
                        orbVarI2.m("national_number", (String) null);
                    }
                    jSONObject.optInt("recommend_type", -1);
                    ArrayList arrayList = new ArrayList();
                    vpb vpbVarH = orbVar.h("constituents");
                    if (vpbVarH != null) {
                        for (int i = 0; i < vpbVarH.a.length(); i++) {
                            arrayList.add(vpbVarH.d(i));
                        }
                    }
                    orbVar.f("invited");
                    orbVar.g("best_num");
                    orbVar.g("delta_point");
                    orbVar.g("posts_num");
                    orbVar.f("enable_notify");
                    orbVar.f("anonymous");
                    jSONObject.optInt("admin_type", -1);
                    evj evjVar = new evj(strM2, arrayList);
                    evjVar.b(orbVar);
                    break;
                }
            default:
                orbVar.m("id", "");
                if (orbVar.m("name", "").isEmpty()) {
                    o.a("name can't be empty for a Tag");
                    break;
                } else {
                    orbVar.m("type", "");
                    orbVar.m("board_id", "");
                    orb orbVarI3 = orbVar.i("board");
                    if (orbVarI3 != null) {
                        tk3.e.m(orbVarI3);
                    }
                    orb orbVarI4 = orbVar.i("cover");
                    if (orbVarI4 != null) {
                        int iG = orbVarI4.g("width");
                        int iG2 = orbVarI4.g("height");
                        if (iG == 0 || iG2 == 0) {
                            o.a("width & height can not be null on Thumbnail.");
                            break;
                        } else {
                            orbVarI4.m("url", "");
                            orbVarI4.m("preview_url", "");
                            orbVarI4.m("format", "");
                            orbVarI4.m("id", "");
                        }
                    }
                    orb orbVarI5 = orbVar.i("thumbnail");
                    if (orbVarI5 != null) {
                        int iG3 = orbVarI5.g("width");
                        int iG4 = orbVarI5.g("height");
                        if (iG3 == 0 || iG4 == 0) {
                            o.a("width & height can not be null on Thumbnail.");
                            break;
                        } else {
                            orbVarI5.m("url", "");
                            orbVarI5.m("preview_url", "");
                            orbVarI5.m("format", "");
                            orbVarI5.m("id", "");
                        }
                    }
                    orbVar.g("post_count");
                    orbVar.j("create_time");
                    gbl gblVar = new gbl();
                    gblVar.b(orbVar);
                    break;
                }
        }
        return null;
    }

    public final boolean u(Object obj, File file, File file2) {
        return true;
    }
}
