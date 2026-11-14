package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ik extends k1g {
    public final /* synthetic */ byte i;
    public final ArrayList j;
    public final List k;

    public ik(ArrayList arrayList, List list) {
        this.i = (byte) 2;
        this.k = list;
        this.j = arrayList;
    }

    public /* synthetic */ ik(ArrayList arrayList, List list, byte b) {
        this.i = b;
        this.j = arrayList;
        this.k = list;
    }

    public final int C() {
        byte b = this.i;
        List list = this.k;
        switch (b) {
            case 0:
                return list.size();
            case 1:
                return list.size();
            default:
                return this.j.size();
        }
    }

    public final int D() {
        byte b = this.i;
        ArrayList arrayList = this.j;
        switch (b) {
            case 0:
                return arrayList.size();
            case 1:
                return arrayList.size();
            default:
                return this.k.size();
        }
    }

    public final boolean h(int i, int i2) {
        byte b = this.i;
        ArrayList arrayList = this.j;
        List list = this.k;
        switch (b) {
            case 0:
                return Intrinsics.a(arrayList.get(i), list.get(i2));
            case 1:
                return Intrinsics.a(arrayList.get(i), list.get(i2));
            default:
                return ((llc) list.get(i)).b((llc) arrayList.get(i2));
        }
    }

    public final boolean i(int i, int i2) {
        byte b = this.i;
        ArrayList arrayList = this.j;
        List list = this.k;
        switch (b) {
            case 0:
                return arrayList.get(i).getClass().equals(list.get(i2).getClass());
            case 1:
                return Intrinsics.a(arrayList.get(i), list.get(i2));
            default:
                return ((llc) list.get(i)).a() == ((llc) arrayList.get(i2)).a();
        }
    }
}
