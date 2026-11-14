package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class uqm implements v7e {
    public static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    public final v7e a;

    public uqm(v7e v7eVar) {
        this.a = v7eVar;
    }

    @Override // defpackage.v7e
    public final u7e a(Object obj, int i, int i2, trf trfVar) {
        return this.a.a(new xy9(((Uri) obj).toString()), i, i2, trfVar);
    }

    @Override // defpackage.v7e
    public final boolean b(Object obj) {
        return b.contains(((Uri) obj).getScheme());
    }
}
