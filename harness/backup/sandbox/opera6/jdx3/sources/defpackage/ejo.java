package defpackage;

import ads_mobile_sdk.o01;
import android.os.Bundle;
import android.widget.ImageView;

/* loaded from: classes.dex */
public abstract class ejo implements mjo, icp, jma {
    public Object a;

    public ejo() {
        this.a = new w9p();
    }

    public /* synthetic */ ejo(Object obj) {
        this.a = obj;
    }

    public static void e(ImageView imageView, String str) {
        fip.b(imageView.getContext(), str, new smo(imageView, (byte) 0));
    }

    @Override // defpackage.mjo
    public final kro a() {
        return (kro) this.a;
    }

    public abstract void b();

    public abstract void c(cie cieVar);

    public abstract void f();

    public abstract void g();

    public void onDismissed(Bundle bundle) {
        ((o01) this.a).onDismissed(bundle);
    }

    public void onError(Bundle bundle) {
        ((o01) this.a).onError(bundle);
    }

    public void onShown(Bundle bundle) {
        ((o01) this.a).onShown(bundle);
    }

    public final Object s(pzh pzhVar) {
        return ((cdp) this.a).s(pzhVar);
    }
}
