package defpackage;

import android.content.Context;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class dj9 extends no7 {
    public static final j06 k = new j06((byte) 10);

    public static dj9 t(Context context) {
        return (dj9) no7.n(context, io7.f, k);
    }

    public static cj9 u(izd izdVar) throws IOException {
        String str;
        String str2;
        String strH = izdVar.h();
        String[] strArr = aik.a;
        String str3 = strH == null ? "" : strH;
        String strH2 = izdVar.h();
        String str4 = strH2 == null ? "" : strH2;
        int i = izdVar.readInt();
        if (izdVar.available() > 0) {
            String strH3 = izdVar.h();
            if (strH3 == null) {
                strH3 = "";
            }
            str = strH3;
        } else {
            str = null;
        }
        if (izdVar.available() > 0) {
            String strH4 = izdVar.h();
            str2 = strH4 != null ? strH4 : "";
        } else {
            str2 = null;
        }
        return new cj9(i, str3, str4, str, str2);
    }

    @Override // defpackage.no7
    public final Object h() {
        return new cj9(0, null, null, null, null);
    }

    @Override // defpackage.no7
    public final /* bridge */ /* synthetic */ Object k(izd izdVar) {
        return u(izdVar);
    }

    @Override // defpackage.no7
    public final Object q(byte[] bArr) {
        return u(new izd(new ByteArrayInputStream(bArr)));
    }
}
