package defpackage;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class h5c implements Comparator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ro9 b;

    public /* synthetic */ h5c(ro9 ro9Var, byte b) {
        this.a = b;
        this.b = ro9Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        ro9 ro9Var = this.b;
        switch (b) {
        }
        return Integer.valueOf(ro9Var.p(((n6c) obj2).i)).compareTo(Integer.valueOf(ro9Var.p(((n6c) obj).i)));
    }
}
