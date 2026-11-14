package defpackage;

import android.content.res.Resources;
import android.icu.text.Collator;
import android.icu.text.RuleBasedCollator;
import android.util.Rational;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class jk implements Comparator {
    public final /* synthetic */ byte a;
    public final Object b;

    public jk() {
        this.a = (byte) 6;
        Collator collator = Collator.getInstance(Locale.getDefault());
        collator.setStrength(0);
        this.b = (RuleBasedCollator) collator;
    }

    public /* synthetic */ jk(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                Resources resources = (Resources) obj3;
                return ad5.a(((mk) obj).b.a.a(resources).toString(), ((mk) obj2).b.a.a(resources).toString());
            case 1:
                el elVar = (el) obj;
                el elVar2 = (el) obj2;
                ArrayList arrayList = (ArrayList) obj3;
                int i = elVar.g;
                int i2 = elVar2.g;
                return i != i2 ? i - i2 : arrayList.indexOf(elVar) - arrayList.indexOf(elVar2);
            case 2:
                ct ctVar = (ct) obj3;
                return ad5.a(((is) obj).c.a.a(ctVar.getResources()).toString(), ((is) obj2).c.a.a(ctVar.getResources()).toString());
            case 3:
                Function1 function1 = (Function1) obj3;
                return String.CASE_INSENSITIVE_ORDER.compare(function1.invoke(obj), function1.invoke(obj2));
            case 4:
                ate ateVar = (ate) obj;
                ate ateVar2 = (ate) obj2;
                int iO = qbe.o(qbe.x(ateVar), qbe.x(ateVar2));
                if (iO != 0) {
                    return iO;
                }
                int iO2 = qbe.o(ateVar.d, ateVar2.d);
                if (iO2 != 0) {
                    return iO2;
                }
                int iO3 = qbe.o(ateVar.e, ateVar2.e);
                return iO3 == 0 ? ((c9) ((z8b) obj3).a).compare(ateVar, ateVar2) : iO3;
            case 5:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj3;
                return ad5.a((Integer) linkedHashMap.getOrDefault(((yqe) obj).a, Integer.MAX_VALUE), (Integer) linkedHashMap.getOrDefault(((yqe) obj2).a, Integer.MAX_VALUE));
            case 6:
                w3g w3gVar = (w3g) obj;
                w3g w3gVar2 = (w3g) obj2;
                if (w3gVar == null || w3gVar2 == null) {
                    return 0;
                }
                return ((RuleBasedCollator) obj3).compare(w3gVar.c, w3gVar2.c);
            case 7:
                SparseIntArray sparseIntArray = (SparseIntArray) obj3;
                return Integer.valueOf(sparseIntArray.get(((enh) obj).c, Integer.MAX_VALUE)).compareTo(Integer.valueOf(sparseIntArray.get(((enh) obj2).c, Integer.MAX_VALUE)));
            case 8:
                Rational rational = (Rational) obj2;
                Rational rational2 = (Rational) obj3;
                float fFloatValue = ((Rational) obj).floatValue();
                float fFloatValue2 = rational2.floatValue();
                float f = fFloatValue > fFloatValue2 ? fFloatValue2 / fFloatValue : fFloatValue / fFloatValue2;
                float fFloatValue3 = rational.floatValue();
                float fFloatValue4 = rational2.floatValue();
                return Float.compare(fFloatValue3 > fFloatValue4 ? fFloatValue4 / fFloatValue3 : fFloatValue3 / fFloatValue4, f);
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                int iCompare = ((Comparator) obj3).compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                m3c m3cVar = ((k0j) obj).c;
                m3c m3cVar2 = ((k0j) obj2).c;
                return m3cVar.x() == m3cVar2.x() ? Intrinsics.b(m3cVar.v(), m3cVar2.v()) : Float.compare(m3cVar.x(), m3cVar2.x());
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                int iCompare2 = ((jk) obj3).compare(obj, obj2);
                return iCompare2 == 0 ? Integer.valueOf(((k0j) obj).f).compareTo(Integer.valueOf(((k0j) obj2).f)) : iCompare2;
            default:
                ArrayList arrayList2 = ((xfk) obj3).g;
                Iterator it = ((vfk) obj).l.iterator();
                if (it.hasNext()) {
                    Integer numValueOf = Integer.valueOf(arrayList2.indexOf((cg4) it.next()));
                    while (it.hasNext()) {
                        Integer numValueOf2 = Integer.valueOf(arrayList2.indexOf((cg4) it.next()));
                        if (numValueOf.compareTo(numValueOf2) > 0) {
                            numValueOf = numValueOf2;
                        }
                    }
                    Iterator it2 = ((vfk) obj2).l.iterator();
                    if (it2.hasNext()) {
                        Integer numValueOf3 = Integer.valueOf(arrayList2.indexOf((cg4) it2.next()));
                        while (it2.hasNext()) {
                            Integer numValueOf4 = Integer.valueOf(arrayList2.indexOf((cg4) it2.next()));
                            if (numValueOf3.compareTo(numValueOf4) > 0) {
                                numValueOf3 = numValueOf4;
                            }
                        }
                        return numValueOf.compareTo(numValueOf3);
                    }
                }
                t3p.y();
                return 0;
        }
    }
}
