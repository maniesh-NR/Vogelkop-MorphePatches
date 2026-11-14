package defpackage;

import android.content.res.Resources;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class c8g implements lrf {
    public final long a;
    public final String b;

    public c8g(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public static c8g a(Resources resources, int i) {
        return new c8g(TimeUnit.MINUTES.toMillis(i), resources.getString(2132022184, resources.getQuantityString(2131886129, i, Integer.valueOf(i))));
    }

    @Override // defpackage.lrf
    public final String d(Resources resources) {
        return this.b;
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
        return 0;
    }
}
