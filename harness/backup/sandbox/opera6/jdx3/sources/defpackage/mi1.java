package defpackage;

/* loaded from: classes.dex */
public final class mi1 implements eeb {
    public final String a;
    public final wgb b;

    public mi1(String str, wgb wgbVar) {
        this.a = str;
        this.b = wgbVar;
    }

    public final pzh intercept(deb debVar) {
        kvh kvhVarRequest = debVar.request();
        try {
            pne pneVar = this.b.get();
            if (!kvhVarRequest.a.d.equals(pneVar.a) || !kvhVarRequest.a.a.equals("https")) {
                return debVar.proceed(kvhVarRequest);
            }
            fvh fvhVarB = kvhVarRequest.b();
            fvhVarB.a(this.a, pneVar.b);
            return debVar.proceed(new kvh(fvhVarB));
        } catch (InterruptedException e) {
            t3p.r(e);
            return null;
        }
    }
}
