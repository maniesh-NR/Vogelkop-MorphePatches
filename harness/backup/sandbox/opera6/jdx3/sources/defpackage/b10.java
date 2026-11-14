package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Pair;
import com.leanplum.utils.SizeUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class b10 implements xq9 {
    public final /* synthetic */ byte a;

    public /* synthetic */ b10(byte b) {
        this.a = b;
    }

    public final Object apply(Object obj) {
        ljd ljdVarB;
        int i;
        switch (this.a) {
            case 0:
                return ((c10) obj).a;
            case 1:
                cn8 cn8Var = (cn8) obj;
                cn8Var.getClass();
                return cn8Var.getClass().getSimpleName();
            case 2:
                return ((fi4) obj).b;
            case 3:
                return ((kq4) obj).b.getIssuedTo().getCName();
            case 4:
                e15 e15Var = (e15) obj;
                return new bre(3, e15Var.a, e15Var.b, e15Var.c, e15Var.d);
            case 5:
                return ((d15) obj).b;
            case 6:
                return ((g15) obj).a;
            case 7:
                return Integer.valueOf(((x36) obj).r);
            case 8:
                long j = ((a46) obj).b;
                return Long.valueOf(j != -9223372036854775807L ? j : 0L);
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return h1b.v(Integer.valueOf(((b05) obj).a));
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                fyl fylVar = (fyl) obj;
                fylVar.getClass();
                Bundle bundle = new Bundle();
                String str = fyl.e;
                csh cshVar = fylVar.b;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(cshVar.d);
                a1b a1bVarU = cshVar.u(0);
                while (a1bVarU.hasNext()) {
                    arrayList.add(((eyl) a1bVarU.next()).d());
                }
                bundle.putParcelableArrayList(str, arrayList);
                return bundle;
            case 11:
                return new el6((kzk) obj);
            case 12:
                jzb jzbVar = (jzb) obj;
                return jzbVar.a + ": " + jzbVar.b;
            case 13:
            case SizeUtil.textSize2 /* 24 */:
                return (byl) obj;
            case 14:
                sfa sfaVar = (sfa) obj;
                sfaVar.j();
                return h1b.s(nb6.W(new bql((byte) 2), sfaVar.I.b));
            case 15:
                return ((i0c) obj).a;
            case 16:
                zfk zfkVar = (zfk) obj;
                zfkVar.getClass();
                Bundle bundle2 = new Bundle();
                int i2 = zfkVar.a;
                if (i2 != 0) {
                    bundle2.putInt(zfk.d, i2);
                }
                int i3 = zfkVar.b;
                if (i3 != 0) {
                    bundle2.putInt(zfk.e, i3);
                }
                int i4 = zfkVar.c;
                if (i4 != 0) {
                    bundle2.putInt(zfk.f, i4);
                }
                return bundle2;
            case 17:
                pjd pjdVar = (pjd) obj;
                pjdVar.getClass();
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable(pjd.h, pjdVar.a);
                String str2 = pjdVar.b;
                if (str2 != null) {
                    bundle3.putString(pjd.i, str2);
                }
                String str3 = pjdVar.c;
                if (str3 != null) {
                    bundle3.putString(pjd.j, str3);
                }
                int i5 = pjdVar.d;
                if (i5 != 0) {
                    bundle3.putInt(pjd.k, i5);
                }
                int i6 = pjdVar.e;
                if (i6 != 0) {
                    bundle3.putInt(pjd.l, i6);
                }
                String str4 = pjdVar.f;
                if (str4 != null) {
                    bundle3.putString(pjd.m, str4);
                }
                String str5 = pjdVar.g;
                if (str5 != null) {
                    bundle3.putString(pjd.n, str5);
                }
                return bundle3;
            case SizeUtil.textSize0_1 /* 18 */:
                Bundle bundle4 = (Bundle) obj;
                Uri uri = (Uri) bundle4.getParcelable(pjd.h);
                uri.getClass();
                String string = bundle4.getString(pjd.i);
                String string2 = bundle4.getString(pjd.j);
                int i7 = bundle4.getInt(pjd.k, 0);
                int i8 = bundle4.getInt(pjd.l, 0);
                String string3 = bundle4.getString(pjd.m);
                String string4 = bundle4.getString(pjd.n);
                mw7 mw7Var = new mw7();
                mw7Var.c = uri;
                mw7Var.d = dzd.p(string);
                mw7Var.e = string2;
                mw7Var.a = i7;
                mw7Var.b = i8;
                mw7Var.f = string3;
                mw7Var.g = string4;
                return new pjd(mw7Var);
            case 19:
                String str6 = (String) obj;
                if (fsd.g.e(str6) && !str6.isEmpty()) {
                    return str6;
                }
                StringBuilder sb = new StringBuilder(str6.length() + 16);
                sb.append('\"');
                for (int i9 = 0; i9 < str6.length(); i9++) {
                    char cCharAt = str6.charAt(i9);
                    if (cCharAt == '\r' || cCharAt == '\\' || cCharAt == '\"') {
                        sb.append('\\');
                    }
                    sb.append(cCharAt);
                }
                sb.append('\"');
                return sb.toString();
            case SizeUtil.textSize0 /* 20 */:
                s1b s1bVar = (Collection) obj;
                int i10 = s1b.d;
                if (s1bVar instanceof s1b) {
                    return s1bVar;
                }
                boolean z = s1bVar instanceof s1b;
                int size = z ? ((ish) s1bVar).o().size() : 11;
                q1b q1bVar = new q1b();
                q1bVar.b = false;
                k6f k6fVar = new k6f();
                k6fVar.d(size);
                q1bVar.a = k6fVar;
                if (z) {
                    s1b s1bVar2 = s1bVar;
                    ljdVarB = s1bVar2 instanceof ish ? ((ish) s1bVar2).e : null;
                    if (ljdVarB != null) {
                        k6fVar.a(Math.max(k6fVar.c, ((k6f) ljdVarB).c));
                        if (((k6f) ljdVarB).c != 0) {
                            i = -1;
                            while (i >= 0) {
                                z4o.A(i, ((k6f) ljdVarB).c);
                                Object obj2 = ((k6f) ljdVarB).a[i];
                                z4o.A(i, ((k6f) ljdVarB).c);
                                q1bVar.c(((k6f) ljdVarB).b[i], obj2);
                                i++;
                                if (i >= ((k6f) ljdVarB).c) {
                                }
                            }
                        }
                        i = -1;
                    } else {
                        u1b u1bVarP = s1bVar2.p();
                        k6f k6fVar2 = q1bVar.a;
                        k6fVar2.a(Math.max(k6fVar2.c, u1bVarP.size()));
                        for (j6f j6fVar : s1bVar2.p()) {
                            q1bVar.c(j6fVar.a(), j6fVar.a);
                        }
                    }
                } else {
                    Iterator it = s1bVar.iterator();
                    while (it.hasNext()) {
                        q1bVar.a(it.next());
                    }
                }
                Objects.requireNonNull(q1bVar.a);
                if (q1bVar.a.c == 0) {
                    return ish.h;
                }
                q1bVar.b = true;
                return new ish(q1bVar.a);
            case 21:
                return Long.valueOf(((a46) obj).b);
            case SizeUtil.textSize1 /* 22 */:
                return Long.valueOf(((a46) obj).c);
            case 23:
                return h1b.s(nb6.W(new bql((byte) 2), ((nkd) obj).getTrackGroups().b));
            case 25:
                lvg lvgVar = (lvg) obj;
                return new Pair(p8f.J(lvgVar.a), p8f.J(lvgVar.b));
            case 26:
                hq8 hq8Var = (hq8) obj;
                return !hq8Var.j() ? new vkj(hq8Var) : new tkj((tq8) hq8Var);
            case 27:
                return ((hq8) obj).i(p6l.a);
            case 28:
                return Long.valueOf(((ilh) obj).a);
            default:
                Bundle bundle5 = (Bundle) obj;
                Bundle bundle6 = bundle5.getBundle(fql.s);
                qjd qjdVarB = bundle6 != null ? qjd.b(bundle6) : qjd.h;
                long j2 = bundle5.getLong(fql.t, -9223372036854775807L);
                long j3 = bundle5.getLong(fql.u, -9223372036854775807L);
                long j4 = bundle5.getLong(fql.v, -9223372036854775807L);
                boolean z2 = bundle5.getBoolean(fql.w, false);
                boolean z3 = bundle5.getBoolean(fql.x, false);
                Bundle bundle7 = bundle5.getBundle(fql.y);
                ljdVarB = bundle7 != null ? ljd.b(bundle7) : null;
                boolean z4 = bundle5.getBoolean(fql.z, false);
                long j5 = bundle5.getLong(fql.A, 0L);
                long j6 = bundle5.getLong(fql.B, -9223372036854775807L);
                int i11 = bundle5.getInt(fql.C, 0);
                int i12 = bundle5.getInt(fql.D, 0);
                long j7 = bundle5.getLong(fql.E, 0L);
                fql fqlVar = new fql();
                fqlVar.b(fql.q, qjdVarB, (Object) null, j2, j3, j4, z2, z3, ljdVarB, j5, j6, i11, i12, j7);
                fqlVar.j = z4;
                return fqlVar;
        }
    }
}
