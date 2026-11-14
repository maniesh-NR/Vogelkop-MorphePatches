package defpackage;

import ads_mobile_sdk.bu1;
import ads_mobile_sdk.e7;
import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class io extends ln implements nq {
    public final bu1 w;

    /* JADX WARN: Illegal instructions before constructor call */
    public io(String str, String str2, String str3, String str4, String str5, String str6, boolean z, dl dlVar, String str7, bu1 bu1Var, int i, bp bpVar, i3j i3jVar, ap apVar, String str8) {
        String str9 = Arrays.hashCode(new Object[]{str, str2, str3, str4}) + "," + i;
        yo yoVar = yo.ADMOB;
        super(str, str3, str4, str5, str2, str9, str6, z, dlVar, str7, rm.h, bpVar, i3jVar, apVar, str8);
        this.w = bu1Var;
    }

    @Override // defpackage.nq
    public final mq a(dl dlVar, km kmVar, k8 k8Var, kq kqVar, List list) {
        return new jo(this, dlVar, kmVar, k8Var, kqVar, list);
    }

    @Override // defpackage.aqi, defpackage.yz
    public final void c() {
        super.c();
        this.w.destroy();
    }

    @Override // defpackage.yz
    public final v50 e() {
        e7 e7Var = this.w.p;
        return (e7Var == null || !((InternalNativeAd) e7Var.a).r.e) ? v50.b : v50.c;
    }

    @Override // defpackage.yz
    public final String l() {
        xzh responseInfo = this.w.getResponseInfo();
        if (responseInfo != null) {
            return responseInfo.c();
        }
        return null;
    }
}
