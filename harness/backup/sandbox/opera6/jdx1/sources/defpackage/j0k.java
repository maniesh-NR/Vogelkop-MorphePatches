package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class j0k extends h0k {
    public final long a;
    public final long b;
    public final List c;

    public j0k(List list, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = Collections.unmodifiableList(list);
    }

    @Override // defpackage.h0k
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb.append(this.a);
        sb.append(", programSplicePlaybackPositionUs= ");
        return j7c.o(this.b, " }", sb);
    }
}
