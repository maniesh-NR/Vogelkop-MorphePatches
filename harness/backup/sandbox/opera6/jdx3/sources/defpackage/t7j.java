package defpackage;

import androidx.annotation.Nullable;
import com.opera.android.annotations.WeakOwner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class t7j {
    public boolean a;
    public final Set b = Collections.newSetFromMap(new WeakHashMap());
    public final HashSet c = new HashSet();
    public Object d;

    @Nullable
    @WeakOwner
    private k7j e;
    public boolean f;
    public boolean g;
    public int h;
    public final fwh i;

    public t7j(tm5 tm5Var) {
        this.i = new fwh(tm5Var, new yhe((Object) this, (byte) 21));
    }

    public abstract k7j a(isd isdVar);

    public final void b(q8j q8jVar) {
        if (q8jVar == null) {
            d();
            return;
        }
        this.h++;
        d();
        this.h--;
        if (!this.a) {
            this.c.add(q8jVar);
        } else {
            this.b.add(q8jVar);
            q8jVar.c(this.d);
        }
    }

    public final void c() {
        int i = 0;
        if (this.a) {
            this.a = false;
            this.d = null;
            Set set = this.b;
            ArrayList arrayList = new ArrayList(set);
            set.clear();
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((q8j) obj).a();
            }
        } else if (this.f) {
            k7j k7jVar = this.e;
            if (k7jVar != null) {
                k7jVar.b();
            }
            this.g = true;
            this.f = false;
            this.e = null;
        }
        if (this.h > 0 || !this.c.isEmpty()) {
            d();
        }
    }

    public final void d() {
        if (this.f || this.a) {
            return;
        }
        this.a = false;
        this.g = false;
        this.f = true;
        k7j k7jVarA = a(new isd((Object) this, (byte) 24));
        this.e = k7jVarA;
        if (this.g) {
            k7jVarA.b();
            this.e = null;
        }
    }
}
