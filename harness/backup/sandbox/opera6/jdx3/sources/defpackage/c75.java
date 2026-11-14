package defpackage;

import com.leanplum.internal.Constants;
import java.io.ByteArrayInputStream;

/* loaded from: classes.dex */
public final class c75 extends no7 {
    public static final d75 k = new d75(null, null, null, false, false, false, false, false, 255);
    public static final io7 l = io7.D;
    public static final int m = 17;
    public static final yq4 n = new yq4((byte) 11);

    public static d75 t(izd izdVar) {
        boolean z;
        try {
            int i = izdVar.readInt();
            String strH = izdVar.h();
            if (strH == null) {
                strH = "";
            }
            o65 o65VarP = uup.p(strH);
            String strH2 = izdVar.h();
            if (strH2 == null) {
                strH2 = "";
            }
            o65 o65VarP2 = uup.p(strH2);
            String strH3 = izdVar.h();
            String str = strH3 == null ? "" : strH3;
            boolean z2 = true;
            if ((i & 1) != 0) {
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            return new d75(o65VarP, o65VarP2, str, z2, (i & 2) != 0 ? z : false, (i & 4) != 0 ? z : false, (i & 8) != 0 ? z : false, (i & 16) != 0 ? z : false, Constants.Crypt.KEY_LENGTH);
        } catch (Throwable unused) {
            return k;
        }
    }

    @Override // defpackage.no7
    public final Object h() {
        return k;
    }

    @Override // defpackage.no7
    public final Object k(izd izdVar) {
        return t(izdVar);
    }

    @Override // defpackage.no7
    public final Object q(byte[] bArr) {
        return t(new izd(new ByteArrayInputStream(bArr)));
    }
}
