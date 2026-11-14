package defpackage;

import J.N;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class hj {
    public static final i7f a = new i7f();

    public static List a(int i) {
        return Arrays.asList((String[]) N.MFFpbV1Q(i));
    }

    public static void b(int i, int i2, String str, boolean z) {
        String strQ = wqm.q(str);
        if (strQ != null) {
            String strQ2 = wqm.q(str);
            int iM$NXlYYm = strQ2 == null ? 0 : N.M$NXlYYm(strQ2, z);
            int iMfif1WYl = N.Mfif1WYl(strQ, i, i2, z);
            String strQ3 = wqm.q(str);
            int iM$NXlYYm2 = strQ3 != null ? N.M$NXlYYm(strQ3, z) : 0;
            int i3 = iM$NXlYYm ^ iM$NXlYYm2;
            if (iMfif1WYl == -1 || i3 == 0) {
                return;
            }
            i7f i7fVar = a;
            g7f g7fVarC = u35.c(i7fVar, i7fVar);
            while (g7fVarC.hasNext()) {
                ((gj) g7fVarC.next()).a(iM$NXlYYm2, i3, strQ);
            }
        }
    }
}
