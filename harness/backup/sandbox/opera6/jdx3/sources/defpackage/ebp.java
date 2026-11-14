package defpackage;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class ebp extends p8p {

    @NotNull
    public static final vap Companion = new vap();
    public static final KSerializer[] m = {null, null, null, fuo.Companion.serializer(), null, null};
    public final String g;
    public final String h;
    public final String i;
    public final fuo j;
    public final Double k;
    public final int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ebp(int i, fuo fuoVar, Double d, String str, String str2, String str3) {
        super("render");
        urj urjVar = wlp.b;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = fuoVar;
        this.k = d;
        this.l = i;
    }

    public ebp(int i, String str, String str2, String str3, fuo fuoVar, Double d, int i2) {
        if (47 != (i & 47)) {
            x7d.I(i, 47, uap.b);
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
        this.l = i2;
    }
}
