package defpackage;

import android.content.pm.PackageInfo;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;

/* loaded from: classes.dex */
public final class zwn extends li1 {
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zwn(String str, String str2, byte b) {
        super(str, str2, (byte) 2);
        this.e = b;
    }

    @Override // defpackage.li1
    public final boolean a() {
        PackageInfo currentLoadedWebViewPackage;
        switch (this.e) {
            case 0:
                return super.a() && (currentLoadedWebViewPackage = WebViewCompat.getCurrentLoadedWebViewPackage()) != null && currentLoadedWebViewPackage.getLongVersionCode() >= 636700000;
            case 1:
                if (super.a() && axn.b(WebViewFeature.MULTI_PROCESS)) {
                    return WebViewCompat.isMultiProcessEnabled();
                }
                return false;
            default:
                if (axn.b(WebViewFeature.MULTI_PROFILE)) {
                    return super.a();
                }
                return false;
        }
    }
}
