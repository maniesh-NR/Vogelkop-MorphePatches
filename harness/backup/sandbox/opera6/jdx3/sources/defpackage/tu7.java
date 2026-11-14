package defpackage;

import J.N;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.leanplum.internal.Constants;
import com.leanplum.utils.SizeUtil;
import com.opera.android.custom_views.SideMarginContainer;
import com.opera.android.history.c;
import com.opera.android.history.g;
import com.opera.android.ui.catalog.widget.OperaChip;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class tu7 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tu7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ tu7(us7 us7Var, c37 c37Var) {
        this.a = (byte) 4;
        this.b = us7Var;
    }

    public final Object invoke(Object obj) {
        String strConcat;
        int length;
        int i;
        String str;
        hmi hmiVar;
        Object value;
        List arrayList;
        byte b = this.a;
        int i2 = 0;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                xu7 xu7Var = (xu7) obj;
                ImageView imageView = (ImageView) ((igi) obj2).b;
                imageView.setVisibility(xu7Var instanceof uu7 ? 8 : 0);
                imageView.setEnabled(xu7Var instanceof vu7);
                imageView.setContentDescription(xu7Var.b);
                imageView.setImageDrawable(xu7Var.a);
                break;
            case 1:
                break;
            case 2:
                FrameLayout frameLayout = (FrameLayout) obj2;
                int iD = m9f.d(frameLayout.getContext());
                p37.o0(frameLayout, iD, 0, iD, 0, 10);
                break;
            case 3:
                N.MyxmjvsL(((hp2) ((xv7) obj2).b.b).b);
                break;
            case 4:
                yb5 yb5Var = (us7) obj;
                String str2 = ((us7) obj2) == yb5Var ? " > " : "   ";
                if (yb5Var instanceof yb5) {
                    yb5 yb5Var2 = yb5Var;
                    length = yb5Var2.a.b.length();
                    i = yb5Var2.b;
                    str = "CommitTextCommand(text.length=";
                } else if (!(yb5Var instanceof r4j)) {
                    if (yb5Var instanceof q4j) {
                        strConcat = ((q4j) yb5Var).toString();
                    } else if (yb5Var instanceof d27) {
                        strConcat = ((d27) yb5Var).toString();
                    } else if (yb5Var instanceof e27) {
                        strConcat = ((e27) yb5Var).toString();
                    } else if (yb5Var instanceof s4j) {
                        strConcat = ((s4j) yb5Var).toString();
                    } else if (yb5Var instanceof e49) {
                        strConcat = "FinishComposingTextCommand()";
                    } else if (yb5Var instanceof y17) {
                        strConcat = "DeleteAllCommand()";
                    } else {
                        String strC = uqh.a(yb5Var.getClass()).c();
                        if (strC == null) {
                            strC = "{anonymous EditCommand}";
                        }
                        strConcat = "Unknown EditCommand: ".concat(strC);
                    }
                    break;
                } else {
                    r4j r4jVar = (r4j) yb5Var;
                    length = r4jVar.a.b.length();
                    i = r4jVar.b;
                    str = "SetComposingTextCommand(text.length=";
                }
                strConcat = fki.o(length, i, str, ", newCursorPosition=", ")");
            case 5:
                uk6 uk6Var = (uk6) obj2;
                orb orbVar = (orb) obj;
                if (orbVar.a.has("error")) {
                    orb orbVarC = orbVar.c("error");
                    uk6Var.n(new rw7(new cqb(orbVarC.a.getInt("code"), orbVarC.e(Constants.Params.MESSAGE))));
                } else {
                    uk6Var.n(new sw7(Unit.a));
                }
                break;
            case 6:
                mf8 mf8Var = (mf8) obj2;
                wa1 wa1Var = (wa1) obj;
                wa1Var.x(0, Long.valueOf(mf8Var.a));
                wa1Var.z(1, mf8Var.b);
                wa1Var.x(2, Long.valueOf(mf8Var.c));
                break;
            case 7:
                p12 p12Var = (p12) obj2;
                tjg tjgVar = (tjg) p12Var.a;
                mig migVar = (mig) p12Var.h;
                pg pgVar = (pg) obj;
                if (Intrinsics.a(pgVar, ng.a)) {
                    migVar.a(tjgVar.o);
                } else if (!Intrinsics.a(pgVar, og.a)) {
                    h9o.p();
                    break;
                } else {
                    Bundle bundle = ((vjd) ((kze) p12Var.b).g()).I;
                    if ((bundle != null ? bundle.getString("com.opera.android.media.AI_POD_ID", null) : null) != null) {
                        migVar.c().stop();
                    }
                    migVar.b(tjgVar.o);
                }
                break;
            case 8:
                kj8 kj8Var = (kj8) obj2;
                ypd ypdVar = kj8Var.b;
                ((a21) ypdVar.b).r((u3l) ((z5l) ypdVar.c).s.g(), kj8Var.c.b, (View) obj);
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((yr8) obj2).c((ifd) obj);
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                gx8 gx8Var = (gx8) obj2;
                pde pdeVar = gx8Var.c;
                int iA = gx8Var.a();
                int iW = f03.w(2130970851, gx8Var.b, 0);
                if (iA < iW) {
                    iA = iW;
                }
                xf8.F0(pdeVar, Integer.valueOf(iA));
                xf8.F0(gx8Var.d, Integer.valueOf(gx8Var.a()));
                break;
            case 11:
                g89 g89Var = (g89) obj2;
                fu1 fu1Var = (fu1) obj;
                g89Var.e = null;
                if (g89Var.i) {
                    g89Var.g = fu1Var;
                    g89Var.c();
                }
                break;
            case 12:
                dfe dfeVar = (dfe) obj2;
                Object[] objArr = dfeVar.a;
                int i3 = dfeVar.c;
                while (i2 < i3) {
                    ((ufd) objArr[i2]).b();
                    i2++;
                }
                break;
            case 13:
                pam pamVar = (pam) obj;
                break;
            case 14:
                kng kngVar = ((ti9) obj2).b;
                long jF = ((Boolean) obj).booleanValue() ? pn7.f(ti9.r) : pn7.f(ti9.s);
                if (kngVar.b != jF) {
                    kngVar.b = jF;
                    oml omlVar = kngVar.f;
                    if (omlVar != null) {
                        omlVar.cancel(false);
                        long jUptimeMillis = SystemClock.uptimeMillis() - kngVar.d;
                        if (jUptimeMillis >= kngVar.b) {
                            kngVar.a();
                        } else {
                            oml omlVar2 = new oml(kngVar.a.d(new pjg(kngVar, (byte) 4)));
                            kngVar.f = omlVar2;
                            omlVar2.b(null, kngVar.b - jUptimeMillis, TimeUnit.MILLISECONDS, null);
                        }
                    }
                }
                break;
            case 15:
                ((wj9) obj2).b.c();
                break;
            case 16:
                break;
            case 17:
                p04 p04Var = (p04) obj2;
                if (nz9.b.compareAndSet(false, true)) {
                    p04Var.b(Unit.a);
                }
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                ((pr3) obj2).invoke((oy1) obj);
                break;
            case 19:
                yo7 yo7Var = (yo7) obj2;
                Object obj3 = ((t0i) obj).a;
                if (t0i.d(obj3) == null) {
                    Boolean bool = (Boolean) obj3;
                    bool.getClass();
                    yo7Var.invoke(bool);
                } else {
                    yo7Var.invoke(Boolean.FALSE);
                }
                break;
            case SizeUtil.textSize0 /* 20 */:
                xf8.F0(((u0a) obj2).a, s0a.a);
                break;
            case 21:
                ks3 ks3Var = (ks3) obj2;
                ((View) ((x0a) ks3Var.f).e.e).removeCallbacks((ld9) ks3Var.g);
                ks3Var.f = null;
                ((y0a) ks3Var.i).run((ei7) obj);
                break;
            case SizeUtil.textSize1 /* 22 */:
                mk7 mk7Var = (mk7) obj;
                sh4 sh4VarA = mk7Var.s0().A();
                Function2 function2 = ((s3a) obj2).d;
                if (function2 != null) {
                    function2.invoke(sh4VarA, (q3a) mk7Var.s0().b);
                }
                break;
            case 23:
                y4a y4aVar = (y4a) obj2;
                uzm uzmVar = (uzm) obj;
                y4aVar.g(uzmVar);
                Function1 function1 = y4aVar.i;
                if (function1 != null) {
                    function1.invoke(uzmVar);
                }
                break;
            case SizeUtil.textSize2 /* 24 */:
                pg pgVar2 = (pg) obj;
                ArrayList arrayList2 = (ArrayList) ((ne5) obj2).e;
                int size = arrayList2.size();
                while (i2 < size) {
                    Object obj4 = arrayList2.get(i2);
                    i2++;
                    ((g5a) obj4).b.r(pgVar2);
                }
                break;
            case 25:
                s6h s6hVar = (s6h) obj2;
                gfh gfhVar = (gfh) obj;
                ffh ffhVar = gfhVar instanceof ffh ? (ffh) gfhVar : null;
                fmi fmiVar = (ffhVar == null || (hmiVar = ffhVar.a) == null) ? null : hmiVar.d;
                if (!Intrinsics.a((fmi) s6hVar.b, fmiVar)) {
                    s6hVar.b = fmiVar;
                    if (fmiVar != null) {
                        ((View) s6hVar.a).performHapticFeedback(16);
                    }
                }
                break;
            case 26:
                ((hba) obj2).b.setValue((b2c) obj);
                break;
            case 27:
                nak nakVar = ((pca) obj2).j;
                do {
                    value = nakVar.getValue();
                    ((Boolean) value).getClass();
                } while (!nakVar.h(value, Boolean.FALSE));
            case 28:
                dda ddaVar = (dda) obj2;
                kea keaVar = (kea) obj;
                ei eiVar = ddaVar.y;
                if (eiVar == null) {
                    eiVar = null;
                }
                SideMarginContainer sideMarginContainer = (SideMarginContainer) eiVar.f;
                Set set = keaVar.c;
                List list = keaVar.d;
                boolean z = keaVar.a;
                sideMarginContainer.setVisibility(set.size() > 1 ? 0 : 8);
                int iOrdinal = keaVar.b.ordinal();
                if (iOrdinal == 0) {
                    ei eiVar2 = ddaVar.y;
                    if (eiVar2 == null) {
                        eiVar2 = null;
                    }
                    ((OperaChip) eiVar2.g).setChecked(true);
                    ztn ztnVar = ddaVar.A;
                    if (ztnVar == null) {
                        ztnVar = null;
                    }
                    ddaVar.M0(ztnVar);
                    if (z) {
                        ztn ztnVar2 = ddaVar.A;
                        if (ztnVar2 == null) {
                            ztnVar2 = null;
                        }
                        ztnVar2.getClass();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj5 : list) {
                            if (obj5 instanceof c) {
                                arrayList3.add(obj5);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList(k95.o(arrayList3, 10));
                        int size2 = arrayList3.size();
                        int i4 = 0;
                        while (i4 < size2) {
                            Object obj6 = arrayList3.get(i4);
                            i4++;
                            arrayList4.add(new g((c) obj6));
                        }
                        wjj wjjVar = new wjj(arrayList4);
                        int size3 = arrayList4.size();
                        int i5 = 0;
                        while (i5 < size3) {
                            Object obj7 = arrayList4.get(i5);
                            i5++;
                            g gVar = (g) obj7;
                            ((LinkedHashMap) wjjVar.b).put(Long.valueOf(gVar.b.getId()), gVar);
                        }
                        Calendar calendar = Calendar.getInstance();
                        calendar.set(11, 0);
                        calendar.set(12, 0);
                        calendar.set(13, 0);
                        calendar.set(14, 0);
                        int i6 = 6;
                        calendar.add(6, 1);
                        long timeInMillis = calendar.getTimeInMillis();
                        List arrayList5 = new ArrayList();
                        ArrayList arrayList6 = (ArrayList) wjjVar.a;
                        ArrayList arrayList7 = (ArrayList) wjjVar.c;
                        int size4 = arrayList6.size();
                        int i7 = -1;
                        List list2 = arrayList5;
                        int i8 = -1;
                        long timeInMillis2 = timeInMillis;
                        int i9 = 0;
                        while (i9 < size4) {
                            Object obj8 = arrayList6.get(i9);
                            i9++;
                            g gVar2 = (g) obj8;
                            boolean z2 = z;
                            if (gVar2.b.b() < timeInMillis2) {
                                do {
                                    calendar.add(i6, i7);
                                    timeInMillis2 = calendar.getTimeInMillis();
                                    i8++;
                                } while (gVar2.b.b() < timeInMillis2);
                                list2 = null;
                            }
                            if (list2 == null) {
                                if (i2 >= arrayList7.size()) {
                                    arrayList = new ArrayList();
                                    arrayList7.add(arrayList);
                                } else {
                                    arrayList = (List) arrayList7.get(i2);
                                    arrayList.clear();
                                }
                                i2++;
                                arrayList.add(new ytn(i8 != 0 ? i8 != z2 ? ztn.m.format(calendar.getTime()) : ztnVar2.k : ztnVar2.j));
                                list2 = arrayList;
                            }
                            list2.add(gVar2);
                            i6 = 6;
                            z = true;
                            i7 = -1;
                        }
                        if (i2 < arrayList7.size()) {
                            arrayList7.subList(i2, arrayList7.size()).clear();
                        }
                        ztnVar2.g = wjjVar;
                        ztnVar2.M();
                    }
                } else if (iOrdinal != 1) {
                    h9o.p();
                    break;
                } else {
                    ei eiVar3 = ddaVar.y;
                    if (eiVar3 == null) {
                        eiVar3 = null;
                    }
                    ((OperaChip) eiVar3.d).setChecked(true);
                    jy0 jy0Var = ddaVar.C;
                    if (jy0Var == null) {
                        jy0Var = null;
                    }
                    ddaVar.M0(jy0Var);
                    if (z) {
                        jy0 jy0Var2 = ddaVar.C;
                        jy0 jy0Var3 = jy0Var2 == null ? null : jy0Var2;
                        jy0Var3.getClass();
                        ArrayList arrayList8 = new ArrayList();
                        for (Object obj9 : list) {
                            if (obj9 instanceof yda) {
                                arrayList8.add(obj9);
                            }
                        }
                        ArrayList arrayList9 = new ArrayList(k95.o(arrayList8, 10));
                        int size5 = arrayList8.size();
                        while (i2 < size5) {
                            Object obj10 = arrayList8.get(i2);
                            i2++;
                            arrayList9.add(new gy0((yda) obj10));
                        }
                        jy0Var3.f = new wjh(arrayList9);
                        jy0Var3.M();
                    }
                }
                break;
            default:
                ((l35) obj2).b.c();
                break;
        }
        return Unit.a;
    }
}
