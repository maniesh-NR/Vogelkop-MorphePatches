package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class yz {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final yo i;
    public final rm j;
    public final i3j k;
    public final String l;
    public final long m;
    public uz n;
    public final dl o;
    public dl p;
    public tz q;
    public ap r;

    public yz(String str, String str2, String str3, String str4, String str5, String str6, String str7, dl dlVar, String str8, yo yoVar, rm rmVar, i3j i3jVar, ap apVar) {
        String string = UUID.randomUUID().toString();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.o = dlVar;
        this.h = str8;
        this.i = yoVar;
        this.j = rmVar;
        this.l = string;
        this.m = jElapsedRealtime;
        this.k = i3jVar;
        this.r = apVar;
    }

    public void b() {
        i3j i3jVar = this.k;
        HashMap map = (HashMap) i3jVar.b;
        ((WeakHashMap) ((zy9) i3jVar.c).a).remove(this);
        if (!p()) {
            c();
            return;
        }
        px pxVar = new px(this);
        List arrayList = (List) map.get(pxVar);
        int i = 0;
        if (arrayList == null) {
            arrayList = new ArrayList(1);
            map.put(pxVar, arrayList);
        } else {
            int size = arrayList.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                if (((yz) arrayList.get(size)).m <= this.m) {
                    i = size + 1;
                    break;
                }
                size--;
            }
        }
        arrayList.add(i, this);
        this.q = null;
    }

    public void c() {
    }

    public boolean d(iq iqVar) {
        int iOrdinal = iqVar.ordinal();
        return iOrdinal == 0 || iOrdinal == 1;
    }

    public v50 e() {
        return v50.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        yz yzVar = (yz) obj;
        return TextUtils.equals(this.f, yzVar.f) && TextUtils.equals(this.g, yzVar.g) && this.i == yzVar.i && this.j == yzVar.j && TextUtils.equals(this.l, yzVar.l);
    }

    public String f() {
        return null;
    }

    public String g() {
        return null;
    }

    public final dl h() {
        dl dlVar = this.p;
        return dlVar != null ? dlVar : this.o;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f, this.g, this.i, this.j, this.l});
    }

    public vz i() {
        return null;
    }

    public String j() {
        return null;
    }

    public List k() {
        return Collections.EMPTY_LIST;
    }

    public String l() {
        return null;
    }

    public long m() {
        return 0L;
    }

    public String n() {
        return this.a;
    }

    public boolean o() {
        return false;
    }

    public boolean p() {
        return !q();
    }

    public abstract boolean q();

    public final boolean r(String str) {
        uz uzVar = this.n;
        return uzVar != null && TextUtils.equals(uzVar.a, str);
    }

    public boolean s() {
        return false;
    }

    public boolean t() {
        return false;
    }
}
