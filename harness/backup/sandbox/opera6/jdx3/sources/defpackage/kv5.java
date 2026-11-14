package defpackage;

import java.util.Objects;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class kv5 {
    public final GURL a;

    public kv5(GURL gurl) {
        this.a = gurl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kv5) && this.a.equals(((kv5) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode() ^ Objects.hash(null);
    }
}
