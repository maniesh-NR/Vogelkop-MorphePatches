package defpackage;

import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class d56 {
    public final String a;
    public final String b;
    public final Set c;

    public d56(String str, String str2, Set set) {
        this.a = str;
        this.b = str2;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d56)) {
            return false;
        }
        d56 d56Var = (d56) obj;
        return Objects.equals(this.a, d56Var.a) && Objects.equals(this.b, d56Var.b) && Objects.equals(this.c, d56Var.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
