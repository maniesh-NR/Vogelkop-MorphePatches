package defpackage;

import android.os.SystemClock;
import com.opera.android.browser.AutosubmitExtension;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class iu4 extends l6e {
    @Override // defpackage.l6e, defpackage.eri
    public final String a(int i, p6l p6lVar, String str) {
        String strA = super.a(i, p6lVar, str);
        if (strA.length() == 0) {
            return strA;
        }
        HashMap map = AutosubmitExtension.a;
        long jUptimeMillis = SystemClock.uptimeMillis();
        HashMap map2 = AutosubmitExtension.a;
        Iterator it = map2.entrySet().iterator();
        while (it.hasNext()) {
            if (jUptimeMillis >= ((Long) ((Map.Entry) it.next()).getValue()).longValue()) {
                it.remove();
            }
        }
        long j = 300000 + jUptimeMillis;
        byte[] bArr = new byte[12];
        AutosubmitExtension.b.nextBytes(bArr);
        String strA2 = hik.a(jaa.b(12, bArr));
        map2.put(strA2, Long.valueOf(j));
        return z1m.l(new StringBuilder(strA), "&s=", strA2);
    }

    @Override // defpackage.l6e, defpackage.eri
    public final boolean e() {
        return false;
    }
}
