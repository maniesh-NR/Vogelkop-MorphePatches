package defpackage;

import ads_mobile_sdk.n83;
import ads_mobile_sdk.rn3;
import ads_mobile_sdk.s02;
import ads_mobile_sdk.w3;
import ads_mobile_sdk.xe2;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class iip implements hlo {
    public final /* synthetic */ byte a;

    public /* synthetic */ iip(byte b) {
        this.a = b;
    }

    @Override // defpackage.tso
    public final Object get() {
        switch (this.a) {
            case 0:
                return new rn3();
            case 1:
                s02 s02Var = new s02();
                s02Var.a = new WeakReference(null);
                s02Var.b = new WeakReference(null);
                s02Var.c = new WeakReference(null);
                s02Var.d = new WeakReference(null);
                return s02Var;
            case 2:
                return new n83();
            case 3:
                return new mip();
            case 4:
                return new zjp();
            case 5:
                return new w3();
            case 6:
                return new skp();
            case 7:
                return new xe2();
            case 8:
                return new hlp();
            default:
                return new jlp();
        }
    }
}
