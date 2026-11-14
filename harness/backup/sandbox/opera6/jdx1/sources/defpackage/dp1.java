package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class dp1 implements oki {
    public final /* synthetic */ byte a;
    public final Object b;

    public dp1(fp1 fp1Var) {
        this.a = (byte) 0;
        this.b = fp1Var;
    }

    public dp1(pki pkiVar) {
        this.a = (byte) 1;
        this.b = new LinkedHashSet();
        pkiVar.c("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.oki
    public final Bundle a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Bundle bundle = new Bundle();
                ((fp1) obj).getDelegate().getClass();
                return bundle;
            default:
                n08.a.getClass();
                Bundle bundleM = ic4.m((Pair[]) Arrays.copyOf(new Pair[0], 0));
                List listK0 = CollectionsKt.k0((LinkedHashSet) obj);
                bundleM.putStringArrayList("classes_to_restore", listK0 instanceof ArrayList ? (ArrayList) listK0 : new ArrayList<>(listK0));
                return bundleM;
        }
    }
}
