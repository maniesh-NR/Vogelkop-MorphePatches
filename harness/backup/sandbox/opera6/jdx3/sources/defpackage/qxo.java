package defpackage;

import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import java.util.List;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class qxo extends p8p {

    @NotNull
    public static final yvo Companion = new yvo();
    public static final KSerializer[] q = {null, null, null, fuo.Companion.serializer(), null, null, null, new k72(xhk.a, (byte) 0), null};
    public final String g;
    public final String h;
    public final String i;
    public final fuo j;
    public final String k;
    public final Integer l;
    public final String m;
    public final String n;
    public final List o;
    public final String p;

    public qxo(int i, String str, String str2, String str3, fuo fuoVar, Integer num, String str4, String str5, List list, String str6) {
        if (15 != (i & 15)) {
            x7d.I(i, 15, svo.b);
            throw null;
        }
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = fuoVar;
        this.k = null;
        if ((i & 16) == 0) {
            this.l = null;
        } else {
            this.l = num;
        }
        if ((i & 32) == 0) {
            this.m = null;
        } else {
            this.m = str4;
        }
        if ((i & 64) == 0) {
            this.n = null;
        } else {
            this.n = str5;
        }
        if ((i & ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL) == 0) {
            this.o = null;
        } else {
            this.o = list;
        }
        if ((i & Constants.Crypt.KEY_LENGTH) == 0) {
            this.p = null;
        } else {
            this.p = str6;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxo(String str, String str2, String str3, fuo fuoVar, String str4, Integer num) {
        super("bpis");
        urj urjVar = wlp.b;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = fuoVar;
        this.k = str4;
        this.l = num;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = str4 != null ? pik.D(255, str4) : null;
    }
}
