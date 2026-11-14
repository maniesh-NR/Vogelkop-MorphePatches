package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class qwn {
    public final Set a;
    public final Set b;

    public qwn(HashSet hashSet, HashSet hashSet2) {
        this.a = hashSet != null ? Collections.unmodifiableSet(hashSet) : Collections.EMPTY_SET;
        this.b = hashSet2 != null ? Collections.unmodifiableSet(hashSet2) : Collections.EMPTY_SET;
    }
}
