package defpackage;

import com.opera.android.settings.SettingsManager;
import java.util.ArrayList;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final /* synthetic */ class of7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rf7 b;

    public /* synthetic */ of7(rf7 rf7Var, byte b) {
        this.a = b;
        this.b = rf7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = 0;
        rf7 rf7Var = this.b;
        switch (b) {
            case 0:
                rf7Var.k = false;
                ArrayList arrayList = rf7Var.c;
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                int i4 = -1;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    re7 re7Var = (re7) obj;
                    if (re7Var.j()) {
                        i++;
                    } else if (re7Var.n()) {
                        i4 = i2;
                    }
                    i2++;
                }
                if (i4 >= 0) {
                    int iN = ((SettingsManager) rf7Var.i.get()).n("concurrent_downloads");
                    if (iN <= 0) {
                        iN = arrayList.size();
                    }
                    int i5 = iN - i;
                    if (i5 >= 1) {
                        ((re7) arrayList.get(i4)).u();
                        int i6 = i5 - 1;
                        if (i6 > 0) {
                            ListIterator listIterator = arrayList.listIterator(i4);
                            while (i6 > 0 && listIterator.hasPrevious()) {
                                re7 re7Var2 = (re7) listIterator.previous();
                                if (re7Var2.n()) {
                                    re7Var2.u();
                                    i6--;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                rf7Var.g.K();
                ArrayList arrayList2 = rf7Var.e;
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    re7 re7Var3 = (re7) obj2;
                    arrayList3.add(re7Var3.g());
                    re7Var3.r();
                }
                vml.d.c(new bw6(arrayList3, (byte) 1)).a(null);
                break;
        }
    }
}
