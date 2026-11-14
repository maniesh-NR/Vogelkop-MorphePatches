package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class lki implements oki {
    public final pki a;
    public boolean b;
    public Bundle c;
    public final zyk d;

    public lki(pki pkiVar, w7n w7nVar) {
        this.a = pkiVar;
        this.d = z4c.b(new j3i(w7nVar, (byte) 7));
    }

    @Override // defpackage.oki
    public final Bundle a() {
        n08.a.getClass();
        Bundle bundleM = ic4.m((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleM.putAll(bundle);
        }
        for (Map.Entry entry : ((mki) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((y51) ((gki) entry.getValue()).b.e).a();
            if (!bundleA.isEmpty()) {
                bundleM.putBundle(str, bundleA);
            }
        }
        this.b = false;
        return bundleM;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle bundleA = this.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        n08.a.getClass();
        Bundle bundleM = ic4.m((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleM.putAll(bundle);
        }
        if (bundleA != null) {
            bundleM.putAll(bundleA);
        }
        this.c = bundleM;
        this.b = true;
    }
}
