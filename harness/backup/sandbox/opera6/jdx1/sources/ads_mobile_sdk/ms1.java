package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;
import defpackage.prb;
import defpackage.qcp;
import defpackage.rnp;
import defpackage.xzh;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ms1 implements qcp, rnp {
    public final InternalNativeAd a;

    public ms1(InternalNativeAd internalNativeAd) {
        this.a = internalNativeAd;
    }

    @Override // defpackage.rnp
    public final kh3 a() {
        return this.a.a();
    }

    @Override // defpackage.rnp
    public final Object a(xm2 xm2Var) {
        return this.a.a(xm2Var);
    }

    @Override // defpackage.rnp
    /* renamed from: a */
    public final Unit mo0a(xm2 xm2Var) {
        return this.a.mo0a(xm2Var);
    }

    @Override // defpackage.rnp
    public final void a(xzh xzhVar) {
        InternalNativeAd internalNativeAd = this.a;
        internalNativeAd.getClass();
        internalNativeAd.k = xzhVar;
    }

    @Override // defpackage.rnp
    public final a2 b() {
        return this.a.b();
    }

    @Override // defpackage.rnp
    public final void destroy() {
        this.a.destroy();
    }

    @Override // defpackage.rnp
    public final prb g() {
        return this.a.a.w;
    }

    @Override // defpackage.rnp
    public final xzh getResponseInfo() {
        xzh xzhVar = this.a.k;
        if (xzhVar != null) {
            return xzhVar;
        }
        return null;
    }
}
