package defpackage;

import com.opera.android.browser.chromium.CookieManager;

/* loaded from: classes.dex */
public final /* synthetic */ class r1a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v1a b;

    public /* synthetic */ r1a(v1a v1aVar, byte b) {
        this.a = b;
        this.b = v1aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        v1a v1aVar = this.b;
        switch (b) {
            case 0:
                v1aVar.b();
                break;
            default:
                v1aVar.d = new CookieManager();
                v1aVar.c.K();
                break;
        }
    }
}
