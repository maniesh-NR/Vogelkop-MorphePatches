package defpackage;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class xjo extends p8p {

    @NotNull
    public static final fho Companion = new fho();
    public static final KSerializer[] k = {null, null, null, fuo.Companion.serializer()};
    public final String g;
    public final String h;
    public final String i;
    public final fuo j;

    public xjo(int i, String str, String str2, String str3, fuo fuoVar) {
        if (15 != (i & 15)) {
            x7d.I(i, 15, mgo.b);
            throw null;
        }
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = fuoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xjo(String str, String str2, String str3, fuo fuoVar) {
        super("attached");
        urj urjVar = wlp.b;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = fuoVar;
    }
}
