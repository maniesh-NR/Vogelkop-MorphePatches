package defpackage;

import android.content.Context;
import android.view.View;
import android.window.InputTransferToken;
import com.leanplum.Leanplum;
import com.leanplum.internal.ApiConfigLoader;
import java.security.GeneralSecurityException;
import java.security.spec.InvalidKeySpecException;
import org.chromium.content.browser.input.ImeAdapterImpl;
import org.chromium.content.browser.webcontents.WebContentsImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class pza implements ktn, lo7, wxg, c2c, thj, ApiConfigLoader.KeyListener {
    public final /* synthetic */ byte a;

    public /* synthetic */ pza(byte b) {
        this.a = b;
    }

    public static /* bridge */ /* synthetic */ InputTransferToken g(Object obj) {
        return (InputTransferToken) obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: e22 */
    public static /* synthetic */ void h(Object obj, Object obj2, String str) throws e22 {
        throw new e22(str + obj + ((Object) " at path ") + obj2);
    }

    public static /* synthetic */ void i(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void j(String str, double d) {
        throw new IllegalArgumentException(str + d);
    }

    public static /* synthetic */ void k(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void l(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: e22 */
    public static /* synthetic */ void m(Throwable th) throws e22 {
        throw new e22(th);
    }

    public static /* synthetic */ void n(Object obj, String str) throws GeneralSecurityException {
        throw new GeneralSecurityException(str + obj);
    }

    public static /* synthetic */ void o(Object obj, String str) throws InvalidKeySpecException {
        throw new InvalidKeySpecException(str + obj + ((Object) "."));
    }

    @Override // defpackage.wxg
    public final Object a(oup oupVar) throws GeneralSecurityException {
        switch (this.a) {
            case 23:
                dxb.a(((sac) oupVar).f.a);
                throw null;
            default:
                dxb.a(((wac) oupVar).f.b);
                throw null;
        }
    }

    @Override // defpackage.c2c
    public final int b(View view) {
        return 0;
    }

    public final void c(qwb qwbVar) {
    }

    public final Object e(WebContentsImpl webContentsImpl) {
        return new ImeAdapterImpl(webContentsImpl);
    }

    public final boolean f() {
        return false;
    }

    @Override // com.leanplum.internal.ApiConfigLoader.KeyListener
    public final void onKeysLoaded(String str, String str2) {
        switch (this.a) {
            case 28:
                Leanplum.setAppIdForProductionMode(str, str2);
                break;
            default:
                Leanplum.setAppIdForDevelopmentMode(str, str2);
                break;
        }
    }

    public final long p() {
        return System.currentTimeMillis();
    }

    @Override // defpackage.lo7
    public final no7 x(Context context) {
        switch (this.a) {
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return new b4b(context, 17, "inAppDomainMap");
            default:
                return new geb(context, 17, "dyn.interest.scoring.keywords");
        }
    }
}
