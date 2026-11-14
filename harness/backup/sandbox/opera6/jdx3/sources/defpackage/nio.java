package defpackage;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class nio extends p8p {

    @NotNull
    public static final kio Companion = new kio();
    public static final KSerializer[] k = {null, null, null, fuo.Companion.serializer()};
    public final String g;
    public final String h;
    public final String i;
    public final fuo j;

    public nio(int i, String str, String str2, String str3, fuo fuoVar) {
        if (15 != (i & 15)) {
            x7d.I(i, 15, jio.b);
            throw null;
        }
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = fuoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nio(String str, String str2, String str3, fuo fuoVar) {
        super("wvvm_adChoice");
        urj urjVar = wlp.b;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = fuoVar;
    }
}
