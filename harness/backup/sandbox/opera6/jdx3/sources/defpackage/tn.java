package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.nfc.tech.TagTechnology;
import android.opengl.Matrix;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.play_billing.zzca;
import com.google.firebase.messaging.FirebaseMessaging;
import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import com.opera.android.Lazy;
import com.opera.android.browser.WebContentsWrapper;
import com.opera.android.suggestion.Suggestion;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.chromium.components.background_task_scheduler.TaskInfo;
import org.chromium.components.background_task_scheduler.b;
import org.chromium.components.background_task_scheduler.c;
import org.chromium.ui.base.WindowAndroid;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class tn implements js5, ycl, oeb, gm, xl2, p9g {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;

    public tn(byte b) {
        switch (b) {
            case 13:
                this.b = new float[16];
                this.c = new float[16];
                this.d = new i1();
                break;
            case 17:
                this.b = new Object();
                this.c = new ArrayList();
                this.d = new ArrayList();
                this.a = true;
                break;
            default:
                this.c = new HashSet();
                ole oleVar = new ole(this);
                this.a = false;
                this.b = new pc3(oleVar);
                break;
        }
    }

    public tn(Context context, Looper looper, Looper looper2, mi8 mi8Var) {
        this.b = context.getApplicationContext();
        this.d = new szk(new Handler(looper, null));
        this.c = new qf2(this, new szk(new Handler(looper2, null)), mi8Var);
    }

    public tn(TagTechnology tagTechnology, bwe bweVar, byte[] bArr) {
        String string;
        this.b = tagTechnology;
        this.c = bweVar;
        if (bArr.length < 0) {
            string = null;
        } else {
            StringBuilder sb = new StringBuilder(bArr.length * 3);
            for (byte b : bArr) {
                if (sb.length() > 0) {
                    sb.append(":");
                }
                sb.append(String.format("%02x", Integer.valueOf(b & 255)));
            }
            string = sb.toString();
        }
        this.d = string;
    }

    public tn(cx7 cx7Var, boolean z) {
        this.b = cx7Var;
        if (z) {
            mf2 mf2Var = cx7Var.g;
            mf2 mf2Var2 = new mf2();
            if (mf2Var2.b != null) {
                for (int i = 0; i < mf2Var2.a * 5; i++) {
                    mf2Var2.b[i] = null;
                }
            }
            mf2Var2.a = 0;
            int length = mf2Var.getLength();
            mf2Var2.a = length;
            if (length > 0) {
                mf2Var2.b = new String[length * 5];
                for (int i2 = 0; i2 < mf2Var2.a; i2++) {
                    int i3 = i2 * 5;
                    mf2Var2.b[i3] = mf2Var.getURI(i2);
                    mf2Var2.b[i3 + 1] = mf2Var.getLocalName(i2);
                    mf2Var2.b[i3 + 2] = mf2Var.getQName(i2);
                    mf2Var2.b[i3 + 3] = mf2Var.getType(i2);
                    mf2Var2.b[i3 + 4] = mf2Var.getValue(i2);
                }
            }
            this.c = mf2Var2;
        } else {
            this.c = new mf2();
        }
        this.d = null;
        this.a = false;
    }

    public tn(ea7 ea7Var, aa7 aa7Var) {
        this.d = ea7Var;
        this.b = aa7Var;
        this.c = aa7Var.e ? null : new boolean[ea7Var.g];
    }

    public tn(fa7 fa7Var, ba7 ba7Var) {
        this.d = fa7Var;
        this.b = ba7Var;
        this.c = new boolean[2];
    }

    public tn(Class cls) {
        this.b = UUID.randomUUID();
        this.c = new h5o(((UUID) this.b).toString(), 0, cls.getName(), (String) null, (ib6) null, (ib6) null, 0L, 0L, 0L, (xo5) null, 0, 0, 0L, 0L, 0L, 0L, false, 0, 0, 0L, 0, 0, (String) null, 16777210);
        this.d = a5j.b(new String[]{cls.getName()});
    }

    public /* synthetic */ tn(Object obj, Object obj2, Object obj3) {
        this.b = obj2;
        this.c = obj3;
        this.d = obj;
    }

    public tn(Runnable runnable) {
        s03 s03Var = new s03((Object) this, (byte) 3);
        this.b = s03Var;
        this.d = runnable;
        if (((s03) this.c) == null) {
            this.c = s03Var;
            vml.d(s03Var, 20000L);
        }
        avj avjVar = cak.d;
        avj.g(4, s03Var);
    }

    public tn(kze kzeVar, t1 t1Var, umi umiVar, ndc ndcVar) {
        this.b = t1Var;
        this.c = umiVar;
        y73 y73Var = new y73();
        ndcVar.getLifecycle().a(y73Var);
        this.d = y73Var;
        this.a = ((Boolean) kzeVar.g()).booleanValue();
        kzeVar.j(ndcVar, new cl4(new wg5(this, (byte) 14), (byte) 10));
    }

    public /* synthetic */ tn(boolean z, Object obj, Object obj2, Object obj3) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public static void r(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        float f3 = fArr2[10] / fSqrt;
        fArr[0] = f3;
        float f4 = fArr2[8];
        fArr[2] = f4 / fSqrt;
        fArr[8] = (-f4) / fSqrt;
        fArr[10] = f3;
    }

    public final synchronized void A() {
        if (this.a) {
            return;
        }
        Boolean boolE = E();
        this.c = boolE;
        if (boolE == null) {
            s49 s49Var = new s49((byte) 2);
            kb8 kb8Var = (wkk) this.b;
            kb8Var.a(kb8Var.c, s49Var);
        }
        this.a = true;
    }

    public final synchronized boolean B() {
        boolean z;
        boolean zBooleanValue;
        A();
        Boolean bool = (Boolean) this.c;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            r49 r49Var = ((FirebaseMessaging) this.d).a;
            r49Var.a();
            mb6 mb6Var = (mb6) r49Var.g.get();
            synchronized (mb6Var) {
                try {
                    z = mb6Var.b;
                } finally {
                }
            }
            zBooleanValue = z;
        }
        return zBooleanValue;
    }

    public final void C() {
        View view;
        if (ru9.c(((nw3) ((wci) this.b).b).b).a.getBoolean("tab_gallery.tabui2_selection_menu_hint_bubble_shown", false) || (view = (View) ((c9l) this.c).invoke()) == null) {
            return;
        }
        tjf tjfVar = new tjf(view, new lr2((byte) 2), new tji((Object) this, (byte) 9));
        this.a = false;
        tjfVar.j(((c9l) this.d).b.p);
    }

    public final void D(Context context, tc2 tc2Var, Runnable runnable) {
        irc hrcVar;
        ex3 ex3VarN;
        Lazy lazyB;
        gjm gjmVar = null;
        if (!this.a) {
            if (tc2Var.a) {
                return;
            }
            su suVar = new su((Object) this, (Object) tc2Var, (Object) runnable, (byte) 20);
            umi umiVar = (umi) this.c;
            nml nmlVarE = umiVar.e(new uk6((Object) this, (byte) 4));
            nmlVarE.b(umiVar.f(new xm5(suVar)));
            nmlVarE.a(null);
            return;
        }
        if (tc2Var.equals(hqc.b)) {
            hrcVar = crc.a;
        } else if (tc2Var instanceof kqc) {
            kqc kqcVar = (kqc) tc2Var;
            hrcVar = new frc(kqcVar.b, kqcVar.c);
        } else if (tc2Var instanceof iqc) {
            hrcVar = new drc(((iqc) tc2Var).b);
        } else if (tc2Var instanceof jqc) {
            jqc jqcVar = (jqc) tc2Var;
            hrcVar = new erc(jqcVar.b, jqcVar.c);
        } else if (tc2Var instanceof mqc) {
            hrcVar = new grc(((mqc) tc2Var).b);
        } else {
            if (!(tc2Var instanceof lqc)) {
                h9o.p();
                return;
            }
            hrcVar = new hrc(((lqc) tc2Var).b);
        }
        dx3 dx3VarP = q9n.p(context);
        if (dx3VarP != null && (ex3VarN = dx3VarP.s()) != null && (lazyB = ex3VarN.b()) != null) {
            gjmVar = (gjm) lazyB.get();
        }
        if (gjmVar != null) {
            gjmVar.e(new mrc(hrcVar), false);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public final Boolean E() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        r49 r49Var = ((FirebaseMessaging) this.d).a;
        r49Var.a();
        Context context = r49Var.a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final void F(orb orbVar) {
        if (this.a) {
            return;
        }
        this.a = true;
        ((umi) this.b).g(new jl4((Object) this, (byte) 28)).a(orbVar.a.toString());
    }

    public final void G() {
        this.a = true;
        h5o h5oVar = (h5o) this.c;
        h5oVar.l = 1;
        h5oVar.m = djh.d(10000L, 10000L, 18000000L);
    }

    public final void H() {
        if (this.a) {
            ((szk) this.d).c(new q02(this, (byte) 13));
            this.a = false;
        }
    }

    public final void I(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        ga6 ga6Var = (ga6) this.d;
        if (this.a) {
            return;
        }
        this.a = true;
        if (i == 11) {
            ga6Var.q(((i2 - 1970) * 12) + i3);
            return;
        }
        if (i == 13) {
            ga6Var.q(pzn.j(i2, i9).getTimeInMillis());
            return;
        }
        if (i == 12) {
            ga6Var.q(TimeUnit.SECONDS.toMillis(i7) + TimeUnit.MINUTES.toMillis(i6) + TimeUnit.HOURS.toMillis(i5) + i8);
            return;
        }
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.clear();
        calendar.set(1, i2);
        calendar.set(2, i3);
        calendar.set(5, i4);
        calendar.set(11, i5);
        calendar.set(12, i6);
        calendar.set(13, i7);
        calendar.set(14, i8);
        ga6Var.q(calendar.getTimeInMillis());
    }

    public final void J(int i, double d, double d2, double d3, double d4) {
        Calendar calendar;
        if (Double.isNaN(d)) {
            calendar = Calendar.getInstance();
            calendar.set(14, 0);
        } else if (i == 11) {
            calendar = p9e.j(d);
        } else if (i == 13) {
            int i2 = pzn.g;
            calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            calendar.clear();
            calendar.setFirstDayOfWeek(2);
            calendar.setMinimalDaysInFirstWeek(4);
            calendar.setTimeInMillis((long) d);
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
            gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
            gregorianCalendar.setTimeInMillis((long) d);
            calendar = gregorianCalendar;
        }
        if (i == 8) {
            K(i, calendar.get(1), calendar.get(2), calendar.get(5), 0, 0, 0, 0, 0, d2, d3, d4);
            wxe.V(0);
            return;
        }
        if (i == 12) {
            K(i, 0, 0, 0, calendar.get(11), calendar.get(12), 0, 0, 0, d2, d3, d4);
            wxe.V(1);
            return;
        }
        if (i == 9 || i == 10) {
            K(i, calendar.get(1), calendar.get(2), calendar.get(5), calendar.get(11), calendar.get(12), calendar.get(13), calendar.get(14), 0, d2, d3, d4);
            wxe.V(2);
        } else if (i == 11) {
            K(i, calendar.get(1), calendar.get(2), 0, 0, 0, 0, 0, 0, d2, d3, d4);
            wxe.V(3);
        } else if (i == 13) {
            K(i, pzn.k(calendar), 0, 0, 0, 0, 0, 0, calendar.get(3), d2, d3, d4);
            wxe.V(4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.app.AlertDialog, android.app.Dialog, android.content.DialogInterface$OnClickListener, java.lang.Object] */
    public final void K(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, double d, double d2, double d3) {
        boolean z;
        DialogInterface.OnClickListener onClickListener;
        q9e sh6Var;
        ?? timePickerDialog;
        Context context = (Context) this.b;
        v();
        int i10 = (int) d3;
        if (i == 8) {
            tgk tgkVarL = tgk.l();
            try {
                try {
                    Iterator it = Arrays.asList(new rdd[0]).iterator();
                    Object next = it.hasNext() ? it.next() : null;
                    tgkVarL.close();
                    if (next != null) {
                        h9o.t();
                        return;
                    }
                    zg6 zg6Var = new zg6(context, new s8b(this, i), i2, i3, i4);
                    scd.Z(zg6Var.getDatePicker(), zg6Var, i2, i3, i4, (long) d, (long) d2);
                    zg6Var.setTitle(context.getText(2132018512));
                    z = false;
                    onClickListener = null;
                    timePickerDialog = zg6Var;
                } catch (Throwable th) {
                    throw new ServiceConfigurationError(th.getMessage(), th);
                }
            } finally {
            }
        } else if (i != 12) {
            z = false;
            onClickListener = null;
            if (i == 9 || i == 10) {
                sh6Var = new sh6(context, new t8b(this, i), i2, i3, i4, i5, i6, DateFormat.is24HourFormat(context), d, d2);
            } else if (i == 11) {
                sh6Var = new q9e(context, new t8b(this, i), i2, i3, d, d2, (byte) 0);
                sh6Var.setTitle(2132019800);
            } else if (i == 13) {
                sh6Var = new q9e(context, new t8b(this, i), i2, i9, d, d2, (byte) 1);
                sh6Var.setTitle(2132022690);
            } else {
                timePickerDialog = 0;
            }
            timePickerDialog = sh6Var;
        } else if (i10 < 0 || i10 >= 60000) {
            z = false;
            onClickListener = null;
            timePickerDialog = new TimePickerDialog(context, new u8b(this, i), i5, i6, DateFormat.is24HourFormat(context));
        } else {
            z = false;
            onClickListener = null;
            timePickerDialog = new pbe(context, i5, i6, i7, i8, (int) d, (int) d2, i10, DateFormat.is24HourFormat(context), new t8b(this, i));
        }
        timePickerDialog.setButton(-1, context.getText(2132018511), timePickerDialog);
        timePickerDialog.setButton(-2, context.getText(R.string.cancel), onClickListener);
        timePickerDialog.setButton(-3, context.getText(2132018509), new q8b(this, (byte) 1));
        timePickerDialog.setOnDismissListener(new r8b(this, (byte) 1));
        this.c = timePickerDialog;
        this.a = z;
        timePickerDialog.show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void L(List list) {
        sri sriVar;
        ArrayList arrayList = new ArrayList();
        wsi wsiVar = (wsi) this.d;
        String str = (String) this.b;
        eu3 eu3Var = wsiVar.e;
        if (wsiVar.f) {
            boolean asBoolean = eu3Var.getAsBoolean();
            int length = str.length();
            vr3 vr3Var = new vr3();
            vr3Var.b = asBoolean;
            vr3Var.a = length;
            SparseArray sparseArray = new SparseArray();
            vr3Var.c = sparseArray;
            vr3Var.d = new SparseIntArray();
            sparseArray.put(0, new qri(Integer.MAX_VALUE, 0, 25, 35, true));
            sparseArray.put(1, new qri(2, 3, Integer.MAX_VALUE, Integer.MAX_VALUE, false));
            sparseArray.put(2, new qri(5, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, true));
            sriVar = vr3Var;
        } else {
            sriVar = new sri(eu3Var, str.length());
        }
        for (int i = 0; i < list.size() && arrayList.size() < 10; i++) {
            Suggestion suggestionA = sriVar.a((dri) list.get(i), (list.size() - i) + (!this.a ? 1200 : 1300));
            if (suggestionA != null) {
                arrayList.add(suggestionA);
            }
        }
        ((yv4) this.c).d(arrayList);
    }

    public final boolean a(qs5 qs5Var, boolean z) {
        return qs5Var.t;
    }

    @Override // defpackage.gm
    public final void b(String str, String str2) throws JSONException {
        orb orbVarU = u();
        orbVarU.p("Unsupported parameter", "problemType");
        orbVarU.p(str + '=' + str2, "details");
        F(orbVarU);
    }

    @Override // defpackage.xl2
    public final void c(Drawable drawable) {
        if (drawable != null) {
            if (!this.a) {
                ((pqh) this.c).a = new cv7(drawable, fri.a, false, ((Context) this.d).getString(2132022385), null);
            } else {
                knl knlVar = (knl) ((ev7) this.b).o;
                if (knlVar.c == null) {
                    knlVar.c = fac.B(knlVar.a, knlVar.b, knlVar.d);
                }
            }
        }
    }

    @Override // defpackage.xl2
    public final void d() {
        this.a = true;
    }

    public final void e(qs5 qs5Var, k73 k73Var) {
        p12 p12Var = (p12) this.b;
        String str = qs5Var.i;
        pxh qxhVar = !StringsKt.N(str) ? new qxh(str) : new sxh(2132017607, new Object[]{((Context) p12Var.a).getString(2132017424)});
        z77 z77Var = (z77) ((yv3) p12Var.c).get();
        s12 s12Var = new s12(this.a, qxhVar, new n12(p12Var, qs5Var, k73Var, (WebContentsWrapper) this.c, (u59) this.d, (byte) 0));
        z77Var.getClass();
        z77Var.b(s12Var, ijm.b);
    }

    @Override // defpackage.gm
    public final void f(HashSet hashSet) throws JSONException {
        if (hashSet.isEmpty()) {
            return;
        }
        orb orbVarU = u();
        orbVarU.p("Unsupported configurations", "problemType");
        orbVarU.p(new r40(", ", (byte) 3).b(hashSet), "details");
        F(orbVarU);
    }

    public final void g() {
        ((ea7) this.d).k(this, false);
    }

    @Override // defpackage.gm
    public final void h(HashSet hashSet) throws JSONException {
        if (hashSet.isEmpty()) {
            return;
        }
        orb orbVarU = u();
        orbVarU.p("Unsupported provider", "problemType");
        orbVarU.p("", "details");
        vpb vpbVar = new vpb();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            vpbVar.a((String) it.next());
        }
        orbVarU.p(vpbVar, "unsupportedProviders");
        F(orbVarU);
    }

    public final lf3 i() {
        ArrayList arrayList = (ArrayList) this.c;
        r40 r40Var = null;
        if (arrayList == null || arrayList.isEmpty()) {
            qp2.o("Details of the products must be provided.");
            return null;
        }
        ArrayList arrayList2 = (ArrayList) this.c;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                if (((kf3) obj) == null) {
                    qp2.o("ProductDetailsParams cannot be null.");
                    return null;
                }
            }
        }
        lf3 lf3Var = new lf3();
        lf3Var.a = !((kf3) ((ArrayList) this.c).get(0)).b.b.optString("packageName").isEmpty();
        lf3Var.b = (String) this.b;
        ei2 ei2Var = (ei2) this.d;
        boolean zIsEmpty = TextUtils.isEmpty(ei2Var.a);
        if (ei2Var.b || !zIsEmpty) {
            r40Var = new r40();
            r40Var.b = ei2Var.a;
        } else {
            qp2.o("Old SKU purchase information(token/id) or original external transaction id must be provided.");
        }
        lf3Var.c = r40Var;
        lf3Var.e = new ArrayList();
        lf3Var.f = this.a;
        ArrayList arrayList3 = (ArrayList) this.c;
        lf3Var.d = arrayList3 != null ? zzca.zzj(arrayList3) : zzca.zzk();
        return lf3Var;
    }

    public final off j() {
        if (this.a && ((h5o) this.c).j.d) {
            qp2.o("Cannot set backoff criteria on an idle mode job");
            return null;
        }
        UUID uuid = (UUID) this.b;
        h5o h5oVar = (h5o) this.c;
        off offVar = new off(uuid, h5oVar, (Set) this.d);
        xo5 xo5Var = h5oVar.j;
        boolean z = !xo5Var.i.isEmpty() || xo5Var.e || xo5Var.c || xo5Var.d;
        h5o h5oVar2 = (h5o) this.c;
        if (h5oVar2.q) {
            if (z) {
                qp2.o("Expedited jobs only support network and storage constraints");
                return null;
            }
            if (h5oVar2.g > 0) {
                qp2.o("Expedited jobs cannot be delayed");
                return null;
            }
        }
        if (h5oVar2.x == null) {
            List listY = StringsKt.Y(h5oVar2.c, new String[]{"."}, 0, 6);
            String strD = listY.size() == 1 ? (String) listY.get(0) : (String) CollectionsKt.Q(listY);
            if (strD.length() > 127) {
                strD = pik.D(127, strD);
            }
            h5oVar2.x = strD;
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        this.b = uuidRandomUUID;
        String string = uuidRandomUUID.toString();
        h5o h5oVar3 = (h5o) this.c;
        this.c = new h5o(string, h5oVar3.b, h5oVar3.c, h5oVar3.d, new ib6(h5oVar3.e), new ib6(h5oVar3.f), h5oVar3.g, h5oVar3.h, h5oVar3.i, new xo5(h5oVar3.j), h5oVar3.k, h5oVar3.l, h5oVar3.m, h5oVar3.n, h5oVar3.o, h5oVar3.p, h5oVar3.q, h5oVar3.r, h5oVar3.s, h5oVar3.u, h5oVar3.v, h5oVar3.w, h5oVar3.x, 524288);
        return offVar;
    }

    public final void k(int[] iArr, String[] strArr) throws Resources.NotFoundException {
        bag bagVar = (bag) this.d;
        WindowAndroid windowAndroid = (WindowAndroid) this.b;
        String[] strArr2 = (String[]) this.c;
        ArrayList arrayListA = f03.A(windowAndroid, strArr2);
        if (arrayListA.isEmpty()) {
            Arrays.asList(strArr2);
            bagVar.t();
            return;
        }
        if (this.a) {
            Activity activity = (Activity) windowAndroid.m().get();
            int size = arrayListA.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListA.get(i);
                i++;
                if (nb6.S(activity, (String) obj)) {
                    List listUnmodifiableList = Collections.unmodifiableList(arrayListA);
                    Activity activity2 = (Activity) windowAndroid.m().get();
                    a32 a32Var = new a32((Object) windowAndroid, (Object) listUnmodifiableList, (Object) bagVar, (byte) 24);
                    aag aagVar = new aag(bagVar, listUnmodifiableList);
                    aag aagVar2 = new aag(bagVar, listUnmodifiableList);
                    b87 b87VarO = bagVar.o(activity2, new vdf(a32Var, (byte) 22), new vdf(aagVar, (byte) 20), new o8f(aagVar2, (byte) 17));
                    ijm ijmVar = ijm.b;
                    if (b87VarO != null) {
                        z77 z77VarU = sfe.U(activity2);
                        z77VarU.getClass();
                        z77VarU.b(b87VarO, ijmVar);
                        return;
                    }
                    v9g v9gVarG = bagVar.g(activity2, listUnmodifiableList);
                    if (v9gVarG == null) {
                        bagVar.s();
                        return;
                    }
                    Resources resources = (Resources) v9gVarG.c;
                    String string = resources.getString(v9gVarG.a);
                    String str = ((t9g) v9gVarG).l;
                    qxh qxhVar = str != null ? new qxh(str) : null;
                    String string2 = resources.getString(v9gVarG.b).toString();
                    String string3 = resources.getString(2132018111).toString();
                    z77 z77VarU2 = sfe.U(activity2);
                    gkj gkjVar = new gkj(false, false);
                    gkjVar.a = string2;
                    gkjVar.b = string3;
                    gkjVar.c = null;
                    gkjVar.d = string;
                    gkjVar.e = aagVar2;
                    gkjVar.f = null;
                    gkjVar.g = null;
                    gkjVar.h = a32Var;
                    gkjVar.i = aagVar;
                    gkjVar.j = null;
                    gkjVar.k = 0;
                    gkjVar.l = 0;
                    gkjVar.m = 0;
                    gkjVar.n = true;
                    gkjVar.o = qxhVar;
                    z77VarU2.getClass();
                    z77VarU2.b(gkjVar, ijmVar);
                    return;
                }
            }
        }
        Collections.unmodifiableList(arrayListA);
        bagVar.s();
    }

    public final void l(b bVar) {
        this.a = ((u03) this.d).a.b((Context) this.b, (TaskInfo) this.c);
    }

    public final void m(c cVar) {
        this.a = ((u03) this.d).a.b((Context) this.b, (TaskInfo) this.c);
    }

    @Override // defpackage.gm
    public final void n(String str) throws JSONException {
        orb orbVarU = u();
        orbVarU.p("Invalid config", "problemType");
        orbVarU.p(str, "details");
        F(orbVarU);
    }

    public final boolean o(tn tnVar) {
        return (((cx7) this.b).d & ((cx7) tnVar.b).e) != 0;
    }

    public final void p(boolean z) {
        fa7 fa7Var = (fa7) this.d;
        synchronized (fa7Var.h) {
            if (this.a) {
                throw new IllegalStateException("editor is closed");
            }
            if (Intrinsics.a(((ba7) this.b).g, this)) {
                fa7Var.h(this, z);
            }
            this.a = true;
        }
    }

    public final neb q() {
        HashSet hashSet = (HashSet) this.c;
        if (hashSet.isEmpty()) {
            pc3 pc3Var = (pc3) this.b;
            pc3Var.getClass();
            boolean zF = i8.h.f("BatteryStatusManagerBroadcastReceiverInBackground");
            boolean z = pc3Var.e;
            if (zF) {
                if (!z) {
                    pc3.f.r(new oc3(pc3Var, (byte) 0));
                    pc3Var.e = true;
                }
            } else if (!z && t8.Q(t8.a, pc3Var.c, pc3Var.b) != null) {
                pc3Var.e = true;
            }
        }
        hc3 hc3Var = new hc3(this);
        if (this.a) {
            nc3 nc3Var = (nc3) this.d;
            hc3Var.c = nc3Var;
            hc3Var.d = true;
            n61 n61Var = hc3Var.b;
            if (n61Var != null) {
                n61Var.c(nc3Var);
                hc3Var.b = null;
                hc3Var.d = false;
            }
        }
        hashSet.add(hc3Var);
        return hc3Var;
    }

    public final void s() throws IOException {
        TagTechnology tagTechnology = (TagTechnology) this.b;
        if (tagTechnology.isConnected()) {
            return;
        }
        tagTechnology.connect();
        this.a = true;
    }

    public final void t(lrf lrfVar, boolean z) {
        CharSequence charSequenceD;
        yrf yrfVar = (yrf) this.d;
        mej mejVar = yrfVar.b;
        LinearLayout linearLayout = (LinearLayout) this.c;
        LayoutInflater layoutInflater = (LayoutInflater) this.b;
        boolean z2 = this.a;
        View viewInflate = layoutInflater.inflate(z2 ? 2131559312 : 2131559311, (ViewGroup) linearLayout, false);
        linearLayout.addView(viewInflate);
        ImageView imageView = (ImageView) viewInflate.findViewById(2131362594);
        int icon = lrfVar.getIcon();
        if (icon != 0) {
            imageView.setImageResource(icon);
        } else {
            imageView.setVisibility(8);
        }
        TextView textView = (TextView) viewInflate.findViewById(2131363525);
        if (z2) {
            Resources resources = mejVar.getContext().getResources();
            charSequenceD = lrfVar.getDescription() == 0 ? lrfVar.d(resources) : m5h.h(mejVar.getContext(), lrfVar.d(resources), resources.getString(lrfVar.getDescription()));
        } else {
            charSequenceD = lrfVar.d(textView.getResources());
        }
        textView.setText(charSequenceD);
        viewInflate.findViewById(2131362305).setVisibility(yrfVar.e(lrfVar) ? 0 : 4);
        viewInflate.setEnabled(z);
        viewInflate.setOnClickListener(new ks8(new jf7(this, lrfVar, (byte) 28), (byte) 2));
    }

    public final orb u() throws JSONException {
        orb orbVar = new orb();
        cy cyVar = (cy) this.d;
        String str = (String) cyVar.e;
        if (str != null && str.length() == 2) {
            orbVar.p((String) cyVar.e, Constants.Keys.COUNTRY);
        }
        String str2 = (String) cyVar.f;
        if (str2 != null) {
            orbVar.p(str2, "ipCountry");
        }
        orbVar.p((String) cyVar.c, "pkgver");
        orbVar.p((String) cyVar.b, "pkgname");
        String str3 = (String) cyVar.g;
        if (str3 != null) {
            orbVar.p(str3, "gaid");
        }
        orbVar.p((String) cyVar.d, "opid");
        boolean z = cyVar.a;
        if (!z) {
            orbVar.p("config", "configType");
            return orbVar;
        }
        if (z) {
            orbVar.p("fetch", "configType");
            String str4 = (String) cyVar.h;
            if (str4 != null) {
                orbVar.p(str4, "pid");
            }
        }
        return orbVar;
    }

    public final void v() {
        AlertDialog alertDialog = (AlertDialog) this.c;
        if (alertDialog == null || !alertDialog.isShowing()) {
            return;
        }
        try {
            ((AlertDialog) this.c).dismiss();
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: yid */
    public final xid w(UUID uuid, wh8 wh8Var) throws yid {
        String str = wh8Var.b;
        if (this.a || TextUtils.isEmpty(str)) {
            str = (String) this.c;
        }
        if (TextUtils.isEmpty(str)) {
            Map map = Collections.EMPTY_MAP;
            Uri uri = Uri.EMPTY;
            z4o.D(uri, "The uri must be set.");
            throw new yid(new nd6(uri, 1, (byte[]) null, map, 0L, -1L, (String) null, 0), uri, hsh.d, 0L, new IllegalStateException("No license URL"));
        }
        HashMap map2 = new HashMap();
        UUID uuid2 = q54.e;
        map2.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : q54.c.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            map2.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (((HashMap) this.d)) {
            map2.putAll((HashMap) this.d);
        }
        return yi4.q(((esg) this.b).createDataSource(), str, wh8Var.a, map2);
    }

    public final xid x(xh8 xh8Var) {
        Charset charset = StandardCharsets.UTF_8;
        byte[][] bArr = {"{\"signedRequest\":\"".getBytes(charset), xh8Var.a, "\"}".getBytes(charset)};
        long length = 0;
        for (int i = 0; i < 3; i++) {
            length += bArr[i].length;
        }
        int i2 = (int) length;
        z4o.u(length, length == ((long) i2), "the total number of elements (%s) in the arrays must fit in an int");
        byte[] bArr2 = new byte[i2];
        int length2 = 0;
        for (int i3 = 0; i3 < 3; i3++) {
            byte[] bArr3 = bArr[i3];
            System.arraycopy(bArr3, 0, bArr2, length2, bArr3.length);
            length2 += bArr3.length;
        }
        ed6 ed6VarCreateDataSource = ((esg) this.b).createDataSource();
        String str = xh8Var.b;
        String string = fsd.i.toString();
        String strValueOf = String.valueOf(i2);
        scd.p("Content-Length", strValueOf);
        return yi4.q(ed6VarCreateDataSource, str, bArr2, hsh.m(2, new Object[]{"Content-Type", string, "Content-Length", strValueOf}, (k1b) null));
    }

    public final w6g y(int i) {
        w6g w6gVar;
        fa7 fa7Var = (fa7) this.d;
        synchronized (fa7Var.h) {
            if (this.a) {
                throw new IllegalStateException("editor is closed");
            }
            ((boolean[]) this.c)[i] = true;
            Object obj = ((ba7) this.b).d.get(i);
            phj.K(fa7Var.q, (w6g) obj);
            w6gVar = (w6g) obj;
        }
        return w6gVar;
    }

    public final File z() {
        File file;
        synchronized (((ea7) this.d)) {
            aa7 aa7Var = (aa7) this.b;
            if (aa7Var.f != this) {
                throw new IllegalStateException();
            }
            if (!aa7Var.e) {
                ((boolean[]) this.c)[0] = true;
            }
            file = aa7Var.d[0];
            if (!((ea7) this.d).a.exists()) {
                ((ea7) this.d).a.mkdirs();
            }
        }
        return file;
    }
}
