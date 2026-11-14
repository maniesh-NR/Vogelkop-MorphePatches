package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class ix8 extends sjm {
    public final boolean c;

    public ix8(boolean z, boolean z2) {
        super(z2);
        this.c = z;
    }

    @Override // defpackage.sjm
    public final boolean a() {
        return this.c && this.a;
    }

    @Override // defpackage.sjm
    public final boolean equals(Object obj) {
        return super.equals(obj) && this.c == ((ix8) obj).c;
    }

    @Override // defpackage.sjm
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), Boolean.valueOf(this.c));
    }
}
