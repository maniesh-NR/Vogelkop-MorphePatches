package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;
import defpackage.b11;
import defpackage.ioj;
import defpackage.ui;
import defpackage.zch;

/* loaded from: classes.dex */
public final class l31 extends ov implements ui {
    public final bu1 b;
    public final yqa c;
    public final String d;
    public final String f;
    public final ji i;
    public static final /* synthetic */ xtb[] k = {zch.b(l31.class, "adEventCallback", "getAdEventCallback()Lcom/google/android/libraries/ads/mobile/sdk/iconad/IconAdEventCallback;")};
    public static final ioj j = new ioj(14);

    /* JADX WARN: Illegal instructions before constructor call */
    public l31(bu1 bu1Var, yqa yqaVar) {
        InternalNativeAd internalNativeAd = bu1Var.b;
        super(internalNativeAd);
        this.b = bu1Var;
        this.c = yqaVar;
        this.d = bu1Var.d;
        this.f = (String) internalNativeAd.a.d.get("package_name");
        this.i = new ji(new b11((Object) this, (byte) 28), (Object) null);
    }
}
