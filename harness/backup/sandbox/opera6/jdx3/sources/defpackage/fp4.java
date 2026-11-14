package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class fp4 extends qtm {
    public final List e;
    public final List f;
    public final boolean g;

    public fp4(yla ylaVar, long j, String str, String str2, List list, List list2) {
        boolean z;
        super(ylaVar, j, str, str2);
        List listUnmodifiableList = Collections.unmodifiableList(list);
        this.e = listUnmodifiableList;
        this.f = Collections.unmodifiableList(list2);
        Iterator it = listUnmodifiableList.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (((yqe) it.next()).a()) {
                z = true;
                break;
            }
        }
        this.g = z;
    }

    @Override // defpackage.qtm, defpackage.d93
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        fp4 fp4Var = (fp4) obj;
        return this.g == fp4Var.g && this.e.equals(fp4Var.e) && this.f.equals(fp4Var.f);
    }

    @Override // defpackage.qtm, defpackage.d93
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.e, this.f, Boolean.valueOf(this.g));
    }
}
