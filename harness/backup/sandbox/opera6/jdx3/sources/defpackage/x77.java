package defpackage;

import J.N;
import android.app.Dialog;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.IBinder;
import android.os.PersistableBundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.Base64;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import com.bumptech.glide.load.ImageHeaderParser;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.settings.SettingsManager;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.Adler32;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.chromium.content.browser.androidoverlay.DialogOverlayImpl;
import org.chromium.gfx.mojom.Rect;
import org.chromium.media.MediaDrmStorageBridge$PersistentInfo;

/* loaded from: classes.dex */
public final class x77 implements rya {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;

    public x77(byte b) {
        this.a = b;
        switch (b) {
            case 7:
                this.b = new pde(Boolean.TRUE);
                this.d = new a83((Object) this, (byte) 4);
                break;
            default:
                this.b = new int[10];
                this.c = new int[10];
                this.d = new int[10];
                break;
        }
    }

    public /* synthetic */ x77(byte b, boolean z) {
        this.a = b;
    }

    public x77(Context context, String str, a32 a32Var) {
        this.a = (byte) 1;
        dkf dkfVar = new dkf(context, 2132082772);
        this.b = dkfVar;
        this.c = new AtomicBoolean(false);
        az0 az0Var = new az0(dkfVar);
        az0Var.b(2132020319);
        String string = dkfVar.getString(2132020317, str);
        SpannableString spannableString = new SpannableString(string);
        int iL = StringsKt.L(string, str, 0, false, 6);
        spannableString.setSpan(new ForegroundColorSpan(f03.u(2130969119, dkfVar, 2131102430).getDefaultColor()), iL, str.length() + iL, 33);
        spannableString.setSpan(new StyleSpan(1), iL, str.length() + iL, 33);
        wy0 wy0Var = az0Var.a;
        wy0Var.f = spannableString;
        String string2 = dkfVar.getString(2132021347);
        xd7 xd7Var = new xd7(a32Var, this, (byte) 0);
        wy0Var.g = string2;
        wy0Var.h = xd7Var;
        az0 view = az0Var.setNegativeButton(2132018111, new xd7(a32Var, this, (byte) 1)).setView(phj.I(dkfVar, 2132020318, false, new uk6((Object) this, (byte) 10)));
        view.a.l = new yd7(a32Var, this);
        bz0 bz0VarCreate = view.create();
        this.d = bz0VarCreate;
        bz0VarCreate.setOnShowListener(new zd7(this, (byte) 0));
    }

    public x77(Context context, jg8 jg8Var) {
        this.a = (byte) 8;
        this.b = context;
        this.c = jg8Var;
        this.d = z4c.b(new al7((Object) this, (byte) 3));
    }

    public x77(Context context, l1c l1cVar) {
        this.a = (byte) 19;
        this.c = context;
        this.b = l1cVar.a;
    }

    public x77(OperaApplication operaApplication, SettingsManager settingsManager, x5f x5fVar) {
        this.a = (byte) 6;
        this.b = settingsManager;
        this.c = x5fVar;
        if (settingsManager.G()) {
            this.d = null;
        } else {
            this.d = i0l.h(operaApplication);
        }
    }

    public x77(hp2 hp2Var) {
        this.a = (byte) 22;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = hp2Var;
    }

