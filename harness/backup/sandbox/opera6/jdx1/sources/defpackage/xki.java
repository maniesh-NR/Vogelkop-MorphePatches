package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class xki implements Function1 {
    public final /* synthetic */ byte a;

    public /* synthetic */ xki(byte b) {
        this.a = b;
    }

    public final Object invoke(Object obj) {
        rf1 rf1Var;
        int i = 0;
        ez7Var = null;
        ez7 ez7Var = null;
        jajVar = null;
        jaj jajVar = null;
        vjlVar = null;
        vjl vjlVar = null;
        nfcVar = null;
        nfc nfcVar = null;
        ofcVar = null;
        ofc ofcVar = null;
        hpmVar = null;
        hpm hpmVar = null;
        r1nVar = null;
        r1n r1nVar = null;
        rwjVar = null;
        rwj rwjVar = null;
        yzfVar = null;
        yzf yzfVar = null;
        switch (this.a) {
            case 0:
                List list = (List) obj;
                Object obj2 = list.get(0);
                skl[] sklVarArr = rkl.b;
                Function1 function1 = zki.v.b;
                Boolean bool = Boolean.FALSE;
                Intrinsics.a(obj2, bool);
                long j = (obj2 != null ? (rkl) function1.invoke(obj2) : null).a;
                Object obj3 = list.get(1);
                Intrinsics.a(obj3, bool);
                return new wil(j, (obj3 != null ? (rkl) function1.invoke(obj3) : null).a);
            case 1:
                return new ki9(((Integer) obj).intValue());
            case 2:
                return new ua3(((Float) obj).floatValue());
            case 3:
                List list2 = (List) obj;
                Object obj4 = list2.get(0);
                int iIntValue = (obj4 != null ? (Integer) obj4 : null).intValue();
                Object obj5 = list2.get(1);
                return new xjl(upj.c(iIntValue, (obj5 != null ? (Integer) obj5 : null).intValue()));
            case 4:
                List list3 = (List) obj;
                Object obj6 = list3.get(0);
                int i2 = u95.h;
                Boolean bool2 = Boolean.FALSE;
                Intrinsics.a(obj6, bool2);
                long j2 = (obj6 != null ? Intrinsics.a(obj6, Boolean.FALSE) ? new u95(u95.g) : new u95(cs5.c(((Integer) obj6).intValue())) : null).a;
                Object obj7 = list3.get(1);
                yki ykiVar = zki.x;
                Intrinsics.a(obj7, bool2);
                long j3 = (obj7 != null ? (y8f) ykiVar.b.invoke(obj7) : null).a;
                Object obj8 = list3.get(2);
                return new jaj(j2, j3, (obj8 != null ? (Float) obj8 : null).floatValue());
            case 5:
                return new pel(((Integer) obj).intValue());
            case 6:
                List list4 = (List) obj;
                Object obj9 = list4.get(0);
                String str = obj9 != null ? (String) obj9 : null;
                Object obj10 = list4.get(1);
                return new ofc(str, (Intrinsics.a(obj10, Boolean.FALSE) || obj10 == null) ? null : (tjl) zki.i.b.invoke(obj10), null, 4);
            case 7:
                return new jgl(((Integer) obj).intValue());
            case 8:
                return new pra(((Integer) obj).intValue());
            case 9:
                List list5 = (List) obj;
                ArrayList arrayList = new ArrayList(list5.size());
                int size = list5.size();
                while (i < size) {
                    Object obj11 = list5.get(i);
                    arrayList.add((Intrinsics.a(obj11, Boolean.FALSE) || obj11 == null) ? null : (rf1) zki.b.b.invoke(obj11));
                    i++;
                }
                return arrayList;
            case 10:
                return new gi9(((Integer) obj).intValue());
            case 11:
                return new hi9(((Integer) obj).intValue());
            case 12:
                Boolean bool3 = Boolean.FALSE;
                if (Intrinsics.a(obj, bool3)) {
                    return new rkl(rkl.c);
                }
                List list6 = (List) obj;
                Object obj12 = list6.get(0);
                float fFloatValue = (obj12 != null ? (Float) obj12 : null).floatValue();
                Object obj13 = list6.get(1);
                yki ykiVar2 = zki.w;
                Intrinsics.a(obj13, bool3);
                return new rkl(rih.s((obj13 != null ? (skl) ykiVar2.b.invoke(obj13) : null).a, fFloatValue));
            case 13:
                return Intrinsics.a(obj, 0) ? new skl(8589934592L) : Intrinsics.a(obj, 1) ? new skl(4294967296L) : new skl(0L);
            case 14:
                if (Intrinsics.a(obj, Boolean.FALSE)) {
                    return new y8f(9205357640488583168L);
                }
                List list7 = (List) obj;
                Object obj14 = list7.get(0);
                float fFloatValue2 = (obj14 != null ? (Float) obj14 : null).floatValue();
                return new y8f((Float.floatToRawIntBits(fFloatValue2) << 32) | (Float.floatToRawIntBits((list7.get(1) != null ? (Float) r0 : null).floatValue()) & 4294967295L));
            case 15:
                List list8 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list8.size());
                int size2 = list8.size();
                while (i < size2) {
                    Object obj15 = list8.get(i);
                    arrayList2.add((Intrinsics.a(obj15, Boolean.FALSE) || obj15 == null) ? null : (yvc) zki.z.b.invoke(obj15));
                    i++;
                }
                return new awc(arrayList2);
            case 16:
                String str2 = (String) obj;
                Locale localeForLanguageTag = Locale.forLanguageTag(str2);
                if (Intrinsics.a(localeForLanguageTag.toLanguageTag(), "und")) {
                    System.err.println("The language tag " + str2 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new yvc(localeForLanguageTag);
            case 17:
                List list9 = (List) obj;
                Object obj16 = list9.get(0);
                String str3 = obj16 != null ? (String) obj16 : null;
                Object obj17 = list9.get(1);
                return new nfc(str3, (Intrinsics.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (tjl) zki.i.b.invoke(obj17), null);
            case 18:
                List list10 = (List) obj;
                Object obj18 = list10.get(0);
                float f = oec.b;
                yki ykiVar3 = zki.B;
                Boolean bool4 = Boolean.FALSE;
                Intrinsics.a(obj18, bool4);
                float f2 = (obj18 != null ? (oec) ykiVar3.b.invoke(obj18) : null).a;
                Object obj19 = list10.get(1);
                yki ykiVar4 = zki.C;
                Intrinsics.a(obj19, bool4);
                int i3 = (obj19 != null ? (qec) ykiVar4.b.invoke(obj19) : null).a;
                Object obj20 = list10.get(2);
                yki ykiVar5 = zki.D;
                Intrinsics.a(obj20, bool4);
                return new rec(f2, i3, (obj20 != null ? (pec) ykiVar5.b.invoke(obj20) : null).a);
            case 19:
                float fFloatValue3 = ((Float) obj).floatValue();
                oec.a(fFloatValue3);
                return new oec(fFloatValue3);
            case 20:
                return new qec(((Integer) obj).intValue());
            case 21:
                List list11 = (List) obj;
                Object obj21 = list11.get(0);
                wf1 wf1Var = obj21 != null ? (wf1) obj21 : null;
                Object obj22 = list11.get(2);
                int iIntValue2 = (obj22 != null ? (Integer) obj22 : null).intValue();
                Object obj23 = list11.get(3);
                int iIntValue3 = (obj23 != null ? (Integer) obj23 : null).intValue();
                Object obj24 = list11.get(4);
                String str4 = obj24 != null ? (String) obj24 : null;
                switch (wf1Var.ordinal()) {
                    case 0:
                        Object obj25 = list11.get(1);
                        c67 c67Var = zki.g;
                        if (!Intrinsics.a(obj25, Boolean.FALSE) && obj25 != null) {
                            yzfVar = (yzf) c67Var.b.invoke(obj25);
                        }
                        rf1Var = new rf1(str4, iIntValue2, iIntValue3, yzfVar);
                        break;
                    case 1:
                        Object obj26 = list11.get(1);
                        c67 c67Var2 = zki.h;
                        if (!Intrinsics.a(obj26, Boolean.FALSE) && obj26 != null) {
                            rwjVar = (rwj) c67Var2.b.invoke(obj26);
                        }
                        rf1Var = new rf1(str4, iIntValue2, iIntValue3, rwjVar);
                        break;
                    case 2:
                        Object obj27 = list11.get(1);
                        c67 c67Var3 = zki.c;
                        if (!Intrinsics.a(obj27, Boolean.FALSE) && obj27 != null) {
                            r1nVar = (r1n) c67Var3.b.invoke(obj27);
                        }
                        rf1Var = new rf1(str4, iIntValue2, iIntValue3, r1nVar);
                        break;
                    case 3:
                        Object obj28 = list11.get(1);
                        c67 c67Var4 = zki.d;
                        if (!Intrinsics.a(obj28, Boolean.FALSE) && obj28 != null) {
                            hpmVar = (hpm) c67Var4.b.invoke(obj28);
                        }
                        rf1Var = new rf1(str4, iIntValue2, iIntValue3, hpmVar);
                        break;
                    case 4:
                        Object obj29 = list11.get(1);
                        c67 c67Var5 = zki.e;
                        if (!Intrinsics.a(obj29, Boolean.FALSE) && obj29 != null) {
                            ofcVar = (ofc) c67Var5.b.invoke(obj29);
                        }
                        rf1Var = new rf1(str4, iIntValue2, iIntValue3, ofcVar);
                        break;
                    case 5:
                        Object obj30 = list11.get(1);
                        c67 c67Var6 = zki.f;
                        if (!Intrinsics.a(obj30, Boolean.FALSE) && obj30 != null) {
                            nfcVar = (nfc) c67Var6.b.invoke(obj30);
                        }
                        rf1Var = new rf1(str4, iIntValue2, iIntValue3, nfcVar);
                        break;
                    case 6:
                        Object obj31 = list11.get(1);
                        rf1Var = new rf1(str4, iIntValue2, iIntValue3, new ehk(obj31 != null ? (String) obj31 : null));
                        break;
                    default:
                        h9o.p();
                        return null;
                }
                return rf1Var;
            case 22:
                return new pec(((Integer) obj).intValue());
            case 23:
                return new r1n(obj != null ? (String) obj : null);
            case 24:
                return new hpm(obj != null ? (String) obj : null);
            case 25:
                List list12 = (List) obj;
                Object obj32 = list12.get(0);
                yki ykiVar6 = zki.q;
                Boolean bool5 = Boolean.FALSE;
                Intrinsics.a(obj32, bool5);
                int i4 = (obj32 != null ? (pel) ykiVar6.b.invoke(obj32) : null).a;
                Object obj33 = list12.get(1);
                yki ykiVar7 = zki.r;
                Intrinsics.a(obj33, bool5);
                int i5 = (obj33 != null ? (jgl) ykiVar7.b.invoke(obj33) : null).a;
                Object obj34 = list12.get(2);
                skl[] sklVarArr2 = rkl.b;
                yki ykiVar8 = zki.v;
                Intrinsics.a(obj34, bool5);
                long j4 = (obj34 != null ? (rkl) ykiVar8.b.invoke(obj34) : null).a;
                Object obj35 = list12.get(3);
                wil wilVar = wil.c;
                wil wilVar2 = (Intrinsics.a(obj35, bool5) || obj35 == null) ? null : (wil) zki.l.b.invoke(obj35);
                Object obj36 = list12.get(4);
                pgg pggVar = (Intrinsics.a(obj36, bool5) || obj36 == null) ? null : (pgg) cli.a.b.invoke(obj36);
                Object obj37 = list12.get(5);
                rec recVar = rec.d;
                rec recVar2 = (Intrinsics.a(obj37, bool5) || obj37 == null) ? null : (rec) zki.A.b.invoke(obj37);
                Object obj38 = list12.get(6);
                int i6 = ((Intrinsics.a(obj38, bool5) || obj38 == null) ? null : (kec) cli.c.b.invoke(obj38)).a;
                Object obj39 = list12.get(7);
                yki ykiVar9 = zki.s;
                Intrinsics.a(obj39, bool5);
                int i7 = (obj39 != null ? (pra) ykiVar9.b.invoke(obj39) : null).a;
                Object obj40 = list12.get(8);
                boolean zA = Intrinsics.a(obj40, bool5);
                c67 c67Var7 = cli.d;
                if (!zA && obj40 != null) {
                    vjlVar = (vjl) c67Var7.b.invoke(obj40);
                }
                return new yzf(i4, i5, j4, wilVar2, pggVar, recVar2, i6, i7, vjlVar);
            case 26:
                List list13 = (List) obj;
                Object obj41 = list13.get(0);
                int i8 = u95.h;
                Boolean bool6 = Boolean.FALSE;
                Intrinsics.a(obj41, bool6);
                long j5 = (obj41 != null ? Intrinsics.a(obj41, Boolean.FALSE) ? new u95(u95.g) : new u95(cs5.c(((Integer) obj41).intValue())) : null).a;
                Object obj42 = list13.get(1);
                skl[] sklVarArr3 = rkl.b;
                Function1 function12 = zki.v.b;
                Intrinsics.a(obj42, bool6);
                long j6 = (obj42 != null ? (rkl) function12.invoke(obj42) : null).a;
                Object obj43 = list13.get(2);
                ki9 ki9Var = ki9.b;
                ki9 ki9Var2 = (Intrinsics.a(obj43, bool6) || obj43 == null) ? null : (ki9) zki.m.b.invoke(obj43);
                Object obj44 = list13.get(3);
                gi9 gi9Var = (Intrinsics.a(obj44, bool6) || obj44 == null) ? null : (gi9) zki.t.b.invoke(obj44);
                Object obj45 = list13.get(4);
                hi9 hi9Var = (Intrinsics.a(obj45, bool6) || obj45 == null) ? null : (hi9) zki.u.b.invoke(obj45);
                Object obj46 = list13.get(6);
                String str5 = obj46 != null ? (String) obj46 : null;
                Object obj47 = list13.get(7);
                Intrinsics.a(obj47, bool6);
                long j7 = (obj47 != null ? (rkl) function12.invoke(obj47) : null).a;
                Object obj48 = list13.get(8);
                ua3 ua3Var = (Intrinsics.a(obj48, bool6) || obj48 == null) ? null : (ua3) zki.n.b.invoke(obj48);
                Object obj49 = list13.get(9);
                vil vilVar = (Intrinsics.a(obj49, bool6) || obj49 == null) ? null : (vil) zki.k.b.invoke(obj49);
                Object obj50 = list13.get(10);
                awc awcVar = awc.c;
                awc awcVar2 = (Intrinsics.a(obj50, bool6) || obj50 == null) ? null : (awc) zki.y.b.invoke(obj50);
                Object obj51 = list13.get(11);
                Intrinsics.a(obj51, bool6);
                long j8 = (obj51 != null ? Intrinsics.a(obj51, Boolean.FALSE) ? new u95(u95.g) : new u95(cs5.c(((Integer) obj51).intValue())) : null).a;
                Object obj52 = list13.get(12);
                bgl bglVar = (Intrinsics.a(obj52, bool6) || obj52 == null) ? null : (bgl) zki.j.b.invoke(obj52);
                Object obj53 = list13.get(13);
                jaj jajVar2 = jaj.d;
                c67 c67Var8 = zki.o;
                if (!Intrinsics.a(obj53, bool6) && obj53 != null) {
                    jajVar = (jaj) c67Var8.b.invoke(obj53);
                }
                return new rwj(j5, j6, ki9Var2, gi9Var, hi9Var, (lh9) null, str5, j7, ua3Var, vilVar, awcVar2, j8, bglVar, jajVar, 49184);
            case 27:
                List list14 = (List) obj;
                Object obj54 = list14.get(0);
                boolean zBooleanValue = (obj54 != null ? (Boolean) obj54 : null).booleanValue();
                Object obj55 = list14.get(1);
                boolean zA2 = Intrinsics.a(obj55, Boolean.FALSE);
                c67 c67Var9 = cli.b;
                if (!zA2 && obj55 != null) {
                    ez7Var = (ez7) c67Var9.b.invoke(obj55);
                }
                return new pgg(ez7Var.a, zBooleanValue);
            case 28:
                return new ez7(((Integer) obj).intValue());
            default:
                return new kec(((Integer) obj).intValue());
        }
    }
}
