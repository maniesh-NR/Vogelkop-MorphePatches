package defpackage;

import android.content.res.Resources;
import android.graphics.RectF;
import android.util.Rational;
import com.opera.android.bookmarks.c;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ta2 implements Comparator {
    public final /* synthetic */ byte a;
    public final Object b;
    public Object c;

    public ta2(Resources resources) {
        this.a = (byte) 1;
        this.c = resources;
        this.b = Collator.getInstance();
    }

    public ta2(Rational rational, Rational rational2) {
        this.a = (byte) 0;
        this.c = rational2 == null ? new Rational(4, 3) : rational2;
        this.b = b(rational);
    }

    public ta2(c cVar) {
        this.a = (byte) 2;
        this.b = cVar;
    }

    public ta2(ArrayList arrayList) {
        this.a = (byte) 3;
        this.c = arrayList;
        Collator collator = Collator.getInstance(Locale.US);
        this.b = collator;
        collator.setStrength(0);
    }

    public static float a(RectF rectF, RectF rectF2) {
        return (rectF.width() < rectF2.width() ? rectF.width() : rectF2.width()) * (rectF.height() < rectF2.height() ? rectF.height() : rectF2.height());
    }

    public final RectF b(Rational rational) {
        float fFloatValue = rational.floatValue();
        Rational rational2 = (Rational) this.c;
        return fFloatValue == rational2.floatValue() ? new RectF(0.0f, 0.0f, rational2.getNumerator(), rational2.getDenominator()) : rational.floatValue() > rational2.floatValue() ? new RectF(0.0f, 0.0f, rational2.getNumerator(), (rational.getDenominator() * rational2.getNumerator()) / rational.getNumerator()) : new RectF(0.0f, 0.0f, (rational.getNumerator() * rational2.getDenominator()) / rational.getDenominator(), rational2.getDenominator());
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        int i = 0;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                Rational rational = (Rational) obj;
                Rational rational2 = (Rational) obj2;
                RectF rectF = (RectF) obj3;
                if (rational.equals(rational2)) {
                    return 0;
                }
                RectF rectFB = b(rational);
                RectF rectFB2 = b(rational2);
                boolean z = rectFB.width() >= rectF.width() && rectFB.height() >= rectF.height();
                if (rectFB2.width() >= rectF.width() && rectFB2.height() >= rectF.height()) {
                    i = 1;
                }
                if (z) {
                    if (i != 0) {
                        return (int) Math.signum((rectFB.height() * rectFB.width()) - (rectFB2.height() * rectFB2.width()));
                    }
                    return -1;
                }
                if (i != 0) {
                    return 1;
                }
                return -((int) Math.signum(a(rectFB, rectF) - a(rectFB2, rectF)));
            case 1:
                rxh rxhVar = ((pc) obj).a.b;
                Resources resources = (Resources) this.c;
                return ((Collator) obj3).compare(rxhVar.a(resources), ((pc) obj2).a.b.a(resources));
            case 2:
                al3 al3Var = (al3) obj;
                al3 al3Var2 = (al3) obj2;
                c cVar = (c) obj3;
                if (Objects.equals(al3Var.a(cVar), al3Var2.a(cVar))) {
                    ml3 ml3VarA = al3Var.a(cVar);
                    List listI = (List) this.c;
                    if (listI == null) {
                        listI = ml3VarA.i();
                        this.c = listI;
                    }
                    int iIndexOf = listI.indexOf(al3Var);
                    ml3 ml3VarA2 = al3Var2.a(cVar);
                    List listI2 = (List) this.c;
                    if (listI2 == null) {
                        listI2 = ml3VarA2.i();
                        this.c = listI2;
                    }
                    int iIndexOf2 = listI2.indexOf(al3Var2);
                    if (iIndexOf < iIndexOf2) {
                        return -1;
                    }
                    if (iIndexOf > iIndexOf2) {
                        return 1;
                    }
                }
                return 0;
            default:
                sbn sbnVar = (sbn) obj;
                sbn sbnVar2 = (sbn) obj2;
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size();
                int size2 = arrayList.size();
                Locale localeF = wwc.f(sbnVar.a);
                Locale localeF2 = wwc.f(sbnVar2.a);
                int size3 = arrayList.size();
                while (i < size3) {
                    Object obj4 = arrayList.get(i);
                    i++;
                    String str = (String) obj4;
                    if (wwc.b(wwc.d(wwc.f(str)), wwc.d(localeF))) {
                        size = arrayList.indexOf(str);
                    }
                    if (wwc.b(wwc.d(wwc.f(str)), wwc.d(localeF2))) {
                        size2 = arrayList.indexOf(str);
                    }
                }
                return size != size2 ? size - size2 : ((Collator) obj3).compare(sbnVar.b, sbnVar2.b);
        }
    }
}
