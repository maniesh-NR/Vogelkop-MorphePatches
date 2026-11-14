package defpackage;

import com.leanplum.internal.ResourceQualifiers;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class rro extends p8p {

    @NotNull
    public static final oqo Companion = new oqo();
    public final String g;
    public final int h;
    public final int i;
    public final String j;
    public final Boolean k;
    public final String l;
    public final String m;
    public final String n;

    public rro(int i, String str, int i2, int i3, String str2, Boolean bool, String str3, String str4, String str5) {
        if (15 != (i & 15)) {
            x7d.I(i, 15, lqo.b);
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
        if ((i & 32) == 0) {
            this.l = null;
        } else {
            this.l = str3;
        }
        if ((i & 64) == 0) {
            this.m = null;
        } else {
            this.m = str4;
        }
        if ((i & ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL) == 0) {
            this.n = null;
        } else {
            this.n = str5;
        }
    }
}
