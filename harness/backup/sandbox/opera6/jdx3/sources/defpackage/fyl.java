package defpackage;

import com.leanplum.core.BuildConfig;

/* loaded from: classes.dex */
public final class fyl {
    public static final fyl d = new fyl(new eyl[0]);
    public static final String e;
    public final int a;
    public final csh b;
    public int c;

    static {
        String str = tym.a;
        e = BuildConfig.BUILD_NUMBER;
    }

    public fyl(eyl... eylVarArr) {
        csh cshVarT = h1b.t(eylVarArr);
        this.b = cshVarT;
        this.a = eylVarArr.length;
        int i = 0;
        while (i < cshVarT.d) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < cshVarT.d; i3++) {
                if (((eyl) cshVarT.get(i)).equals(cshVarT.get(i3))) {
                    w7d.r("", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final eyl a(int i) {
        return (eyl) this.b.get(i);
    }

    public final int b(eyl eylVar) {
        int iIndexOf = this.b.indexOf(eylVar);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fyl.class != obj.getClass()) {
            return false;
        }
        fyl fylVar = (fyl) obj;
        return this.a == fylVar.a && this.b.equals(fylVar.b);
    }

    public final int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.b.hashCode();
        this.c = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return this.b.toString();
    }
}
