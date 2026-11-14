package defpackage;

import ads_mobile_sdk.tl;
import java.util.List;

/* loaded from: classes.dex */
public final class bo extends ln implements nq {
    public final zq w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo(rm rmVar, String str, boolean z, dl dlVar, zq zqVar, int i, bp bpVar, i3j i3jVar, ap apVar, String str2) {
        super(rmVar, str, z, dlVar, bpVar, i, i3jVar, apVar, str2);
        yo yoVar = yo.ADMOB;
        this.w = zqVar;
    }

    @Override // defpackage.nq
    public final mq a(dl dlVar, km kmVar, k8 k8Var, kq kqVar, List list) {
        return new co(this, dlVar, kmVar, k8Var, kqVar, list);
    }

    @Override // defpackage.aqi, defpackage.yz
    public final void c() {
        super.c();
        zq zqVar = this.w;
        tl tlVar = zqVar.a;
        zqVar.a = null;
        zqVar.removeAllViews();
        zqVar.a();
        zqVar.b();
        if (tlVar != null) {
            tlVar.destroy();
        }
    }

    @Override // defpackage.yz
    public final boolean d(iq iqVar) {
        rm rmVar = this.j;
        rmVar.getClass();
        if (rmVar == rm.BANNER_INLINE || rmVar == rm.BANNER_INLINE_MEDIUM) {
            int iOrdinal = iqVar.ordinal();
            if (iOrdinal == 0) {
                return true;
            }
            if (iOrdinal == 1 || iOrdinal == 2) {
                return false;
            }
        }
        return super.d(iqVar);
    }

    @Override // defpackage.yz
    public final v50 e() {
        return v50.n;
    }

    @Override // defpackage.yz
    public final String l() {
        xzh responseInfo;
        tl tlVar = this.w.a;
        if (tlVar == null || (responseInfo = tlVar.getResponseInfo()) == null) {
            return null;
        }
        return responseInfo.c();
    }
}
