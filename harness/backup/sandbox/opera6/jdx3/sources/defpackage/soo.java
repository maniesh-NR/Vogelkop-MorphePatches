package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class soo extends p8p {

    @NotNull
    public static final ymo Companion = new ymo();
    public static final KSerializer[] k = {null, null, new k72(fuo.Companion.serializer(), (byte) 0), null};
    public final String g;
    public final String h;
    public final List i;
    public final int j;

    public soo(int i, int i2, String str, String str2, List list) {
        if (15 != (i & 15)) {
            x7d.I(i, 15, kmo.b);
            throw null;
        }
        this.g = str;
        this.h = str2;
        this.i = list;
        this.j = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public soo(String str, String str2, ArrayList arrayList, int i) {
        super("bid");
        urj urjVar = wlp.b;
        this.g = str;
        this.h = str2;
        this.i = arrayList;
        this.j = i;
    }
}