    public /* synthetic */ x77(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ x77(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj2;
        this.c = obj3;
        this.d = obj;
    }

    public /* synthetic */ x77(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public x77(List list) {
        this.a = (byte) 24;
        this.b = list;
        final byte b = 0;
        this.c = z4c.b(new Function0(this) { // from class: wzd
            public final /* synthetic */ x77 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b2 = b;
                int i = 0;
                x77 x77Var = this.b;
                switch (b2) {
                    case 0:
                        u9d u9dVar = new u9d();
                        for (Object obj : (List) x77Var.b) {
                            int i2 = i + 1;
                            if (i < 0) {
                                j95.n();
                                throw null;
                            }
                            vzd vzdVar = (vzd) obj;
                            if (vzdVar instanceof yzd) {
                                u9dVar.put(Integer.valueOf(((yzd) vzdVar).a), Integer.valueOf(i));
                            }
                            i = i2;
                        }
                        return u9dVar.g();
                    default:
                        u9d u9dVar2 = new u9d();
                        for (Object obj2 : (List) x77Var.b) {
                            int i3 = i + 1;
                            if (i < 0) {
                                j95.n();
                                throw null;
                            }
                            vzd vzdVar2 = (vzd) obj2;
                            if (vzdVar2 instanceof zzd) {
                                u9dVar2.put(Integer.valueOf(((d7l) ((zzd) vzdVar2).a).j.getId()), Integer.valueOf(i));
                            }
                            i = i3;
                        }
                        return u9dVar2.g();
                }
            }
        });
        final byte b2 = 1;
        this.d = z4c.b(new Function0(this) { // from class: wzd
            public final /* synthetic */ x77 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b2;
                int i = 0;
                x77 x77Var = this.b;
                switch (b22) {
                    case 0:
                        u9d u9dVar = new u9d();
                        for (Object obj : (List) x77Var.b) {
                            int i2 = i + 1;
                            if (i < 0) {
                                j95.n();
                                throw null;
                            }
                            vzd vzdVar = (vzd) obj;
                            if (vzdVar instanceof yzd) {
                                u9dVar.put(Integer.valueOf(((yzd) vzdVar).a), Integer.valueOf(i));
                            }
                            i = i2;
                        }
                        return u9dVar.g();
                    default:
                        u9d u9dVar2 = new u9d();
                        for (Object obj2 : (List) x77Var.b) {
                            int i3 = i + 1;
                            if (i < 0) {
                                j95.n();
                                throw null;
                            }
                            vzd vzdVar2 = (vzd) obj2;
                            if (vzdVar2 instanceof zzd) {
                                u9dVar2.put(Integer.valueOf(((d7l) ((zzd) vzdVar2).a).j.getId()), Integer.valueOf(i));
                            }
                            i = i3;
                        }
                        return u9dVar2.g();
                }
            }
        });
    }

    public x77(jl6 jl6Var, InputStream inputStream, ArrayList arrayList) {
        this.a = (byte) 16;
        this.c = jl6Var;
        this.d = arrayList;
        this.b = new d06(inputStream, jl6Var);
    }

    public x77(Function0 function0) {
        this.a = (byte) 14;
        this.b = function0;
        this.c = new AtomicReference();
        this.d = new CountDownLatch(1);
    }

    public x77(mcj mcjVar, Window window) {
        this.a = (byte) 26;
        jje jjeVar = new jje(this, (byte) 0);
        this.d = jjeVar;
        this.b = mcjVar;
        this.c = window;
        ((i7f) mcjVar.a).b(jjeVar);
        q();
    }

    public x77(ndc ndcVar, pde pdeVar, iv7 iv7Var) {
        this.a = (byte) 13;
        this.b = ndcVar;
        this.c = pdeVar;
        this.d = iv7Var;
        pdeVar.j(ndcVar, new ug(new k0a(this, (byte) 0), (byte) 24));
        oup.l0(ndcVar.getLifecycle(), (Function1) null, new k0a(this, (byte) 1), (Function1) null, (Function1) null, 13);
    }

    public x77(nre nreVar) {
        g77 g77Var;
        this.a = (byte) 20;
        l0c l0cVar = nreVar.c;
        if (l0cVar == null) {
            g77Var = null;
        } else {
            URL url = nreVar.b;
            String str = l0cVar.a;
            Locale locale = Locale.US;
            g77Var = new g77(url, str.toLowerCase(locale), l0cVar.b.toLowerCase(locale));
        }
        this.b = g77Var;
        ArrayList arrayList = new ArrayList(nreVar.f);
        this.c = arrayList;
        Collections.sort(arrayList, new au9((byte) 7));
        this.d = nreVar.g;
    }

    public x77(tcc tccVar, BrowserActivity browserActivity, SettingsManager settingsManager, xnh xnhVar) {
        this.a = (byte) 27;
        this.b = browserActivity;
        this.c = settingsManager;
        this.d = xnhVar;
        aib.C(xnhVar, tccVar, new vy(this, (byte) 8));
    }

    public static String h(bre breVar) {
        String str = breVar.c;
        String str2 = breVar.b;
        if (str.isEmpty()) {
            return str2;
        }
        Locale locale = Locale.US;
        return sko.v(str2, ", ", breVar.c);
    }

    public final Bitmap a(BitmapFactory.Options options) {
        cph cphVar = (cph) ((d06) this.b).a;
        cphVar.reset();
        return BitmapFactory.decodeStream(cphVar, null, options);
    }

