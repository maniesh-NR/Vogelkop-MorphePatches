package defpackage;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class tep extends p8p {

    @NotNull
    public static final kep Companion = new kep();
    public static final KSerializer[] l = {null, null, null, fuo.Companion.serializer(), null};
    public final String g;
    public final String h;
    public final String i;
    public final fuo j;
    public final Double k;

    public tep(int i, fuo fuoVar, Double d, String str, String str2, String str3) {
        if (15 != (i & 15)) {
            x7d.I(i, 15, hep.b);
            throw null;
        }
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = fuoVar;
        if ((i & 16) == 0) {
            this.k = null;
        } else {
            this.k = d;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tep(String str, String str2, String str3, fuo fuoVar, Double d) {
        super("viewable");
        urj urjVar = wlp.b;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = fuoVar;
        this.k = d;
    }
}
