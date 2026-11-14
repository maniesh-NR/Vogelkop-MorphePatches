package defpackage;

import android.os.SystemClock;
import java.util.List;

/* loaded from: classes.dex */
public final class rea extends da3 {
    public int g;

    @Override // defpackage.bj8
    public final void e(long j, long j2, long j3, List list, ggd[] ggdVarArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (a(this.g, jElapsedRealtime)) {
            for (int i = this.b - 1; i >= 0; i--) {
                if (!a(i, jElapsedRealtime)) {
                    this.g = i;
                    return;
                }
            }
            h9o.e();
        }
    }

    @Override // defpackage.bj8
    public final int getSelectedIndex() {
        return this.g;
    }

    @Override // defpackage.bj8
    public final Object getSelectionData() {
        return null;
    }

    @Override // defpackage.bj8
    public final int getSelectionReason() {
        return 0;
    }
}
