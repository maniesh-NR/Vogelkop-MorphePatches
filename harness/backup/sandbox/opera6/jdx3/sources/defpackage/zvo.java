package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class zvo {

    @NotNull
    public static final vvo Companion = new vvo();
    public static final KSerializer[] b = {new k72(xhk.a, (byte) 0)};
    public final List a;

    public zvo(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            x7d.I(i, 1, uvo.b);
            throw null;
        }
    }

    public zvo(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zvo) && Intrinsics.a(this.a, ((zvo) obj).a);
    }

    public final int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return "BidRequestExt(blockedAdCreativeIds=" + this.a + ')';
    }
}
