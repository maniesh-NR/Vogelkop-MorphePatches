package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class w7i extends j3c {
    public static final w7i c = new w7i("Undefined intrinsics block and it is required", 0);
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w7i(String str, byte b) {
        super(str);
        this.b = b;
    }

    @Override // defpackage.tfd
    public final ufd b(vfd vfdVar, List list, long j) {
        switch (this.b) {
            case 0:
                int size = list.size();
                if (size == 0) {
                    return vfdVar.b0(yo5.j(j), yo5.i(j), n08.a, new u4h((byte) 23));
                }
                if (size == 1) {
                    ifg ifgVarN = ((pfd) list.get(0)).N(j);
                    return vfdVar.b0(ap5.g(ifgVarN.a, j), ap5.f(ifgVarN.b, j), n08.a, new f4(ifgVarN, (byte) 11));
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i = 0; i < size2; i++) {
                    ifg ifgVarN2 = ((pfd) list.get(i)).N(j);
                    iMax = Math.max(ifgVarN2.a, iMax);
                    iMax2 = Math.max(ifgVarN2.b, iMax2);
                    arrayList.add(ifgVarN2);
                }
                return vfdVar.b0(ap5.g(iMax, j), ap5.f(iMax2, j), n08.a, new l51(arrayList, (byte) 6));
            default:
                throw new IllegalStateException("Undefined measure and it is required");
        }
    }
}
