package defpackage;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class m9h implements k9h {
    public final btg a;

    public m9h(btg btgVar) {
        this.a = btgVar;
    }

    public final void a(byte[] bArr, byte[] bArr2) {
        List list;
        HashMap map = this.a.a;
        List e5dVar = (List) map.get(btg.b);
        if (bArr.length >= 5) {
            list = (List) map.get(new m54(bArr, 5 > bArr.length ? bArr.length : 5));
        } else {
            list = null;
        }
        if (e5dVar == null) {
            e5dVar = list == null ? new ArrayList() : list;
        } else if (list != null) {
            e5dVar = new e5d(list, e5dVar);
        }
        Iterator it = e5dVar.iterator();
        while (it.hasNext()) {
            try {
                ((l9h) it.next()).a.a(bArr, bArr2);
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        t3p.w("invalid signature");
    }
}
