package defpackage;

import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class iw6 {

    @NotNull
    public static final hw6 Companion = new hw6();
    public static final KSerializer[] b = {new t7a(xhk.a, j2j.a, (byte) 1)};
    public final Map a;

    public /* synthetic */ iw6(int i, Map map) throws n1e {
        if (1 == (i & 1)) {
            this.a = map;
        } else {
            x7d.I(i, 1, gw6.a.getDescriptor());
            throw null;
        }
    }

    public iw6(HashMap map) {
        this.a = map;
    }
}
