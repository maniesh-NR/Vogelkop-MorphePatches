package defpackage;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ak3 implements tj3 {
    public final File a;
    public final String b;

    public ak3(File file, String str) {
        this.a = file;
        this.b = str;
    }

    @Override // defpackage.tj3
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak3)) {
            return false;
        }
        ak3 ak3Var = (ak3) obj;
        return Intrinsics.a(this.a, ak3Var.a) && Intrinsics.a(this.b, ak3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
