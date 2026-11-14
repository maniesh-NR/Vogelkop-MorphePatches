package defpackage;

import android.content.res.Resources;

/* loaded from: classes.dex */
public final class cwd implements lrf {
    public final int a;
    public final int b;
    public final Runnable c;

    public cwd(int i, int i2, Runnable runnable) {
        this.a = i;
        this.b = i2;
        this.c = runnable;
    }

    @Override // defpackage.lrf
    public final String d(Resources resources) {
        return resources.getString(this.a);
    }

    @Override // defpackage.lrf
    public final int getDescription() {
        return 0;
    }

    @Override // defpackage.lrf
    public final int getIcon() {
        return this.b;
    }

    @Override // defpackage.lrf
    public final int getValue() {
        return 0;
    }
}
