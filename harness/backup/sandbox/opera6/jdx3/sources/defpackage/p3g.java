package defpackage;

import J.N;
import com.opera.android.autofill.PasswordManager;
import java.util.ArrayList;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class p3g implements t3g {
    @Override // defpackage.t3g
    public final void a(q3g q3gVar, tu tuVar) {
        PasswordManager.a(new s2g((Object) this, (Object) q3gVar, (Object) tuVar, (byte) 1));
    }

    @Override // defpackage.t3g
    public final void b(s3g s3gVar, ve9 ve9Var) {
        N.MLjUywYX(s3gVar.b, s3gVar.c, s3gVar.d, s3gVar.e, false, new o8f(ve9Var, (byte) 7));
    }

    @Override // defpackage.t3g
    public final void c(s3g s3gVar, su suVar) {
        N.Mlf2hgTY(3, s3gVar.b, new GURL(s3gVar.c), false, new eof((Object) suVar, (Object) s3gVar, (byte) 3), new ArrayList());
    }

    @Override // defpackage.t3g
    public final void d(r3g r3gVar, hu5 hu5Var) {
        N.Mlf2hgTY(3, r3gVar.o(), new GURL(r3gVar.getUrl()), false, new eof(hu5Var, this, r3gVar), new ArrayList());
    }

    @Override // defpackage.t3g
    public final void remove(Object obj) {
        s3g s3gVar = (s3g) obj;
        if (s3gVar.a == null) {
            new cd6();
        } else {
            N.Mlf2hgTY(3, s3gVar.b, new GURL(s3gVar.c), false, new o8f(s3gVar, (byte) 8), new ArrayList());
        }
    }
}
