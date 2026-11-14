package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class qjd {
    public static final qjd h = new ejd().a();
    public static final String i = "0";
    public static final String j = "1";
    public static final String k = "2";
    public static final String l = "3";
    public static final String m = "4";
    public static final String n = "5";
    public final String a;
    public final mjd b;
    public final mjd c;
    public final ljd d;
    public final vjd e;
    public final hjd f;
    public final njd g;

    public qjd(String str, hjd hjdVar, mjd mjdVar, ljd ljdVar, vjd vjdVar, njd njdVar) {
        this.a = str;
        this.b = mjdVar;
        this.c = mjdVar;
        this.d = ljdVar;
        this.e = vjdVar;
        this.f = hjdVar;
        this.g = njdVar;
    }

    public static qjd b(Bundle bundle) {
        hjd hjdVar;
        njd njdVar;
        hsh hshVarH;
        jjd jjdVar;
        djd djdVar;
        csh cshVarG;
        csh cshVarH;
        mjd mjdVar;
        String string = bundle.getString(i, "");
        string.getClass();
        Bundle bundle2 = bundle.getBundle(j);
        ljd ljdVarB = bundle2 == null ? ljd.f : ljd.b(bundle2);
        Bundle bundle3 = bundle.getBundle(k);
        vjd vjdVarB = bundle3 == null ? vjd.K : vjd.b(bundle3);
        Bundle bundle4 = bundle.getBundle(l);
        if (bundle4 == null) {
            hjdVar = hjd.r;
        } else {
            fjd fjdVar = new fjd();
            String str = gjd.j;
            gjd gjdVar = gjd.i;
            long j2 = gjdVar.a;
            long j3 = gjdVar.d;
            long j4 = gjdVar.b;
            long jN = tym.N(bundle4.getLong(str, j2));
            boolean z = true;
            z4o.w(jN >= 0);
            fjdVar.a = jN;
            long jN2 = tym.N(bundle4.getLong(gjd.k, gjdVar.c));
            z4o.w(jN2 == Long.MIN_VALUE || jN2 >= 0);
            fjdVar.c = jN2;
            fjdVar.b = bundle4.getBoolean(gjd.l, gjdVar.e);
            fjdVar.d = bundle4.getBoolean(gjd.m, gjdVar.f);
            fjdVar.e = bundle4.getBoolean(gjd.n, gjdVar.g);
            fjdVar.f = bundle4.getBoolean(gjd.q, gjdVar.h);
            long j5 = bundle4.getLong(gjd.o, j4);
            if (j5 != j4) {
                z4o.w(j5 >= 0);
                fjdVar.a = j5;
            }
            long j6 = bundle4.getLong(gjd.p, j3);
            if (j6 != j3) {
                if (j6 != Long.MIN_VALUE && j6 < 0) {
                    z = false;
                }
                z4o.w(z);
                fjdVar.c = j6;
            }
            hjdVar = new hjd(fjdVar);
        }
        hjd hjdVar2 = hjdVar;
        Bundle bundle5 = bundle.getBundle(m);
        if (bundle5 == null) {
            njdVar = njd.d;
        } else {
            ua7 ua7Var = new ua7((byte) 23, false);
            ua7Var.b = (Uri) bundle5.getParcelable(njd.e);
            ua7Var.c = bundle5.getString(njd.f);
            ua7Var.d = bundle5.getBundle(njd.g);
            njdVar = new njd(ua7Var);
        }
        njd njdVar2 = njdVar;
        Bundle bundle6 = bundle.getBundle(n);
        if (bundle6 == null) {
            mjdVar = null;
        } else {
            Bundle bundle7 = bundle6.getBundle(mjd.k);
            if (bundle7 == null) {
                jjdVar = null;
            } else {
                String string2 = bundle7.getString(jjd.k);
                string2.getClass();
                UUID uuidFromString = UUID.fromString(string2);
                Uri uri = (Uri) bundle7.getParcelable(jjd.l);
                String str2 = jjd.m;
                Bundle bundle8 = Bundle.EMPTY;
                Bundle bundle9 = bundle7.getBundle(str2);
                if (bundle9 == null) {
                    bundle9 = bundle8;
                }
                if (bundle9 == bundle8) {
                    hshVarH = hsh.d;
                } else {
                    HashMap map = new HashMap();
                    if (bundle9 != bundle8) {
                        for (String str3 : bundle9.keySet()) {
                            String string3 = bundle9.getString(str3);
                            if (string3 != null) {
                                map.put(str3, string3);
                            }
                        }
                    }
                    hshVarH = l1b.h(map);
                }
                boolean z2 = bundle7.getBoolean(jjd.n, false);
                boolean z3 = bundle7.getBoolean(jjd.o, false);
                boolean z4 = bundle7.getBoolean(jjd.p, false);
                String str4 = jjd.q;
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle7.getIntegerArrayList(str4);
                if (integerArrayList != null) {
                    arrayList = integerArrayList;
                }
                h1b h1bVarS = h1b.s(arrayList);
                byte[] byteArray = bundle7.getByteArray(jjd.r);
                ijd ijdVar = new ijd();
                ijdVar.d = uuidFromString;
                ijdVar.e = uri;
                ijdVar.f = l1b.h(hshVarH);
                ijdVar.a = z2;
                ijdVar.c = z4;
                ijdVar.b = z3;
                ijdVar.g = h1b.s(h1bVarS);
                ijdVar.h = byteArray != null ? Arrays.copyOf(byteArray, byteArray.length) : null;
                jjdVar = new jjd(ijdVar);
            }
            Bundle bundle10 = bundle6.getBundle(mjd.l);
            if (bundle10 == null) {
                djdVar = null;
            } else {
                Uri uri2 = (Uri) bundle10.getParcelable(djd.b);
                uri2.getClass();
                un8 un8Var = new un8();
                un8Var.a = uri2;
                djdVar = new djd(un8Var);
            }
            ArrayList parcelableArrayList = bundle6.getParcelableArrayList(mjd.m);
            if (parcelableArrayList == null) {
                a1b a1bVar = h1b.b;
                cshVarG = csh.e;
            } else {
                z0b z0bVarP = h1b.p();
                int i2 = 0;
                while (i2 < parcelableArrayList.size()) {
                    Bundle bundle11 = (Bundle) parcelableArrayList.get(i2);
                    bundle11.getClass();
                    z0bVarP.c(new zfk(bundle11.getInt(zfk.d, 0), bundle11.getInt(zfk.e, 0), bundle11.getInt(zfk.f, 0)));
                    i2++;
                    parcelableArrayList = parcelableArrayList;
                }
                cshVarG = z0bVarP.g();
            }
            csh cshVar = cshVarG;
            ArrayList parcelableArrayList2 = bundle6.getParcelableArrayList(mjd.o);
            if (parcelableArrayList2 == null) {
                a1b a1bVar2 = h1b.b;
                cshVarH = csh.e;
            } else {
                cshVarH = j14.H(new b10((byte) 18), parcelableArrayList2);
            }
            csh cshVar2 = cshVarH;
            long j7 = bundle6.getLong(mjd.p, -9223372036854775807L);
            Uri uri3 = (Uri) bundle6.getParcelable(mjd.i);
            uri3.getClass();
            mjdVar = new mjd(uri3, bundle6.getString(mjd.j), jjdVar, djdVar, cshVar, bundle6.getString(mjd.n), cshVar2, j7);
        }
        return new qjd(string, hjdVar2, mjdVar, ljdVarB, vjdVarB, njdVar2);
    }

    public final ejd a() {
        ijd ijdVar;
        ejd ejdVar = new ejd();
        fjd fjdVar = new fjd();
        hjd hjdVar = this.f;
        fjdVar.a = hjdVar.b;
        fjdVar.c = hjdVar.d;
        fjdVar.b = hjdVar.e;
        fjdVar.d = hjdVar.f;
        fjdVar.e = hjdVar.g;
        fjdVar.f = hjdVar.h;
        ejdVar.d = fjdVar;
        ejdVar.a = this.a;
        ejdVar.k = this.e;
        ejdVar.l = this.d.a();
        ejdVar.m = this.g;
        mjd mjdVar = this.b;
        if (mjdVar != null) {
            ejdVar.g = mjdVar.f;
            ejdVar.c = mjdVar.b;
            ejdVar.b = mjdVar.a;
            ejdVar.f = mjdVar.e;
            ejdVar.h = mjdVar.g;
            jjd jjdVar = mjdVar.c;
            if (jjdVar != null) {
                ijdVar = new ijd();
                ijdVar.d = jjdVar.a;
                ijdVar.e = jjdVar.c;
                ijdVar.f = jjdVar.e;
                ijdVar.a = jjdVar.f;
                ijdVar.b = jjdVar.g;
                ijdVar.c = jjdVar.h;
                ijdVar.g = jjdVar.i;
                ijdVar.h = jjdVar.j;
            } else {
                ijdVar = new ijd();
            }
            ejdVar.e = ijdVar;
            ejdVar.i = mjdVar.d;
            ejdVar.j = mjdVar.h;
        }
        return ejdVar;
    }

    public final Bundle c(boolean z) {
        mjd mjdVar;
        Bundle bundle = new Bundle();
        String str = this.a;
        if (!str.equals("")) {
            bundle.putString(i, str);
        }
        ljd ljdVar = ljd.f;
        ljd ljdVar2 = this.d;
        if (!ljdVar2.equals(ljdVar)) {
            bundle.putBundle(j, ljdVar2.c());
        }
        vjd vjdVar = vjd.K;
        vjd vjdVar2 = this.e;
        if (!vjdVar2.equals(vjdVar)) {
            bundle.putBundle(k, vjdVar2.c());
        }
        gjd gjdVar = gjd.i;
        hjd hjdVar = this.f;
        if (!hjdVar.equals(gjdVar)) {
            Bundle bundle2 = new Bundle();
            long j2 = hjdVar.a;
            if (j2 != gjdVar.a) {
                bundle2.putLong(gjd.j, j2);
            }
            long j3 = hjdVar.c;
            if (j3 != gjdVar.c) {
                bundle2.putLong(gjd.k, j3);
            }
            long j4 = hjdVar.b;
            if (j4 != gjdVar.b) {
                bundle2.putLong(gjd.o, j4);
            }
            long j5 = hjdVar.d;
            if (j5 != gjdVar.d) {
                bundle2.putLong(gjd.p, j5);
            }
            boolean z2 = hjdVar.e;
            if (z2 != gjdVar.e) {
                bundle2.putBoolean(gjd.l, z2);
            }
            boolean z3 = hjdVar.f;
            if (z3 != gjdVar.f) {
                bundle2.putBoolean(gjd.m, z3);
            }
            boolean z4 = hjdVar.g;
            if (z4 != gjdVar.g) {
                bundle2.putBoolean(gjd.n, z4);
            }
            boolean z5 = hjdVar.h;
            if (z5 != gjdVar.h) {
                bundle2.putBoolean(gjd.q, z5);
            }
            bundle.putBundle(l, bundle2);
        }
        njd njdVar = njd.d;
        njd njdVar2 = this.g;
        if (!njdVar2.equals(njdVar)) {
            Bundle bundle3 = new Bundle();
            Uri uri = njdVar2.a;
            if (uri != null) {
                bundle3.putParcelable(njd.e, uri);
            }
            String str2 = njdVar2.b;
            if (str2 != null) {
                bundle3.putString(njd.f, str2);
            }
            Bundle bundle4 = njdVar2.c;
            if (bundle4 != null) {
                bundle3.putBundle(njd.g, bundle4);
            }
            bundle.putBundle(m, bundle3);
        }
        if (z && (mjdVar = this.b) != null) {
            h1b h1bVar = mjdVar.g;
            List list = mjdVar.e;
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable(mjd.i, mjdVar.a);
            String str3 = mjdVar.b;
            if (str3 != null) {
                bundle5.putString(mjd.j, str3);
            }
            jjd jjdVar = mjdVar.c;
            if (jjdVar != null) {
                String str4 = mjd.k;
                h1b h1bVar2 = jjdVar.i;
                l1b l1bVar = jjdVar.e;
                Bundle bundle6 = new Bundle();
                bundle6.putString(jjd.k, jjdVar.a.toString());
                Uri uri2 = jjdVar.c;
                if (uri2 != null) {
                    bundle6.putParcelable(jjd.l, uri2);
                }
                if (!l1bVar.isEmpty()) {
                    String str5 = jjd.m;
                    Bundle bundle7 = new Bundle();
                    for (Map.Entry entry : l1bVar.entrySet()) {
                        bundle7.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    bundle6.putBundle(str5, bundle7);
                }
                boolean z6 = jjdVar.f;
                if (z6) {
                    bundle6.putBoolean(jjd.n, z6);
                }
                boolean z7 = jjdVar.g;
                if (z7) {
                    bundle6.putBoolean(jjd.o, z7);
                }
                boolean z8 = jjdVar.h;
                if (z8) {
                    bundle6.putBoolean(jjd.p, z8);
                }
                if (!h1bVar2.isEmpty()) {
                    bundle6.putIntegerArrayList(jjd.q, new ArrayList<>((Collection) h1bVar2));
                }
                byte[] bArr = jjdVar.j;
                if (bArr != null) {
                    bundle6.putByteArray(jjd.r, bArr);
                }
                bundle5.putBundle(str4, bundle6);
            }
            djd djdVar = mjdVar.d;
            if (djdVar != null) {
                String str6 = mjd.l;
                Bundle bundle8 = new Bundle();
                bundle8.putParcelable(djd.b, djdVar.a);
                bundle5.putBundle(str6, bundle8);
            }
            if (!list.isEmpty()) {
                bundle5.putParcelableArrayList(mjd.m, j14.q0(list, new b10((byte) 16)));
            }
            String str7 = mjdVar.f;
            if (str7 != null) {
                bundle5.putString(mjd.n, str7);
            }
            if (!h1bVar.isEmpty()) {
                bundle5.putParcelableArrayList(mjd.o, j14.q0(h1bVar, new b10((byte) 17)));
            }
            long j6 = mjdVar.h;
            if (j6 != -9223372036854775807L) {
                bundle5.putLong(mjd.p, j6);
            }
            bundle.putBundle(n, bundle5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qjd)) {
            return false;
        }
        qjd qjdVar = (qjd) obj;
        return Objects.equals(this.a, qjdVar.a) && this.f.equals(qjdVar.f) && Objects.equals(this.b, qjdVar.b) && this.d.equals(qjdVar.d) && Objects.equals(this.e, qjdVar.e) && Objects.equals(this.g, qjdVar.g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        mjd mjdVar = this.b;
        return this.g.hashCode() + ((this.e.hashCode() + ((this.f.hashCode() + ((this.d.hashCode() + ((iHashCode + (mjdVar != null ? mjdVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
