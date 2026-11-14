package defpackage;

import J.N;
import android.graphics.Rect;
import android.location.Location;
import android.view.Display;
import com.opera.android.favorites.FavoritesBridge;
import com.opera.android.favorites.a;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final /* synthetic */ class pv1 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pv1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                ks3.I(27, str);
                x5f x5fVar = ((xv1) obj2).a.L().d;
                zpa zpaVar = x5fVar.d;
                x56 x56VarF = zpa.F();
                x56VarF.O(zpaVar).y(15, str);
                x5fVar.U0(x56VarF);
                break;
            case 1:
                ((ej3) obj).a.f.r((zie) obj2);
                break;
            case 2:
                ((ms7) obj2).accept((Location) obj);
                break;
            case 3:
                N.MPjvJx9a(((FavoritesBridge.Folder) obj2).a, ((a) ((hq8) obj)).f.a);
                break;
            case 4:
                ((q9g) obj).d((List) obj2);
                break;
            case 5:
                beg begVar = (beg) obj2;
                Display display = begVar.A;
                begVar.c((String) null, (Rect) null, (Rect) null, (Integer) null, (Integer) null, (Float) null, (Float) null, (Float) null, (Integer) null, (Integer) null, (Integer) null, (Boolean) null, (Boolean) null, (Float) null, (Display.Mode) null, (List) null, Boolean.valueOf(beg.f(display)), beg.e(display), (Boolean) null, (db7) null);
                break;
            case 6:
                xg xgVar = (xg) obj2;
                tch tchVar = (tch) obj;
                ((LinkedHashSet) xgVar.c).add(tchVar);
                g7f g7fVar = new g7f((i7f) xgVar.b);
                while (g7fVar.hasNext()) {
                    ((fj3) g7fVar.next()).a(tchVar);
                }
                break;
            case 7:
                ((k6l) obj2).k((b2l) obj);
                break;
            case 8:
                ujn ujnVar = (ujn) obj2;
                int iP = ujnVar.P((String) obj);
                if (iP != -1) {
                    ujnVar.notifyItemChanged(iP);
                    break;
                }
                break;
            default:
                ((ArrayList) obj2).add((aln) obj);
                break;
        }
    }
}
