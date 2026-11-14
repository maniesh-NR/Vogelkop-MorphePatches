package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class db4 {
    public final Object a = new Object();
    public final LinkedHashMap b = new LinkedHashMap();

    public final void a(int i, String str, boolean z) {
        man manVar;
        synchronized (this.a) {
            manVar = (man) this.b.get(new sd4(str));
        }
        if (manVar == null) {
            return;
        }
        manVar.b.a(new i3a(i, z));
    }
}
