package ads_mobile_sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import defpackage.axn;
import defpackage.cfp;
import defpackage.cs5;
import defpackage.dbh;
import defpackage.jbp;
import defpackage.p3p;
import defpackage.tso;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ji implements OnCompleteListener, jbp {
    public static ji c;
    public Object a;
    public Object b;

    public ji(int i) {
        this.a = dbh.f(i);
        this.b = dbh.f(0);
    }

    public ji(Context context) {
        this.a = context.getPackageName();
        this.b = context.getSharedPreferences("paid_storage_sp", 0);
    }

    public ji(WebView webView, cfp cfpVar) {
        if (webView == null) {
            qp2.o("WebView is null");
            throw null;
        }
        this.a = webView;
        this.b = cfpVar;
    }

    public /* synthetic */ ji(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public static ji a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            qp2.o("Name is null or empty");
            return null;
        }
        if (!TextUtils.isEmpty(str2)) {
            return new ji(str, str2);
        }
        qp2.o("Version is null or empty");
        return null;
    }

    public final b23 a() {
        return new b23((List) this.a, (List) this.b);
    }

    /* renamed from: a, reason: collision with other method in class */
    public final void m3a() {
        WebView webView = (WebView) this.a;
        cfp cfpVar = (cfp) this.b;
        try {
            if (!axn.b(WebViewFeature.WEB_MESSAGE_LISTENER)) {
                cfpVar.b();
                return;
            }
            try {
                WebViewCompat.removeWebMessageListener(webView, cfpVar.a());
                WebViewCompat.addWebMessageListener(webView, cfpVar.a(), new HashSet(Arrays.asList("*")), new e7((Object) this, (byte) 20));
            } catch (Exception unused) {
                cfpVar.b();
            }
        } catch (NoClassDefFoundError unused2) {
            cfpVar.b();
        }
    }

    public final void a(Object obj, String str) throws IOException {
        boolean zCommit;
        SharedPreferences sharedPreferences = (SharedPreferences) this.b;
        if (obj instanceof String) {
            zCommit = sharedPreferences.edit().putString(str, (String) obj).commit();
        } else if (obj instanceof Long) {
            zCommit = sharedPreferences.edit().putLong(str, ((Long) obj).longValue()).commit();
        } else if (obj instanceof Boolean) {
            zCommit = sharedPreferences.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
        } else {
            if (!(obj instanceof Integer)) {
                obj.getClass().toString();
                StringBuilder sbS = p3p.s("Failed to store ", str, " for app ");
                sbS.append((String) this.a);
                throw new IOException(sbS.toString());
            }
            zCommit = sharedPreferences.edit().putInt(str, ((Integer) obj).intValue()).commit();
        }
        if (zCommit) {
            return;
        }
        StringBuilder sbS2 = p3p.s("Failed to store ", str, " for app ");
        sbS2.append((String) this.a);
        throw new IOException(sbS2.toString());
    }

    public final void a(String str) throws IOException {
        if (((SharedPreferences) this.b).edit().remove(str).commit()) {
            return;
        }
        StringBuilder sbS = p3p.s("Failed to remove ", str, " for app ");
        sbS.append((String) this.a);
        throw new IOException(sbS.toString());
    }

    public final void a(tso tsoVar) {
        ((List) this.a).add(tsoVar);
    }

    @Override // defpackage.jbp
    public final Object b(mt5 mt5Var) {
        if (!((AtomicBoolean) this.b).getAndSet(true)) {
            ((ek) this.a).getClass();
            rl1.b = rl1.a.decrementAndGet();
        }
        return Unit.a;
    }

    public final Object getValue(Object obj) {
        Object obj2;
        synchronized (this) {
            obj2 = this.b;
        }
        return obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onComplete(Task task) {
        nh4 nh4Var = (nh4) this.b;
        ki kiVar = (ki) this.a;
        if (task.isSuccessful()) {
            AppSetIdInfo appSetIdInfo = (AppSetIdInfo) task.getResult();
            on7 on7Var = pn7.b;
            kiVar.c.getClass();
            jr jrVar = new jr(appSetIdInfo, cs5.y0(SystemClock.elapsedRealtime(), un7.d));
            p0i p0iVar = t0i.b;
            nh4Var.resumeWith(new hv0(jrVar));
            return;
        }
        if (task.isCanceled()) {
            kiVar.b.a("AppSet Id task was cancelled", (Throwable) new CancellationException("AppSet Id task was cancelled"));
            p0i p0iVar2 = t0i.b;
            nh4Var.resumeWith(new ev0("Gms Task for getting AppSetId was cancelled", ae1.a));
            return;
        }
        Exception exception = task.getException();
        if (exception == null) {
            exception = new Exception("AppSet Id task wasn't successful or cancelled, but had no exception.");
        }
        kiVar.b.a("Task failed while getting AppSet Id", (Throwable) exception);
        p0i p0iVar3 = t0i.b;
        nh4Var.resumeWith(new bv0(exception, null, 0 == true ? 1 : 0, 6));
    }

    public final void setValue(xtb xtbVar, Object obj) {
        synchronized (this) {
            this.b = obj;
            Function1 function1 = (Function1) this.a;
            if (function1 != null) {
                function1.invoke(obj);
            }
        }
    }
}
