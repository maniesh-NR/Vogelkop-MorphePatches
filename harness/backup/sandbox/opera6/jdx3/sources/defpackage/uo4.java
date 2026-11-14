package defpackage;

import com.google.android.gms.cast.framework.media.MediaQueue;

/* loaded from: classes.dex */
public final class uo4 extends MediaQueue.Callback {
    public int[] a;
    public final /* synthetic */ zo4 b;

    public uo4(zo4 zo4Var) {
        this.b = zo4Var;
    }

    public final void itemsInsertedInRange(int i, int i2) {
    }

    public final void itemsReloaded() {
    }

    public final void itemsRemovedAtIndexes(int[] iArr) {
        int[] iArr2 = this.a;
        if (iArr2 == null) {
            this.a = iArr;
        } else {
            this.a = sgb.p(new int[][]{iArr2, iArr});
        }
    }

    public final void itemsUpdatedAtIndexes(int[] iArr) {
    }

    public final void mediaQueueChanged() {
        int[] iArr;
        zo4 zo4Var = this.b;
        zo4Var.l = zo4Var.v.getMediaQueue().getItemIds();
        if (!zo4Var.N0() && (iArr = this.a) != null) {
            for (int i : iArr) {
                zo4Var.m.delete(i);
            }
        }
        this.a = null;
        zo4Var.Q0(true);
    }

    public final void mediaQueueWillChange() {
        this.a = null;
    }
}
