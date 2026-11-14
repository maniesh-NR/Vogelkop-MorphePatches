package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class cpm implements v7e {
    public static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));
    public final bpm a;

    public cpm(bpm bpmVar) {
        this.a = bpmVar;
    }

    @Override // defpackage.v7e
    public final u7e a(Object obj, int i, int i2, trf trfVar) {
        Uri uri = (Uri) obj;
        return new u7e(new o6f(uri), this.a.c(uri));
    }

    @Override // defpackage.v7e
    public final boolean b(Object obj) {
        return b.contains(((Uri) obj).getScheme());
    }
}
