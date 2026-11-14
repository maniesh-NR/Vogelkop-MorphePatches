package defpackage;

import android.content.SharedPreferences;
import android.net.Uri;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class p0a implements shj {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ p0a(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public static boolean a(GURL gurl) {
        if (!gurl.f().equals("https")) {
            return false;
        }
        String strC = gurl.c();
        return strC.equals("google.com") || strC.equals("www.google.com");
    }

    @Override // defpackage.shj
    public final boolean b(NavigationHandle navigationHandle, GURL gurl, boolean z, boolean z2) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (!z && !z2 && navigationHandle.b && navigationHandle.p && !navigationHandle.v && !navigationHandle.u && gurl.e().equals("/aclk") && a(gurl)) {
                    GURL gurlS = navigationHandle.x.s();
                    if (!GURL.i(gurlS) && a(gurlS)) {
                        ((x5f) obj).T0(new rkc((Object) Uri.parse(gurlS.h()), (byte) 29));
                        break;
                    }
                }
                break;
            default:
                if (btb.b(gurl.g())) {
                    nv6 nv6VarB = ru9.c((dx3) ((oc2) obj).b).b();
                    ((SharedPreferences.Editor) nv6VarB.a).putBoolean("jump_minigame.visited", true);
                    nv6VarB.w();
                    break;
                }
                break;
        }
        return false;
    }
}
