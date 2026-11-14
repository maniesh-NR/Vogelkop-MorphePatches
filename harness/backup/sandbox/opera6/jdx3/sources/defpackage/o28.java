package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o28 implements p3a {
    public final ArrayList a;

    public o28(byte b) {
        switch (b) {
            case 3:
                this.a = new ArrayList();
                break;
            case 4:
                this.a = new ArrayList();
                break;
            default:
                this.a = new ArrayList();
                break;
        }
    }

    public o28(ArrayList arrayList) {
        this.a = arrayList;
    }

    public o28(yq8 yq8Var) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.add(yq8Var);
    }

    @Override // defpackage.p3a
    public final int d() {
        return this.a.size();
    }

    @Override // defpackage.p3a
    public final long e(int i) {
        return ((wi5) this.a.get(i)).d;
    }

    @Override // defpackage.p3a
    public final ta6 f(int i) {
        return (ta6) this.a.get(i);
    }
}
