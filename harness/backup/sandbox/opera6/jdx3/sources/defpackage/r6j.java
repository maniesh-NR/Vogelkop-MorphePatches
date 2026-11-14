package defpackage;

import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class r6j {
    public final int a;
    public final x6j b;
    public final q6j c;
    public final q6j d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final List i;
    public final o6j j;

    public /* synthetic */ r6j(int i, x6j x6jVar, int i2, int i3, int i4, boolean z, Function1 function1, int i5) {
        this(i, x6jVar, i2, i3, i4, (i5 & 32) != 0 ? true : z, true, function1);
    }

    public r6j(int i, x6j x6jVar, int i2, int i3, int i4, boolean z, boolean z2, Function1 function1) {
        this(i, x6jVar, new p6j(i2), new p6j(i3), i4, z, true, z2, function1, l08.a);
    }

    public /* synthetic */ r6j(int i, x6j x6jVar, p6j p6jVar, m6j m6jVar, int i2, boolean z, Function1 function1, List list, int i3) {
        this(i, x6jVar, p6jVar, m6jVar, i2, z, false, true, (i3 & Constants.Crypt.KEY_LENGTH) != 0 ? null : function1, list);
    }

    public r6j(int i, x6j x6jVar, q6j q6jVar, q6j q6jVar2, int i2, boolean z, boolean z2, boolean z3, Function1 function1, List list) {
        o6j o6jVar;
        this.a = i;
        this.b = x6jVar;
        this.c = q6jVar;
        this.d = q6jVar2;
        this.e = i2;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = list;
        if (function1 != null) {
            n6j n6jVar = new n6j(this);
            function1.invoke(n6jVar);
            o6jVar = new o6j(CollectionsKt.k0(n6jVar.c), CollectionsKt.n0(n6jVar.b));
        } else {
            o6jVar = new o6j(l08.a, v08.a);
        }
        this.j = o6jVar;
    }

    public static /* synthetic */ r6j b(r6j r6jVar, int i, x6j x6jVar, int i2, int i3, Function1 function1, int i4) {
        if ((i4 & 8) != 0) {
            i3 = r6jVar.e;
        }
        int i5 = i3;
        boolean z = (i4 & 16) != 0 ? r6jVar.f : true;
        if ((i4 & 32) != 0) {
            function1 = null;
        }
        return r6jVar.a(i, x6jVar, i2, i5, z, function1);
    }

    public final r6j a(int i, x6j x6jVar, int i2, int i3, boolean z, Function1 function1) {
        return new r6j(i, x6jVar, new p6j(i2), new m6j(this), i3, z, function1, l08.a, ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_MASK);
    }
}
