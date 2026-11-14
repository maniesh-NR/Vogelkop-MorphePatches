package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class wd3 implements zy {
    public final zy a;
    public final ArrayList b = new ArrayList();

    public wd3(zy zyVar) {
        this.a = zyVar;
    }

    @Override // defpackage.zy
    public final boolean a(yz yzVar) {
        return this.a.a(yzVar);
    }

    @Override // defpackage.zy
    public final void b(yz yzVar) {
        this.b.add(yzVar);
    }

    @Override // defpackage.zy
    public final void c() {
        ArrayList arrayList = this.b;
        if (arrayList.size() <= 1) {
            return;
        }
        int i = 0;
        n95.r(new vd3(new q92((byte) 3), (byte) 0), arrayList);
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((yz) obj).getClass();
        }
        arrayList.clear();
    }

    @Override // defpackage.zy
    public final void onFailed(String str) {
        this.a.onFailed(str);
    }
}
