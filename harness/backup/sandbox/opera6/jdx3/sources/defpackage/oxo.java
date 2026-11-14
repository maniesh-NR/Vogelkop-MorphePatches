package defpackage;

import android.content.Context;
import android.preference.PreferenceManager;
import com.leanplum.internal.ResourceQualifiers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class oxo {
    public static final oxo a = new oxo();
    public static final List b = Arrays.asList(5, 7);
    public static final List c;
    public static final List d;
    public static final List e;
    public static final zyk f;
    public static final List g;
    public static final List h;
    public static final zyk i;

    static {
        Integer numValueOf = Integer.valueOf(ResourceQualifiers.Qualifier.AnonymousClass14.DENSITY_XXHIGH);
        c = Arrays.asList(new Pair(320, numValueOf), new Pair(numValueOf, 320), new Pair(720, 1080));
        d = Arrays.asList("image/gif", "image/jpeg", "image/jpg", "image/png", "image/webp", "text/html");
        e = Arrays.asList("image/gif", "image/jpeg", "image/jpg", "image/png", "image/webp");
        f = z4c.b(a43.M);
        g = Arrays.asList(2, 3, 5, 6, 7, 8);
        h = Arrays.asList(1, 2, 3);
        i = z4c.b(a43.L);
    }

    public static huo a(Context context) {
        xto xtoVar = new xto(ynh.c, ynh.d);
        String strB = yro.b(context);
        return new huo(ynh.e, yro.a(context), context.getPackageName(), yro.c(context), xtoVar, strB != null ? new rto(strB) : null);
    }

    public static mwo b(wjo wjoVar, int i2) {
        if ((i2 & 2) != 0) {
            wjoVar = wjo.REGULAR;
        }
        return new mwo(new qwo(null, Integer.valueOf(wjoVar.a)));
    }

    public static wwo c(Context context, boolean z) {
        String string;
        String strA = uip.a(context);
        if (z) {
            List list = r8p.a;
            string = PreferenceManager.getDefaultSharedPreferences(context).getString("IABTCF_TCString", null);
        } else {
            string = null;
        }
        String str = aap.f().K;
        return new wwo(strA, string, str != null ? new zwo(str) : null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: vjo */
    /* JADX WARN: Multi-variable type inference failed */
    public static j1p d(sm smVar, eq eqVar, String str, Boolean bool) throws vjo {
        int i2;
        int i3;
        j1p j1pVar;
        k0p k0pVar;
        y0p y0pVar;
        v0p v0pVar;
        String str2;
        k0p k0pVar2;
        y0p y0pVar2;
        Unit unit;
        Object obj;
        y0p y0pVar3;
        int iIntValue;
        int iIntValue2;
        int i4 = 1;
        int i5 = bwo.a[smVar.ordinal()];
        zyk zykVar = f;
        List list = b;
        List list2 = d;
        switch (i5) {
            case 1:
                i2 = 1;
                i3 = 0;
                j1pVar = null;
                k0pVar = null;
                y0pVar = null;
                v0pVar = new v0p((String) i.getValue());
                break;
            case 2:
                i2 = 1;
                i3 = 0;
                if (eqVar != null) {
                    k0p k0pVar3 = new k0p(Collections.singletonList(new o0p(eqVar.a, eqVar.b)), list2, list);
                    if (eq.g.contains(eqVar)) {
                        k0pVar2 = k0pVar3;
                        obj = null;
                        y0pVar3 = new y0p((List) zykVar.getValue(), g, eqVar.a, eqVar.b, 2, 0, !Intrinsics.a(bool, Boolean.FALSE) ? Collections.singletonList(2) : Arrays.asList(1, 2), 0, list, h);
                    } else {
                        obj = null;
                        k0pVar2 = k0pVar3;
                        y0pVar3 = null;
                    }
                    y0p y0pVar4 = y0pVar3;
                    unit = Unit.a;
                    y0pVar2 = y0pVar4;
                    str2 = obj;
                } else {
                    str2 = 0;
                    k0pVar2 = null;
                    y0pVar2 = null;
                    unit = null;
                }
                if (unit == null) {
                    throw new vjo(102, str2);
                }
                k0pVar = k0pVar2;
                v0pVar = str2;
                y0pVar = y0pVar2;
                j1pVar = str2;
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                List<Pair> list3 = c;
                ArrayList arrayList = new ArrayList(k95.o(list3, 10));
                for (Pair pair : list3) {
                    arrayList.add(new o0p(((Number) pair.a).intValue(), ((Number) pair.b).intValue()));
                    i4 = i4;
                }
                i2 = i4;
                k0p k0pVar4 = new k0p(arrayList, list2, list);
                List list4 = (List) zykVar.getValue();
                if (eqVar != null) {
                    iIntValue = eqVar.a;
                    iIntValue2 = eqVar.b;
                } else {
                    iIntValue = ((Number) ((Pair) list3.get(0)).a).intValue();
                    iIntValue2 = ((Number) ((Pair) list3.get(0)).b).intValue();
                }
                int i6 = iIntValue;
                i3 = 0;
                j1pVar = null;
                v0pVar = null;
                k0pVar = k0pVar4;
                y0pVar = new y0p(list4, g, i6, iIntValue2, 5, smVar == sm.f ? 0 : i2, !Intrinsics.a(bool, Boolean.FALSE) ? Collections.singletonList(2) : Arrays.asList(1, 2), 7, list, h);
                break;
            default:
                i2 = 1;
                i3 = 0;
                j1pVar = null;
                k0pVar = null;
                y0pVar = null;
                v0pVar = null;
                break;
        }
        String strValueOf = String.valueOf(i2);
        int[] iArr = bwo.a;
        int i7 = iArr[smVar.ordinal()];
        int i8 = 6;
        int i9 = (i7 == 3 || i7 == 4 || i7 == 5 || i7 == 6) ? i2 : i3;
        int i10 = iArr[smVar.ordinal()];
        int i11 = (i10 == 4 || i10 == 5) ? i2 : i3;
        switch (iArr[smVar.ordinal()]) {
            case 1:
                i8 = 2;
                break;
            case 2:
                i8 = i2;
                break;
            case 3:
                i8 = 3;
                break;
            case 4:
                i8 = 4;
                break;
            case 5:
                break;
            case 6:
                i8 = 5;
                break;
            default:
                h9o.p();
                return j1pVar;
        }
        return new j1p(strValueOf, k0pVar, y0pVar, v0pVar, i9, str, i11, new s0p(i8));
    }

    public static Object e(Context context, kuk kukVar) {
        cv6 cv6Var = bb7.a;
        return na2.Z(s6d.a.e, new ty7(context, null, (byte) 3), kukVar);
    }

    public static hwo g(Context context) {
        Integer q0iVar;
        int iIntValue;
        Integer num = mzg.a;
        try {
            p0i p0iVar = t0i.b;
            List list = r8p.a;
            q0iVar = Integer.valueOf(PreferenceManager.getDefaultSharedPreferences(context).getInt("IABTCF_gdprApplies", -1));
        } catch (Throwable th) {
            p0i p0iVar2 = t0i.b;
            q0iVar = new q0i(th);
        }
        String str = null;
        if (t0i.d(q0iVar) != null) {
            try {
                List list2 = r8p.a;
                String string = PreferenceManager.getDefaultSharedPreferences(context).getString("IABTCF_gdprApplies", null);
                q0iVar = string != null ? Integer.valueOf(Integer.parseInt(string)) : null;
            } catch (Throwable th2) {
                p0i p0iVar3 = t0i.b;
                q0iVar = new q0i(th2);
            }
        }
        if (q0iVar instanceof q0i) {
            q0iVar = null;
        }
        Integer num2 = q0iVar;
        if (num2 == null || ((iIntValue = num2.intValue()) != 0 && iIntValue != 1)) {
            num2 = null;
        }
        List list3 = r8p.a;
        String string2 = PreferenceManager.getDefaultSharedPreferences(context).getString("IABUSPrivacy_String", null);
        if (string2 != null && string2.length() == 4) {
            int i2 = 0;
            if (string2.charAt(0) == '1') {
                String strY = pik.y(1, string2);
                while (true) {
                    if (i2 >= strY.length()) {
                        str = string2;
                        break;
                    }
                    char cCharAt = strY.charAt(i2);
                    if (cCharAt != 'Y' && cCharAt != 'N' && cCharAt != '-') {
                        break;
                    }
                    i2++;
                }
            }
        }
        return new hwo(num, num2, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(android.content.Context r15, java.lang.String r16, defpackage.sm r17, java.lang.String r18, defpackage.eq r19, defpackage.wjo r20, java.lang.Boolean r21, defpackage.ako r22, nt5 r23) {
        /*
            r14 = this;
            r0 = r23
            boolean r1 = r0 instanceof defpackage.gwo
            if (r1 == 0) goto L15
            r1 = r0
            gwo r1 = (defpackage.gwo) r1
            int r2 = r1.v
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.v = r2
            goto L1a
        L15:
            gwo r1 = new gwo
            r1.<init>(r14, r0)
        L1a:
            java.lang.Object r14 = r1.t
            px5 r0 = px5.a
            int r2 = r1.v
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            ybh.y(r14)
            goto L57
        L29:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r14)
            r14 = 0
            return r14
        L30:
            ybh.y(r14)
            cv6 r14 = bb7.a
            d7a r14 = s6d.a
            d7a r14 = r14.e
            lwo r4 = new lwo
            r7 = 0
            r10 = r15
            r13 = r16
            r5 = r17
            r12 = r18
            r6 = r19
            r8 = r20
            r11 = r21
            r9 = r22
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1.v = r3
            java.lang.Object r14 = na2.Z(r14, r4, r1)
            if (r14 != r0) goto L57
            return r0
        L57:
            t0i r14 = (t0i) r14
            java.lang.Object r14 = r14.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oxo.f(android.content.Context, java.lang.String, sm, java.lang.String, eq, wjo, java.lang.Boolean, ako, nt5):java.lang.Object");
    }
}
