package defpackage;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class kkj extends jkj implements ml3 {
    public final ArrayList d;
    public final boolean e;
    public final String f;

    public kkj(long j, String str, String str2, boolean z) {
        super(j, true, str);
        this.d = new ArrayList();
        this.e = z;
        this.f = str2;
    }

    public static kkj k(ml3 ml3Var, String str, String str2) {
        kkj kkjVar = new kkj(ml3Var.getId(), str, str2, ml3Var.h());
        Iterator it = ml3Var.i().iterator();
        while (it.hasNext()) {
            kkjVar.d.add(jkj.j((al3) it.next()));
        }
        return kkjVar;
    }

    @Override // defpackage.ol3
    public final String b() {
        return this.f;
    }

    @Override // defpackage.jkj, defpackage.al3
    public final boolean c(zk3 zk3Var) {
        if (zk3Var.c(this)) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (!((al3) obj).c(zk3Var)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.al3
    public final long d() {
        return 0L;
    }

    @Override // defpackage.ml3
    public final boolean h() {
        return this.e;
    }

    @Override // defpackage.ml3
    public final List i() {
        return Collections.unmodifiableList(this.d);
    }

    @Override // defpackage.ml3
    public final boolean isEmpty() {
        return this.d.size() == 0;
    }

    @Override // defpackage.jkj, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
