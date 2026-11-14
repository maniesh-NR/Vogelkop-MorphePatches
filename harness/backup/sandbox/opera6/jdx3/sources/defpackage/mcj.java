package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.viewpager.widget.ViewPager;
import com.appsflyer.internal.j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.opera.ad.interstitial.AdActivity;
import com.opera.android.settings.SystemSettings;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final class mcj implements oeb, ybf, fd2, kl9, bcf, mmn, ylo, a2i {
    public final Object a;
    public Object b;

    public mcj(Context context, umi umiVar) {
        this.b = new nrl((byte) 26);
        this.a = w1h.l(context, umiVar, "ps", new bg1[]{new b94(umiVar, new zzh(this, (byte) 11), (byte) 0)});
    }

    public mcj(Window window) {
        this.a = new i7f();
        this.b = window;
    }

    public mcj(ViewPager viewPager) {
        this.b = viewPager;
        this.a = new Rect();
    }

    public mcj(AdActivity adActivity, int i) {
        Dialog dialog = new Dialog(adActivity, 2132082715);
        this.a = dialog;
        ViewGroup viewGroup = (ViewGroup) adActivity.getLayoutInflater().inflate(i, (ViewGroup) null, false);
        this.b = viewGroup;
        dialog.setContentView(viewGroup);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setGravity(48);
            window.setLayout(-1, -2);
            window.setStatusBarColor(adActivity.getResources().getColor(2131099709));
        }
    }

    public mcj(ctp ctpVar) {
        this.b = new Handler(Looper.getMainLooper());
        this.a = ctpVar;
    }

    public mcj(h61 h61Var, vlo vloVar, rgh rghVar) {
        this.a = h61Var;
        this.b = vloVar;
    }

    public /* synthetic */ mcj(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ mcj(Object obj, Object obj2, boolean z) {
        this.b = obj;
        this.a = obj2;
    }

    public mcj(nak nakVar, nak nakVar2, List list, boolean z) {
        xd6 ya9Var;
        this.a = list;
        if (z) {
            h58 h58Var = nsl.l;
            ArrayList arrayList = new ArrayList(k95.o(h58Var, 10));
            w4 w4VarE = sko.e(h58Var, h58Var);
            while (w4VarE.hasNext()) {
                arrayList.add(new osl((nsl) w4VarE.next(), false, false));
            }
            ya9Var = new xd6(arrayList, (byte) 7);
        } else {
            ya9Var = new ya9(nakVar, nakVar2, new x11((byte) 10, (mt5) null, this), (byte) 0);
        }
        this.b = ya9Var;
    }

    public mcj(WebContents webContents) {
        this.a = webContents;
        this.b = webContents.k0();
    }

    public static BigDecimal g(BigDecimal bigDecimal) {
        return u(bigDecimal.multiply(BigDecimal.valueOf(0.017453292519943295d)));
    }

    public static Calendar i(BigDecimal bigDecimal, Calendar calendar) throws NumberFormatException {
        if (bigDecimal == null) {
            return null;
        }
        Calendar calendar2 = (Calendar) calendar.clone();
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        if (bigDecimal.compareTo(bigDecimal2) == -1) {
            bigDecimal = bigDecimal.add(BigDecimal.valueOf(24.0d));
            calendar2.add(11, -24);
        }
        String[] strArrSplit = bigDecimal.toPlainString().split("\\.");
        int i = Integer.parseInt(strArrSplit[0]);
        BigDecimal scale = new BigDecimal("0." + strArrSplit[1]).multiply(BigDecimal.valueOf(60L)).setScale(0, RoundingMode.HALF_EVEN);
        if (scale.intValue() == 60) {
            i++;
        } else {
            bigDecimal2 = scale;
        }
        if (i == 24) {
            i = 0;
        }
        calendar2.set(11, i);
        calendar2.set(12, bigDecimal2.intValue());
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        calendar2.setTimeZone(calendar.getTimeZone());
        return calendar2;
    }

    public static boolean s(Window window, boolean z) {
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        int i = z ? systemUiVisibility | 16 : systemUiVisibility & (-17);
        if (systemUiVisibility == i) {
            return false;
        }
        window.getDecorView().setSystemUiVisibility(i);
        return true;
    }

    public static BigDecimal u(BigDecimal bigDecimal) {
        return bigDecimal.setScale(4, RoundingMode.HALF_EVEN);
    }

    public final Object a() {
        return new olo(((h61) this.a).a, (igp) ((vlo) this.b).a(), new yfp((byte) 0));
    }

    @Override // defpackage.fd2
    public final Object b(Object obj) {
        HashMap map = new HashMap();
        map.put("show_password", Boolean.valueOf(Settings.System.getInt(((SystemSettings) this.b).a, "show_password", 1) == 1));
        return map;
    }

    public final int c() {
        return ((n3k) this.a).getAsInt();
    }

    @Override // defpackage.mmn
    public final void d(ilm ilmVar) {
        ((qln) ((s14) this.b).c).f.k((String) this.a, 0, new ilm(ilmVar, (byte) 14));
    }

    public final BigDecimal e(xco xcoVar, Calendar calendar, boolean z) {
        pad padVar = (pad) this.a;
        TimeZone timeZone = (TimeZone) this.b;
        calendar.setTimeZone(timeZone);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(z ? 6 : 18);
        BigDecimal bigDecimal = (BigDecimal) padVar.c;
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(15L);
        RoundingMode roundingMode = RoundingMode.HALF_EVEN;
        BigDecimal bigDecimalU = u(new BigDecimal(calendar.get(6)).add(bigDecimalValueOf.subtract(bigDecimal.divide(bigDecimalValueOf2, 4, roundingMode)).divide(BigDecimal.valueOf(24L), 4, roundingMode)));
        BigDecimal bigDecimalU2 = u(u(new BigDecimal("0.9856").multiply(bigDecimalU)).subtract(new BigDecimal("3.289")));
        BigDecimal bigDecimalAdd = bigDecimalU2.add(u(new BigDecimal(Math.sin(g(bigDecimalU2).doubleValue())).multiply(new BigDecimal("1.916")))).add(u(new BigDecimal(Math.sin(u(g(bigDecimalU2).multiply(BigDecimal.valueOf(2L))).doubleValue())).multiply(new BigDecimal("0.020"))).add(new BigDecimal("282.634")));
        if (bigDecimalAdd.doubleValue() > 360.0d) {
            bigDecimalAdd = bigDecimalAdd.subtract(BigDecimal.valueOf(360L));
        }
        BigDecimal bigDecimalU3 = u(bigDecimalAdd);
        BigDecimal bigDecimalU4 = u(BigDecimal.valueOf(Math.sin(g(bigDecimalU3).doubleValue())).multiply(new BigDecimal("0.39782")));
        BigDecimal bigDecimalU5 = u(BigDecimal.valueOf(Math.cos(BigDecimal.valueOf(Math.asin(bigDecimalU4.doubleValue())).doubleValue())));
        BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(Math.cos(g(xcoVar.a).doubleValue()));
        BigDecimal bigDecimal2 = (BigDecimal) padVar.b;
        BigDecimal bigDecimalU6 = u(bigDecimalValueOf3.subtract(bigDecimalU4.multiply(BigDecimal.valueOf(Math.sin(g(bigDecimal2).doubleValue())))).divide(bigDecimalU5.multiply(BigDecimal.valueOf(Math.cos(g(bigDecimal2).doubleValue()))), 4, roundingMode));
        if (bigDecimalU6.doubleValue() < -1.0d || bigDecimalU6.doubleValue() > 1.0d) {
            return null;
        }
        BigDecimal bigDecimalU7 = u(u(BigDecimal.valueOf(Math.acos(bigDecimalU6.doubleValue()))).multiply(new BigDecimal(57.29577951308232d)));
        if (z) {
            bigDecimalU7 = BigDecimal.valueOf(360L).subtract(bigDecimalU7);
        }
        BigDecimal bigDecimalDivide = bigDecimalU7.divide(BigDecimal.valueOf(15L), 4, roundingMode);
        BigDecimal bigDecimalU8 = u(u(new BigDecimal(Math.atan(g(u(u(new BigDecimal(Math.tan(g(bigDecimalU3).doubleValue())).multiply(new BigDecimal(57.29577951308232d))).multiply(new BigDecimal("0.91764")))).doubleValue())).multiply(new BigDecimal(57.29577951308232d))));
        if (bigDecimalU8.doubleValue() < 0.0d) {
            bigDecimalU8 = bigDecimalU8.add(BigDecimal.valueOf(360L));
        } else if (bigDecimalU8.doubleValue() > 360.0d) {
            bigDecimalU8 = bigDecimalU8.subtract(BigDecimal.valueOf(360L));
        }
        BigDecimal bigDecimalValueOf4 = BigDecimal.valueOf(90L);
        RoundingMode roundingMode2 = RoundingMode.FLOOR;
        BigDecimal bigDecimalSubtract = bigDecimalDivide.add(bigDecimalU8.add(bigDecimalU3.divide(bigDecimalValueOf4, 0, roundingMode2).multiply(bigDecimalValueOf4).subtract(bigDecimalU8.divide(bigDecimalValueOf4, 0, roundingMode2).multiply(bigDecimalValueOf4))).divide(BigDecimal.valueOf(15L), 4, roundingMode)).subtract(bigDecimalU.multiply(new BigDecimal("0.06571"))).subtract(new BigDecimal("6.622"));
        if (bigDecimalSubtract.doubleValue() < 0.0d) {
            bigDecimalSubtract = bigDecimalSubtract.add(BigDecimal.valueOf(24L));
        } else if (bigDecimalSubtract.doubleValue() > 24.0d) {
            bigDecimalSubtract = bigDecimalSubtract.subtract(BigDecimal.valueOf(24L));
        }
        BigDecimal bigDecimalAdd2 = u(bigDecimalSubtract).subtract(((BigDecimal) padVar.c).divide(BigDecimal.valueOf(15L), 4, roundingMode)).add(new BigDecimal(calendar.get(15)).divide(new BigDecimal(3600000), new MathContext(2)));
        if (timeZone.inDaylightTime(calendar.getTime())) {
            bigDecimalAdd2 = bigDecimalAdd2.add(BigDecimal.ONE);
        }
        return bigDecimalAdd2.doubleValue() > 24.0d ? bigDecimalAdd2.subtract(BigDecimal.valueOf(24L)) : bigDecimalAdd2;
    }

    public final int f() {
        return ((n3k) this.b).getAsInt();
    }

    @Override // defpackage.kl9
    public final void h(zhj zhjVar) {
        qim qimVar = (qim) this.b;
        qimVar.b();
        ((dx3) this.a).h(zhjVar);
        qimVar.e(true);
    }

    public final void j() {
        g7f g7fVar = new g7f((i7f) this.a);
        while (g7fVar.hasNext()) {
            jje jjeVar = (jje) g7fVar.next();
            byte b = jjeVar.a;
            Object obj = jjeVar.b;
            switch (b) {
                case 0:
                    ((x77) obj).q();
                    break;
                default:
                    ((p8f) obj).L();
                    break;
            }
        }
    }

    public final Task k() {
        ctp ctpVar = (ctp) this.a;
        String str = ctpVar.b;
        m20 m20Var = ctp.c;
        m20Var.b("requestInAppReview (%s)", new Object[]{str});
        sup supVar = ctpVar.a;
        if (supVar != null) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            supVar.a().post(new ntp(supVar, taskCompletionSource, taskCompletionSource, new jsp(ctpVar, taskCompletionSource, taskCompletionSource)));
            return taskCompletionSource.getTask();
        }
        Object[] objArr = new Object[0];
        if (Log.isLoggable("PlayCore", 6)) {
            m20.d(m20Var.b, "Play Store app is either not installed or not the official version", objArr);
        }
        Locale locale = Locale.getDefault();
        HashMap map = pop.a;
        return Tasks.forException(new y1i(new Status(-1, String.format(locale, "Review Error(%d): %s", -1, !map.containsKey(-1) ? "" : p3p.m((String) map.get(-1), " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#", (String) pop.b.get(-1), ")")))));
    }

    public final void l(int i) {
        j.b((SharedPreferences) ((b59) this.a).get(), "giveaway_eligibility", i);
    }

    public final g3o l0(View view, g3o g3oVar) {
        ViewPager viewPager = (ViewPager) this.b;
        g3o g3oVarH = r5n.h(view, g3oVar);
        if (g3oVarH.a.s()) {
            return g3oVarH;
        }
        Rect rect = (Rect) this.a;
        rect.left = g3oVarH.b();
        rect.top = g3oVarH.d();
        rect.right = g3oVarH.c();
        rect.bottom = g3oVarH.a();
        int childCount = viewPager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            g3o g3oVarC = r5n.c(viewPager.getChildAt(i), g3oVarH);
            rect.left = Math.min(g3oVarC.b(), rect.left);
            rect.top = Math.min(g3oVarC.d(), rect.top);
            rect.right = Math.min(g3oVarC.c(), rect.right);
            rect.bottom = Math.min(g3oVarC.a(), rect.bottom);
        }
        int i2 = Build.VERSION.SDK_INT;
        t2o t2oVar = i2 >= 36 ? new t2o(g3oVarH) : i2 >= 35 ? new s2o(g3oVarH) : i2 >= 34 ? new r2o(g3oVarH) : i2 >= 31 ? new q2o(g3oVarH) : i2 >= 30 ? new p2o(g3oVarH) : new o2o(g3oVarH);
        t2oVar.h(r9b.c(rect.left, rect.top, rect.right, rect.bottom));
        return t2oVar.b();
    }

    public final void m(String str) {
        j.c((SharedPreferences) ((b59) this.a).get(), "giveaway_subscription", str);
    }

    public final void n(String str) {
        j.c((SharedPreferences) ((b59) this.a).get(), "info_data", str);
    }

    public final void o(boolean z) {
        j.d((SharedPreferences) ((b59) this.a).get(), "stale", z);
    }

    @Override // defpackage.fd2
    public final void onResult(Object obj) {
        ((SystemSettings) this.b).c = (HashMap) obj;
        qt3 qt3Var = (qt3) this.a;
        if (qt3Var != null) {
            qt3Var.run();
        }
    }

    public final void p(long j) {
        ((SharedPreferences) ((b59) this.a).get()).edit().putLong("last_request", j).apply();
    }

    public final neb q() {
        return new lcj(new lld((Object) this, (byte) 26));
    }

    public final void r(boolean z) {
        if (s((Window) this.b, z)) {
            j();
        }
    }

    public final void t(boolean z) {
        Window window = (Window) this.b;
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        int i = z ? systemUiVisibility | 8192 : systemUiVisibility & (-8193);
        if (systemUiVisibility == i) {
            return;
        }
        window.getDecorView().setSystemUiVisibility(i);
        j();
    }
}
