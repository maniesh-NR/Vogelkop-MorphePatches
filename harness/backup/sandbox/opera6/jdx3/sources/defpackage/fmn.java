package defpackage;

import ads_mobile_sdk.ew1;
import ads_mobile_sdk.g43;
import ads_mobile_sdk.tn3;
import ads_mobile_sdk.vn3;
import ads_mobile_sdk.wt0;
import ads_mobile_sdk.xk2;
import ads_mobile_sdk.xu0;
import ads_mobile_sdk.z6;
import android.app.WallpaperManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.widget.FrameLayout;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewCompat$WebViewStartUpCallback;
import androidx.webkit.WebViewStartUpResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.leanplum.utils.SizeUtil;
import com.opera.android.history.g;
import com.opera.api.Callback;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Semaphore;
import kotlin.coroutines.CoroutineContext;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class fmn implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fmn(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ fmn(wci wciVar, File file, int i) {
        this.a = (byte) 9;
        this.b = wciVar;
        this.c = file;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: e22 */
    @Override // java.lang.Runnable
    public final void run() throws JSONException, e22, SecurityException, IllegalArgumentException {
        Context context;
        lio lioVar;
        String strB;
        qio mioVar;
        iu0 iu0Var = null;
        int i = 0;
        switch (this.a) {
            case 0:
                jmn jmnVar = (jmn) this.b;
                kkn kknVar = (kkn) this.c;
                Bitmap bitmap = jmnVar.v;
                onn onnVar = jmnVar.s;
                try {
                    int iP = r9n.P(jmnVar.requireContext(), bitmap, kknVar, jmnVar.A.g(new Rect(0, 0, r9n.o(jmnVar.requireActivity()), r9n.m(jmnVar.requireActivity())), bitmap.getWidth(), bitmap.getHeight()), ((zjn) jmnVar.A.a).a > 1.0f);
                    if (iP <= 0) {
                        jmnVar.L0();
                        return;
                    }
                    int iOrdinal = kknVar.ordinal();
                    if (iOrdinal == 0) {
                        ((SharedPreferences) onnVar.b.get()).edit().putInt("home_screen_wallpaper_id", iP).apply();
                    } else if (iOrdinal == 1) {
                        ((SharedPreferences) onnVar.b.get()).edit().putInt("lock_screen_wallpaper_id", iP).apply();
                    } else if (iOrdinal == 2) {
                        WallpaperManager wallpaperManager = WallpaperManager.getInstance(jmnVar.requireContext());
                        int wallpaperId = wallpaperManager.getWallpaperId(1);
                        int wallpaperId2 = wallpaperManager.getWallpaperId(2);
                        ((SharedPreferences) onnVar.b.get()).edit().putInt("home_screen_wallpaper_id", wallpaperId).apply();
                        ((SharedPreferences) onnVar.b.get()).edit().putInt("lock_screen_wallpaper_id", wallpaperId2).apply();
                    }
                    aln alnVar = jmnVar.x;
                    int iH0 = jmnVar.H0();
                    int iOrdinal2 = kknVar.ordinal();
                    if (iOrdinal2 == 0) {
                        iu0Var = iu0.d;
                    } else if (iOrdinal2 == 1) {
                        iu0Var = iu0.c;
                    } else if (iOrdinal2 == 2) {
                        iu0Var = iu0.e;
                    }
                    onnVar.c(alnVar, iH0, iu0Var);
                    onnVar.a();
                    return;
                } catch (Exception unused) {
                    jmnVar.L0();
                    return;
                }
            case 1:
                jmn jmnVar2 = (jmn) this.b;
                ((w0a) this.c).b(hjm.b, 3);
                jmnVar2.N = false;
                if (jmnVar2.O) {
                    jmnVar2.O = false;
                    jmnVar2.g0();
                    return;
                }
                return;
            case 2:
                ztn ztnVar = (ztn) this.b;
                wtn wtnVar = (wtn) this.c;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = wtnVar.f;
                int size = arrayList2.size();
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    arrayList.add(Long.valueOf(((vtn) obj).c()));
                }
                ztnVar.L(arrayList);
                return;
            case 3:
                ((ztn) this.b).L(j95.j(new Long[]{Long.valueOf(((g) this.c).b.getId())}));
                return;
            case 4:
                WebViewCompat$WebViewStartUpCallback webViewCompat$WebViewStartUpCallback = (WebViewCompat$WebViewStartUpCallback) this.b;
                WebViewStartUpResult webViewStartUpResult = (WebViewStartUpResult) this.c;
                Uri uri = WebViewCompat.a;
                webViewCompat$WebViewStartUpCallback.onSuccess(webViewStartUpResult);
                return;
            case 5:
                Callback callback = (Callback) this.b;
                wyn wynVar = (wyn) this.c;
                String strB2 = tz5.b();
                String str = ((cj9) wynVar.a.i()).a;
                if (str == null) {
                    str = "";
                }
                callback.run(new vyn(strB2, str, Locale.getDefault().getLanguage(), (String) wynVar.b.get(), (String) wynVar.c.get()));
                return;
            case 6:
                w7o w7oVar = (w7o) this.b;
                tcc tccVar = (tcc) this.c;
                if (w7oVar.c) {
                    return;
                }
                w7oVar.d = tccVar;
                tccVar.a(w7oVar);
                return;
            case 7:
                aco acoVar = (aco) this.b;
                w7j w7jVar = (w7j) this.c;
                acoVar.m(null, true);
                Context context2 = acoVar.a;
                if (!w7jVar.h(context2)) {
                    acoVar.p(new q6("cannot load implementation"));
                    return;
                }
                gfn gfnVar = (gfn) mzg.j(acoVar.k.b, "createStateBuilder", new Class[]{Context.class, ffn.class, zv9.class, dx5.class}, new Object[]{context2, acoVar.b, acoVar.c, acoVar.d});
                acoVar.e = gfnVar;
                int i2 = acoVar.f;
                if (i2 != 0) {
                    gfnVar.c(i2);
                    acoVar.f = 0;
                }
                zbo zboVar = acoVar.g;
                if (zboVar != null) {
                    acoVar.e.a(zboVar.c, zboVar.a, zboVar.b);
                    acoVar.g = null;
                }
                if (acoVar.i) {
                    acoVar.e.setEnabled(true);
                    acoVar.i = false;
                    return;
                }
                return;
            case 8:
                r22 r22Var = (r22) this.b;
                ivo ivoVar = (ivo) this.c;
                wtm wtmVar = (wtm) r22Var.d;
                pro proVar = (pro) r22Var.a;
                kgo kgoVar = new kgo(ivoVar, z ? (byte) 1 : (byte) 0);
                rgh rghVar = (rgh) wtmVar.c;
                vdi vdiVar = new vdi(wtmVar, proVar, kgoVar, (byte) 17);
                oxo oxoVar = oxo.a;
                na2.B(w2p.a, (CoroutineContext) null, (rx5) null, new axo(proVar.b, proVar.c, null, proVar.d, new ako(vdiVar, new ivg((qro) rghVar.b, proVar, (byte) 16)), (Context) rghVar.a, proVar.f, proVar.e, proVar.a), 3);
                return;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                wci wciVar = (wci) this.b;
                File file = (File) this.c;
                wciVar.n(file.getAbsolutePath(), false);
                file.getAbsolutePath();
                return;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                iro iroVar = (iro) this.b;
                byte[] bArr = (byte[]) this.c;
                yhp yhpVar = (yhp) iroVar.b.b;
                aip aipVar = yhpVar.a;
                aipVar.j = bArr;
                if (bArr == null) {
                    aipVar.e = 6;
                    aipVar.i++;
                } else {
                    aipVar.e = 1;
                    SystemClock.elapsedRealtime();
                    int length = yhpVar.a.j.length;
                }
                yhpVar.a();
                return;
            case 11:
                hoo hooVar = (hoo) this.b;
                hooVar.d.d((qio) this.c);
                hooVar.c.removeCallbacks(hooVar.b);
                return;
            case 12:
                iro iroVar2 = (iro) this.b;
                IOException iOException = (IOException) this.c;
                rii riiVar = iroVar2.b;
                iOException.getMessage();
                yhp yhpVar2 = (yhp) riiVar.b;
                aip aipVar2 = yhpVar2.a;
                aipVar2.e = 7;
                aipVar2.i++;
                yhpVar2.a();
                return;
            case 13:
                String str2 = (String) this.b;
                roj rojVar = (roj) this.c;
                File fileC = sjo.c(1, str2);
                if (fileC != null) {
                    gxo.c(new fmn((Object) rojVar, (Object) fileC, (byte) 14));
                    return;
                }
                return;
            case 14:
                ((roj) this.b).l((File) this.c);
                return;
            case 15:
                ev4 ev4Var = (ev4) this.b;
                jro jroVar = (jro) this.c;
                pjo pjoVar = (pjo) ev4Var.f;
                Semaphore semaphore = pjoVar.c;
                String str3 = jroVar.b;
                File file2 = jroVar.f;
                if (file2 != null) {
                    if (file2.exists()) {
                        jroVar.e.n(file2.getAbsolutePath(), true);
                        return;
                    }
                    try {
                        semaphore.acquire();
                        pjoVar.b(new URL(str3).openConnection(), jroVar, file2);
                    } catch (Throwable unused2) {
                    }
                    semaphore.release();
                    return;
                }
                return;
            case 16:
                ew1 ew1Var = (ew1) this.b;
                String str4 = (String) this.c;
                synchronized (ew1Var) {
                    if (ew1Var.d.get()) {
                        return;
                    }
                    FrameLayout frameLayout = ew1Var.c;
                    if (frameLayout != null && (context = frameLayout.getContext()) != null) {
                        FrameLayout frameLayout2 = new FrameLayout(context);
                        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        xug.d(context, frameLayout2, str4);
                        frameLayout.addView(frameLayout2);
                    }
                    return;
                }
            case 17:
                ((g94) this.b).l(this.c);
                return;
            case SizeUtil.textSize0_1 /* 18 */:
                g43 g43Var = (g43) this.b;
                xk2 xk2Var = (xk2) this.c;
                vn3 vn3Var = g43Var.a;
                vn3Var.getClass();
                z6 z6Var = vn3Var.c;
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    vn3Var.a(vn3Var.a(xk2Var));
                    z6Var.a.a(3000, System.currentTimeMillis() - jCurrentTimeMillis, (Throwable) null, (String) null);
                    TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                    taskCompletionSource.setResult(Boolean.TRUE);
                    taskCompletionSource.getTask();
                    g43Var.f.set("2.945319811." + xk2Var.a.r());
                    return;
                } catch (Exception e) {
                    z6Var.a(4010, System.currentTimeMillis() - jCurrentTimeMillis, e);
                    throw new e22(2);
                } catch (tn3 e2) {
                    z6Var.a(e2.a, System.currentTimeMillis() - jCurrentTimeMillis, e2);
                    throw new e22(2);
                }
            case 19:
                String str5 = (String) this.b;
                g94 g94Var = (g94) this.c;
                File fileT = vtp.t(str5);
                if (fileT == null || !fileT.exists()) {
                    lioVar = new lio(new zno(bm.PERSISTENT_STORAGE_EMPTY));
                } else {
                    synchronized (vtp.l) {
                        strB = mzg.b(fileT);
                    }
                    if (!TextUtils.isEmpty(strB)) {
                        try {
                            JSONObject jSONObject = new JSONObject(new String(Base64.decode(strB, 0), StandardCharsets.UTF_8));
                            long jOptLong = jSONObject.optLong("endTime");
                            long jOptLong2 = jSONObject.optLong("expireTimestamp");
                            if (sjo.o() >= (jOptLong <= 0 ? jOptLong2 : jOptLong)) {
                                fileT.delete();
                                sjo.n().remove(vtp.r(str5)).apply();
                                sjo.n().remove(vtp.k(str5)).apply();
                                mioVar = new lio(new zno(bm.PERSISTENT_STORAGE_EXPIRED));
                            } else {
                                dro droVar = dro.c;
                                lho lhoVarB = poo.b(jSONObject, droVar);
                                if (lhoVarB == null) {
                                    mioVar = new lio(new zno(bm.PERSISTENT_STORAGE_PARSING_ERROR));
                                } else {
                                    String string = jSONObject.getString("placementId");
                                    w06 w06Var = lhoVarB.a.a;
                                    w06Var.getClass();
                                    if (w06Var instanceof n06) {
                                        List listSingletonList = Collections.singletonList(lhoVarB);
                                        pqo pqoVar = new pqo();
                                        pqoVar.e = (byte) 7;
                                        pqoVar.f = true;
                                        pqoVar.a = string;
                                        pqoVar.d = droVar;
                                        mioVar = new mio(new vho(w06Var, listSingletonList, jOptLong2, jOptLong, new pqo(pqoVar), null));
                                    } else {
                                        mioVar = new lio(new zno(bm.PERSISTENT_STORAGE_INTERNAL_ERROR));
                                        w06Var.name();
                                    }
                                }
                            }
                            vtp.m(g94Var, mioVar);
                            return;
                        } catch (JSONException e3) {
                            lio lioVar2 = new lio(new zno(bm.PERSISTENT_STORAGE_PARSING_ERROR));
                            e3.getMessage();
                            vtp.m(g94Var, lioVar2);
                            return;
                        }
                    }
                    lioVar = new lio(new zno(bm.PERSISTENT_STORAGE_EMPTY));
                }
                vtp.m(g94Var, lioVar);
                return;
            case SizeUtil.textSize0 /* 20 */:
                ((g94) this.b).l((qio) this.c);
                return;
            case 21:
                Integer num = (Integer) this.b;
                Runnable runnable = (Runnable) this.c;
                xu0.a(new qqo(num, (byte) 4));
                Process.setThreadPriority(num.intValue());
                runnable.run();
                return;
            case SizeUtil.textSize1 /* 22 */:
                i7c i7cVar = (i7c) this.b;
                Runnable runnable2 = (Runnable) this.c;
                i7cVar.a();
                if (runnable2 != null) {
                    gxo.c(runnable2);
                    return;
                }
                return;
            default:
                wt0 wt0Var = (wt0) this.b;
                wt0Var.c.execute(new ukp(wt0Var, (c5j) this.c, 1, 0L, (byte) 1));
                return;
        }
    }
}
