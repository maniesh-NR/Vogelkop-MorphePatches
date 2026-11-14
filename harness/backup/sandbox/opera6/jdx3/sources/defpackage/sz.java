package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class sz implements tz {
    public final /* synthetic */ byte a = 1;
    public final Object b;

    public sz(g10 g10Var) {
        this.b = g10Var;
    }

    public sz(tz[] tzVarArr) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.addAll(Arrays.asList(tzVarArr));
    }

    @Override // defpackage.tz
    public final boolean a(yz yzVar) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (((tz) obj).a(yzVar)) {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // defpackage.tz
    public final boolean b(yz yzVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    if (((tz) obj2).b(yzVar)) {
                        return true;
                    }
                }
                return false;
            default:
                return ((g10) obj).G.m;
        }
    }

    @Override // defpackage.tz
    public final boolean c(yz yzVar) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (((tz) obj).c(yzVar)) {
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
