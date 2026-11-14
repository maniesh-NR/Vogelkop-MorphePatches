package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class b5m extends d5m {
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public b5m(int i) {
        super(c5m.b);
        this.b = i;
    }

    @Override // defpackage.d5m
    public final boolean a() {
        byte b = this.b;
        return b == 0 || b == 1 || b == 2;
    }

    @Override // defpackage.d5m
    public final boolean b() {
        byte b = this.b;
        return b == 3 || b == 4 || b == 5;
    }

    @Override // defpackage.d5m
    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && b5m.class == obj.getClass() && super.equals(obj) && this.b == ((b5m) obj).b;
        }
        return true;
    }

    @Override // defpackage.d5m
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), Integer.valueOf(this.b));
    }
}
