package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class exo {

    @NotNull
    public static final cxo Companion = new cxo();
    public static final KSerializer[] g = {null, null, null, null, null, new k72(rrb.a, (byte) 0)};
    public final String a;
    public final String b;
    public final huo c;
    public final jzo d;
    public final wwo e;
    public final List f;

    public exo(int i, String str, String str2, huo huoVar, jzo jzoVar, wwo wwoVar, List list) {
        if (60 != (i & 60)) {
            x7d.I(i, 60, bxo.b);
            throw null;
        }
        this.a = (i & 1) == 0 ? "2.14.0" : str;
        if ((i & 2) == 0) {
            this.b = fcp.f();
        } else {
            this.b = str2;
        }
        this.c = huoVar;
        this.d = jzoVar;
        this.e = wwoVar;
        this.f = list;
    }

    public exo(huo huoVar, jzo jzoVar, wwo wwoVar, List list) {
        String strF = fcp.f();
        this.a = "2.14.0";
        this.b = strF;
        this.c = huoVar;
        this.d = jzoVar;
        this.e = wwoVar;
        this.f = list;
    }
}
