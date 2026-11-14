package ads_mobile_sdk;

import android.widget.ImageView;
import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;
import defpackage.ato;
import defpackage.f43;
import defpackage.fvo;
import defpackage.prb;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class kw1 implements ato {
    public final zt1 a;

    public kw1(zt1 zt1Var) {
        this.a = zt1Var;
    }

    @Override // defpackage.ato
    public final Object a(cy0 cy0Var, Map map, mt5 mt5Var) {
        prb prbVar;
        zt1 zt1Var;
        fvo fvoVar = (fvo) this.a.c.get();
        if (fvoVar != null) {
            ew1 ew1Var = (ew1) fvoVar;
            synchronized (ew1Var) {
                if (ew1Var.d.get()) {
                    prbVar = new prb();
                } else {
                    InternalNativeAd internalNativeAd = ew1Var.i;
                    if (internalNativeAd == null || (zt1Var = internalNativeAd.e) == null) {
                        prbVar = new prb();
                    } else {
                        f43 f43Var = ew1Var.b;
                        LinkedHashMap linkedHashMap = ew1Var.h;
                        ImageView.ScaleType scaleType = ew1Var.f;
                        if (scaleType == null) {
                            scaleType = iw1.i;
                        }
                        prbVar = zt1Var.a(f43Var, scaleType, linkedHashMap);
                    }
                }
            }
        } else {
            prbVar = new prb();
        }
        Object objA = cy0Var.a(prbVar, "nativeAdViewSignalsReady", mt5Var);
        return objA == px5.a ? objA : Unit.a;
    }

    @Override // defpackage.ato
    public final int b() {
        return 37;
    }
}
