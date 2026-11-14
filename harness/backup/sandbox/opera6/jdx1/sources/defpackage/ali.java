package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public final /* synthetic */ class ali implements Function2 {
    public final /* synthetic */ byte a;

    public /* synthetic */ ali(byte b) {
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2) {
        boolean z = false;
        final byte b = 2;
        switch (this.a) {
            case 0:
                return Integer.valueOf(((ez7) obj2).a);
            case 1:
                return Integer.valueOf(((kec) obj2).a);
            case 2:
                vjl vjlVar = (vjl) obj2;
                return j95.d(new Object[]{zki.a(new ujl(vjlVar.a), cli.e, (rji) obj), Boolean.valueOf(vjlVar.b)});
            case 3:
                return Integer.valueOf(((ujl) obj2).a);
            case 4:
                ffh ffhVar = (gfh) obj;
                ffh ffhVar2 = (gfh) obj2;
                ffh ffhVar3 = ffhVar instanceof ffh ? ffhVar : null;
                hmi hmiVar = ffhVar3 != null ? ffhVar3.a : null;
                ffh ffhVar4 = ffhVar2 instanceof ffh ? ffhVar2 : null;
                hmi hmiVar2 = ffhVar4 != null ? ffhVar4.a : null;
                if (hmiVar != null && hmiVar2 == null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 5:
                return Integer.valueOf(((voi) obj2).a.h());
            case 6:
                int[] iArr = (int[]) obj2;
                ((d8j) obj).g(Arrays.copyOf(iArr, iArr.length));
                return Unit.a;
            case 7:
                int[] iArr2 = (int[]) obj2;
                int[] iArrCopyOf = Arrays.copyOf(iArr2, iArr2.length);
                g8j g8jVar = (d8j) obj;
                g8jVar.getClass();
                g8jVar.b.e(new xvi(new oba(2, 0, iArrCopyOf)), false);
                return Unit.a;
            case 8:
                l08 l08Var = (List) obj;
                List list = (List) obj2;
                if (l08Var == null) {
                    l08Var = l08.a;
                }
                return CollectionsKt.V(list, (Collection) l08Var);
            case 9:
                List list2 = (List) obj;
                List list3 = (List) obj2;
                if (list2 == null) {
                    return list3;
                }
                ArrayList arrayList = new ArrayList(list2);
                arrayList.addAll(list3);
                return arrayList;
            case 10:
                Float f = (Float) obj;
                ((Float) obj2).getClass();
                return f;
            case 11:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 12:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 13:
                return (q5i) obj;
            case 14:
                return (String) obj;
            case 15:
                return (Unit) obj;
            case 16:
                List list4 = (List) obj;
                List list5 = (List) obj2;
                if (list4 == null) {
                    return list5;
                }
                ArrayList arrayList2 = new ArrayList(list4);
                arrayList2.addAll(list5);
                return arrayList2;
            case 17:
                return (paj) obj;
            case 18:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 19:
                return (ur5) obj;
            case 20:
                return (p41) obj;
            case 21:
                return (e61) obj;
            case 22:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).getClass();
                return bool;
            case 23:
                if (obj != null || obj2 != null) {
                    h9o.t();
                }
                return null;
            case 24:
                return obj == null ? obj2 : obj;
            case 25:
                k0j k0jVar = (k0j) obj2;
                Object objValueOf = Float.valueOf(0.0f);
                f0j f0jVar = ((k0j) obj).d;
                p0j p0jVar = n0j.u;
                Object objG = f0jVar.a.g(p0jVar);
                if (objG == null) {
                    objG = objValueOf;
                }
                float fFloatValue = ((Number) objG).floatValue();
                Object objG2 = k0jVar.d.a.g(p0jVar);
                if (objG2 != null) {
                    objValueOf = objG2;
                }
                return Integer.valueOf(Float.compare(fFloatValue, ((Number) objValueOf).floatValue()));
            case 26:
                return new Pair(obj, obj2);
            case 27:
                final List list6 = (List) obj2;
                return zwg.m((itb) obj, zwg.s(y2j.a, list6, true), new Function0() { // from class: fu6
                    public final Object invoke() {
                        byte b2 = b;
                        List list7 = list6;
                        switch (b2) {
                            case 0:
                                Integer num = (Integer) list7.get(2);
                                num.getClass();
                                break;
                        }
                        return ((ytb) list7.get(0)).g();
                    }
                });
            case 28:
                final List list7 = (List) obj2;
                final byte b2 = 3;
                KSerializer kSerializerM = zwg.m((itb) obj, zwg.s(y2j.a, list7, true), new Function0() { // from class: fu6
                    public final Object invoke() {
                        byte b22 = b2;
                        List list72 = list7;
                        switch (b22) {
                            case 0:
                                Integer num = (Integer) list72.get(2);
                                num.getClass();
                                break;
                        }
                        return ((ytb) list72.get(0)).g();
                    }
                });
                if (kSerializerM != null) {
                    return f03.B(kSerializerM);
                }
                return null;
            default:
                return ((pej) obj2).c();
        }
    }
}
