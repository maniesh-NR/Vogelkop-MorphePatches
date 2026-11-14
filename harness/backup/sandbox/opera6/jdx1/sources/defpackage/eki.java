package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class eki {

    @NotNull
    public static final dki Companion = new dki();
    public static final KSerializer[] c = {null, new k72(mx4.a, (byte) 0)};
    public final k2j a;
    public final List b;

    public /* synthetic */ eki(int i, k2j k2jVar, List list) throws n1e {
        if (3 != (i & 3)) {
            x7d.I(i, 3, cki.a.getDescriptor());
            throw null;
        }
        this.a = k2jVar;
        this.b = list;
    }

    public eki(k2j k2jVar, ArrayList arrayList) {
        this.a = k2jVar;
        this.b = arrayList;
    }
}
