package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class bdp extends p8p {

    @NotNull
    public static final tcp Companion = new tcp();
    public static final KSerializer[] p = {null, null, null, null, null, null, new k72(fuo.Companion.serializer(), (byte) 0), new k72(xhk.a, (byte) 0), null};
    public final String g;
    public final int h;
    public final int i;
    public final String j;
    public final Boolean k;
    public final String l;
    public final List m;
    public final List n;
    public final int o;

    public bdp(int i, String str, int i2, int i3, String str2, Boolean bool, String str3, List list, List list2, int i4) {
        if (495 != (i & 495)) {
            x7d.I(i, 495, rcp.b);
            throw null;
        }
        this.g = str;
        this.h = i2;
        this.i = i3;
        this.j = str2;
        if ((i & 16) == 0) {
            this.k = null;
        } else {
            this.k = bool;
        }
        this.l = str3;
        this.m = list;
        this.n = list2;
        this.o = i4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdp(String str, int i, int i2, String str2, Boolean bool, String str3, List list, List list2, int i3) {
        super("request");
        urj urjVar = wlp.b;
        this.g = str;
        this.h = i;
        this.i = i2;
        this.j = str2;
        this.k = bool;
        this.l = str3;
        this.m = list;
        this.n = list2;
        this.o = i3;
    }
}
