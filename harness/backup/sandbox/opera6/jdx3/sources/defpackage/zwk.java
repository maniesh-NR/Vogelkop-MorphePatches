package defpackage;

import J.N;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class zwk implements mo7, w6f {
    public final h7f a = new h7f();
    public boolean b;
    public e3j c;

    public static wyk b() {
        avj avjVar = cak.d;
        if (!avj.b(1)) {
            Set set = Collections.EMPTY_SET;
            return new wyk(set, set);
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        N.M4jBymYh(hashSet, hashSet2);
        return new wyk(hashSet, hashSet2);
    }

    public static boolean c(int i) {
        avj avjVar = cak.d;
        if (!avj.b(1)) {
            return false;
        }
        HashSet hashSet = new HashSet();
        N.M4jBymYh(hashSet, new HashSet());
        return hashSet.contains(new ne6(i, ""));
    }

    public static boolean e() {
        int iMhJnoDjg;
        avj avjVar = cak.d;
        return avj.b(1) && ((iMhJnoDjg = N.MhJnoDjg()) == 1 || iMhJnoDjg == 2 || iMhJnoDjg == 4 || iMhJnoDjg == 6);
    }

    public static boolean f() {
        avj avjVar = cak.d;
        if (!avj.b(1)) {
            return false;
        }
        int iMhJnoDjg = N.MhJnoDjg();
        if (iMhJnoDjg == 1 || iMhJnoDjg == 2) {
            return true;
        }
        if (iMhJnoDjg != 6) {
            return false;
        }
        return !i();
    }

    public static boolean g() {
        avj avjVar = cak.d;
        return avj.b(1) && !N.MYS4ja7X() && N.MwnyOuYt() && N.MIiwR271();
    }

    public static boolean h() {
        avj avjVar = cak.d;
        if (avj.b(1)) {
            return N.MYS4ja7X();
        }
        return true;
    }

    public static boolean i() {
        avj avjVar = cak.d;
        return avj.b(1) && N.MhJnoDjg() == 6 && (N.MIiwR271() || N.MYS4ja7X() || g());
    }

    @Override // defpackage.w6f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void F(ywk ywkVar) {
        this.a.b(ywkVar);
    }

    @Override // defpackage.w6f
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void H(ywk ywkVar) {
        this.a.c(ywkVar);
    }

    public final void k(Set set) {
        avj avjVar = cak.d;
        if (avj.b(1)) {
            int[] iArr = new int[set.size()];
            Iterator it = set.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = ((ne6) it.next()).a;
                i++;
            }
            N.MCwUkZBk(iArr);
            g7f g7fVar = new g7f(this.a);
            while (g7fVar.hasNext()) {
                ((ywk) g7fVar.next()).e(false);
            }
        }
    }

    @Override // defpackage.mo7
    public final void o(boolean z) {
        String str;
        String str2;
        c3j c3jVarD = ((d3j) this.c.i()).d(23, false);
        String str3 = c3jVarD != null ? (String) c3jVarD.d : null;
        c3j c3jVarD2 = ((d3j) this.c.i()).d(24, false);
        if (c3jVarD2 != null) {
            str2 = (String) c3jVarD2.d;
            str = (String) c3jVarD2.b;
        } else {
            str = null;
            str2 = null;
        }
        c3j c3jVarD3 = ((d3j) this.c.i()).d(25, false);
        String str4 = c3jVarD3 != null ? (String) c3jVarD3.d : null;
        if (TextUtils.isEmpty(str3)) {
            str3 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = null;
        }
        if (TextUtils.isEmpty(str4)) {
            str4 = null;
        }
        N.Mi6QnKEr(str3, str2, str4, TextUtils.isEmpty(str) ? null : str);
    }
}
