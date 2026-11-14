package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class o16 implements Runnable {
    public final /* synthetic */ byte a;
    public final HashMap b;

    public o16(ArrayList arrayList, byte b) {
        this.a = b;
        int i = 0;
        switch (b) {
            case 1:
                this.b = new HashMap(arrayList.size());
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    u5g u5gVar = (u5g) obj;
                    ((List) this.b.computeIfAbsent(u5gVar.a, new mn((byte) 14))).add(new Pair(u5gVar.b, u5gVar.c));
                }
                break;
            default:
                this.b = new HashMap(arrayList.size());
                int size2 = arrayList.size();
                while (i < size2) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    n16 n16Var = (n16) obj2;
                    this.b.put(n16Var.a, n16Var.b);
                }
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lb4 lb4Var = new lb4(this, (byte) 28);
                avj avjVar = cak.d;
                avj.g(1, lb4Var);
                break;
            default:
                vdf vdfVar = new vdf(this, (byte) 15);
                avj avjVar2 = cak.d;
                avj.g(1, vdfVar);
                break;
        }
    }
}
