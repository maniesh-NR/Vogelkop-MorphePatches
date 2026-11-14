package defpackage;

import J.N;
import com.opera.android.browser.chromium.CookieManager;
import com.opera.api.Callback;
import java.util.ArrayList;
import kotlin.coroutines.CoroutineContext;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class v1a {
    public final ru9 a;
    public final nx5 b;
    public final nrl c = new nrl((byte) 26);
    public CookieManager d;
    public final jdj e;
    public final plh f;
    public q1a g;
    public d3k h;
    public Boolean i;

    public v1a(ru9 ru9Var, nx5 nx5Var) {
        this.a = ru9Var;
        this.b = nx5Var;
        jdj jdjVarC = ipe.c(0, 0, (h04) null, 6);
        this.e = jdjVarC;
        this.f = a26.i(jdjVarC);
        na2.B(nx5Var, (CoroutineContext) null, (rx5) null, new t1a(this, null, (byte) 0), 3);
    }

    public final void a(Callback callback) {
        if (this.d == null) {
            this.c.d(new zr9((Object) this, (Object) callback, (byte) 1));
        } else {
            N.M8VJflmI(new GURL("https://www.google.com/"), false, false, false, new ArrayList(), new hu5((Object) this.a, (Object) callback, (byte) 20));
        }
    }

    public final void b() {
        CookieManager cookieManager = this.d;
        byte b = 0;
        if (cookieManager == null) {
            this.c.d(new r1a(this, b));
            return;
        }
        q1a q1aVar = new q1a(this);
        this.g = q1aVar;
        GURL gurl = new GURL("https://www.google.com/");
        kv5 kv5Var = new kv5(gurl);
        CookieManager.ChangeListenerValue changeListenerValue = new CookieManager.ChangeListenerValue();
        CookieManager.ChangeListenerValue changeListenerValue2 = (CookieManager.ChangeListenerValue) cookieManager.a.putIfAbsent(kv5Var, changeListenerValue);
        if (changeListenerValue2 != null) {
            changeListenerValue2.a.b(q1aVar);
        } else {
            changeListenerValue.a.b(q1aVar);
            changeListenerValue.b = N.M9f3dmT1(false, gurl, (Object) null, changeListenerValue);
        }
    }
}
