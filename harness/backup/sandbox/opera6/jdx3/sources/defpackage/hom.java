package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.internal.j;
import java.io.ByteArrayInputStream;

/* loaded from: classes.dex */
public final class hom extends no7 {
    public static final ftj l = new ftj((byte) 6);
    public final b59 k;

    public hom(Context context) {
        super(context, 17, "dyn.updateinfo");
        this.k = w1h.l(context, vml.d, "dyn.updateinfo", new bg1[0]);
    }

    public static hom t(Context context) {
        return (hom) no7.n(context, io7.i, l);
    }

    @Override // defpackage.no7
    public final Object h() {
        return new fom(0, null);
    }

    @Override // defpackage.no7
    public final Object k(izd izdVar) {
        fom fomVar = new fom(izdVar.readByte(), izdVar.available() > 0 ? izdVar.h() : null);
        if (((SharedPreferences) this.k.get()).getInt("last.version", 0) == 1910404306) {
            return fomVar;
        }
        s49.m("Pkg upgraded");
        return null;
    }

    @Override // defpackage.no7
    public final void o() {
        j.b((SharedPreferences) this.k.get(), "last.version", 1910404306);
    }

    @Override // defpackage.no7
    public final Object q(byte[] bArr) {
        izd izdVar = new izd(new ByteArrayInputStream(bArr));
        return new fom(izdVar.readByte(), izdVar.available() > 0 ? izdVar.h() : null);
    }
}
