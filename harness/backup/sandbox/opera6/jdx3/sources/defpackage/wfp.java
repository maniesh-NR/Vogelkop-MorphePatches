package defpackage;

import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class wfp extends p8p {

    @NotNull
    public static final kfp Companion = new kfp();
    public static final KSerializer[] q = {null, null, null, fuo.Companion.serializer(), null, null, null, null, null, null};
    public final String g;
    public final String h;
    public final String i;
    public final fuo j;
    public final String k;
    public final Boolean l;
    public final Double m;
    public final Integer n;
    public final Long o;
    public final Long p;

    public wfp(int i, String str, String str2, String str3, fuo fuoVar, String str4, Boolean bool, Double d, Integer num, Long l, Long l2) {
        if (15 != (i & 15)) {
            x7d.I(i, 15, ifp.b);
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
        if ((i & 64) == 0) {
            this.m = null;
        } else {
            this.m = d;
        }
        if ((i & ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL) == 0) {
            this.n = null;
        } else {
            this.n = num;
        }
        if ((i & Constants.Crypt.KEY_LENGTH) == 0) {
            this.o = null;
        } else {
            this.o = l;
        }
        if ((i & 512) == 0) {
            this.p = null;
        } else {
            this.p = l2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wfp(String str, String str2, String str3, fuo fuoVar, String str4, Boolean bool, Double d, Integer num, Long l, Long l2) {
        super("visible");
        urj urjVar = wlp.b;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = fuoVar;
        this.k = str4;
        this.l = bool;
        this.m = d;
        this.n = num;
        this.o = l;
        this.p = l2;
    }
}
