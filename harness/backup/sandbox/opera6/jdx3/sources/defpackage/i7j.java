package defpackage;

import android.content.res.Resources;

/* loaded from: classes.dex */
public enum i7j implements lrf {
    /* JADX INFO: Fake field, exist only in values array */
    ONE(1),
    /* JADX INFO: Fake field, exist only in values array */
    TWO(2),
    /* JADX INFO: Fake field, exist only in values array */
    THREE(3),
    /* JADX INFO: Fake field, exist only in values array */
    FOUR(4),
    /* JADX INFO: Fake field, exist only in values array */
    FIVE(5),
    /* JADX INFO: Fake field, exist only in values array */
    UNLIMITED(-1);

    public final int a;

    i7j(int i) {
        this.a = i;
    }

    @Override // defpackage.lrf
    public final String d(Resources resources) {
        int i = this.a;
        return i == -1 ? resources.getString(2132018705) : String.valueOf(i);
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
        return this.a;
    }
}
