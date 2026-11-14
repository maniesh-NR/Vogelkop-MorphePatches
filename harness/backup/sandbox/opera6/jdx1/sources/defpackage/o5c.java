package defpackage;

import kotlin.ranges.IntRange;

/* loaded from: classes.dex */
public final class o5c implements iak {
    public final t0g a;
    public int b;

    public o5c(int i) {
        int i2 = (i / 30) * 30;
        this.a = new t0g(djh.j(Math.max(i2 - 100, 0), i2 + 130), zpa.k);
        this.b = i;
    }

    public final void b(int i) {
        if (i != this.b) {
            this.b = i;
            int i2 = (i / 30) * 30;
            this.a.setValue(djh.j(Math.max(i2 - 100, 0), i2 + 130));
        }
    }

    @Override // defpackage.iak
    public final Object getValue() {
        return (IntRange) this.a.getValue();
    }
}
