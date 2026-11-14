package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.a;
import androidx.fragment.app.w;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.opera.android.OperaApplication;
import com.opera.android.settings.SettingsManager;
import java.util.HashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class hjf extends fp1 implements oi {
    public final dll a = new dll();
    public sof b;
    public final HashMap c;
    public final lh d;
    public final xbf e;
    public Context f;
    public FirebaseAnalytics g;
    public sz4 h;
    public gjf i;

    public hjf() {
        umi umiVar = vml.d;
        mi miVar = new mi(this, umiVar);
        this.c = new HashMap();
        this.d = new lh();
        this.e = new xbf(this, umiVar, miVar);
    }

    public static dll v(Context context) {
        for (Object baseContext = context; baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof hjf) {
                return ((hjf) baseContext).a;
            }
        }
        return null;
    }

    public final void A(Configuration configuration) {
        u().a(configuration);
        super.onConfigurationChanged(configuration);
        C();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B(Bundle bundle) {
        if (sfe.g0(this)) {
            super/*androidx.fragment.app.r*/.onCreate(bundle);
            return;
        }
        String[] strArr = OperaApplication.K;
        this.b = new sof(((OperaApplication) getApplication()).J(), u(), new jll(this, (byte) 0), new jll(this, (byte) 1));
        u().a(getResources().getConfiguration());
        setTheme(w());
        LayoutInflater layoutInflater = getLayoutInflater();
        pp1 delegate = getDelegate();
        getWindow();
        layoutInflater.setFactory2(new tll(delegate, this.a, y()));
        super/*androidx.fragment.app.r*/.onCreate(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void C() {
        Object objH;
        int iW = w();
        if (iW != this.a.a) {
            getTheme().setTo(getResources().newTheme());
            setTheme(iW);
            mzg.k("androidx.appcompat.app.ResourcesFlusher", "flush", new Class[]{Resources.class}, new Object[]{getResources()});
            ResourceManagerInternal resourceManagerInternal = (ResourceManagerInternal) mzg.h(AppCompatDrawableManager.a(), "mResourceManager");
            synchronized (resourceManagerInternal) {
                mzg.j(mzg.h(resourceManagerInternal, "mTintLists"), "clear", new Class[0], new Object[0]);
                mzg.j(mzg.h(resourceManagerInternal, "mDrawableCaches"), "clear", new Class[0], new Object[0]);
            }
            Object objH2 = null;
            try {
                ThreadLocal threadLocal = ResourcesCompat.a;
                objH = mzg.h(ResourcesCompat.class, "sColorStateCacheLock");
            } catch (ClassNotFoundException unused) {
                objH = null;
            }
            try {
                ThreadLocal threadLocal2 = ResourcesCompat.a;
                objH2 = mzg.h(ResourcesCompat.class, "sColorStateCaches");
            } catch (ClassNotFoundException unused2) {
            }
            synchronized (objH) {
                mzg.j(objH2, "clear", new Class[0], new Object[0]);
            }
            this.b.a();
            g7f g7fVar = new g7f(this.a.b);
            while (g7fVar.hasNext()) {
                ((cll) g7fVar.next()).K();
            }
        }
    }

    public final void D(Intent intent, ni niVar) {
        int iHashCode = niVar.hashCode();
        int i = (65535 & iHashCode) ^ (iHashCode >>> 16);
        this.c.put(Integer.valueOf(i), niVar);
        startActivityForResult(intent, i);
    }

    public boolean E() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void attachBaseContext(Context context) {
        this.f = context;
        super.attachBaseContext(wwc.h(context, wwc.g(context)));
        if (sfe.g0(this)) {
            return;
        }
        n0k.a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object getSystemService(String str) {
        if ("com.opera.android.ui.ACTIVITY_STARTER_SERVICE".equals(str)) {
            return this;
        }
        if ("clipboard".equals(str)) {
            return getApplicationContext().getSystemService(str);
        }
        if ("com.opera.android.permissions.PermissionHandlerService".equals(str)) {
            return this.h;
        }
        if (this.f != null && "print".equals(str)) {
            return this.f.getSystemService(str);
        }
        if (!"com.opera.android.graphics.MASK_PROVIDER_SERVICE".equals(str)) {
            return super/*android.content.Context*/.getSystemService(str);
        }
        gjf gjfVar = this.i;
        if (gjfVar != null) {
            return gjfVar;
        }
        gjf gjfVar2 = new gjf(this, ((mi) this.e.b).a());
        this.i = gjfVar2;
        return gjfVar2;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super/*androidx.fragment.app.r*/.onActivityResult(i, i2, intent);
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.c;
        ni niVar = (ni) map.get(numValueOf);
        if (niVar != null) {
            niVar.a(i2, intent);
            map.remove(Integer.valueOf(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onConfigurationChanged(Configuration configuration) {
        A(configuration);
        wwc.a(this, wwc.f(wwc.e(this)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        Task taskForException;
        Executor executor;
        B(bundle);
        if (sfe.g0(this)) {
            return;
        }
        ocp.p(getWindow(), false);
        mdb.f(getIntent());
        String[] strArr = OperaApplication.K;
        OperaApplication operaApplication = (OperaApplication) getApplication();
        boolean zI = operaApplication.J().i("eula_accepted.gdpr");
        SettingsManager settingsManagerJ = operaApplication.J();
        r65 r65VarH = operaApplication.h();
        lpe lpeVar = (lpe) operaApplication.A.get();
        if (zI) {
            SettingsManager settingsManagerJ2 = ((OperaApplication) getApplication()).J();
            if (settingsManagerJ2.i("ga_usage_statistics")) {
                this.g = FirebaseAnalytics.getInstance(this);
                x5f x5fVar = ((OperaApplication) getApplication()).L().d;
                FirebaseAnalytics firebaseAnalytics = this.g;
                firebaseAnalytics.getClass();
                try {
                    synchronized (FirebaseAnalytics.class) {
                        executor = firebaseAnalytics.b;
                        if (executor == null) {
                            Executor lopVar = new lop(0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                            firebaseAnalytics.b = lopVar;
                            executor = lopVar;
                        }
                    }
                    taskForException = Tasks.call(executor, new y97(firebaseAnalytics));
                } catch (RuntimeException e) {
                    firebaseAnalytics.a.zzD(5, "Failed to schedule task for getAppInstanceId", (Object) null, (Object) null, (Object) null);
                    taskForException = Tasks.forException(e);
                }
                taskForException.addOnSuccessListener(new xl6(x5fVar, (byte) 3));
                new n49(this.g, settingsManagerJ2, this);
            }
            r65VarH.b(settingsManagerJ.J());
        }
        cq5 cq5Var = lpeVar.c;
        nx5 nx5Var = (nx5) operaApplication.t.get();
        if (!xw1.a && settingsManagerJ.i("ga_usage_statistics")) {
            new zw1(this, settingsManagerJ, r65VarH, cq5Var, nx5Var);
        }
        if (getSupportFragmentManager().F("stats-lifecycle-tracker") == null) {
            w supportFragmentManager = getSupportFragmentManager();
            a aVarF = u35.f(supportFragmentManager, supportFragmentManager);
            aVarF.e(0, this.d, "stats-lifecycle-tracker", 1);
            aVarF.h();
        }
        wwc.a(this, wwc.f(wwc.e(this)));
    }

    public void onDestroy() {
        super.onDestroy();
        getViewModelStore().a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onNewIntent(Intent intent) {
        super/*xd5*/.onNewIntent(intent);
        mdb.f(intent);
        setIntent(intent);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        sz4 sz4Var = this.h;
        if (sz4Var == null || !sz4Var.a.g(i, strArr, iArr)) {
            super/*androidx.fragment.app.r*/.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTheme(int i) {
        super.setTheme(i);
        if (sfe.g0(this)) {
            return;
        }
        Resources.Theme theme = getTheme();
        String[] strArr = OperaApplication.K;
        SettingsManager settingsManagerJ = ((OperaApplication) getApplication()).J();
        settingsManagerJ.getClass();
        ozk.a(theme, c7j.values()[settingsManagerJ.n("app_font")] == c7j.FOLLOW_SYSTEM);
        if (i0l.g()) {
            getTheme().applyStyle(2132083121, true);
        }
        this.a.a = i;
    }

    @Override // 
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public ijf s() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nzk u() {
        String[] strArr = OperaApplication.K;
        return (nzk) ((OperaApplication) getApplication()).r.c1.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int w() {
        boolean z = z();
        String[] strArr = OperaApplication.K;
        return qbe.A(((OperaApplication) getApplication()).J().g(), z, 12);
    }

    public qp2 y() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean z() {
        String[] strArr = OperaApplication.K;
        return ((OperaApplication) getApplication()).J().P(u());
    }
}
