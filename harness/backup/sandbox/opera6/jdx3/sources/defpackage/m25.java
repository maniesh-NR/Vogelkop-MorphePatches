package defpackage;

import android.net.Uri;
import com.opera.android.browser.SimpleUrlLoader;
import java.util.EnumSet;
import org.chromium.base.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class m25 implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m25(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.chromium.base.Callback
    /* renamed from: onResult */
    public final void c(Object obj) {
        byte b = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                n25 n25Var = (n25) obj4;
                n25Var.i = ((Integer) obj).intValue();
                n25Var.e((s25) obj3, (iu2) obj2);
                break;
            case 1:
                vsi vsiVar = (vsi) obj4;
                tsi tsiVar = (tsi) obj2;
                String str = (String) obj;
                if (vsiVar.c == ((SimpleUrlLoader) obj3)) {
                    vsiVar.c = null;
                    vsiVar.b = 3;
                    vsiVar.f = 0;
                    vsiVar.g = 150L;
                    tsi tsiVar2 = vsiVar.d;
                    if (tsiVar2 != null) {
                        tsiVar2.c.L(vsi.d(str, vsiVar.j, tsiVar.b));
                        vsiVar.d = null;
                        break;
                    }
                }
                break;
            case 2:
                kcj kcjVar = (kcj) obj4;
                hcj hcjVar = (hcj) obj3;
                n61 n61Var = (n61) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    n61Var.a(1);
                    break;
                } else {
                    kcjVar.l.a.o0(hcjVar.a());
                    break;
                }
            default:
                Uri uri = (Uri) obj3;
                ((v4b) ((iuh) obj4).b).j(uri, (byte[]) obj, EnumSet.of(u4b.a));
                ((xnj) obj2).invoke(uri);
                break;
        }
    }
}
