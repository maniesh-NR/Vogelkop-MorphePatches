package defpackage;

import android.content.SharedPreferences;
import com.opera.api.Callback;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class vuh implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x5f b;

    public /* synthetic */ vuh(x5f x5fVar, byte b) {
        this.a = b;
        this.b = x5fVar;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        Object obj2;
        byte b = this.a;
        x5f x5fVar = this.b;
        switch (b) {
            case 0:
                int iLongValue = (int) ((Long) obj).longValue();
                if (x5fVar.h) {
                    zpa zpaVar = x5fVar.d;
                    x56 x56VarF = zpa.F();
                    x56VarF.F(zpaVar).p(45, 1, iLongValue);
                    x5fVar.U0(x56VarF);
                    break;
                }
                break;
            case 1:
                a4g a4gVar = (a4g) obj;
                int size = a4gVar.a.size();
                if (x5fVar.h) {
                    zpa zpaVar2 = x5fVar.d;
                    x56 x56VarF2 = zpa.F();
                    x56VarF2.F(zpaVar2).p(46, 1, size);
                    x5fVar.U0(x56VarF2);
                }
                a4gVar.a();
                break;
            case 2:
                Iterator it = ((List) obj).iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    while (it.hasNext()) {
                        b0k b0kVar = (b0k) it.next();
                        b0k b0kVar2 = (b0k) next;
                        next = new b0k(b0kVar2.a + b0kVar.a, b0kVar2.b + b0kVar.b, b0kVar2.c + b0kVar.c, b0kVar2.d + b0kVar.d, b0kVar2.e + b0kVar.e);
                    }
                    obj2 = next;
                } else {
                    obj2 = null;
                }
                b0k b0kVar3 = (b0k) obj2;
                if (b0kVar3 == null) {
                    b0kVar3 = new b0k(0, 0, 0, 0, 0);
                }
                int i = b0kVar3.a;
                int i2 = b0kVar3.b;
                int i3 = b0kVar3.c;
                int i4 = b0kVar3.d;
                int i5 = b0kVar3.e;
                if (x5fVar.h) {
                    zpa zpaVar3 = x5fVar.d;
                    x56 x56VarF3 = zpa.F();
                    b66 b66VarF = x56VarF3.F(zpaVar3);
                    b66VarF.p(37, 1, i);
                    b66VarF.p(40, 1, i3);
                    b66VarF.p(39, 1, i2);
                    b66VarF.p(41, 1, i4);
                    b66VarF.p(42, 1, i5);
                    x5fVar.U0(x56VarF3);
                    break;
                }
                break;
            default:
                int iIntValue = ((Integer) obj).intValue();
                if (x5fVar.h) {
                    zpa zpaVar4 = x5fVar.d;
                    SharedPreferences sharedPreferences = (SharedPreferences) x5fVar.a.get();
                    if (sharedPreferences.getInt("MaxRedirectStoreEntries", -1) < iIntValue) {
                        sharedPreferences.edit().putInt("MaxRedirectStoreEntries", iIntValue).apply();
                        x56 x56VarF4 = zpa.F();
                        x56VarF4.z(zpaVar4).o(15, 1, iIntValue);
                        x5fVar.U0(x56VarF4);
                        break;
                    }
                }
                break;
        }
    }
}
