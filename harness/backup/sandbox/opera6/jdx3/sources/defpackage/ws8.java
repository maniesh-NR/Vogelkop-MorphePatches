package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgChannel;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType;
import com.opera.android.widget.LottieAnimationView;
import com.usercentrics.sdk.UsercentricsBanner;
import com.usercentrics.sdk.UsercentricsDialog;
import java.util.ArrayDeque;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ws8 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ byte a;
    public final Object b;

    public ws8() {
        this.a = (byte) 0;
        this.b = new ArrayDeque(10);
    }

    public /* synthetic */ ws8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a(Activity activity, Bundle bundle) {
    }

    private final void b(Activity activity, Bundle bundle) {
    }

    private final void c(Activity activity, Bundle bundle) {
    }

    private final void d(Activity activity) {
    }

    private final void e(Activity activity) {
    }

    private final void f(Activity activity) {
    }

    private final void g(Activity activity) {
    }

    private final void h(Activity activity) {
    }

    private final void i(Activity activity) {
    }

    private final void j(Activity activity, Bundle bundle) {
    }

    private final void k(Activity activity, Bundle bundle) {
    }

    private final void l(Activity activity, Bundle bundle) {
    }

    private final void m(Activity activity, Bundle bundle) {
    }

    private final void n(Activity activity, Bundle bundle) {
    }

    private final void o(Activity activity) {
    }

    private final void p(Activity activity) {
    }

    private final void q(Activity activity) {
    }

    private final void r(Activity activity) {
    }

    private final void s(Activity activity) {
    }

    private final void t(Activity activity) {
    }

    private final void u(Activity activity) {
    }

    private final void v(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        z01 z01Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Intent intent = activity.getIntent();
                if (intent != null) {
                    ArrayDeque arrayDeque = (ArrayDeque) obj;
                    Bundle bundle2 = null;
                    try {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString("google.message_id");
                            if (string == null) {
                                string = extras.getString("message_id");
                            }
                            if (!TextUtils.isEmpty(string)) {
                                if (!arrayDeque.contains(string)) {
                                    arrayDeque.add(string);
                                }
                            }
                            bundle2 = extras.getBundle("gcm.n.analytics_data");
                        }
                    } catch (RuntimeException unused) {
                    }
                    if (bundle2 != null ? "1".equals(bundle2.getString("google.c.a.e")) : false) {
                        if (bundle2 != null && "1".equals(bundle2.getString("google.c.a.tc")) && (z01Var = (y01) r49.e().b(y01.class)) != null) {
                            String string2 = bundle2.getString("google.c.a.c_id");
                            z01 z01Var2 = z01Var;
                            if (!crp.b.contains("fcm")) {
                                z01Var2.a.setUserProperty("fcm", "_ln", string2);
                            }
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("source", "Firebase");
                            bundle3.putString("medium", "notification");
                            bundle3.putString("campaign", string2);
                            z01Var2.a(bundle3, "_cmp");
                        }
                        phj.f0(bundle2, "_no");
                        break;
                    }
                }
                break;
            case 3:
                ((bko) obj).i(activity, false);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        kfm kfmVar;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
            case 1:
                break;
            case 2:
                UsercentricsDialog usercentricsDialog = (UsercentricsDialog) obj;
                Context contextF = usercentricsDialog.f();
                if (activity == (contextF != null ? cs5.D(contextF) : null)) {
                    try {
                        bz0 bz0VarA = UsercentricsDialog.a(usercentricsDialog);
                        if (bz0VarA != null) {
                            bz0VarA.dismiss();
                        }
                    } catch (Exception unused) {
                    }
                    if (activity.isChangingConfigurations() && (kfmVar = usercentricsDialog.l) != null) {
                        Boolean boolValueOf = Boolean.valueOf(kfmVar.q);
                        Integer numValueOf = Integer.valueOf(kfmVar.r);
                        ArrayList arrayListA = kfmVar.b.A();
                        Function1 function1Access$getOnSecondLayerStateSnapshotCallback$p = UsercentricsBanner.access$getOnSecondLayerStateSnapshotCallback$p(usercentricsDialog.c.a);
                        if (function1Access$getOnSecondLayerStateSnapshotCallback$p != null) {
                            ArrayList arrayList = new ArrayList(k95.o(arrayListA, 10));
                            int size = arrayListA.size();
                            int i = 0;
                            while (i < size) {
                                Object obj2 = arrayListA.get(i);
                                i++;
                                bqg bqgVar = (bqg) obj2;
                                arrayList.add(new cxm(bqgVar.a, bqgVar.b));
                            }
                            function1Access$getOnSecondLayerStateSnapshotCallback$p.invoke(new bxm(arrayList, boolValueOf, numValueOf));
                        }
                    }
                    usercentricsDialog.c();
                    break;
                }
                break;
            case 3:
                ((bko) obj).c.remove(activity);
                break;
            default:
                bqp bqpVar = (bqp) obj;
                if (bqpVar.e == activity) {
                    bqpVar.e = null;
                    bqpVar.b();
                    break;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) obj;
                int i = LottieAnimationView.s;
                if (lottieAnimationView.p) {
                    ((n2d) lottieAnimationView).h = false;
                    ((n2d) lottieAnimationView).d.j();
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                ((bko) obj).i(activity, true);
                break;
            default:
                bqp bqpVar = (bqp) obj;
                Activity activity2 = bqpVar.e;
                if (activity2 == null || activity2 == activity) {
                    bqpVar.e = activity;
                    bqpVar.a.a(new wmb(JavaScriptMessage$MsgChannel.activityMonitor, JavaScriptMessage$MsgType.appStateChanged, bqpVar.b, bqpVar.a("", "", "inactive")));
                    break;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) obj;
                int i = LottieAnimationView.s;
                if (lottieAnimationView.p) {
                    ((n2d) lottieAnimationView).j.add(l2d.f);
                    ((n2d) lottieAnimationView).d.k();
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                ((bko) obj).i(activity, true);
                break;
            default:
                bqp bqpVar = (bqp) obj;
                if (bqpVar.e == activity) {
                    bqpVar.a.a(new wmb(JavaScriptMessage$MsgChannel.activityMonitor, JavaScriptMessage$MsgType.appStateChanged, bqpVar.b, bqpVar.a("", "", "active")));
                    break;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        byte b = this.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.a) {
            case 3:
                ((bko) this.b).i(activity, true);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.a) {
            case 3:
                ((bko) this.b).i(activity, false);
                break;
        }
    }
}
