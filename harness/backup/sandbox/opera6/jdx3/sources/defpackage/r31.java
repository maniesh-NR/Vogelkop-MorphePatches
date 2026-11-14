package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.leanplum.utils.SizeUtil;
import com.opera.android.favorites.PushedSpeedDialFavorite;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class r31 extends nr9 implements cr9 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r31(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        orc orcVar;
        switch (this.a) {
            case 0:
                if (obj != null) {
                    h9o.t();
                    return null;
                }
                View view = (v31) ((z84) this).receiver;
                Resources resources = view.getContext().getResources();
                return Boolean.valueOf(d41.a.a(view, null, new zf5(new q27(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), ((bpj) obj2).a, (Function1) obj3)));
            case 1:
                mkh.j(((p04) ((z84) this).receiver).b, obj2, (CoroutineContext) obj3);
                return Unit.a;
            case 2:
                mkh.j(((p04) ((z84) this).receiver).b, os4.a(((os4) obj2).a), (CoroutineContext) obj3);
                return Unit.a;
            case 3:
                Set set = (Set) obj2;
                List<PushedSpeedDialFavorite> list = (List) obj3;
                ((tr8) ((z84) this).receiver).getClass();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                List list2 = (List) obj;
                ArrayList arrayList = new ArrayList(k95.o(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((sr8) it.next()).a);
                }
                linkedHashSet.addAll(arrayList);
                linkedHashSet.addAll(set);
                for (PushedSpeedDialFavorite pushedSpeedDialFavorite : list) {
                    linkedHashSet.add(pushedSpeedDialFavorite.i(p6l.a));
                    String strH = wqm.b("https", pushedSpeedDialFavorite.e.f).h();
                    if (strH.length() > 0) {
                        linkedHashSet.add(strH);
                    }
                }
                return linkedHashSet;
            case 4:
                epc epcVar = (epc) obj;
                bp7 bp7Var = (bp7) obj2;
                ((qrc) ((z84) this).receiver).getClass();
                int iOrdinal = ((trc) obj3).ordinal();
                if (iOrdinal == 0) {
                    orcVar = orc.a;
                } else if (iOrdinal == 1) {
                    orcVar = null;
                } else {
                    if (iOrdinal != 2) {
                        h9o.p();
                        return null;
                    }
                    orcVar = orc.c;
                }
                if (orcVar == null) {
                    int iOrdinal2 = bp7Var.ordinal();
                    if (iOrdinal2 == 0) {
                        orcVar = orc.a;
                    } else if (iOrdinal2 == 1) {
                        orcVar = orc.c;
                    } else {
                        if (iOrdinal2 != 2) {
                            h9o.p();
                            return null;
                        }
                        orcVar = Intrinsics.a(epcVar != null ? epcVar.a : null, "idle") ? orc.b : orc.a;
                    }
                }
                return new prc(orcVar);
            default:
                yz yzVar = (yz) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                Function2 function2 = (Function2) obj3;
                ej ejVar = (ej) ((z84) this).receiver;
                ejVar.getClass();
                if (yzVar instanceof w10) {
                    cie cieVar = ((w10) yzVar).u;
                    w06 w06Var = cieVar.d;
                    switch (w06Var == null ? -1 : dj.a[w06Var.ordinal()]) {
                        case -1:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case SizeUtil.textSize0_1 /* 18 */:
                        case 19:
                        case SizeUtil.textSize0 /* 20 */:
                        case 21:
                        case SizeUtil.textSize1 /* 22 */:
                        case 23:
                        case SizeUtil.textSize2 /* 24 */:
                        case 25:
                        case 26:
                        case 27:
                            Boolean bool = Boolean.TRUE;
                            function2.invoke(bool, bool);
                            break;
                        case 0:
                        default:
                            h9o.p();
                            return null;
                        case 28:
                            List listP = e82.p(new String[]{cieVar.i0, cieVar.j0});
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj4 : listP) {
                                if (((String) obj4).length() > 0) {
                                    arrayList2.add(obj4);
                                }
                            }
                            if (arrayList2.isEmpty()) {
                                Boolean bool2 = Boolean.TRUE;
                                function2.invoke(bool2, bool2);
                                break;
                            } else {
                                ejVar.a(arrayList2, zBooleanValue, function2);
                                break;
                            }
                    }
                } else {
                    Boolean bool3 = Boolean.TRUE;
                    function2.invoke(bool3, bool3);
                }
                return Unit.a;
        }
    }
}
