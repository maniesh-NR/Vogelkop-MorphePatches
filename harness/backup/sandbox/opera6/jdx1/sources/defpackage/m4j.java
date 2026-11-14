package defpackage;

import android.media.session.MediaSession;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class m4j {
    public static final String b;
    public static final String c;
    public final n4j a;

    static {
        rjd.a("media3.session");
        String str = tym.a;
        b = "0";
        c = "1";
    }

    public m4j(int i, int i2, int i3, String str, ssa ssaVar, Bundle bundle, MediaSession.Token token) {
        this.a = new n4j(i, i2, i3, str, ssaVar, bundle, token);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m4j) {
            return this.a.equals(((m4j) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
