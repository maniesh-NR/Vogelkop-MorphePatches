package com.opera.android.browser;

/* loaded from: classes.dex */
public final class TabInfo {
    public final long a;
    public final long b;
    public final int c;
    public final int d;

    public TabInfo(int i, int i2, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = i2;
    }

    public static TabInfo a(TabInfo tabInfo, long j, int i, int i2, int i3) {
        long j2 = tabInfo.a;
        if ((i3 & 2) != 0) {
            j = tabInfo.b;
        }
        long j3 = j;
        if ((i3 & 4) != 0) {
            i = tabInfo.c;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = tabInfo.d;
        }
        tabInfo.getClass();
        return new TabInfo(i4, i2, j2, j3);
    }

    public static final TabInfo b() {
        return new TabInfo(0, 0, System.currentTimeMillis(), 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabInfo)) {
            return false;
        }
        TabInfo tabInfo = (TabInfo) obj;
        return this.a == tabInfo.a && this.b == tabInfo.b && this.c == tabInfo.c && this.d == tabInfo.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + rfp.c(this.c, z1m.e(Long.hashCode(this.a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        return "";
    }
}
