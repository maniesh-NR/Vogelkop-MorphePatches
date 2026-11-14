package defpackage;

import ads_mobile_sdk.xu0;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.admob.AdMobAdapter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class s83 {
    public final String a;
    public String c;
    public String i;
    public final LinkedHashSet b = new LinkedHashSet();
    public final LinkedHashMap d = new LinkedHashMap();
    public Bundle e = new Bundle();
    public final HashSet f = new HashSet();
    public final HashSet g = new HashSet();
    public final LinkedHashMap h = new LinkedHashMap();

    public s83(String str) {
        this.a = str;
    }

    public final void a(Class cls, Bundle bundle) {
        if (cls.equals(AdMobAdapter.class)) {
            this.e = bundle.deepCopy();
            return;
        }
        this.h.put(cls.getName(), bundle.deepCopy());
    }

    public s83 b() {
        return this;
    }

    public final s83 c(String str) {
        if (str.length() > 0) {
            this.c = str;
            return b();
        }
        qp2.o("Content URL must be non-empty.");
        return null;
    }

    public final s83 d(Set set) {
        HashSet hashSet = this.g;
        hashSet.clear();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.length() == 0) {
                xu0.c("Neighboring content URL should not be empty.", null);
            } else {
                hashSet.add(str);
            }
        }
        return b();
    }
}
