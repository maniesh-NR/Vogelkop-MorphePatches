package defpackage;

import android.content.res.Resources;

/* loaded from: classes.dex */
public enum n7j implements lrf {
    ALWAYS_LOCKED(1, 2132021343, 0, -1),
    NEVER_LOCKED(2, 2132021345, 0, Integer.MAX_VALUE),
    TEN_MINUTES_UNLOCKED(3, 0, 2131886175, 10);

    public final byte a;
    public final int b;
    public final int c;
    public final int d;

    /* JADX WARN: Multi-variable type inference failed */
    n7j(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    @Override // defpackage.lrf
    public final String d(Resources resources) {
        int i = this.c;
        if (i == 0) {
            return resources.getString(this.b);
        }
        int i2 = this.d;
        return resources.getQuantityString(i, i2, Integer.valueOf(i2));
    }

    @Override // defpackage.lrf
    public final int getDescription() {
        return 0;
    }

    @Override // defpackage.lrf
    public final int getIcon() {
        return 0;
    }

    @Override // defpackage.lrf
    public final int getValue() {
        return this.d;
    }
}
