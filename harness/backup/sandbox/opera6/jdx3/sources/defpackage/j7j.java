package defpackage;

import android.content.res.Resources;

/* loaded from: classes.dex */
public enum j7j implements lrf {
    /* JADX INFO: Fake field, exist only in values array */
    DISABLED(2132021169),
    /* JADX INFO: Fake field, exist only in values array */
    ENABLED(2132021170),
    /* JADX INFO: Fake field, exist only in values array */
    ENABLED_NO_THIRD_PARTY(2132021171);

    public final int a;

    j7j(int i) {
        this.a = i;
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
        return 0;
    }

    @Override // defpackage.lrf
    public final int getValue() {
        return ordinal();
    }
}
