package defpackage;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class izo extends p8p {

    @NotNull
    public static final ryo Companion = new ryo();
    public static final KSerializer[] m = {null, null, null, new i58("com.opera.ads.AdFormat", sm.values()), fuo.Companion.serializer(), null};
    public final String g;
    public final String h;
    public final String i;
    public final sm j;
    public final fuo k;
    public final wjp l;

    public izo(int i, String str, String str2, String str3, sm smVar, fuo fuoVar, wjp wjpVar) {
        if (63 != (i & 63)) {
            x7d.I(i, 63, oyo.b);
            throw null;
        }
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = smVar;
        this.k = fuoVar;
        this.l = wjpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izo(String str, String str2, String str3, sm smVar, fuo fuoVar, wjp wjpVar) {
        super("click_coords");
        urj urjVar = wlp.b;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = smVar;
        this.k = fuoVar;
        this.l = wjpVar;
    }
}
