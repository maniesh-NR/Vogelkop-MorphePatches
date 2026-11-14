package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class s91 implements tfd {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ s91(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.tfd
    public final ufd b(vfd vfdVar, List list, long j) {
        ArrayList arrayList;
        List list2;
        Pair pair;
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((aog) obj).p = (d2c) obj2;
                return vfdVar.b0(0, 0, n08.a, new k51((byte) 4));
            default:
                ArrayList arrayList2 = new ArrayList(list.size());
                List list3 = list;
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    Object obj3 = list.get(i);
                    if (!(((pfd) obj3).p() instanceof yjl)) {
                        arrayList2.add(obj3);
                    }
                }
                List list4 = (List) ((Function0) obj2).invoke();
                if (list4 != null) {
                    ArrayList arrayList3 = new ArrayList(list4.size());
                    int size2 = list4.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        voh vohVar = (voh) list4.get(i2);
                        if (vohVar != null) {
                            float f = vohVar.b;
                            float f2 = vohVar.a;
                            list2 = list3;
                            pair = new Pair(((pfd) arrayList2.get(i2)).N(ap5.b(0, (int) Math.floor(vohVar.c - f2), 0, (int) Math.floor(vohVar.d - f), 5)), new ybb((Math.round(f2) << 32) | (Math.round(f) & 4294967295L)));
                        } else {
                            list2 = list3;
                            pair = null;
                        }
                        if (pair != null) {
                            arrayList3.add(pair);
                        }
                        i2++;
                        list3 = list2;
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                List list5 = list3;
                ArrayList arrayList4 = new ArrayList(list.size());
                int size3 = list5.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    Object obj4 = list.get(i3);
                    if (((pfd) obj4).p() instanceof yjl) {
                        arrayList4.add(obj4);
                    }
                }
                return vfdVar.b0(yo5.h(j), yo5.g(j), n08.a, new gil(arrayList, qbe.I(arrayList4, (Function0) obj), (byte) 3));
        }
    }
}
