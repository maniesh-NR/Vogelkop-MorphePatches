package defpackage;

import J.N;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.webkit.WebSettings;
import com.leanplum.internal.ResourceQualifiers;
import com.opera.android.browser.obml.Platform;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class c9d implements Runnable {
    public final /* synthetic */ byte a;
    public final Context b;

    public /* synthetic */ c9d(Context context, byte b) {
        this.a = b;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Context context = this.b;
                if (r9n.F(context)) {
                    ApplicationInfo applicationInfo = r9n.u(context, context.getPackageName(), 0L).applicationInfo;
                    if (applicationInfo == null) {
                        return;
                    }
                    int i = applicationInfo.flags;
                    if ((i & 1) == 0 || (i & ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL) == 0) {
                        return;
                    }
                }
                String strA0 = oup.a0(4, vtp.G(1, context));
                u1b u1bVar = gc7.c;
                if ("oem_ofa_lenovo_tablet".equals(strA0)) {
                    return;
                }
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, "com.opera.android.WebSearchActivity"), 1, 1);
                return;
            case 1:
                N.MDn2Nmkb(vtp.G(2, this.b));
                Platform.c = true;
                if (Platform.d == 0 || !Platform.c) {
                    return;
                }
                cak.a(8);
                return;
            case 2:
                WebSettings.getDefaultUserAgent(this.b);
                return;
            default:
                Context context2 = this.b;
                AtomicReference atomicReference = n0k.e;
                try {
                    cvp cvpVarB = cvp.b(context2);
                    synchronized (cvpVarB) {
                        cvpVarB.f = true;
                        cvpVarB.a();
                    }
                    return;
                } catch (SecurityException unused) {
                    return;
                }
        }
    }
}
