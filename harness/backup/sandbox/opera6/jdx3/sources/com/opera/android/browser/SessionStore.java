package com.opera.android.browser;

import J.N;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.opera.android.Lazy;
import defpackage.b2l;
import defpackage.d7l;
import defpackage.enh;
import defpackage.gke;
import defpackage.i4j;
import defpackage.j4j;
import defpackage.j6l;
import defpackage.k4j;
import defpackage.k6l;
import defpackage.nrl;
import defpackage.qz;
import defpackage.zy3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class SessionStore implements j6l {
    public static final i4j h = new i4j();
    public static final j4j i = new j4j(0, 0);
    public static SessionStore j;
    public final long a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final qz d = new qz(this, 25);
    public final nrl e = new nrl((byte) 26);
    public k6l f;
    public boolean g;

    public SessionStore(long j2) {
        this.a = j2;
        N.MsCkLV0r(j2, this);
    }

    public static void addRecentlyClosedTab(@NonNull List<enh> list, int i2, int i3, @NonNull String str, @Nullable String str2, boolean z) {
        list.add(new enh(str2, str, i2, i3, !z));
    }

    public static void addToIdMap(@NonNull Map<Integer, Integer> map, int i2, int i3) {
        map.put(Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static void createBrowserActivityInstance(long j2) {
        j = new SessionStore(j2);
    }

    public static boolean getIsOverridingUserAgent(@NonNull BrowserTabState browserTabState, int i2) {
        return ((zy3) browserTabState.c.get(i2)).e;
    }

    private long getNativePointer() {
        return this.a;
    }

    @Nullable
    public static byte[] getPageState(@NonNull BrowserTabState browserTabState, int i2) {
        return ((zy3) browserTabState.c.get(i2)).f;
    }

    @NonNull
    public static Class<TabInfo> getTabInfoClass() {
        return TabInfo.class;
    }

    @Nullable
    public static String getTitle(@NonNull BrowserTabState browserTabState, int i2) {
        return ((zy3) browserTabState.c.get(i2)).c;
    }

    @NonNull
    public static String getUrl(@NonNull BrowserTabState browserTabState, int i2) {
        return ((zy3) browserTabState.c.get(i2)).b;
    }

    @Nullable
    public static byte[] getUserData(@NonNull BrowserTabState browserTabState, int i2) {
        return ((zy3) browserTabState.c.get(i2)).g;
    }

    @NonNull
    public static String getVirtualUrl(@NonNull BrowserTabState browserTabState, int i2) {
        return ((zy3) browserTabState.c.get(i2)).d;
    }

    @Override // defpackage.j6l
    public final void H(b2l b2lVar, b2l b2lVar2, int i2) {
        boolean zM = ((d7l) b2lVar2).j.m();
        long j2 = this.a;
        if (zM) {
            N.MGVFxWjx(j2);
        } else {
            N.MvqRhr_p(j2, ((d7l) b2lVar2).j.getId());
        }
    }

    @Override // defpackage.j6l
    public final void L(b2l b2lVar, boolean z) {
        if (((d7l) b2lVar).j.m()) {
            return;
        }
        long j2 = this.a;
        if (!z) {
            d7l d7lVar = (d7l) b2lVar;
            if (d7lVar.J()) {
                N.MC2F5Efx(j2, d7lVar.j.getId());
                return;
            }
        }
        N.MKH2wY$N(j2, ((d7l) b2lVar).j.getId());
    }

    public final void a(boolean z) {
        this.c.clear();
        this.b.clear();
        N.MoPqae2N(this.a, z);
        if (z) {
            return;
        }
        this.g = true;
    }

    public final j4j b(int i2) {
        Integer numValueOf = Integer.valueOf(i2);
        HashMap map = this.b;
        j4j j4jVar = (j4j) map.get(numValueOf);
        if (j4jVar != null) {
            return j4jVar;
        }
        N.MAgWVLVE(this.a, i2);
        j4j j4jVar2 = (j4j) map.get(Integer.valueOf(i2));
        return j4jVar2 == null ? i : j4jVar2;
    }

    public final void c(BrowserTabState browserTabState) {
        int i2 = browserTabState.a;
        int i3 = browserTabState.b;
        N.MCfyeHpi(this.a, i2, 0);
        ArrayList arrayList = browserTabState.c;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            int i6 = i4 + 1;
            zy3 zy3Var = (zy3) arrayList.get(i4);
            N.ME167Gpi(this.a, i2, i5, zy3Var.b, zy3Var.d, zy3Var.c, zy3Var.e, zy3Var.f, zy3Var.g, i5 == i3);
            i5++;
            i4 = i6;
        }
    }

    @NonNull
    public final TabInfo createInfo(long j2, long j3, int i2, int i3) {
        return new TabInfo(i2, i3, j2, j3);
    }

    @NonNull
    public final TabInfo createInfoForMigratedTab() {
        return new TabInfo(0, 0, System.currentTimeMillis(), 0L);
    }

    @NonNull
    public final SessionRestore$State createRestoredSession(@NonNull int[] iArr, @NonNull TabInfo[] tabInfoArr, int i2, long j2) {
        if (iArr.length != 0 && tabInfoArr.length == iArr.length) {
            ArrayList arrayList = new ArrayList(iArr.length);
            for (int i3 = 0; i3 < iArr.length; i3++) {
                arrayList.add(new k4j(this, iArr[i3], tabInfoArr[i3]));
            }
            return new SessionRestore$State(new n9g(i2, arrayList), j2);
        }
        return SessionRestore$State.b();
    }

    @Override // defpackage.j6l
    public final void h(b2l b2lVar, int i2) {
        if (((d7l) b2lVar).j.m()) {
            return;
        }
        N.MP5454nI(this.a, ((d7l) b2lVar).j.getId(), i2);
    }

    public final void initializeNextTabId(@NonNull Lazy lazy) {
        SharedPreferences sharedPreferences = (SharedPreferences) lazy.get();
        int i2 = sharedPreferences.getInt("next_tab_id", -2147483647);
        long j2 = this.a;
        N.M0NWz$2e(j2, i2);
        if (sharedPreferences.contains("next_tab_id")) {
            N.Ml0K9PX$(j2);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.remove("next_tab_id");
            editorEdit.apply();
        }
    }

    public final void injectNavigationEntry(int i2, int i3, @NonNull String str, @NonNull String str2, @Nullable String str3, boolean z, @Nullable byte[] bArr, @Nullable byte[] bArr2) {
        Integer numValueOf = Integer.valueOf(i2);
        HashMap map = this.c;
        Map map2 = (Map) map.get(numValueOf);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(Integer.valueOf(i2), map2);
        }
        map2.put(Integer.valueOf(i3), new gke((-i3) - 1, str, str2, str3, z, bArr, bArr2, (byte) 1));
    }

    public final void injectNavigationHistory(int i2, int i3, int i4) {
        this.b.put(Integer.valueOf(i2), new j4j(i3, i4));
    }

    public final void invalidate(int i2) {
        this.c.remove(Integer.valueOf(i2));
        this.b.remove(Integer.valueOf(i2));
    }

    @Override // defpackage.j6l
    public final void o(b2l b2lVar, int i2, boolean z) {
        if (z) {
            return;
        }
        d7l d7lVar = (d7l) b2lVar;
        if (d7lVar.j.m()) {
            return;
        }
        N.MT62gZM7(this.a, d7lVar.j.getId(), i2);
        TabInfo tabInfoA = d7lVar.j.a();
        N.Mbsb$YyE(this.a, d7lVar.j.getId(), tabInfoA.a, tabInfoA.b, tabInfoA.c, tabInfoA.d);
    }

    @Override // defpackage.j6l
    public final void onDestroy() {
        this.f = null;
    }

    public final void onSessionLoaded() {
        this.e.K();
    }
}
