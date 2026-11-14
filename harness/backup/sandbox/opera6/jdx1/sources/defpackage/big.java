package defpackage;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class big {
    public static final bx1 q = new bx1((byte) 1);
    public final Context a;
    public final zhg b;
    public final SparseArray c;
    public final boolean d;
    public final ay6 e;
    public final kzk f;
    public final CopyOnWriteArraySet g;
    public final long h;
    public final b4n i;
    public i1 j = new i1();
    public szk k;
    public Pair l;
    public int m;
    public byte n;
    public long o;
    public int p;

    public big(whg whgVar) {
        this.a = whgVar.a;
        zhg zhgVar = whgVar.c;
        zhgVar.getClass();
        this.b = zhgVar;
        this.c = new SparseArray();
        a1b a1bVar = h1b.b;
        csh cshVar = csh.e;
        this.d = whgVar.d;
        kzk kzkVar = whgVar.e;
        this.f = kzkVar;
        long j = whgVar.g;
        this.h = j != -9223372036854775807L ? -j : -9223372036854775807L;
        b4n b4nVar = whgVar.h;
        this.i = b4nVar;
        this.e = new ay6(whgVar.b, b4nVar, kzkVar);
        this.g = new CopyOnWriteArraySet();
        new oj9(new nj9());
        this.o = -9223372036854775807L;
        this.p = -1;
        this.n = (byte) 0;
    }
}
