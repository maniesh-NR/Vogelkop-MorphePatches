package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.r;
import androidx.fragment.app.w;
import com.bumptech.glide.a;
import com.google.android.tv.ads.controls.WhyThisAdFragment;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class mwh implements Handler.Callback {
    public static final r16 f = new r16();
    public volatile kwh a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final Handler d;
    public final r16 e;

    public mwh() {
        new ArrayMap(0);
        new ArrayMap(0);
        this.e = f;
        this.d = new Handler(Looper.getMainLooper(), this);
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static boolean e(Context context) {
        Activity activityA = a(context);
        return activityA == null || !activityA.isFinishing();
    }

    public final kwh b(Context context) {
        if (context == null) {
            qp2.o("You cannot start a load on a null Context");
            return null;
        }
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof r) {
                r rVar = (r) context;
                if (!(Looper.myLooper() == Looper.getMainLooper())) {
                    return b(rVar.getApplicationContext());
                }
                if (rVar.isDestroyed()) {
                    qp2.o("You cannot start a load for a destroyed activity");
                    return null;
                }
                nsk nskVarD = d(rVar.getSupportFragmentManager(), null, e(rVar));
                kwh kwhVar = nskVarD.e;
                if (kwhVar != null) {
                    return kwhVar;
                }
                a aVarB = a.b(rVar);
                r16 r16Var = this.e;
                jh jhVar = nskVarD.a;
                yhe yheVar = nskVarD.b;
                r16Var.getClass();
                kwh kwhVar2 = new kwh(aVarB, jhVar, yheVar, rVar);
                nskVarD.e = kwhVar2;
                return kwhVar2;
            }
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (!(Looper.myLooper() == Looper.getMainLooper())) {
                    return b(activity.getApplicationContext());
                }
                if (activity.isDestroyed()) {
                    qp2.o("You cannot start a load for a destroyed activity");
                    return null;
                }
                lwh lwhVarC = c(activity.getFragmentManager(), e(activity));
                kwh kwhVar3 = lwhVarC.d;
                if (kwhVar3 != null) {
                    return kwhVar3;
                }
                a aVarB2 = a.b(activity);
                r16 r16Var2 = this.e;
                jh jhVar2 = lwhVarC.a;
                lld lldVar = lwhVarC.b;
                r16Var2.getClass();
                kwh kwhVar4 = new kwh(aVarB2, jhVar2, lldVar, activity);
                lwhVarC.d = kwhVar4;
                return kwhVar4;
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return b(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    a aVarB3 = a.b(context.getApplicationContext());
                    r16 r16Var3 = this.e;
                    ujp ujpVar = new ujp((byte) 21);
                    hr5 hr5Var = new hr5();
                    Context applicationContext = context.getApplicationContext();
                    r16Var3.getClass();
                    this.a = new kwh(aVarB3, ujpVar, hr5Var, applicationContext);
                }
            }
        }
        return this.a;
    }

    public final lwh c(FragmentManager fragmentManager, boolean z) {
        lwh lwhVar = (lwh) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (lwhVar != null) {
            return lwhVar;
        }
        HashMap map = this.b;
        lwh lwhVar2 = (lwh) map.get(fragmentManager);
        if (lwhVar2 == null) {
            lwhVar2 = new lwh();
            if (z) {
                lwhVar2.a.g();
            }
            map.put(fragmentManager, lwhVar2);
            fragmentManager.beginTransaction().add(lwhVar2, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.d.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return lwhVar2;
    }

    public final nsk d(w wVar, WhyThisAdFragment whyThisAdFragment, boolean z) {
        nsk nskVar = (nsk) wVar.F("com.bumptech.glide.manager");
        if (nskVar != null) {
            return nskVar;
        }
        HashMap map = this.c;
        nsk nskVar2 = (nsk) map.get(wVar);
        if (nskVar2 == null) {
            nskVar2 = new nsk();
            nskVar2.f = whyThisAdFragment;
            if (whyThisAdFragment != null && whyThisAdFragment.getContext() != null) {
                Fragment parentFragment = whyThisAdFragment;
                while (parentFragment.getParentFragment() != null) {
                    parentFragment = parentFragment.getParentFragment();
                }
                w fragmentManager = parentFragment.getFragmentManager();
                if (fragmentManager != null) {
                    nskVar2.f0(whyThisAdFragment.getContext(), fragmentManager);
                }
            }
            if (z) {
                nskVar2.a.g();
            }
            map.put(wVar, nskVar2);
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(wVar);
            aVar.e(0, nskVar2, "com.bumptech.glide.manager", 1);
            aVar.i(true, true);
            this.d.obtainMessage(2, wVar).sendToTarget();
        }
        return nskVar2;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Object obj;
        Object objRemove;
        int i = message.what;
        boolean z = true;
        if (i == 1) {
            obj = (FragmentManager) message.obj;
            objRemove = this.b.remove(obj);
        } else if (i != 2) {
            objRemove = null;
            z = false;
            obj = null;
        } else {
            obj = (w) message.obj;
            objRemove = this.c.remove(obj);
        }
        if (z && objRemove == null && Log.isLoggable("RMRetriever", 5)) {
            Objects.toString(obj);
        }
        return z;
    }
}
