package defpackage;

import android.content.res.Resources;

/* loaded from: classes.dex */
public final class vwk implements lrf {
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;

    /* JADX WARN: Multi-variable type inference failed */
    public vwk(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    @Override // defpackage.lrf
    public final String d(Resources resources) {
        return resources.getString(this.c);
    }

    @Override // defpackage.lrf
    public final int getDescription() {
        return this.d;
    }

    @Override // defpackage.lrf
    public final int getIcon() {
        return this.b;
    }

    @Override // defpackage.lrf
    public final int getValue() {
        return this.a ? 1 : 0;
    }
}
