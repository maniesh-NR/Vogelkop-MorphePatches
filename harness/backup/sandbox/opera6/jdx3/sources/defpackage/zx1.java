package defpackage;

import android.view.KeyEvent;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.undo.UndoBar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;
import org.chromium.content.browser.accessibility.captioning.CaptioningController;

/* loaded from: classes.dex */
public final /* synthetic */ class zx1 implements Predicate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zx1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        byte b = this.a;
        boolean z = false;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return ((Boolean) ((k51) obj2).invoke(obj)).booleanValue();
            case 1:
                return ((Boolean) ((tx0) obj2).invoke(obj)).booleanValue();
            case 2:
                return ((WeakReference) obj).get() == ((tu2) obj2);
            case 3:
                return ((ArrayList) obj2).stream().anyMatch(new zx1((al3) obj, (byte) 4));
            case 4:
                return ((al3) obj2).getId() == ((qhc) obj).a.getId();
            case 5:
                int i = BrowserActivity.E1;
                qim qimVar = ((BrowserActivity) obj2).o;
                Objects.requireNonNull(qimVar);
                ArrayList arrayList = qimVar.b.g;
                ryl rylVar = arrayList.isEmpty() ? null : (ryl) am2.k(1, arrayList);
                return rylVar != null && rylVar.getClass().equals(x65.class);
            case 6:
                return ((Boolean) ((mr3) obj2).invoke(obj)).booleanValue();
            case 7:
                CaptioningController captioningController = (CaptioningController) obj2;
                CaptioningController captioningController2 = (CaptioningController) ((WeakReference) obj).get();
                return captioningController2 == null || captioningController2 == captioningController;
            case 8:
                return ((Boolean) ((x41) obj2).invoke(obj)).booleanValue();
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return ((Boolean) ((tu7) obj2).invoke(obj)).booleanValue();
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return ((hq8) obj).e() == ((hq8) obj2).e();
            case 11:
                return ((Boolean) ((tx0) obj2).invoke(obj)).booleanValue();
            case 12:
                return new String(Character.toChars(((KeyEvent) obj).getUnicodeChar())).contentEquals((CharSequence) obj2);
            case 13:
                return ((Boolean) ((q9a) obj2).invoke(obj)).booleanValue();
            case 14:
                return !((amk) obj).a.a.equals(((h8d) obj2).e);
            case 15:
                return ((Boolean) ((x37) obj2).invoke(obj)).booleanValue();
            case 16:
                lag lagVar = ((uoj) obj2).t;
                lag lagVar2 = ((loj) obj).b;
                if (lagVar2 != null) {
                    return lagVar2.equals(lagVar);
                }
                return true;
            case 17:
                return ((Boolean) ((n6k) obj2).invoke(obj)).booleanValue();
            case SizeUtil.textSize0_1 /* 18 */:
                Iterator it = ((LinkedList) ((mhk) ((UndoBar) obj2).c.b).c).iterator();
                while (true) {
                    if (it.hasNext()) {
                        ArrayList arrayList2 = (ArrayList) ((mkm) it.next()).a.c;
                        int size = arrayList2.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj3 = arrayList2.get(i2);
                            i2++;
                            if (((guh) obj3).a.equals(obj)) {
                                z = true;
                            }
                        }
                    }
                }
                return !z;
            case 19:
                k15 k15Var = (k15) ((Map) obj2).get(((aln) obj).getId());
                return k15Var == null || k15Var.a();
            default:
                return y9e.b((y7f) ((qln) obj2).p.a.i()).contains(((aln) obj).getId());
        }
    }
}
