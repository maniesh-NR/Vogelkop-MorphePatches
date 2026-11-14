package defpackage;

import android.os.Bundle;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public abstract class r83 {
    public final LinkedHashSet a;
    public final String b;
    public final LinkedHashMap c;
    public final Bundle d;
    public final HashSet e;
    public final HashSet f;
    public final LinkedHashMap g;
    public final String h;

    public r83(String str, LinkedHashSet linkedHashSet, String str2, LinkedHashMap linkedHashMap, Bundle bundle, HashSet hashSet, HashSet hashSet2, LinkedHashMap linkedHashMap2, String str3) {
        this.a = linkedHashSet;
        this.b = str2;
        this.c = linkedHashMap;
        this.d = bundle;
        this.e = hashSet;
        this.f = hashSet2;
        this.g = linkedHashMap2;
        this.h = str3;
    }

    public abstract String m();
}
