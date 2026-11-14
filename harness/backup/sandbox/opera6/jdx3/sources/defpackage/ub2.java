package defpackage;

import android.content.pm.PackageManager;
import java.net.URI;
import java.net.URISyntaxException;

/* loaded from: classes.dex */
public final class ub2 {
    public final umi a;
    public final PackageManager b;
    public final i16 c;
    public final ob2 d;

    public ub2(umi umiVar, PackageManager packageManager, i16 i16Var, ob2 ob2Var) {
        this.a = umiVar;
        this.b = packageManager;
        this.c = i16Var;
        this.d = ob2Var;
    }

    public static String a(String str) {
        boolean z;
        try {
            String host = URI.create(str).getHost();
            if (host != null) {
                str = host;
            }
            try {
                str.getClass();
                new ugb(str);
                z = true;
            } catch (IllegalArgumentException unused) {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            str.getClass();
            return new ugb(str).b().a;
        } catch (IllegalStateException e) {
            t3p.n(e);
            return null;
        } catch (URISyntaxException e2) {
            t3p.n(e2);
            return null;
        }
    }
}
