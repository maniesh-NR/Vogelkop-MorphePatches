package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class y3m {
    public final szb a;
    public final String b;

    public y3m(Context context, szb szbVar) {
        this.a = szbVar;
        this.b = szbVar.g(context);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y3m)) {
            return false;
        }
        y3m y3mVar = (y3m) obj;
        return this.a.equals(y3mVar.a) && this.b.equals(y3mVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
