package defpackage;

import java.util.UUID;
import kotlin.text.c;

/* loaded from: classes.dex */
public final class l42 extends l6e {
    public static final /* synthetic */ int l = 0;

    @Override // defpackage.l6e, defpackage.eri
    public final String a(int i, p6l p6lVar, String str) {
        String strA = super.a(i, p6lVar, str);
        if (strA.length() == 0) {
            return strA;
        }
        return strA + "&s=" + UUID.randomUUID();
    }

    @Override // defpackage.eri
    public final String l() {
        return "Ask AI";
    }

    public final String r(String str, String str2) throws NumberFormatException {
        String strA = super.a(3, p6l.a, str);
        if (strA.length() == 0) {
            return strA;
        }
        if (c.q(str2, "ai-chat-", false)) {
            Long.parseLong(str2.substring(8));
        } else {
            UUID.fromString(str2);
        }
        return sko.k(strA, "&s=", str2);
    }
}
