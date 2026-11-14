package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class a5m extends d5m {
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public a5m(int i) {
        super(c5m.a);
        this.b = i;
    }

    @Override // defpackage.d5m
    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && a5m.class == obj.getClass() && super.equals(obj) && this.b == ((a5m) obj).b;
        }
        return true;
    }

    @Override // defpackage.d5m
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), Integer.valueOf(this.b));
    }
}
