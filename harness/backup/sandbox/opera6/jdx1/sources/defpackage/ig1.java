package defpackage;

import android.text.SegmentFinder;

/* loaded from: classes.dex */
public final class ig1 extends SegmentFinder {
    public final /* synthetic */ rgh a;

    public ig1(rgh rghVar) {
        this.a = rghVar;
    }

    public final int nextEndBoundary(int i) {
        return this.a.h(i);
    }

    public final int nextStartBoundary(int i) {
        return this.a.d(i);
    }

    public final int previousEndBoundary(int i) {
        return this.a.r(i);
    }

    public final int previousStartBoundary(int i) {
        return this.a.g(i);
    }
}
