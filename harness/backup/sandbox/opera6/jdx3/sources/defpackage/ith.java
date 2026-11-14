package defpackage;

import android.os.Bundle;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class ith {
    public final String a;
    public final CharSequence b;
    public final CharSequence[] c;
    public final boolean d;
    public final int e;
    public final Bundle f;
    public final HashSet g;

    public ith(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, int i, Bundle bundle, HashSet hashSet) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequenceArr;
        this.d = z;
        this.e = i;
        this.f = bundle;
        this.g = hashSet;
        if (i != 2 || z) {
            return;
        }
        qp2.o("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        throw null;
    }
}
