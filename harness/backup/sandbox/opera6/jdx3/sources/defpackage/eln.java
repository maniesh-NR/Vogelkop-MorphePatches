package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class eln extends hln {
    public final String b;
    public final int c;
    public final g7j d;
    public final m9f e;
    public final m9f f;
    public final /* synthetic */ byte g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eln(orb orbVar, String str, int i, g7j g7jVar, m9f m9fVar, m9f m9fVar2, byte b) {
        super(orbVar);
        this.g = b;
        this.b = str;
        this.c = i;
        this.d = g7jVar;
        this.e = m9fVar;
        this.f = m9fVar2;
    }

    @Override // defpackage.aln
    public final boolean a() {
        return this.f != null;
    }

    @Override // defpackage.aln
    public final g7j b() {
        return this.d;
    }

    @Override // defpackage.aln
    public final xkn c(Context context, o2c o2cVar) {
        m9f m9fVar = j(context, o2cVar) ? this.f : this.e;
        return xkn.a(this, m9fVar.a, m9fVar.b);
    }

    @Override // defpackage.aln
    public final int f() {
        return this.c;
    }

    @Override // defpackage.aln
    public final h06 g(Context context, o2c o2cVar) {
        return (h06) (j(context, o2cVar) ? this.f : this.e).c;
    }

    @Override // defpackage.aln
    public final String getId() {
        return this.b;
    }

    @Override // defpackage.aln
    public final int getType() {
        switch (this.g) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }
}
