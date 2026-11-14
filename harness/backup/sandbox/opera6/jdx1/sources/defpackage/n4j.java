package defpackage;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public final class n4j {
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final IBinder e;
    public final Bundle f;
    public final MediaSession.Token g;

    static {
        String str = tym.a;
        h = "0";
        i = "1";
        j = "2";
        k = "3";
        l = "4";
        m = "5";
        n = "6";
        o = "7";
        p = "8";
        q = "9";
    }

    public n4j(int i2, int i3, int i4, String str, ssa ssaVar, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        IBinder iBinderAsBinder = ssaVar.asBinder();
        bundle.getClass();
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = str;
        this.e = iBinderAsBinder;
        this.f = bundle;
        this.g = token;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n4j)) {
            return false;
        }
        n4j n4jVar = (n4j) obj;
        return this.a == n4jVar.a && this.b == n4jVar.b && this.c == n4jVar.c && TextUtils.equals(this.d, n4jVar.d) && Objects.equals(this.e, n4jVar.e) && Objects.equals(this.g, n4jVar.g);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), 0, Integer.valueOf(this.b), Integer.valueOf(this.c), this.d, "", null, this.e, this.g);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.b + " interfaceVersion=" + this.c + " service= IMediaSession=" + this.e + " extras=" + this.f + "}";
    }
}
