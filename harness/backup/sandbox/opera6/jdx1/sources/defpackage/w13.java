package defpackage;

import android.os.Bundle;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class w13 extends hp implements v23 {
    public final fq j;
    public final List k;
    public final ukh l;
    public final boolean m;

    public w13(String str, LinkedHashSet linkedHashSet, String str2, LinkedHashMap linkedHashMap, Bundle bundle, HashSet hashSet, HashSet hashSet2, LinkedHashMap linkedHashMap2, String str3, fq fqVar, List list, ukh ukhVar, boolean z) {
        super(str, linkedHashSet, str2, linkedHashMap, bundle, hashSet, hashSet2, linkedHashMap2, str3);
        this.j = fqVar;
        this.k = list;
        this.l = ukhVar;
        this.m = z;
    }

    @Override // defpackage.v23
    public final ukh c() {
        return this.l;
    }

    @Override // defpackage.v23
    public final boolean g() {
        return this.m;
    }

    @Override // defpackage.v23
    public final List h() {
        return this.k;
    }

    @Override // defpackage.v23
    public final fq l() {
        return this.j;
    }
}
