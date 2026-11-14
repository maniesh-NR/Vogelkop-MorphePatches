package defpackage;

import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.browser.BannerBlockerHelper;

/* loaded from: classes.dex */
public final class e23 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public boolean b;
    public String c;
    public final Object d;
    public final Object e;
    public final Object f;

    public e23(BrowserActivity browserActivity, b2l b2lVar) {
        this.d = browserActivity.O();
        this.e = browserActivity;
        this.f = b2lVar;
    }

    public e23(k43 k43Var, boolean z, String str, v50 v50Var, Long l) {
        this.b = z;
        this.c = str;
        this.d = v50Var;
        this.e = l;
        this.f = k43Var;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.app.Activity, android.content.Context, com.opera.android.BrowserActivity] */
    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f;
        switch (b) {
            case 0:
                ?? r1 = (BrowserActivity) obj;
                d7l d7lVar = (d7l) ((b2l) obj3);
                if (d7lVar.j.isActive() && this.c != null) {
                    String url = d7lVar.j.getUrl();
                    String str = this.c;
                    String[] strArr = wqm.a;
                    if (aik.g(url).equals(aik.g(str)) && r1.X0() && ru9.c(r1).a.getInt("cookie.blocker.sheet.show.count", 0) == 0) {
                        String[] strArr2 = OperaApplication.K;
                        if (((OperaApplication) r1.getApplicationContext()).J().i("ad_blocking") && BannerBlockerHelper.c != 2 && r1.k0()) {
                            eej eejVar = (eej) obj2;
                            x5f x5fVar = ((OperaApplication) r1.getApplication()).L().c;
                            gjm gjmVar = eejVar.c;
                            if (gjmVar != null) {
                                nej nejVar = eejVar.a;
                                xq3 xq3Var = new xq3(x5fVar, gjmVar, (byte) 1);
                                nejVar.getClass();
                                nejVar.b(xq3Var, ijm.b);
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                ((k43) obj3).c(this.b, this.c, true, (v50) obj2, (Long) obj);
                break;
        }
    }
}
