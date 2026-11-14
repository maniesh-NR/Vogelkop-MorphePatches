package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class bfa extends cfa {
    public final String l;
    public final h1b m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bfa(long j, String str, String str2, long j2, String str3) {
        this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j, j2, false, csh.e);
        a1b a1bVar = h1b.b;
    }

    public bfa(String str, bfa bfaVar, String str2, long j, int i, long j2, vl7 vl7Var, String str3, String str4, long j3, long j4, boolean z, List list) {
        super(str, bfaVar, j, i, j2, vl7Var, str3, str4, j3, j4, z);
        this.l = str2;
        this.m = h1b.s(list);
    }
}
