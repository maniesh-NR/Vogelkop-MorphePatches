package defpackage;

import android.content.Context;
import com.opera.android.Lazy;
import java.net.CookieManager;

/* loaded from: classes.dex */
public final class jy extends Lazy {
    public final /* synthetic */ byte e;
    public final /* synthetic */ i5o f;

    public /* synthetic */ jy(i5o i5oVar, byte b) {
        this.e = b;
        this.f = i5oVar;
    }

    @Override // com.opera.android.Lazy
    public final Object d() {
        byte b = this.e;
        i5o i5oVar = this.f;
        switch (b) {
            case 0:
                CookieManager cookieManager = new CookieManager(new qag((umi) i5oVar.e, (Context) i5oVar.d, "AdsCookies"), null);
                s9f s9fVarB = ((t9f) g3k.e.get()).b();
                s9fVarB.k = new eq6(cookieManager);
                return new t9f(s9fVarB);
            default:
                return new jz((b59) i5oVar.f, (t9f) ((jy) i5oVar.b).get(), (sy) i5oVar.j);
        }
    }
}
