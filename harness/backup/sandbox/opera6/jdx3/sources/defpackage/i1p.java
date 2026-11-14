package defpackage;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class i1p extends p8p {

    @NotNull
    public static final j0p Companion = new j0p();
    public static final KSerializer[] n = {null, null, null, fuo.Companion.serializer(), null, null, null};
    public final String g;
    public final String h;
    public final String i;
    public final fuo j;
    public final String k;
    public final String l;
    public final String m;

    public i1p(int i, String str, String str2, String str3, fuo fuoVar, String str4, String str5, String str6) {
        if (63 != (i & 63)) {
            x7d.I(i, 63, d0p.b);
            throw null;
        }
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = fuoVar;
        this.k = str4;
        this.l = str5;
        if ((i & 64) == 0) {
            this.m = null;
        } else {
            this.m = str6;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1p(String str, String str2, String str3, fuo fuoVar, String str4, String str5, String str6) {
        super("click");
        urj urjVar = wlp.b;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = fuoVar;
        this.k = str4;
        this.l = str5;
        this.m = str6;
    }
}
