package defpackage;

import J.N;
import android.app.ActivityManager;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.inputmethod.BaseInputConnection;
import androidx.camera.camera2.compat.quirk.UltraWideFlashCaptureUnderexposureQuirk;
import com.leanplum.internal.Constants;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.aiassistant.db.TopAiActivityDatabase_Impl;
import com.opera.android.tabui2.screenshots.TabScreenshotEntryDatabase_Impl;
import com.opera.android.translate_web_pages.TranslateWebPagesDatabase_Impl;
import com.opera.android.uninstall.UninstallActivity;
import java.net.URL;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class p7l implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p7l(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ p7l(mhk mhkVar, ve4 ve4Var) {
        this.a = (byte) 9;
        this.b = ve4Var;
    }

    public final Object invoke() {
        String host;
        int largeMemoryClass;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new f58((TabScreenshotEntryDatabase_Impl) obj);
            case 1:
                u8l u8lVar = (u8l) obj;
                String str = u8lVar.b;
                return !z5i.a0(str) ? (String) u8lVar.c.get() : str;
            case 2:
                vel velVar = (vel) obj;
                velVar.C = null;
                aoh.j(velVar);
                nb6.F(velVar);
                c26.y(velVar);
                return Boolean.TRUE;
            case 3:
                PendingIntent actionIntent = ((RemoteAction) obj).getActionIntent();
                if (Build.VERSION.SDK_INT >= 34) {
                    g8.K(actionIntent);
                } else {
                    actionIntent.send();
                }
                return Unit.a;
            case 4:
                agl aglVar = (agl) obj;
                return ((b8e) aglVar).n ? j7h.d(aglVar) : kfl.b;
            case 5:
                return new BaseInputConnection(((cjl) obj).a, false);
            case 6:
                return new ybb(((ccb) obj).c());
            case 7:
                String str2 = ((dkl) obj).a;
                String[] strArr = wqm.a;
                URL urlE0 = a26.e0(str2);
                if (urlE0 == null || (host = urlE0.getHost()) == null) {
                    return null;
                }
                String str3 = (String) N.MnEPjazD(host, false);
                if (str3.length() > 0) {
                    return str3;
                }
                return null;
            case 8:
                hkl hklVar = (hkl) obj;
                hklVar.y = null;
                aoh.j(hklVar);
                nb6.F(hklVar);
                c26.y(hklVar);
                return Boolean.TRUE;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                HandlerThread handlerThread = new HandlerThread("CXCP-Camera-H", -3);
                handlerThread.start();
                ((ve4) obj).a(te4.c, new cbl((Object) handlerThread, (byte) 7));
                return new Handler(handlerThread.getLooper());
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return (Handler) ((p7l) obj).invoke();
            case 11:
                return (Executor) ((eek) obj).invoke();
            case 12:
                knl knlVar = (knl) obj;
                knlVar.c = null;
                knlVar.c();
                return Unit.a;
            case 13:
                ((kol) obj).c();
                return Unit.a;
            case 14:
                return (qjn) ((BrowserActivity) ((yqa) obj).c).z0.get();
            case 15:
                ((asl) obj).N.invoke(Boolean.valueOf(!r5.M));
                return Unit.a;
            case 16:
                ((ctl) obj).c();
                return Unit.a;
            case 17:
                return new mul((TopAiActivityDatabase_Impl) obj);
            case SizeUtil.textSize0_1 /* 18 */:
                ((pvl) obj).E();
                return Unit.a;
            case 19:
                ((uvl) obj).a();
                return Unit.a;
            case SizeUtil.textSize0 /* 20 */:
                return (wul) ((mt3) obj).invoke();
            case 21:
                return new o3m((TranslateWebPagesDatabase_Impl) obj);
            case SizeUtil.textSize1 /* 22 */:
                ((r4m) obj).f0();
                return Unit.a;
            case 23:
                Context context = (Context) ((ini) obj).a(uqh.a(Context.class), (rhk) null, (Function0) null);
                bp bpVar = new bp((byte) 23);
                try {
                    ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityManager.class);
                    largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                } catch (Exception unused) {
                    largeMemoryClass = Constants.Crypt.KEY_LENGTH;
                }
                return new amh(new qq8((long) (0.25d * (largeMemoryClass << 20)), bpVar), bpVar);
            case SizeUtil.textSize2 /* 24 */:
                ejm ejmVar = ((gjm) obj).e;
                Handler handler = ejmVar.s;
                handler.removeCallbacks(ejmVar);
                handler.post(ejmVar);
                return Unit.a;
            case 25:
                int i = UninstallActivity.e;
                ((UninstallActivity) obj).finish();
                return Unit.a;
            case 26:
                return ((hlm) obj).b.getSharedPreferences("usp", 0);
            case 27:
                rlm rlmVar = (rlm) obj;
                rlmVar.g = false;
                pde pdeVar = rlmVar.c;
                pdeVar.r(rlmVar.f(rlm.g((nlm) pdeVar.g()), v08.a));
                return Unit.a;
            case 28:
                return Boolean.valueOf(((gf4) ((plk) obj).a).a().a(UltraWideFlashCaptureUnderexposureQuirk.class));
            default:
                Unit unit = Unit.a;
                ((w0n) obj).i.setValue(unit);
                return unit;
        }
    }
}
