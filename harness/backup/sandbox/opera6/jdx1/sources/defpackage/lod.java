package defpackage;

import android.util.SparseBooleanArray;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class lod {
    public static final o3j e;
    public static final cig f;
    public final o3j a;
    public final cig b;
    public final h1b c;
    public final h1b d;

    static {
        HashSet hashSet = new HashSet();
        csh cshVar = n3j.d;
        for (int i = 0; i < cshVar.d; i++) {
            hashSet.add(new n3j(((Integer) cshVar.get(i)).intValue()));
        }
        e = new o3j(hashSet);
        HashSet hashSet2 = new HashSet();
        csh cshVar2 = n3j.e;
        for (int i2 = 0; i2 < cshVar2.d; i2++) {
            hashSet2.add(new n3j(((Integer) cshVar2.get(i2)).intValue()));
        }
        for (int i3 = 0; i3 < cshVar.d; i3++) {
            hashSet2.add(new n3j(((Integer) cshVar.get(i3)).intValue()));
        }
        new o3j(hashSet2);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i4 : eme.b) {
            z4o.H(!false);
            sparseBooleanArray.append(i4, true);
        }
        z4o.H(!false);
        f = new cig(new w69(sparseBooleanArray));
    }

    public lod(o3j o3jVar, cig cigVar, h1b h1bVar, h1b h1bVar2) {
        this.a = o3jVar;
        this.b = cigVar;
        this.c = h1bVar;
        this.d = h1bVar2;
    }
}
