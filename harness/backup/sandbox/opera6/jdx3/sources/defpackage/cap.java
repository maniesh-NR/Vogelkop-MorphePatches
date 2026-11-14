package defpackage;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class cap extends p8p {

    @NotNull
    public static final o9p Companion = new o9p();
    public static final KSerializer[] m = {null, null, null, fuo.Companion.serializer(), null, null};
    public final String g;
    public final String h;
    public final String i;
    public final fuo j;
    public final String k;
    public final Boolean l;

    public cap(int i, String str, String str2, String str3, fuo fuoVar, String str4, Boolean bool) {
        if (15 != (i & 15)) {
            x7d.I(i, 15, k9p.b);
            throw null;
        }
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = fuoVar;
        if ((i & 16) == 0) {
            this.k = null;
        } else {
            this.k = str4;
        }
        if ((i & 32) == 0) {
            this.l = null;
        } else {
            this.l = bool;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cap(String str, String str2, String str3, fuo fuoVar, String str4, Boolean bool) {
        super("load_in_webview");
        urj urjVar = wlp.b;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = fuoVar;
        this.k = str4;
        this.l = bool;
    }
}
