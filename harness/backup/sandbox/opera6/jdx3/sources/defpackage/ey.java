package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ey {
    public final long a;
    public final int b;
    public final long c;
    public final List d;

    public ey(long j, int i, long j2, List list) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = Collections.unmodifiableList(list);
    }
}
