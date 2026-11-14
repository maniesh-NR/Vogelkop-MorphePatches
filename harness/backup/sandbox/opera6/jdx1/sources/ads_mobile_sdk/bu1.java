package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;
import defpackage.b11;
import defpackage.zch;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class bu1 extends ov {
    public static final /* synthetic */ xtb[] q = {zch.b(bu1.class, "adEventCallback", "getAdEventCallback()Lcom/google/android/libraries/ads/mobile/sdk/nativead/NativeAdEventCallback;")};
    public final InternalNativeAd b;
    public final ji c;
    public final String d;
    public final yqa e;
    public final String f;
    public final String g;
    public final String h;
    public final Double j;
    public final String k;
    public final yqa m;
    public final e7 p;

    public bu1(InternalNativeAd internalNativeAd) {
        super(internalNativeAd);
        this.b = internalNativeAd;
        this.c = new ji(new b11((Object) this, (byte) 26), (Object) null);
        this.d = (String) internalNativeAd.a.d.get("headline");
        it1 it1Var = internalNativeAd.a;
        zf1 zf1Var = it1Var.f;
        LinkedHashMap linkedHashMap = it1Var.d;
        byte b = 19;
        this.e = zf1Var != null ? new yqa(zf1Var.a, zf1Var.b, (byte) 19) : null;
        this.f = (String) linkedHashMap.get("body");
        this.g = (String) linkedHashMap.get("call_to_action");
        this.h = (String) linkedHashMap.get("advertiser");
        this.j = it1Var.e;
        this.k = (String) linkedHashMap.get("store");
        zf1 zf1Var2 = it1Var.g;
        this.m = zf1Var2 != null ? new yqa(zf1Var2.a, zf1Var2.b, (byte) 19) : null;
        rd1 rd1Var = it1Var.h;
        if (rd1Var != null) {
            List<zf1> list = rd1Var.b;
            ArrayList arrayList = new ArrayList(k95.o(list, 10));
            for (zf1 zf1Var3 : list) {
                arrayList.add(new yqa(zf1Var3.a, zf1Var3.b, (byte) 19));
            }
        }
        this.p = new e7(internalNativeAd, b);
        internalNativeAd.e.k();
    }
}
