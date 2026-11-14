package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class vb5 {
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public final n3j a;
    public final int b;
    public final int c;
    public final int d;
    public final Uri e;
    public final CharSequence f;
    public final Bundle g;
    public final y0b h;
    public final boolean i;
    public final Object j;

    static {
        String str = tym.a;
        k = "0";
        l = "1";
        m = "2";
        n = "3";
        o = "4";
        p = "5";
        q = "6";
        r = "7";
        s = "8";
        t = "9";
    }

    public vb5(n3j n3jVar, int i, int i2, int i3, Uri uri, CharSequence charSequence, Bundle bundle, boolean z, y0b y0bVar, Object obj) {
        this.a = n3jVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = uri;
        this.f = charSequence;
        this.g = new Bundle(bundle);
        this.i = z;
        this.h = y0bVar;
        this.j = obj;
    }

    public static vb5 b(n3j n3jVar) throws NumberFormatException {
        String str = n3jVar.b;
        Bundle bundle = n3jVar.c;
        if (!str.startsWith("androidx.media3.session.PLAYER_COMMAND_")) {
            int i = Integer.parseInt(str.substring(40));
            Object objI = i("androidx.media3.session.CUSTOM_COMMAND_PARAMETER", i == 40010 ? 5 : 0, bundle);
            ub5 ub5Var = new ub5();
            ub5Var.m(new n3j(i), objI);
            return ub5Var.k();
        }
        int i2 = Integer.parseInt(str.substring(39));
        Object objI2 = i("androidx.media3.session.CUSTOM_COMMAND_PARAMETER", j(i2), bundle);
        ub5 ub5Var2 = new ub5();
        z4o.v("sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.", ((n3j) ub5Var2.f) == null);
        ub5Var2.d = i2;
        ub5Var2.c = m(j(i2), objI2);
        return ub5Var2.k();
    }

    public static csh e(List list, o3j o3jVar, cig cigVar) {
        int i;
        z0b z0bVar = new z0b(4);
        for (int i2 = 0; i2 < list.size(); i2++) {
            vb5 vb5Var = (vb5) list.get(i2);
            n3j n3jVar = vb5Var.a;
            if ((n3jVar == null || !o3jVar.a.contains(n3jVar)) && ((i = vb5Var.b) == -1 || !cigVar.a(i))) {
                if (vb5Var.i) {
                    vb5Var = new vb5(vb5Var.a, vb5Var.b, vb5Var.c, vb5Var.d, vb5Var.e, vb5Var.f, new Bundle(vb5Var.g), false, vb5Var.h, vb5Var.j);
                }
                z0bVar.c(vb5Var);
            } else {
                z0bVar.c(vb5Var);
            }
        }
        return z0bVar.g();
    }

    public static vb5 g(int i, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(k);
        n3j n3jVarA = bundle2 == null ? null : n3j.a(bundle2);
        int i2 = bundle.getInt(l, -1);
        int i3 = bundle.getInt(m, 0);
        CharSequence charSequence = bundle.getCharSequence(n, "");
        Bundle bundle3 = bundle.getBundle(o);
        boolean z = i < 3 || bundle.getBoolean(p, true);
        Uri uri = (Uri) bundle.getParcelable(q);
        int i4 = bundle.getInt(r, 0);
        int[] intArray = bundle.getIntArray(s);
        ub5 ub5Var = new ub5(i4, i3);
        String str = t;
        if (n3jVarA != null) {
            ub5Var.m(n3jVarA, i(str, n3jVarA.a == 40010 ? 5 : 0, bundle));
        }
        if (i2 != -1) {
            Object objI = i(str, j(i2), bundle);
            z4o.v("sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.", ((n3j) ub5Var.f) == null);
            ub5Var.d = i2;
            ub5Var.c = m(j(i2), objI);
        }
        if (uri != null && (Objects.equals(uri.getScheme(), "content") || Objects.equals(uri.getScheme(), "android.resource"))) {
            z4o.v("Only content or resource Uris are supported for CommandButton", Objects.equals(uri.getScheme(), "content") || Objects.equals(uri.getScheme(), "android.resource"));
            ub5Var.g = uri;
        }
        ub5Var.h = charSequence;
        if (bundle3 == null) {
            bundle3 = Bundle.EMPTY;
        }
        ub5Var.i = new Bundle(bundle3);
        ub5Var.b = z;
        if (intArray == null) {
            intArray = new int[]{6};
        }
        z4o.w(intArray.length != 0);
        y0b y0bVar = y0b.c;
        ub5Var.j = intArray.length == 0 ? y0b.c : new y0b(Arrays.copyOf(intArray, intArray.length));
        return ub5Var.k();
    }

    public static csh h(List list, boolean z, boolean z2) {
        int iD;
        if (list.isEmpty()) {
            a1b a1bVar = h1b.b;
            return csh.e;
        }
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < list.size(); i3++) {
            vb5 vb5Var = (vb5) list.get(i3);
            boolean z3 = vb5Var.i;
            y0b y0bVar = vb5Var.h;
            if (z3 && vb5Var.a()) {
                int i4 = 0;
                while (true) {
                    if (i4 >= y0bVar.b || (iD = y0bVar.d(i4)) == 6) {
                        break;
                    }
                    if (z && i == -1 && iD == 2) {
                        i = i3;
                        break;
                    }
                    if (z2 && i2 == -1 && iD == 3) {
                        i2 = i3;
                        break;
                    }
                    i4++;
                }
            }
        }
        z0b z0bVarP = h1b.p();
        if (i != -1) {
            z0bVarP.c(((vb5) list.get(i)).c(2));
        }
        if (i2 != -1) {
            z0bVarP.c(((vb5) list.get(i2)).c(3));
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            vb5 vb5Var2 = (vb5) list.get(i5);
            if (vb5Var2.i && vb5Var2.a() && i5 != i && i5 != i2) {
                y0b y0bVar2 = vb5Var2.h;
                y0bVar2.getClass();
                int i6 = 0;
                while (true) {
                    if (i6 >= y0bVar2.b) {
                        i6 = -1;
                        break;
                    }
                    if (y0bVar2.a[i6] == 6) {
                        break;
                    }
                    i6++;
                }
                if (i6 >= 0) {
                    z0bVarP.c(vb5Var2.c(6));
                }
            }
        }
        return z0bVarP.g();
    }

    public static Object i(String str, int i, Bundle bundle) {
        if (!bundle.containsKey(str)) {
            return null;
        }
        switch (i) {
            case 5:
                Bundle bundle2 = bundle.getBundle(str);
                bundle2.getClass();
                break;
            case 6:
                Bundle bundle3 = bundle.getBundle(str);
                bundle3.getClass();
                break;
            case 7:
                Bundle bundle4 = bundle.getBundle(str);
                bundle4.getClass();
                break;
            case 8:
                Bundle bundle5 = bundle.getBundle(str);
                bundle5.getClass();
                break;
        }
        return null;
    }

    public static int j(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 5) {
            return 1;
        }
        if (i == 10) {
            return 2;
        }
        if (i == 19) {
            return 7;
        }
        if (i == 24) {
            return 4;
        }
        if (i == 29) {
            return 8;
        }
        if (i == 31) {
            return 6;
        }
        switch (i) {
            case 13:
                return 4;
            case 14:
                return 3;
            case 15:
                return 2;
            default:
                return 0;
        }
    }

    public static boolean k(String str) {
        return str.startsWith("androidx.media3.session.PLAYER_COMMAND_") || str.startsWith("androidx.media3.session.SESSION_COMMAND_");
    }

    public static Object m(int i, Object obj) {
        if (obj == null) {
            return null;
        }
        switch (i) {
            case 1:
                if (obj instanceof Integer) {
                    obj = Long.valueOf(((Integer) obj).longValue());
                }
                z4o.v("Parameter has incorrect type.", obj instanceof Long);
                break;
            case 2:
                z4o.v("Parameter has incorrect type.", obj instanceof Integer);
                break;
            case 3:
                z4o.v("Parameter has incorrect type.", obj instanceof Boolean);
                break;
            case 4:
                if (obj instanceof Double) {
                    obj = Float.valueOf(((Double) obj).floatValue());
                }
                z4o.v("Parameter has incorrect type.", obj instanceof Float);
                break;
            case 5:
                z4o.v("Parameter has incorrect type.", obj instanceof xjh);
                break;
            case 6:
                z4o.v("Parameter has incorrect type.", obj instanceof qjd);
                break;
            case 7:
                z4o.v("Parameter has incorrect type.", obj instanceof vjd);
                break;
            case 8:
                z4o.v("Parameter has incorrect type.", obj instanceof nyl);
                break;
        }
        return obj;
    }

    public final boolean a() {
        Object obj = this.j;
        n3j n3jVar = this.a;
        if (n3jVar != null) {
            int i = n3jVar.a;
            if (i != 0) {
                return i == 40010 && obj != null;
            }
            return true;
        }
        int i2 = this.b;
        if (i2 != 19) {
            if (i2 != 24) {
                if (i2 != 29 && i2 != 31) {
                    switch (i2) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 11:
                        case 12:
                        case 14:
                            break;
                        case 5:
                        case 10:
                        case 13:
                        case 15:
                            break;
                        default:
                            return false;
                    }
                }
            }
            return true;
        }
        return obj != null;
    }

    public final vb5 c(int i) {
        String str;
        n3j n3jVar = this.a;
        if (n3jVar != null && n3jVar.a == 0) {
            return d(new y0b(new int[]{i}));
        }
        Bundle bundle = Bundle.EMPTY;
        if (this.j != null) {
            bundle = new Bundle();
            n(bundle, "androidx.media3.session.CUSTOM_COMMAND_PARAMETER");
        }
        if (n3jVar != null) {
            str = "androidx.media3.session.SESSION_COMMAND_" + n3jVar.a;
        } else {
            str = "androidx.media3.session.PLAYER_COMMAND_" + this.b;
        }
        return new vb5(new n3j(str, bundle), -1, this.c, this.d, this.e, this.f, this.g, this.i, new y0b(new int[]{i}), null);
    }

    public final vb5 d(y0b y0bVar) {
        if (this.h.equals(y0bVar)) {
            return this;
        }
        return new vb5(this.a, this.b, this.c, this.d, this.e, this.f, new Bundle(this.g), this.i, y0bVar, this.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vb5)) {
            return false;
        }
        vb5 vb5Var = (vb5) obj;
        return Objects.equals(this.a, vb5Var.a) && this.b == vb5Var.b && this.c == vb5Var.c && this.d == vb5Var.d && Objects.equals(this.e, vb5Var.e) && TextUtils.equals(this.f, vb5Var.f) && this.i == vb5Var.i && this.h.equals(vb5Var.h) && Objects.equals(this.j, vb5Var.j);
    }

    public final void f(gig gigVar) {
        if (this.i) {
            Object obj = this.j;
            int i = this.b;
            if (i == 19) {
                if (obj != null) {
                    gigVar.B((vjd) obj);
                    return;
                }
                return;
            }
            if (i == 24) {
                if (obj != null) {
                    gigVar.setVolume(((Float) obj).floatValue());
                    return;
                } else if (gigVar.V() == 0.0f) {
                    gigVar.t();
                    return;
                } else {
                    gigVar.J();
                    return;
                }
            }
            if (i == 29) {
                if (obj != null) {
                    gigVar.m((nyl) obj);
                    return;
                }
                return;
            }
            if (i == 31) {
                if (obj != null) {
                    gigVar.E((qjd) obj);
                    return;
                }
                return;
            }
            switch (i) {
                case 1:
                    if (obj == null) {
                        gigVar.setPlayWhenReady(!gigVar.getPlayWhenReady());
                        break;
                    } else {
                        gigVar.setPlayWhenReady(((Boolean) obj).booleanValue());
                        break;
                    }
                case 2:
                    gigVar.a();
                    break;
                case 3:
                    gigVar.stop();
                    break;
                case 4:
                    gigVar.seekToDefaultPosition();
                    break;
                case 5:
                    if (obj != null) {
                        gigVar.seekTo(((Long) obj).longValue());
                        break;
                    }
                    break;
                case 6:
                    gigVar.h();
                    break;
                case 7:
                    gigVar.r();
                    break;
                case 8:
                    gigVar.u();
                    break;
                case 9:
                    gigVar.M();
                    break;
                case 10:
                    if (obj != null) {
                        gigVar.seekToDefaultPosition(((Integer) obj).intValue());
                        break;
                    }
                    break;
                case 11:
                    gigVar.p0();
                    break;
                case 12:
                    gigVar.o0();
                    break;
                case 13:
                    if (obj != null) {
                        gigVar.b(((Float) obj).floatValue());
                        break;
                    }
                    break;
                case 14:
                    if (obj == null) {
                        gigVar.setShuffleModeEnabled(!gigVar.getShuffleModeEnabled());
                        break;
                    } else {
                        gigVar.setShuffleModeEnabled(((Boolean) obj).booleanValue());
                        break;
                    }
                case 15:
                    if (obj != null) {
                        gigVar.setRepeatMode(((Integer) obj).intValue());
                        break;
                    }
                    break;
            }
        }
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.f, Boolean.valueOf(this.i), this.e, this.h, this.j);
    }

    public final Bundle l() {
        Bundle bundle = new Bundle();
        n3j n3jVar = this.a;
        if (n3jVar != null) {
            bundle.putBundle(k, n3jVar.b());
        }
        int i = this.b;
        if (i != -1) {
            bundle.putInt(l, i);
        }
        int i2 = this.c;
        if (i2 != 0) {
            bundle.putInt(r, i2);
        }
        int i3 = this.d;
        if (i3 != 0) {
            bundle.putInt(m, i3);
        }
        CharSequence charSequence = this.f;
        if (charSequence != "") {
            bundle.putCharSequence(n, charSequence);
        }
        Bundle bundle2 = this.g;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(o, bundle2);
        }
        Uri uri = this.e;
        if (uri != null) {
            bundle.putParcelable(q, uri);
        }
        boolean z = this.i;
        if (!z) {
            bundle.putBoolean(p, z);
        }
        y0b y0bVar = this.h;
        if (y0bVar.b != 1 || y0bVar.d(0) != 6) {
            bundle.putIntArray(s, Arrays.copyOfRange(y0bVar.a, 0, y0bVar.b));
        }
        if (this.j != null) {
            n(bundle, t);
        }
        return bundle;
    }

    public final void n(Bundle bundle, String str) {
        n3j n3jVar = this.a;
        int iJ = n3jVar != null ? n3jVar.a == 40010 ? 5 : 0 : j(this.b);
        Object obj = this.j;
        switch (iJ) {
            case 1:
                bundle.putLong(str, ((Long) obj).longValue());
                break;
            case 2:
                bundle.putInt(str, ((Integer) obj).intValue());
                break;
            case 3:
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                break;
            case 4:
                bundle.putFloat(str, ((Float) obj).floatValue());
                break;
            case 5:
                bundle.putBundle(str, ((xjh) obj).c());
                break;
            case 6:
                bundle.putBundle(str, ((qjd) obj).c(false));
                break;
            case 7:
                bundle.putBundle(str, ((vjd) obj).c());
                break;
            case 8:
                bundle.putBundle(str, ((nyl) obj).c());
                break;
        }
    }
}
