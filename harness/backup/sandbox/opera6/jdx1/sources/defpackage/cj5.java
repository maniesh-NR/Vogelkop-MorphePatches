package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final /* synthetic */ class cj5 implements Handler.Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cj5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ij5 ij5Var = (ij5) obj;
                ArrayList arrayList = ij5Var.n;
                switch (message.what) {
                    case 1:
                        Object obj2 = message.obj;
                        String str = tym.a;
                        hj5 hj5Var = (hj5) obj2;
                        jij jijVar = ij5Var.t;
                        int i = hj5Var.a;
                        Collection collection = (Collection) hj5Var.b;
                        ij5Var.t = jijVar.cloneAndInsert(i, collection.size());
                        ij5Var.z(hj5Var.a, collection);
                        ij5Var.H(null);
                        break;
                    case 2:
                        Object obj3 = message.obj;
                        String str2 = tym.a;
                        hj5 hj5Var2 = (hj5) obj3;
                        int i2 = hj5Var2.a;
                        int iIntValue = ((Integer) hj5Var2.b).intValue();
                        if (i2 == 0 && iIntValue == ij5Var.t.getLength()) {
                            ij5Var.t = ij5Var.t.cloneAndClear();
                        } else {
                            ij5Var.t = ij5Var.t.a(i2, iIntValue);
                        }
                        for (int i3 = iIntValue - 1; i3 >= i2; i3--) {
                            gj5 gj5Var = (gj5) arrayList.remove(i3);
                            ij5Var.p.remove(gj5Var.b);
                            ij5Var.B(i3, -1, -gj5Var.a.o.e.o());
                            gj5Var.f = true;
                            if (gj5Var.c.isEmpty()) {
                                ij5Var.q.remove(gj5Var);
                                sh5 sh5Var = (sh5) ij5Var.h.remove(gj5Var);
                                sh5Var.getClass();
                                l73 l73Var = sh5Var.a;
                                l73Var.p(sh5Var.b);
                                rh5 rh5Var = sh5Var.c;
                                l73Var.s(rh5Var);
                                l73Var.r(rh5Var);
                            }
                        }
                        ij5Var.H(null);
                        break;
                    case 3:
                        Object obj4 = message.obj;
                        String str3 = tym.a;
                        hj5 hj5Var3 = (hj5) obj4;
                        jij jijVar2 = ij5Var.t;
                        int i4 = hj5Var3.a;
                        Object obj5 = hj5Var3.b;
                        jij jijVarA = jijVar2.a(i4, i4 + 1);
                        ij5Var.t = jijVarA;
                        Integer num = (Integer) obj5;
                        ij5Var.t = jijVarA.cloneAndInsert(num.intValue(), 1);
                        int i5 = hj5Var3.a;
                        int iIntValue2 = num.intValue();
                        int iMin = Math.min(i5, iIntValue2);
                        int iMax = Math.max(i5, iIntValue2);
                        int iO = ((gj5) arrayList.get(iMin)).e;
                        arrayList.add(iIntValue2, (gj5) arrayList.remove(i5));
                        while (iMin <= iMax) {
                            gj5 gj5Var2 = (gj5) arrayList.get(iMin);
                            gj5Var2.d = iMin;
                            gj5Var2.e = iO;
                            iO += gj5Var2.a.o.e.o();
                            iMin++;
                        }
                        ij5Var.H(null);
                        break;
                    case 4:
                        Object obj6 = message.obj;
                        String str4 = tym.a;
                        ij5Var.t = (jij) ((hj5) obj6).b;
                        ij5Var.H(null);
                        break;
                    case 5:
                        ij5Var.I();
                        break;
                    case 6:
                        Object obj7 = message.obj;
                        String str5 = tym.a;
                        ij5Var.D((Set) obj7);
                        break;
                    default:
                        h9o.e();
                        break;
                }
                break;
            case 1:
                ijc ijcVar = (ijc) obj;
                gjc gjcVar = (gjc) ijcVar.e;
                gjcVar.getClass();
                Iterator it = ((CopyOnWriteArraySet) ijcVar.f).iterator();
                while (it.hasNext()) {
                    hjc hjcVar = (hjc) it.next();
                    if (!hjcVar.d && hjcVar.c) {
                        w69 w69VarJ = hjcVar.b.j();
                        hjcVar.b = new nrl((byte) 11);
                        hjcVar.c = false;
                        gjcVar.o(hjcVar.a, w69VarJ);
                    }
                    szk szkVar = (szk) ijcVar.d;
                    szkVar.getClass();
                    if (szkVar.a.hasMessages(1)) {
                        break;
                    }
                }
                break;
            case 2:
                pad padVar = (pad) obj;
                if (message.what == 1) {
                    try {
                        gid gidVar = (gid) padVar.c;
                        gidVar.D.L(gidVar.c);
                        break;
                    } catch (RemoteException unused) {
                        w7d.K("Error in sending flushCommandQueue");
                        break;
                    }
                }
                break;
            case 3:
                gkg gkgVar = (gkg) obj;
                int i6 = message.what;
                if (i6 == 1) {
                    gk9 gk9Var = gkgVar.q;
                    if (gk9Var != null) {
                        gkgVar.c(gk9Var, null);
                    }
                } else if (i6 == 2) {
                    gk9 gk9Var2 = gkgVar.q;
                    if (gk9Var2 != null && gkgVar.r && gkgVar.s == message.arg1) {
                        gkgVar.c(gk9Var2, (Bitmap) message.obj);
                    }
                }
                break;
            default:
                tah tahVar = (tah) obj;
                int i7 = message.what;
                if (i7 == 1) {
                    ((ijk) tahVar.h).a();
                } else if (i7 == 2) {
                    ((jjk) tahVar.i).a();
                } else if (i7 == 3) {
                    ((eo7) tahVar.j).e();
                } else if (i7 == 4) {
                    ((sea) tahVar.k).a();
                }
                break;
        }
        return false;
        return true;
    }
}
