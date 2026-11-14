package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

/* loaded from: classes.dex */
public final class o3j {
    public static final o3j b = new o3j(new HashSet());
    public static final String c;
    public final u1b a;

    static {
        String str = tym.a;
        c = "0";
    }

    public o3j(HashSet hashSet) {
        this.a = u1b.q(hashSet);
    }

    public static o3j a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(c);
        if (parcelableArrayList == null) {
            w7d.K("Missing commands. Creating an empty SessionCommands");
            return b;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < parcelableArrayList.size(); i++) {
            hashSet.add(n3j.a((Bundle) parcelableArrayList.get(i)));
        }
        return new o3j(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o3j) {
            return this.a.equals(((o3j) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