    public final xfa b() {
        i4d i4dVar;
        m54 m54VarA;
        dga dgaVar = (dga) this.b;
        if (dgaVar == null || (i4dVar = (i4d) this.c) == null) {
            t3p.w("Cannot build without parameters and/or key material");
            return null;
        }
        if (dgaVar.a != ((m54) i4dVar.b).a.length) {
            t3p.w("Key size mismatch");
            return null;
        }
        if (dgaVar.a() && ((Integer) this.d) == null) {
            t3p.w("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((dga) this.b).a() && ((Integer) this.d) != null) {
            t3p.w("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        cga cgaVar = ((dga) this.b).c;
        if (cgaVar == cga.e) {
            m54VarA = juf.a;
        } else if (cgaVar == cga.d || cgaVar == cga.c) {
            m54VarA = juf.a(((Integer) this.d).intValue());
        } else {
            if (cgaVar != cga.b) {
                j9h.u(((dga) this.b).c, "Unknown HmacParameters.Variant: ");
                return null;
            }
            m54VarA = juf.b(((Integer) this.d).intValue());
        }
        return new xfa((dga) this.b, (i4d) this.c, m54VarA, (Integer) this.d);
    }

    public final void c() {
        cph cphVar = (cph) ((d06) this.b).a;
        synchronized (cphVar) {
            cphVar.c = cphVar.a.length;
        }
    }

    public final int d() {
        ArrayList arrayList = (ArrayList) this.d;
        cph cphVar = (cph) ((d06) this.b).a;
        cphVar.reset();
        return p37.I((jl6) this.c, cphVar, arrayList);
    }

    public final ImageHeaderParser.ImageType e() {
        ArrayList arrayList = (ArrayList) this.d;
        cph cphVar = (cph) ((d06) this.b).a;
        cphVar.reset();
        return p37.K((jl6) this.c, cphVar, arrayList);
    }

    public final boolean f(Rect rect) {
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) this.d;
        int i = layoutParams.x;
        int i2 = rect.b;
        if (i == i2 && layoutParams.y == rect.c && layoutParams.width == rect.d && layoutParams.height == rect.e) {
            return false;
        }
        layoutParams.x = i2;
        layoutParams.y = rect.c;
        layoutParams.width = rect.d;
        layoutParams.height = rect.e;
        return true;
    }

    public final ajd g(zid zidVar) {
        return (ajd) ((HashMap) this.b).get(ByteBuffer.wrap(zidVar.a));
    }

    public final void i(IBinder iBinder) {
        DialogOverlayImpl dialogOverlayImpl;
        WindowManager.LayoutParams layoutParams;
        IBinder iBinder2;
        Dialog dialog = (Dialog) this.c;
        if (dialog == null || (dialogOverlayImpl = (DialogOverlayImpl) this.b) == null) {
            return;
        }
        if (iBinder != null && ((iBinder2 = (layoutParams = (WindowManager.LayoutParams) this.d).token) == null || iBinder == iBinder2)) {
            if (iBinder2 != iBinder) {
                layoutParams.token = iBinder;
                Window window = dialog.getWindow();
                window.setAttributes((WindowManager.LayoutParams) this.d);
                window.takeSurface(new w77(this));
                ((Dialog) this.c).show();
                return;
            }
            return;
        }
        if (dialogOverlayImpl.c != null) {
            dialogOverlayImpl.l();
            dialogOverlayImpl.k();
        }
        this.b = null;
        Dialog dialog2 = (Dialog) this.c;
        if (dialog2 != null && dialog2.isShowing()) {
            try {
                ((Dialog) this.c).dismiss();
            } catch (Exception unused) {
            }
        }
        this.c = null;
    }

    public final zc7 j(String str) {
        Iterator it = ((List) this.d).iterator();
        while (it.hasNext()) {
            ((u5) it.next()).getClass();
        }
        r9i r9iVar = (r9i) this.b;
        if (str == null) {
            t3p.q("input must not be null");
            return null;
        }
        fd7 fd7Var = new fd7((ArrayList) r9iVar.b, (j06) r9iVar.d, (ArrayList) r9iVar.c);
        int i = 0;
        while (true) {
            int length = str.length();
            int i2 = i;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                char cCharAt = str.charAt(i2);
                if (cCharAt == '\n' || cCharAt == '\r') {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                break;
            }
            fd7Var.i(str.substring(i, i2));
            i = i2 + 1;
            if (i < str.length() && str.charAt(i2) == '\r' && str.charAt(i) == '\n') {
                i = i2 + 2;
            }
        }
        if (str.length() > 0 && (i == 0 || i < str.length())) {
            fd7Var.i(str.substring(i));
        }
        fd7Var.f(fd7Var.n);
        c5o c5oVar = new c5o(fd7Var.k, fd7Var.m);
        fd7Var.j.getClass();
        g8b g8bVar = new g8b(c5oVar);
        Iterator it2 = fd7Var.o.iterator();
        while (it2.hasNext()) {
            ((j3) it2.next()).g(g8bVar);
        }
        zc7 zc7Var = fd7Var.l.b;
        Iterator it3 = ((ArrayList) r9iVar.e).iterator();
        if (it3.hasNext()) {
            throw p3p.g(it3);
        }
        return zc7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList k(java.util.List r20) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x77.k(java.util.List):java.util.ArrayList");
    }

    public final void l(zid zidVar) {
        g(zidVar);
        ((HashMap) this.b).remove(ByteBuffer.wrap(zidVar.a));
        byte[] bArr = zidVar.b;
        if (bArr != null) {
            ((HashMap) this.c).remove(ByteBuffer.wrap(bArr));
        }
    }

    public final void m(String str) {
        ((lv7) this.b).invoke();
        ((iy1) ((hd) ((wjh) this.c).e).f).g(str, false);
    }

    /* JADX WARN: Finally extract failed */
    public final void n(dp2 dp2Var, int i, boolean z) {
        boolean z2;
        ydi ydiVar = (ydi) this.c;
        Context context = (Context) this.b;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = dp2Var.a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        myg mygVar = dp2Var.c;
        adler32.update(byteBufferAllocate.putInt(ryg.a(mygVar)).array());
        byte[] bArr = dp2Var.b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i2 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i2 >= i) {
                        mkh.q(dp2Var, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        Cursor cursorRawQuery = ydiVar.h().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(ryg.a(mygVar))});
        try {
            Cursor cursor = cursorRawQuery;
            byte b = 0;
            Long lValueOf = cursor.moveToNext() ? Long.valueOf(cursor.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            boolean z3 = z && ((Boolean) ydiVar.l(new udi(ydiVar, dp2Var, b))).booleanValue();
            no2 no2Var = (no2) this.d;
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            myg mygVar2 = dp2Var.c;
            builder.setMinimumLatency(no2Var.a(mygVar2, jLongValue, i, z3));
            Set set = ((oo2) no2Var.b.get(mygVar2)).c;
            if (set.contains(wmi.a)) {
                builder.setRequiredNetworkType(2);
                z2 = true;
            } else {
                z2 = true;
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(wmi.c)) {
                builder.setRequiresCharging(z2);
            }
            if (set.contains(wmi.b)) {
                builder.setRequiresDeviceIdle(z2);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", ryg.a(mygVar));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {dp2Var, Integer.valueOf(value), Long.valueOf(((no2) this.d).a(dp2Var.c, jLongValue, i, z3)), lValueOf, Integer.valueOf(i)};
            if (Log.isLoggable("TRuntime.JobInfoScheduler", 3)) {
                String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr);
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    public final void o(zid zidVar, byte[] bArr, uid uidVar) {
        ajd ajdVarG = g(zidVar);
        zidVar.c = bArr;
        hp2 hp2Var = (hp2) this.d;
        zid zidVar2 = ajdVarG.a;
        MediaDrmStorageBridge$PersistentInfo mediaDrmStorageBridge$PersistentInfo = new MediaDrmStorageBridge$PersistentInfo(zidVar2.a, zidVar2.c, ajdVarG.b, ajdVarG.c);
        long j = hp2Var.b;
        if (j != -1) {
            N.MeALR1v2(j, mediaDrmStorageBridge$PersistentInfo, uidVar);
        } else {
            uidVar.onResult(Boolean.FALSE);
        }
    }

    public final void p() {
        switch (this.a) {
            case 7:
                pde pdeVar = (pde) this.b;
                ns8 ns8Var = (ns8) this.c;
                boolean z = true;
                if (ns8Var != null) {
                    z = ns8Var.getItemCount() == 0;
                }
                xf8.F0(pdeVar, Boolean.valueOf(z));
                break;
            default:
                iv7 iv7Var = (iv7) this.d;
                if (((ndc) this.b).getLifecycle().i.d(qcc.b)) {
                    ((l0a) ((pde) this.c).g()).getClass();
                }
                if (iv7Var.j) {
                    iv7Var.j = false;
                    xf8.F0(iv7Var.k, Boolean.valueOf(iv7Var.a()));
                    break;
                }
                break;
        }
    }

    public final void q() {
        int systemUiVisibility = ((Window) ((mcj) this.b).b).getDecorView().getSystemUiVisibility();
        Window window = (Window) this.c;
        int systemUiVisibility2 = window.getDecorView().getSystemUiVisibility();
        window.getDecorView().setSystemUiVisibility((systemUiVisibility & 16) == 16 ? systemUiVisibility2 | 16 : systemUiVisibility2 & (-17));
    }
}
