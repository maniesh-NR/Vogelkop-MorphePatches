package defpackage;

import J.N;
import ads_mobile_sdk.st3;
import com.opera.android.browser.NavigationEntry;
import com.opera.android.browser.NavigationHistory;
import com.opera.android.browser.chromium.ChromiumContent;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class ike implements jke {
    public final ArrayList a;
    public int b;

    public ike() {
        int[] iArr = {1516266761, 1142957872, 446044582, 1147282962, 861635011, -1643766350, 500618996, 1941690360, 410409117};
        int i = iArr[7] % iArr[8];
        this.a = new ArrayList();
        this.b = 0;
    }

    public ike(int i) {
        this.a = new ArrayList();
        this.b = i;
    }

    public ike(iuh iuhVar) {
        NavigationHistory navigationHistory = (NavigationHistory) iuhVar.b;
        this.a = new ArrayList(navigationHistory.d());
        this.b = navigationHistory.j();
        for (int i = 0; i < navigationHistory.d(); i++) {
            X(new hke(iuhVar.i(i)), false);
        }
    }

    @Override // defpackage.jke
    public final void B(ChromiumContent chromiumContent, int i, HashMap map) {
        if (this.a.size() <= 0) {
            return;
        }
        N.MwPSW0wv(chromiumContent.e(), this, map);
        chromiumContent.i();
    }

    @Override // defpackage.jke
    public final void X(NavigationEntry navigationEntry, boolean z) {
        ArrayList arrayList = this.a;
        if (z) {
            this.b = arrayList.size();
        }
        arrayList.add(navigationEntry);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: s3p */
    public final int a(long j) throws s3p {
        int[] iArr = {2001100545, 2130723407, 140753313, -149863858, -2003236720, 202391198, 23353437, 1141616124, 84353895};
        int i = iArr[0];
        int i2 = iArr[1];
        int iA = u0h.a(((~i) & i2) | iArr[2], (i & iArr[3]) | iArr[4], iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        long[] jArr = {269441500, 1994078854, 158128940, -158130045, -1992289935, 556430036, 8936987, 2147469841, 438792350};
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = j >= 0 ? (this.b + iA) - j : (((((((~j2) & j3) | j4) + ((j2 & j5) | jArr[4])) - jArr[5]) + jArr[6]) ^ (jArr[7] % jArr[8])) + (-j);
        if (j6 < 0 || j6 >= this.b) {
            throw new s3p();
        }
        return (int) j6;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: s3p */
    public final st3 a() throws s3p {
        int[] iArr = {91119157, 1459677288, 586253619, -183145911, -1567288443, 919325394, 146725508, 787086305, 459541652};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int iA = u0h.a(((~i) & i2) | i3, (i & i4) | iArr[4], iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        int i5 = this.b;
        if (i5 <= 0) {
            throw new s3p();
        }
        ArrayList arrayList = this.a;
        st3 st3Var = (st3) arrayList.get(i5 + iA);
        arrayList.set(this.b + iA, null);
        this.b += iA;
        return st3Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: l6p */
    public final void a(st3 st3Var) throws l6p {
        int[] iArr = {524133589, 740889625, 408955079, 621796408, 24562149, 1207357565, 297783268, 1066077375, 937558955};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int iA = u0h.a(((~i) & i2) | i3, (i & i4) | iArr[4], iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        int i5 = this.b;
        if (i5 >= iA) {
            throw new l6p();
        }
        ArrayList arrayList = this.a;
        if (i5 == arrayList.size()) {
            arrayList.add(st3Var);
        } else {
            arrayList.set(this.b, st3Var);
        }
        this.b++;
    }

    @Override // defpackage.jke
    public final void c() {
        ArrayList arrayList = this.a;
        if (arrayList.size() > 1) {
            NavigationEntry navigationEntryI = i(this.b);
            arrayList.clear();
            arrayList.add(navigationEntryI);
            this.b = 0;
        }
    }

    @Override // com.opera.android.browser.NavigationHistory
    public final int d() {
        return this.a.size();
    }

    @Override // com.opera.android.browser.NavigationHistory
    public final NavigationEntry i(int i) {
        return (NavigationEntry) this.a.get(i);
    }

    @Override // defpackage.jke
    public final boolean isDestroyed() {
        return false;
    }

    @Override // com.opera.android.browser.NavigationHistory
    public final int j() {
        return this.b;
    }

    @Override // defpackage.jke
    public final void l(int i) {
        this.b = i;
    }

    @Override // defpackage.jke
    public final void u() {
        int i = this.b + 1;
        ArrayList arrayList = this.a;
        if (i < arrayList.size()) {
            arrayList.subList(this.b + 1, arrayList.size()).clear();
        }
    }

    @Override // com.opera.android.browser.NavigationHistory
    public final boolean v(int i) {
        return false;
    }
}
