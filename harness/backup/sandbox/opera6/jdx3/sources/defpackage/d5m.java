package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public abstract class d5m {
    public final c5m a;

    public d5m(c5m c5mVar) {
        this.a = c5mVar;
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d5m d5mVar = (d5m) obj;
        c5m c5mVar = d5mVar.a;
        c5m c5mVar2 = this.a;
        if (c5mVar2 != c5mVar) {
            return false;
        }
        if (c5mVar2 == c5m.a) {
            return ((a5m) this).b == ((a5m) d5mVar).b;
        }
        if (c5mVar2 == c5m.b) {
            return ((b5m) this).b == ((b5m) d5mVar).b;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.a);
    }
}
