package defpackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* loaded from: classes.dex */
public final class xok extends tq8 {
    public ArrayList h = new ArrayList(0);
    public int i = Integer.MAX_VALUE;

    public final List D(List list) {
        if (sfe.N(list, this.h)) {
            return null;
        }
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = new ArrayList(list);
        this.h = arrayList2;
        List listSubList = arrayList2.subList(0, Math.min(arrayList2.size(), this.i));
        while (this.e.size() > 0) {
            A(u(0));
        }
        for (int i = 0; i < listSubList.size(); i++) {
            s(i, new qok((ook) listSubList.get(i)));
        }
        return arrayList;
    }

    @Override // defpackage.hq8
    public final String c() {
        return "suggested-sites-root";
    }

    @Override // defpackage.hq8
    public final long e() {
        return 0L;
    }

    @Override // defpackage.hq8
    public final String g() {
        return null;
    }

    @Override // defpackage.hq8
    public final String h() {
        return "";
    }

    @Override // defpackage.hq8
    public final String i(p6l p6lVar) {
        return "";
    }

    @Override // defpackage.hq8
    public final void q(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.tq8
    public final Date z() {
        return null;
    }
}
