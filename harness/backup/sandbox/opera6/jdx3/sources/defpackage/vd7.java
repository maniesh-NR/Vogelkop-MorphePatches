package defpackage;

import android.net.Uri;
import com.opera.android.browser.BrowserUtils;
import java.net.IDN;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* loaded from: classes.dex */
public final class vd7 implements pke {
    public final /* synthetic */ wd7 a;

    public vd7(wd7 wd7Var) {
        this.a = wd7Var;
    }

    @Override // defpackage.pke
    public final void w(b2l b2lVar, oke okeVar, long j, boolean z) {
        String host;
        if (!z || okeVar.d || okeVar.c) {
            return;
        }
        Uri uri = Uri.parse(BrowserUtils.getRendererUrl(((d7l) b2lVar).j.getUrl()));
        if ((!Intrinsics.a(uri.getScheme(), "http") && !Intrinsics.a(uri.getScheme(), "https")) || (host = uri.getHost()) == null || host.length() == 0) {
            return;
        }
        if (c.q(host, "[", false) && c.l(host, "]", false)) {
            return;
        }
        wd7 wd7Var = this.a;
        if (((Boolean) wd7Var.g.invoke(host)).booleanValue()) {
            return;
        }
        String lowerCase = host.toLowerCase(Locale.ROOT);
        try {
            lowerCase = IDN.toASCII(lowerCase);
        } catch (IllegalArgumentException unused) {
        }
        hd hdVar = (hd) wd7Var.c.get();
        long j2 = wd7Var.j;
        if (hdVar.b) {
            hdVar.v(new ivd(lowerCase, j2, (byte) 6));
        }
    }
}
