package defpackage;

import android.util.Size;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.charset.Charset;
import java.text.Collator;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class au9 implements Comparator {
    public final /* synthetic */ byte a;

    public /* synthetic */ au9(byte b) {
        this.a = b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                bu9 bu9Var = (bu9) obj;
                bu9 bu9Var2 = (bu9) obj2;
                RecyclerView recyclerView = bu9Var.d;
                if ((recyclerView == null) == (bu9Var2.d == null)) {
                    boolean z = bu9Var.a;
                    if (z == bu9Var2.a) {
                        int i = bu9Var2.b - bu9Var.b;
                        if (i != 0) {
                            return i;
                        }
                        int i2 = bu9Var.c - bu9Var2.c;
                        if (i2 == 0) {
                            return 0;
                        }
                        return i2;
                    }
                    if (!z) {
                        return 1;
                    }
                } else if (recyclerView == null) {
                    return 1;
                }
                return -1;
            case 1:
                return Double.valueOf(((x8a) obj2).c).compareTo(Double.valueOf(((x8a) obj).c));
            case 2:
                return ad5.a(((Charset) obj).name(), ((Charset) obj2).name());
            case 3:
                return ad5.a((Float) ((Pair) obj2).b, (Float) ((Pair) obj).b);
            case 4:
                String str = ((wt1) obj).b;
                Locale locale = Locale.ROOT;
                return ad5.a(str.toLowerCase(locale), ((wt1) obj2).b.toLowerCase(locale));
            case 5:
                throw sko.g(obj);
            case 6:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 7:
                bre breVar = (bre) obj;
                bre breVar2 = (bre) obj2;
                if (breVar.equals(breVar2)) {
                    return 0;
                }
                return Collator.getInstance().compare(x77.h(breVar), x77.h(breVar2));
            case 8:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return Long.valueOf(size.getWidth() * size.getHeight()).compareTo(Long.valueOf(size2.getWidth() * size2.getHeight()));
            case 9:
                return Integer.valueOf(((pwf) obj).b.a).compareTo(Integer.valueOf(((pwf) obj2).b.a));
            case 10:
                return Integer.valueOf(((pwf) obj2).b.a).compareTo(Integer.valueOf(((pwf) obj).b.a));
            case 11:
                return Integer.valueOf(((h1g) obj2).a).compareTo(Integer.valueOf(((h1g) obj).a));
            case 12:
                return ((pvj) obj).b - ((pvj) obj2).b;
            case 13:
                return Double.valueOf(((orb) obj2).a.optDouble("final_score", 0.0d)).compareTo(Double.valueOf(((orb) obj).a.optDouble("final_score", 0.0d)));
            case 14:
                ((hyb) obj2).getClass();
                Integer num = 1;
                ((hyb) obj).getClass();
                return num.compareTo(num);
            case 15:
                ((dvk) obj2).getClass();
                Integer num2 = 0;
                ((dvk) obj).getClass();
                return num2.compareTo(num2);
            case 16:
                return ad5.a(((w27) obj).a, ((w27) obj2).a);
            case 17:
                return Integer.valueOf(((r27) obj).a).compareTo(Integer.valueOf(((r27) obj2).a));
            case 18:
                return Integer.valueOf(((r27) obj2).a).compareTo(Integer.valueOf(((r27) obj).a));
            case 19:
                return ad5.a((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 20:
                return ad5.a((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 21:
                return ((nqg) obj).b.compareTo(((nqg) obj2).b);
            case 22:
                return ad5.a(((wa3) obj).a, ((wa3) obj2).a);
            case 23:
                Iterator it = ((cg4) obj).b.iterator();
                if (it.hasNext()) {
                    Integer numValueOf = Integer.valueOf(xfk.n.indexOf(((wfk) it.next()).h));
                    while (it.hasNext()) {
                        Integer numValueOf2 = Integer.valueOf(xfk.n.indexOf(((wfk) it.next()).h));
                        if (numValueOf.compareTo(numValueOf2) < 0) {
                            numValueOf = numValueOf2;
                        }
                    }
                    Iterator it2 = ((cg4) obj2).b.iterator();
                    if (it2.hasNext()) {
                        Integer numValueOf3 = Integer.valueOf(xfk.n.indexOf(((wfk) it2.next()).h));
                        while (it2.hasNext()) {
                            Integer numValueOf4 = Integer.valueOf(xfk.n.indexOf(((wfk) it2.next()).h));
                            if (numValueOf3.compareTo(numValueOf4) < 0) {
                                numValueOf3 = numValueOf4;
                            }
                        }
                        return numValueOf.compareTo(numValueOf3);
                    }
                }
                t3p.y();
                return 0;
            case 24:
                Iterator it3 = ((cg4) obj).b.iterator();
                if (it3.hasNext()) {
                    Integer numValueOf5 = Integer.valueOf(xfk.p.indexOf(new rfk(((wfk) it3.next()).c)));
                    while (it3.hasNext()) {
                        Integer numValueOf6 = Integer.valueOf(xfk.p.indexOf(new rfk(((wfk) it3.next()).c)));
                        if (numValueOf5.compareTo(numValueOf6) < 0) {
                            numValueOf5 = numValueOf6;
                        }
                    }
                    Iterator it4 = ((cg4) obj2).b.iterator();
                    if (it4.hasNext()) {
                        Integer numValueOf7 = Integer.valueOf(xfk.p.indexOf(new rfk(((wfk) it4.next()).c)));
                        while (it4.hasNext()) {
                            Integer numValueOf8 = Integer.valueOf(xfk.p.indexOf(new rfk(((wfk) it4.next()).c)));
                            if (numValueOf7.compareTo(numValueOf8) < 0) {
                                numValueOf7 = numValueOf8;
                            }
                        }
                        return numValueOf5.compareTo(numValueOf7);
                    }
                }
                t3p.y();
                return 0;
            case 25:
                return ad5.a((String) ((Pair) obj).a, (String) ((Pair) obj2).a);
            case 26:
                return ad5.a(((ajk) obj).a, ((ajk) obj2).a);
            case 27:
                return ((nqg) obj).b.compareTo(((nqg) obj2).b);
            case 28:
                return ((nqg) obj).b.compareTo(((nqg) obj2).b);
            default:
                return Integer.valueOf(Integer.parseInt((String) obj)).compareTo(Integer.valueOf(Integer.parseInt((String) obj2)));
        }
    }
}
