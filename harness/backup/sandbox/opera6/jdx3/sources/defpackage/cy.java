package defpackage;

import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.feed.FeedScrollView;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class cy {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public Object g;
    public Object h;

    public cy(AssetManager assetManager, Executor executor, h4h h4hVar, String str, File file) {
        this.a = false;
        this.b = executor;
        this.c = h4hVar;
        this.f = str;
        this.e = file;
        int i = Build.VERSION.SDK_INT;
        this.d = i >= 31 ? y9m.g : (i == 29 || i == 30) ? y9m.h : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cy(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
    }

    public cy(sf1 sf1Var, n27 n27Var, mh9 mh9Var, ikl iklVar, List list, boolean z) {
        this.b = sf1Var;
        this.c = iklVar;
        this.a = z;
        this.d = n27Var;
        this.e = mh9Var;
        this.f = list;
    }

    public cy(tcc tccVar, FeedScrollView feedScrollView, qdh qdhVar, x5f x5fVar) {
        this.b = feedScrollView;
        this.c = qdhVar;
        this.d = new xdh(qdhVar, x5fVar);
        this.e = new wdh(this);
        this.f = new lw7(this, tccVar, (byte) 2);
    }

    public cy(tw2 tw2Var, b59 b59Var, i5o i5oVar, sy syVar, rx rxVar, wjh wjhVar) {
        this.b = new ay((Object) this, (byte) 0);
        this.c = tw2Var;
        this.d = b59Var;
        this.e = i5oVar;
        this.f = syVar;
        this.g = rxVar;
        this.h = wjhVar;
    }

    public static void a(SharedPreferences sharedPreferences) {
        sharedPreferences.edit().remove("controller_config_data").remove("controller_config_url").remove("controller_config_full_url").remove("controller_config_timestamp").remove("controller_config_request_time").apply();
    }

    public final String b() {
        return ((SharedPreferences) ((b59) this.d).get()).getString("controller_config_data", null);
    }

    public final ml c() {
        i();
        return (ml) ((ay) this.b).get();
    }

    public final void d(d2c d2cVar) {
        x79 x79Var = (x79) this.g;
        if (x79Var == null || d2cVar != ((d2c) this.h) || x79Var.B()) {
            this.h = d2cVar;
            x79Var = new x79((sf1) this.b, (n27) this.d, (mh9) this.e, xgh.v((ikl) this.c, d2cVar), (List) this.f, this.a);
        }
        this.g = x79Var;
    }

    public final FileInputStream e(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null) {
                return null;
            }
            message.contains("compressed");
            return null;
        }
    }

    public final void f(int i, Serializable serializable) {
        ((Executor) this.b).execute(new kw4((Object) this, i, (Object) serializable, (byte) 2));
    }

    public final void g(boolean z) {
        lw7 lw7Var = (lw7) this.f;
        FeedScrollView feedScrollView = (FeedScrollView) this.b;
        wdh wdhVar = (wdh) this.e;
        if (this.a == z) {
            return;
        }
        this.a = z;
        sdh sdhVar = (sdh) this.h;
        if (z) {
            if (sdhVar != null) {
                sdhVar.registerAdapterDataObserver(wdhVar);
            }
            feedScrollView.F(wdhVar);
            tcc tccVar = lw7Var.b;
            if (tccVar != null) {
                tccVar.a(lw7Var);
            }
            wdhVar.j();
            return;
        }
        if (sdhVar != null) {
            sdhVar.unregisterAdapterDataObserver(wdhVar);
        }
        feedScrollView.D.c(wdhVar);
        tcc tccVar2 = lw7Var.b;
        if (tccVar2 != null) {
            tccVar2.b(lw7Var);
        }
        ((xdh) this.d).i();
    }

    public final void h(RecyclerView recyclerView, sdh sdhVar) {
        sdh sdhVar2;
        wdh wdhVar = (wdh) this.e;
        if (this.a && (sdhVar2 = (sdh) this.h) != null) {
            sdhVar2.unregisterAdapterDataObserver(wdhVar);
        }
        this.g = recyclerView;
        this.h = sdhVar;
        if (this.a) {
            if (sdhVar != null) {
                sdhVar.registerAdapterDataObserver(wdhVar);
            }
            wdhVar.j();
        }
    }

    public final void i() {
        long j;
        ay ayVar = (ay) this.b;
        tw2 tw2Var = (tw2) this.c;
        if ((((wy) tw2Var.b).k || b() == null) && !this.a) {
            wjh wjhVar = (wjh) this.h;
            ml mlVar = (ml) ayVar.get();
            boolean z = !(mlVar.i == 0 || SystemClock.elapsedRealtime() > mlVar.i + 21600000);
            o59 o59Var = (o59) wjhVar.f;
            if (o59Var == null || o59Var.d > -1) {
                j = 0;
            } else {
                long jUptimeMillis = SystemClock.uptimeMillis();
                o59 o59Var2 = (o59) wjhVar.f;
                j = 0;
                o59Var.d = jUptimeMillis - o59Var2.b;
                o59Var2.m = z;
                wjhVar.p();
            }
            ml mlVar2 = (ml) ayVar.get();
            if ((mlVar2.i == j || SystemClock.elapsedRealtime() > mlVar2.i + 21600000) && !((wy) tw2Var.b).T()) {
                this.a = true;
                r9i r9iVar = (r9i) ((sy) this.f).get();
                long jCurrentTimeMillis = System.currentTimeMillis();
                i5o i5oVar = (i5o) this.e;
                zx zxVar = new zx(jCurrentTimeMillis, this, r9iVar);
                i5oVar.getClass();
                ((iy) i5oVar.a).d(new py(i5oVar, ((Uri) r9iVar.b).buildUpon(), new qy(i5oVar, 0, (Uri) r9iVar.d, null), zxVar));
            }
        }
    }
}
