package defpackage;

import android.content.res.Resources;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class yx implements p17, swl, k37 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ yx(ami amiVar, xx xxVar, r9i r9iVar, long j) {
        this.a = (byte) 0;
        this.c = amiVar;
        this.d = xxVar;
        this.e = r9iVar;
        this.b = j;
    }

    public /* synthetic */ yx(Object obj, Object obj2, long j, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
        this.e = obj3;
    }

    public /* synthetic */ yx(le9 le9Var, long j, Object obj, vk2 vk2Var, byte b) {
        this.a = b;
        this.c = le9Var;
        this.b = j;
        this.d = obj;
        this.e = vk2Var;
    }

    @Override // defpackage.k37
    public final void a(mkg[] mkgVarArr) throws Resources.NotFoundException {
        int i;
        tjg tjgVar = (tjg) this.c;
        egd egdVar = (egd) this.d;
        pjg pjgVar = (pjg) this.e;
        if (tjgVar.o == null) {
            return;
        }
        if (!tjgVar.k.c.isEmpty() || egdVar == null) {
            i = -1;
        } else {
            i = 0;
            while (i < mkgVarArr.length) {
                if (egdVar.equals(mkgVarArr[i].b)) {
                    break;
                } else {
                    i++;
                }
            }
            i = -1;
        }
        if (i != -1) {
            tjgVar.p = true;
            tjgVar.k.d(mkgVarArr, i, this.b);
            tjgVar.p = false;
        } else {
            tjgVar.k.a(0, mkgVarArr);
        }
        pjgVar.run();
    }

    public final ScheduledFuture b(eq6 eq6Var) {
        byte b = this.a;
        Object obj = this.e;
        long j = this.b;
        Object obj2 = this.d;
        o17 o17Var = (o17) this.c;
        switch (b) {
            case 1:
                return o17Var.b.schedule((Runnable) new m17(o17Var, (Runnable) obj2, eq6Var, (byte) 1), j, (TimeUnit) obj);
            default:
                return o17Var.b.schedule((Callable) new n17(o17Var, (Callable) obj2, eq6Var, (byte) 0), j, (TimeUnit) obj);
        }
    }

    @Override // defpackage.swl
    public final qwl run() {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 3:
                le9 le9Var = (le9) obj3;
                oi2 oi2Var = (oi2) obj2;
                vk2 vk2Var = (vk2) obj;
                String strR = le9Var.d.r();
                if (strR != null) {
                    return new xd9(this.b, oi2Var, vk2Var, le9Var, strR);
                }
                return null;
            default:
                le9 le9Var2 = (le9) obj3;
                re9 re9Var = (re9) obj2;
                vk2 vk2Var2 = (vk2) obj;
                String strR2 = le9Var2.d.r();
                if (strR2 != null) {
                    return new xd9(this.b, vk2Var2, le9Var2, re9Var, strR2);
                }
                return null;
        }
    }
}
