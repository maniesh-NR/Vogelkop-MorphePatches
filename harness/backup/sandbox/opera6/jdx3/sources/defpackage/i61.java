package defpackage;

import android.content.Context;
import android.os.Trace;
import android.widget.ProgressBar;
import com.google.common.util.concurrent.ListenableFuture;
import com.leanplum.ActionContext;
import com.leanplum.messagetemplates.OperaConfigBundleSheet$initializeSheetRequest$2$1;
import com.leanplum.messagetemplates.OperaSheet;
import com.opera.ad.interstitial.AdActivity;
import com.opera.android.OperaApplication;
import com.opera.android.utilities.DisplayUtil;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import org.chromium.mojo.system.impl.CoreImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class i61 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ i61(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public /* synthetic */ i61(Object obj, Object obj2, String str, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = str;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ijm ijmVar = ijm.b;
        boolean z = false;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                ((Executor) obj2).execute(new xa((n61) obj, ((j61) obj5).l((String) obj4, (CoreImpl) obj3), (byte) 13));
                return;
            case 1:
                qln qlnVar = (qln) obj4;
                eej eejVar = (eej) ((ok5) obj5);
                xq3 xq3Var = new xq3((byte) 15, new pk5(qlnVar, (nk5) obj2, (orm) obj3, eejVar, eejVar.c), new f1p(qlnVar, (OperaConfigBundleSheet$initializeSheetRequest$2$1) obj), false);
                nej nejVar = eejVar.a;
                nejVar.getClass();
                nejVar.b(xq3Var, ijmVar);
                pk5.m = xq3Var;
                return;
            case 2:
                ((vl5) obj4).run().addListener(new qn((vzk) obj5, (AtomicBoolean) obj3, (wl5) obj2, (AtomicBoolean) obj, (byte) 6), m97.a);
                return;
            case 3:
                m7m m7mVar = (m7m) obj5;
                c5j c5jVar = (c5j) obj4;
                ListenableFuture listenableFuture = (ListenableFuture) obj3;
                ListenableFuture listenableFuture2 = (ListenableFuture) obj2;
                gg8 gg8Var = (gg8) obj;
                if (m7mVar.isDone()) {
                    c5jVar.setFutureInternal(listenableFuture);
                    return;
                } else {
                    if (listenableFuture2.isCancelled()) {
                        int i = gg8.e;
                        if (gg8Var.compareAndSet(fg8.a, fg8.b)) {
                            m7mVar.cancel(false);
                            return;
                        }
                        return;
                    }
                    return;
                }
            case 4:
                OperaSheet.lambda$initializeSheetRequest$2((ActionContext) obj5, (Context) obj3, (String) obj4, (orm) obj2, (skm) obj);
                return;
            case 5:
                String str = (String) obj4;
                Function0 function0 = (Function0) obj3;
                ode odeVar = (ode) obj2;
                l94 l94Var = (l94) obj;
                ((ydp) obj5).getClass();
                boolean zIsEnabled = Trace.isEnabled();
                if (zIsEnabled) {
                    try {
                        String strSubstring = str.length() <= 127 ? str : null;
                        if (strSubstring == null) {
                            strSubstring = str.substring(0, 127);
                        }
                        Trace.beginSection(strSubstring);
                    } finally {
                        if (zIsEnabled) {
                            Trace.endSection();
                        }
                    }
                }
                try {
                    function0.invoke();
                    wqf wqfVar = zpa.h;
                    odeVar.n(wqfVar);
                    l94Var.b(wqfVar);
                } catch (Throwable th) {
                    odeVar.n(new vqf(th));
                    l94Var.d(th);
                }
                if (zIsEnabled) {
                    return;
                } else {
                    return;
                }
            case 6:
                x79 x79Var = (x79) obj5;
                r2g r2gVar = (r2g) obj3;
                String str2 = (String) obj4;
                String str3 = (String) obj2;
                v1 v1Var = (v1) obj;
                Context context = (Context) x79Var.d;
                String[] strArr = OperaApplication.K;
                if (((OperaApplication) context.getApplicationContext()).J().u("personalized_ads") && !((e00) x79Var.b).b().b) {
                    z = true;
                }
                r2gVar.run(new x2g(str2, str3, v1Var.x(), i0l.g() ? "chromebook" : DisplayUtil.e(context) ? "tablet" : "mobile", z));
                return;
            case 7:
                qln qlnVar2 = (qln) obj5;
                x5f x5fVar = (x5f) obj4;
                eej eejVar2 = (eej) obj3;
                wt3 wt3Var = (wt3) obj2;
                d8j d8jVar = (d8j) obj;
                if (pk5.n != null || wt3Var.get().equals(Boolean.FALSE)) {
                    return;
                }
                xq3 xq3Var2 = new xq3((byte) 15, new pk5(qlnVar2, x5fVar, d8jVar, eejVar2, eejVar2.c), new cpj((byte) 9), false);
                nej nejVar2 = eejVar2.a;
                nejVar2.getClass();
                nejVar2.b(xq3Var2, ijmVar);
                pk5.n = xq3Var2;
                return;
            default:
                ProgressBar progressBar = (ProgressBar) obj4;
                progressBar.setProgressDrawable(bbp.g((AdActivity) obj3));
                progressBar.setBackgroundColor(0);
                progressBar.setOnClickListener((obn) obj2);
                ((g94) obj).l((ahb) ((uuj) ((w6j) obj5).e).b);
                return;
        }
    }
}
