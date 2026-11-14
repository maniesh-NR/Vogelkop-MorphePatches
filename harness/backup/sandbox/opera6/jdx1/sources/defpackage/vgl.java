package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class vgl implements qa5, kr9 {
    public final /* synthetic */ b6h a;

    public vgl(b6h b6hVar) {
        this.a = b6hVar;
    }

    @Override // defpackage.kr9
    public final br9 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof qa5) && (obj instanceof kr9)) {
            return Intrinsics.a(a(), ((kr9) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
